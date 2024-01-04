/**
 * IJavaRpcAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class IJavaRpcAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.IJavaRpcAPIService {

/**
 * <em>This class is for Guidewire internal use only.</em>
 * <p>
 * Ever need to make remote Java calls, but don't want to deal with the
 * overhead
 * and limitations of Soap, but still want the benefits of Soap? Read
 * on...
 * <p>
 * An api inteface facilitating remote calls to Java classes via Soap.
 * Remotable Java classes implement com.guidewire.pl.system.service.Service
 * -
 * a marker interface to prevent remote access to unsafe classes. The
 * only other
 * requirement for a remotable class is that it's parameters and return
 * type
 * must be Serializable.
 * <p>
 * Remotable classes must also be registered in <code>LocalServiceFactory</code>.
 * This accomplishes two things:
 * <ul>
 *   <li> Enables transparent remote and local calls to the class's methods.
 * <li> Enables caching of the proxy responsible for wrapping the class.
 * </ul>
 */

    public IJavaRpcAPIServiceLocator() {
    }


    public IJavaRpcAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IJavaRpcAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IJavaRpcAPI
    private java.lang.String IJavaRpcAPI_address = "http://dontuse.defaultvalue.com/IJavaRpcAPI";

    public java.lang.String getIJavaRpcAPIAddress() {
        return IJavaRpcAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IJavaRpcAPIWSDDServiceName = "IJavaRpcAPI";

    public java.lang.String getIJavaRpcAPIWSDDServiceName() {
        return IJavaRpcAPIWSDDServiceName;
    }

    public void setIJavaRpcAPIWSDDServiceName(java.lang.String name) {
        IJavaRpcAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.IJavaRpcAPI getIJavaRpcAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IJavaRpcAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIJavaRpcAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.IJavaRpcAPI getIJavaRpcAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.IJavaRpcAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IJavaRpcAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getIJavaRpcAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIJavaRpcAPIEndpointAddress(java.lang.String address) {
        IJavaRpcAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.IJavaRpcAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.IJavaRpcAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IJavaRpcAPISoapBindingStub(new java.net.URL(IJavaRpcAPI_address), this);
                _stub.setPortName(getIJavaRpcAPIWSDDServiceName());
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
        if ("IJavaRpcAPI".equals(inputPortName)) {
            return getIJavaRpcAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IJavaRpcAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IJavaRpcAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IJavaRpcAPI".equals(portName)) {
            setIJavaRpcAPIEndpointAddress(address);
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
