/**
 * AWRReportUserSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class AWRReportUserSettings  implements java.io.Serializable {
    /** 
     */ 
    private int BeginSnapId;
    /** 
     */ 
    private boolean CapturePeakedBindVariables;
    /** 
     */ 
    private boolean CapturePeakedBindVariablesFromAWR;
    /** 
     */ 
    private boolean ConcurrentBatchProcessAndWorkerAnalysis;
    /** 
     */ 
    private boolean ConcurrentHistoryAnalysis;
    /** 
     */ 
    private boolean ConcurrentMessagingAnalysis;
    /** 
     */ 
    private int EndSnapId;
    /** 
     */ 
    private boolean GenerateCallsToASHScripts;
    /** 
     */ 
    private boolean IncludeDatabaseStatistics;
    /** 
     */ 
    private boolean IncludeMetadataForInstrumentationTables;
    /** 
     */ 
    private boolean ProbeInMemorySQLMonitor;
    /** 
     */ 
    private boolean ProbeOnDiskSQLMonitor;
    /** 
     */ 
    private boolean ProbeVDollarTables;
    /** 
     */ 
    private boolean SearchForQueriesOnlyInFirstSnapshot;
    /** 
     */ 
    private boolean SearchForQueriesOnlyInLastSnapshot;
    /** 
     */ 
    private boolean SearchForQueriesWithMultiplePlans;
    /** 
     */ 
    private boolean UseExperimentalRawDataOutput;

    public AWRReportUserSettings() {
    }

    public AWRReportUserSettings(
           int BeginSnapId,
           boolean CapturePeakedBindVariables,
           boolean CapturePeakedBindVariablesFromAWR,
           boolean ConcurrentBatchProcessAndWorkerAnalysis,
           boolean ConcurrentHistoryAnalysis,
           boolean ConcurrentMessagingAnalysis,
           int EndSnapId,
           boolean GenerateCallsToASHScripts,
           boolean IncludeDatabaseStatistics,
           boolean IncludeMetadataForInstrumentationTables,
           boolean ProbeInMemorySQLMonitor,
           boolean ProbeOnDiskSQLMonitor,
           boolean ProbeVDollarTables,
           boolean SearchForQueriesOnlyInFirstSnapshot,
           boolean SearchForQueriesOnlyInLastSnapshot,
           boolean SearchForQueriesWithMultiplePlans,
           boolean UseExperimentalRawDataOutput) {
           this.BeginSnapId = BeginSnapId;
           this.CapturePeakedBindVariables = CapturePeakedBindVariables;
           this.CapturePeakedBindVariablesFromAWR = CapturePeakedBindVariablesFromAWR;
           this.ConcurrentBatchProcessAndWorkerAnalysis = ConcurrentBatchProcessAndWorkerAnalysis;
           this.ConcurrentHistoryAnalysis = ConcurrentHistoryAnalysis;
           this.ConcurrentMessagingAnalysis = ConcurrentMessagingAnalysis;
           this.EndSnapId = EndSnapId;
           this.GenerateCallsToASHScripts = GenerateCallsToASHScripts;
           this.IncludeDatabaseStatistics = IncludeDatabaseStatistics;
           this.IncludeMetadataForInstrumentationTables = IncludeMetadataForInstrumentationTables;
           this.ProbeInMemorySQLMonitor = ProbeInMemorySQLMonitor;
           this.ProbeOnDiskSQLMonitor = ProbeOnDiskSQLMonitor;
           this.ProbeVDollarTables = ProbeVDollarTables;
           this.SearchForQueriesOnlyInFirstSnapshot = SearchForQueriesOnlyInFirstSnapshot;
           this.SearchForQueriesOnlyInLastSnapshot = SearchForQueriesOnlyInLastSnapshot;
           this.SearchForQueriesWithMultiplePlans = SearchForQueriesWithMultiplePlans;
           this.UseExperimentalRawDataOutput = UseExperimentalRawDataOutput;
    }


    /**
     * 
     * 
     * @return BeginSnapId
     */
    public int getBeginSnapId() {
        return BeginSnapId;
    }


    /**
     * 
     * 
     * @param BeginSnapId
     */
    public void setBeginSnapId(int BeginSnapId) {
        this.BeginSnapId = BeginSnapId;
    }


    /**
     * 
     * 
     * @return CapturePeakedBindVariables
     */
    public boolean isCapturePeakedBindVariables() {
        return CapturePeakedBindVariables;
    }


    /**
     * 
     * 
     * @param CapturePeakedBindVariables
     */
    public void setCapturePeakedBindVariables(boolean CapturePeakedBindVariables) {
        this.CapturePeakedBindVariables = CapturePeakedBindVariables;
    }


    /**
     * 
     * 
     * @return CapturePeakedBindVariablesFromAWR
     */
    public boolean isCapturePeakedBindVariablesFromAWR() {
        return CapturePeakedBindVariablesFromAWR;
    }


    /**
     * 
     * 
     * @param CapturePeakedBindVariablesFromAWR
     */
    public void setCapturePeakedBindVariablesFromAWR(boolean CapturePeakedBindVariablesFromAWR) {
        this.CapturePeakedBindVariablesFromAWR = CapturePeakedBindVariablesFromAWR;
    }


    /**
     * 
     * 
     * @return ConcurrentBatchProcessAndWorkerAnalysis
     */
    public boolean isConcurrentBatchProcessAndWorkerAnalysis() {
        return ConcurrentBatchProcessAndWorkerAnalysis;
    }


    /**
     * 
     * 
     * @param ConcurrentBatchProcessAndWorkerAnalysis
     */
    public void setConcurrentBatchProcessAndWorkerAnalysis(boolean ConcurrentBatchProcessAndWorkerAnalysis) {
        this.ConcurrentBatchProcessAndWorkerAnalysis = ConcurrentBatchProcessAndWorkerAnalysis;
    }


    /**
     * 
     * 
     * @return ConcurrentHistoryAnalysis
     */
    public boolean isConcurrentHistoryAnalysis() {
        return ConcurrentHistoryAnalysis;
    }


    /**
     * 
     * 
     * @param ConcurrentHistoryAnalysis
     */
    public void setConcurrentHistoryAnalysis(boolean ConcurrentHistoryAnalysis) {
        this.ConcurrentHistoryAnalysis = ConcurrentHistoryAnalysis;
    }


    /**
     * 
     * 
     * @return ConcurrentMessagingAnalysis
     */
    public boolean isConcurrentMessagingAnalysis() {
        return ConcurrentMessagingAnalysis;
    }


    /**
     * 
     * 
     * @param ConcurrentMessagingAnalysis
     */
    public void setConcurrentMessagingAnalysis(boolean ConcurrentMessagingAnalysis) {
        this.ConcurrentMessagingAnalysis = ConcurrentMessagingAnalysis;
    }


    /**
     * 
     * 
     * @return EndSnapId
     */
    public int getEndSnapId() {
        return EndSnapId;
    }


    /**
     * 
     * 
     * @param EndSnapId
     */
    public void setEndSnapId(int EndSnapId) {
        this.EndSnapId = EndSnapId;
    }


    /**
     * 
     * 
     * @return GenerateCallsToASHScripts
     */
    public boolean isGenerateCallsToASHScripts() {
        return GenerateCallsToASHScripts;
    }


    /**
     * 
     * 
     * @param GenerateCallsToASHScripts
     */
    public void setGenerateCallsToASHScripts(boolean GenerateCallsToASHScripts) {
        this.GenerateCallsToASHScripts = GenerateCallsToASHScripts;
    }


    /**
     * 
     * 
     * @return IncludeDatabaseStatistics
     */
    public boolean isIncludeDatabaseStatistics() {
        return IncludeDatabaseStatistics;
    }


    /**
     * 
     * 
     * @param IncludeDatabaseStatistics
     */
    public void setIncludeDatabaseStatistics(boolean IncludeDatabaseStatistics) {
        this.IncludeDatabaseStatistics = IncludeDatabaseStatistics;
    }


    /**
     * 
     * 
     * @return IncludeMetadataForInstrumentationTables
     */
    public boolean isIncludeMetadataForInstrumentationTables() {
        return IncludeMetadataForInstrumentationTables;
    }


    /**
     * 
     * 
     * @param IncludeMetadataForInstrumentationTables
     */
    public void setIncludeMetadataForInstrumentationTables(boolean IncludeMetadataForInstrumentationTables) {
        this.IncludeMetadataForInstrumentationTables = IncludeMetadataForInstrumentationTables;
    }


    /**
     * 
     * 
     * @return ProbeInMemorySQLMonitor
     */
    public boolean isProbeInMemorySQLMonitor() {
        return ProbeInMemorySQLMonitor;
    }


    /**
     * 
     * 
     * @param ProbeInMemorySQLMonitor
     */
    public void setProbeInMemorySQLMonitor(boolean ProbeInMemorySQLMonitor) {
        this.ProbeInMemorySQLMonitor = ProbeInMemorySQLMonitor;
    }


    /**
     * 
     * 
     * @return ProbeOnDiskSQLMonitor
     */
    public boolean isProbeOnDiskSQLMonitor() {
        return ProbeOnDiskSQLMonitor;
    }


    /**
     * 
     * 
     * @param ProbeOnDiskSQLMonitor
     */
    public void setProbeOnDiskSQLMonitor(boolean ProbeOnDiskSQLMonitor) {
        this.ProbeOnDiskSQLMonitor = ProbeOnDiskSQLMonitor;
    }


    /**
     * 
     * 
     * @return ProbeVDollarTables
     */
    public boolean isProbeVDollarTables() {
        return ProbeVDollarTables;
    }


    /**
     * 
     * 
     * @param ProbeVDollarTables
     */
    public void setProbeVDollarTables(boolean ProbeVDollarTables) {
        this.ProbeVDollarTables = ProbeVDollarTables;
    }


    /**
     * 
     * 
     * @return SearchForQueriesOnlyInFirstSnapshot
     */
    public boolean isSearchForQueriesOnlyInFirstSnapshot() {
        return SearchForQueriesOnlyInFirstSnapshot;
    }


    /**
     * 
     * 
     * @param SearchForQueriesOnlyInFirstSnapshot
     */
    public void setSearchForQueriesOnlyInFirstSnapshot(boolean SearchForQueriesOnlyInFirstSnapshot) {
        this.SearchForQueriesOnlyInFirstSnapshot = SearchForQueriesOnlyInFirstSnapshot;
    }


    /**
     * 
     * 
     * @return SearchForQueriesOnlyInLastSnapshot
     */
    public boolean isSearchForQueriesOnlyInLastSnapshot() {
        return SearchForQueriesOnlyInLastSnapshot;
    }


    /**
     * 
     * 
     * @param SearchForQueriesOnlyInLastSnapshot
     */
    public void setSearchForQueriesOnlyInLastSnapshot(boolean SearchForQueriesOnlyInLastSnapshot) {
        this.SearchForQueriesOnlyInLastSnapshot = SearchForQueriesOnlyInLastSnapshot;
    }


    /**
     * 
     * 
     * @return SearchForQueriesWithMultiplePlans
     */
    public boolean isSearchForQueriesWithMultiplePlans() {
        return SearchForQueriesWithMultiplePlans;
    }


    /**
     * 
     * 
     * @param SearchForQueriesWithMultiplePlans
     */
    public void setSearchForQueriesWithMultiplePlans(boolean SearchForQueriesWithMultiplePlans) {
        this.SearchForQueriesWithMultiplePlans = SearchForQueriesWithMultiplePlans;
    }


    /**
     * 
     * 
     * @return UseExperimentalRawDataOutput
     */
    public boolean isUseExperimentalRawDataOutput() {
        return UseExperimentalRawDataOutput;
    }


    /**
     * 
     * 
     * @param UseExperimentalRawDataOutput
     */
    public void setUseExperimentalRawDataOutput(boolean UseExperimentalRawDataOutput) {
        this.UseExperimentalRawDataOutput = UseExperimentalRawDataOutput;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AWRReportUserSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "AWRReportUserSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginSnapId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeginSnapId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capturePeakedBindVariables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CapturePeakedBindVariables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capturePeakedBindVariablesFromAWR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CapturePeakedBindVariablesFromAWR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurrentBatchProcessAndWorkerAnalysis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConcurrentBatchProcessAndWorkerAnalysis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurrentHistoryAnalysis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConcurrentHistoryAnalysis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurrentMessagingAnalysis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConcurrentMessagingAnalysis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endSnapId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndSnapId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateCallsToASHScripts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenerateCallsToASHScripts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDatabaseStatistics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IncludeDatabaseStatistics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeMetadataForInstrumentationTables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IncludeMetadataForInstrumentationTables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probeInMemorySQLMonitor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProbeInMemorySQLMonitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probeOnDiskSQLMonitor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProbeOnDiskSQLMonitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probeVDollarTables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProbeVDollarTables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchForQueriesOnlyInFirstSnapshot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SearchForQueriesOnlyInFirstSnapshot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchForQueriesOnlyInLastSnapshot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SearchForQueriesOnlyInLastSnapshot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchForQueriesWithMultiplePlans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SearchForQueriesWithMultiplePlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useExperimentalRawDataOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UseExperimentalRawDataOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
