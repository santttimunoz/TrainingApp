/**
 * IMaintenanceToolsAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface IMaintenanceToolsAPIService extends javax.xml.rpc.Service {

/**
 * An API used for managing the application. This is distinct from
 * ISystemToolsAPI which is concerned with managing the application platform.
 * @deprecated Since 8.0.0.  Please use the ab800 package.
 */
    public java.lang.String getIMaintenanceToolsAPIAddress();

    public com.guidewire.ab.webservices.api.IMaintenanceToolsAPI getIMaintenanceToolsAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.IMaintenanceToolsAPI getIMaintenanceToolsAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
