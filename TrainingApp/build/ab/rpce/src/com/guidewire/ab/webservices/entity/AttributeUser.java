/**
 * AttributeUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Links an Attribute entity with a User entity. An Attribute is a
 * general-purpose characteristic you can associate with one or more
 * users.
 */
public class AttributeUser  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        The associated attribute. NOTE: when inserting a AttributeUser
 * this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.entity.Attribute Attribute;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        General-purpose date field.
     */ 
    private java.util.Calendar DateField1;
    /** 
        General-purpose date field.
     */ 
    private java.util.Calendar DateField2;
    /** 
        General-purpose date field.
     */ 
    private java.util.Calendar DateField3;
    /** 
        The state in which this attribute is applicable.
     */ 
    private com.guidewire.ab.webservices.enumeration.State State;
    /** 
        General-purpose text field.
     */ 
    private java.lang.String TextField1;
    /** 
        General-purpose text field.
     */ 
    private java.lang.String TextField2;
    /** 
        General-purpose text field.
     */ 
    private java.lang.String TextField3;
    /** 
        The attribute value for this user.
     */ 
    private java.lang.Integer Value;

    public AttributeUser() {
    }

    public AttributeUser(
           com.guidewire.ab.webservices.entity.Attribute Attribute,
           java.lang.Integer BeanVersion,
           java.util.Calendar DateField1,
           java.util.Calendar DateField2,
           java.util.Calendar DateField3,
           com.guidewire.ab.webservices.enumeration.State State,
           java.lang.String TextField1,
           java.lang.String TextField2,
           java.lang.String TextField3,
           java.lang.Integer Value) {
           this.Attribute = Attribute;
           this.BeanVersion = BeanVersion;
           this.DateField1 = DateField1;
           this.DateField2 = DateField2;
           this.DateField3 = DateField3;
           this.State = State;
           this.TextField1 = TextField1;
           this.TextField2 = TextField2;
           this.TextField3 = TextField3;
           this.Value = Value;
    }


    /**
     *  The associated attribute. NOTE: when inserting a AttributeUser
 * this field must be non-null.
     * 
     * @return Attribute The associated attribute. NOTE: when inserting a AttributeUser
 * this field must be non-null.
     */
    public com.guidewire.ab.webservices.entity.Attribute getAttribute() {
        return Attribute;
    }


    /**
     *  The associated attribute. NOTE: when inserting a AttributeUser
 * this field must be non-null.
     * 
     * @param Attribute The associated attribute. NOTE: when inserting a AttributeUser
 * this field must be non-null.
     */
    public void setAttribute(com.guidewire.ab.webservices.entity.Attribute Attribute) {
        this.Attribute = Attribute;
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
     *  General-purpose date field.
     * 
     * @return DateField1 General-purpose date field.
     */
    public java.util.Calendar getDateField1() {
        return DateField1;
    }


    /**
     *  General-purpose date field.
     * 
     * @param DateField1 General-purpose date field.
     */
    public void setDateField1(java.util.Calendar DateField1) {
        this.DateField1 = DateField1;
    }


    /**
     *  General-purpose date field.
     * 
     * @return DateField2 General-purpose date field.
     */
    public java.util.Calendar getDateField2() {
        return DateField2;
    }


    /**
     *  General-purpose date field.
     * 
     * @param DateField2 General-purpose date field.
     */
    public void setDateField2(java.util.Calendar DateField2) {
        this.DateField2 = DateField2;
    }


    /**
     *  General-purpose date field.
     * 
     * @return DateField3 General-purpose date field.
     */
    public java.util.Calendar getDateField3() {
        return DateField3;
    }


    /**
     *  General-purpose date field.
     * 
     * @param DateField3 General-purpose date field.
     */
    public void setDateField3(java.util.Calendar DateField3) {
        this.DateField3 = DateField3;
    }


    /**
     *  The state in which this attribute is applicable.
     * 
     * @return State The state in which this attribute is applicable.
     */
    public com.guidewire.ab.webservices.enumeration.State getState() {
        return State;
    }


    /**
     *  The state in which this attribute is applicable.
     * 
     * @param State The state in which this attribute is applicable.
     */
    public void setState(com.guidewire.ab.webservices.enumeration.State State) {
        this.State = State;
    }


    /**
     *  General-purpose text field.
     * 
     * @return TextField1 General-purpose text field.
     */
    public java.lang.String getTextField1() {
        return TextField1;
    }


    /**
     *  General-purpose text field.
     * 
     * @param TextField1 General-purpose text field.
     */
    public void setTextField1(java.lang.String TextField1) {
        this.TextField1 = TextField1;
    }


    /**
     *  General-purpose text field.
     * 
     * @return TextField2 General-purpose text field.
     */
    public java.lang.String getTextField2() {
        return TextField2;
    }


    /**
     *  General-purpose text field.
     * 
     * @param TextField2 General-purpose text field.
     */
    public void setTextField2(java.lang.String TextField2) {
        this.TextField2 = TextField2;
    }


    /**
     *  General-purpose text field.
     * 
     * @return TextField3 General-purpose text field.
     */
    public java.lang.String getTextField3() {
        return TextField3;
    }


    /**
     *  General-purpose text field.
     * 
     * @param TextField3 General-purpose text field.
     */
    public void setTextField3(java.lang.String TextField3) {
        this.TextField3 = TextField3;
    }


    /**
     *  The attribute value for this user.
     * 
     * @return Value The attribute value for this user.
     */
    public java.lang.Integer getValue() {
        return Value;
    }


    /**
     *  The attribute value for this user.
     * 
     * @param Value The attribute value for this user.
     */
    public void setValue(java.lang.Integer Value) {
        this.Value = Value;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "AttributeUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Attribute"));
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
        elemField.setFieldName("dateField1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateField2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateField3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "State"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textField1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TextField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textField2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TextField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textField3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TextField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
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
