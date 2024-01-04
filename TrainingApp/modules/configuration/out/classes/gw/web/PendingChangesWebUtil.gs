package gw.web
uses gw.api.database.Query
uses gw.api.database.IQueryBeanResult
uses gw.webservice.abcontactapihelpers.ABFactory
uses gw.webservice.contactapi.beanmodel.XmlBackedInstance
uses gw.contactmapper.ab800.ContactIntegrationMapperFactory
uses java.lang.ThreadLocal
uses gw.pl.persistence.core.Bundle
uses gw.webservice.contactapi.ab800.ABClientAPIPendingChangeContext
uses java.util.ArrayList
uses gw.transaction.AbstractBundleTransactionCallback
uses gw.api.contact.pendingchanges.DiffDisplays
uses gw.api.web.contact.PendingContactChangeUtil
uses pcf.PendingChanges
uses gw.transaction.Transaction
uses gw.webservice.contactapi.mapping.MappingConstants
uses java.util.HashSet
uses java.util.Set
uses gw.webservice.contactapi.beanmodel.anonymous.elements.XmlBackedInstance_Array
uses gw.webservice.contactapi.beanmodel.anonymous.elements.XmlBackedInstance_Fk

@Export
class PendingChangesWebUtil {

  private static var _pendingChangeContext : ThreadLocal<ABClientAPIPendingChangeContext> = new ThreadLocal<ABClientAPIPendingChangeContext>()
  private static var _instance : PendingChangesWebUtil as readonly Instance = new PendingChangesWebUtil()
  private static var _keepFieldSet : Set<String> = new HashSet<String> () { MappingConstants.LINK_ID, MappingConstants.EXTERNAL_PUBLIC_ID}

  private construct() {         
  }

  /**
   * Returns the IQueryBeanResult of all the PendingContactCreateViews to display in the LV
   */
  static function getPendingCreates() : IQueryBeanResult<PendingContactCreateView> {
    return Query.make(PendingContactCreateView).select()
  }

  /**
   * Returns the IQueryBeanResult of all the PendingContactCreateViews to display in the LV
   */
  static function getPendingUpdates() : IQueryBeanResult<PendingContactUpdateView> {
    return Query.make(PendingContactUpdateView).select()
  }

  property get ClientChangeContext() : ABClientAPIPendingChangeContext {
    return _pendingChangeContext.get()    
  }

  function performPendingUpdate(contactUpdate : PendingContactUpdate, bundle : Bundle) {
    var contactToBeUpdated = bundle.add(contactUpdate.ABContact)
    applyXmlToABContact(contactUpdate.ChangeXML, contactToBeUpdated)
    var clientContext = createClientContextFromPendingChange(contactUpdate, true)
    contactUpdate.ABContact.ExternalUpdateApp = contactUpdate.Application
    contactUpdate.ABContact.ExternalUpdateUser = contactUpdate.AppUserDisplayName
    setPendingChangeContext(clientContext, bundle)
  }

  function performPendingCreate(contactCreate : PendingContactCreate, bundle : Bundle) {
    var clientContext = createClientContextFromPendingChange(contactCreate, false)
    contactCreate.ABContact.ExternalUpdateApp = contactCreate.Application
    contactCreate.ABContact.ExternalUpdateUser = contactCreate.AppUserDisplayName
    setPendingChangeContext(clientContext, bundle)
  }
  
  function rejectPendingCreate(contactCreate : PendingContactCreate, bundle : Bundle) {
    var clientContext = createClientContextFromPendingChange(contactCreate, false)
    contactCreate.ABContact.ExternalUpdateApp = contactCreate.Application
    contactCreate.ABContact.ExternalUpdateUser = contactCreate.AppUserDisplayName
    setPendingChangeContext(clientContext, bundle)
  }

  function rejectPendingUpdate(contactUpdate : PendingContactUpdate, bundle : Bundle) {
    var clientContext = createClientContextFromPendingChange(contactUpdate, true)
    contactUpdate.ABContact.ExternalUpdateApp = contactUpdate.Application
    contactUpdate.ABContact.ExternalUpdateUser = contactUpdate.AppUserDisplayName
    setPendingChangeContext(clientContext, bundle)
  }
  
  static class ClearPendingChangeContextBTC extends  AbstractBundleTransactionCallback {
    
    override function afterCommit(bundle : Bundle, didCommit : boolean ) {
      if(didCommit == true) {
        PendingChangesWebUtil.clearPendingChangeContext()
      }
    }
  }
  
  function setPendingChangeContext(context : gw.webservice.contactapi.ab800.ABClientAPIPendingChangeContext, bundle : Bundle) {
    _pendingChangeContext.set(context)
    bundle.addBundleTransactionCallback(new ClearPendingChangeContextBTC())    
  }
  
  static function clearPendingChangeContext() {
    _pendingChangeContext.remove()
  }

  /**
   * Apply the given change XML to the given ABContact and return the result.
   * 
   * @param xml the pending change XML as a string
   * @param contactBeforeChanges the ABContact to apply the xml changes to
   * @return the modified ABContact including the changes from the given xml
   */
  static function applyXmlToABContact(xml : String, contactBeforeChanges : ABContact) : ABContact {
    var abContactXML = XmlBackedInstance.parse(xml)
//    abContactXML = removeNonEditsFromChangeXml(abContactXML)
    var bp = new ABFactory().updateContact(contactBeforeChanges, abContactXML, false)
    ContactIntegrationMapperFactory.get().populateABContactFromXML(bp)
    return bp.Bean
  }


