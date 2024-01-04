/**
 * ISystemToolsAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.api;


/**
 * System maintenance interface.
 * @deprecated Use WS-I webservice gw.wsi.pl.SystemToolsAPI instead.
 */
public interface ISystemToolsAPI extends java.rmi.Remote {

    /**
     * Cancel the update stats process if running. Please use getUpdateStatsState()
     * to check on the state of the run.
     * <br>
 * @deprecated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void cancelUpdateStats() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Check the consistency of the underlying physical database.
     * <br>
 * @deprecated
     * @param returnAllResults true - DBConsistencyCheckResult is returned for every check
false - DBConsistencyCheckResults returned only for failures.
     * @return DBConsistencyCheckResult[] Describes results of consistency checks
(All checks if returnAllResults=true, otherwise all failures.)
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.DBConsistencyCheckResult[] checkDatabaseConsistency(boolean returnAllResults) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Run a subset of the consistency checks on the underlying physical
     * database.
     * <br>
 * @deprecated
     * @param returnAllResults true - DBConsistencyCheckResult is returned for every check
false - DBConsistencyCheckResults returned only for failures.
     * @param tablesToCheck null - check all tables, else array of tables names to check
     * @param consistencyCheckTypesToCheck null - check all types, else array of types to check
Must be valid <code>ConsistencyCheckType</code>s.
     * @return DBConsistencyCheckResult[]  Describes results of consistency checks
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.DBConsistencyCheckResult[] checkPartialDatabaseConsistency(boolean returnAllResults, java.lang.String[] tablesToCheck, java.lang.String[] consistencyCheckTypesToCheck) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Returns all server session information.  The session information
     * is returned as an array of SessionData objects,
     * each of which contains the user's name, ID, and session ID for a session
     * that's currently open.
     * <br>
 * @deprecated
     * @return all server session information.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.SessionData[] getActiveSessionData() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Returns the state of the consistency checks process. Only one
     * set of consistency checks can be running at
     * any given moment.
     * <br>
 * @deprecated
     * @return the state of the consistency checks process
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.enumeration.WorkItemSetState getDBCCState() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Gets the highest run level of the cluster.  See the definition
     * of the run level constants for details of how to
     * interpret this value.
     * <br>
 * @deprecated
     * @return An int containing the highest runlevel of the cluster.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.enumeration.SystemRunlevel getHighestRunlevel() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Get a list of all of the logger categories available in the
     * system. These can be used
     * directly in logging.properties.
     * <br>
 * @deprecated
     * @return An array of Strings containing all logger categories in the system
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String[] getLoggingCategories() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Retrieve the latest N Oracle AWR snapshots.
     * <br>
 * @deprecated
     * @param numSnapshots Number of snapshots to retrieve.
     * @return String[]                    Requested AWR snapshot information
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.DatabaseSnapshotInfo[] getRecentAWRSnapshotInfo(int numSnapshots) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Gets the run level of the server.  See the definition of the
     * run level constants for details of how to interpret
     * this value.
     * <br>
 * @deprecated
     * @return An int containing the runlevel
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.enumeration.SystemRunlevel getRunlevel() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Checks whether the update stats process is currently running.
     * Only one set of update stats statements can be
     * Returns the state of the update stats process. Only one update stats
     * process can be running at
     * any given moment.
     * <br>
 * @deprecated
     * @return the state of the update stats process
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.enumeration.WorkItemSetState getUpdateStatsState() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Get the version of the server, including application version
     * and schema version.
     * The application version is in the format: <tt>[major].[minor].[build]</tt>.
     * The scheme version is in the format: <tt>[base].[vertical]</tt>.
     * <br>
 * @deprecated
     * @return Version of the server, including application version and schema version.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ServerVersion getVersion() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Recalculates the file checksums used for clustered configuration
     * verification.  Returns true
     * if checksums were recalcuted and false if clustering or configuration
     * verification were disabled.
     * <br>
 * @deprecated
     * @return <code>true</code> if checksums were recalcuted and <code>false</code> if clustering or configuration verification were disabled.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public boolean recalculateFileChecksums() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Causes a reload of the logging.properties.
     * <br>
 * @deprecated
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void reloadLoggingConfig() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Creates a report of the state of the database catalog statistics
     * for all tables.
     * <br>
 * @deprecated
     * @return a zip file of an HTML report to view the database catalog statistics.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public byte[] reportDatabaseCatalogStatistics() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Creates a report of the state of the database catalog statistics
     * for all tables.
     * <br>
 * @deprecated
     * @param tables null - report on all tables, else array of tables names to on which to report
     * @param stagingTables null - report on all staging tables, else array of staging tables names to on which to report
     * @param typelistTables null - report on all typelist tables, else array of typelist tables names to on which to report
     * @return a zip file of an HTML report to view the database catalog statistics on the selected tables.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public byte[] reportPartialDatabaseCatalogStatistics(java.lang.String[] tables, java.lang.String[] stagingTables, java.lang.String[] typelistTables) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Sets the run level of the server. If the server is currently
     * undergoing a runlevel change, this method will block
     * until that level change has completed.
     * <p/>
     * The valid run levels that the server can be set to through this method
     * are <code>SystemRunlevel.GW_DB_MAINTENANCE</code>,
     * <code>SystemRunlevel.GW_MAINTENANCE</code>, and <code>SystemRunlevel.GW_MULTIUSER</code>.
     * See the definitions of those constants
     * for more information.
     * <br>
 * @deprecated
     * @param runLevel The level at which the server should run.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void setRunlevel(com.guidewire.ab.webservices.enumeration.SystemRunlevel runLevel) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Submit the Oracle AWR Performance Report batch job
     * <br>
 * @deprecated
     * @param awrReportUserSettings All the settings to run the AWR report
     * @return ProcessID  pid of batch job
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessID submitAwrReportBatchJob(com.guidewire.ab.webservices.entity.AWRReportUserSettings awrReportUserSettings) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Submit the consistency checks batch job on the underlying physical
     * database.
     * <br>
 * @deprecated
     * @param tablesToCheck null - check all tables, else array of tables names to check
     * @param consistencyCheckTypesToCheck null - check all types, else array of types to check
Must be valid <code>ConsistencyCheckType</code>s.
     * @return ProcessID  Describes results of consistency checks
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessID submitDBCCBatchJob(java.lang.String[] tablesToCheck, java.lang.String[] consistencyCheckTypesToCheck) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Submit the SQL Server DMV Performance Report batch job using
     * defaults values for
     * includeDatabaseStatistics (true)
     * <br>
 * @deprecated
     * @return ProcessID  pid of batch job
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessID submitDmvReportBatchJob() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Submit the SQL Server DMV Performance Report batch job with
     * parameters.
     * <br>
 * @deprecated
     * @param includeDatabaseStatistics The default is true.
     * @return ProcessID  pid of batch job
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public com.guidewire.ab.webservices.entity.ProcessID submitDmvReportBatchJobWithParams(boolean includeDatabaseStatistics) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Run the update stats process on the underlying physical database.
     * Please use isUpdateStatsRunning() to check on
     * the state of the run.
     * <br>
 * @deprecated
     * @param description null - Description of the job
     * @param incremental true: the process should perform an incremental update; false: the process should perform a full upgrade
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.SOAPException 
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void submitUpdateStats(java.lang.String description, boolean incremental) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.SOAPException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Dynamically updates the logging level of the given logger.
     * <br>
 * @deprecated
     * @param logger The name of the logger to be updated - this should be a qualified class or package
     * @param level One of 5 possible logging levels: INFO, DEBUG, WARN, ERROR, TRACE
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.RequiredFieldException If the logger field is null.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public void updateLoggingLevel(java.lang.String logger, java.lang.String level) throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.RequiredFieldException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;

    /**
     * Verify that the data mode matches the physical database
     * <br>
 * @deprecated
     * @return String[] Any differences between the data model and the physical database.
     * @throws com.guidewire.ab.webservices.fault.ServerStateException Thrown when a request is made at a time the server is in a state that disallows the request.
     * @throws com.guidewire.ab.webservices.fault.SOAPServerException 
     * @throws com.guidewire.ab.webservices.fault.PermissionException Thrown when the authenticated SOAP user does not have permission to perform the requested operation
     * @throws com.guidewire.ab.webservices.fault.BadIdentifierException Thrown when an internal public ID doesn't map to a real bean (problem could be that type was incorrect)
     * @throws java.rmi.RemoteException if a communication error occurs
     */
    public java.lang.String[] verifyDatabaseSchema() throws java.rmi.RemoteException, com.guidewire.ab.webservices.fault.ServerStateException, com.guidewire.ab.webservices.fault.SOAPServerException, com.guidewire.ab.webservices.fault.PermissionException, com.guidewire.ab.webservices.fault.BadIdentifierException;
}
