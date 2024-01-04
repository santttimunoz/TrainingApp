/**
 * InsertPathValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * <p>
 * Represents the location and type of an entity to insert. Used in conjunction
 * with
 * <code>IDataObjectAPI.setPathValues(String,String,InsertPathValue[],PathValue[],String[])</code>.</p>
 * @deprecated Part of IDataObjectAPI
 */
public class InsertPathValue  implements java.io.Serializable {
    /** 
        Type of entity to insert at the location. If the type is null then
 * it is
 * inferred from the location. For example, if the location is an array,
 * then
 * the entity created will be of the array's element type. However, if
 * the
 * location refers to an abstract type, then this value must be specified.
 * @deprecated
     */ 
    private java.lang.String EntityName;
    /** 
        Path from root entity to location where to insert this new entity.
 * The leaf
 * of the path must null or refer to an array or a foreign key link.
 * If the
 * path is null then a new "rootless" entity will be inserted.
 * @deprecated
     */ 
    private java.lang.String Path;
    /** 
        RefId of this newly inserted entity. The RefId is defined by the
 * caller and
 * is used to set properties on the newly inserted entity.
 * @deprecated
     */ 
    private java.lang.String RefId;

    public InsertPathValue() {
    }

    public InsertPathValue(
           java.lang.String EntityName,
           java.lang.String Path,
           java.lang.String RefId) {
           this.EntityName = EntityName;
           this.Path = Path;
           this.RefId = RefId;
    }


    /**
     *  Type of entity to insert at the location. If the type is null then
 * it is
 * inferred from the location. For example, if the location is an array,
 * then
 * the entity created will be of the array's element type. However, if
 * the
 * location refers to an abstract type, then this value must be specified.
 * @deprecated
     * 
     * @return EntityName Type of entity to insert at the location. If the type is null then
 * it is
 * inferred from the location. For example, if the location is an array,
 * then
 * the entity created will be of the array's element type. However, if
 * the
 * location refers to an abstract type, then this value must be specified.
 * @deprecated
     */
    public java.lang.String getEntityName() {
        return EntityName;
    }


    /**
     *  Type of entity to insert at the location. If the type is null then
 * it is
 * inferred from the location. For example, if the location is an array,
 * then
 * the entity created will be of the array's element type. However, if
 * the
 * location refers to an abstract type, then this value must be specified.
 * @deprecated
     * 
     * @param EntityName Type of entity to insert at the location. If the type is null then
 * it is
 * inferred from the location. For example, if the location is an array,
 * then
 * the entity created will be of the array's element type. However, if
 * the
 * location refers to an abstract type, then this value must be specified.
 * @deprecated
     */
    public void setEntityName(java.lang.String EntityName) {
        this.EntityName = EntityName;
    }


    /**
     *  Path from root entity to location where to insert this new entity.
 * The leaf
 * of the path must null or refer to an array or a foreign key link.
 * If the
 * path is null then a new "rootless" entity will be inserted.
 * @deprecated
     * 
     * @return Path Path from root entity to location where to insert this new entity.
 * The leaf
 * of the path must null or refer to an array or a foreign key link.
 * If the
 * path is null then a new "rootless" entity will be inserted.
 * @deprecated
     */
    public java.lang.String getPath() {
        return Path;
    }


    /**
     *  Path from root entity to location where to insert this new entity.
 * The leaf
 * of the path must null or refer to an array or a foreign key link.
 * If the
 * path is null then a new "rootless" entity will be inserted.
 * @deprecated
     * 
     * @param Path Path from root entity to location where to insert this new entity.
 * The leaf
 * of the path must null or refer to an array or a foreign key link.
 * If the
 * path is null then a new "rootless" entity will be inserted.
 * @deprecated
     */
    public void setPath(java.lang.String Path) {
        this.Path = Path;
    }


    /**
     *  RefId of this newly inserted entity. The RefId is defined by the
 * caller and
 * is used to set properties on the newly inserted entity.
 * @deprecated
     * 
     * @return RefId RefId of this newly inserted entity. The RefId is defined by the
 * caller and
 * is used to set properties on the newly inserted entity.
 * @deprecated
     */
    public java.lang.String getRefId() {
        return RefId;
    }


    /**
     *  RefId of this newly inserted entity. The RefId is defined by the
 * caller and
 * is used to set properties on the newly inserted entity.
 * @deprecated
     * 
     * @param RefId RefId of this newly inserted entity. The RefId is defined by the
 * caller and
 * is used to set properties on the newly inserted entity.
 * @deprecated
     */
    public void setRefId(java.lang.String RefId) {
        this.RefId = RefId;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertPathValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "InsertPathValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RefId"));
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
