/**
 * IMessagingToolsAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface IMessagingToolsAPIService extends javax.xml.rpc.Service {

/**
 * MessagingTools is a remote interface to a set of tools to get messaging
 * statistics and perform operations on messages.
 * @deprecated Since 8.0.0.  Please use the ab800 package.
 */
    public java.lang.String getIMessagingToolsAPIAddress();

    public com.guidewire.ab.webservices.api.IMessagingToolsAPI getIMessagingToolsAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.IMessagingToolsAPI getIMessagingToolsAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
