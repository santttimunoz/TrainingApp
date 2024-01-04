/**
 * IGroupAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class IGroupAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.IGroupAPIService {

/**
 * IGroupAPI provides mechanisms for adding new Groups to and obtaining
 * information for
 * existing Groups from ClaimCenter
 * @deprecated Write your own Gosu class and publish it as a web service.
 */

    public IGroupAPIServiceLocator() {
    }


    public IGroupAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IGroupAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IGroupAPI
    private java.lang.String IGroupAPI_address = "http://dontuse.defaultvalue.com/IGroupAPI";

    public java.lang.String getIGroupAPIAddress() {
        return IGroupAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IGroupAPIWSDDServiceName = "IGroupAPI";

    public java.lang.String getIGroupAPIWSDDServiceName() {
        return IGroupAPIWSDDServiceName;
    }

    public void setIGroupAPIWSDDServiceName(java.lang.String name) {
        IGroupAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.IGroupAPI getIGroupAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IGroupAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIGroupAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.IGroupAPI getIGroupAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.IGroupAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IGroupAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getIGroupAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIGroupAPIEndpointAddress(java.lang.String address) {
        IGroupAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.IGroupAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.IGroupAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IGroupAPISoapBindingStub(new java.net.URL(IGroupAPI_address), this);
                _stub.setPortName(getIGroupAPIWSDDServiceName());
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
        if ("IGroupAPI".equals(inputPortName)) {
            return getIGroupAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IGroupAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IGroupAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IGroupAPI".equals(portName)) {
            setIGroupAPIEndpointAddress(address);
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
