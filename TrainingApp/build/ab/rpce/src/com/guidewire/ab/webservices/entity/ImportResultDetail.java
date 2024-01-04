/**
 * ImportResultDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Class that contains detailed information for an entity that was
 * imported.
 */
public class ImportResultDetail  implements java.io.Serializable {
    /** 
        The type of entity.
     */ 
    private java.lang.String EntityName;
    /** 
        The external ID of the entity.
     */ 
    private java.lang.String ExternalID;
    /** 
        The external source for the entity.
     */ 
    private java.lang.String ExternalSource;
    /** 
        The internal ID of the entity.
     */ 
    private long InternalID;
    /** 
        Either <code>ImportResults.INSERTED</code> or <code>ImportResults.UPDATED</code>,
 * depending on whether the entity was inserted or updated.
     */ 
    private int Type;

    public ImportResultDetail() {
    }

    public ImportResultDetail(
           java.lang.String EntityName,
           java.lang.String ExternalID,
           java.lang.String ExternalSource,
           long InternalID,
           int Type) {
           this.EntityName = EntityName;
           this.ExternalID = ExternalID;
           this.ExternalSource = ExternalSource;
           this.InternalID = InternalID;
           this.Type = Type;
    }


    /**
     *  The type of entity.
     * 
     * @return EntityName The type of entity.
     */
    public java.lang.String getEntityName() {
        return EntityName;
    }


    /**
     *  The type of entity.
     * 
     * @param EntityName The type of entity.
     */
    public void setEntityName(java.lang.String EntityName) {
        this.EntityName = EntityName;
    }


    /**
     *  The external ID of the entity.
     * 
     * @return ExternalID The external ID of the entity.
     */
    public java.lang.String getExternalID() {
        return ExternalID;
    }


    /**
     *  The external ID of the entity.
     * 
     * @param ExternalID The external ID of the entity.
     */
    public void setExternalID(java.lang.String ExternalID) {
        this.ExternalID = ExternalID;
    }


    /**
     *  The external source for the entity.
     * 
     * @return ExternalSource The external source for the entity.
     */
    public java.lang.String getExternalSource() {
        return ExternalSource;
    }


    /**
     *  The external source for the entity.
     * 
     * @param ExternalSource The external source for the entity.
     */
    public void setExternalSource(java.lang.String ExternalSource) {
        this.ExternalSource = ExternalSource;
    }


    /**
     *  The internal ID of the entity.
     * 
     * @return InternalID The internal ID of the entity.
     */
    public long getInternalID() {
        return InternalID;
    }


    /**
     *  The internal ID of the entity.
     * 
     * @param InternalID The internal ID of the entity.
     */
    public void setInternalID(long InternalID) {
        this.InternalID = InternalID;
    }


    /**
     *  Either <code>ImportResults.INSERTED</code> or <code>ImportResults.UPDATED</code>,
 * depending on whether the entity was inserted or updated.
     * 
     * @return Type Either <code>ImportResults.INSERTED</code> or <code>ImportResults.UPDATED</code>,
 * depending on whether the entity was inserted or updated.
     */
    public int getType() {
        return Type;
    }


    /**
     *  Either <code>ImportResults.INSERTED</code> or <code>ImportResults.UPDATED</code>,
 * depending on whether the entity was inserted or updated.
     * 
     * @param Type Either <code>ImportResults.INSERTED</code> or <code>ImportResults.UPDATED</code>,
 * depending on whether the entity was inserted or updated.
     */
    public void setType(int Type) {
        this.Type = Type;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportResultDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ImportResultDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExternalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExternalSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InternalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
