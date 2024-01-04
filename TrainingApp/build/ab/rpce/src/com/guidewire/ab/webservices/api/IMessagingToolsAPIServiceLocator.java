/**
 * IMessagingToolsAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class IMessagingToolsAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.IMessagingToolsAPIService {

/**
 * MessagingTools is a remote interface to a set of tools to get messaging
 * statistics and perform operations on messages.
 * @deprecated Since 8.0.0.  Please use the ab800 package.
 */

    public IMessagingToolsAPIServiceLocator() {
    }


    public IMessagingToolsAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IMessagingToolsAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IMessagingToolsAPI
    private java.lang.String IMessagingToolsAPI_address = "http://dontuse.defaultvalue.com/IMessagingToolsAPI";

    public java.lang.String getIMessagingToolsAPIAddress() {
        return IMessagingToolsAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IMessagingToolsAPIWSDDServiceName = "IMessagingToolsAPI";

    public java.lang.String getIMessagingToolsAPIWSDDServiceName() {
        return IMessagingToolsAPIWSDDServiceName;
    }

    public void setIMessagingToolsAPIWSDDServiceName(java.lang.String name) {
        IMessagingToolsAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.IMessagingToolsAPI getIMessagingToolsAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IMessagingToolsAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIMessagingToolsAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.IMessagingToolsAPI getIMessagingToolsAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.IMessagingToolsAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IMessagingToolsAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getIMessagingToolsAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIMessagingToolsAPIEndpointAddress(java.lang.String address) {
        IMessagingToolsAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.IMessagingToolsAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.IMessagingToolsAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IMessagingToolsAPISoapBindingStub(new java.net.URL(IMessagingToolsAPI_address), this);
                _stub.setPortName(getIMessagingToolsAPIWSDDServiceName());
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
        if ("IMessagingToolsAPI".equals(inputPortName)) {
            return getIMessagingToolsAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IMessagingToolsAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IMessagingToolsAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IMessagingToolsAPI".equals(portName)) {
            setIMessagingToolsAPIEndpointAddress(address);
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
