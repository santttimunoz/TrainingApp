/**
 * ValidationWarning.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Describes a single validation warning sent to the address book
 */
public class ValidationWarning  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Associated UpdateBatch.
     */ 
    private com.guidewire.ab.webservices.entity.UpdateBatch UpdateBatch;
    /** 
     */ 
    private java.lang.String Warning;

    public ValidationWarning() {
    }

    public ValidationWarning(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.UpdateBatch UpdateBatch,
           java.lang.String Warning) {
           this.BeanVersion = BeanVersion;
           this.UpdateBatch = UpdateBatch;
           this.Warning = Warning;
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
     *  Associated UpdateBatch.
     * 
     * @return UpdateBatch Associated UpdateBatch.
     */
    public com.guidewire.ab.webservices.entity.UpdateBatch getUpdateBatch() {
        return UpdateBatch;
    }


    /**
     *  Associated UpdateBatch.
     * 
     * @param UpdateBatch Associated UpdateBatch.
     */
    public void setUpdateBatch(com.guidewire.ab.webservices.entity.UpdateBatch UpdateBatch) {
        this.UpdateBatch = UpdateBatch;
    }


    /**
     * 
     * 
     * @return Warning
     */
    public java.lang.String getWarning() {
        return Warning;
    }


    /**
     * 
     * 
     * @param Warning
     */
    public void setWarning(java.lang.String Warning) {
        this.Warning = Warning;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidationWarning.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ValidationWarning"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateBatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UpdateBatch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
