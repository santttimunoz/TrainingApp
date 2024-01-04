/**
 * IWorkflowAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class IWorkflowAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.IWorkflowAPIService {

/**
 * External API for performing operations on workflows.
 * @deprecated Use WS-I webservice gw.wsi.pl.WorkflowAPI instead.
 */

    public IWorkflowAPIServiceLocator() {
    }


    public IWorkflowAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IWorkflowAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IWorkflowAPI
    private java.lang.String IWorkflowAPI_address = "http://dontuse.defaultvalue.com/IWorkflowAPI";

    public java.lang.String getIWorkflowAPIAddress() {
        return IWorkflowAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IWorkflowAPIWSDDServiceName = "IWorkflowAPI";

    public java.lang.String getIWorkflowAPIWSDDServiceName() {
        return IWorkflowAPIWSDDServiceName;
    }

    public void setIWorkflowAPIWSDDServiceName(java.lang.String name) {
        IWorkflowAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.IWorkflowAPI getIWorkflowAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IWorkflowAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIWorkflowAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.IWorkflowAPI getIWorkflowAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.IWorkflowAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IWorkflowAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getIWorkflowAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIWorkflowAPIEndpointAddress(java.lang.String address) {
        IWorkflowAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.IWorkflowAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.IWorkflowAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IWorkflowAPISoapBindingStub(new java.net.URL(IWorkflowAPI_address), this);
                _stub.setPortName(getIWorkflowAPIWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IWorkflowAPI".equals(inputPortName)) {
            return getIWorkflowAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IWorkflowAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IWorkflowAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IWorkflowAPI".equals(portName)) {
            setIWorkflowAPIEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
