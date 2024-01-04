/**
 * ContactRelationshipSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Represents a specification of relationships to retrieve/sync from
 * the Address Book. The set of relationships to
 *       retrieve from the Address Book is specified in contact-sync-config.xml.
 * Each of the contactBidiRel that is specified
 *       in &lt;IncludeRelationship&gt; in the contact-sync-config.xml
 * is called "Syncable Relationship". A ContactRelationshipSpec
 *       contains two sets of syncable relationships, "SourceRelationships"
 * and "TargetRelationships" which is grouped according to
 *       the contactBidiRel. This entity has been deprecated as of ClaimCenter
 * 8.0 along with the IAddressBookAdapter plugin.
 */
public class ContactRelationshipSpec  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Relationships that the contact is on the source side.
     */ 
    private com.guidewire.ab.webservices.entity.ContactRelationshipSpecRel[] SourceRelationships;
    /** 
        Relationships that the contact is on the target side.
     */ 
    private com.guidewire.ab.webservices.entity.ContactRelationshipSpecRel[] TargetRelationships;

    public ContactRelationshipSpec() {
    }

    public ContactRelationshipSpec(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.ContactRelationshipSpecRel[] SourceRelationships,
           com.guidewire.ab.webservices.entity.ContactRelationshipSpecRel[] TargetRelationships) {
           this.BeanVersion = BeanVersion;
           this.SourceRelationships = SourceRelationships;
           this.TargetRelationships = TargetRelationships;
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
     *  Relationships that the contact is on the source side.
     * 
     * @return SourceRelationships Relationships that the contact is on the source side.
     */
    public com.guidewire.ab.webservices.entity.ContactRelationshipSpecRel[] getSourceRelationships() {
        return SourceRelationships;
    }


    /**
     *  Relationships that the contact is on the source side.
     * 
     * @param SourceRelationships Relationships that the contact is on the source side.
     */
    public void setSourceRelationships(com.guidewire.ab.webservices.entity.ContactRelationshipSpecRel[] SourceRelationships) {
        this.SourceRelationships = SourceRelationships;
    }


    /**
     *  Relationships that the contact is on the target side.
     * 
     * @return TargetRelationships Relationships that the contact is on the target side.
     */
    public com.guidewire.ab.webservices.entity.ContactRelationshipSpecRel[] getTargetRelationships() {
        return TargetRelationships;
    }


    /**
     *  Relationships that the contact is on the target side.
     * 
     * @param TargetRelationships Relationships that the contact is on the target side.
     */
    public void setTargetRelationships(com.guidewire.ab.webservices.entity.ContactRelationshipSpecRel[] TargetRelationships) {
        this.TargetRelationships = TargetRelationships;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactRelationshipSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactRelationshipSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceRelationships");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceRelationships"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactRelationshipSpecRel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetRelationships");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetRelationships"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactRelationshipSpecRel"));
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
