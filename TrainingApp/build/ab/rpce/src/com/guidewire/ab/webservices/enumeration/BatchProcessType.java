/**
 * BatchProcessType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Types of batch processes
 */
public class BatchProcessType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BatchProcessType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_FlagOverdueLegalReports;
    private static java.lang.String _TC_ActivityEsc;
    private static java.lang.String _TC_Archive;
    private static java.lang.String _TC_BulkPurge;
    private static java.lang.String _TC_ContactAutoSync;
    private static java.lang.String _TC_DataDistribution;
    private static java.lang.String _TC_DBConsistencyCheck;
    private static java.lang.String _TC_DBStats;
    private static java.lang.String _TC_DeferredUpgradeTasks;
    private static java.lang.String _TC_GroupException;
    private static java.lang.String _TC_MSDMVReport;
    private static java.lang.String _TC_OraAWRReport;
    private static java.lang.String _TC_PhoneNumberNormalizer;
    private static java.lang.String _TC_PopulateSearchColumns;
    private static java.lang.String _TC_ProcessCompletionMonitor;
    private static java.lang.String _TC_ProcessHistoryPurge;
    private static java.lang.String _TC_PurgeClusterMembers;
    private static java.lang.String _TC_PurgeFailedWorkItems;
    private static java.lang.String _TC_PurgeTransactionIds;
    private static java.lang.String _TC_PurgeProfilerData;
    private static java.lang.String _TC_PurgeWorkflows;
    private static java.lang.String _TC_PurgeWorkflowLogs;
    private static java.lang.String _TC_STDeleteExcluded;
    private static java.lang.String _TC_STEncrypt;
    private static java.lang.String _TC_STIntegrityCheck;
    private static java.lang.String _TC_STLoad;
    private static java.lang.String _TC_STPopExcluded;
    private static java.lang.String _TC_STStatistics;
    private static java.lang.String _TC_StatReport;
    private static java.lang.String _TC_Statistics;
    private static java.lang.String _TC_UserException;
    private static java.lang.String _TC_VerifyMinimumCriteria;
    private static java.lang.String _TC_Workflow;
    private static java.lang.String _TC_WorkItemSetPurge;
    private static java.lang.String _TC_WorkQueueInstrumentationPurge;
    private static java.lang.String _TC_ABContactScoring;
    private static java.lang.String _TC_ABGeocode;
    private static java.lang.String _TC_DuplicateContacts;
    private static java.lang.String _TC_Geocode;
    private static java.lang.String _TC_Unknown;
    private static java.lang.String _TC_UpdateMatchSetKey;

/**
 * Flag Overdue Legal Reports
 */
    public static BatchProcessType TC_FlagOverdueLegalReports;

/**
 * Activity escalation monitor
 */
    public static BatchProcessType TC_ActivityEsc;

/**
 * Identify archiving work and create work items.
 */
    public static BatchProcessType TC_Archive;

/**
 * Purge records through table updates
 */
    public static BatchProcessType TC_BulkPurge;

/**
 * Automatically synchronize the local contact that are out of syn
 * and marked 'allow' auto-sync.
 */
    public static BatchProcessType TC_ContactAutoSync;

/**
 * Data distribution for the database
 */
    public static BatchProcessType TC_DataDistribution;

/**
 * Database consistency checks
 */
    public static BatchProcessType TC_DBConsistencyCheck;

/**
 * Database statistics
 */
    public static BatchProcessType TC_DBStats;

/**
 * Execute database upgrade tasks that were deferred
 */
    public static BatchProcessType TC_DeferredUpgradeTasks;

/**
 * Group exception Monitor
 */
    public static BatchProcessType TC_GroupException;

/**
 * Microsoft database DMV performance report generation
 */
    public static BatchProcessType TC_MSDMVReport;

/**
 * Oracle database AWR performance report generation
 */
    public static BatchProcessType TC_OraAWRReport;

/**
 * Performs a normalization of phone numbers contact
 */
    public static BatchProcessType TC_PhoneNumberNormalizer;

/**
 * Populate searchColumn columns from their original sources.
 */
    public static BatchProcessType TC_PopulateSearchColumns;

/**
 * Invoke plugin on completion of monitored worker queue
 */
    public static BatchProcessType TC_ProcessCompletionMonitor;

/**
 * Purge batch process history data
 */
    public static BatchProcessType TC_ProcessHistoryPurge;

/**
 * Purge old ClusterMember entities
 */
    public static BatchProcessType TC_PurgeClusterMembers;

/**
 * Purge failed work items from all queues.
 */
    public static BatchProcessType TC_PurgeFailedWorkItems;

/**
 * Purge external transaction id that no longer need to be tracked,
 * by age.
 */
    public static BatchProcessType TC_PurgeTransactionIds;

/**
 * Purge profiler data at regular intervals
 */
    public static BatchProcessType TC_PurgeProfilerData;

/**
 * Purge completed workflows after resetting any referenced workflows,
 * this executes gw.processes.PurgeWorkflow.gs
 */
    public static BatchProcessType TC_PurgeWorkflows;

