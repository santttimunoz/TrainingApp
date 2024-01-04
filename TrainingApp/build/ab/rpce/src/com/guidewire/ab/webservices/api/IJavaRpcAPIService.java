/**
 * IJavaRpcAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface IJavaRpcAPIService extends javax.xml.rpc.Service {

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
    public java.lang.String getIJavaRpcAPIAddress();

    public com.guidewire.ab.webservices.api.IJavaRpcAPI getIJavaRpcAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.IJavaRpcAPI getIJavaRpcAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
