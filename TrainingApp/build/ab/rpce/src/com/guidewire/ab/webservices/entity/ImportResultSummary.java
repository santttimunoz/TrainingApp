/**
 * ImportResultSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Class that contains a summary information for the insertion or
 * update of a
 * particular kind of entity.
 */
public class ImportResultSummary  implements java.io.Serializable {
    /** 
        The number of entities affected.
     */ 
    private int Count;
    /** 
        The name of the entity in question.
     */ 
    private java.lang.String EntityName;
    /** 
        Either <code>ImportResults.INSERTED</code> or <code>ImportResults.UPDATED</code>,
 * depending on whether this summary is for updated or inserted entities.
     */ 
    private int Type;

    public ImportResultSummary() {
    }

    public ImportResultSummary(
           int Count,
           java.lang.String EntityName,
           int Type) {
           this.Count = Count;
           this.EntityName = EntityName;
           this.Type = Type;
    }


    /**
     *  The number of entities affected.
     * 
     * @return Count The number of entities affected.
     */
    public int getCount() {
        return Count;
    }


    /**
     *  The number of entities affected.
     * 
     * @param Count The number of entities affected.
     */
    public void setCount(int Count) {
        this.Count = Count;
    }


    /**
     *  The name of the entity in question.
     * 
     * @return EntityName The name of the entity in question.
     */
    public java.lang.String getEntityName() {
        return EntityName;
    }


    /**
     *  The name of the entity in question.
     * 
     * @param EntityName The name of the entity in question.
     */
    public void setEntityName(java.lang.String EntityName) {
        this.EntityName = EntityName;
    }


    /**
     *  Either <code>ImportResults.INSERTED</code> or <code>ImportResults.UPDATED</code>,
 * depending on whether this summary is for updated or inserted entities.
     * 
     * @return Type Either <code>ImportResults.INSERTED</code> or <code>ImportResults.UPDATED</code>,
 * depending on whether this summary is for updated or inserted entities.
     */
    public int getType() {
        return Type;
    }


    /**
     *  Either <code>ImportResults.INSERTED</code> or <code>ImportResults.UPDATED</code>,
 * depending on whether this summary is for updated or inserted entities.
     * 
     * @param Type Either <code>ImportResults.INSERTED</code> or <code>ImportResults.UPDATED</code>,
 * depending on whether this summary is for updated or inserted entities.
     */
    public void setType(int Type) {
        this.Type = Type;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportResultSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ImportResultSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
