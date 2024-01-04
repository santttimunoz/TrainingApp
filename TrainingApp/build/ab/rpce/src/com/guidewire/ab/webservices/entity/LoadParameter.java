/**
 * LoadParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * (parameter, value) pairs for load commands.
 */
public class LoadParameter  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Parameter name. NOTE: when inserting a LoadParameter this field
 * must be non-null.
     */ 
    private java.lang.String ParameterName;
    /** 
        Parameter value.
     */ 
    private java.lang.String ParameterValue;

    public LoadParameter() {
    }

    public LoadParameter(
           java.lang.String ParameterName,
           java.lang.String ParameterValue) {
           this.ParameterName = ParameterName;
           this.ParameterValue = ParameterValue;
    }


    /**
     *  Parameter name. NOTE: when inserting a LoadParameter this field
 * must be non-null.
     * 
     * @return ParameterName Parameter name. NOTE: when inserting a LoadParameter this field
 * must be non-null.
     */
    public java.lang.String getParameterName() {
        return ParameterName;
    }


    /**
     *  Parameter name. NOTE: when inserting a LoadParameter this field
 * must be non-null.
     * 
     * @param ParameterName Parameter name. NOTE: when inserting a LoadParameter this field
 * must be non-null.
     */
    public void setParameterName(java.lang.String ParameterName) {
        this.ParameterName = ParameterName;
    }


    /**
     *  Parameter value.
     * 
     * @return ParameterValue Parameter value.
     */
    public java.lang.String getParameterValue() {
        return ParameterValue;
    }


    /**
     *  Parameter value.
     * 
     * @param ParameterValue Parameter value.
     */
    public void setParameterValue(java.lang.String ParameterValue) {
        this.ParameterValue = ParameterValue;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LoadParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParameterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParameterValue"));
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
