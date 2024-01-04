package gw.exportimport

uses java.io.File
uses java.io.BufferedWriter
uses ErrorType
uses gw.api.database.Query
uses java.io.BufferedReader
uses gw.transaction.Transaction
uses gw.api.database.Relop
uses java.util.ArrayList
uses java.lang.IllegalStateException
uses gw.api.system.ABLoggerCategory
uses java.nio.charset.MalformedInputException
uses gw.pl.util.FileUtil
uses gw.api.util.DateUtil
uses java.util.HashMap
/*
 * Class for loading services automatically to vendors through an export, map and import process.
 *
 * During initial setup of this class, there are several variables that will need to be configured:
 *    outputFolder should point to a location on the hosting machine where the files will be written during export
 *    serviceMap should point to a map of keys and service ids to add automatically during the mapping process (map should be updated before mapping process)
 *    keys should be an array list of all properties the user wants to include in the key values for the maps
 */
@Export
class ExportImportVendorServicesUtil {

  //Private variable for page size during the query. Does not impact functionality, only performance. Should be non-zero value
  private static var queryPageSize = 100
  //Location to store the exported files
  protected static var outputFolder : String = "C:\\outputfiles\\"
  //Maximum rows of each subtype spreadsheet before a new spreadsheet is created (does not include two header rows)
  private static var maxRowsPerSpreadsheet : int = 500
  /*
   * Column headers for spreadsheets. ColumnHeaders1 will contain only service names and does not impact functionality.
   * ColumnHeaders2 has titles for metadata columns and service ids will be added. The titles for the metadata columns
   * do not affect the content of the columns. Content needs to be changed by modifying the createAndAddNextRow method.
   */
  private static var columnHeaders1 = new ArrayList<String>()
  private static var columnHeaders2 = {"Name", "LinkID", "Address", "Key", "Vendor Services Load Status"} //ensure there are no commas in header names
  //Reference to metadata columns used in map/import process. These values, columnHeaders2, and method createAndAddNextRow must be changed to alter metadata columns
  private static var nameColumnIndex = 0
  private static var idColumnIndex = 1
  private static var keyColumnIndex = 3
  private static var vendorServicesLoadStatusIndex = 4
  //Total number of metadata columns
  private static var numberOfNonServiceColumns = 5
  //ArrayList of contact property names to be used to create key during export
  private static var keys = {"Subtype", "PrimaryAddress.Country"}
  //On and off value used in spreadsheet
  protected static var onValue : String = "On"
  protected static var offValue : String = ""
  //Map to be used during service mapping process
  protected static var serviceMap : HashMap<String, String> = ServiceMappings.ServiceMap
  //Logger and string to return warning and error messages to user
  private static var _logger = ABLoggerCategory.AB
  private static var returnString : String

  /*
   * Export method for putting vendors and services into a spreadsheet. Spreadsheet will reflect any existing services on
   * vendors (if any exist).
   */
  public static function exportVendors() : String {
    returnString = ""
    createHeaders()

    //Query to get all contacts with vendor tags
    var allContacts = Query.make(ABContact)
    var vendorTag = allContacts.join(ABContactTag, "ABContact")
    var vendorContacts = vendorTag.compare("Type", Relop.Equals, ContactTagType.TC_VENDOR).select()
    vendorContacts.orderBy( \ row -> row.Subtype)
    vendorContacts.setPageSize(queryPageSize)
    if (!vendorContacts.HasElements) {
      recordErrorMessage("No Vendors Found")
    }

    //Folder for output files with time stamp
    var timeStampedFolderName = outputFolder + "VendorServicesLoad-" + DateUtil.currentDate().toString().replace(":", ".")
    var timeStampedFolder = new File(timeStampedFolderName).mkdirs()

    var currentSubtype : typekey.ABContact
    var currentGrid = new ArrayList<ArrayList<String>>()
    for (var contact in vendorContacts) {
      if (currentSubtype == null) { //initialize subtype for the first contact
        currentSubtype = contact.Subtype
      } else if (currentSubtype != contact.Subtype) { //every time the subtype changes
        writeCurrentGrid(currentGrid, currentSubtype.toString(), timeStampedFolderName)
        currentSubtype = contact.Subtype
        currentGrid = new ArrayList<ArrayList<String>>()
      }
      createAndAddNextRow(contact, currentGrid) //store row in data structure
    }
    if (currentGrid.HasElements) { //final grid
      writeCurrentGrid(currentGrid, currentSubtype.toString(), timeStampedFolderName)
    }
    returnString += "Export complete. Files located at " + outputFolder + "\n"
    return returnString
  }

