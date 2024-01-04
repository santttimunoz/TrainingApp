package gw.webservice.ab.ab700.abcontactapi

uses gw.pl.persistence.core.Bundle
uses java.lang.Integer
uses gw.api.database.spatial.SpatialPoint

@Deprecated("Since 8.0.0.  Please use the ab800 package.")
// Make @Export because it corresponds to the ABContact entity which the customer may extend.
@Export
@gw.xml.ws.annotation.WsiExportable( "http://guidewire.com/ab/ws/gw/webservice/ab/ab700/abcontactapi/ABContactSearchCriteriaInfo" )
final class ABContactSearchCriteriaInfo {
  
  public var ContactType      : typekey.ABContact
  public var FirstName        : String
  public var Keyword          : String
  public var OrganizationName : String
  public var PreferredVendors : Boolean
  public var TaxID            : String
  public var EmployeeNumber   : String
  public var Score            : Integer
  
  public var AdjudicativeDomain  : typekey.AdjudicativeDomain
  public var AttorneySpecialty   : typekey.LegalSpecialty
  public var DoctorSpecialty     : typekey.SpecialtyType
  public var LawFirmSpecialty    : typekey.LegalSpecialty
  public var MedicalOrgSpecialty : typekey.SpecialtyType
  public var VendorType          : typekey.VendorType
  
  public var Address                   : AddressSearchInfo
  public var ProximitySearchCenter     : AddressSearchInfo
  public var ProximitySearchParameters : ProximitySearchParametersInfo
  public var Tags                      : ContactTagType[]
  public var AllTagsRequired           : Boolean
  
  construct() { }
  
  function toSearchCriteria(b : Bundle) : ABContactSearchCriteria {
    var criteria = new ABContactSearchCriteria(b) {
      :ContactSubtype      = this.ContactType,
      :FirstName           = this.FirstName,
      :Keyword             = this.Keyword,
      :OrganizationName    = this.OrganizationName,
      :PreferredVendors    = this.PreferredVendors,
      :TaxID               = this.TaxID,
      :EmployeeNumber      = this.EmployeeNumber,
      :Score               = this.Score,
      :AdjudicativeDomain  = this.AdjudicativeDomain,
      :AttorneySpecialty   = this.AttorneySpecialty,
      :DoctorSpecialty     = this.DoctorSpecialty,
      :LawFirmSpecialty    = this.LawFirmSpecialty,
      :MedicalOrgSpecialty = this.MedicalOrgSpecialty,
      :VendorType          = this.VendorType,
      :AllTagsRequired     = this.AllTagsRequired
    }
    
    if (criteria.Address == null) criteria.Address = new Address(b)
    if (criteria.ProximitySearchCenter == null) criteria.ProximitySearchCenter = new Address(b)
    if (criteria.ProximitySearchParameters == null) criteria.ProximitySearchParameters = new ProximitySearchParameters(b)
    populateAddressCriteria(criteria.Address, this.Address)
    populateAddressCriteria(criteria.ProximitySearchCenter, this.ProximitySearchCenter)
    populateProximitySearchParameters(criteria.ProximitySearchParameters, this.ProximitySearchParameters)

    if (this.Tags != null) {
      for (tagType in this.Tags) {
        criteria.addToTags(new ABContactSearchCriteriaTag(b) {
          :Type = tagType
        })
      }
    }

    return criteria
  }
  
  private function populateAddressCriteria(addressCriteria : Address, info: AddressSearchInfo) {
    addressCriteria.City = info.City
    addressCriteria.State = info.State
    addressCriteria.PostalCode = info.PostalCode
    addressCriteria.Country = info.Country
  }
  
  private function populateProximitySearchParameters(params : ProximitySearchParameters, info : ProximitySearchParametersInfo) {
    params.DistanceBasedSearch = info.DistanceBasedSearch
    params.Number = info.Number
    params.UnitOfDistance = info.UnitOfDistance
    params.GeocodeStatus = info.GeocodeStatus
    params.SpatialPoint = info.Longitude == null ? null : new SpatialPoint(info.Longitude, info.Latitude)
    params.SavedSearchCenter = info.SavedSearchCenter
    params.CorrectedSearchCenter = info.CorrectedSearchCenter
  }
}
