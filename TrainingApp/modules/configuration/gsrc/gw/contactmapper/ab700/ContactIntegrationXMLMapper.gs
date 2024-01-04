package gw.contactmapper.ab700

uses gw.webservice.contactapi.beanmodel.XmlBackedInstance
uses gw.api.database.Query
uses gw.api.database.Relop
uses gw.api.system.ABLoggerCategory
uses gw.api.util.phone.GWPhoneNumberBuilder
uses gw.plugin.phone.IPhoneNormalizerPlugin
uses gw.plugin.Plugins

/**
 * Use this file to map between ContactManager entities and "XmlBackedInstance" objects that represent ContactManager entities.
 * Make @Export because the code corresponds to various entities which the customer may extend.
 */
@Export
@Deprecated("Since 8.0.0.  Please use ContactMapper instead.")
class ContactIntegrationXMLMapper extends ContactIntegrationXMLMapperABBase {
  private static var _logger = ABLoggerCategory.ABContactAPI

  private static var _instance : ContactIntegrationXMLMapper = new ContactIntegrationXMLMapper()

  private construct() {}

  static function getInstance() : ContactIntegrationXMLMapper {
    _logger.trace("ContactIntegrationXMLMapper.getInstance() returned a " + _instance.IntrinsicType.Name)
    return _instance
  }


  // ============================== Map from ContactManager entities to ContactManager XmlBackedInstance objects

  /**
   * Populate an XmlBackedInstance from a ContactManager contact.
   *
   * @param abContact an ABContact from which to generate XML
   * @return an _instance of XmlBackedInstance, which can be serialized as an XML String
   */
  function populateXMLFromABContact(abContact : ABContact) : XmlBackedInstance {
    return populateXMLFromABContact(abContact, createXmlBackedInstance(abContact))
  }

