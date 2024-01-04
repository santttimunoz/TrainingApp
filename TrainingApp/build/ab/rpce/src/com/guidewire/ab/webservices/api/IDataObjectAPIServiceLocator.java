/**
 * IDataObjectAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public class IDataObjectAPIServiceLocator extends org.apache.axis.client.Service implements com.guidewire.ab.webservices.api.IDataObjectAPIService {

/**
 * Deprecated interface. There is no replacement. Instead, you should
 * write your own Gosu class and publish
 * it as a web service by marking it with the <code>@RpcWebService</code>
 * annotation.
 * <p/>
 * Methods in this class use XPath.  The notation draws heavily from
 * the new "Service Data Object" spec from BEA and IBM. See their
 * <a href="http://xml.coverpages.org/IBM-BEA-SDOv10.pdf">Service Data
 * Ojbects</a>
 * specification.
 * Please note that certain characters need to be escaped in XPath notation.
 * Specifically:
 * ' goes to &apos; <br/>
 * " goes to &qout; <br/>
 * < goes to &lt; <br/>
 * > goes to &gt; <br/>
 * & goes to &amp;  <br/>
 * 
 * @author mshaw
 * @version Jan 16, 2004 4:15:21 PM
 * @deprecated Write your own Gosu class and publish it as a web service.
 */

    public IDataObjectAPIServiceLocator() {
    }


    public IDataObjectAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IDataObjectAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IDataObjectAPI
    private java.lang.String IDataObjectAPI_address = "http://dontuse.defaultvalue.com/IDataObjectAPI";

    public java.lang.String getIDataObjectAPIAddress() {
        return IDataObjectAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IDataObjectAPIWSDDServiceName = "IDataObjectAPI";

    public java.lang.String getIDataObjectAPIWSDDServiceName() {
        return IDataObjectAPIWSDDServiceName;
    }

    public void setIDataObjectAPIWSDDServiceName(java.lang.String name) {
        IDataObjectAPIWSDDServiceName = name;
    }

    public com.guidewire.ab.webservices.api.IDataObjectAPI getIDataObjectAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IDataObjectAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIDataObjectAPI(endpoint);
    }

    public com.guidewire.ab.webservices.api.IDataObjectAPI getIDataObjectAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.guidewire.ab.webservices.api.IDataObjectAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IDataObjectAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getIDataObjectAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIDataObjectAPIEndpointAddress(java.lang.String address) {
        IDataObjectAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.guidewire.ab.webservices.api.IDataObjectAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.guidewire.ab.webservices.api.IDataObjectAPISoapBindingStub _stub = new com.guidewire.ab.webservices.api.IDataObjectAPISoapBindingStub(new java.net.URL(IDataObjectAPI_address), this);
                _stub.setPortName(getIDataObjectAPIWSDDServiceName());
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
        if ("IDataObjectAPI".equals(inputPortName)) {
            return getIDataObjectAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IDataObjectAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.webservices.ab.guidewire.com/", "IDataObjectAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IDataObjectAPI".equals(portName)) {
            setIDataObjectAPIEndpointAddress(address);
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
