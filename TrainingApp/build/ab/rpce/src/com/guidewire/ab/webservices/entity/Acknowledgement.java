/**
 * Acknowledgement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class Acknowledgement  implements java.io.Serializable {
    /** 
     */ 
    private java.lang.String AckCode;
    /** 
     */ 
    private com.guidewire.ab.webservices.entity.CustomEvents[] CustomEvents;
    /** 
     */ 
    private boolean Duplicate;
    /** 
     */ 
    private boolean Error;
    /** 
     */ 
    private java.lang.String ErrorDescription;
    /** 
     */ 
    private com.guidewire.ab.webservices.entity.FieldChanges[] FieldChanges;
    /** 
     */ 
    private long MessageID;
    /** 
     */ 
    private boolean Retryable;

    public Acknowledgement() {
    }

    public Acknowledgement(
           java.lang.String AckCode,
           com.guidewire.ab.webservices.entity.CustomEvents[] CustomEvents,
           boolean Duplicate,
           boolean Error,
           java.lang.String ErrorDescription,
           com.guidewire.ab.webservices.entity.FieldChanges[] FieldChanges,
           long MessageID,
           boolean Retryable) {
           this.AckCode = AckCode;
           this.CustomEvents = CustomEvents;
           this.Duplicate = Duplicate;
           this.Error = Error;
           this.ErrorDescription = ErrorDescription;
           this.FieldChanges = FieldChanges;
           this.MessageID = MessageID;
           this.Retryable = Retryable;
    }


    /**
     * 
     * 
     * @return AckCode
     */
    public java.lang.String getAckCode() {
        return AckCode;
    }


    /**
     * 
     * 
     * @param AckCode
     */
    public void setAckCode(java.lang.String AckCode) {
        this.AckCode = AckCode;
    }


    /**
     * 
     * 
     * @return CustomEvents
     */
    public com.guidewire.ab.webservices.entity.CustomEvents[] getCustomEvents() {
        return CustomEvents;
    }


    /**
     * 
     * 
     * @param CustomEvents
     */
    public void setCustomEvents(com.guidewire.ab.webservices.entity.CustomEvents[] CustomEvents) {
        this.CustomEvents = CustomEvents;
    }


    /**
     * 
     * 
     * @return Duplicate
     */
    public boolean isDuplicate() {
        return Duplicate;
    }


    /**
     * 
     * 
     * @param Duplicate
     */
    public void setDuplicate(boolean Duplicate) {
        this.Duplicate = Duplicate;
    }


    /**
     * 
     * 
     * @return Error
     */
    public boolean isError() {
        return Error;
    }


    /**
     * 
     * 
     * @param Error
     */
    public void setError(boolean Error) {
        this.Error = Error;
    }


    /**
     * 
     * 
     * @return ErrorDescription
     */
    public java.lang.String getErrorDescription() {
        return ErrorDescription;
    }


    /**
     * 
     * 
     * @param ErrorDescription
     */
    public void setErrorDescription(java.lang.String ErrorDescription) {
        this.ErrorDescription = ErrorDescription;
    }


    /**
     * 
     * 
     * @return FieldChanges
     */
    public com.guidewire.ab.webservices.entity.FieldChanges[] getFieldChanges() {
        return FieldChanges;
    }


    /**
     * 
     * 
     * @param FieldChanges
     */
    public void setFieldChanges(com.guidewire.ab.webservices.entity.FieldChanges[] FieldChanges) {
        this.FieldChanges = FieldChanges;
    }


    /**
     * 
     * 
     * @return MessageID
     */
    public long getMessageID() {
        return MessageID;
    }


    /**
     * 
     * 
     * @param MessageID
     */
    public void setMessageID(long MessageID) {
        this.MessageID = MessageID;
    }


    /**
     * 
     * 
     * @return Retryable
     */
    public boolean isRetryable() {
        return Retryable;
    }


    /**
     * 
     * 
     * @param Retryable
     */
    public void setRetryable(boolean Retryable) {
        this.Retryable = Retryable;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Acknowledgement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Acknowledgement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AckCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CustomEvents"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duplicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FieldChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldChanges"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Retryable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