  /*
   * Mapping method to automatically add services to vendors based on defined map.
   * @param fileName path of the file or directory to be mapped
   */
  public static function mapServices(fileName : String, subdirectories : boolean) : String {
    if (fileName == "") { //if no input
      throw new MalformedInputException(0)
    }
    returnString = ""
    var folderPath = new File(fileName)
    var listOfFiles = new ArrayList<File>()
    getAllFiles(folderPath, listOfFiles, subdirectories)
    var vendorServices =  Query.make(SpecialistService).select().where( \ ss -> !ss.Children.HasElements).toList()
    checkServicesInMap(vendorServices)
    foreach (var file in listOfFiles) {
      mapFile(file, vendorServices)
    }
    returnString += "Map complete\n"
    return returnString
  }

  /*
   * Import the vendors from a given file or directory whose path is specified by fileName. An error directory is also
   * created at the level of the path specified and an error spreadsheet is created for each spreadsheet being imported
   * that also has an error.
   * @param fileName path of the file or directory to be imported
   */
  public static function importVendors(fileName : String, subdirectories : boolean) : String {
    if (fileName == "") {
      throw new MalformedInputException(0)
    }
    var allContacts = Query.make(ABContact)
    var vendorTag = allContacts.join(ABContactTag, "ABContact")
    var vendorContacts = vendorTag.compare("Type", Relop.Equals, ContactTagType.TC_VENDOR).select()
    vendorContacts.setPageSize(queryPageSize)
    returnString =  ""

    var folderPath = new File(fileName)
    var listOfFiles = new ArrayList<File>()
    getAllFiles(folderPath, listOfFiles, subdirectories)
    var vendorServices =  Query.make(SpecialistService).select().where( \ ss -> !ss.Children.HasElements).toList()

    var errorsFolder = new File(outputFolder + "Errors" + File.separator).mkdirs()

    foreach (var file in listOfFiles) {
      importFile(file, vendorServices)
    }
    returnString += "Import complete\n"
    return returnString
  }

  /*
   * Initialize the headers with all specialist services found in database. If no services exist, print an error message
   * warning the user.
   */
  private static function createHeaders() {
    var vendorServices =  Query.make(SpecialistService).select().where( \ ss -> !ss.Children.HasElements).toList()
    while (columnHeaders1.size() < columnHeaders2.size()) {
      columnHeaders1.add("") //initialize empty cells in first header above metadata columns
    }
    if (!vendorServices.HasElements) {
      recordErrorMessage("No Services Found")
    }
    for (service in vendorServices) {
      if (!columnHeaders2.contains(service.Code.remove(","))) {
        columnHeaders1.add(service.Name.remove(","))
        columnHeaders2.add(service.Code.remove(","))
      }
    }
  }

