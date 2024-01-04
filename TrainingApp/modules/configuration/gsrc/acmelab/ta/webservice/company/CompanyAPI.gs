package acmelab.ta.webservice.company

uses gw.api.database.Query
uses gw.api.database.Relop
uses gw.transaction.Transaction

/**
 * Created with IntelliJ IDEA.
 * User: SMUNOZ
 * Date: 4/01/24
 * Time: 9:13
 * To change this template use File | Settings | File Templates.
 */
class CompanyAPI {
    construct(){}

  function doesTaxIdExist(taxId : String) : Boolean{
      var query = Query.make(ABCompany)
      query.compare(ABCompany#TaxID, Relop.Equals, taxId)
      return (not query.select().Empty)
  }

  function createContactNote(taxId : String, body : String) : void {
    var targetCompany = findCompanyByTaxID(taxId)
    if(targetCompany != null){
      //revisar el uso de bundles
      Transaction.runWithNewBundle(\ newBundle ->{
        targetCompany = newBundle.add(targetCompany)
        var note = new ContactNote()
        note.ContactNoteType = typekey.ContactNoteType.TC_GENERAL
        note.Subject = "External note"
        note.body = body

        targetCompany.addToContactNotes(note)
      })
    }
  }

  function returnEmployeeSummary(taxId : String): void {
    var targetCompany = findCompanyByTaxID(taxId)
    if(targetCompany != null){

  }

 }


  function findCompanyByTaxID(taxId: String): ABCompany {
    var queryObj = Query.make(ABCompany)
    queryObj.compare(ABCompany#TaxID, Equals, taxId)
    var resultObj = queryObj.select().AtMostOneRow
    return resultObj
  }
}