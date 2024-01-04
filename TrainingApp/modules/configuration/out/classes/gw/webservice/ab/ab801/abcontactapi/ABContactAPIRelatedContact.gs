package gw.webservice.ab.ab801.abcontactapi

@Export
@gw.xml.ws.annotation.WsiExportable( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPIRelatedContact" )
final class ABContactAPIRelatedContact {
  public var LinkID              : String
  public var Relationship        : typekey.ContactBidiRel
  public var ContactLinkID       : String
  public var ContactFirstName    : String
  public var ContactLastName     : String
  public var ContactName         : String
  public var ContactSubtype      : typekey.ABContact
}
