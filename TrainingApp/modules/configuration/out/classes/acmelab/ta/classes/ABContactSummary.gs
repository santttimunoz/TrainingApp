package acmelab.ta.classes

uses gw.api.system.database.SequenceUtil
uses gw.api.database.Query
uses gw.api.database.Relop
uses gw.transaction.Transaction

/**
 * Created with IntelliJ IDEA.
 * User: SMUNOZ
 * Date: 27/12/23
 * Time: 11:44
 * To change this template use File | Settings | File Templates.
 */
class ABContactSummary {
     construct(){
             print("hello abcontactsummary")
}
          private var _externalID : int
          private  var _ContactID : String
          private var _Name : String
          private var _NumCheckingAccounts : int
          private var _AssignedUserWorkload : int

  property get ExternalID() : int{
    return  this._externalID
  }
  property set ExtenalID(externalID : int){
      this._externalID = externalID
  }
  property get ContactID() : String{
      return this._ContactID
  }
  property set ContactID(contactID : String){
    this._ContactID = contactID
  }
  property get Name() : String{
     return this._Name
  }
  property set Name(name : String) {
    this._Name = name
  }
  property get NumCheckingAccounts() : int{
    return this._NumCheckingAccounts
  }
  property set NumCheckingAccounts(numCheckingAccoutns : int) {
    this._NumCheckingAccounts = numCheckingAccoutns
  }

  function initializeExternalID() : void{
       if(this._externalID == 0){
           this._externalID = SequenceUtil.next(1000, "externalID") as int
       }
  }
  function loadSummaryData(Contact : entity.ABContact) : void {
      this._ContactID = Contact.PublicID
      this._Name = Contact.DisplayName
      this._NumCheckingAccounts = Contact.BankAccounts.where( \ accounts -> accounts.AccountType == "checking").length
      var queryObj = Query.make(entity.ABContact)
      queryObj.compare("AssignedUser", Equals, Contact.AssignedUser)
      this._AssignedUserWorkload = queryObj.select().Count
  }
  function saveSummaryNote() : void {

    if(this._ContactID != null){
       Transaction.runWithNewBundle( \ newbundle -> {
         var note = new ContactNote()
         note.Subject = "ABContact Summary"
         note.Body = "ExternalID : " + this._externalID + "\n" + "Name : " + this._Name + "\n" + "Number of cheecking accounts: " + this._NumCheckingAccounts
         var query = Query.make(ABContact)
         query.compare("PublicID", Relop.Equals, this._ContactID )
         var contact = query.select().getAtMostOneRow()
         contact = newbundle.add(contact)
         contact.addToContactNotes(note)
       }, "su")
    }
  }
  function getConcatenatedSummary() : String {
      return  this._externalID + ", " + this._ContactID + ", " + this._Name + ", " + this._NumCheckingAccounts
  }
}