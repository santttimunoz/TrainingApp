/**
 * IGroupAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


/**
 * IGroupAPI provides mechanisms for adding new Groups to and obtaining
 * information for
 * existing Groups from ClaimCenter
 * @deprecated Write your own Gosu class and publish it as a web service.
 */
public interface IGroupAPI extends java.rmi.Remote {

    /**
     * Adds the given group data to the system.
     * if the data object doesn't contain a PublicID, one will be assigned.
     * The parent, grouptype, and securityzone of the group data cannot be
     * null.
     * <br>
 * @deprecated
     * @param groupData The <code>GroupData</code> object
     * @return The public identifier of the group data object.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.RequiredFieldException If any of the required fields are missing.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.DuplicateKeyException If the group has a public id that exists already.
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String addGroup(com.guidewire.ab.webservices.entity.Group groupData) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.RequiredFieldException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.DuplicateKeyException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Finds the public id of a group by the name.
     * <br>
 * @deprecated
     * @param groupName the name of the group to match
     * @return the matching group's publicId, or <code>null</code> if no Group exists with the given name.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String findPublicIdByName(java.lang.String groupName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Retrieves a group given the group identifier or returns null
     * if no group could be found.
     * <br>
 * @deprecated
     * @param groupID 
     * @return The GroupData representing the group
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.Group getGroup(java.lang.String groupID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
