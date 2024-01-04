/**
 * EntityValidation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Validation on a specific entity
 */
public class EntityValidation  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        ID of the entity NOTE: when inserting a EntityValidation this field
 * must be non-null.
     */ 
    private java.lang.Long EntityId;
    /** 
        What kind of entity NOTE: when inserting a EntityValidation this
 * field must be non-null.
     */ 
    private java.lang.String EntityType;
    /** 
     */ 
    private com.guidewire.ab.webservices.entity.FieldValidation[] FieldValidations;
    /** 
     */ 
    private com.guidewire.ab.webservices.entity.GeneralValidation[] GeneralValidations;
    /** 
     */ 
    private com.guidewire.ab.webservices.entity.ValidationResult OwningValidationResult;

    public EntityValidation() {
    }

    public EntityValidation(
           java.lang.Integer BeanVersion,
           java.lang.Long EntityId,
           java.lang.String EntityType,
           com.guidewire.ab.webservices.entity.FieldValidation[] FieldValidations,
           com.guidewire.ab.webservices.entity.GeneralValidation[] GeneralValidations,
           com.guidewire.ab.webservices.entity.ValidationResult OwningValidationResult) {
           this.BeanVersion = BeanVersion;
           this.EntityId = EntityId;
           this.EntityType = EntityType;
           this.FieldValidations = FieldValidations;
           this.GeneralValidations = GeneralValidations;
           this.OwningValidationResult = OwningValidationResult;
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
     *  ID of the entity NOTE: when inserting a EntityValidation this field
 * must be non-null.
     * 
     * @return EntityId ID of the entity NOTE: when inserting a EntityValidation this field
 * must be non-null.
     */
    public java.lang.Long getEntityId() {
        return EntityId;
    }


    /**
     *  ID of the entity NOTE: when inserting a EntityValidation this field
 * must be non-null.
     * 
     * @param EntityId ID of the entity NOTE: when inserting a EntityValidation this field
 * must be non-null.
     */
    public void setEntityId(java.lang.Long EntityId) {
        this.EntityId = EntityId;
    }


    /**
     *  What kind of entity NOTE: when inserting a EntityValidation this
 * field must be non-null.
     * 
     * @return EntityType What kind of entity NOTE: when inserting a EntityValidation this
 * field must be non-null.
     */
    public java.lang.String getEntityType() {
        return EntityType;
    }


    /**
     *  What kind of entity NOTE: when inserting a EntityValidation this
 * field must be non-null.
     * 
     * @param EntityType What kind of entity NOTE: when inserting a EntityValidation this
 * field must be non-null.
     */
    public void setEntityType(java.lang.String EntityType) {
        this.EntityType = EntityType;
    }


    /**
     * 
     * 
     * @return FieldValidations
     */
    public com.guidewire.ab.webservices.entity.FieldValidation[] getFieldValidations() {
        return FieldValidations;
    }


    /**
     * 
     * 
     * @param FieldValidations
     */
    public void setFieldValidations(com.guidewire.ab.webservices.entity.FieldValidation[] FieldValidations) {
        this.FieldValidations = FieldValidations;
    }


    /**
     * 
     * 
     * @return GeneralValidations
     */
    public com.guidewire.ab.webservices.entity.GeneralValidation[] getGeneralValidations() {
        return GeneralValidations;
    }


    /**
     * 
     * 
     * @param GeneralValidations
     */
    public void setGeneralValidations(com.guidewire.ab.webservices.entity.GeneralValidation[] GeneralValidations) {
        this.GeneralValidations = GeneralValidations;
    }


    /**
     * 
     * 
     * @return OwningValidationResult
     */
    public com.guidewire.ab.webservices.entity.ValidationResult getOwningValidationResult() {
        return OwningValidationResult;
    }


    /**
     * 
     * 
     * @param OwningValidationResult
     */
    public void setOwningValidationResult(com.guidewire.ab.webservices.entity.ValidationResult OwningValidationResult) {
        this.OwningValidationResult = OwningValidationResult;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityValidation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "EntityValidation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValidations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FieldValidations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldValidation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalValidations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GeneralValidations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "GeneralValidation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owningValidationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OwningValidationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ValidationResult"));
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
