/**
 * DatabaseSnapshotInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class DatabaseSnapshotInfo  implements java.io.Serializable {
    /** 
     */ 
    private java.util.Calendar BeginIntervalTime;
    /** 
     */ 
    private java.lang.String Description;
    /** 
     */ 
    private int Id;
    /** 
     */ 
    private java.util.Calendar SnapTime;
    /** 
     */ 
    private boolean SnapshotChosen;
    /** 
     */ 
    private java.util.Calendar StartupTime;

    public DatabaseSnapshotInfo() {
    }

    public DatabaseSnapshotInfo(
           java.util.Calendar BeginIntervalTime,
           java.lang.String Description,
           int Id,
           java.util.Calendar SnapTime,
           boolean SnapshotChosen,
           java.util.Calendar StartupTime) {
           this.BeginIntervalTime = BeginIntervalTime;
           this.Description = Description;
           this.Id = Id;
           this.SnapTime = SnapTime;
           this.SnapshotChosen = SnapshotChosen;
           this.StartupTime = StartupTime;
    }


    /**
     * 
     * 
     * @return BeginIntervalTime
     */
    public java.util.Calendar getBeginIntervalTime() {
        return BeginIntervalTime;
    }


    /**
     * 
     * 
     * @param BeginIntervalTime
     */
    public void setBeginIntervalTime(java.util.Calendar BeginIntervalTime) {
        this.BeginIntervalTime = BeginIntervalTime;
    }


    /**
     * 
     * 
     * @return Description
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     * 
     * 
     * @param Description
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     * 
     * 
     * @return Id
     */
    public int getId() {
        return Id;
    }


    /**
     * 
     * 
     * @param Id
     */
    public void setId(int Id) {
        this.Id = Id;
    }


    /**
     * 
     * 
     * @return SnapTime
     */
    public java.util.Calendar getSnapTime() {
        return SnapTime;
    }


    /**
     * 
     * 
     * @param SnapTime
     */
    public void setSnapTime(java.util.Calendar SnapTime) {
        this.SnapTime = SnapTime;
    }


    /**
     * 
     * 
     * @return SnapshotChosen
     */
    public boolean isSnapshotChosen() {
        return SnapshotChosen;
    }


    /**
     * 
     * 
     * @param SnapshotChosen
     */
    public void setSnapshotChosen(boolean SnapshotChosen) {
        this.SnapshotChosen = SnapshotChosen;
    }


    /**
     * 
     * 
     * @return StartupTime
     */
    public java.util.Calendar getStartupTime() {
        return StartupTime;
    }


    /**
     * 
     * 
     * @param StartupTime
     */
    public void setStartupTime(java.util.Calendar StartupTime) {
        this.StartupTime = StartupTime;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatabaseSnapshotInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DatabaseSnapshotInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginIntervalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeginIntervalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SnapTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotChosen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SnapshotChosen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartupTime"));
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
