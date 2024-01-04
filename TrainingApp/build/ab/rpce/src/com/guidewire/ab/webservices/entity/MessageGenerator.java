/**
 * MessageGenerator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Event-aware entity for generating basic messagrd
 */
public class MessageGenerator  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Should the message generated from this instance be synchronously
 * acknowledged?
     */ 
    private java.lang.Boolean AutoAckMessage;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Name of instance that is triggering a message NOTE: when inserting
 * a MessageGenerator this field must be non-null.
     */ 
    private java.lang.String Name;
    /** 
        Should an exception be thrown when processing the message reply?
     */ 
    private java.lang.Boolean ThrowExceptionInReply;
    /** 
        Should an exception be thrown during the Request plugin's beforeSend()
 * method?
     */ 
    private java.lang.Boolean ThrowExceptionInRequest;
    /** 
        Should an exception be thrown during the Transport plugin's send()
 * method?
     */ 
    private java.lang.Boolean ThrowExceptionInTransport;

    public MessageGenerator() {
    }

    public MessageGenerator(
           java.lang.Boolean AutoAckMessage,
           java.lang.Integer BeanVersion,
           java.lang.String Name,
           java.lang.Boolean ThrowExceptionInReply,
           java.lang.Boolean ThrowExceptionInRequest,
           java.lang.Boolean ThrowExceptionInTransport) {
           this.AutoAckMessage = AutoAckMessage;
           this.BeanVersion = BeanVersion;
           this.Name = Name;
           this.ThrowExceptionInReply = ThrowExceptionInReply;
           this.ThrowExceptionInRequest = ThrowExceptionInRequest;
           this.ThrowExceptionInTransport = ThrowExceptionInTransport;
    }


    /**
     *  Should the message generated from this instance be synchronously
 * acknowledged?
     * 
     * @return AutoAckMessage Should the message generated from this instance be synchronously
 * acknowledged?
     */
    public java.lang.Boolean getAutoAckMessage() {
        return AutoAckMessage;
    }


    /**
     *  Should the message generated from this instance be synchronously
 * acknowledged?
     * 
     * @param AutoAckMessage Should the message generated from this instance be synchronously
 * acknowledged?
     */
    public void setAutoAckMessage(java.lang.Boolean AutoAckMessage) {
        this.AutoAckMessage = AutoAckMessage;
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
     *  Name of instance that is triggering a message NOTE: when inserting
 * a MessageGenerator this field must be non-null.
     * 
     * @return Name Name of instance that is triggering a message NOTE: when inserting
 * a MessageGenerator this field must be non-null.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  Name of instance that is triggering a message NOTE: when inserting
 * a MessageGenerator this field must be non-null.
     * 
     * @param Name Name of instance that is triggering a message NOTE: when inserting
 * a MessageGenerator this field must be non-null.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  Should an exception be thrown when processing the message reply?
     * 
     * @return ThrowExceptionInReply Should an exception be thrown when processing the message reply?
     */
    public java.lang.Boolean getThrowExceptionInReply() {
        return ThrowExceptionInReply;
    }


    /**
     *  Should an exception be thrown when processing the message reply?
     * 
     * @param ThrowExceptionInReply Should an exception be thrown when processing the message reply?
     */
    public void setThrowExceptionInReply(java.lang.Boolean ThrowExceptionInReply) {
        this.ThrowExceptionInReply = ThrowExceptionInReply;
    }


    /**
     *  Should an exception be thrown during the Request plugin's beforeSend()
 * method?
     * 
     * @return ThrowExceptionInRequest Should an exception be thrown during the Request plugin's beforeSend()
 * method?
     */
    public java.lang.Boolean getThrowExceptionInRequest() {
        return ThrowExceptionInRequest;
    }


    /**
     *  Should an exception be thrown during the Request plugin's beforeSend()
 * method?
     * 
     * @param ThrowExceptionInRequest Should an exception be thrown during the Request plugin's beforeSend()
 * method?
     */
    public void setThrowExceptionInRequest(java.lang.Boolean ThrowExceptionInRequest) {
        this.ThrowExceptionInRequest = ThrowExceptionInRequest;
    }


    /**
     *  Should an exception be thrown during the Transport plugin's send()
 * method?
     * 
     * @return ThrowExceptionInTransport Should an exception be thrown during the Transport plugin's send()
 * method?
     */
    public java.lang.Boolean getThrowExceptionInTransport() {
        return ThrowExceptionInTransport;
    }


    /**
     *  Should an exception be thrown during the Transport plugin's send()
 * method?
     * 
     * @param ThrowExceptionInTransport Should an exception be thrown during the Transport plugin's send()
 * method?
     */
    public void setThrowExceptionInTransport(java.lang.Boolean ThrowExceptionInTransport) {
        this.ThrowExceptionInTransport = ThrowExceptionInTransport;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageGenerator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "MessageGenerator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAckMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoAckMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throwExceptionInReply");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ThrowExceptionInReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throwExceptionInRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ThrowExceptionInRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throwExceptionInTransport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ThrowExceptionInTransport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
