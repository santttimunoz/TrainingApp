/**
 * LoadUpdateStatisticsSelect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Timed loader update statistics selects.
 */
public class LoadUpdateStatisticsSelect  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Timestamp when the timing completed.
     */ 
    private java.util.Calendar EndTime;
    /** 
        Order of execution (1-N). NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     */ 
    private java.lang.Integer ExecutionOrder;
    /** 
        Denorm FK for unique index. NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.entity.LoadCommand LoadCommand;
    /** 
        Parent.
     */ 
    private com.guidewire.ab.webservices.entity.LoadOperation LoadOperation;
    /** 
        insert/select.
     */ 
    private java.lang.String Query;
    /** 
        Timestamp when the timing began.
     */ 
    private java.util.Calendar StartTime;
    /** 
        Affected staging table. NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     */ 
    private java.lang.String TableName;

    public LoadUpdateStatisticsSelect() {
    }

    public LoadUpdateStatisticsSelect(
           java.util.Calendar EndTime,
           java.lang.Integer ExecutionOrder,
           com.guidewire.ab.webservices.entity.LoadCommand LoadCommand,
           com.guidewire.ab.webservices.entity.LoadOperation LoadOperation,
           java.lang.String Query,
           java.util.Calendar StartTime,
           java.lang.String TableName) {
           this.EndTime = EndTime;
           this.ExecutionOrder = ExecutionOrder;
           this.LoadCommand = LoadCommand;
           this.LoadOperation = LoadOperation;
           this.Query = Query;
           this.StartTime = StartTime;
           this.TableName = TableName;
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
     *  Order of execution (1-N). NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     * 
     * @return ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     */
    public java.lang.Integer getExecutionOrder() {
        return ExecutionOrder;
    }


    /**
     *  Order of execution (1-N). NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     * 
     * @param ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     */
    public void setExecutionOrder(java.lang.Integer ExecutionOrder) {
        this.ExecutionOrder = ExecutionOrder;
    }


    /**
     *  Denorm FK for unique index. NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     * 
     * @return LoadCommand Denorm FK for unique index. NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     */
    public com.guidewire.ab.webservices.entity.LoadCommand getLoadCommand() {
        return LoadCommand;
    }


    /**
     *  Denorm FK for unique index. NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     * 
     * @param LoadCommand Denorm FK for unique index. NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     */
    public void setLoadCommand(com.guidewire.ab.webservices.entity.LoadCommand LoadCommand) {
        this.LoadCommand = LoadCommand;
    }


    /**
     *  Parent.
     * 
     * @return LoadOperation Parent.
     */
    public com.guidewire.ab.webservices.entity.LoadOperation getLoadOperation() {
        return LoadOperation;
    }


    /**
     *  Parent.
     * 
     * @param LoadOperation Parent.
     */
    public void setLoadOperation(com.guidewire.ab.webservices.entity.LoadOperation LoadOperation) {
        this.LoadOperation = LoadOperation;
    }


    /**
     *  insert/select.
     * 
     * @return Query insert/select.
     */
    public java.lang.String getQuery() {
        return Query;
    }


    /**
     *  insert/select.
     * 
     * @param Query insert/select.
     */
    public void setQuery(java.lang.String Query) {
        this.Query = Query;
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
     *  Affected staging table. NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     * 
     * @return TableName Affected staging table. NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     */
    public java.lang.String getTableName() {
        return TableName;
    }


    /**
     *  Affected staging table. NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     * 
     * @param TableName Affected staging table. NOTE: when inserting a LoadUpdateStatisticsSelect
 * this field must be non-null.
     */
    public void setTableName(java.lang.String TableName) {
        this.TableName = TableName;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadUpdateStatisticsSelect.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadUpdateStatisticsSelect"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("loadCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCommand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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