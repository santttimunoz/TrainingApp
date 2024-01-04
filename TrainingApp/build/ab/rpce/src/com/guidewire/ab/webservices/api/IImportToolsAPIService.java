/**
 * IImportToolsAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface IImportToolsAPIService extends javax.xml.rpc.Service {

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
    public java.lang.String getIImportToolsAPIAddress();

    public com.guidewire.ab.webservices.api.IImportToolsAPI getIImportToolsAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.IImportToolsAPI getIImportToolsAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