  /*
   * Writes the current grid to a .csv file. Uses the subtype in the file name.
   * @param grid current grid to be written to spreadsheet
   * @param subtype current subtype of the vendors being written to a spreadsheet
   * @param folderName the path of the folder where the spreadsheets will be written
   */
  private static function writeCurrentGrid(grid : ArrayList<ArrayList<String>>, subtype : String, folderName : String) {
    if (maxRowsPerSpreadsheet <= 0) {
      throw new IllegalStateException("Cannot have a maxRowPerSpreadsheetValue less than or equal to 0")
    }
    var numberOfSpreadsheets = grid.size()/maxRowsPerSpreadsheet
    if((grid.size() % maxRowsPerSpreadsheet) > 0) {
      numberOfSpreadsheets++
    }
    for (var i in 0..|numberOfSpreadsheets) {
      var newFile = new File(folderName + File.separator + subtype + "-" + i + ".csv") //name file based on subtype
      newFile.createNewFile()
      var fw = FileUtil.getFileWriter(newFile.getAbsoluteFile())
      var bw = new BufferedWriter(fw)
      var max = maxRowsPerSpreadsheet * (i+1) > grid.size() ? grid.size(): maxRowsPerSpreadsheet * (i+1)
      //write column headers for each file
      bw.write(columnHeaders1.toString().substring(1, columnHeaders1.toString().length-1))
      bw.write("\n")
      bw.write(columnHeaders2.toString().substring(1, columnHeaders2.toString().length-1))
      bw.write("\n")
      for (var row in grid.subList(maxRowsPerSpreadsheet * i, max)) {
        bw.write(row.toString().substring(1, row.toString().length-1))
        bw.write("\n")
      }
      bw.close()
    }
  }

  /*
   * Creates the next row and adds it to the grid. If you want to change the values in the metadata columns, you need to
   * modify this method.
   * @param contact the contact that is being added as a row to the grid
   * @param currentGrid the data strucutre storing all the contacts to be added to the spreadsheet
   */
  private static function createAndAddNextRow(contact : ABContact, currentGrid : ArrayList<ArrayList<String>>) {
    var contactName = (contact.Name ?: ((contact as ABPerson).FirstName + " " + (contact as ABPerson).LastName)).remove(",")
    var contactAddress = contact.PrimaryAddress != null ? contact.PrimaryAddress.DisplayName.remove(",") : ""
    var keyValues = getKeyValues(contact)
    var vendorLoadStatus =  ""
    var nextRow = {contactName, contact.LinkID.remove(","), contactAddress, keyValues.substring(0, keyValues.lastIndexOf(" ")), vendorLoadStatus}
    while (nextRow.size() < columnHeaders2.size()) { //initialize empty row to size of service id columsn
      nextRow.add(offValue)
    }
    for (var service in contact.SpecialistServices) { //add services to rows
      nextRow.set(columnHeaders2.indexOf(service.Code), onValue)
    }
    currentGrid.add(nextRow)
  }

  /*
   * Get key values based on fields defined in class variables.
   * @param contact the contact whose information is being retrieved
   */
  private static function getKeyValues(contact : ABContact) : String {
    var keyValues = ""
    for (var v in keys) {
      var vSplit = v.split("\\.")
      var entity = contact as KeyableBean
      for (var i in 0..|vSplit.length) {
        if (entity.getFieldValue(vSplit[i]) == null) {
          keyValues += "null "
          break
        } else  if (i == vSplit.length-1) {
          keyValues += entity.getFieldValue(vSplit[vSplit.length-1]).toString().remove(",")
          keyValues += " "
        } else{
          entity = entity.getFieldValue(vSplit[i]) as KeyableBean
        }
      }
    }
    return keyValues
  }

  /*
   * Recursively get all files in a directory.
   * @param file root directory/file to start the process
   * @param listOfFiles data structure to store all files in a directory
   */
  private static function getAllFiles(file: File, listOfFiles: ArrayList<File>, subdirectories : boolean) {
    if (file.listFiles() == null) {
      listOfFiles.add(file)
    } else  {
      for (var f in file.listFiles()) {
        if (subdirectories) {
          getAllFiles(f, listOfFiles, subdirectories)
        } else if (f.listFiles() == null) {
          listOfFiles.add(f)
        }
      }
    }
  }

