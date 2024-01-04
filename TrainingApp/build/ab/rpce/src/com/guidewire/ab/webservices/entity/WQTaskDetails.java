/**
 * WQTaskDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Details for a particular Worker Task.
 */
public class WQTaskDetails  implements java.io.Serializable {
    /** 
        Active state of the worker.  More precisely, true if the given
 * worker has not been stopped.
 * This includes workers that are both active and suspended.
     */ 
    private boolean Active;
    /** 
        Number of consecutive exceptions
     */ 
    private int ConsecutiveExceptions;
    /** 
        The time at which the given worker was stopped or null if the worker
 * has not been stopped yet.
     */ 
    private java.util.Calendar EndTime;
    /** 
        Number of exceptions caught during work items processing
     */ 
    private int Exceptions;
    /** 
        The host name.
     */ 
    private java.lang.String Hostname;
    /** 
        The Instance ID.
     */ 
    private java.lang.Integer InstanceId;
    /** 
        Number of checked out work items
     */ 
    private int ItemsCheckedOut;
    /** 
        Number of failed work items
     */ 
    private int ItemsFailed;
    /** 
        Number of processed work items
     */ 
    private int ItemsProcessed;
    /** 
        Number of skipped work items
     */ 
    private int ItemsSkipped;
    /** 
        Number of orphans adopted by this task
     */ 
    private int OrphansAdopted;
    /** 
        The worker start time.
     */ 
    private java.util.Calendar StartTime;

    public WQTaskDetails() {
    }

    public WQTaskDetails(
           boolean Active,
           int ConsecutiveExceptions,
           java.util.Calendar EndTime,
           int Exceptions,
           java.lang.String Hostname,
           java.lang.Integer InstanceId,
           int ItemsCheckedOut,
           int ItemsFailed,
           int ItemsProcessed,
           int ItemsSkipped,
           int OrphansAdopted,
           java.util.Calendar StartTime) {
           this.Active = Active;
           this.ConsecutiveExceptions = ConsecutiveExceptions;
           this.EndTime = EndTime;
           this.Exceptions = Exceptions;
           this.Hostname = Hostname;
           this.InstanceId = InstanceId;
           this.ItemsCheckedOut = ItemsCheckedOut;
           this.ItemsFailed = ItemsFailed;
           this.ItemsProcessed = ItemsProcessed;
           this.ItemsSkipped = ItemsSkipped;
           this.OrphansAdopted = OrphansAdopted;
           this.StartTime = StartTime;
    }


    /**
     *  Active state of the worker.  More precisely, true if the given
 * worker has not been stopped.
 * This includes workers that are both active and suspended.
     * 
     * @return Active Active state of the worker.  More precisely, true if the given
 * worker has not been stopped.
 * This includes workers that are both active and suspended.
     */
    public boolean isActive() {
        return Active;
    }


    /**
     *  Active state of the worker.  More precisely, true if the given
 * worker has not been stopped.
 * This includes workers that are both active and suspended.
     * 
     * @param Active Active state of the worker.  More precisely, true if the given
 * worker has not been stopped.
 * This includes workers that are both active and suspended.
     */
    public void setActive(boolean Active) {
        this.Active = Active;
    }


    /**
     *  Number of consecutive exceptions
     * 
     * @return ConsecutiveExceptions Number of consecutive exceptions
     */
    public int getConsecutiveExceptions() {
        return ConsecutiveExceptions;
    }


    /**
     *  Number of consecutive exceptions
     * 
     * @param ConsecutiveExceptions Number of consecutive exceptions
     */
    public void setConsecutiveExceptions(int ConsecutiveExceptions) {
        this.ConsecutiveExceptions = ConsecutiveExceptions;
    }


    /**
     *  The time at which the given worker was stopped or null if the worker
 * has not been stopped yet.
     * 
     * @return EndTime The time at which the given worker was stopped or null if the worker
 * has not been stopped yet.
     */
    public java.util.Calendar getEndTime() {
        return EndTime;
    }


