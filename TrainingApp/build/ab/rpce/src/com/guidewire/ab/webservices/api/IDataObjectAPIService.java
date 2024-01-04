/**
 * IDataObjectAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface IDataObjectAPIService extends javax.xml.rpc.Service {

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
    public java.lang.String getIDataObjectAPIAddress();

    public com.guidewire.ab.webservices.api.IDataObjectAPI getIDataObjectAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.IDataObjectAPI getIDataObjectAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
