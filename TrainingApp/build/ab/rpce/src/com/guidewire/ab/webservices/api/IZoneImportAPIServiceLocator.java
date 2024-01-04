/**
 * IZoneImportAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class IZoneImportAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.IZoneImportAPIService {

/**
 * IZoneImportAPI is a remote interface to a set of tools to import
 * zone data (in csv format)
 * into the staging tables.  See documentation for the zone data csv
 * format.
 * @deprecated Use WS-I webservice gw.wsi.pl.ZoneImportAPI.
 */

    public IZoneImportAPIServiceLocator() {
    }


    public IZoneImportAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IZoneImportAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IZoneImportAPI
    private java.lang.String IZoneImportAPI_address = "http://dontuse.defaultvalue.com/IZoneImportAPI";

    public java.lang.String getIZoneImportAPIAddress() {
        return IZoneImportAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IZoneImportAPIWSDDServiceName = "IZoneImportAPI";

    public java.lang.String getIZoneImportAPIWSDDServiceName() {
        return IZoneImportAPIWSDDServiceName;
    }

    public void setIZoneImportAPIWSDDServiceName(java.lang.String name) {
        IZoneImportAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.IZoneImportAPI getIZoneImportAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IZoneImportAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIZoneImportAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.IZoneImportAPI getIZoneImportAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.IZoneImportAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IZoneImportAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getIZoneImportAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIZoneImportAPIEndpointAddress(java.lang.String address) {
        IZoneImportAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.IZoneImportAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.IZoneImportAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IZoneImportAPISoapBindingStub(new java.net.URL(IZoneImportAPI_address), this);
                _stub.setPortName(getIZoneImportAPIWSDDServiceName());
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
        if ("IZoneImportAPI".equals(inputPortName)) {
            return getIZoneImportAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IZoneImportAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IZoneImportAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IZoneImportAPI".equals(portName)) {
            setIZoneImportAPIEndpointAddress(address);
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