    /**
     *  The time at which the given worker was stopped or null if the worker
 * has not been stopped yet.
     * 
     * @param EndTime The time at which the given worker was stopped or null if the worker
 * has not been stopped yet.
     */
    public void setEndTime(java.util.Calendar EndTime) {
        this.EndTime = EndTime;
    }


    /**
     *  Number of exceptions caught during work items processing
     * 
     * @return Exceptions Number of exceptions caught during work items processing
     */
    public int getExceptions() {
        return Exceptions;
    }


    /**
     *  Number of exceptions caught during work items processing
     * 
     * @param Exceptions Number of exceptions caught during work items processing
     */
    public void setExceptions(int Exceptions) {
        this.Exceptions = Exceptions;
    }


    /**
     *  The host name.
     * 
     * @return Hostname The host name.
     */
    public java.lang.String getHostname() {
        return Hostname;
    }


    /**
     *  The host name.
     * 
     * @param Hostname The host name.
     */
    public void setHostname(java.lang.String Hostname) {
        this.Hostname = Hostname;
    }


    /**
     *  The Instance ID.
     * 
     * @return InstanceId The Instance ID.
     */
    public java.lang.Integer getInstanceId() {
        return InstanceId;
    }


    /**
     *  The Instance ID.
     * 
     * @param InstanceId The Instance ID.
     */
    public void setInstanceId(java.lang.Integer InstanceId) {
        this.InstanceId = InstanceId;
    }


    /**
     *  Number of checked out work items
     * 
     * @return ItemsCheckedOut Number of checked out work items
     */
    public int getItemsCheckedOut() {
        return ItemsCheckedOut;
    }


    /**
     *  Number of checked out work items
     * 
     * @param ItemsCheckedOut Number of checked out work items
     */
    public void setItemsCheckedOut(int ItemsCheckedOut) {
        this.ItemsCheckedOut = ItemsCheckedOut;
    }


    /**
     *  Number of failed work items
     * 
     * @return ItemsFailed Number of failed work items
     */
    public int getItemsFailed() {
        return ItemsFailed;
    }


    /**
     *  Number of failed work items
     * 
     * @param ItemsFailed Number of failed work items
     */
    public void setItemsFailed(int ItemsFailed) {
        this.ItemsFailed = ItemsFailed;
    }


    /**
     *  Number of processed work items
     * 
     * @return ItemsProcessed Number of processed work items
     */
    public int getItemsProcessed() {
        return ItemsProcessed;
    }


    /**
     *  Number of processed work items
     * 
     * @param ItemsProcessed Number of processed work items
     */
    public void setItemsProcessed(int ItemsProcessed) {
        this.ItemsProcessed = ItemsProcessed;
    }


    /**
     *  Number of skipped work items
     * 
     * @return ItemsSkipped Number of skipped work items
     */
    public int getItemsSkipped() {
        return ItemsSkipped;
    }


    /**
     *  Number of skipped work items
     * 
     * @param ItemsSkipped Number of skipped work items
     */
    public void setItemsSkipped(int ItemsSkipped) {
        this.ItemsSkipped = ItemsSkipped;
    }


    /**
     *  Number of orphans adopted by this task
     * 
     * @return OrphansAdopted Number of orphans adopted by this task
     */
    public int getOrphansAdopted() {
        return OrphansAdopted;
    }


    /**
     *  Number of orphans adopted by this task
     * 
     * @param OrphansAdopted Number of orphans adopted by this task
     */
    public void setOrphansAdopted(int OrphansAdopted) {
        this.OrphansAdopted = OrphansAdopted;
    }


    /**
     *  The worker start time.
     * 
     * @return StartTime The worker start time.
     */
    public java.util.Calendar getStartTime() {
        return StartTime;
    }


    /**
     *  The worker start time.
     * 
     * @param StartTime The worker start time.
     */
    public void setStartTime(java.util.Calendar StartTime) {
        this.StartTime = StartTime;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WQTaskDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WQTaskDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consecutiveExceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConsecutiveExceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InstanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsCheckedOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemsCheckedOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemsFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsProcessed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemsProcessed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsSkipped");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemsSkipped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orphansAdopted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrphansAdopted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