  function populateXMLFromABContact(abContact : ABContact, abContactXML : XmlBackedInstance) : XmlBackedInstance {
    
 /**
  * To populate an XMLBackedInstance field from a contact, use populateFieldXML.
  *
  * populateFieldXML(xmlml       ,  fieldName          , bean)
  */
    populateFieldXML(abContactXML, LINK_ID            , abContact)
    populateFieldXML(abContactXML, EXTERNAL_PUBLIC_ID , abContact)
    populateFieldXML(abContactXML, "EmailAddress1"    , abContact)
    populateFieldXML(abContactXML, "EmailAddress2"    , abContact)
    populateFieldXML(abContactXML, "Name"             , abContact)
    populateFieldXML(abContactXML, "Notes"            , abContact)
    populateFieldXML(abContactXML, "Preferred"        , abContact)
    populateFieldXML(abContactXML, "VendorAvailability", abContact)
    populateFieldXML(abContactXML, "VendorUnavailableMessage", abContact)
    populateFieldXML(abContactXML, "PreferredCurrency", abContact)
    populateFieldXML(abContactXML, "PrimaryPhone"     , abContact)
    populateFieldXML(abContactXML, "Score"            , abContact)
    populateFieldXML(abContactXML, "TaxID"            , abContact)
    populateFieldXML(abContactXML, "TaxStatus"        , abContact)
    populateFieldXML(abContactXML, "VendorNumber"     , abContact)
    populateFieldXML(abContactXML, "VendorType"       , abContact)
    populateFieldXML(abContactXML, "W9Received"       , abContact)
    populateFieldXML(abContactXML, "W9ReceivedDate"   , abContact)
    populateFieldXML(abContactXML, "W9ValidFrom"      , abContact)
    populateFieldXML(abContactXML, "W9ValidTo"        , abContact)
    populateFieldXML(abContactXML, "WithholdingRate"  , abContact)

    populatePhoneXML(abContactXML, "FaxPhone", abContact)
    populatePhoneXML(abContactXML, "HomePhone", abContact)
    populatePhoneXML(abContactXML, "WorkPhone", abContact)

    if (abContact typeis ABAdjudicator) {
      populateFieldXML(abContactXML, "AdjudicativeDomain", abContact)
      populateFieldXML(abContactXML, "AdjudicatorLicense", abContact)
    }
    if (abContact typeis ABAttorney) {
      populateFieldXML(abContactXML, "AttorneyLicense"  , abContact)
      populateFieldXML(abContactXML, "AttorneySpecialty", abContact)
    }
    if (abContact typeis ABAutoRepairShop) {
      populateFieldXML(abContactXML, "AutoRepairLicense", abContact)
    }
    if (abContact typeis ABAutoTowingAgcy) {
      populateFieldXML(abContactXML, "AutoTowingLicense", abContact)
    }
    if (abContact typeis ABDoctor) {
      populateFieldXML(abContactXML, "DoctorSpecialty", abContact)
      populateFieldXML(abContactXML, "MedicalLicense" , abContact)
    }
    if (abContact typeis ABLawFirm) {
      populateFieldXML(abContactXML, "LawFirmSpecialty", abContact)
    }
    if (abContact typeis ABLegalVenue) {
      populateFieldXML(abContactXML, "VenueType", abContact)
    }
    if (abContact typeis ABMedicalCareOrg) {
      populateFieldXML(abContactXML, "MedicalOrgSpecialty", abContact)
    }
    if (abContact typeis ABPerson) {
      populatePhoneXML(abContactXML, "CellPhone"       , abContact)
      populateFieldXML(abContactXML, "DateOfBirth"     , abContact)
      populateFieldXML(abContactXML, "FirstName"       , abContact)
      populateFieldXML(abContactXML, "FormerName"      , abContact)
      populateFieldXML(abContactXML, "Gender"          , abContact)
      populateFieldXML(abContactXML, "LastName"        , abContact)
      populateFieldXML(abContactXML, "LicenseNumber"   , abContact)
      populateFieldXML(abContactXML, "LicenseState"    , abContact)
      populateFieldXML(abContactXML, "MaritalStatus"   , abContact)
      populateFieldXML(abContactXML, "MiddleName"      , abContact)
      populateFieldXML(abContactXML, "NumDependents"   , abContact)
      populateFieldXML(abContactXML, "NumDependentsU18", abContact)
      populateFieldXML(abContactXML, "NumDependentsU25", abContact)
      populateFieldXML(abContactXML, "Occupation"      , abContact)
      populateFieldXML(abContactXML, "Prefix"          , abContact)
      populateFieldXML(abContactXML, "Suffix"          , abContact)
      populateFieldXML(abContactXML, "TaxFilingStatus" , abContact)
    }
    if (abContact typeis ABUserContact) {
      populateFieldXML(abContactXML, "EmployeeNumber", abContact)
    }

    /**
     * Handle foreign keys and arrays. Please use populateFkXML and populateArrayXML
     * to populate custom children entities.
     */

    populateFkXML(abContactXML,     // parent XmlBackedInstance
                  "PrimaryAddress", // name of FK
                  abContact,        // local parent bean
                  \ b : KeyableBean ->createAddressXMLFromAddress(b))

    populateArrayXML(abContactXML,       // parent XmlBackedInstance
                     "ContactAddresses", // name of array
                     abContact,          // local parent bean
                     \ b : KeyableBean ->createABContactAddressXMLFromABContactAddress(b))
    
    populateArrayXML(abContactXML,  // parent XmlBackedInstance
                     "EFTRecords",  // name of array
                     abContact,     // local parent bean
                     \ b : KeyableBean ->createEFTDataXMLFromEFTData(b))
    
    populateArrayXML(abContactXML,     // parent XmlBackedInstance
                     "CategoryScores", // name of array
                     abContact,        // local parent bean
                     \ b : KeyableBean ->createABContactCategoryScoreXMLFromABContactCategoryScore(b))
    
    populateArrayXML(abContactXML,       // parent XmlBackedInstance
                     "Tags",             // name of array
                     abContact,          // local parent bean
                     \ b : KeyableBean ->createABContactTagXMLFromABContactTag(b))

    abContactXML.External_UpdateApp = com.guidewire.pl.system.server.Version.getAppCode()
    abContactXML.External_UpdateUser = User.util.CurrentUser.Credential.UserName

    /**
     * Populate the status fields for use by client applications for determining
     * if pending changes/creates apply to this contact
     */
    var createStatus = abContact.CreateStatus
    var updateChanges = Query.make(PendingContactUpdate).compare("ABContact", Relop.Equals, abContact).select().first()
        
    abContactXML.updateFieldValue("ContactSystemPendingUpdates", updateChanges == null ? false : true)
    abContactXML.updateFieldValue("ContactSystemPendingCreate", createStatus.Code)

    return abContactXML
  }