  /*
   * Check that all services in the mapping file are valid. If not valid, don't stop process but print error message for
   * user.
   * @param vendorServices the list of all services that exist in database
   */
  private static function checkServicesInMap(vendorServices : List<SpecialistService>) {
    for (var key in serviceMap.keySet()) {
      var services = serviceMap.get(key).split(",\\s*")
      for (var service in services) {
        if (!vendorServices.contains(SpecialistService.getForCode(service))) {
          recordErrorMessage("No specialist service defined for " + service)
        }
      }
    }
  }

  /*
   * Add services to a given file based on the mapping file.
   * @param file the file that is going to be mapped
   * @vendorServices the list of all services that exist in the database
   */
  private static function mapFile(file: File, vendorServices : List<SpecialistService>) {
    if (!file.toString().contains(".csv")) {
      recordErrorMessage(file.toString()+ " is not a valid csv file")
    } else {
      var fr = FileUtil.getFileReader(file)
      var br = new BufferedReader(fr)
      var headerStrings1 = br.readLine().split(",\\s*")
      var headerStrings2 = br.readLine().split(",\\s*")
      if (headerStrings2.length - numberOfNonServiceColumns < vendorServices.size()) {
        recordErrorMessage("A service column(s) was deleted from " + file.toString() + ". Any column that is removed from the spreadsheet will be treated as all off values.")
      }
      var newFile = new File(file.toString().replace(".csv", "_mapped.csv")) //added _mapped to end of new file name
      newFile.createNewFile()
      var fw = FileUtil.getFileWriter(newFile.getAbsoluteFile())
      var bw = new BufferedWriter(fw)
      var headersValid = writeHeaders(bw, headerStrings1.toList(), headerStrings2.toList(), br, newFile, vendorServices)
      if (headersValid) {
        var nextLine = br.readLine()
        while(nextLine != null) {
          createNextRow(nextLine, bw, headerStrings2.toList(), file)
          nextLine = br.readLine()
        }
        br.close()
        bw.close()
        file.delete() //get rid of old file
      }
    }
  }

  /*
   * Add given error message to logger and to message displayed to user.
   * @param message the message to be returned to the user and added to the logger
   */
  private static function recordErrorMessage(message : String){
    if (!returnString.contains(message)) {
      _logger.warn(message)
      returnString += message + "\n"
    }
  }

  /*
   * Writes the headers for the new spreadsheet during mapping.
   * @param bw the buffered writer used to write the information to a new file
   * @param header1 the list containing the first row of headers from the file to be mapped
   * @param header2 the list containing the second row of headers from the file to be mapped
   * @param br the buffered readers used to read information in from the old file
   * @param file the new file that is being created
   * @param vendorServices the list of all services in the database
   */
  private static function writeHeaders(bw : BufferedWriter, header1 : List<String>, header2 : List<String>, br : BufferedReader, file : File, vendorServices : List<SpecialistService>) : boolean {
    for(var serviceID in header2.subList(numberOfNonServiceColumns, header2.size())) { //need to account for ones not in original
      if (!vendorServices.contains(SpecialistService.getForCode(serviceID))) {
        bw.close()
        br.close()
        file.delete()
        recordErrorMessage("Column '" + serviceID + "' was improperly added to spreadsheet headers in file: " + file.toString())
        return false
      }
    }
    bw.write(header1.toString().substring(1, header1.toString().length-1))
    bw.write("\n")
    bw.write(header2.toString().substring(1, header2.toString().length-1))
    bw.write("\n")
    return true
  }

