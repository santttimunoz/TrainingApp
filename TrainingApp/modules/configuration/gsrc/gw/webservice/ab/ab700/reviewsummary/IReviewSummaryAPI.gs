package gw.webservice.ab.ab700.reviewsummary

uses java.rmi.RemoteException;
uses gw.transaction.Transaction
uses gw.pl.persistence.core.Bundle
uses gw.api.system.ABLoggerCategory
uses java.lang.Exception

/**
 * IReviewSummaryAPI provides methods for creating and deleting review summaries corresponding to contact
 * Reviews on ClaimCenter.
 */
@Deprecated("Since 8.0.0.  Please use the ABVendorEvaluationAPI")
@RpcWebService({})
@Export
class IReviewSummaryAPI
{
  private static final var _logger = ABLoggerCategory.AB

  construct() {
  }
  
  /**
   * Adds a new ReviewSummary, and returns it.
   *
   * @param name the name of the Review (often the same as the ReviewType)
   * @param relatedTo the "related to" object on the claim
   * @param claimNumber the claim number
   * @param reviewType the review type (in case "name" is being used more broadly)
   * @param reviewedBy (String) the user who last updated the review before it was completed 
   * @param subContact (String) 
   * @param serviceDate: DateTime, 
   * @param serviceType: ReviewServiceType, 
   * @param score  the overall score of the review
   * @param abContactLinkID the AddressBookUID (linkID in ContactManager) of the associated Contact/ABContact
   * @return the reviewSummary 
   */
   
  function addNewReviewSummary(name: String,          relatedTo: String, 
                               claimNumber: String,   reviewType: String,
                               reviewedBy: String,    subContact: String,
                               serviceDate: DateTime, serviceType: ReviewServiceType, 
                               score: int,            abContactLinkID: String,
                               comments: String,      claimCenterUID: String,                               
                               categoryScoreCategories: ReviewCategory[], 
                               categoryScores: int[]) : ReviewSummary {
    var contact = findABContactByLinkID(abContactLinkID);
    var rs = findReviewSummaryByClaimCenterUID(claimCenterUID);
    if (rs != null) { 
      _logger.info("Duplicate ReviewSummary detected, skipping.");
      return rs;
    }
    try {
      Transaction.runWithNewBundle( \ bundle : Bundle -> {
        rs = new ReviewSummary(bundle);
        rs.ABContact = contact;
        rs.Name = name;
        rs.RelatedTo = relatedTo;
        rs.ClaimNumber = claimNumber;
        rs.ReviewType = reviewType;
        if (score >= 0) {
          rs.Score = score;
        }
        rs.Tallied = false;
        rs.ReviewedBy = reviewedBy;
        rs.Subcontact = subContact;
        rs.ServiceDate = serviceDate;
        rs.ServiceType = serviceType;
        rs.Comments = comments;
        rs.ClaimCenterUID = claimCenterUID;
        for (var i in 0..|categoryScores.length) { 
          var reviewCategory = categoryScoreCategories[i];
          var categoryScore = categoryScores[i];
          rs.addNewCategoryScore(reviewCategory, categoryScore);
        }
        if (contact.UpdateScore == null || contact.UpdateScore == false) {
          contact.UpdateScore = true;
        }
      });
      return rs;
    } catch (e : Exception) { 
      _logger.error("Error creating new reviewSummary for ABContact "+ contact + ":" +e.toString(), e);
      throw(e);
    }
  }

  /**
   * Saves a ReviewSummary based on the newly created ReviewSummary or external Review Summary.
   *
   * @param rs a ReviewSummary (remote object)
   * @return the reviewSummary (local object)
   */
  function updateReviewSummary(rs: ReviewSummary) : ReviewSummary {
    try { 
      rs.Bundle.commit();
    } catch (e : Exception) { 
      _logger.error("Error updating reviewSummary "+ rs + ":" +e.toString(), e);
      throw(e);
    }
    return rs;
  }