/**
 * Purge completed workflows logs, this executes gw.processes.PurgeWorkflowLogs.gs
 */
    public static BatchProcessType TC_PurgeWorkflowLogs;

/**
 * Asynchronous deletion of excluded rows from staging tables
 */
    public static BatchProcessType TC_STDeleteExcluded;

/**
 * Asynchronous encryption of staging table data
 */
    public static BatchProcessType TC_STEncrypt;

/**
 * Asynchronous integrity check of staging tables
 */
    public static BatchProcessType TC_STIntegrityCheck;

/**
 * Asynchronous integrity check and load of staging tables
 */
    public static BatchProcessType TC_STLoad;

/**
 * Asynchronous population of the exclusion tables
 */
    public static BatchProcessType TC_STPopExcluded;

/**
 * Asynchronous update of staging table statistics
 */
    public static BatchProcessType TC_STStatistics;

/**
 * Stat Report work queue writer
 */
    public static BatchProcessType TC_StatReport;

/**
 * Statistics calculator
 */
    public static BatchProcessType TC_Statistics;

/**
 * User exception Monitor
 */
    public static BatchProcessType TC_UserException;

/**
 * Verifies the minimum creation criteria for all staging table loaded
 * contacts.
 */
    public static BatchProcessType TC_VerifyMinimumCriteria;

/**
 * Will execute the workflow writer.
 */
    public static BatchProcessType TC_Workflow;

/**
 * Purge WorkItemSet data
 */
    public static BatchProcessType TC_WorkItemSetPurge;

/**
 * Purge instrumentation data for work queues
 */
    public static BatchProcessType TC_WorkQueueInstrumentationPurge;

/**
 * Calculates aggregate review scores for ABContacts from submitted
 * ReviewSummaries.
 */
    public static BatchProcessType TC_ABContactScoring;

/**
 * Geocoding ABAddresses queue writer.
 */
    public static BatchProcessType TC_ABGeocode;

/**
 * Finds new duplicate contacts and creates a browsable list of said
 * contacts.
 */
    public static BatchProcessType TC_DuplicateContacts;

/**
 * Geocoding Addresses queue writer.
 */
    public static BatchProcessType TC_Geocode;

/**
 * Unknown value for BatchProcessType
 */
    public static BatchProcessType TC_Unknown;

