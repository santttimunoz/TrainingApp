/**
 * SOAPException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.fault;


/**
 * A generic SOAP exception.
 */
public class SOAPException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    /** The message associated with this exception */
    private java.lang.String message1;
    /** Other messages attached to this exception.  This message may contain
 * information
 * related to other exceptions that occurred during a SOAP call, but
 * not directly
 * associated with this particular exception. */
    private java.lang.String otherMessages;

    public SOAPException() {
    }

    public SOAPException(
           java.lang.String message1,
           java.lang.String otherMessages) {
        this.message1 = message1;
        this.otherMessages = otherMessages;
    }


    /**
     * Gets the message1 value for this SOAPException.
     * 
     * @return message1 The message associated with this exception
     */
    public java.lang.String getMessage1() {
        return message1;
    }


    /**
     * Sets the message1 value for this SOAPException.
     * 
     * @param message1 The message associated with this exception
     */
    public void setMessage1(java.lang.String message1) {
        this.message1 = message1;
    }


    /**
     * Gets the otherMessages value for this SOAPException.
     * 
     * @return otherMessages Other messages attached to this exception.  This message may contain
 * information
 * related to other exceptions that occurred during a SOAP call, but
 * not directly
 * associated with this particular exception.
     */
    public java.lang.String getOtherMessages() {
        return otherMessages;
    }


    /**
     * Sets the otherMessages value for this SOAPException.
     * 
     * @param otherMessages Other messages attached to this exception.  This message may contain
 * information
 * related to other exceptions that occurred during a SOAP call, but
 * not directly
 * associated with this particular exception.
     */
    public void setOtherMessages(java.lang.String otherMessages) {
        this.otherMessages = otherMessages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOAPException)) return false;
        SOAPException other = (SOAPException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message1==null && other.getMessage1()==null) || 
             (this.message1!=null &&
              this.message1.equals(other.getMessage1()))) &&
            ((this.otherMessages==null && other.getOtherMessages()==null) || 
             (this.otherMessages!=null &&
              this.otherMessages.equals(other.getOtherMessages())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMessage1() != null) {
            _hashCode += getMessage1().hashCode();
        }
        if (getOtherMessages() != null) {
            _hashCode += getOtherMessages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOAPException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "SOAPException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OtherMessages"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
