/**
 * IJavaRpcAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


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
public interface IJavaRpcAPI extends java.rmi.Remote {

    /**
     * @param strServiceClass 
     * @param strMethodName 
     * @param strParamTypes 
     * @param strArgValuesArray 
     * @return 
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String call(java.lang.String strServiceClass, java.lang.String strMethodName, java.lang.String strParamTypes, java.lang.String strArgValuesArray) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
