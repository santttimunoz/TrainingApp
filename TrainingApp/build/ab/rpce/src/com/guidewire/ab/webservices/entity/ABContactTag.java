/**
 * ABContactTag.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * ABContactTag
 */
public class ABContactTag  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        ABContact
     */ 
    private com.guidewire.ab.webservices.entity.ABContact ABContact;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Represents the ID used by client applications to link with the
 * Address Book.
     */ 
    private java.lang.String LinkID;
    /** 
        Type of this ContactTag. NOTE: when inserting a ABContactTag this
 * field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.ContactTagType Type;

    public ABContactTag() {
    }

    public ABContactTag(
           com.guidewire.ab.webservices.entity.ABContact ABContact,
           java.lang.Integer BeanVersion,
           java.lang.String LinkID,
           com.guidewire.ab.webservices.enumeration.ContactTagType Type) {
           this.ABContact = ABContact;
           this.BeanVersion = BeanVersion;
           this.LinkID = LinkID;
           this.Type = Type;
    }


    /**
     *  ABContact
     * 
     * @return ABContact ABContact
     */
    public com.guidewire.ab.webservices.entity.ABContact getABContact() {
        return ABContact;
    }


    /**
     *  ABContact
     * 
     * @param ABContact ABContact
     */
    public void setABContact(com.guidewire.ab.webservices.entity.ABContact ABContact) {
        this.ABContact = ABContact;
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
     *  Represents the ID used by client applications to link with the
 * Address Book.
     * 
     * @return LinkID Represents the ID used by client applications to link with the
 * Address Book.
     */
    public java.lang.String getLinkID() {
        return LinkID;
    }


    /**
     *  Represents the ID used by client applications to link with the
 * Address Book.
     * 
     * @param LinkID Represents the ID used by client applications to link with the
 * Address Book.
     */
    public void setLinkID(java.lang.String LinkID) {
        this.LinkID = LinkID;
    }


    /**
     *  Type of this ContactTag. NOTE: when inserting a ABContactTag this
 * field must be non-null.
     * 
     * @return Type Type of this ContactTag. NOTE: when inserting a ABContactTag this
 * field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.ContactTagType getType() {
        return Type;
    }


    /**
     *  Type of this ContactTag. NOTE: when inserting a ABContactTag this
 * field must be non-null.
     * 
     * @param Type Type of this ContactTag. NOTE: when inserting a ABContactTag this
 * field must be non-null.
     */
    public void setType(com.guidewire.ab.webservices.enumeration.ContactTagType Type) {
        this.Type = Type;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABContactTag.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactTag"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ABContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContact"));
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
        elemField.setFieldName("linkID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
