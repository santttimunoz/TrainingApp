/**
 * LoadIntegrityCheck.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Timed loader integrity checks.
 */
public class LoadIntegrityCheck  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Description of integrity check. NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     */ 
    private java.lang.String Description;
    /** 
        Timestamp when the timing completed.
     */ 
    private java.util.Calendar EndTime;
    /** 
        Order of execution (1-N). NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     */ 
    private java.lang.Integer ExecutionOrder;
    /** 
        Denorm FK for unique index.
     */ 
    private com.guidewire.ab.webservices.entity.LoadCommand LoadCommand;
    /** 
        Type of loader integrity check. NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.LoadErrorType LoadIntegrityCheckType;
    /** 
        Parent.
     */ 
    private com.guidewire.ab.webservices.entity.LoadOperation LoadOperation;
    /** 
        Query from integrity check.
     */ 
    private java.lang.String Query;
    /** 
        Timestamp when the timing began.
     */ 
    private java.util.Calendar StartTime;

    public LoadIntegrityCheck() {
    }

    public LoadIntegrityCheck(
           java.lang.String Description,
           java.util.Calendar EndTime,
           java.lang.Integer ExecutionOrder,
           com.guidewire.ab.webservices.entity.LoadCommand LoadCommand,
           com.guidewire.ab.webservices.enumeration.LoadErrorType LoadIntegrityCheckType,
           com.guidewire.ab.webservices.entity.LoadOperation LoadOperation,
           java.lang.String Query,
           java.util.Calendar StartTime) {
           this.Description = Description;
           this.EndTime = EndTime;
           this.ExecutionOrder = ExecutionOrder;
           this.LoadCommand = LoadCommand;
           this.LoadIntegrityCheckType = LoadIntegrityCheckType;
           this.LoadOperation = LoadOperation;
           this.Query = Query;
           this.StartTime = StartTime;
    }


    /**
     *  Description of integrity check. NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     * 
     * @return Description Description of integrity check. NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Description of integrity check. NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     * 
     * @param Description Description of integrity check. NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
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
     *  Order of execution (1-N). NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     * 
     * @return ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     */
    public java.lang.Integer getExecutionOrder() {
        return ExecutionOrder;
    }


    /**
     *  Order of execution (1-N). NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     * 
     * @param ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     */
    public void setExecutionOrder(java.lang.Integer ExecutionOrder) {
        this.ExecutionOrder = ExecutionOrder;
    }


    /**
     *  Denorm FK for unique index.
     * 
     * @return LoadCommand Denorm FK for unique index.
     */
    public com.guidewire.ab.webservices.entity.LoadCommand getLoadCommand() {
        return LoadCommand;
    }


    /**
     *  Denorm FK for unique index.
     * 
     * @param LoadCommand Denorm FK for unique index.
     */
    public void setLoadCommand(com.guidewire.ab.webservices.entity.LoadCommand LoadCommand) {
        this.LoadCommand = LoadCommand;
    }


    /**
     *  Type of loader integrity check. NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     * 
     * @return LoadIntegrityCheckType Type of loader integrity check. NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.LoadErrorType getLoadIntegrityCheckType() {
        return LoadIntegrityCheckType;
    }


    /**
     *  Type of loader integrity check. NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     * 
     * @param LoadIntegrityCheckType Type of loader integrity check. NOTE: when inserting a LoadIntegrityCheck
 * this field must be non-null.
     */
    public void setLoadIntegrityCheckType(com.guidewire.ab.webservices.enumeration.LoadErrorType LoadIntegrityCheckType) {
        this.LoadIntegrityCheckType = LoadIntegrityCheckType;
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
     *  Query from integrity check.
     * 
     * @return Query Query from integrity check.
     */
    public java.lang.String getQuery() {
        return Query;
    }


    /**
     *  Query from integrity check.
     * 
     * @param Query Query from integrity check.
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

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadIntegrityCheck.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadIntegrityCheck"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("loadIntegrityCheckType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadIntegrityCheckType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LoadErrorType"));
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
