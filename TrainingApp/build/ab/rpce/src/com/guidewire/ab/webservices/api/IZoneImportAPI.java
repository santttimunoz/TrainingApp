/**
 * IZoneImportAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


/**
 * IZoneImportAPI is a remote interface to a set of tools to import
 * zone data (in csv format)
 * into the staging tables.  See documentation for the zone data csv
 * format.
 * @deprecated Use WS-I webservice gw.wsi.pl.ZoneImportAPI.
 */
public interface IZoneImportAPI extends java.rmi.Remote {

    /**
     * Clears the production tables that contain zone data in preparation
     * for
     * zone data to be imported from the staging tables via the Table Import
     * Tools.
     * This should be called after the staging tables have gone through an
     * integrity check
     * and any offending rows are excluded/corrected.
     * <br>
 * @deprecated
     * @param countryCode a valid country code that has a zone configuartion defined or null.  A null value here will clear all zone information.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the country code is not null and does not have a zone configuration defined or does not correspond to a valid country.
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void clearProductionTables(java.lang.String countryCode) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Clears the staging tables tables that contain zone data in
     * preparation for
     * zone data to be imported to the staging tables.  If countryCode is
     * specified
     * and is a valid value, only rows for that country are cleared.
     * <br>
 * @deprecated
     * @param countryCode a valid country code or null. A null value here will clear all zone information.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the country code is not null and does not have a zone configuration defined or does not correspond to a valid country.
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void clearStagingTables(java.lang.String countryCode) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Import csv formatted data containg zone information.  See the
     * documentation
     * for details of the expected csv format.
     * This gives you the option of clearing out the staging tables before
     * loading the data.
     * <br>
 * @deprecated
     * @param countryCode the code for the country to which this data belongs
     * @param zoneData The data to import, passed as a String.
     * @param clearStaging Clears the staging tables before doing the import, this only clears the staging
tables of the data for the specified country, if all data needs to be cleared, use table import instead
     * @return 
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException If the country code is not null and does not have a zone configuration defined or does not correspond to a valid country.
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public int importToStaging(java.lang.String countryCode, java.lang.String zoneData, boolean clearStaging) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
