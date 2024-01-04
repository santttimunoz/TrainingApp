/**
 * MessageStatisticsData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Holds the statistics for messages for a given safe ordered object.
 * The statistics include:
 * <ul>
 * <li># of failed messages</li>
 * <li># of failed messages that can be retried</li>
 * <li># of inflight messages</li>
 * <li># of unsent messages</li>
 * </ul>
 */
public class MessageStatisticsData  implements java.io.Serializable {
    /** 
        Returns the number of messages that failed.
     */ 
    private int Failed;
    /** 
        Returns the number of messages that are in flight.
     */ 
    private int Inflight;
    /** 
        Returns the number of failed messages that can be retried.
     */ 
    private int Retry;
    /** 
        Returns the number of messages that are not sent yet.
     */ 
    private int Unsent;

    public MessageStatisticsData() {
    }

    public MessageStatisticsData(
           int Failed,
           int Inflight,
           int Retry,
           int Unsent) {
           this.Failed = Failed;
           this.Inflight = Inflight;
           this.Retry = Retry;
           this.Unsent = Unsent;
    }


    /**
     *  Returns the number of messages that failed.
     * 
     * @return Failed Returns the number of messages that failed.
     */
    public int getFailed() {
        return Failed;
    }


    /**
     *  Returns the number of messages that failed.
     * 
     * @param Failed Returns the number of messages that failed.
     */
    public void setFailed(int Failed) {
        this.Failed = Failed;
    }


    /**
     *  Returns the number of messages that are in flight.
     * 
     * @return Inflight Returns the number of messages that are in flight.
     */
    public int getInflight() {
        return Inflight;
    }


    /**
     *  Returns the number of messages that are in flight.
     * 
     * @param Inflight Returns the number of messages that are in flight.
     */
    public void setInflight(int Inflight) {
        this.Inflight = Inflight;
    }


    /**
     *  Returns the number of failed messages that can be retried.
     * 
     * @return Retry Returns the number of failed messages that can be retried.
     */
    public int getRetry() {
        return Retry;
    }


    /**
     *  Returns the number of failed messages that can be retried.
     * 
     * @param Retry Returns the number of failed messages that can be retried.
     */
    public void setRetry(int Retry) {
        this.Retry = Retry;
    }


    /**
     *  Returns the number of messages that are not sent yet.
     * 
     * @return Unsent Returns the number of messages that are not sent yet.
     */
    public int getUnsent() {
        return Unsent;
    }


    /**
     *  Returns the number of messages that are not sent yet.
     * 
     * @param Unsent Returns the number of messages that are not sent yet.
     */
    public void setUnsent(int Unsent) {
        this.Unsent = Unsent;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageStatisticsData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "MessageStatisticsData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Failed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inflight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Inflight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Retry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Unsent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
