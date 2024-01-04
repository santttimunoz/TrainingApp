/**
 * ContactTag.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * ContactTag
 */
public class ContactTag  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     */ 
    private java.lang.String AddressBookUID;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Contact
     */ 
    private com.guidewire.ab.webservices.entity.Contact Contact;
    /** 
        Type of this ContactTag. NOTE: when inserting a ContactTag this
 * field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.ContactTagType Type;

    public ContactTag() {
    }

    public ContactTag(
           java.lang.String AddressBookUID,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.Contact Contact,
           com.guidewire.ab.webservices.enumeration.ContactTagType Type) {
           this.AddressBookUID = AddressBookUID;
           this.BeanVersion = BeanVersion;
           this.Contact = Contact;
           this.Type = Type;
    }


    /**
     *  Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     * 
     * @return AddressBookUID Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     */
    public java.lang.String getAddressBookUID() {
        return AddressBookUID;
    }


    /**
     *  Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     * 
     * @param AddressBookUID Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     */
    public void setAddressBookUID(java.lang.String AddressBookUID) {
        this.AddressBookUID = AddressBookUID;
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
     *  Contact
     * 
     * @return Contact Contact
     */
    public com.guidewire.ab.webservices.entity.Contact getContact() {
        return Contact;
    }


    /**
     *  Contact
     * 
     * @param Contact Contact
     */
    public void setContact(com.guidewire.ab.webservices.entity.Contact Contact) {
        this.Contact = Contact;
    }


    /**
     *  Type of this ContactTag. NOTE: when inserting a ContactTag this
 * field must be non-null.
     * 
     * @return Type Type of this ContactTag. NOTE: when inserting a ContactTag this
 * field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.ContactTagType getType() {
        return Type;
    }


    /**
     *  Type of this ContactTag. NOTE: when inserting a ContactTag this
 * field must be non-null.
     * 
     * @param Type Type of this ContactTag. NOTE: when inserting a ContactTag this
 * field must be non-null.
     */
    public void setType(com.guidewire.ab.webservices.enumeration.ContactTagType Type) {
        this.Type = Type;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactTag.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactTag"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressBookUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressBookUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactTagType"));
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
