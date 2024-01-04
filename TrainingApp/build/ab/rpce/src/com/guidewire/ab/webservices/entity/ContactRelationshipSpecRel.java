/**
 * ContactRelationshipSpecRel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Wraps around contact relationships. See the <code>ContactRel</code>
 * entity for a list of contact relationships.
 *       The <code.ContactRelationshipSpecRel</code> entity exists so
 * that <code>ContactRelationshipSpec</code> can use its
 *       objects as entries in its arrays.
 */
public class ContactRelationshipSpecRel  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Type of relationship. NOTE: when inserting a ContactRelationshipSpecRel
 * this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.ContactRel Relationship;
    /** 
        Source relationship.
     */ 
    private com.guidewire.ab.webservices.entity.ContactRelationshipSpec Source;
    /** 
        Target relationship.
     */ 
    private com.guidewire.ab.webservices.entity.ContactRelationshipSpec Target;

    public ContactRelationshipSpecRel() {
    }

    public ContactRelationshipSpecRel(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.enumeration.ContactRel Relationship,
           com.guidewire.ab.webservices.entity.ContactRelationshipSpec Source,
           com.guidewire.ab.webservices.entity.ContactRelationshipSpec Target) {
           this.BeanVersion = BeanVersion;
           this.Relationship = Relationship;
           this.Source = Source;
           this.Target = Target;
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
     *  Type of relationship. NOTE: when inserting a ContactRelationshipSpecRel
 * this field must be non-null.
     * 
     * @return Relationship Type of relationship. NOTE: when inserting a ContactRelationshipSpecRel
 * this field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.ContactRel getRelationship() {
        return Relationship;
    }


    /**
     *  Type of relationship. NOTE: when inserting a ContactRelationshipSpecRel
 * this field must be non-null.
     * 
     * @param Relationship Type of relationship. NOTE: when inserting a ContactRelationshipSpecRel
 * this field must be non-null.
     */
    public void setRelationship(com.guidewire.ab.webservices.enumeration.ContactRel Relationship) {
        this.Relationship = Relationship;
    }


    /**
     *  Source relationship.
     * 
     * @return Source Source relationship.
     */
    public com.guidewire.ab.webservices.entity.ContactRelationshipSpec getSource() {
        return Source;
    }


    /**
     *  Source relationship.
     * 
     * @param Source Source relationship.
     */
    public void setSource(com.guidewire.ab.webservices.entity.ContactRelationshipSpec Source) {
        this.Source = Source;
    }


    /**
     *  Target relationship.
     * 
     * @return Target Target relationship.
     */
    public com.guidewire.ab.webservices.entity.ContactRelationshipSpec getTarget() {
        return Target;
    }


    /**
     *  Target relationship.
     * 
     * @param Target Target relationship.
     */
    public void setTarget(com.guidewire.ab.webservices.entity.ContactRelationshipSpec Target) {
        this.Target = Target;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactRelationshipSpecRel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactRelationshipSpecRel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactRelationshipSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactRelationshipSpec"));
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
