/**
 * ValidationIssue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * <p>Supertype for validation errors and warnings.</p>
 */
public class ValidationIssue  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
     */ 
    private com.guidewire.ab.webservices.entity.EntityValidation EntityValidation;
    /** 
     */ 
    private java.lang.String FlowStepId;
    /** 
        null NOTE: when inserting a ValidationIssue this field must be
 * non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.ValidationLevel Level;
    /** 
        null NOTE: when inserting a ValidationIssue this field must be
 * non-null.
     */ 
    private java.lang.String Reason;
    /** 
     */ 
    private com.guidewire.ab.webservices.enumeration.ValidationIssueType Type;

    public ValidationIssue() {
    }

    public ValidationIssue(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.EntityValidation EntityValidation,
           java.lang.String FlowStepId,
           com.guidewire.ab.webservices.enumeration.ValidationLevel Level,
           java.lang.String Reason,
           com.guidewire.ab.webservices.enumeration.ValidationIssueType Type) {
           this.BeanVersion = BeanVersion;
           this.EntityValidation = EntityValidation;
           this.FlowStepId = FlowStepId;
           this.Level = Level;
           this.Reason = Reason;
           this.Type = Type;
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
     * @return EntityValidation
     */
    public com.guidewire.ab.webservices.entity.EntityValidation getEntityValidation() {
        return EntityValidation;
    }


    /**
     * 
     * 
     * @param EntityValidation
     */
    public void setEntityValidation(com.guidewire.ab.webservices.entity.EntityValidation EntityValidation) {
        this.EntityValidation = EntityValidation;
    }


    /**
     * 
     * 
     * @return FlowStepId
     */
    public java.lang.String getFlowStepId() {
        return FlowStepId;
    }


    /**
     * 
     * 
     * @param FlowStepId
     */
    public void setFlowStepId(java.lang.String FlowStepId) {
        this.FlowStepId = FlowStepId;
    }


    /**
     *  null NOTE: when inserting a ValidationIssue this field must be
 * non-null.
     * 
     * @return Level null NOTE: when inserting a ValidationIssue this field must be
 * non-null.
     */
    public com.guidewire.ab.webservices.enumeration.ValidationLevel getLevel() {
        return Level;
    }


    /**
     *  null NOTE: when inserting a ValidationIssue this field must be
 * non-null.
     * 
     * @param Level null NOTE: when inserting a ValidationIssue this field must be
 * non-null.
     */
    public void setLevel(com.guidewire.ab.webservices.enumeration.ValidationLevel Level) {
        this.Level = Level;
    }


    /**
     *  null NOTE: when inserting a ValidationIssue this field must be
 * non-null.
     * 
     * @return Reason null NOTE: when inserting a ValidationIssue this field must be
 * non-null.
     */
    public java.lang.String getReason() {
        return Reason;
    }


    /**
     *  null NOTE: when inserting a ValidationIssue this field must be
 * non-null.
     * 
     * @param Reason null NOTE: when inserting a ValidationIssue this field must be
 * non-null.
     */
    public void setReason(java.lang.String Reason) {
        this.Reason = Reason;
    }


    /**
     * 
     * 
     * @return Type
     */
    public com.guidewire.ab.webservices.enumeration.ValidationIssueType getType() {
        return Type;
    }


    /**
     * 
     * 
     * @param Type
     */
    public void setType(com.guidewire.ab.webservices.enumeration.ValidationIssueType Type) {
        this.Type = Type;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidationIssue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ValidationIssue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityValidation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntityValidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "EntityValidation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowStepId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FlowStepId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ValidationLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ValidationIssueType"));
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
