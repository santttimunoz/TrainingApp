/**
 * LoadOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Detail of the staging table load history.
 */
public class LoadOperation  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Number of rows affected.
     */ 
    private java.lang.Long AffectedRowCount;
    /** 
        Timed loader callbacks.
     */ 
    private com.guidewire.ab.webservices.entity.LoadCallback[] Callbacks;
    /** 
        Timestamp when the timing completed.
     */ 
    private java.util.Calendar EndTime;
    /** 
        Number of integrity check errors detected (if applicable).
     */ 
    private java.lang.Integer ErrorCount;
    /** 
        Order of execution (1-N). NOTE: when inserting a LoadOperation
 * this field must be non-null.
     */ 
    private java.lang.Integer ExecutionOrder;
    /** 
        If associated with a idsgenerated step, contains the end of the
 * id range for the rows being loaded.
     */ 
    private java.lang.Long HighestID;
    /** 
        Timed loader insert/selects.
     */ 
    private com.guidewire.ab.webservices.entity.LoadInsertSelect[] InsertSelects;
    /** 
        Timed loader integrity checks.
     */ 
    private com.guidewire.ab.webservices.entity.LoadIntegrityCheck[] IntegrityChecks;
    /** 
        If associated with a idsgenerated step, contains the start of the
 * id range for the rows being loaded.
     */ 
    private java.lang.Long LowestID;
    /** 
        Timestamp when the timing began.
     */ 
    private java.util.Calendar StartTime;
    /** 
        Affected staging table. NOTE: when inserting a LoadOperation this
 * field must be non-null.
     */ 
    private java.lang.String TableName;
    /** 
        db update statistics loader selects.
     */ 
    private com.guidewire.ab.webservices.entity.LoadUpdateStatisticsSelect[] UpdateStatisticsSelects;

    public LoadOperation() {
    }

    public LoadOperation(
           java.lang.Long AffectedRowCount,
           com.guidewire.ab.webservices.entity.LoadCallback[] Callbacks,
           java.util.Calendar EndTime,
           java.lang.Integer ErrorCount,
           java.lang.Integer ExecutionOrder,
           java.lang.Long HighestID,
           com.guidewire.ab.webservices.entity.LoadInsertSelect[] InsertSelects,
           com.guidewire.ab.webservices.entity.LoadIntegrityCheck[] IntegrityChecks,
           java.lang.Long LowestID,
           java.util.Calendar StartTime,
           java.lang.String TableName,
           com.guidewire.ab.webservices.entity.LoadUpdateStatisticsSelect[] UpdateStatisticsSelects) {
           this.AffectedRowCount = AffectedRowCount;
           this.Callbacks = Callbacks;
           this.EndTime = EndTime;
           this.ErrorCount = ErrorCount;
           this.ExecutionOrder = ExecutionOrder;
           this.HighestID = HighestID;
           this.InsertSelects = InsertSelects;
           this.IntegrityChecks = IntegrityChecks;
           this.LowestID = LowestID;
           this.StartTime = StartTime;
           this.TableName = TableName;
           this.UpdateStatisticsSelects = UpdateStatisticsSelects;
    }


    /**
     *  Number of rows affected.
     * 
     * @return AffectedRowCount Number of rows affected.
     */
    public java.lang.Long getAffectedRowCount() {
        return AffectedRowCount;
    }


    /**
     *  Number of rows affected.
     * 
     * @param AffectedRowCount Number of rows affected.
     */
    public void setAffectedRowCount(java.lang.Long AffectedRowCount) {
        this.AffectedRowCount = AffectedRowCount;
    }


    /**
     *  Timed loader callbacks.
     * 
     * @return Callbacks Timed loader callbacks.
     */
    public com.guidewire.ab.webservices.entity.LoadCallback[] getCallbacks() {
        return Callbacks;
    }


    /**
     *  Timed loader callbacks.
     * 
     * @param Callbacks Timed loader callbacks.
     */
    public void setCallbacks(com.guidewire.ab.webservices.entity.LoadCallback[] Callbacks) {
        this.Callbacks = Callbacks;
    }


    /**
     *  Timestamp when the timing completed.
     * 
     * @return EndTime Timestamp when the timing completed.
     */
    public java.util.Calendar getEndTime() {
        return EndTime;
    }


    /**
     *  Timestamp when the timing completed.
     * 
     * @param EndTime Timestamp when the timing completed.
     */
    public void setEndTime(java.util.Calendar EndTime) {
        this.EndTime = EndTime;
    }


    /**
     *  Number of integrity check errors detected (if applicable).
     * 
     * @return ErrorCount Number of integrity check errors detected (if applicable).
     */
    public java.lang.Integer getErrorCount() {
        return ErrorCount;
    }


    /**
     *  Number of integrity check errors detected (if applicable).
     * 
     * @param ErrorCount Number of integrity check errors detected (if applicable).
     */
    public void setErrorCount(java.lang.Integer ErrorCount) {
        this.ErrorCount = ErrorCount;
    }


    /**
     *  Order of execution (1-N). NOTE: when inserting a LoadOperation
 * this field must be non-null.
     * 
     * @return ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadOperation
 * this field must be non-null.
     */
    public java.lang.Integer getExecutionOrder() {
        return ExecutionOrder;
    }


    /**
     *  Order of execution (1-N). NOTE: when inserting a LoadOperation
 * this field must be non-null.
     * 
     * @param ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadOperation
 * this field must be non-null.
     */
    public void setExecutionOrder(java.lang.Integer ExecutionOrder) {
        this.ExecutionOrder = ExecutionOrder;
    }


    /**
     *  If associated with a idsgenerated step, contains the end of the
 * id range for the rows being loaded.
     * 
     * @return HighestID If associated with a idsgenerated step, contains the end of the
 * id range for the rows being loaded.
     */
    public java.lang.Long getHighestID() {
        return HighestID;
    }


    /**
     *  If associated with a idsgenerated step, contains the end of the
 * id range for the rows being loaded.
     * 
     * @param HighestID If associated with a idsgenerated step, contains the end of the
 * id range for the rows being loaded.
     */
    public void setHighestID(java.lang.Long HighestID) {
        this.HighestID = HighestID;
    }


    /**
     *  Timed loader insert/selects.
     * 
     * @return InsertSelects Timed loader insert/selects.
     */
    public com.guidewire.ab.webservices.entity.LoadInsertSelect[] getInsertSelects() {
        return InsertSelects;
    }


    /**
     *  Timed loader insert/selects.
     * 
     * @param InsertSelects Timed loader insert/selects.
     */
    public void setInsertSelects(com.guidewire.ab.webservices.entity.LoadInsertSelect[] InsertSelects) {
        this.InsertSelects = InsertSelects;
    }


    /**
     *  Timed loader integrity checks.
     * 
     * @return IntegrityChecks Timed loader integrity checks.
     */
    public com.guidewire.ab.webservices.entity.LoadIntegrityCheck[] getIntegrityChecks() {
        return IntegrityChecks;
    }


    /**
     *  Timed loader integrity checks.
     * 
     * @param IntegrityChecks Timed loader integrity checks.
     */
    public void setIntegrityChecks(com.guidewire.ab.webservices.entity.LoadIntegrityCheck[] IntegrityChecks) {
        this.IntegrityChecks = IntegrityChecks;
    }


    /**
     *  If associated with a idsgenerated step, contains the start of the
 * id range for the rows being loaded.
     * 
     * @return LowestID If associated with a idsgenerated step, contains the start of the
 * id range for the rows being loaded.
     */
    public java.lang.Long getLowestID() {
        return LowestID;
    }


    /**
     *  If associated with a idsgenerated step, contains the start of the
 * id range for the rows being loaded.
     * 
     * @param LowestID If associated with a idsgenerated step, contains the start of the
 * id range for the rows being loaded.
     */
    public void setLowestID(java.lang.Long LowestID) {
        this.LowestID = LowestID;
    }


    /**
     *  Timestamp when the timing began.
     * 
     * @return StartTime Timestamp when the timing began.
     */
    public java.util.Calendar getStartTime() {
        return StartTime;
    }


    /**
     *  Timestamp when the timing began.
     * 
     * @param StartTime Timestamp when the timing began.
     */
    public void setStartTime(java.util.Calendar StartTime) {
        this.StartTime = StartTime;
    }


    /**
     *  Affected staging table. NOTE: when inserting a LoadOperation this
 * field must be non-null.
     * 
     * @return TableName Affected staging table. NOTE: when inserting a LoadOperation this
 * field must be non-null.
     */
    public java.lang.String getTableName() {
        return TableName;
    }


    /**
     *  Affected staging table. NOTE: when inserting a LoadOperation this
 * field must be non-null.
     * 
     * @param TableName Affected staging table. NOTE: when inserting a LoadOperation this
 * field must be non-null.
     */
    public void setTableName(java.lang.String TableName) {
        this.TableName = TableName;
    }


    /**
     *  db update statistics loader selects.
     * 
     * @return UpdateStatisticsSelects db update statistics loader selects.
     */
    public com.guidewire.ab.webservices.entity.LoadUpdateStatisticsSelect[] getUpdateStatisticsSelects() {
        return UpdateStatisticsSelects;
    }


    /**
     *  db update statistics loader selects.
     * 
     * @param UpdateStatisticsSelects db update statistics loader selects.
     */
    public void setUpdateStatisticsSelects(com.guidewire.ab.webservices.entity.LoadUpdateStatisticsSelect[] UpdateStatisticsSelects) {
        this.UpdateStatisticsSelects = UpdateStatisticsSelects;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedRowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AffectedRowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbacks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Callbacks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCallback"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExecutionOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HighestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertSelects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InsertSelects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadInsertSelect"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrityChecks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IntegrityChecks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadIntegrityCheck"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowestID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LowestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateStatisticsSelects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateStatisticsSelects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadUpdateStatisticsSelect"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