  /**
   * Methods to populator child entities. These get called by populateFkXML and populateArrayXMLXML.
   */

  protected function createABContactAddressXMLFromABContactAddress(abContactAddress : KeyableBean) : XmlBackedInstance {
    var xml = createXmlBackedInstance(abContactAddress)
    populateFieldXML(xml, LINK_ID           , abContactAddress)
    populateFieldXML(xml, EXTERNAL_PUBLIC_ID, abContactAddress)
    
    populateFkXML(xml,      // parent XmlBackedInstance
                  "Address",        // name of FK
                  abContactAddress, // local parent bean
                  \ b : KeyableBean ->createAddressXMLFromAddress(b))
    
    return xml
  }
  
  protected function createAddressXMLFromAddress(address : KeyableBean) : XmlBackedInstance {
    var xml = createXmlBackedInstance(address)
    populateFieldXML(xml, LINK_ID           , address)
    populateFieldXML(xml, EXTERNAL_PUBLIC_ID, address)
    populateFieldXML(xml, "AddressLine1"    , address)
    populateFieldXML(xml, "AddressLine2"    , address)
    populateFieldXML(xml, "AddressLine3"    , address)
    populateFieldXML(xml, "AddressType"     , address)
    populateFieldXML(xml, "City"            , address)
    populateFieldXML(xml, "Country"         , address)
    populateFieldXML(xml, "County"          , address)
    populateFieldXML(xml, "Description"     , address)
    populateFieldXML(xml, "GeocodeStatus"   , address)
    populateFieldXML(xml, "PostalCode"      , address)
    populateFieldXML(xml, "State"           , address)
    populateFieldXML(xml, "ValidUntil"      , address)
    return xml
  }

  protected function createEFTDataXMLFromEFTData(eftData : KeyableBean) : XmlBackedInstance {
    var xml = createXmlBackedInstance(eftData)
    populateFieldXML(xml, LINK_ID            , eftData)
    populateFieldXML(xml, EXTERNAL_PUBLIC_ID , eftData)
    populateFieldXML(xml, "AccountName"      , eftData)
    populateFieldXML(xml, "BankAccountNumber", eftData)
    populateFieldXML(xml, "BankAccountType"  , eftData)
    populateFieldXML(xml, "BankName"         , eftData)
    populateFieldXML(xml, "BankRoutingNumber", eftData)
    populateFieldXML(xml, "IsPrimary"        , eftData)
    return xml
  }
  
  protected function createABContactCategoryScoreXMLFromABContactCategoryScore(abContactCategoryScore : KeyableBean) : XmlBackedInstance {
    var xml = createXmlBackedInstance(abContactCategoryScore)
    populateFieldXML(xml, LINK_ID           , abContactCategoryScore)
    populateFieldXML(xml, EXTERNAL_PUBLIC_ID, abContactCategoryScore)
    populateFieldXML(xml, "ReviewCategory"  , abContactCategoryScore)
    populateFieldXML(xml, "Score"           , abContactCategoryScore)
    return xml
  }
  
  protected function createABContactTagXMLFromABContactTag(abContactTag : KeyableBean) : XmlBackedInstance {
    var xml = createXmlBackedInstance(abContactTag)
    populateFieldXML(xml, LINK_ID            , abContactTag)
    populateFieldXML(xml, EXTERNAL_PUBLIC_ID , abContactTag)
    populateFieldXML(xml, "Type"             , abContactTag)
   return xml
  }

  protected function createSrcABContactXMLFromSrcABContact(srcABContact : KeyableBean) : XmlBackedInstance {
    var xml = createXmlBackedInstance(srcABContact)
    populateFieldXML(xml, LINK_ID           , srcABContact)
    populateFieldXML(xml, EXTERNAL_PUBLIC_ID, srcABContact)
    
    return xml
  }

  protected function createRelABContactXMLFromRelABContact(srcABContact : KeyableBean) : XmlBackedInstance {
    var xml = createXmlBackedInstance(srcABContact)
    populateFieldXML(xml, LINK_ID           , srcABContact)
    populateFieldXML(xml, EXTERNAL_PUBLIC_ID, srcABContact)
    
    return xml
  }

  // ============================== Map from ContactManager XmlBackedInstance objects to ContactManager entities

