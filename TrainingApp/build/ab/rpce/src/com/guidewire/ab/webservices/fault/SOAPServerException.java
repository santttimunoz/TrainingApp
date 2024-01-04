/**
 * SOAPServerException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.fault;


/**
 * SOAPServerException is the base class for all exceptions that resulted
 * from
 * a server error. This is something of a catch-all exception type insofar
 * as
 * some things which might in fact be considered SOAPSenderExceptions
 * are reported
 * as SOAPServerExceptions. Perhaps a rule failed or something else.
 * Generally it
 * indicates a problem in the server that is likely retryable at some
 * future time.
 * The database being down, an unavailable plugin, etc would fall into
 * this catagory.
 */
public class SOAPServerException  extends com.guidewire.ab.webservices.fault.SOAPException  implements java.io.Serializable {

    public SOAPServerException() {
    }

    public SOAPServerException(
           java.lang.String message1,
           java.lang.String otherMessages) {
        super(
            message1,
            otherMessages);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOAPServerException)) return false;
        SOAPServerException other = (SOAPServerException) obj;
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
        new org.apache.axis.description.TypeDesc(SOAPServerException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fault.webservices.ab.guidewire.com/", "SOAPServerException"));
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
