/**
 * MessageOptionalFields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class MessageOptionalFields  implements java.io.Serializable {
    /** 
     */ 
    private java.lang.String MessageCode;
    /** 
     */ 
    private java.lang.Integer OptionalInt;
    /** 
     */ 
    private java.math.BigDecimal OptionalMoney;
    /** 
     */ 
    private java.lang.String OptionalString;
    /** 
     */ 
    private java.lang.String SenderRefID;

    public MessageOptionalFields() {
    }

    public MessageOptionalFields(
           java.lang.String MessageCode,
           java.lang.Integer OptionalInt,
           java.math.BigDecimal OptionalMoney,
           java.lang.String OptionalString,
           java.lang.String SenderRefID) {
           this.MessageCode = MessageCode;
           this.OptionalInt = OptionalInt;
           this.OptionalMoney = OptionalMoney;
           this.OptionalString = OptionalString;
           this.SenderRefID = SenderRefID;
    }


    /**
     * 
     * 
     * @return MessageCode
     */
    public java.lang.String getMessageCode() {
        return MessageCode;
    }


    /**
     * 
     * 
     * @param MessageCode
     */
    public void setMessageCode(java.lang.String MessageCode) {
        this.MessageCode = MessageCode;
    }


    /**
     * 
     * 
     * @return OptionalInt
     */
    public java.lang.Integer getOptionalInt() {
        return OptionalInt;
    }


    /**
     * 
     * 
     * @param OptionalInt
     */
    public void setOptionalInt(java.lang.Integer OptionalInt) {
        this.OptionalInt = OptionalInt;
    }


    /**
     * 
     * 
     * @return OptionalMoney
     */
    public java.math.BigDecimal getOptionalMoney() {
        return OptionalMoney;
    }


    /**
     * 
     * 
     * @param OptionalMoney
     */
    public void setOptionalMoney(java.math.BigDecimal OptionalMoney) {
        this.OptionalMoney = OptionalMoney;
    }


    /**
     * 
     * 
     * @return OptionalString
     */
    public java.lang.String getOptionalString() {
        return OptionalString;
    }


    /**
     * 
     * 
     * @param OptionalString
     */
    public void setOptionalString(java.lang.String OptionalString) {
        this.OptionalString = OptionalString;
    }


    /**
     * 
     * 
     * @return SenderRefID
     */
    public java.lang.String getSenderRefID() {
        return SenderRefID;
    }


    /**
     * 
     * 
     * @param SenderRefID
     */
    public void setSenderRefID(java.lang.String SenderRefID) {
        this.SenderRefID = SenderRefID;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageOptionalFields.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "MessageOptionalFields"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MessageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalInt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OptionalInt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalMoney");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OptionalMoney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OptionalString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderRefID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SenderRefID"));
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
