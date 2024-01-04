/**
 * IWorkflowAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface IWorkflowAPIService extends javax.xml.rpc.Service {

/**
 * External API for performing operations on workflows.
 * @deprecated Use WS-I webservice gw.wsi.pl.WorkflowAPI instead.
 */
    public java.lang.String getIWorkflowAPIAddress();

    public com.guidewire.ab.webservices.api.IWorkflowAPI getIWorkflowAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.IWorkflowAPI getIWorkflowAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
