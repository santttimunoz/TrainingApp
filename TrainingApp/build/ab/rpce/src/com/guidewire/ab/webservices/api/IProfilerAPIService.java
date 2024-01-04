/**
 * IProfilerAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface IProfilerAPIService extends javax.xml.rpc.Service {

/**
 * API to access services offered by the Guidewire Profiler.
 * @deprecated Use WS-I webservice gw.wsi.pl.ProfilerAPI instead.
 */
    public java.lang.String getIProfilerAPIAddress();

    public com.guidewire.ab.webservices.api.IProfilerAPI getIProfilerAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.IProfilerAPI getIProfilerAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
