/**
 * GWObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public abstract class GWObject  implements java.io.Serializable {
    /** 
     */ 
    private com.guidewire.ab.webservices.enumeration.RefTypeEnum refType;
    /** 
     */ 
    private java.lang.String PublicID;

    public GWObject() {
    }

    public GWObject(
           com.guidewire.ab.webservices.enumeration.RefTypeEnum refType,
           java.lang.String PublicID) {
           this.refType = refType;
           this.PublicID = PublicID;
    }


    /**
     * 
     * 
     * @return refType
     */
    public com.guidewire.ab.webservices.enumeration.RefTypeEnum getRefType() {
        return refType;
    }


    /**
     * 
     * 
     * @param refType
     */
    public void setRefType(com.guidewire.ab.webservices.enumeration.RefTypeEnum refType) {
        this.refType = refType;
    }


    /**
     * 
     * 
     * @return PublicID
     */
    public java.lang.String getPublicID() {
        return PublicID;
    }


    /**
     * 
     * 
     * @param PublicID
     */
    public void setPublicID(java.lang.String PublicID) {
        this.PublicID = PublicID;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GWObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "GWObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "RefTypeEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PublicID"));
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
