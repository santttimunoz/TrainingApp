/**
 * IReviewSummaryAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class IReviewSummaryAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.IReviewSummaryAPIService {

/**
 * IReviewSummaryAPI provides methods for creating and deleting review
 * summaries corresponding to contact
 * Reviews on ClaimCenter.
 * @deprecated Since 8.0.0.  Please use the ABVendorEvaluationAPI
 */

    public IReviewSummaryAPIServiceLocator() {
    }


    public IReviewSummaryAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IReviewSummaryAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IReviewSummaryAPI
    private java.lang.String IReviewSummaryAPI_address = "http://dontuse.defaultvalue.com/IReviewSummaryAPI";

    public java.lang.String getIReviewSummaryAPIAddress() {
        return IReviewSummaryAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IReviewSummaryAPIWSDDServiceName = "IReviewSummaryAPI";

    public java.lang.String getIReviewSummaryAPIWSDDServiceName() {
        return IReviewSummaryAPIWSDDServiceName;
    }

    public void setIReviewSummaryAPIWSDDServiceName(java.lang.String name) {
        IReviewSummaryAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.IReviewSummaryAPI getIReviewSummaryAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IReviewSummaryAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIReviewSummaryAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.IReviewSummaryAPI getIReviewSummaryAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.IReviewSummaryAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IReviewSummaryAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getIReviewSummaryAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIReviewSummaryAPIEndpointAddress(java.lang.String address) {
        IReviewSummaryAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.IReviewSummaryAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.IReviewSummaryAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IReviewSummaryAPISoapBindingStub(new java.net.URL(IReviewSummaryAPI_address), this);
                _stub.setPortName(getIReviewSummaryAPIWSDDServiceName());
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
        if ("IReviewSummaryAPI".equals(inputPortName)) {
            return getIReviewSummaryAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IReviewSummaryAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IReviewSummaryAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IReviewSummaryAPI".equals(portName)) {
            setIReviewSummaryAPIEndpointAddress(address);
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