  /**
   * @param abContact the ABContact to populate
   * @param abContactXML the XmlBackedInstance that contains update values with which to populate abContact
   * @return the populated abContact
   */
  function populateABContactFromXML(abContact : ABContact, abContactXML : XmlBackedInstance) : ABContact {
  /**
  * To populate a field, use populateBeanField.
  *
  * populateBeanField(bean     , fieldName          , xml         )
  */
    populateBeanField(abContact, EXTERNAL_PUBLIC_ID , abContactXML)
    populateBeanField(abContact, "EmailAddress1"    , abContactXML)
    populateBeanField(abContact, "EmailAddress2"    , abContactXML)
    populateBeanField(abContact, "Name"             , abContactXML)
    populateBeanField(abContact, "Notes"            , abContactXML)
    populateBeanField(abContact, "Preferred"        , abContactXML)
    populateBeanField(abContact, "VendorAvailability", abContactXML)
    populateBeanField(abContact, "VendorUnavailableMessage", abContactXML)
    populateBeanField(abContact, "PreferredCurrency", abContactXML)
    populateBeanField(abContact, "PrimaryPhone"     , abContactXML)
    populateBeanField(abContact, "Score"            , abContactXML)
    populateBeanField(abContact, "TaxID"            , abContactXML)
    populateBeanField(abContact, "TaxStatus"        , abContactXML)
    populateBeanField(abContact, "VendorNumber"     , abContactXML)
    populateBeanField(abContact, "VendorType"       , abContactXML)
    populateBeanField(abContact, "W9Received"       , abContactXML)
    populateBeanField(abContact, "W9ReceivedDate"   , abContactXML)
    populateBeanField(abContact, "W9ValidFrom"      , abContactXML)
    populateBeanField(abContact, "W9ValidTo"        , abContactXML)
    populateBeanField(abContact, "WithholdingRate"  , abContactXML)

    populateBeanPhone(abContact, "FaxPhone", abContactXML)
    populateBeanPhone(abContact, "HomePhone", abContactXML)
    populateBeanPhone(abContact, "WorkPhone", abContactXML)
    if (abContact typeis ABAdjudicator) {
      populateBeanField(abContact, "AdjudicativeDomain", abContactXML)
      populateBeanField(abContact, "AdjudicatorLicense", abContactXML)
    }
    if (abContact typeis ABAttorney) {
      populateBeanField(abContact, "AttorneyLicense"  , abContactXML)
      populateBeanField(abContact, "AttorneySpecialty", abContactXML)
    }
    if (abContact typeis ABAutoRepairShop) {
      populateBeanField(abContact, "AutoRepairLicense", abContactXML)
    }
    if (abContact typeis ABAutoTowingAgcy) {
      populateBeanField(abContact, "AutoTowingLicense", abContactXML)
    }
    if (abContact typeis ABDoctor) {
      populateBeanField(abContact, "DoctorSpecialty", abContactXML)
      populateBeanField(abContact, "MedicalLicense" , abContactXML)
    }
    if (abContact typeis ABLawFirm) {
      populateBeanField(abContact, "LawFirmSpecialty", abContactXML)
    }
    if (abContact typeis ABLegalVenue) {
      populateBeanField(abContact, "VenueType", abContactXML)
    }
    if (abContact typeis ABMedicalCareOrg) {
      populateBeanField(abContact, "MedicalOrgSpecialty", abContactXML)
    }
    if (abContact typeis ABPerson) {
      populateBeanPhone(abContact, "CellPhone"       , abContactXML)
      populateBeanField(abContact, "DateOfBirth"     , abContactXML)
      populateBeanField(abContact, "FirstName"       , abContactXML)
      populateBeanField(abContact, "FormerName"      , abContactXML)
      populateBeanField(abContact, "Gender"          , abContactXML)
      populateBeanField(abContact, "LastName"        , abContactXML)
      populateBeanField(abContact, "LicenseNumber"   , abContactXML)
      populateBeanField(abContact, "LicenseState"    , abContactXML)
      populateBeanField(abContact, "MaritalStatus"   , abContactXML)
      populateBeanField(abContact, "MiddleName"      , abContactXML)
      populateBeanField(abContact, "NumDependents"   , abContactXML)
      populateBeanField(abContact, "NumDependentsU18", abContactXML)
      populateBeanField(abContact, "NumDependentsU25", abContactXML)
      populateBeanField(abContact, "Occupation"      , abContactXML)
      populateBeanField(abContact, "Prefix"          , abContactXML)
      populateBeanField(abContact, "Suffix"          , abContactXML)
      populateBeanField(abContact, "TaxFilingStatus" , abContactXML)
    }
    if (abContact typeis ABUserContact) {
      populateBeanField(abContact, "EmployeeNumber", abContactXML)
    }

    /**
     * Handle foreign keys and arrays. Please use populateFkBean and populateArrayBean,
     * to populate custom children entities.
     */

    populateAddresses(abContact, abContactXML)

    populateABContactContacts(abContact, abContactXML)
    
    populateArrayBean(abContact,    // local parent bean
                      "EFTRecords", // name of array
                      abContactXML, // parent XmlBackedInstance
                      \ b : KeyableBean, x : XmlBackedInstance ->populateEFTDataFromEFTDataXML(b, x))

    populateArrayBean(abContact,    // local parent bean
                      "Tags",       // name of array
                      abContactXML, // parent XmlBackedInstance
                      \ b : KeyableBean, x : XmlBackedInstance ->populateABContactTagFromABContactTagXML(b, x))

    /* Example usage of populateFkBean:

    populateFkBean(parentBean,
                   custom_fkName,
                   parentXML,
                   \ b : KeyableBean, x : XmlBackedInstance ->custom_populator_function(b, x))
    */

    return abContact
  }

