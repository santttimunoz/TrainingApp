/**
 * WQueueExecutorDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Details for a particular WorkQueueExecutor of a particular WorkQueue
 * for a particular host.
 */
public class WQueueExecutorDetails  implements java.io.Serializable {
    /** 
        Active state of the worker.  More precisely, true if the given
 * worker has not been stopped.
 * This includes workers that are both active and suspended.
     */ 
    private boolean Active;
    /** 
        The time at which the given worker was stopped or null if the worker
 * has not been stopped yet.
     */ 
    private java.util.Calendar EndTime;
    /** 
        The host name.
     */ 
    private java.lang.String Hostname;
    /** 
        Maximum number of allowed workers for the given executor.
     */ 
    private int MaxNumOfWorkers;
    /** 
        The worker start time.
     */ 
    private java.util.Calendar StartTime;
    /** 
        An array of {@link WQTaskDetails} for Workers of the given executor.
     */ 
    private com.guidewire.ab.webservices.entity.WQTaskDetails[] Tasks;

    public WQueueExecutorDetails() {
    }

    public WQueueExecutorDetails(
           boolean Active,
           java.util.Calendar EndTime,
           java.lang.String Hostname,
           int MaxNumOfWorkers,
           java.util.Calendar StartTime,
           com.guidewire.ab.webservices.entity.WQTaskDetails[] Tasks) {
           this.Active = Active;
           this.EndTime = EndTime;
           this.Hostname = Hostname;
           this.MaxNumOfWorkers = MaxNumOfWorkers;
           this.StartTime = StartTime;
           this.Tasks = Tasks;
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
     *  Maximum number of allowed workers for the given executor.
     * 
     * @return MaxNumOfWorkers Maximum number of allowed workers for the given executor.
     */
    public int getMaxNumOfWorkers() {
        return MaxNumOfWorkers;
    }


    /**
     *  Maximum number of allowed workers for the given executor.
     * 
     * @param MaxNumOfWorkers Maximum number of allowed workers for the given executor.
     */
    public void setMaxNumOfWorkers(int MaxNumOfWorkers) {
        this.MaxNumOfWorkers = MaxNumOfWorkers;
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


    /**
     *  An array of {@link WQTaskDetails} for Workers of the given executor.
     * 
     * @return Tasks An array of {@link WQTaskDetails} for Workers of the given executor.
     */
    public com.guidewire.ab.webservices.entity.WQTaskDetails[] getTasks() {
        return Tasks;
    }


    /**
     *  An array of {@link WQTaskDetails} for Workers of the given executor.
     * 
     * @param Tasks An array of {@link WQTaskDetails} for Workers of the given executor.
     */
    public void setTasks(com.guidewire.ab.webservices.entity.WQTaskDetails[] Tasks) {
        this.Tasks = Tasks;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WQueueExecutorDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WQueueExecutorDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumOfWorkers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxNumOfWorkers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WQTaskDetails"));
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
