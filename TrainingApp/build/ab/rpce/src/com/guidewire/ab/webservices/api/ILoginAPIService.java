/**
 * ILoginAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface ILoginAPIService extends javax.xml.rpc.Service {

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
    public java.lang.String getILoginAPIAddress();

    public com.guidewire.ab.webservices.api.ILoginAPI getILoginAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.ILoginAPI getILoginAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
