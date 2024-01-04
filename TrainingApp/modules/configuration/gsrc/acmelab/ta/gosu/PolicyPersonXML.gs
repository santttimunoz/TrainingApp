package acmelab.ta.gosu
uses java.io.File
uses gw.xml.XmlElement
uses javax.xml.namespace.QName
uses java.io.FileWriter
uses java.io.BufferedWriter
uses gw.api.database.Query
uses gw.api.database.Relop

/**
 * Created with IntelliJ IDEA.
 * User: SMUNOZ
 * Date: 29/12/23
 * Time: 10:24
 * To change this template use File | Settings | File Templates.
 */
class PolicyPersonXML {
    construct(){
      print("readXmlFile")
    }

  function readXml(path : String) : void {
      //var path = "C:/Guidewire/TrainingApp/XmlFile1.xml"
       var file = new File(path)
       var xml = XmlElement.parse(file)
       var totalClaims =xml.Children[2].Children[0].Text
       var claimPaymentsMade =  xml.Children[2].Children[1].Text
       var premiunPaid =   xml.Children[2].Children[3].Text
       //var riskValue = xml.Children[6].Text

       print("information to console: \n")
       print("personFullName :   " + xml.Children[3].Text)
       print("Total number of claims : " + totalClaims)
       print("Total claim payments made : " + claimPaymentsMade)

       var riskAssesment = new XmlElement("RiskAssesment")
       xml.addChild(riskAssesment)
       if(claimPaymentsMade > premiunPaid){
          riskAssesment.setText("high")
         //xml.Children[6].setText("high")
       }else if(claimPaymentsMade <= premiunPaid){
         riskAssesment.setAttributeValue("value", "low")
         //xml.Children[6].setText("low")
          //<RiskAssessment>value</RiskAssessment>
       }
    var filePathOutput = "Output_XmlFile1.txt"
    var outputWriter = new BufferedWriter(new FileWriter(new File(filePathOutput)))
    outputWriter.write(xml.asUTFString())
    outputWriter.close()

       print("\n")
       xml.print()
  }


       function readXml2(path : String) : void {

         var file = new File(path)
         var xml = XmlElement.parse(file)

         var object = xml.Children
         //xml.print()

         var fullName = ""
         var numberOfClaims : int
         var totalClaimPaymentsMade : int

         for (children in object) {
           if (children.QName.LocalPart == "FullName"){
             fullName = children.Text
           }
           if(children.QName.LocalPart == "FinancialSummary"){
             for(child in children.getChildren()){
               if (child.QName.LocalPart == "NumberOfClaims"){
                 numberOfClaims = child.Text as int
               }
               if (child.QName.LocalPart == "TotalClaimPaymentsMade"){
                 totalClaimPaymentsMade = child.Text as int
               }
             }
           }
         }
         var filePathOutput = "Output_XmlFile1.txt"
         var outputWriter = new BufferedWriter(new FileWriter(new File(filePathOutput)))
         outputWriter.write(xml.asUTFString())
         outputWriter.close()

         print("FullName: " + fullName + "\nNumberOfClaims: " + numberOfClaims + "\nTotalClaimPaymentsMade: " + totalClaimPaymentsMade)
       }

      function searchID(publicID : String) : void{
        var output = ""
        var searchId = Query.make(ABPolicyPerson)
        searchId.compare(ABPolicyPerson#PublicID, Relop.Equals, publicID)
        var anABPolicyPerson = searchId.select().getAtMostOneRow()

        var xml = new acmelab.ta.gosu.policyholder.PolicyHolder()
        if(anABPolicyPerson != null){
           xml.FullName = anABPolicyPerson.FullName
           xml.TaxID = anABPolicyPerson.TaxID

          if(anABPolicyPerson.FinancialSummary != null){
            var totalClaimPayments = anABPolicyPerson.FinancialSummary.TotalClaimPaymentsMade
            var totalPremiumPaid = anABPolicyPerson.FinancialSummary.TotalPolicyPremiumPaid
          if(totalClaimPayments <= totalPremiumPaid){
            xml.RiskAssessment = "low"
          }else{
            xml.RiskAssessment = "high"
          }
        }  else{
            output += "no financial summary"
          }
            output += xml.asUTFString()
       } else{
          output += "id not found"
        }

        print(output)
      }

}