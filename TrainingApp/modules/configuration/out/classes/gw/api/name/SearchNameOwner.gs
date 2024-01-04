package gw.api.name

uses java.util.Set

@Export
class SearchNameOwner extends NameOwnerBase {

    construct (searchCriteria: ABContactSearchCriteria, visible : boolean) {
      _searchCriteria = searchCriteria
      _contactName = new SearchContactNameDelegate(searchCriteria, visible)
      _personName = new SearchPersonNameDelegate(searchCriteria, visible)
      AlwaysShowSeparateFields = true
    }

    construct (searchCriteria: ABContactSearchCriteria) {
      this(searchCriteria, true)
  }

  var _searchCriteria : ABContactSearchCriteria
  var _contactName : ContactNameFields
  var _personName : PersonNameFields

  override property get ContactName() : ContactNameFields {
    return _contactName
  }

  override property get PersonName() : PersonNameFields {
    return _personName
  }

  override property get RequiredFields() : Set <NameOwnerFieldId> {
    return NameOwnerFieldId.NO_FIELDS
  }

  override property get HiddenFields() : Set <NameOwnerFieldId> {
    return NameOwnerFieldId.HIDDEN_FOR_SEARCH
  }

  override property get ContactNameLabel() : String {
    var rv : String = null
    if (entity.ABPerson.Type.isAssignableFrom( _searchCriteria.ContactSubtypeType )) {
      rv = displaykey.Web.AddressBook.Search.LastName
    } else if (entity.ABCompany.Type.isAssignableFrom( _searchCriteria.ContactSubtypeType ) or entity.ABPlace.Type.isAssignableFrom( _searchCriteria.ContactSubtypeType )) {
      rv = displaykey.Web.AddressBook.Search.Name
    } else {
      rv = displaykey.Web.AddressBook.Search.ContactName
    }
    return rv
  }

  override property get ContactNamePhoneticLabel() : String {
    if (entity.ABCompany.Type.isAssignableFrom( _searchCriteria.ContactSubtypeType ) or entity.ABPlace.Type.isAssignableFrom( _searchCriteria.ContactSubtypeType )) {
      return displaykey.Web.ContactDetail.Name.OrganizationNamePhonetic
    }
    return displaykey.Web.AddressBook.Search.ContactNamePhonetic
  }

    override property get ShowNameSummary() : boolean {
      return false
    }

}