/**
 * ITableImportAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class ITableImportAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.ITableImportAPIService {

/**
 * This interface provides methods for integrity checking and loading
 * data via
 * the  staging tables.
 * <p/>
 * In particular, it allows the caller to instruct the server
 * to perform the following staging table operations:
 * <ol>
 * <li>Clear error table.</li>
 * <li>Clear exclusion table.</li>
 * <li>Clear staging tables.</li>
 * <li>Delete rows from staging tables based on contents of exclusion
 * table.</li>
 * <li>Populate exclusion table with rows to be excluded.</li>
 * <li>Integrity check the contents of the staging tables.</li>
 * <li>Integrity check the contents of the Zone staging tables and load
 * Zone source tables if no errors.</li>
 * <li>Integrity check the contents of the staging tables and load source
 * tables if no errors.</li>
 * </ol>
 * @deprecated Use WS-I webservice gw.wsi.pl.TableImportAPI instead.
 */

    public ITableImportAPIServiceLocator() {
    }


    public ITableImportAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ITableImportAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ITableImportAPI
    private java.lang.String ITableImportAPI_address = "http://dontuse.defaultvalue.com/ITableImportAPI";

    public java.lang.String getITableImportAPIAddress() {
        return ITableImportAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ITableImportAPIWSDDServiceName = "ITableImportAPI";

    public java.lang.String getITableImportAPIWSDDServiceName() {
        return ITableImportAPIWSDDServiceName;
    }

    public void setITableImportAPIWSDDServiceName(java.lang.String name) {
        ITableImportAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.ITableImportAPI getITableImportAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ITableImportAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getITableImportAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.ITableImportAPI getITableImportAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.ITableImportAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.ITableImportAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getITableImportAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setITableImportAPIEndpointAddress(java.lang.String address) {
        ITableImportAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.ITableImportAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.ITableImportAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.ITableImportAPISoapBindingStub(new java.net.URL(ITableImportAPI_address), this);
                _stub.setPortName(getITableImportAPIWSDDServiceName());
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
        if ("ITableImportAPI".equals(inputPortName)) {
            return getITableImportAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "ITableImportAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "ITableImportAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ITableImportAPI".equals(portName)) {
            setITableImportAPIEndpointAddress(address);
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
