/**
 * SOAPSenderException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.fault;


/**
 * SOAPSenderException is the base class for all exceptions that resulted
 * from
 * a sender error. This usually means that required data was not properly
 * encoded
 * or was absent. Senders should not send the message again unless some
 * steps have
 * been taken to make the encoded data valid.
 */
public class SOAPSenderException  extends com.guidewire.ab.webservices.fault.SOAPException  implements java.io.Serializable {

    public SOAPSenderException() {
    }

    public SOAPSenderException(
           java.lang.String message1,
           java.lang.String otherMessages) {
        super(
            message1,
            otherMessages);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOAPSenderException)) return false;
        SOAPSenderException other = (SOAPSenderException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOAPSenderException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "SOAPSenderException"));
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