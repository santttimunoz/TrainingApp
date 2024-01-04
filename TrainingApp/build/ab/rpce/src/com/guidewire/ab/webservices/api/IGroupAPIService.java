/**
 * IGroupAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface IGroupAPIService extends javax.xml.rpc.Service {

/**
 * IGroupAPI provides mechanisms for adding new Groups to and obtaining
 * information for
 * existing Groups from ClaimCenter
 * @deprecated Write your own Gosu class and publish it as a web service.
 */
    public java.lang.String getIGroupAPIAddress();

    public com.guidewire.ab.webservices.api.IGroupAPI getIGroupAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.IGroupAPI getIGroupAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
