/**
 * LoadCallback.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Timed loader callbacks.
 */
public class LoadCallback  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Timed loader callback results.
     */ 
    private com.guidewire.ab.webservices.entity.LoadCallbackResult[] CallbackResults;
    /** 
        Description of loader callback. NOTE: when inserting a LoadCallback
 * this field must be non-null.
     */ 
    private java.lang.String Description;
    /** 
        Timestamp when the timing completed.
     */ 
    private java.util.Calendar EndTime;
    /** 
        Order of execution (1-N). NOTE: when inserting a LoadCallback this
 * field must be non-null.
     */ 
    private java.lang.Integer ExecutionOrder;
    /** 
        Execution time of LoaderCallback. NOTE: when inserting a LoadCallback
 * this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.LoaderCallbackTimeType ExecutionTime;
    /** 
        Parent.
     */ 
    private com.guidewire.ab.webservices.entity.LoadCommand LoadCommand;
    /** 
        Parent.
     */ 
    private com.guidewire.ab.webservices.entity.LoadOperation LoadOperation;
    /** 
        Name of loader callback. NOTE: when inserting a LoadCallback this
 * field must be non-null.
     */ 
    private java.lang.String Name;
    /** 
        Timestamp when the timing began.
     */ 
    private java.util.Calendar StartTime;

    public LoadCallback() {
    }

    public LoadCallback(
           com.guidewire.ab.webservices.entity.LoadCallbackResult[] CallbackResults,
           java.lang.String Description,
           java.util.Calendar EndTime,
           java.lang.Integer ExecutionOrder,
           com.guidewire.ab.webservices.enumeration.LoaderCallbackTimeType ExecutionTime,
           com.guidewire.ab.webservices.entity.LoadCommand LoadCommand,
           com.guidewire.ab.webservices.entity.LoadOperation LoadOperation,
           java.lang.String Name,
           java.util.Calendar StartTime) {
           this.CallbackResults = CallbackResults;
           this.Description = Description;
           this.EndTime = EndTime;
           this.ExecutionOrder = ExecutionOrder;
           this.ExecutionTime = ExecutionTime;
           this.LoadCommand = LoadCommand;
           this.LoadOperation = LoadOperation;
           this.Name = Name;
           this.StartTime = StartTime;
    }


    /**
     *  Timed loader callback results.
     * 
     * @return CallbackResults Timed loader callback results.
     */
    public com.guidewire.ab.webservices.entity.LoadCallbackResult[] getCallbackResults() {
        return CallbackResults;
    }


    /**
     *  Timed loader callback results.
     * 
     * @param CallbackResults Timed loader callback results.
     */
    public void setCallbackResults(com.guidewire.ab.webservices.entity.LoadCallbackResult[] CallbackResults) {
        this.CallbackResults = CallbackResults;
    }


    /**
     *  Description of loader callback. NOTE: when inserting a LoadCallback
 * this field must be non-null.
     * 
     * @return Description Description of loader callback. NOTE: when inserting a LoadCallback
 * this field must be non-null.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Description of loader callback. NOTE: when inserting a LoadCallback
 * this field must be non-null.
     * 
     * @param Description Description of loader callback. NOTE: when inserting a LoadCallback
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
     *  Order of execution (1-N). NOTE: when inserting a LoadCallback this
 * field must be non-null.
     * 
     * @return ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadCallback this
 * field must be non-null.
     */
    public java.lang.Integer getExecutionOrder() {
        return ExecutionOrder;
    }


    /**
     *  Order of execution (1-N). NOTE: when inserting a LoadCallback this
 * field must be non-null.
     * 
     * @param ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadCallback this
 * field must be non-null.
     */
    public void setExecutionOrder(java.lang.Integer ExecutionOrder) {
        this.ExecutionOrder = ExecutionOrder;
    }


    /**
     *  Execution time of LoaderCallback. NOTE: when inserting a LoadCallback
 * this field must be non-null.
     * 
     * @return ExecutionTime Execution time of LoaderCallback. NOTE: when inserting a LoadCallback
 * this field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.LoaderCallbackTimeType getExecutionTime() {
        return ExecutionTime;
    }


    /**
     *  Execution time of LoaderCallback. NOTE: when inserting a LoadCallback
 * this field must be non-null.
     * 
     * @param ExecutionTime Execution time of LoaderCallback. NOTE: when inserting a LoadCallback
 * this field must be non-null.
     */
    public void setExecutionTime(com.guidewire.ab.webservices.enumeration.LoaderCallbackTimeType ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }


    /**
     *  Parent.
     * 
     * @return LoadCommand Parent.
     */
    public com.guidewire.ab.webservices.entity.LoadCommand getLoadCommand() {
        return LoadCommand;
    }


    /**
     *  Parent.
     * 
     * @param LoadCommand Parent.
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
     *  Name of loader callback. NOTE: when inserting a LoadCallback this
 * field must be non-null.
     * 
     * @return Name Name of loader callback. NOTE: when inserting a LoadCallback this
 * field must be non-null.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  Name of loader callback. NOTE: when inserting a LoadCallback this
 * field must be non-null.
     * 
     * @param Name Name of loader callback. NOTE: when inserting a LoadCallback this
 * field must be non-null.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
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
        new org.apache.axis.description.TypeDesc(LoadCallback.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCallback"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CallbackResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadCallbackResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("executionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExecutionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LoaderCallbackTimeType"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
