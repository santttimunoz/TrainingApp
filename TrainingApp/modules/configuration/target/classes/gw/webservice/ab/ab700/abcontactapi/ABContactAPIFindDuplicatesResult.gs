package gw.webservice.ab.ab700.abcontactapi

uses java.util.Date
uses gw.webservice.contactapi.ab700.ContactMappingPhoneUtil

@Deprecated("Since 8.0.0.  Please use the ab800 package.")
// Make @Export because it corresponds to the ABContact entity which the customer may extend.
@Export
@gw.xml.ws.annotation.WsiExportable( "http://guidewire.com/ab/ws/gw/webservice/ab/ab700/abcontactapi/ABContactAPIFindDuplicatesResult" )
final class ABContactAPIFindDuplicatesResult  {

  public var Exact          : Boolean
  public var LinkID         : String
  public var ContactType    : String
  public var Name           : String
  public var FirstName      : String
  public var LastName       : String
  public var MiddleName     : String
  public var Prefix         : String
  public var Suffix         : String
  public var CellPhone      : String
  public var DateOfBirth    : Date
  public var EmailAddress1  : String
  public var EmailAddress2  : String
  public var PrimaryPhone   : String
  public var FaxPhone       : String
  public var HomePhone      : String
  public var WorkPhone      : String
  public var Preferred      : Boolean
  public var VendorType     : String
  public var Score          : Number
  public var TaxID          : String
  public var PrimaryAddress : AddressInfo
  
  construct() {}
  
  construct(contact : ABContact, exactMatch : boolean) {
    this.Exact       = exactMatch
    this.LinkID      = contact.LinkID
    this.ContactType = contact.Subtype.Code
    this.Name = contact.Name
    if (contact typeis ABPerson) {
      this.FirstName = contact.FirstName
      this.LastName = contact.LastName
      this.MiddleName = contact.MiddleName
      this.Prefix = contact.Prefix.Code
      this.Suffix = contact.Suffix.Code
      this.CellPhone = ContactMappingPhoneUtil.mapPhoneValues(contact.CellPhone, contact.CellPhoneCountry, contact.CellPhoneExtension)
      this.DateOfBirth = contact.DateOfBirth
    }
    
    this.EmailAddress1 = contact.EmailAddress1
    this.EmailAddress2 = contact.EmailAddress2
    this.PrimaryPhone = contact.PrimaryPhone.Code
    this.FaxPhone = ContactMappingPhoneUtil.mapPhoneValues(contact.FaxPhone, contact.FaxPhoneCountry, contact.FaxPhoneExtension)
    this.HomePhone = ContactMappingPhoneUtil.mapPhoneValues(contact.HomePhone, contact.HomePhoneCountry, contact.HomePhoneExtension)
    this.WorkPhone = ContactMappingPhoneUtil.mapPhoneValues(contact.WorkPhone, contact.WorkPhoneCountry, contact.WorkPhoneExtension)
    this.Preferred = contact.Preferred
    this.VendorType = contact.VendorType.Code
    this.Score = contact.Score
    this.TaxID = contact.TaxID
    this.PrimaryAddress = new AddressInfo(contact.PrimaryAddress)
  }
}
