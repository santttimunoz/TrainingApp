/**
 * FieldValidation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Field validation error or warning raised on an entity
 */
public class FieldValidation  extends com.guidewire.ab.webservices.entity.ValidationIssue  implements java.io.Serializable {
    /** 
     */ 
    private java.lang.String BadValue;
    /** 
        null NOTE: when inserting a FieldValidation this field must be
 * non-null.
     */ 
    private java.lang.String FieldName;

    public FieldValidation() {
    }

    public FieldValidation(
           java.lang.String BadValue,
           java.lang.String FieldName) {
           this.BadValue = BadValue;
           this.FieldName = FieldName;
    }


    /**
     * 
     * 
     * @return BadValue
     */
    public java.lang.String getBadValue() {
        return BadValue;
    }


    /**
     * 
     * 
     * @param BadValue
     */
    public void setBadValue(java.lang.String BadValue) {
        this.BadValue = BadValue;
    }


    /**
     *  null NOTE: when inserting a FieldValidation this field must be
 * non-null.
     * 
     * @return FieldName null NOTE: when inserting a FieldValidation this field must be
 * non-null.
     */
    public java.lang.String getFieldName() {
        return FieldName;
    }


    /**
     *  null NOTE: when inserting a FieldValidation this field must be
 * non-null.
     * 
     * @param FieldName null NOTE: when inserting a FieldValidation this field must be
 * non-null.
     */
    public void setFieldName(java.lang.String FieldName) {
        this.FieldName = FieldName;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldValidation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldValidation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("badValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BadValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
