/**
 * IUserAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


/**
 * UserAPI is used to perform operations on users.  This includes
 * creating and modifying.
 * @deprecated Write your own Gosu class and publish it as a web service.
 */
public interface IUserAPI extends java.rmi.Remote {

    /**
     * Adds roles to an User.
     * If an role is already belongs to the user, it's ignored.
     * <br>
 * @deprecated
     * @param userID The ID of the user
     * @param roleIDs The public IDs of roles to be added.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException if the userID or roleID does not exist
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void addRolesToUser(java.lang.String userID, java.lang.String[] roleIDs) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Adds the given user to the system. Only the contact field and
     * credential properties are required.
     * The user will be created and given the roles specified by the <code>roles</code>
     * parameter.
     * <p>
     * The Contact field should be set to an object of type UserContact,
     * which should have at least its last
     * name set. The Credential field should be set to an object of type
     * Credential which should have the
     * user name and password fields set. For example:
     * <pre>
     * User user = new User()
     * UserContact userContact = new UserContact()
     * userContact.FirstName = "John"
     * userContact.LastName = "Smith"
     * user.Contact = userContact
     * Credential credential = new Credential()
     * credential.UserName  = "jsmith"
     * credential.Password = "initialPassword"
     * user.Credential = credential
     * userAPI.addUser(user, new String[]{"rolex", "roley"})
     * </pre>
     * <br>
 * @deprecated
     * @param userData The <code>User</code> object, which must have valid <code>UserContact</code>
and <code>Credential</code> objects set as the contact and credential field.
     * @param rolePublicIds The public ids of the roles to assign the user.
     * @return The public id of the new user
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.RequiredFieldException if the passed in User is null, or if the passed in User.Contact is null, or if the passed in User.Credential is null.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException if the userID or roleID does not exist
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String addUser(com.guidewire.ab.webservices.entity.User userData, java.lang.String[] rolePublicIds) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.RequiredFieldException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Adds the given user to the system. This method is included
     * for backwards compatibility but
     * all new code should use the form of addUser that does <em>not</em>
     * take a credentialName parameter.
     * <br>
 * @deprecated use the version of addUser with no credentialName
     * parameter instead
     * @scriptable-all
     * @param data The <code>User</code> object, which must have valid <code>UserContact</code>
and <code>Credential</code> objects set as the contact and credential field.
     * @param rolePublicIds The roles to assign the user.
     * @param credentialName Ignored
     * @return The public id of the new user
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException if the userID or roleID does not exist
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String addUser(com.guidewire.ab.webservices.entity.User data, java.lang.String[] rolePublicIds, java.lang.String credentialName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Adds the user as a member of the group.  Both the user and
     * group must already exist.
     * <br>
 * @deprecated
     * @param groupID The identifier of the group.
     * @param userID The identifier of the user.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException if the userID or roleID does not exist
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void addUserAsMemberOfGroup(java.lang.String groupID, java.lang.String userID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Adds attributes to an User.
     * <br>
 * @deprecated
     * @param userID The ID of the user
     * @param attributeIDs attribute public IDs to be added
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException if the userID or roleID does not exist
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void addUserAttributes(java.lang.String userID, java.lang.String[] attributeIDs) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Indicates whether the given user exists in the system.
     * <br>
 * @deprecated
     * @param publicId The public identifier of the user in question.
     * @return <code>true</code> if the user specified by the identifier exists in the system,
<code>false</code> otherwise.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean doesExist(java.lang.String publicId) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Finds the public id of a user by the user login name.
     * <br>
 * @deprecated
     * @param userName the login name (credential name).
     * @return the user's publicID, else null
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String findPublicIdByName(java.lang.String userName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Retrieves a user given the user identifier
     * <br>
 * @deprecated
     * @param userID 
     * @return The UserData representing the user
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException if the userID or roleID does not exist
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.User getUser(java.lang.String userID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Returns <code>true</code> if the user is a member of the group
     * specified, <code>false</code> if not.
     * <br>
 * @deprecated
     * @param groupID The identifier of the group.
     * @param userID The identifier of the user.
     * @return <code>true</code> if the user is a member of the group specified, <code>false</code> if not.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException if the userID or roleID does not exist
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean isUserMemberOfGroup(java.lang.String groupID, java.lang.String userID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Remove roles from a User.
     * If any of the roles does not belongs to the user, it will be ignored.
     * <br>
 * @deprecated
     * @param userID The ID of the user
     * @param roleIDs The public IDs of roles to be added.  This may be null
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException if the userID or roleID does not exist
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void removeRolesFromUser(java.lang.String userID, java.lang.String[] roleIDs) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Removes the user as a member of the group.  Both the user and
     * group must
     * already exist.
     * <br>
 * @deprecated
     * @param groupID The identifier of the group.
     * @param userID The identifier of the user.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException if the userID or roleID does not exist
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void removeUserAsMemberOfGroup(java.lang.String groupID, java.lang.String userID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Remove attributes to an User.
     * If an attribute does not belongs to the user, it's ignored.
     * <br>
 * @deprecated
     * @param userID The ID of the user
     * @param attributeIDs attribute public IDs to be removed
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException if the userID or roleID does not exist
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void removeUserAttributes(java.lang.String userID, java.lang.String[] attributeIDs) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
