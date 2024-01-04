/**
 * PathValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Represents the path and value to update.
 * <p/>
 * Used in conjunction with <code>IDataObjectAPI.setPathValues(String,
 * String, InsertPathValue[], PathValue[], String[])</code>.
 * @deprecated Part of IDataObjectAPI
 */
public class PathValue  implements java.io.Serializable {
    /** 
        Path from the root entity to the property to update.
 * @deprecated
     */ 
    private java.lang.String Path;
    /** 
        Path from the root entity to the property to update.
 * @deprecated
     */ 
    private java.lang.String Value;

    public PathValue() {
    }

    public PathValue(
           java.lang.String Path,
           java.lang.String Value) {
           this.Path = Path;
           this.Value = Value;
    }


    /**
     *  Path from the root entity to the property to update.
 * @deprecated
     * 
     * @return Path Path from the root entity to the property to update.
 * @deprecated
     */
    public java.lang.String getPath() {
        return Path;
    }


    /**
     *  Path from the root entity to the property to update.
 * @deprecated
     * 
     * @param Path Path from the root entity to the property to update.
 * @deprecated
     */
    public void setPath(java.lang.String Path) {
        this.Path = Path;
    }


    /**
     *  Path from the root entity to the property to update.
 * @deprecated
     * 
     * @return Value Path from the root entity to the property to update.
 * @deprecated
     */
    public java.lang.String getValue() {
        return Value;
    }


    /**
     *  Path from the root entity to the property to update.
 * @deprecated
     * 
     * @param Value Path from the root entity to the property to update.
 * @deprecated
     */
    public void setValue(java.lang.String Value) {
        this.Value = Value;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PathValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "PathValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
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
