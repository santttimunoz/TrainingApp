
package extensions.ab.batchprocessing.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.batchprocessing.typekey.BatchProcessType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class BatchProcessTypeExtConstants {

    /**
     * AB Contact Score Aggregator
     * Calculates aggregate review scores for ABContacts from submitted ReviewSummaries.
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_ABCONTACTSCORING = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "ABContactScoring");
    /**
     * AB Geocode Writer
     * Geocoding ABAddresses queue writer.
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_ABGEOCODE = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "ABGeocode");
    /**
     * Activity Escalation
     * Activity escalation monitor
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_ACTIVITYESC = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "ActivityEsc");
    /**
     * Archiving Item Writer
     * Identify archiving work and create work items.
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_ARCHIVE = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "Archive");
    /**
     * BulkPurge
     * Purge records through table updates
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_BULKPURGE = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "BulkPurge");
    /**
     * ContactAutoSync
     * Automatically synchronize the local contact that are out of syn and marked 'allow' auto-sync.
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_CONTACTAUTOSYNC = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "ContactAutoSync");
    /**
     * Database Consistency Check
     * Database consistency checks
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_DBCONSISTENCYCHECK = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "DBConsistencyCheck");
    /**
     * Database Statistics
     * Database statistics
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_DBSTATS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "DBStats");
    /**
     * Data Distribution
     * Data distribution for the database
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_DATADISTRIBUTION = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "DataDistribution");
    /**
     * DeferredUpgradeTasks
     * Execute database upgrade tasks that were deferred
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_DEFERREDUPGRADETASKS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "DeferredUpgradeTasks");
    /**
     * Duplicate Contacts Finder
     * Finds new duplicate contacts and creates a browsable list of said contacts.
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_DUPLICATECONTACTS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "DuplicateContacts");
    /**
     * Flag Overdue Legal Reports
     * Flag Overdue Legal Reports
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_FLAGOVERDUELEGALREPORTS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "FlagOverdueLegalReports");
    /**
     * Geocode Writer
     * Geocoding Addresses queue writer.
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_GEOCODE = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "Geocode");
    /**
     * Group Exception
     * Group exception Monitor
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_GROUPEXCEPTION = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "GroupException");
    /**
     * Microsoft DMV Report
     * Microsoft database DMV performance report generation
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_MSDMVREPORT = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "MSDMVReport");
    /**
     * Oracle AWR Report
     * Oracle database AWR performance report generation
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_ORAAWRREPORT = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "OraAWRReport");
    /**
     * Phone number normalizer
     * Performs a normalization of phone numbers contact
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_PHONENUMBERNORMALIZER = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "PhoneNumberNormalizer");
    /**
     * Populate searchColumn columns
     * Populate searchColumn columns from their original sources.
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_POPULATESEARCHCOLUMNS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "PopulateSearchColumns");
    /**
     * Process Completion Monitor
     * Invoke plugin on completion of monitored worker queue
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_PROCESSCOMPLETIONMONITOR = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "ProcessCompletionMonitor");
    /**
     * ProcessHistoryPurge
     * Purge batch process history data
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_PROCESSHISTORYPURGE = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "ProcessHistoryPurge");
    /**
     * Purge Cluster Members
     * Purge old ClusterMember entities
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_PURGECLUSTERMEMBERS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "PurgeClusterMembers");
    /**
     * Purge Failed Work Items
     * Purge failed work items from all queues.
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_PURGEFAILEDWORKITEMS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "PurgeFailedWorkItems");
    /**
     * Purge Profiler Data
     * Purge profiler data at regular intervals
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_PURGEPROFILERDATA = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "PurgeProfilerData");
    /**
     * Purge old transaction ids
     * Purge external transaction id that no longer need to be tracked, by age.
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_PURGETRANSACTIONIDS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "PurgeTransactionIds");
    /**
     * Purge Workflow Logs
     * Purge completed workflows logs, this executes gw.processes.PurgeWorkflowLogs.gs
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_PURGEWORKFLOWLOGS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "PurgeWorkflowLogs");
    /**
     * Purge Workflow
     * Purge completed workflows after resetting any referenced workflows, this executes gw.processes.PurgeWorkflow.gs
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_PURGEWORKFLOWS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "PurgeWorkflows");
    /**
     * Staging Table Delete Excluded Rows
     * Asynchronous deletion of excluded rows from staging tables
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_STDELETEEXCLUDED = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "STDeleteExcluded");
    /**
     * Staging Table Encryption
     * Asynchronous encryption of staging table data
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_STENCRYPT = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "STEncrypt");
    /**
     * Staging Table Integrity Check
     * Asynchronous integrity check of staging tables
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_STINTEGRITYCHECK = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "STIntegrityCheck");
    /**
     * Staging Table Load
     * Asynchronous integrity check and load of staging tables
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_STLOAD = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "STLoad");
    /**
     * Staging Table Populate Exclusion Table
     * Asynchronous population of the exclusion tables
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_STPOPEXCLUDED = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "STPopExcluded");
    /**
     * Staging Table Statistics
     * Asynchronous update of staging table statistics
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_STSTATISTICS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "STStatistics");
    /**
     * Stat Report Writer
     * Stat Report work queue writer
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_STATREPORT = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "StatReport");
    /**
     * Statistics
     * Statistics calculator
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_STATISTICS = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "Statistics");
    /**
     * Unknown
     * Unknown value for BatchProcessType
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_UNKNOWN = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "Unknown");
    /**
     * Update MatchSetKey
     * Updates the MatchSetKey for all contacts
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_UPDATEMATCHSETKEY = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "UpdateMatchSetKey");
    /**
     * User Exception
     * User exception Monitor
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_USEREXCEPTION = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "UserException");
    /**
     * Verify Minimum Criteria
     * Verifies the minimum creation criteria for all staging table loaded contacts.
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_VERIFYMINIMUMCRITERIA = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "VerifyMinimumCriteria");
    /**
     * WorkItemSetPurge
     * Purge WorkItemSet data
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_WORKITEMSETPURGE = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "WorkItemSetPurge");
    /**
     * WorkQueueInstrumentationPurge
     * Purge instrumentation data for work queues
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_WORKQUEUEINSTRUMENTATIONPURGE = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "WorkQueueInstrumentationPurge");
    /**
     * Workflow Writer
     * Workflows work queue writer.
     * 
     */
    public final static TypeKeyReference<BatchProcessType> TC_WORKFLOW = new TypeKeyCache<BatchProcessType>(BatchProcessType.TYPE, "Workflow");

}
