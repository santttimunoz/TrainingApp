/**
 * ValidationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * <p>ValidationResult is used to read and write results of an object's
 * validation (e.g. validation via rules, or field level validation).</p>
 * <p>ValidationResult stores both entity level errors (general errors
 * not associated with a particular field) and field level errors (errors
 * associated with a particular field on an entity).</p>
 *       <p>A FieldValidation object can store the bad value which triggered
 * the error (e.g. a mangled loss date that was imported with the claim)
 * and may also suggests possible correct values,
 *       either as a list of objects or foreign keys (if the field is
 * a foreign key, e.g. picking from a set of users with the last name
 * "Shaw" if the imported ClaimDef only identifies "Shaw" as the owner).
 * See FieldValidation to learn what information may be captured with
 * an invalid field.</p>
 */
public class ValidationResult  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
     */ 
    private com.guidewire.ab.webservices.entity.EntityValidation[] EntityValidations;

    public ValidationResult() {
    }

    public ValidationResult(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.EntityValidation[] EntityValidations) {
           this.BeanVersion = BeanVersion;
           this.EntityValidations = EntityValidations;
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
     * @return EntityValidations
     */
    public com.guidewire.ab.webservices.entity.EntityValidation[] getEntityValidations() {
        return EntityValidations;
    }


    /**
     * 
     * 
     * @param EntityValidations
     */
    public void setEntityValidations(com.guidewire.ab.webservices.entity.EntityValidation[] EntityValidations) {
        this.EntityValidations = EntityValidations;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ValidationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityValidations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntityValidations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "EntityValidation"));
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
