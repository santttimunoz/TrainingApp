/**
 * LoadEncryptChunk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Timings for each chuck of encyrption updates
 */
public class LoadEncryptChunk  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Number of statements executed in this chunk NOTE: when inserting
 * a LoadEncryptChunk this field must be non-null.
     */ 
    private java.lang.Integer ChunkSize;
    /** 
        Timestamp when the timing completed.
     */ 
    private java.util.Calendar EndTime;
    /** 
        Parent load encyrption step
     */ 
    private com.guidewire.ab.webservices.entity.LoadEncryptTable LoadEncryptTable;
    /** 
        Timestamp when the timing began.
     */ 
    private java.util.Calendar StartTime;

    public LoadEncryptChunk() {
    }

    public LoadEncryptChunk(
           java.lang.Integer ChunkSize,
           java.util.Calendar EndTime,
           com.guidewire.ab.webservices.entity.LoadEncryptTable LoadEncryptTable,
           java.util.Calendar StartTime) {
           this.ChunkSize = ChunkSize;
           this.EndTime = EndTime;
           this.LoadEncryptTable = LoadEncryptTable;
           this.StartTime = StartTime;
    }


    /**
     *  Number of statements executed in this chunk NOTE: when inserting
 * a LoadEncryptChunk this field must be non-null.
     * 
     * @return ChunkSize Number of statements executed in this chunk NOTE: when inserting
 * a LoadEncryptChunk this field must be non-null.
     */
    public java.lang.Integer getChunkSize() {
        return ChunkSize;
    }


    /**
     *  Number of statements executed in this chunk NOTE: when inserting
 * a LoadEncryptChunk this field must be non-null.
     * 
     * @param ChunkSize Number of statements executed in this chunk NOTE: when inserting
 * a LoadEncryptChunk this field must be non-null.
     */
    public void setChunkSize(java.lang.Integer ChunkSize) {
        this.ChunkSize = ChunkSize;
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
     *  Parent load encyrption step
     * 
     * @return LoadEncryptTable Parent load encyrption step
     */
    public com.guidewire.ab.webservices.entity.LoadEncryptTable getLoadEncryptTable() {
        return LoadEncryptTable;
    }


    /**
     *  Parent load encyrption step
     * 
     * @param LoadEncryptTable Parent load encyrption step
     */
    public void setLoadEncryptTable(com.guidewire.ab.webservices.entity.LoadEncryptTable LoadEncryptTable) {
        this.LoadEncryptTable = LoadEncryptTable;
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
        new org.apache.axis.description.TypeDesc(LoadEncryptChunk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadEncryptChunk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chunkSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChunkSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
        elemField.setFieldName("loadEncryptTable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadEncryptTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadEncryptTable"));
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
