/**
 * ITableImportAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;

public interface ITableImportAPIService extends javax.xml.rpc.Service {

/**
 * This interface provides methods for integrity checking and loading
 * data via
 * the  staging tables.
 * <p/>
 * In particular, it allows the caller to instruct the server
 * to perform the following staging table operations:
 * <ol>
 * <li>Clear error table.</li>
 * <li>Clear exclusion table.</li>
 * <li>Clear staging tables.</li>
 * <li>Delete rows from staging tables based on contents of exclusion
 * table.</li>
 * <li>Populate exclusion table with rows to be excluded.</li>
 * <li>Integrity check the contents of the staging tables.</li>
 * <li>Integrity check the contents of the Zone staging tables and load
 * Zone source tables if no errors.</li>
 * <li>Integrity check the contents of the staging tables and load source
 * tables if no errors.</li>
 * </ol>
 * @deprecated Use WS-I webservice gw.wsi.pl.TableImportAPI instead.
 */
    public java.lang.String getITableImportAPIAddress();

    public com.guidewire.ab.webservices.api.ITableImportAPI getITableImportAPI() throws javax.xml.rpc.ServiceException;

    public com.guidewire.ab.webservices.api.ITableImportAPI getITableImportAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
