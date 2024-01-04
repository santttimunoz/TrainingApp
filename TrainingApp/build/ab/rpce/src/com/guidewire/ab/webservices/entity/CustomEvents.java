/**
 * CustomEvents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class CustomEvents  implements java.io.Serializable {
    /** 
     */ 
    private java.lang.String[] Events;
    /** 
     */ 
    private java.lang.String ObjectKey;

    public CustomEvents() {
    }

    public CustomEvents(
           java.lang.String[] Events,
           java.lang.String ObjectKey) {
           this.Events = Events;
           this.ObjectKey = ObjectKey;
    }


    /**
     * 
     * 
     * @return Events
     */
    public java.lang.String[] getEvents() {
        return Events;
    }


    /**
     * 
     * 
     * @param Events
     */
    public void setEvents(java.lang.String[] Events) {
        this.Events = Events;
    }


    /**
     * 
     * 
     * @return ObjectKey
     */
    public java.lang.String getObjectKey() {
        return ObjectKey;
    }


    /**
     * 
     * 
     * @param ObjectKey
     */
    public void setObjectKey(java.lang.String ObjectKey) {
        this.ObjectKey = ObjectKey;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomEvents.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CustomEvents"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectKey"));
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
