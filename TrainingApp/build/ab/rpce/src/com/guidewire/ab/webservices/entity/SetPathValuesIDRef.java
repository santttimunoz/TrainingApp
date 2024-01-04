/**
 * SetPathValuesIDRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * deprecated Part of IDataObjectAPI
 */
public class SetPathValuesIDRef  implements java.io.Serializable {
    /** 
        null
 * @deprecated
     */ 
    private java.lang.String PublicID;
    /** 
        null
 * @deprecated
     */ 
    private java.lang.String RefID;

    public SetPathValuesIDRef() {
    }

    public SetPathValuesIDRef(
           java.lang.String PublicID,
           java.lang.String RefID) {
           this.PublicID = PublicID;
           this.RefID = RefID;
    }


    /**
     *  null
 * @deprecated
     * 
     * @return PublicID null
 * @deprecated
     */
    public java.lang.String getPublicID() {
        return PublicID;
    }


    /**
     *  null
 * @deprecated
     * 
     * @param PublicID null
 * @deprecated
     */
    public void setPublicID(java.lang.String PublicID) {
        this.PublicID = PublicID;
    }


    /**
     *  null
 * @deprecated
     * 
     * @return RefID null
 * @deprecated
     */
    public java.lang.String getRefID() {
        return RefID;
    }


    /**
     *  null
 * @deprecated
     * 
     * @param RefID null
 * @deprecated
     */
    public void setRefID(java.lang.String RefID) {
        this.RefID = RefID;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetPathValuesIDRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SetPathValuesIDRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PublicID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RefID"));
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
