/**
 * Attribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Describes a name-value pair. An administrator can create an Attribute
 * entity to represent custom user characteristics,
 *         for example, Spanish. Then, the administrator can associate
 * the Attribute with one or more system users.
 *         Studio users can reference an Attribute from Studio when writing
 * rules.
 */
public class Attribute  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Indicates whether or not this attribute is currently in use.
     */ 
    private java.lang.Boolean Active;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        A description of the attribute.
     */ 
    private java.lang.String Description;
    /** 
        The name of the attribute. NOTE: when inserting a Attribute this
 * field must be non-null.
     */ 
    private java.lang.String Name;
    /** 
        The type of the attribute. NOTE: when inserting a Attribute this
 * field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.UserAttributeType Type;

    public Attribute() {
    }

    public Attribute(
           java.lang.Boolean Active,
           java.lang.Integer BeanVersion,
           java.lang.String Description,
           java.lang.String Name,
           com.guidewire.ab.webservices.enumeration.UserAttributeType Type) {
           this.Active = Active;
           this.BeanVersion = BeanVersion;
           this.Description = Description;
           this.Name = Name;
           this.Type = Type;
    }


    /**
     *  Indicates whether or not this attribute is currently in use.
     * 
     * @return Active Indicates whether or not this attribute is currently in use.
     */
    public java.lang.Boolean getActive() {
        return Active;
    }


    /**
     *  Indicates whether or not this attribute is currently in use.
     * 
     * @param Active Indicates whether or not this attribute is currently in use.
     */
    public void setActive(java.lang.Boolean Active) {
        this.Active = Active;
    }


    /**
     *  Auto-incremented object version
     * 
     * @return BeanVersion Auto-incremented object version
     */
    public java.lang.Integer getBeanVersion() {
        return BeanVersion;
    }


    /**
     *  Auto-incremented object version
     * 
     * @param BeanVersion Auto-incremented object version
     */
    public void setBeanVersion(java.lang.Integer BeanVersion) {
        this.BeanVersion = BeanVersion;
    }


    /**
     *  A description of the attribute.
     * 
     * @return Description A description of the attribute.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  A description of the attribute.
     * 
     * @param Description A description of the attribute.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  The name of the attribute. NOTE: when inserting a Attribute this
 * field must be non-null.
     * 
     * @return Name The name of the attribute. NOTE: when inserting a Attribute this
 * field must be non-null.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  The name of the attribute. NOTE: when inserting a Attribute this
 * field must be non-null.
     * 
     * @param Name The name of the attribute. NOTE: when inserting a Attribute this
 * field must be non-null.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  The type of the attribute. NOTE: when inserting a Attribute this
 * field must be non-null.
     * 
     * @return Type The type of the attribute. NOTE: when inserting a Attribute this
 * field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.UserAttributeType getType() {
        return Type;
    }


    /**
     *  The type of the attribute. NOTE: when inserting a Attribute this
 * field must be non-null.
     * 
     * @param Type The type of the attribute. NOTE: when inserting a Attribute this
 * field must be non-null.
     */
    public void setType(com.guidewire.ab.webservices.enumeration.UserAttributeType Type) {
        this.Type = Type;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Attribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Attribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "UserAttributeType"));
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
