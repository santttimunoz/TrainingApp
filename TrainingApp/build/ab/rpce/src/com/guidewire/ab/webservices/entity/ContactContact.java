/**
 * ContactContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * <p>
 *       Links <code>Contact</code> objects to other contacts. Each link
 * has a specific relationship. See the <code>ContactRel</code> typelist
 * for
 *       a list of the possible link relationships. The purpose of this
 * table is to avoid a self-referencing foreign key on
 *       <code>Contact</code>, and to allow contacts to relate to one
 * another in different ways.</p>
 *       <p>For example, imagine a <code>ContactContact</code> entity
 * with the following values:</p>
 *       <ul><li>SourceContactID: ID of Person A</li>
 *           <li>Relationship: Employer</li>
 *           <li>RelatedContactID: ID of Company B</li>
 *       </ul>
 *       <p>
 *       Then the relationship between A and B is: Company B is the Employer
 * of Person A.</p>
 */
public class ContactContact  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
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
        "RelatedContactID" is the "Relationship" of "SourceContactID".
     */ 
    private com.guidewire.ab.webservices.entity.Contact RelatedContact;
    /** 
        Relationship between the two contacts. NOTE: when inserting a ContactContact
 * this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.ContactRel Relationship;
    /** 
        "SourceContactID" has "RelatedContactID" as "Relationship".
     */ 
    private com.guidewire.ab.webservices.entity.Contact SourceContact;

    public ContactContact() {
    }

    public ContactContact(
           java.lang.String AddressBookUID,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.Contact RelatedContact,
           com.guidewire.ab.webservices.enumeration.ContactRel Relationship,
           com.guidewire.ab.webservices.entity.Contact SourceContact) {
           this.AddressBookUID = AddressBookUID;
           this.BeanVersion = BeanVersion;
           this.RelatedContact = RelatedContact;
           this.Relationship = Relationship;
           this.SourceContact = SourceContact;
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
     *  "RelatedContactID" is the "Relationship" of "SourceContactID".
     * 
     * @return RelatedContact "RelatedContactID" is the "Relationship" of "SourceContactID".
     */
    public com.guidewire.ab.webservices.entity.Contact getRelatedContact() {
        return RelatedContact;
    }


    /**
     *  "RelatedContactID" is the "Relationship" of "SourceContactID".
     * 
     * @param RelatedContact "RelatedContactID" is the "Relationship" of "SourceContactID".
     */
    public void setRelatedContact(com.guidewire.ab.webservices.entity.Contact RelatedContact) {
        this.RelatedContact = RelatedContact;
    }


    /**
     *  Relationship between the two contacts. NOTE: when inserting a ContactContact
 * this field must be non-null.
     * 
     * @return Relationship Relationship between the two contacts. NOTE: when inserting a ContactContact
 * this field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.ContactRel getRelationship() {
        return Relationship;
    }


    /**
     *  Relationship between the two contacts. NOTE: when inserting a ContactContact
 * this field must be non-null.
     * 
     * @param Relationship Relationship between the two contacts. NOTE: when inserting a ContactContact
 * this field must be non-null.
     */
    public void setRelationship(com.guidewire.ab.webservices.enumeration.ContactRel Relationship) {
        this.Relationship = Relationship;
    }


    /**
     *  "SourceContactID" has "RelatedContactID" as "Relationship".
     * 
     * @return SourceContact "SourceContactID" has "RelatedContactID" as "Relationship".
     */
    public com.guidewire.ab.webservices.entity.Contact getSourceContact() {
        return SourceContact;
    }


    /**
     *  "SourceContactID" has "RelatedContactID" as "Relationship".
     * 
     * @param SourceContact "SourceContactID" has "RelatedContactID" as "Relationship".
     */
    public void setSourceContact(com.guidewire.ab.webservices.entity.Contact SourceContact) {
        this.SourceContact = SourceContact;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactContact"));
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
        elemField.setFieldName("relatedContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RelatedContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationship");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Relationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactRel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Contact"));
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
