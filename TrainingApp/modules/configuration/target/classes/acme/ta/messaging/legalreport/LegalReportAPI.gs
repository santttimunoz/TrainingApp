package acme.ta.messaging.legalreport

uses gw.api.database.Query
uses gw.api.database.Relop
uses gw.api.util.DateUtil
uses gw.transaction.Transaction
uses gw.xml.ws.annotation.WsiWebService
uses trainingapp.demo.messageack.MessageAckUtil
uses java.util.Date

@WsiWebService
    //The web service is for an external system to call methods in the class.
    //For testing purpose, you can create a local wsdl (regen-wsi-local).
class LegalReportAPI {

  /* Helper function that does the work of creating the entity instance
  */
  function createLegalCase(contactID: String, caseDate: Date, plaintiff: String, caseType: String, status: String): void {
    var contactQuery = Query.make(ABContact)
    contactQuery.compare(ABContact#PublicID, Relop.Equals, contactID)
    var resultsObj = contactQuery.select().AtMostOneRow
    if (resultsObj != null) {
      Transaction.runWithNewBundle(\bundle -> {
        bundle.add(resultsObj)
        var newCase = new LegalCase()
        newCase.FileDate = caseDate
        newCase.Plaintiff = plaintiff
        newCase.CaseType = caseType
        newCase.Status = status
        resultsObj.addToLegalCases(newCase)
      })
    }
  }

  /* Example of Positive Acknowledgement by external system (ExternalApp)
  */
  function ackMessage(messageID: String, statusCode: int): void {
    var aMessage= Query.make(Message).compare(Message#SenderRefID, Relop.Equals, messageID).select().AtMostOneRow
    if (aMessage != null && statusCode == 1) {
      Transaction.runWithNewBundle(\bundle -> {
        bundle.add(aMessage)
        // message was successfully processed
        aMessage.reportAck()
        // make additional changes to triggering entity
        var relatedContact = aMessage.MessageRoot as ABContact
        bundle.add(relatedContact)
        relatedContact.LegalCaseReportStatus = LegalCaseReportStatus.TC_REQUESTED_RECEIVED
        relatedContact.LastLegalCaseReportDate = DateUtil.currentDate()
        print(String.format("Message acknowledged with SenderRefID: %s ", {aMessage.SenderRefID}))
      })
    } else {
      print(String.format("Message is not found %s and/or status code (%s) not equal to 1", {messageID, statusCode}))
    }
  }

  /* Example of Negative Acknowledgement by external system (ExternalApp)
  */
  function nakMessage(messageID: String, statusCode: int): void {
    if (statusCode != 1 && messageID.HasContent)  {
      var aMessage  = Query.make(Message).compare(Message#SenderRefID, Relop.Equals, messageID).select().AtMostOneRow
      if (aMessage != null) {
        var errorCategory: ErrorCategory
        switch (statusCode) {  // not representative of a LegalCaseReportStatus, using for external error
          case 0:
              errorCategory = typekey.ErrorCategory.TC_NO_CONNECTION
              break
          case 1:
              errorCategory = typekey.ErrorCategory.TC_DATABASE_CONTENTION
              break
          case 2:
              errorCategory = typekey.ErrorCategory.TC_USER_AUTHENTICATION
              break
          case 3:
              errorCategory = typekey.ErrorCategory.TC_UNEXPECTED_ERROR
              break
        }

      } else {
        print("no message found")
      }
    }
  }

}
