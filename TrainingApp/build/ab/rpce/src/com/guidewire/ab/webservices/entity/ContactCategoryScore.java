/**
 * ContactCategoryScore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Table linking Contacts to Category Scores
 */
public class ContactCategoryScore  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
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
        Associated Contact.
     */ 
    private com.guidewire.ab.webservices.entity.Contact Contact;
    /** 
        Category of this Score.
     */ 
    private com.guidewire.ab.webservices.enumeration.ReviewCategory ReviewCategory;
    /** 
     */ 
    private java.lang.Integer Score;

    public ContactCategoryScore() {
    }

    public ContactCategoryScore(
           java.lang.String AddressBookUID,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.Contact Contact,
           com.guidewire.ab.webservices.enumeration.ReviewCategory ReviewCategory,
           java.lang.Integer Score) {
           this.AddressBookUID = AddressBookUID;
           this.BeanVersion = BeanVersion;
           this.Contact = Contact;
           this.ReviewCategory = ReviewCategory;
           this.Score = Score;
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
     *  Associated Contact.
     * 
     * @return Contact Associated Contact.
     */
    public com.guidewire.ab.webservices.entity.Contact getContact() {
        return Contact;
    }


    /**
     *  Associated Contact.
     * 
     * @param Contact Associated Contact.
     */
    public void setContact(com.guidewire.ab.webservices.entity.Contact Contact) {
        this.Contact = Contact;
    }


    /**
     *  Category of this Score.
     * 
     * @return ReviewCategory Category of this Score.
     */
    public com.guidewire.ab.webservices.enumeration.ReviewCategory getReviewCategory() {
        return ReviewCategory;
    }


    /**
     *  Category of this Score.
     * 
     * @param ReviewCategory Category of this Score.
     */
    public void setReviewCategory(com.guidewire.ab.webservices.enumeration.ReviewCategory ReviewCategory) {
        this.ReviewCategory = ReviewCategory;
    }


    /**
     * 
     * 
     * @return Score
     */
    public java.lang.Integer getScore() {
        return Score;
    }


    /**
     * 
     * 
     * @param Score
     */
    public void setScore(java.lang.Integer Score) {
        this.Score = Score;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactCategoryScore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactCategoryScore"));
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
        elemField.setFieldName("reviewCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReviewCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ReviewCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Score"));
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
