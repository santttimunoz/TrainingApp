/**
 * ILoginAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


/**
 * <p>
 * A remote interface that allows a user to log in and out of a system.
 * The system uses conversations to implement SOAP
 * authentication in a Guidewire application  (e.g. BillingCenter, ClaimCenter,
 * PolicyCenter). When connecting to Guidewire
 * applications the caller must first authenticate using the <code>ILoginAPI.login()</code>
 * method.  This method returns the
 * the session ID of the server session.
 * </p>
 * <p>
 * On each successive call in the conversation, pass the session ID in
 * the SOAP header
 * {@link gw.pl.util.webservices.Globals#GW_AUTHENTICATION_SECURITY_TOKEN_CONTEXT_PROPERTY}.
 * You must call
 * <code>logout()</code> when you are done with the conversation.
 * </p>
 * <p><b>NOTE:</b> This API is intended for users who are using Guidewire's
 * web services from languages other
 * than Java.   If you are using Java, you should use the <code>APILocator</code>
 * instead.
 * </p>
 * @deprecated Use WS-I webservice gw.wsi.pl.LoginAPI instead.
 */
public interface ILoginAPI extends java.rmi.Remote {

    /**
     * <p>
     * Logs the user in preparation for a Web Service Security (WSS) conversation.
     * A WSS conversation is one in which
     * user credentials are passed using the WSS <code>UsernameToken</code>
     * profile.
     * </p><p>
     * <b>NOTE:</b> The Guidewire Toolkit does not currently support this
     * method. This method is available
     * for access by all other SOAP clients.
     * </p>
     * <br>
 * @deprecated
     * @param userName 
     * @param password 
     * @return 
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws com.guidewire.ab.webservices.fault.LoginException if the user cannot be authenticated or was denied access for some reason.
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String WSSLogin(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException, com.guidewire.ab.webservices.fault.LoginException;

    /**
     * Terminates a WSS conversation. Attempts to log out a user not
     * logged in are siltently ignored.
     * <p/>
     * NOTE: Usage of this method by the Guidewire Toolkit is not currently
     * supported. This is available
     * for access by all other SOAP clients.
     * <br>
 * @deprecated
     * @param userName 
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void WSSLogout(java.lang.String userName) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Logs the user into a Guidewire application (e.g. ClaimCenter,
     * PolicyCenter, BillingCenter). Returns the session ID
     * of the server session.
     * <br>
 * @deprecated
     * @param userName The user name to authenticate.
     * @param password The password to authenticate with.
     * @return A valid session ID.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws com.guidewire.ab.webservices.fault.LoginException if the user cannot be authenticated or was denied access for some reason.
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String login(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException, com.guidewire.ab.webservices.fault.LoginException;

    /**
     * Logs the user out of the session.  The session will timeout
     * if this method is not called.
     * <br>
 * @deprecated
     * @param sessionID the session ID of the server session.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void logout(java.lang.String sessionID) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
