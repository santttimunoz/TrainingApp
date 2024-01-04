package ta

uses gw.api.database.Query
uses gw.api.database.Relop
uses gw.pl.persistence.core.Key
uses gw.api.database.*
uses java.lang.Integer
uses java.lang.NumberFormatException

class QueryUtil {
  /* Returns the ABContact with the given ID/public ID. If the query
     string is an integer, then the method assumes it is an ID. Otherwise,
     the method assumes it is a public ID. If an ABContact with that ID
     or public ID cannot be found, it returns null. This method is used
     primarily in examples where a given contact is needed and the code
     that retrieves it ne ds to be as short as possible.
  */


  static function findContact(queryID: String): ABContact {
    var queryObj = Query.make(ABContact)

    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABContact, queryID as long)
      queryObj.compare(ABContact#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABContact#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findContact


  // ========================================================
  // ================    ABCompany branch    ================
  // ========================================================


  /* The ABCompany version of findContact()
  */

  static function findCompany(queryID: String): ABCompany {
    var queryObj = Query.make(ABCompany)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABCompany, queryID as long)
      queryObj.compare(ABCompany#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABCompany#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findCompany


  /* The ABCompanyVendor version of findContact()
  */

  static function findCompanyVendor(queryID: String): ABCompanyVendor {
    var queryObj = Query.make(ABCompanyVendor)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABCompanyVendor, queryID as long)
      queryObj.compare(ABCompanyVendor#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABCompanyVendor#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findCompanyVendor


  /* The ABAutoRepairShop version of findContact()
  */

  static function findAutoRepairShop(queryID: String): ABAutoRepairShop {
    var queryObj = Query.make(ABAutoRepairShop)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABAutoRepairShop, queryID as long)
      queryObj.compare(ABAutoRepairShop#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABAutoRepairShop#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findAutoRepairShop


  /* The ABAutoTowingAgcy version of findContact()
  */

  static function findAutoTowingAgcy(queryID: String): ABAutoTowingAgcy {
    var queryObj = Query.make(ABAutoTowingAgcy)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABAutoTowingAgcy, queryID as long)
      queryObj.compare(ABAutoTowingAgcy#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABAutoTowingAgcy#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findAutoTowingAgcy


  /* The ABLawFirm version of findContact()
  */

  static function findLawFirm(queryID: String): ABLawFirm {
    var queryObj = Query.make(ABLawFirm)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABLawFirm, queryID as long)
      queryObj.compare(ABLawFirm#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABLawFirm#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findLawFirm


  /* The ABMedicalCareOrg version of findContact()
  */

  static function findMedicalCareOrg(queryID: String): ABMedicalCareOrg {
    var queryObj = Query.make(ABMedicalCareOrg)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABMedicalCareOrg, queryID as long)
      queryObj.compare(ABMedicalCareOrg#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABMedicalCareOrg#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findMedicalCareOrg


  /* The ABPolicyCompany version of findContact()
  */

  static function findPolicyCompany(queryID: String): ABPolicyCompany {
    var queryObj = Query.make(ABPolicyCompany)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey: Key = new Key(ABPolicyCompany, queryID as long)
      queryObj.compare(ABPolicyCompany#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABPolicyCompany#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findPolicyCompany


  // =======================================================
  // ================    ABPerson branch    ================
  // =======================================================


  /* The ABPerson version of findContact()
  */

  static function findPerson(queryID: String): ABPerson {
    var queryObj = Query.make(ABPerson)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABPerson, queryID as long)
      queryObj.compare(ABPerson#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABPerson#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findPerson


  /* The ABAdjudicator version of findContact()
  */

  static function findAdjudicator(queryID: String): ABAdjudicator {
    var queryObj = Query.make(ABAdjudicator)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABAdjudicator, queryID as long)
      queryObj.compare(ABAdjudicator#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABAdjudicator#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findAdjudicator


  /* The ABPersonVendor version of findContact()
  */

  static function findPersonVendor(queryID: String): ABPersonVendor {
    var queryObj = Query.make(ABPersonVendor)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABPersonVendor, queryID as long)
      queryObj.compare(ABPersonVendor#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABPersonVendor#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findPersonVendor


  /* The ABAttorneyversion of findContact()
  */

  static function findAttorney(queryID: String): ABAttorney {
    var queryObj = Query.make(ABAttorney)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABAttorney, queryID as long)
      queryObj.compare(ABAttorney#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABAttorney#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findAttorney


  /* The ABDoctor version of findContact()
  */

  static function findDoctor(queryID: String): ABDoctor {
    var queryObj = Query.make(ABDoctor)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey: Key = new Key(ABDoctor, queryID as long)
      queryObj.compare(ABDoctor#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABDoctor#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findDoctor


  /* The ABPolicyPerson version of findContact()
  */

  static function findPolicyPerson(queryID: String): ABPolicyPerson {
    var queryObj = Query.make(ABPolicyPerson)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey: Key = new Key(ABPolicyPerson, queryID as long)
      queryObj.compare(ABPolicyPerson#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABPolicyPerson#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findPolicyPerson



  /* The ABUserContact version of findContact()
  */

  static function findUserContact(queryID: String): ABUserContact {
    var queryObj = Query.make(ABUserContact)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABUserContact, queryID as long)
      queryObj.compare(ABUserContact#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABUserContact#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findUserContact


  // ======================================================
  // ================    ABPlace branch    ================
  // ======================================================


  /* The ABPlace version of findContact()
  */

  static function findPlace(queryID: String): ABPlace {
    var queryObj = Query.make(ABPlace)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABPlace, queryID as long)
      queryObj.compare(ABPlace#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABPlace#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findPlace


  /* The ABLegalVenue version of findContact()
  */

  static function findLegalVenue(queryID: String): ABLegalVenue {
    var queryObj = Query.make(ABLegalVenue)
    // use the Java parseInt method to check if queryID is an integer
    try {
      Integer.parseInt(queryID)
      // If no exception was thrown, the query ID is an integer.
      // Therefore, restrict the query by ID.
      var queryKey = new Key(ABLegalVenue, queryID as long)
      queryObj.compare(ABLegalVenue#ID, Relop.Equals, queryKey)
    } catch (e: NumberFormatException) {
      // If an exception was thrown, the queryID is not an integer.
      // Therefore, assume queryID is a public ID and restrict the
      // query by public ID.            
      queryObj.compare(ABLegalVenue#PublicID, Relop.Equals, queryID)
    }
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }


  // ======================================================
  // ======================================================


  /* Returns the ABContact with the given ID (or null if no ABContact with
     that ID exists). This is used primarily for education purposes as it
     allows for shorter code examples where a given contact is needed.
     ** RETAINED FOR BACKWARDS COMPATABILITY. NEW REFERENCES SHOULD USE
     findContact() or one of its related methods. ***
  */

  @Deprecated("Diamond")
  public static function findContactByID(queryID: int): ABContact {
    var queryKey = new Key(ABContact, queryID)
    var queryObj = Query.make(ABContact)
    queryObj.compare(ABContact#ID, Relop.Equals, queryKey)
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  // end findContactByID

}
