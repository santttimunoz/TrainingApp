/**
 * LoadStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Steps within a load command.
 */
public class LoadStep  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Timestamp when the timing completed.
     */ 
    private java.util.Calendar EndTime;
    /** 
        Order of execution (1-N). NOTE: when inserting a LoadStep this
 * field must be non-null.
     */ 
    private java.lang.Integer ExecutionOrder;
    /** 
        Parent.
     */ 
    private com.guidewire.ab.webservices.entity.LoadCommand LoadCommand;
    /** 
        Detailed operations.
     */ 
    private com.guidewire.ab.webservices.entity.LoadOperation[] Operations;
    /** 
        Timestamp when the timing began.
     */ 
    private java.util.Calendar StartTime;
    /** 
        Type of load step. NOTE: when inserting a LoadStep this field must
 * be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.LoadStepType StepType;

    public LoadStep() {
    }

    public LoadStep(
           java.util.Calendar EndTime,
           java.lang.Integer ExecutionOrder,
           com.guidewire.ab.webservices.entity.LoadCommand LoadCommand,
           com.guidewire.ab.webservices.entity.LoadOperation[] Operations,
           java.util.Calendar StartTime,
           com.guidewire.ab.webservices.enumeration.LoadStepType StepType) {
           this.EndTime = EndTime;
           this.ExecutionOrder = ExecutionOrder;
           this.LoadCommand = LoadCommand;
           this.Operations = Operations;
           this.StartTime = StartTime;
           this.StepType = StepType;
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
     *  Order of execution (1-N). NOTE: when inserting a LoadStep this
 * field must be non-null.
     * 
     * @return ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadStep this
 * field must be non-null.
     */
    public java.lang.Integer getExecutionOrder() {
        return ExecutionOrder;
    }


    /**
     *  Order of execution (1-N). NOTE: when inserting a LoadStep this
 * field must be non-null.
     * 
     * @param ExecutionOrder Order of execution (1-N). NOTE: when inserting a LoadStep this
 * field must be non-null.
     */
    public void setExecutionOrder(java.lang.Integer ExecutionOrder) {
        this.ExecutionOrder = ExecutionOrder;
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
     *  Detailed operations.
     * 
     * @return Operations Detailed operations.
     */
    public com.guidewire.ab.webservices.entity.LoadOperation[] getOperations() {
        return Operations;
    }


    /**
     *  Detailed operations.
     * 
     * @param Operations Detailed operations.
     */
    public void setOperations(com.guidewire.ab.webservices.entity.LoadOperation[] Operations) {
        this.Operations = Operations;
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
     *  Type of load step. NOTE: when inserting a LoadStep this field must
 * be non-null.
     * 
     * @return StepType Type of load step. NOTE: when inserting a LoadStep this field must
 * be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.LoadStepType getStepType() {
        return StepType;
    }


    /**
     *  Type of load step. NOTE: when inserting a LoadStep this field must
 * be non-null.
     * 
     * @param StepType Type of load step. NOTE: when inserting a LoadStep this field must
 * be non-null.
     */
    public void setStepType(com.guidewire.ab.webservices.enumeration.LoadStepType StepType) {
        this.StepType = StepType;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadStep"));
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
        elemField.setFieldName("operations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadOperation"));
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
        elemField.setFieldName("stepType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StepType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LoadStepType"));
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
