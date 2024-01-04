/**
 * ILoginAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class ILoginAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.ILoginAPIService {

/**
 * <p>
 * A remote interface that allows a user to log in and out of a system.
 * The system uses conversations to implement SOAP
 * authentication in a Guidewire application  (e.g. BillingCenter, ClaimCenter,
 * PolicyCenter). When connecting to Guidewire
 * applications the caller must first authenticate using the <code>ILoginAPI.login()</code>
 * method.  This method returns the
 * the session ID of the server session.
 * </p>
 * <p>
 * On each successive call in the conversation, pass the session ID in
 * the SOAP header
 * {@link gw.pl.util.webservices.Globals#GW_AUTHENTICATION_SECURITY_TOKEN_CONTEXT_PROPERTY}.
 * You must call
 * <code>logout()</code> when you are done with the conversation.
 * </p>
 * <p><b>NOTE:</b> This API is intended for users who are using Guidewire's
 * web services from languages other
 * than Java.   If you are using Java, you should use the <code>APILocator</code>
 * instead.
 * </p>
 * @deprecated Use WS-I webservice gw.wsi.pl.LoginAPI instead.
 */

    public ILoginAPIServiceLocator() {
    }


    public ILoginAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ILoginAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ILoginAPI
    private java.lang.String ILoginAPI_address = "http://dontuse.defaultvalue.com/ILoginAPI";

    public java.lang.String getILoginAPIAddress() {
        return ILoginAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ILoginAPIWSDDServiceName = "ILoginAPI";

    public java.lang.String getILoginAPIWSDDServiceName() {
        return ILoginAPIWSDDServiceName;
    }

    public void setILoginAPIWSDDServiceName(java.lang.String name) {
        ILoginAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.ILoginAPI getILoginAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ILoginAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getILoginAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.ILoginAPI getILoginAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.ILoginAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.ILoginAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getILoginAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setILoginAPIEndpointAddress(java.lang.String address) {
        ILoginAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.ILoginAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.ILoginAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.ILoginAPISoapBindingStub(new java.net.URL(ILoginAPI_address), this);
                _stub.setPortName(getILoginAPIWSDDServiceName());
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
        if ("ILoginAPI".equals(inputPortName)) {
            return getILoginAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "ILoginAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "ILoginAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ILoginAPI".equals(portName)) {
            setILoginAPIEndpointAddress(address);
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
