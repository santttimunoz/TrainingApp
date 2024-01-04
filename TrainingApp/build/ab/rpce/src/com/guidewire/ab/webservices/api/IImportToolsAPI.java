/**
 * IImportToolsAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


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
public interface IImportToolsAPI extends java.rmi.Remote {

    /**
     * Convert CSV data to XML data suitable to be imported by {@link
     * #importXmlData(String)}
     * <br>
 * @deprecated
     * @param csvData A String containing CSV data
     * @param ignoreNullConstraintViolations Whether to continue after detecting an empty field in the CSV that
corresponds to a property that is not nullable.  If false, throws an exception in this situation.
     * @param ignoreAllErrors 
     * @return a String containing equivalent import data in XML format, suitable for import by #importXmlData(String)
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException If the user does not have SOAP Admin permission.
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String csvToXml(java.lang.String csvData, boolean ignoreNullConstraintViolations, boolean ignoreAllErrors) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Convert CSV data to XML data suitable to be imported {@link
     * #importXmlData(String)}
     * <br>
 * @deprecated
     * @param csvData A String containing CSV data
     * @param dataSet An int defining the number of the dataset to be imported.  Datasets are ordered by inclusion, and
the smallest dataset is always numbered 0.  Thus Dataset 0 is a subset of dataset 1, and datatset 1
is a subset of dataset 2, etc.  If this param is set to -1, all data will be imported.
     * @param ignoreNullConstraintViolations Whether to continue after detecting an empty field in the CSV that
corresponds to a property that is not nullable.  If false, throws an exception in this situation.
     * @param ignoreAllErrors 
     * @return a String containing equivalent import data in XML format, suitable for import by #importXmlData(String)
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException If the user does not have SOAP Admin permission.
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String csvToXml(java.lang.String csvData, int dataSet, boolean ignoreNullConstraintViolations, boolean ignoreAllErrors) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Import CSV data.
     * 
     * Note that importing data through this call does not generate events
     * for the newly imported objects.
     * <p>
     * <b>WARNING</b>: this is <em>only</em> supported for administrative
     * database tables (such as User)
     * because these XML import routines do not perform complete data validation
     * tests on imported data.
     * Any other use (claims, policies, etc) is dangerous and is <b>NOT</b>
     * supported
     * <br>
 * @deprecated
     * @param csvData The data to import, passed as a String.  This may not be null.
     * @param dataSet 
     * @param ignoreNullConstraintViolations 
     * @param ignoreAllErrors 
     * @return Set of results of the import (number of entities imported by type, and so on).  If the import failed,
ImportResults will have the ok flag set to <code>false</code>, and the errorLog element will
contain descriptions of the errors that were encountered.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.RequiredFieldException If csvData is null.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException If the data can't be imported because it violates duplicate key constraints, contains nulls in non-nullable fields, or otherwise can't be safely inserted into the database.
     * @throws com.guidewire.ab.webservices.fault.PermissionException If the user does not have SOAP Admin permission.
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ImportResults importCsvData(java.lang.String csvData, int dataSet, boolean ignoreNullConstraintViolations, boolean ignoreAllErrors) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.RequiredFieldException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Import XML data.
     * To improve performance, the XML data string can be wrapped with CDATA
     * tags.
     * For example:
     * <pre>&lt;![CDATA[<br>
     * ...import XML...<br>
     * ]]></pre>
     * 
     * Note that importing data through this call does not generate events
     * for the newly imported objects.
     * <p>
     * <b>WARNING</b>: this is <em>only</em> supported for administrative
     * database tables (such as User)
     * because these XML import routines do not perform complete data validation
     * tests on imported data.
     * Any other use (claims, policies, etc) is dangerous and is <b>NOT</b>
     * supported
     * <br>
 * @deprecated
     * @param xmlData The data to import, passed as a String.    This may not be null or empty.
     * @return Set of results of the import (number of entities imported by type, and so on).  If the import failed,
ImportResults will have the ok flag set to <code>false</code>, and the errorLog element will
contain descriptions of the errors that were encountered.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.RequiredFieldException If csvData is null.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException If the data can't be imported because it violates duplicate key constraints, contains nulls in non-nullable fields, or otherwise can't be safely inserted into the database.
     * @throws com.guidewire.ab.webservices.fault.PermissionException If the user does not have SOAP Admin permission.
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ImportResults importXmlData(java.lang.String xmlData) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.RequiredFieldException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Import XML data, passing the data as an array of UTF-8 bytes
     * representing the XML string.
     * To improve performance, the XML data string can be wrapped with CDATA
     * tags.
     * For example:
     * <pre>&lt;![CDATA[<br>
     * ...import XML...<br>
     * ]]></pre>
     * 
     * Note that importing data through this call does not generate events
     * for the newly imported objects.
     * <p>
     * <b>WARNING</b>: this is <em>only</em> supported for administrative
     * database tables (such as User)
     * because these XML import routines do not perform complete data validation
     * tests on imported data.
     * Any other use (claims, policies, etc) is dangerous and is <b>NOT</b>
     * supported
     * 
     * @see #importXmlData(String)
     * <br>
 * @deprecated
     * @param xmlData The data to import, passed as a byte[] for the UTF-8 bytes representing the XML string.    This may not be null or empty.
     * @return Set of results of the import (number of entities imported by type, and so on).  If the import failed,
ImportResults will have the ok flag set to <code>false</code>, and the errorLog element will
contain descriptions of the errors that were encountered.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.RequiredFieldException If csvData is null.
     * @throws com.guidewire.ab.webservices.fault.DataConversionException If the data can't be imported because it violates duplicate key constraints, contains nulls in non-nullable fields, or otherwise can't be safely inserted into the database.
     * @throws com.guidewire.ab.webservices.fault.PermissionException If the user does not have SOAP Admin permission.
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ImportResults importXmlDataAsByteArray(byte[] xmlData) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.RequiredFieldException, com.guidewire.ab.webservices.fault.DataConversionException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Rebuild the role privileges data by deleting the priviliges
     * data in the database, and then
     * re-importing the roleprivileges.csv file.
     * <br>
 * @deprecated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException If the user does not have SOAP Admin permission.
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void rebuildRolePrivileges() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Export XML data into CSV data.  The reverse operation from
     * #csvToXml(String)
     * <br>
 * @deprecated
     * @param xmlData String containing CSV data
     * @return a String containing equivalent import data in CSV format.  The result of calling csvToXml on the result
should be an equivalent XML document to #xmlData.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException If the user does not have SOAP Admin permission.
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String xmlToCsv(java.lang.String xmlData) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
