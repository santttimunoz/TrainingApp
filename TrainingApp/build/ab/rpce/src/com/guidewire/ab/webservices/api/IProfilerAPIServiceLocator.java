/**
 * IProfilerAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class IProfilerAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.IProfilerAPIService {

/**
 * API to access services offered by the Guidewire Profiler.
 * @deprecated Use WS-I webservice gw.wsi.pl.ProfilerAPI instead.
 */

    public IProfilerAPIServiceLocator() {
    }


    public IProfilerAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IProfilerAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IProfilerAPI
    private java.lang.String IProfilerAPI_address = "http://dontuse.defaultvalue.com/IProfilerAPI";

    public java.lang.String getIProfilerAPIAddress() {
        return IProfilerAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IProfilerAPIWSDDServiceName = "IProfilerAPI";

    public java.lang.String getIProfilerAPIWSDDServiceName() {
        return IProfilerAPIWSDDServiceName;
    }

    public void setIProfilerAPIWSDDServiceName(java.lang.String name) {
        IProfilerAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.IProfilerAPI getIProfilerAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IProfilerAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIProfilerAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.IProfilerAPI getIProfilerAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.IProfilerAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IProfilerAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getIProfilerAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIProfilerAPIEndpointAddress(java.lang.String address) {
        IProfilerAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.IProfilerAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.IProfilerAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IProfilerAPISoapBindingStub(new java.net.URL(IProfilerAPI_address), this);
                _stub.setPortName(getIProfilerAPIWSDDServiceName());
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
        if ("IProfilerAPI".equals(inputPortName)) {
            return getIProfilerAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IProfilerAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IProfilerAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IProfilerAPI".equals(portName)) {
            setIProfilerAPIEndpointAddress(address);
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
