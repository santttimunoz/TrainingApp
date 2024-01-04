/**
 * WQueueStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Detailed information about Worker Queue.
 */
public class WQueueStatus  implements java.io.Serializable {
    /** 
        An array of {@link gw.api.webservice.maintenanceTools.WQueueExecutorDetails}
 * for Executors of the given queue.
     */ 
    private com.guidewire.ab.webservices.entity.WQueueExecutorDetails[] Executors;
    /** 
        The number of active executors.
     */ 
    private int NumActiveExecutors;
    /** 
        The number of active work items.
     */ 
    private int NumActiveWorkItems;
    /** 
        The queue name
     */ 
    private java.lang.String QueueName;

    public WQueueStatus() {
    }

    public WQueueStatus(
           com.guidewire.ab.webservices.entity.WQueueExecutorDetails[] Executors,
           int NumActiveExecutors,
           int NumActiveWorkItems,
           java.lang.String QueueName) {
           this.Executors = Executors;
           this.NumActiveExecutors = NumActiveExecutors;
           this.NumActiveWorkItems = NumActiveWorkItems;
           this.QueueName = QueueName;
    }


    /**
     *  An array of {@link gw.api.webservice.maintenanceTools.WQueueExecutorDetails}
 * for Executors of the given queue.
     * 
     * @return Executors An array of {@link gw.api.webservice.maintenanceTools.WQueueExecutorDetails}
 * for Executors of the given queue.
     */
    public com.guidewire.ab.webservices.entity.WQueueExecutorDetails[] getExecutors() {
        return Executors;
    }


    /**
     *  An array of {@link gw.api.webservice.maintenanceTools.WQueueExecutorDetails}
 * for Executors of the given queue.
     * 
     * @param Executors An array of {@link gw.api.webservice.maintenanceTools.WQueueExecutorDetails}
 * for Executors of the given queue.
     */
    public void setExecutors(com.guidewire.ab.webservices.entity.WQueueExecutorDetails[] Executors) {
        this.Executors = Executors;
    }


    /**
     *  The number of active executors.
     * 
     * @return NumActiveExecutors The number of active executors.
     */
    public int getNumActiveExecutors() {
        return NumActiveExecutors;
    }


    /**
     *  The number of active executors.
     * 
     * @param NumActiveExecutors The number of active executors.
     */
    public void setNumActiveExecutors(int NumActiveExecutors) {
        this.NumActiveExecutors = NumActiveExecutors;
    }


    /**
     *  The number of active work items.
     * 
     * @return NumActiveWorkItems The number of active work items.
     */
    public int getNumActiveWorkItems() {
        return NumActiveWorkItems;
    }


    /**
     *  The number of active work items.
     * 
     * @param NumActiveWorkItems The number of active work items.
     */
    public void setNumActiveWorkItems(int NumActiveWorkItems) {
        this.NumActiveWorkItems = NumActiveWorkItems;
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
        new org.apache.axis.description.TypeDesc(WQueueStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WQueueStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Executors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WQueueExecutorDetails"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numActiveExecutors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumActiveExecutors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numActiveWorkItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumActiveWorkItems"));
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
