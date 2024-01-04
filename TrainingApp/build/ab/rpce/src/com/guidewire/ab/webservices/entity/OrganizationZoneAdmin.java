/**
 * OrganizationZoneAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Join table between the organization and the zone, to see which
 * zones an organization can admin over.
 */
public class OrganizationZoneAdmin  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        The country to which the zone belongs. NOTE: when inserting a OrganizationZoneAdmin
 * this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.Country Country;
    /** 
        Fk to the Organization
     */ 
    private com.guidewire.ab.webservices.entity.Organization Organization;
    /** 
        Code of the zone NOTE: when inserting a OrganizationZoneAdmin this
 * field must be non-null.
     */ 
    private java.lang.String ZoneCode;
    /** 
        Type of zone. NOTE: when inserting a OrganizationZoneAdmin this
 * field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.ZoneType ZoneType;

    public OrganizationZoneAdmin() {
    }

    public OrganizationZoneAdmin(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.enumeration.Country Country,
           com.guidewire.ab.webservices.entity.Organization Organization,
           java.lang.String ZoneCode,
           com.guidewire.ab.webservices.enumeration.ZoneType ZoneType) {
           this.BeanVersion = BeanVersion;
           this.Country = Country;
           this.Organization = Organization;
           this.ZoneCode = ZoneCode;
           this.ZoneType = ZoneType;
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
     *  The country to which the zone belongs. NOTE: when inserting a OrganizationZoneAdmin
 * this field must be non-null.
     * 
     * @return Country The country to which the zone belongs. NOTE: when inserting a OrganizationZoneAdmin
 * this field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.Country getCountry() {
        return Country;
    }


    /**
     *  The country to which the zone belongs. NOTE: when inserting a OrganizationZoneAdmin
 * this field must be non-null.
     * 
     * @param Country The country to which the zone belongs. NOTE: when inserting a OrganizationZoneAdmin
 * this field must be non-null.
     */
    public void setCountry(com.guidewire.ab.webservices.enumeration.Country Country) {
        this.Country = Country;
    }


    /**
     *  Fk to the Organization
     * 
     * @return Organization Fk to the Organization
     */
    public com.guidewire.ab.webservices.entity.Organization getOrganization() {
        return Organization;
    }


    /**
     *  Fk to the Organization
     * 
     * @param Organization Fk to the Organization
     */
    public void setOrganization(com.guidewire.ab.webservices.entity.Organization Organization) {
        this.Organization = Organization;
    }


    /**
     *  Code of the zone NOTE: when inserting a OrganizationZoneAdmin this
 * field must be non-null.
     * 
     * @return ZoneCode Code of the zone NOTE: when inserting a OrganizationZoneAdmin this
 * field must be non-null.
     */
    public java.lang.String getZoneCode() {
        return ZoneCode;
    }


    /**
     *  Code of the zone NOTE: when inserting a OrganizationZoneAdmin this
 * field must be non-null.
     * 
     * @param ZoneCode Code of the zone NOTE: when inserting a OrganizationZoneAdmin this
 * field must be non-null.
     */
    public void setZoneCode(java.lang.String ZoneCode) {
        this.ZoneCode = ZoneCode;
    }


    /**
     *  Type of zone. NOTE: when inserting a OrganizationZoneAdmin this
 * field must be non-null.
     * 
     * @return ZoneType Type of zone. NOTE: when inserting a OrganizationZoneAdmin this
 * field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.ZoneType getZoneType() {
        return ZoneType;
    }


    /**
     *  Type of zone. NOTE: when inserting a OrganizationZoneAdmin this
 * field must be non-null.
     * 
     * @param ZoneType Type of zone. NOTE: when inserting a OrganizationZoneAdmin this
 * field must be non-null.
     */
    public void setZoneType(com.guidewire.ab.webservices.enumeration.ZoneType ZoneType) {
        this.ZoneType = ZoneType;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationZoneAdmin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "OrganizationZoneAdmin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Organization"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZoneCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZoneType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ZoneType"));
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