  /**
   * Methods to populator child entities. These get called by populateFkBean and populateArrayBeanBean.
   */

  override protected function populateABContactAddressFromABContactAddressXML(bean : KeyableBean, xml : XmlBackedInstance) {
    populateBeanField(bean, EXTERNAL_PUBLIC_ID, xml)
    populateFkBean(bean,
                   "Address",
                   xml,
                   \ b : KeyableBean, x : XmlBackedInstance ->populateAddressFromAddressXML(b, x))
  }
  
  override public function populateAddressFromAddressXML(bean : KeyableBean, xml : XmlBackedInstance) {
    populateBeanField(bean, EXTERNAL_PUBLIC_ID, xml)
    populateBeanField(bean, "AddressLine1"    , xml)
    populateBeanField(bean, "AddressLine2"    , xml)
    populateBeanField(bean, "AddressLine3"    , xml)
    populateBeanField(bean, "AddressType"     , xml)
    populateBeanField(bean, "City"            , xml)
    populateBeanField(bean, "Country"         , xml)
    populateBeanField(bean, "County"          , xml)
    populateBeanField(bean, "Description"     , xml)
    populateBeanField(bean, "GeocodeStatus"   , xml)
    populateBeanField(bean, "PostalCode"      , xml)
    populateBeanField(bean, "State"           , xml)
    populateBeanField(bean, "ValidUntil"      , xml)
  }
  
  override protected function populateSourceRelatedContactFromSourceRelatedContactXML(bean : KeyableBean, xml : XmlBackedInstance) {
    populateBeanField(bean, EXTERNAL_PUBLIC_ID, xml)
    populateBeanField(bean, "Rel"             , xml)
    setRelatedContactOnABContactContact(bean, xml, "SrcABContact")
  }
  
  override protected function populateTargetRelatedContactFromTargetRelatedContactXML(bean : KeyableBean, xml : XmlBackedInstance) {
    populateBeanField(bean, EXTERNAL_PUBLIC_ID, xml)
    populateBeanField(bean, "Rel"             , xml)
    setRelatedContactOnABContactContact(bean, xml, "RelABContact")
  }  

  protected function populateEFTDataFromEFTDataXML(bean : KeyableBean, xml : XmlBackedInstance) {
    populateBeanField(bean, EXTERNAL_PUBLIC_ID , xml)
    populateBeanField(bean, "AccountName"      , xml)
    populateBeanField(bean, "BankAccountNumber", xml)
    populateBeanField(bean, "BankAccountType"  , xml)
    populateBeanField(bean, "BankName"         , xml)
    populateBeanField(bean, "BankRoutingNumber", xml)
    populateBeanField(bean, "IsPrimary"        , xml)
  }

  protected function populateABContactTagFromABContactTagXML(bean : KeyableBean, xml : XmlBackedInstance) {
    populateBeanField(bean, EXTERNAL_PUBLIC_ID , xml)
    populateBeanField(bean, "Type"             , xml)
  }
}
