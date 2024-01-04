/**
 * IReviewSummaryAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


/**
 * IReviewSummaryAPI provides methods for creating and deleting review
 * summaries corresponding to contact
 * Reviews on ClaimCenter.
 * @deprecated Since 8.0.0.  Please use the ABVendorEvaluationAPI
 */
public interface IReviewSummaryAPI extends java.rmi.Remote {

    /**
     * Adds a new ReviewSummary, and returns it.
     * <br>
 * @deprecated
     * @param name the name of the Review (often the same as the ReviewType)
     * @param relatedTo the "related to" object on the claim
     * @param claimNumber the claim number
     * @param reviewType the review type (in case "name" is being used more broadly)
     * @param reviewedBy (String) the user who last updated the review before it was completed
     * @param subContact (String)
     * @param serviceDate 
     * @param serviceType 
     * @param score the overall score of the review
     * @param abContactLinkID the AddressBookUID (linkID in ContactManager) of the associated Contact/ABContact
     * @param comments 
     * @param claimCenterUID 
     * @param categoryScoreCategories 
     * @param categoryScores 
     * @return the reviewSummary
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ReviewSummary addNewReviewSummary(java.lang.String name, java.lang.String relatedTo, java.lang.String claimNumber, java.lang.String reviewType, java.lang.String reviewedBy, java.lang.String subContact, java.util.Calendar serviceDate, com.guidewire.ab.webservices.enumeration.ReviewServiceType serviceType, int score, java.lang.String abContactLinkID, java.lang.String comments, java.lang.String claimCenterUID, com.guidewire.ab.webservices.enumeration.ReviewCategory[] categoryScoreCategories, int[] categoryScores) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Deletes the ReviewSummary corresponding to a given AddressBookUID.
     * <br>
 * @deprecated
     * @param addressBookUID 
     * @return the AddressBookUID (LinkID) of the new ReviewSummary object
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.Boolean deleteReviewSummary(java.lang.String addressBookUID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Updates scores associated with the ABContact corresponding
     * to a given AddressBookUID.
     * <br>
 * @deprecated
     * @param addressBookUID 
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void updateReviewScores(java.lang.String addressBookUID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Saves a ReviewSummary based on the newly created ReviewSummary
     * or external Review Summary.
     * <br>
 * @deprecated
     * @param rs a ReviewSummary (remote object)
     * @return the reviewSummary (local object)
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ReviewSummary updateReviewSummary(com.guidewire.ab.webservices.entity.ReviewSummary rs) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
