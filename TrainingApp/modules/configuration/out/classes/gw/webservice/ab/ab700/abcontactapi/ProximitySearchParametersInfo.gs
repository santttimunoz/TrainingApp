package gw.webservice.ab.ab700.abcontactapi

uses java.lang.Integer
uses java.math.BigDecimal

@Deprecated("Since 8.0.0.  Please use the ab800 package.")
// Make it @Export because it corresponds to the ProximitySearchParameters entity
// which the customer may extend.
@Export
@gw.xml.ws.annotation.WsiExportable( "http://guidewire.com/ab/ws/gw/webservice/ab/ab700/abcontactapi/ProximitySearchParametersInfo" )
final class ProximitySearchParametersInfo {

  public var DistanceBasedSearch   : Boolean
  public var Number                : Integer
  public var UnitOfDistance        : typekey.UnitOfDistance
  public var GeocodeStatus         : typekey.GeocodeStatus
  public var Latitude              : BigDecimal
  public var Longitude             : BigDecimal
  public var HTMID                 : BigDecimal
  public var SavedSearchCenter     : String
  public var CorrectedSearchCenter : String
  public var RadiusSearchMaxResults: Integer
  public var GUID : String
}
