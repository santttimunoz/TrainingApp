/**
 * ITableImportAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


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
public interface ITableImportAPI extends java.rmi.Remote {

    /**
     * Instructs the server to clear the error tables.
     * <br>
 * @deprecated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void clearErrorTable() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the  server to clear the exclusion table.
     * <br>
 * @deprecated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void clearExclusionTable() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the server to clear all staging tables.
     * <br>
 * @deprecated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void clearStagingTables() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the server to delete rows from staging tables
     * based on the contents of the exclusion table (delete all rows in all
     * staging tables where the LUWID matches a LUWID in the exclusion table.)
     * <br>
 * @deprecated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void deleteExcludedRowsFromStagingTables() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the server to delete rows from staging tables
     * based on the contents of the exclusion table (delete all rows in all
     * staging tables where the LUWID matches a LUWID in the exclusion table.)
     * <p/>
     * The same as deleteExcludedRowsFromStagingTables except that the operation
     * is done asynchronously in a batch process.  Note that this batch process
     * can't be terminated.
     * <br>
 * @deprecated
     * @return a ProcessID that can be used to retrieve the status of the job
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessID deleteExcludedRowsFromStagingTablesAsBatchProcess() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Encrypt columns configured to be encrypted in the staging tables
     * <br>
 * @deprecated
     * @return The number of staging tables whose columns were encrypted
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public int encryptDataOnStagingTables() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the  server to check the integrity of the contents
     * of the staging
     * tables, inserting details about any failures into the load error tables.
     * <br>
 * @deprecated
     * @param clearErrorTable If true, the load error tables will be cleared
before executing integrity checking (defaults to true if this parameter is null).
     * @param populateExclusionTable If true, populate exclusion table with any newly
excluded rows before executing integrity checking (defaults to true if this parameter
is null).
     * @param allowRefsToExistingNonAdminRows If true, rows in the staging tables are allowed to reference
existing rows in any table, regardless of whether or not the tables
are admin tables.
     * @return a TableImportResult object containing load error information and
any raised exception.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.TableImportResult integrityCheckStagingTableContents(java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean allowRefsToExistingNonAdminRows) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the server to check the integrity of the contents
     * of the staging
     * tables, inserting details about any failures into the error tables.
     * If no integrity check
     * errors are detected, the server will load the source tables (the main
     * application
     * tables) with the contents of the staging tables.
     * <br>
 * @deprecated
     * @param clearErrorTable If true, the load error tables will be cleared
before executing integrity checking (defaults to true if this parameter is null).
     * @param populateExclusionTable If true, populate exclusion table with any newly
excluded rows before executing integrity checking (defaults to true if this parameter
is null).
     * @param updateDBStatisticsWithEstimates If true, then update the database statistics on any table that will be loaded with
estimated changes based on the contents of the associated staging table.  When
loading large amounts of data which will cause a source table to grow significantly, the optimizer could choose
a bad query plan based on the existing state of the database statistics unless the loader updates the database
statistics to reflect the expected size of the table after the load has completed.  This
parameter is only meaningful when running against Oracle.
     * @param allowRefsToExistingNonAdminRows If true, rows in the staging tables are allowed to reference
existing rows in any table, regardless of whether or not the tables
are admin tables.
     * @return a TableImportResult object containing load error information and
any raised exception.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.TableImportResult integrityCheckStagingTableContentsAndLoadSourceTables(java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Boolean allowRefsToExistingNonAdminRows) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the server to check the integrity of the contents
     * of the staging
     * tables, inserting details about any failures into the load error tables.
     * If no integrity check
     * errors are detected, the server will load the source tables (the main
     * application
     * tables) with the contents of the staging tables.  This method does
     * the load asynchronously
     * via the batch process mechanism, and the process ID that is returned
     * can be used to query
     * the status of the load and find out if it succeeded or failed (or
     * is still running).  After
     * completion, the process status will indicate whether or not the load
     * succeeded, and the
     * failedOps field will contain the number of validation errors that
     * occurred (if any).  Note that this batch process
     * can't be terminated.
     * <br>
 * @deprecated
     * @param clearErrorTable If true, the load error tables will be cleared
before executing integrity checking (defaults to true if this parameter is null).
     * @param populateExclusionTable If true, populate exclusion table with any newly
excluded rows before executing integrity checking (defaults to true if this parameter
is null).
     * @param updateDBStatisticsWithEstimates If true, then update the database statistics on any table that will be loaded with
estimated changes based on the contents of the associated staging table.  When
loading large amounts of data which will cause a source table to grow significantly, the optimizer could choose
a bad query plan based on the existing state of the database statistics unless the loader updates the database
statistics to reflect the expected size of the table after the load has completed.  This
parameter is only meaningful when running against Oracle.
     * @param allowRefsToExistingNonAdminRows If true, rows in the staging tables are allowed to reference
existing rows in any table, regardless of whether or not the tables
are admin tables.
     * @return a ProcessID that can be used to query the status of the running load
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessID integrityCheckStagingTableContentsAndLoadSourceTablesAsBatchProcess(java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates, java.lang.Boolean allowRefsToExistingNonAdminRows) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the  server to check the integrity of the contents
     * of the staging
     * tables, inserting details about any failures into the load error tables.
     * Works like
     * integrityCheckStagingTableContents, but does so in a batch process.
     * After
     * completion, the process status will indicate whether or not the load
     * succeeded, and the
     * failedOps field will contain the number of integrity check errors
     * that occurred (if any).  Note that this batch process
     * can't be terminated.
     * <br>
 * @deprecated
     * @param clearErrorTable If true, the load error tables will be cleared
before executing integrity checking (defaults to true if this parameter is null).
     * @param populateExclusionTable If true, populate exclusion table with any newly
excluded rows before executing integrity checking (defaults to true if this parameter
is null).
     * @param allowRefsToExistingNonAdminRows If true, rows in the staging tables are allowed to reference
existing rows in any table, regardless of whether or not the tables
are admin tables.
     * @return a ProcessID that can be used to retrieve the status of the job
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessID integrityCheckStagingTableContentsAsBatchProcess(java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean allowRefsToExistingNonAdminRows) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the server to check the integrity of the contents
     * of the Zone staging
     * tables, inserting details about any failures into the error tables.
     * If no integrity check
     * errors are detected, the server will load the Zone source tables (the
     * Zone main application
     * tables) with the contents of the staging tables.
     * <br>
 * @deprecated
     * @param clearErrorTable If true, the load error tables will be cleared
before executing integrity checking (defaults to true if this parameter is null).
     * @param populateExclusionTable If true, populate exclusion table with any newly
excluded rows before executing integrity checking (defaults to true if this parameter
is null).
     * @param updateDBStatisticsWithEstimates If true, then update the database statistics on any table that will be loaded with
estimated changes based on the contents of the associated staging table.  When
loading large amounts of data which will cause a source table to grow significantly, the optimizer could choose
a bad query plan based on the existing state of the database statistics unless the loader updates the database
statistics to reflect the expected size of the table after the load has completed.  This
parameter is only meaningful when running against Oracle.
     * @return a TableImportResult object containing load error information and
any raised exception.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.TableImportResult integrityCheckZoneStagingTableContentsAndLoadZoneSourceTables(java.lang.Boolean clearErrorTable, java.lang.Boolean populateExclusionTable, java.lang.Boolean updateDBStatisticsWithEstimates) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the server to populate the exclusion table
     * with rows to be excluded (add rows to the exclusion table for every
     * unique LUWID in the load error tables that is not already in the exclusion
     * table).
     * <br>
 * @deprecated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void populateExclusionTable() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the  server to populate the exclusion table
     * with rows to be excluded (add rows to the exclusion table for every
     * unique LUWID in the error tables that is not already in the exclusion
     * table).
     * <p/>
     * The same as deleteExcludedRowsFromStagingTables except that the operation
     * is done asynchronously in a batch process. Note that this batch process
     * can't be terminated.
     * <br>
 * @deprecated
     * @return a ProcessID that can be used to retrieve the status of the job
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessID populateExclusionTableAsBatchProcess() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the  server to update the database statistics on
     * the staging tables.
     * (Database statistics will not be updated on the other tables.)
     * <br>
 * @deprecated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void updateStatisticsOnStagingTables() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Instructs the  server to update the database statistics on
     * the staging tables.
     * (Database statistics will not be updated on the other tables.)  The
     * same as updateStatisticsOnStagingTables
     * except that the process will be performed asynchronously in a batch
     * process.  After completion,
     * the process status will contain the number of tables that were updated
     * in the opsCompleted field.
     * Note that this batch process can't be terminated.
     * <br>
 * @deprecated
     * @return a ProcessID that can be used to retrieve the status of the job
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessID updateStatisticsOnStagingTablesAsBatchProcess() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
