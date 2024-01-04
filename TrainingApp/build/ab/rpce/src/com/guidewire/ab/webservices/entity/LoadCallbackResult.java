/**
 * LoadCallbackResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Timed loader callback results.
 */
public class LoadCallbackResult  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Number of rows affected.
     */ 
    private java.lang.Integer AffectedRowCount;
    /** 
        Timestamp when the timing completed.
     */ 
    private java.util.Calendar EndTime;
    /** 
        Order of execution (1-N). NOTE: when inserting a LoadCallbackResult
 * this field must be non-null.
     */ 
    private java.lang.Integer ExecutionOrder;
    /** 
        Parent.
     */ 
    private com.guidewire.ab.webservices.entity.LoadCallback LoadCallback;
    /** 
        Name of loader callback result. NOTE: when inserting a LoadCallbackResult
 * this field must be non-null.
     */ 
    private java.lang.String Name;
    /** 
        SQL text.
     */ 
    private java.lang.String SQLText;
    /** 
        Timestamp when the timing began.
     */ 
    private java.util.Calendar StartTime;

    public LoadCallbackResult() {
    }

    public LoadCallbackResult(
           java.lang.Integer AffectedRowCount,
           java.util.Calendar EndTime,
           java.lang.Integer ExecutionOrder,
           com.guidewire.ab.webservices.entity.LoadCallback LoadCallback,
           java.lang.String Name,
           java.lang.String SQLText,
           java.util.Calendar StartTime) {
           this.AffectedRowCount = AffectedRowCount;
           this.EndTime = EndTime;
           this.ExecutionOrder = ExecutionOrder;
           this.LoadCallback = LoadCallback;
           this.Name = Name;
           this.SQLText = SQLText;
           this.StartTime = StartTime;
    }


    /**
     *  Number of rows affected.
     * 
     * @return AffectedRowCount Number of rows affected.
     */
    public java.lang.Integer getAffectedRowCount() {
        return AffectedRowCount;
    }


    /**
     *  Number of rows affected.
     * 
     * @param AffectedRowCount Number of rows affected.
     */
    public void setAffectedRowCount(java.lang.Integer AffectedRowCount) {
        this.AffectedRowCount = AffectedRowCount;
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
     *  Order of execution (1-N). NOTE: when inserting a LoadCallbackResult
 * this field must be non-null.
     * 
     * @return ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadCallbackResult
 * this field must be non-null.
     */
    public java.lang.Integer getExecutionOrder() {
        return ExecutionOrder;
    }


    /**
     *  Order of execution (1-N). NOTE: when inserting a LoadCallbackResult
 * this field must be non-null.
     * 
     * @param ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadCallbackResult
 * this field must be non-null.
     */
    public void setExecutionOrder(java.lang.Integer ExecutionOrder) {
        this.ExecutionOrder = ExecutionOrder;
    }


    /**
     *  Parent.
     * 
     * @return LoadCallback Parent.
     */
    public com.guidewire.ab.webservices.entity.LoadCallback getLoadCallback() {
        return LoadCallback;
    }


    /**
     *  Parent.
     * 
     * @param LoadCallback Parent.
     */
    public void setLoadCallback(com.guidewire.ab.webservices.entity.LoadCallback LoadCallback) {
        this.LoadCallback = LoadCallback;
    }


    /**
     *  Name of loader callback result. NOTE: when inserting a LoadCallbackResult
 * this field must be non-null.
     * 
     * @return Name Name of loader callback result. NOTE: when inserting a LoadCallbackResult
 * this field must be non-null.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  Name of loader callback result. NOTE: when inserting a LoadCallbackResult
 * this field must be non-null.
     * 
     * @param Name Name of loader callback result. NOTE: when inserting a LoadCallbackResult
 * this field must be non-null.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  SQL text.
     * 
     * @return SQLText SQL text.
     */
    public java.lang.String getSQLText() {
        return SQLText;
    }


    /**
     *  SQL text.
     * 
     * @param SQLText SQL text.
     */
    public void setSQLText(java.lang.String SQLText) {
        this.SQLText = SQLText;
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
        new org.apache.axis.description.TypeDesc(LoadCallbackResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCallbackResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedRowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AffectedRowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
        elemField.setFieldName("executionOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExecutionOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadCallback");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadCallback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCallback"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SQLText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SQLText"));
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
