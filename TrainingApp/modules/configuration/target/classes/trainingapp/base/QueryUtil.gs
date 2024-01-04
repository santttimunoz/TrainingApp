package trainingapp.base

class QueryUtil {

/* Returns the ABContact with the given ID (or null if no ABContact with
   that ID exists). This is used primarily for education purposes as it
   allows for shorter code examples where a given contact is needed.
*/

  public static function findContactByID ( queryID : int) : ABContact {

    var queryKey : Key = new Key(ABContact, queryID)       
    var queryObj = gw.api.database.Query.make(ABContact)
    queryObj.compare ("ID", Equals, queryKey)
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }

  public static function findUserByID ( queryID : int) : User {

    var queryKey : Key = new Key(User, queryID)
    var queryObj = gw.api.database.Query.make(User)
    queryObj.compare ("ID", Equals, queryKey)
    var resultsObj = queryObj.select()
    if (resultsObj.Count == 1) {
      return resultsObj.getAtMostOneRow()
    } else {
      return null
    }
  }
}













































// TODO :: CurrDebv Update TrainingApp 8.0.2 use feature literal with PropertyInfo?