/**
 * Updates the MatchSetKey for all contacts
 */
    public static BatchProcessType TC_UpdateMatchSetKey;

    private static void initValues0() {
      _TC_FlagOverdueLegalReports = "TC_FlagOverdueLegalReports";
      TC_FlagOverdueLegalReports = new BatchProcessType(_TC_FlagOverdueLegalReports);
      _TC_ActivityEsc = "TC_ActivityEsc";
      TC_ActivityEsc = new BatchProcessType(_TC_ActivityEsc);
      _TC_Archive = "TC_Archive";
      TC_Archive = new BatchProcessType(_TC_Archive);
      _TC_BulkPurge = "TC_BulkPurge";
      TC_BulkPurge = new BatchProcessType(_TC_BulkPurge);
      _TC_ContactAutoSync = "TC_ContactAutoSync";
      TC_ContactAutoSync = new BatchProcessType(_TC_ContactAutoSync);
      _TC_DataDistribution = "TC_DataDistribution";
      TC_DataDistribution = new BatchProcessType(_TC_DataDistribution);
      _TC_DBConsistencyCheck = "TC_DBConsistencyCheck";
      TC_DBConsistencyCheck = new BatchProcessType(_TC_DBConsistencyCheck);
      _TC_DBStats = "TC_DBStats";
      TC_DBStats = new BatchProcessType(_TC_DBStats);
      _TC_DeferredUpgradeTasks = "TC_DeferredUpgradeTasks";
      TC_DeferredUpgradeTasks = new BatchProcessType(_TC_DeferredUpgradeTasks);
      _TC_GroupException = "TC_GroupException";
      TC_GroupException = new BatchProcessType(_TC_GroupException);
      _TC_MSDMVReport = "TC_MSDMVReport";
      TC_MSDMVReport = new BatchProcessType(_TC_MSDMVReport);
      _TC_OraAWRReport = "TC_OraAWRReport";
      TC_OraAWRReport = new BatchProcessType(_TC_OraAWRReport);
      _TC_PhoneNumberNormalizer = "TC_PhoneNumberNormalizer";
      TC_PhoneNumberNormalizer = new BatchProcessType(_TC_PhoneNumberNormalizer);
      _TC_PopulateSearchColumns = "TC_PopulateSearchColumns";
      TC_PopulateSearchColumns = new BatchProcessType(_TC_PopulateSearchColumns);
      _TC_ProcessCompletionMonitor = "TC_ProcessCompletionMonitor";
      TC_ProcessCompletionMonitor = new BatchProcessType(_TC_ProcessCompletionMonitor);
      _TC_ProcessHistoryPurge = "TC_ProcessHistoryPurge";
      TC_ProcessHistoryPurge = new BatchProcessType(_TC_ProcessHistoryPurge);
      _TC_PurgeClusterMembers = "TC_PurgeClusterMembers";
      TC_PurgeClusterMembers = new BatchProcessType(_TC_PurgeClusterMembers);
      _TC_PurgeFailedWorkItems = "TC_PurgeFailedWorkItems";
      TC_PurgeFailedWorkItems = new BatchProcessType(_TC_PurgeFailedWorkItems);
      _TC_PurgeTransactionIds = "TC_PurgeTransactionIds";
      TC_PurgeTransactionIds = new BatchProcessType(_TC_PurgeTransactionIds);
      _TC_PurgeProfilerData = "TC_PurgeProfilerData";
      TC_PurgeProfilerData = new BatchProcessType(_TC_PurgeProfilerData);
      _TC_PurgeWorkflows = "TC_PurgeWorkflows";
      TC_PurgeWorkflows = new BatchProcessType(_TC_PurgeWorkflows);
      _TC_PurgeWorkflowLogs = "TC_PurgeWorkflowLogs";
      TC_PurgeWorkflowLogs = new BatchProcessType(_TC_PurgeWorkflowLogs);
      _TC_STDeleteExcluded = "TC_STDeleteExcluded";
      TC_STDeleteExcluded = new BatchProcessType(_TC_STDeleteExcluded);
      _TC_STEncrypt = "TC_STEncrypt";
      TC_STEncrypt = new BatchProcessType(_TC_STEncrypt);
      _TC_STIntegrityCheck = "TC_STIntegrityCheck";
      TC_STIntegrityCheck = new BatchProcessType(_TC_STIntegrityCheck);
      _TC_STLoad = "TC_STLoad";
      TC_STLoad = new BatchProcessType(_TC_STLoad);
      _TC_STPopExcluded = "TC_STPopExcluded";
      TC_STPopExcluded = new BatchProcessType(_TC_STPopExcluded);
      _TC_STStatistics = "TC_STStatistics";
      TC_STStatistics = new BatchProcessType(_TC_STStatistics);
      _TC_StatReport = "TC_StatReport";
      TC_StatReport = new BatchProcessType(_TC_StatReport);
      _TC_Statistics = "TC_Statistics";
      TC_Statistics = new BatchProcessType(_TC_Statistics);
      _TC_UserException = "TC_UserException";
      TC_UserException = new BatchProcessType(_TC_UserException);
      _TC_VerifyMinimumCriteria = "TC_VerifyMinimumCriteria";
      TC_VerifyMinimumCriteria = new BatchProcessType(_TC_VerifyMinimumCriteria);
      _TC_Workflow = "TC_Workflow";
      TC_Workflow = new BatchProcessType(_TC_Workflow);
      _TC_WorkItemSetPurge = "TC_WorkItemSetPurge";
      TC_WorkItemSetPurge = new BatchProcessType(_TC_WorkItemSetPurge);
      _TC_WorkQueueInstrumentationPurge = "TC_WorkQueueInstrumentationPurge";
      TC_WorkQueueInstrumentationPurge = new BatchProcessType(_TC_WorkQueueInstrumentationPurge);
      _TC_ABContactScoring = "TC_ABContactScoring";
      TC_ABContactScoring = new BatchProcessType(_TC_ABContactScoring);
      _TC_ABGeocode = "TC_ABGeocode";
      TC_ABGeocode = new BatchProcessType(_TC_ABGeocode);
      _TC_DuplicateContacts = "TC_DuplicateContacts";
      TC_DuplicateContacts = new BatchProcessType(_TC_DuplicateContacts);
      _TC_Geocode = "TC_Geocode";
      TC_Geocode = new BatchProcessType(_TC_Geocode);
      _TC_Unknown = "TC_Unknown";
      TC_Unknown = new BatchProcessType(_TC_Unknown);
      _TC_UpdateMatchSetKey = "TC_UpdateMatchSetKey";
      TC_UpdateMatchSetKey = new BatchProcessType(_TC_UpdateMatchSetKey);
    }

    static {
      initValues0();
    }
/**
Returns the String representation of the enumeration, equivalent to toString()
 */
    public java.lang.String getValue() { return _value_;}
/**
Returns the enumeration instance which matches the String.<p><b>Note:</b> Requires a preceding "TC_" to be appended to the code value of a typekey
 */
    public static BatchProcessType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BatchProcessType enumeration = (BatchProcessType) internalFromCode(value);
        if (enumeration == null) enumeration = (BatchProcessType) internalFromCode("TC_" + value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public java.lang.String toCode() {
        if (_value_.length() <= 3 || _value_ == null){
            return _value_;
        }
        if (_value_.startsWith("TC_")){
            return _value_.substring(3);
        }
        return toString();
    }
    public static BatchProcessType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static BatchProcessType internalFromCode(java.lang.String value){
        BatchProcessType enumeration = (BatchProcessType)
            _table_.get(value);
        return enumeration;
    }
    public static BatchProcessType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchProcessType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BatchProcessType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
