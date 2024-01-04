/**
 * DataGenInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Stores metadata for database generation info.
 */
public class DataGenInfo  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        the action type this data-gen performed
     */ 
    private com.guidewire.ab.webservices.enumeration.DataGenActionType Action;
    /** 
     */ 
    private java.lang.String BuildVersion;
    /** 
        Info logged by the generation process.
     */ 
    private java.lang.String Description;
    /** 
        Detailed description.
     */ 
    private com.guidewire.ab.webservices.entity.DataGenInfoDetail[] Details;
    /** 
        Time this generation happened. NOTE: when inserting a DataGenInfo
 * this field must be non-null.
     */ 
    private java.util.Calendar PerformDate;
    /** 
     */ 
    private com.guidewire.ab.webservices.enumeration.DataGenStatusType Status;

    public DataGenInfo() {
    }

    public DataGenInfo(
           com.guidewire.ab.webservices.enumeration.DataGenActionType Action,
           java.lang.String BuildVersion,
           java.lang.String Description,
           com.guidewire.ab.webservices.entity.DataGenInfoDetail[] Details,
           java.util.Calendar PerformDate,
           com.guidewire.ab.webservices.enumeration.DataGenStatusType Status) {
           this.Action = Action;
           this.BuildVersion = BuildVersion;
           this.Description = Description;
           this.Details = Details;
           this.PerformDate = PerformDate;
           this.Status = Status;
    }


    /**
     *  the action type this data-gen performed
     * 
     * @return Action the action type this data-gen performed
     */
    public com.guidewire.ab.webservices.enumeration.DataGenActionType getAction() {
        return Action;
    }


    /**
     *  the action type this data-gen performed
     * 
     * @param Action the action type this data-gen performed
     */
    public void setAction(com.guidewire.ab.webservices.enumeration.DataGenActionType Action) {
        this.Action = Action;
    }


    /**
     * 
     * 
     * @return BuildVersion
     */
    public java.lang.String getBuildVersion() {
        return BuildVersion;
    }


    /**
     * 
     * 
     * @param BuildVersion
     */
    public void setBuildVersion(java.lang.String BuildVersion) {
        this.BuildVersion = BuildVersion;
    }


    /**
     *  Info logged by the generation process.
     * 
     * @return Description Info logged by the generation process.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Info logged by the generation process.
     * 
     * @param Description Info logged by the generation process.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  Detailed description.
     * 
     * @return Details Detailed description.
     */
    public com.guidewire.ab.webservices.entity.DataGenInfoDetail[] getDetails() {
        return Details;
    }


    /**
     *  Detailed description.
     * 
     * @param Details Detailed description.
     */
    public void setDetails(com.guidewire.ab.webservices.entity.DataGenInfoDetail[] Details) {
        this.Details = Details;
    }


    /**
     *  Time this generation happened. NOTE: when inserting a DataGenInfo
 * this field must be non-null.
     * 
     * @return PerformDate Time this generation happened. NOTE: when inserting a DataGenInfo
 * this field must be non-null.
     */
    public java.util.Calendar getPerformDate() {
        return PerformDate;
    }


    /**
     *  Time this generation happened. NOTE: when inserting a DataGenInfo
 * this field must be non-null.
     * 
     * @param PerformDate Time this generation happened. NOTE: when inserting a DataGenInfo
 * this field must be non-null.
     */
    public void setPerformDate(java.util.Calendar PerformDate) {
        this.PerformDate = PerformDate;
    }


    /**
     * 
     * 
     * @return Status
     */
    public com.guidewire.ab.webservices.enumeration.DataGenStatusType getStatus() {
        return Status;
    }


    /**
     * 
     * 
     * @param Status
     */
    public void setStatus(com.guidewire.ab.webservices.enumeration.DataGenStatusType Status) {
        this.Status = Status;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataGenInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DataGenInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DataGenActionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BuildVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DataGenInfoDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PerformDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DataGenStatusType"));
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
