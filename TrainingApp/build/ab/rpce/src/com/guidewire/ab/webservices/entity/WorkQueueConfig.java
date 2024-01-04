/**
 * WorkQueueConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Carries information about the distributed worker processes
 * for a distributed workqueue.  Used to query and set the
 * worker configuration on a server.
 */
public class WorkQueueConfig  implements java.io.Serializable {
    /** 
        Get the max number of workitems to be checked out when a
 * worker wakes up.  (Default = 10)
     */ 
    private int BatchSize;
    /** 
        Get the number of worker instances configured to run on this server
     */ 
    private int Instances;
    /** 
        Get the maximum time in milliseconds that a worker will wait
 * between queries for new workitems.  When a worker exhausts
 * the supply of workitems, it will suspend itself and wait for
 * notifications.  If no notification is received, it will wake
 * up and check for new workitems every maxPollInterval millis.
 * This acts as a safety mechanism in case notifications are lost
 * in a clustered environment, and guarantees a maximum latency
 * for workitem processing.  This parameter should increase with
 * the number of workers configured, to keep the load on the database
 * from growing excessively.
 * (Default = 60000)
     */ 
    private long MaxPollInterval;
    /** 
        Get the current sleep time between workitems
     */ 
    private long ThrottleInterval;

    public WorkQueueConfig() {
    }

    public WorkQueueConfig(
           int BatchSize,
           int Instances,
           long MaxPollInterval,
           long ThrottleInterval) {
           this.BatchSize = BatchSize;
           this.Instances = Instances;
           this.MaxPollInterval = MaxPollInterval;
           this.ThrottleInterval = ThrottleInterval;
    }


    /**
     *  Get the max number of workitems to be checked out when a
 * worker wakes up.  (Default = 10)
     * 
     * @return BatchSize Get the max number of workitems to be checked out when a
 * worker wakes up.  (Default = 10)
     */
    public int getBatchSize() {
        return BatchSize;
    }


    /**
     *  Get the max number of workitems to be checked out when a
 * worker wakes up.  (Default = 10)
     * 
     * @param BatchSize Get the max number of workitems to be checked out when a
 * worker wakes up.  (Default = 10)
     */
    public void setBatchSize(int BatchSize) {
        this.BatchSize = BatchSize;
    }


    /**
     *  Get the number of worker instances configured to run on this server
     * 
     * @return Instances Get the number of worker instances configured to run on this server
     */
    public int getInstances() {
        return Instances;
    }


    /**
     *  Get the number of worker instances configured to run on this server
     * 
     * @param Instances Get the number of worker instances configured to run on this server
     */
    public void setInstances(int Instances) {
        this.Instances = Instances;
    }


    /**
     *  Get the maximum time in milliseconds that a worker will wait
 * between queries for new workitems.  When a worker exhausts
 * the supply of workitems, it will suspend itself and wait for
 * notifications.  If no notification is received, it will wake
 * up and check for new workitems every maxPollInterval millis.
 * This acts as a safety mechanism in case notifications are lost
 * in a clustered environment, and guarantees a maximum latency
 * for workitem processing.  This parameter should increase with
 * the number of workers configured, to keep the load on the database
 * from growing excessively.
 * (Default = 60000)
     * 
     * @return MaxPollInterval Get the maximum time in milliseconds that a worker will wait
 * between queries for new workitems.  When a worker exhausts
 * the supply of workitems, it will suspend itself and wait for
 * notifications.  If no notification is received, it will wake
 * up and check for new workitems every maxPollInterval millis.
 * This acts as a safety mechanism in case notifications are lost
 * in a clustered environment, and guarantees a maximum latency
 * for workitem processing.  This parameter should increase with
 * the number of workers configured, to keep the load on the database
 * from growing excessively.
 * (Default = 60000)
     */
    public long getMaxPollInterval() {
        return MaxPollInterval;
    }


    /**
     *  Get the maximum time in milliseconds that a worker will wait
 * between queries for new workitems.  When a worker exhausts
 * the supply of workitems, it will suspend itself and wait for
 * notifications.  If no notification is received, it will wake
 * up and check for new workitems every maxPollInterval millis.
 * This acts as a safety mechanism in case notifications are lost
 * in a clustered environment, and guarantees a maximum latency
 * for workitem processing.  This parameter should increase with
 * the number of workers configured, to keep the load on the database
 * from growing excessively.
 * (Default = 60000)
     * 
     * @param MaxPollInterval Get the maximum time in milliseconds that a worker will wait
 * between queries for new workitems.  When a worker exhausts
 * the supply of workitems, it will suspend itself and wait for
 * notifications.  If no notification is received, it will wake
 * up and check for new workitems every maxPollInterval millis.
 * This acts as a safety mechanism in case notifications are lost
 * in a clustered environment, and guarantees a maximum latency
 * for workitem processing.  This parameter should increase with
 * the number of workers configured, to keep the load on the database
 * from growing excessively.
 * (Default = 60000)
     */
    public void setMaxPollInterval(long MaxPollInterval) {
        this.MaxPollInterval = MaxPollInterval;
    }


    /**
     *  Get the current sleep time between workitems
     * 
     * @return ThrottleInterval Get the current sleep time between workitems
     */
    public long getThrottleInterval() {
        return ThrottleInterval;
    }


    /**
     *  Get the current sleep time between workitems
     * 
     * @param ThrottleInterval Get the current sleep time between workitems
     */
    public void setThrottleInterval(long ThrottleInterval) {
        this.ThrottleInterval = ThrottleInterval;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkQueueConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "WorkQueueConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BatchSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instances");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Instances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPollInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxPollInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throttleInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ThrottleInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