  /*
   * Copies the row from the previous spreadsheet into the new mapped spreadsheet. Also applies any mapping defined in
   * the service map file.
   * @param nextLine the line that needs to be added to the spreadsheet
   * @param bw the buffered writer that is writing to the new spreadsheet
   * @param headerIDs the list of service ids found in the headers
   */
  private static function createNextRow(nextLine : String, bw : BufferedWriter, headerIDs : List<String>, file : File) {
    var cells = nextLine.split(",\\s*").toList()
    var key = cells.get(keyColumnIndex)
    if (serviceMap.keySet().contains(key)) { //if key is defined in map
      var servicesToAdd = serviceMap.get(key).split(",\\s*")
      while (headerIDs.size() > cells.size()-1) {
        if (cells.size() <= numberOfNonServiceColumns - 1) {
          cells.add(cells.size(), "")
        } else {
          cells.add(cells.size(), offValue)
        }
      }
      for (var service in servicesToAdd) {
        var col = headerIDs.indexOf(service)
        if (col != -1) {
          cells.set(col, onValue)
        } else {
          recordErrorMessage("Tried to add service " + service + " but was not found in spreadsheet '" + file + "'") //service in map not listed in spreadsheet
        }
      }
    } else {
      recordErrorMessage("Key '" + key + "' found in spreadsheet '" + file +"' but not in map")
    }
    bw.write(cells.toList().toString().substring(1, cells.toList().toString().size-1) + "\n")
  }

  /*
   * Import a given file and record any errors that occur during the process
   * @param file the file that is to be imported
   * @param vendorServices the list of all services in the database
   */
  private static function importFile(file : File, vendorServices : List<SpecialistService>) {
    if (!file.toString().contains(".csv")) {
      recordErrorMessage(file.toString() + " is not a valid csv file")
    } else {
      var errors = new ArrayList<String[]>()
      var fr = FileUtil.getFileReader(file)
      var br = new BufferedReader(fr)
      var headerStrings1 = br.readLine().split(",\\s*")
      var headerStrings2 = br.readLine().split(",\\s*")
      if (headerStrings2.length - numberOfNonServiceColumns < vendorServices.size()) { //removed column
        recordErrorMessage("A service column(s) was deleted from " + file.toString() + ". Any column that is removed from the spreadsheet will be treated as all off values.")
      }
      var header2 = headerStrings2.toList()
      var allIDsExist = true
      for(var serviceID in header2.subList(numberOfNonServiceColumns, header2.size())) {
        if (!vendorServices.contains(SpecialistService.getForCode(serviceID))) { //if service is in map that does not exist in system
          br.close()
          recordErrorMessage("Column with ID: " + serviceID + " cannot be added")
          allIDsExist = false
        }
      }
      if (allIDsExist) { //only do import as long as all services are defined
        var nextLine = br.readLine()
        while (nextLine != null) {
          var cells = nextLine.split(",\\s*")
          var id = cells[idColumnIndex]
          updateVendor(id, cells, errors, headerStrings2.toList() as ArrayList<String>)
          nextLine = br.readLine()
        }
        br.close()

        var errorsFileName = file.toString().substring(file.toString().lastIndexOf(File.separator) + 1)
        new File(outputFolder + "Errors" + File.separator + errorsFileName).delete()
        if (errors.HasElements) { //if there were any errors during the import
          writeErrorFile(errors, errorsFileName, headerStrings1, headerStrings2)
        }
      }
    }
  }

  /*
   * Find the vendor from the database based on the Public ID
   * @param id the id of the vendor that is to be updated
   * @param cells the information from a given row in the spreadsheet
   * @param errors the data structure to store all the rows in the spreadsheet that contain an error
   * @param header2 the list of strings stored in the second header row
   */
  private static function updateVendor(id : String, cells : String[], errors : ArrayList<String[]>, header2 : ArrayList<String>) {
    var allContacts = Query.make(ABContact)
    var vendor = allContacts.compare("PublicID", Relop.Equals, id).select().getAtMostOneRow()
    if (vendor == null) { //if no vendor found for id in database
      if (!errors.hasMatch( \ elt1 -> elt1[idColumnIndex] == cells[idColumnIndex])) {
        var cellList = cells.toList() as ArrayList<String>
        while (cellList.size() < header2.size()) {
          cellList.add("")
        }
        cellList.add(cellList.size(), "Bad ID")
        recordErrorMessage("Row with name: " + cells[nameColumnIndex] + " and id: " + cells[idColumnIndex] + " has bad id value")
        errors.add(cellList as String[])
      }
    } else {
      updateVendorServicesInDB(vendor, cells, errors, header2)
    }
  }

