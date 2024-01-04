/**
 * IImportToolsAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class IImportToolsAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.IImportToolsAPIService {

/**
 * IImportToolsAPI is a remote interface to a set of tools to import
 * XML data to the
 * server.
 * <p/>
 * The XML import format is defined by dynamically-generated XML Schema
 * Definition (XSD) files. Regenerate the XSD
 * files with the regen-xsd task. After XSD regeneration, you will find
 * the XSD files in dist/xsd/import,
 * including the three XSD files: xx_typelists.xsd, xx_entities.xsd,
 * xx_import.xsd (with "xx" replaced by the Guidewire
 * product code, e.g., "cc" for ClaimCenter).
 * @deprecated Use WS-I webservice gw.wsi.pl.ImportToolsAPI instead.
 */

    public IImportToolsAPIServiceLocator() {
    }


    public IImportToolsAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IImportToolsAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IImportToolsAPI
    private java.lang.String IImportToolsAPI_address = "http://dontuse.defaultvalue.com/IImportToolsAPI";

    public java.lang.String getIImportToolsAPIAddress() {
        return IImportToolsAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IImportToolsAPIWSDDServiceName = "IImportToolsAPI";

    public java.lang.String getIImportToolsAPIWSDDServiceName() {
        return IImportToolsAPIWSDDServiceName;
    }

    public void setIImportToolsAPIWSDDServiceName(java.lang.String name) {
        IImportToolsAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.IImportToolsAPI getIImportToolsAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IImportToolsAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIImportToolsAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.IImportToolsAPI getIImportToolsAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.IImportToolsAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IImportToolsAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getIImportToolsAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIImportToolsAPIEndpointAddress(java.lang.String address) {
        IImportToolsAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.IImportToolsAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.IImportToolsAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IImportToolsAPISoapBindingStub(new java.net.URL(IImportToolsAPI_address), this);
                _stub.setPortName(getIImportToolsAPIWSDDServiceName());
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
        if ("IImportToolsAPI".equals(inputPortName)) {
            return getIImportToolsAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IImportToolsAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IImportToolsAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IImportToolsAPI".equals(portName)) {
            setIImportToolsAPIEndpointAddress(address);
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
