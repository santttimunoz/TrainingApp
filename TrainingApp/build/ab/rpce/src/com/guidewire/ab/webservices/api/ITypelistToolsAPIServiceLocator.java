/**
 * ITypelistToolsAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class ITypelistToolsAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.ITypelistToolsAPIService {

/**
 * ITypelistToolsAPI provides methods that allow for the extraction
 * of typelist data from the
 * system.
 * @deprecated Use WS-I webservice gw.wsi.pl.TypelistToolsAPI instead.
 */

    public ITypelistToolsAPIServiceLocator() {
    }


    public ITypelistToolsAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ITypelistToolsAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ITypelistToolsAPI
    private java.lang.String ITypelistToolsAPI_address = "http://dontuse.defaultvalue.com/ITypelistToolsAPI";

    public java.lang.String getITypelistToolsAPIAddress() {
        return ITypelistToolsAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ITypelistToolsAPIWSDDServiceName = "ITypelistToolsAPI";

    public java.lang.String getITypelistToolsAPIWSDDServiceName() {
        return ITypelistToolsAPIWSDDServiceName;
    }

    public void setITypelistToolsAPIWSDDServiceName(java.lang.String name) {
        ITypelistToolsAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.ITypelistToolsAPI getITypelistToolsAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ITypelistToolsAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getITypelistToolsAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.ITypelistToolsAPI getITypelistToolsAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.ITypelistToolsAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.ITypelistToolsAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getITypelistToolsAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setITypelistToolsAPIEndpointAddress(java.lang.String address) {
        ITypelistToolsAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.ITypelistToolsAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.ITypelistToolsAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.ITypelistToolsAPISoapBindingStub(new java.net.URL(ITypelistToolsAPI_address), this);
                _stub.setPortName(getITypelistToolsAPIWSDDServiceName());
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
        if ("ITypelistToolsAPI".equals(inputPortName)) {
            return getITypelistToolsAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "ITypelistToolsAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "ITypelistToolsAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ITypelistToolsAPI".equals(portName)) {
            setITypelistToolsAPIEndpointAddress(address);
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
