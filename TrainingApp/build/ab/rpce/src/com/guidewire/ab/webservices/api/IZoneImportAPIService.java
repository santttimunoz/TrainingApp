/**
 * IZoneImportAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface IZoneImportAPIService extends javax.xml.rpc.Service {

/**
 * IZoneImportAPI is a remote interface to a set of tools to import
 * zone data (in csv format)
 * into the staging tables.  See documentation for the zone data csv
 * format.
 * @deprecated Use WS-I webservice gw.wsi.pl.ZoneImportAPI.
 */
    public java.lang.String getIZoneImportAPIAddress();

    public com.guidewire.ab.webservices.api.IZoneImportAPI getIZoneImportAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.IZoneImportAPI getIZoneImportAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