  /**
   * Deletes the ReviewSummary corresponding to a given AddressBookUID. 
   *
   * @return the AddressBookUID (LinkID) of the new ReviewSummary object 
   * @return true if successful; false if no ReviewSummary matches the AddressBookUID provided.
   */
  function deleteReviewSummary(addressBookUID : String) : Boolean {
    var rss = gw.api.database.Query.make(entity.ReviewSummary).compare("LinkID", Equals, addressBookUID).select();
    if (rss.getCount() > 1) {
      _logger.info("deleteReviewSummary(): nonunique abUID("+addressBookUID+") - duplicates: "+rss.getCount());
      throw new RemoteException("deleteReviewSummary(): nonunique abUID("+addressBookUID+") - duplicates: "+rss.getCount());
    }
    if (rss.getCount() == 0) {
      _logger.info("deleteReviewSummary(): nonexistant abUID("+addressBookUID+")");
      throw new RemoteException("deleteReviewSummary(): nonexistant abUID("+addressBookUID+")");
    }
    var summary = rss.getAtMostOneRow();
    var abcontact = summary.ABContact;
    _logger.info("deleteReviewSummary(): found: "+ ReviewSummary +"("+addressBookUID+")");
    try {
    Transaction.runWithNewBundle( \ bundle : Bundle -> {
      bundle.add( summary );
      if (abcontact.UpdateScore == null || abcontact.UpdateScore == false) {
        bundle.add( abcontact );
        abcontact.UpdateScore = true;
      }
      summary.remove();
    });
    } catch (e : Exception) { 
      _logger.error("Error deleting review "+addressBookUID + " for contact " + abcontact + ":" +e.toString(), e);
      throw(e);
    }
    return true;
  }

  /** 
   * Updates scores associated with the ABContact corresponding to a given AddressBookUID.
   *
   * @return the AddressBookUID (LinkID) of the ABContact object 
   */ 
  function updateReviewScores(addressBookUID : String) {
    var contact = findABContactByLinkID(addressBookUID);
    contact.updateScores();
  }

  private function findReviewSummaryByClaimCenterUID(claimCenterUID : String) : ReviewSummary {
    var summaries = gw.api.database.Query.make(entity.ReviewSummary).compare("ClaimCenterUID", Equals, claimCenterUID).select();
    if (summaries.getCount() == 0) {
      _logger.info("findReviewSummaryByClaimCenterUID(): no results for '"+claimCenterUID+"', creating a new ReviewSummary.");
      return null;
    }  
    if (summaries.getCount() > 1) {
      _logger.info("findReviewSummaryByClaimCenterUID(): WARNING "+summaries.getCount()+" results found, should be either 0 or 1.");     
    }
    var rs = summaries.getAtMostOneRow();
    _logger.info("findReviewSummaryByClaimCenterUID(): found summary '"+rs.PublicID+"' for ccuid '"+claimCenterUID+"'.");
    return rs;
  }

  private function findABContactByLinkID(addressBookUID : String) : ABContact {
    var contacts = gw.api.database.Query.make(entity.ABContact).compare("LinkID", Equals, addressBookUID).select();
    if (contacts.getCount() > 1) {
      _logger.info("findABContactByLinkID(): nonunique abUID("+addressBookUID+") - duplicates: "+contacts.getCount());
      throw new RemoteException("findABContactByLinkID(): nonunique abUID("+addressBookUID+") - duplicates: "+contacts.getCount());
    }
    if (contacts.getCount() == 0) {
      _logger.info("findABContactByLinkID(): nonexistant abUID("+addressBookUID+")");
      throw new RemoteException("findABContactByLinkID(): nonexistant abUID("+addressBookUID+")");
    }
    var contact = contacts.getAtMostOneRow();
    _logger.info("findABContactByLinkID(): found: "+ contact +"("+addressBookUID+")");
    return contact;
  }
}
