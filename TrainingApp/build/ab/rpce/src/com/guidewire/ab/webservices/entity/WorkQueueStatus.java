/**
 * WorkQueueStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Detailed information about Worker Queue.
 */
public class WorkQueueStatus  implements java.io.Serializable {
    /** 
        An array of {@link WQTaskDetails} for Workers of the given queue.
     */ 
    private com.guidewire.ab.webservices.entity.WQTaskDetails[] DetailsArray;
    /** 
        the number of active work items (checkedout or available).
     */ 
    private int NumActiveWorkItems;
    /** 
        The number of active workers.
     */ 
    private int NumActiveWorkerItems;
    /** 
        The number of active workers.
     */ 
    private int NumActiveWorkers;
    /** 
        The number of available work items
     */ 
    private int NumAvailableWorkItems;
    /** 
        The number of checkedout work items
     */ 
    private int NumCheckedoutWorkItems;
    /** 
        the number of failed work items
     */ 
    private int NumFailedWorkItems;
    /** 
        The queue name
     */ 
    private java.lang.String QueueName;

    public WorkQueueStatus() {
    }

    public WorkQueueStatus(
           com.guidewire.ab.webservices.entity.WQTaskDetails[] DetailsArray,
           int NumActiveWorkItems,
           int NumActiveWorkerItems,
           int NumActiveWorkers,
           int NumAvailableWorkItems,
           int NumCheckedoutWorkItems,
           int NumFailedWorkItems,
           java.lang.String QueueName) {
           this.DetailsArray = DetailsArray;
           this.NumActiveWorkItems = NumActiveWorkItems;
           this.NumActiveWorkerItems = NumActiveWorkerItems;
           this.NumActiveWorkers = NumActiveWorkers;
           this.NumAvailableWorkItems = NumAvailableWorkItems;
           this.NumCheckedoutWorkItems = NumCheckedoutWorkItems;
           this.NumFailedWorkItems = NumFailedWorkItems;
           this.QueueName = QueueName;
    }


    /**
     *  An array of {@link WQTaskDetails} for Workers of the given queue.
     * 
     * @return DetailsArray An array of {@link WQTaskDetails} for Workers of the given queue.
     */
    public com.guidewire.ab.webservices.entity.WQTaskDetails[] getDetailsArray() {
        return DetailsArray;
    }


    /**
     *  An array of {@link WQTaskDetails} for Workers of the given queue.
     * 
     * @param DetailsArray An array of {@link WQTaskDetails} for Workers of the given queue.
     */
    public void setDetailsArray(com.guidewire.ab.webservices.entity.WQTaskDetails[] DetailsArray) {
        this.DetailsArray = DetailsArray;
    }


    /**
     *  the number of active work items (checkedout or available).
     * 
     * @return NumActiveWorkItems the number of active work items (checkedout or available).
     */
    public int getNumActiveWorkItems() {
        return NumActiveWorkItems;
    }


    /**
     *  the number of active work items (checkedout or available).
     * 
     * @param NumActiveWorkItems the number of active work items (checkedout or available).
     */
    public void setNumActiveWorkItems(int NumActiveWorkItems) {
        this.NumActiveWorkItems = NumActiveWorkItems;
    }


    /**
     *  The number of active workers.
     * 
     * @return NumActiveWorkerItems The number of active workers.
     */
    public int getNumActiveWorkerItems() {
        return NumActiveWorkerItems;
    }


    /**
     *  The number of active workers.
     * 
     * @param NumActiveWorkerItems The number of active workers.
     */
    public void setNumActiveWorkerItems(int NumActiveWorkerItems) {
        this.NumActiveWorkerItems = NumActiveWorkerItems;
    }


    /**
     *  The number of active workers.
     * 
     * @return NumActiveWorkers The number of active workers.
     */
    public int getNumActiveWorkers() {
        return NumActiveWorkers;
    }


    /**
     *  The number of active workers.
     * 
     * @param NumActiveWorkers The number of active workers.
     */
    public void setNumActiveWorkers(int NumActiveWorkers) {
        this.NumActiveWorkers = NumActiveWorkers;
    }


    /**
     *  The number of available work items
     * 
     * @return NumAvailableWorkItems The number of available work items
     */
    public int getNumAvailableWorkItems() {
        return NumAvailableWorkItems;
    }


    /**
     *  The number of available work items
     * 
     * @param NumAvailableWorkItems The number of available work items
     */
    public void setNumAvailableWorkItems(int NumAvailableWorkItems) {
        this.NumAvailableWorkItems = NumAvailableWorkItems;
    }


    /**
     *  The number of checkedout work items
     * 
     * @return NumCheckedoutWorkItems The number of checkedout work items
     */
    public int getNumCheckedoutWorkItems() {
        return NumCheckedoutWorkItems;
    }


    /**
     *  The number of checkedout work items
     * 
     * @param NumCheckedoutWorkItems The number of checkedout work items
     */
    public void setNumCheckedoutWorkItems(int NumCheckedoutWorkItems) {
        this.NumCheckedoutWorkItems = NumCheckedoutWorkItems;
    }


    /**
     *  the number of failed work items
     * 
     * @return NumFailedWorkItems the number of failed work items
     */
    public int getNumFailedWorkItems() {
        return NumFailedWorkItems;
    }


    /**
     *  the number of failed work items
     * 
     * @param NumFailedWorkItems the number of failed work items
     */
    public void setNumFailedWorkItems(int NumFailedWorkItems) {
        this.NumFailedWorkItems = NumFailedWorkItems;
    }


    /**
     *  The queue name
     * 
     * @return QueueName The queue name
     */
    public java.lang.String getQueueName() {
        return QueueName;
    }


    /**
     *  The queue name
     * 
     * @param QueueName The queue name
     */
    public void setQueueName(java.lang.String QueueName) {
        this.QueueName = QueueName;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkQueueStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WorkQueueStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DetailsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WQTaskDetails"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numActiveWorkItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumActiveWorkItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numActiveWorkerItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumActiveWorkerItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numActiveWorkers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumActiveWorkers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numAvailableWorkItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumAvailableWorkItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCheckedoutWorkItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumCheckedoutWorkItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numFailedWorkItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumFailedWorkItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueueName"));
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
