/**
 * FieldFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * A FieldFilter represents a mapping from an entity name to an array
 * of field names.  To see how it is used, see {@link
 * ObjectFilter}.
 */
public class FieldFilter  implements java.io.Serializable {
    /** 
        The name of the entity
     */ 
    private java.lang.String EntityName;
    /** 
        The field names to set
     */ 
    private java.lang.String[] FieldNames;

    public FieldFilter() {
    }

    public FieldFilter(
           java.lang.String EntityName,
           java.lang.String[] FieldNames) {
           this.EntityName = EntityName;
           this.FieldNames = FieldNames;
    }


    /**
     *  The name of the entity
     * 
     * @return EntityName The name of the entity
     */
    public java.lang.String getEntityName() {
        return EntityName;
    }


    /**
     *  The name of the entity
     * 
     * @param EntityName The name of the entity
     */
    public void setEntityName(java.lang.String EntityName) {
        this.EntityName = EntityName;
    }


    /**
     *  The field names to set
     * 
     * @return FieldNames The field names to set
     */
    public java.lang.String[] getFieldNames() {
        return FieldNames;
    }


    /**
     *  The field names to set
     * 
     * @param FieldNames The field names to set
     */
    public void setFieldNames(java.lang.String[] FieldNames) {
        this.FieldNames = FieldNames;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FieldNames"));
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