  static function stripUnchangedFieldsFromXml(xml : XmlBackedInstance) : XmlBackedInstance {
    xml.Field.removeWhere( \ elt -> (elt.Value == elt.OrigValue) and not(_keepFieldSet.contains(elt.Name)))

    var removeFk = new ArrayList<XmlBackedInstance_Fk>()
    for(fkElem in xml.Fk) {
      var strippedXml = stripUnchangedFieldsFromXml(fkElem.XmlBackedInstance)
      if(not hasEdits(strippedXml)) {
        removeFk.add(fkElem)
      }
    }
    for(rfk in removeFk){
      xml.Fk.remove(rfk)
    }
    var removeArray = new ArrayList<XmlBackedInstance_Array>()
    for(arrayElems in xml.Array) {
      var removeElems = new ArrayList<XmlBackedInstance>()
      for(arrayElem in arrayElems.XmlBackedInstance) {
        var strippedXml = stripUnchangedFieldsFromXml(arrayElem)
        if(not hasEdits(strippedXml)) {
          removeElems.add(arrayElem)
        }
      }
      for(elem in removeElems) {
        arrayElems.XmlBackedInstance.remove(elem)
      }
      if(arrayElems.XmlBackedInstance.Count == 0) {
        removeArray.add(arrayElems)
      }
    }
    for(ra in removeArray) {
      xml.Array.remove(ra)
    }

    return xml
  }

  static function hasEdits(changeXml : XmlBackedInstance) : boolean {
    var hasEdits = false

    if(changeXml.Field.Count > _keepFieldSet.Count && changeXml.Field.countWhere( \ elt -> _keepFieldSet.contains(elt.Name)) == _keepFieldSet.Count) {
      hasEdits = true
    }
    if(changeXml.Fk.Count > 0) {
      hasEdits = true
    }
    if(changeXml.Array.Count > 0) {
      hasEdits = true
    }

    return hasEdits
  }

  static function removeNonEditsFromChangeXml(changeXml : XmlBackedInstance) : XmlBackedInstance {

    var strippedXml = stripUnchangedFieldsFromXml(changeXml)

/*
    changeXml.Field.removeWhere( \ elt -> elt.Value == elt.OrigValue)
    for(fk in changeXml.Fk) {
      var fkInstanceXml = fk.XmlBackedInstance
      fkInstanceXml.Field.removeWhere( \ elt -> elt.Value == elt.OrigValue)
    }
    for(array in changeXml.Array) {
      var removeElems = new ArrayList<XmlBackedInstance>(array.XmlBackedInstance.Count)
      for(arrayElem in array.XmlBackedInstance) {
        arrayElem.Field.removeWhere( \ elt -> elt.Value == elt.OrigValue)
        if(arrayElem.Field.Count == 1) {
          if(arrayElem.Field.first().Name == MappingConstants.EXTERNAL_PUBLIC_ID) {
            removeElems.add(arrayElem)
          }
        }
      }
      for(removeElement in removeElems) {
        array.XmlBackedInstance.remove(removeElement)
      }
    }
*/
    return changeXml
  }

  static function createClientContextFromPendingChange(change : PendingContactChange, update : boolean) : ABClientAPIPendingChangeContext {

    var updateChangeXML : String = null
    if (update) {
      updateChangeXML = (change as PendingContactUpdate).ChangeXML
    }
    return new ABClientAPIPendingChangeContext() {
      :AddressBookUID =  change.ABContact.LinkID,
      :PublicID = change.ABContact.External_PublicID,
      :Username = change.AppUserName,
      :UserDisplayName = change.AppUserDisplayName,
      :RootEntityType = change.AppRootEntityType,
      :RootEntityID = change.AppRootEntityID,
      :RootEntityDisplayName = change.AppRootEntityDisplayName,  
      :ChangeEntityTypeName =  (typeof change).RelativeName,  
      :Resolution = change.Resolution,
      :ResolutionReason = change.ResolutionReasonText,
      :ChangeXML = updateChangeXML
    }
  }
  
  static function rejectionResolutionFilter(values : ContactChangeResolution[]) : List<ContactChangeResolution> {
    var retList = new ArrayList<ContactChangeResolution>()
    for(value in values) {
      if(value != ContactChangeResolution.TC_APPROVED && value != ContactChangeResolution.TC_ALREADY_APPLIED) {
        retList.add(value)
      }
    }
    return retList
  }

  public static function hasChange(pending : PendingContactUpdateView) : Boolean {
    if (pending == null)
      return true
  
    var diffDisplay = PendingContactChangeUtil.createDiffDisplayTree(pending.PendingContactUpdate)
  
    if (DiffDisplays.getVisibleChildren(diffDisplay).Empty)
      return false

    return true
  }
  
  public static function rejectAlreadyAppliedPendingChanges(pendingUpdate : PendingContactChange, currentLocation : PendingChanges) {
    Transaction.runWithNewBundle(\ bundle -> {
      pendingUpdate = bundle.add(pendingUpdate)
      pendingUpdate.Resolution = ContactChangeResolution.TC_ALREADY_APPLIED
      pendingUpdate.ResolutionReasonText = "Pending change was already applied"        
    })

    gw.api.web.contact.PendingContactChangeUtil.rejectChange(pendingUpdate, currentLocation)
  }
}
