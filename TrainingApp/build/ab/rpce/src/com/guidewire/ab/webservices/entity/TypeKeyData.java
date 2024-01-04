/**
 * TypeKeyData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Contains raw data about a TypeKey instance.  Used instead of a
 * typekey instance because the TypeKey class doesn't
 * have a no-arg constructor.
 */
public class TypeKeyData  implements java.io.Serializable {
    /** 
        Corresponds to the code field on TypeKey
     */ 
    private java.lang.String Code;
    /** 
        Corresponds to the description field on TypeKey
     */ 
    private java.lang.String Description;
    /** 
        Corresponds to the name field on TypeKey
     */ 
    private java.lang.String Name;
    /** 
        Corresponds to the retired field on TypeKey
     */ 
    private boolean Retired;

    public TypeKeyData() {
    }

    public TypeKeyData(
           java.lang.String Code,
           java.lang.String Description,
           java.lang.String Name,
           boolean Retired) {
           this.Code = Code;
           this.Description = Description;
           this.Name = Name;
           this.Retired = Retired;
    }


    /**
     *  Corresponds to the code field on TypeKey
     * 
     * @return Code Corresponds to the code field on TypeKey
     */
    public java.lang.String getCode() {
        return Code;
    }


    /**
     *  Corresponds to the code field on TypeKey
     * 
     * @param Code Corresponds to the code field on TypeKey
     */
    public void setCode(java.lang.String Code) {
        this.Code = Code;
    }


    /**
     *  Corresponds to the description field on TypeKey
     * 
     * @return Description Corresponds to the description field on TypeKey
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Corresponds to the description field on TypeKey
     * 
     * @param Description Corresponds to the description field on TypeKey
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  Corresponds to the name field on TypeKey
     * 
     * @return Name Corresponds to the name field on TypeKey
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  Corresponds to the name field on TypeKey
     * 
     * @param Name Corresponds to the name field on TypeKey
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  Corresponds to the retired field on TypeKey
     * 
     * @return Retired Corresponds to the retired field on TypeKey
     */
    public boolean isRetired() {
        return Retired;
    }


    /**
     *  Corresponds to the retired field on TypeKey
     * 
     * @param Retired Corresponds to the retired field on TypeKey
     */
    public void setRetired(boolean Retired) {
        this.Retired = Retired;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TypeKeyData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "TypeKeyData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Retired"));
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
