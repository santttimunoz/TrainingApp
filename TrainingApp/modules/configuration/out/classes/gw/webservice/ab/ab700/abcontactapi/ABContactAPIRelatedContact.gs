package gw.webservice.ab.ab700.abcontactapi

@Deprecated("Since 8.0.0.  Please use the ab800 package.")
@Export
@gw.xml.ws.annotation.WsiExportable( "http://guidewire.com/ab/ws/gw/webservice/ab/ab700/abcontactapi/ABContactAPIRelatedContact" )
final class ABContactAPIRelatedContact {
  public var LinkID              : String
  public var Relationship        : String
  public var ContactLinkID    : String
  public var ContactFirstName : String
  public var ContactLastName  : String
  public var ContactName      : String
  public var ContactSubtype   : String
}
