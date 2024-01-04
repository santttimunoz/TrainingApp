/**
 * Building_Ext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Information about a building
 */
public class Building_Ext  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Associated ABContact
     */ 
    private com.guidewire.ab.webservices.entity.ABContact ABContact;
    /** 
        Address at which building is located
     */ 
    private com.guidewire.ab.webservices.entity.Address Address;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Building type
     */ 
    private com.guidewire.ab.webservices.enumeration.BuildingType_Ext BuildingType;
    /** 
        Is there a parking structure at this building?
     */ 
    private java.lang.Boolean HasParking;
    /** 
        Date of last inspection NOTE: when inserting a Building_Ext this
 * field must be non-null.
     */ 
    private java.util.Calendar InspectionDate;
    /** 
        Number of employees in this building
     */ 
    private java.lang.Integer NumberOfEmployees;

    public Building_Ext() {
    }

    public Building_Ext(
           com.guidewire.ab.webservices.entity.ABContact ABContact,
           com.guidewire.ab.webservices.entity.Address Address,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.enumeration.BuildingType_Ext BuildingType,
           java.lang.Boolean HasParking,
           java.util.Calendar InspectionDate,
           java.lang.Integer NumberOfEmployees) {
           this.ABContact = ABContact;
           this.Address = Address;
           this.BeanVersion = BeanVersion;
           this.BuildingType = BuildingType;
           this.HasParking = HasParking;
           this.InspectionDate = InspectionDate;
           this.NumberOfEmployees = NumberOfEmployees;
    }


    /**
     *  Associated ABContact
     * 
     * @return ABContact Associated ABContact
     */
    public com.guidewire.ab.webservices.entity.ABContact getABContact() {
        return ABContact;
    }


    /**
     *  Associated ABContact
     * 
     * @param ABContact Associated ABContact
     */
    public void setABContact(com.guidewire.ab.webservices.entity.ABContact ABContact) {
        this.ABContact = ABContact;
    }


    /**
     *  Address at which building is located
     * 
     * @return Address Address at which building is located
     */
    public com.guidewire.ab.webservices.entity.Address getAddress() {
        return Address;
    }


    /**
     *  Address at which building is located
     * 
     * @param Address Address at which building is located
     */
    public void setAddress(com.guidewire.ab.webservices.entity.Address Address) {
        this.Address = Address;
    }


    /**
     *  Auto-incremented object version
     * 
     * @return BeanVersion Auto-incremented object version
     */
    public java.lang.Integer getBeanVersion() {
        return BeanVersion;
    }


    /**
     *  Auto-incremented object version
     * 
     * @param BeanVersion Auto-incremented object version
     */
    public void setBeanVersion(java.lang.Integer BeanVersion) {
        this.BeanVersion = BeanVersion;
    }


    /**
     *  Building type
     * 
     * @return BuildingType Building type
     */
    public com.guidewire.ab.webservices.enumeration.BuildingType_Ext getBuildingType() {
        return BuildingType;
    }


    /**
     *  Building type
     * 
     * @param BuildingType Building type
     */
    public void setBuildingType(com.guidewire.ab.webservices.enumeration.BuildingType_Ext BuildingType) {
        this.BuildingType = BuildingType;
    }


    /**
     *  Is there a parking structure at this building?
     * 
     * @return HasParking Is there a parking structure at this building?
     */
    public java.lang.Boolean getHasParking() {
        return HasParking;
    }


    /**
     *  Is there a parking structure at this building?
     * 
     * @param HasParking Is there a parking structure at this building?
     */
    public void setHasParking(java.lang.Boolean HasParking) {
        this.HasParking = HasParking;
    }


    /**
     *  Date of last inspection NOTE: when inserting a Building_Ext this
 * field must be non-null.
     * 
     * @return InspectionDate Date of last inspection NOTE: when inserting a Building_Ext this
 * field must be non-null.
     */
    public java.util.Calendar getInspectionDate() {
        return InspectionDate;
    }


    /**
     *  Date of last inspection NOTE: when inserting a Building_Ext this
 * field must be non-null.
     * 
     * @param InspectionDate Date of last inspection NOTE: when inserting a Building_Ext this
 * field must be non-null.
     */
    public void setInspectionDate(java.util.Calendar InspectionDate) {
        this.InspectionDate = InspectionDate;
    }


    /**
     *  Number of employees in this building
     * 
     * @return NumberOfEmployees Number of employees in this building
     */
    public java.lang.Integer getNumberOfEmployees() {
        return NumberOfEmployees;
    }


    /**
     *  Number of employees in this building
     * 
     * @param NumberOfEmployees Number of employees in this building
     */
    public void setNumberOfEmployees(java.lang.Integer NumberOfEmployees) {
        this.NumberOfEmployees = NumberOfEmployees;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Building_Ext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Building_Ext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ABContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BuildingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BuildingType_Ext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasParking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasParking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inspectionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InspectionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfEmployees");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumberOfEmployees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
