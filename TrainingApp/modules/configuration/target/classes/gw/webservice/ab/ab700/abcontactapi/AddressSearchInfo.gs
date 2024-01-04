package gw.webservice.ab.ab700.abcontactapi

@Deprecated("Since 8.0.0.  Please use the ab800 package.")
// Make @Export because it corresponds to the Address entity which the customer may extend.
@Export
@gw.xml.ws.annotation.WsiExportable( "http://guidewire.com/ab/ws/gw/webservice/ab/ab700/abcontactapi/AddressSearchInfo" )
final class AddressSearchInfo {
  
  public var City       : String
  public var State      : typekey.State
  public var PostalCode : String
  public var Country    : typekey.Country

  construct() {}
}
