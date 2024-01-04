/**
 * OfficialID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Represents the pairing of a given official ID number and a jurisdiction.
 * Examples of these would
 *       include the pairing of a state and a drivers license number
 * or state tax ID number.  Multiple OfficialIDs
 *       can be associated with a given Contact.
 */
public class OfficialID  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
     */ 
    private com.guidewire.ab.webservices.entity.Contact Contact;
    /** 
        The type of this official id. NOTE: when inserting a OfficialID
 * this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.OfficialIDType OfficialIDType;
    /** 
        This official id's value, such as a social security number or drivers'
 * license number.
     */ 
    private java.lang.String OfficialIDValue;
    /** 
        Jurisdiction.
     */ 
    private com.guidewire.ab.webservices.enumeration.Jurisdiction State;

    public OfficialID() {
    }

    public OfficialID(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.Contact Contact,
           com.guidewire.ab.webservices.enumeration.OfficialIDType OfficialIDType,
           java.lang.String OfficialIDValue,
           com.guidewire.ab.webservices.enumeration.Jurisdiction State) {
           this.BeanVersion = BeanVersion;
           this.Contact = Contact;
           this.OfficialIDType = OfficialIDType;
           this.OfficialIDValue = OfficialIDValue;
           this.State = State;
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
     * 
     * 
     * @return Contact
     */
    public com.guidewire.ab.webservices.entity.Contact getContact() {
        return Contact;
    }


    /**
     * 
     * 
     * @param Contact
     */
    public void setContact(com.guidewire.ab.webservices.entity.Contact Contact) {
        this.Contact = Contact;
    }


    /**
     *  The type of this official id. NOTE: when inserting a OfficialID
 * this field must be non-null.
     * 
     * @return OfficialIDType The type of this official id. NOTE: when inserting a OfficialID
 * this field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.OfficialIDType getOfficialIDType() {
        return OfficialIDType;
    }


    /**
     *  The type of this official id. NOTE: when inserting a OfficialID
 * this field must be non-null.
     * 
     * @param OfficialIDType The type of this official id. NOTE: when inserting a OfficialID
 * this field must be non-null.
     */
    public void setOfficialIDType(com.guidewire.ab.webservices.enumeration.OfficialIDType OfficialIDType) {
        this.OfficialIDType = OfficialIDType;
    }


    /**
     *  This official id's value, such as a social security number or drivers'
 * license number.
     * 
     * @return OfficialIDValue This official id's value, such as a social security number or drivers'
 * license number.
     */
    public java.lang.String getOfficialIDValue() {
        return OfficialIDValue;
    }


    /**
     *  This official id's value, such as a social security number or drivers'
 * license number.
     * 
     * @param OfficialIDValue This official id's value, such as a social security number or drivers'
 * license number.
     */
    public void setOfficialIDValue(java.lang.String OfficialIDValue) {
        this.OfficialIDValue = OfficialIDValue;
    }


    /**
     *  Jurisdiction.
     * 
     * @return State Jurisdiction.
     */
    public com.guidewire.ab.webservices.enumeration.Jurisdiction getState() {
        return State;
    }


    /**
     *  Jurisdiction.
     * 
     * @param State Jurisdiction.
     */
    public void setState(com.guidewire.ab.webservices.enumeration.Jurisdiction State) {
        this.State = State;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfficialID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "OfficialID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officialIDType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OfficialIDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "OfficialIDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officialIDValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OfficialIDValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Jurisdiction"));
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
