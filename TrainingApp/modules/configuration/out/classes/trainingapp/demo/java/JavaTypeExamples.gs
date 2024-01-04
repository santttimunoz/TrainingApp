package trainingapp.demo.java

uses java.io.BufferedWriter
uses java.io.FileWriter
uses java.io.File

class JavaTypeExamples {
  static function PrintUserDetailsToFile(aUser: entity.User): void {
     var fileContents = "User:         " + aUser.DisplayName + "\n" +
                        "Public ID:    " + aUser.PublicID + "\n" +
                        "Exper. level: " + aUser.ExperienceLevel.DisplayName
    // Experience level is a typekey. The display
    // name should be written to the file.
      var file = "c:/Guidewire/" + (aUser.DisplayName) + ".txt"
      print (file)
      var output = new BufferedWriter(new FileWriter(new File(file)))
      output.write(fileContents)
      output.close()
  }
}
