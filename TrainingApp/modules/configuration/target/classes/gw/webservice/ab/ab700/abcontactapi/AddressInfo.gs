package gw.webservice.ab.ab700.abcontactapi

uses java.math.BigDecimal
uses java.util.Date

@Deprecated("Since 8.0.0.  Please use the ab800 package.")
// Make @Export because it corresponds to the Address entity which the customer may extend.
@Export
@gw.xml.ws.annotation.WsiExportable( "http://guidewire.com/ab/ws/gw/webservice/ab/ab700/abcontactapi/AddressInfo" )
final class AddressInfo {

  public var LinkID        : String
  public var AddressLine1  : String
  public var AddressLine2  : String
  public var AddressLine3  : String
  public var City          : String
  public var State         : String
  public var PostalCode    : String
  public var Country       : String
  public var County        : String
  public var Description   : String
  public var AddressType   : String
  public var ValidUntil    : Date
  
  public var Latitude      : BigDecimal
  public var Longitude     : BigDecimal
  public var HTMID         : BigDecimal
  public var GeocodeStatus : String

  construct() {}

  construct(address : Address) {
    this.LinkID = address.LinkID
    this.AddressLine1 = address.AddressLine1
    this.AddressLine2 = address.AddressLine2
    this.AddressLine3 = address.AddressLine3
    this.City = address.City
    this.State = address.State
    this.PostalCode = address.PostalCode
    this.Country = address.Country.Code
    this.County = address.County
    this.Description = address.Description
    this.AddressType = address.AddressType.Code
    this.ValidUntil = address.ValidUntil
    
    this.Latitude = address.Latitude
    this.Longitude = address.Longitude
    this.GeocodeStatus = address.GeocodeStatus.Code
  }
}