  /*
   * Update vendor services in database based on columns defined as on in the spreadsheet. Also updates the vendor service
   * load status.
   * @param vendor the vendor to be updated
   * @param cells the information from a given row in the spreadsheet
   * @param errors the data structure to store all the rows in the spreadsheet that contain an error
   * @param header2 the list of strings stored in the second header row
   */
  private static function updateVendorServicesInDB(vendor : ABContact, cells : String[], errors : ArrayList<String[]>, header2 : ArrayList<String>) {
    Transaction.runWithNewBundle(\ bundle -> {
      vendor = bundle.add(vendor)
      var services = new ArrayList<SpecialistService>()
      if (cells.length > vendorServicesLoadStatusIndex) {
        var loadStatus = cells[vendorServicesLoadStatusIndex]
        if (VendorServicesLoadStatus.get(loadStatus) == null && loadStatus != "") {
          var cellList = cells.toList() as ArrayList<String>
          while (cellList.size() < header2.size()) {
            cellList.add("")
          }
          cellList.add(cellList.size(), "Bad VendorServiceLoadStatus value")
          recordErrorMessage("Row with name '" + cells[nameColumnIndex] + "' and id '" + cells[idColumnIndex] + "' has bad VendorServiceLoadStatus value")
          errors.add(cellList as String[])
        } else {
          //vendor.VendorServicesLoadStatus = VendorServicesLoadStatus.get(cells[vendorServicesLoadStatusIndex])
        }
      }
      var i = numberOfNonServiceColumns
      while (i < cells.length && i < header2.size()) {
        if (cells[i] == onValue) { //if service is defined as on
          services.add(SpecialistService.getForCode(header2.get(i)))
        } else if (cells[i] != offValue) { //if value is not onValue or offValue
          if (!errors.hasMatch( \ elt1 -> elt1[idColumnIndex] == cells[idColumnIndex])) {
            var cellList = cells.toList() as ArrayList<String>
            while (cellList.size() < header2.size()) {
              cellList.add("")
            }
            cellList.add(cellList.size(), "Bad on/off value")
            recordErrorMessage("Row with name '" + cells[nameColumnIndex] + "' and id '" + cells[idColumnIndex] + "' has bad on/off value")
            errors.add(cellList as String[])
          }
          return //stop import of this row
        }
        i++
      }
      vendor.setSpecialistServices(services)
      bundle.commit()
    })
  }

  /*
   * Writes an error spreadsheet for each file that had an error during the import process.
   * @param errors the list of rows that had an error during the import process
   * @param fileName the name of the errors file to be created
   * @param header1 the first header row
   * @param header2 the second header row
   */
  private static function writeErrorFile(errors: ArrayList<String[]>, fileName: String, header1 : String[], header2 : String[]) {
    var newFile = new File(outputFolder + "Errors" + File.separator + "errors-" + fileName)
    newFile.createNewFile()
    var fw = FileUtil.getFileWriter(newFile.getAbsoluteFile())
    var bw = new BufferedWriter(fw)
    bw.write(header1.toList().toString().substring(1, header1.toList().toString().length-1))
    bw.write("\n")
    bw.write(header2.toList().toString().substring(1, header2.toList().toString().length-1))
    bw.write("\n")
    for (var e in errors) {
      bw.write(e.toList().toString().substring(1, e.toList().toString().length-1))
      bw.write("\n")
    }
    bw.close()
  }

}