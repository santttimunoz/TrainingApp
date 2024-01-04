/**
 * IUserAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface IUserAPIService extends javax.xml.rpc.Service {

/**
 * UserAPI is used to perform operations on users.  This includes
 * creating and modifying.
 * @deprecated Write your own Gosu class and publish it as a web service.
 */
    public java.lang.String getIUserAPIAddress();

    public com.guidewire.ab.webservices.api.IUserAPI getIUserAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.IUserAPI getIUserAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
