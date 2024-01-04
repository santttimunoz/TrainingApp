/**
 * SpecialistService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * A node in the specialist services tree.
 */
public class SpecialistService  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Indicates whether the service should be used for new service requests.
     */ 
    private java.lang.Boolean Active;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Array of SpecialistServiceParents corresponding to SpecialistServices
 * for which this is the Parent.
     */ 
    private com.guidewire.ab.webservices.entity.SpecialistServiceParent[] ChildSpecialistServiceParents;
    /** 
        Unique string identifying this service. NOTE: when inserting a
 * SpecialistService this field must be non-null.
     */ 
    private java.lang.String Code;
    /** 
        Description of the service.
     */ 
    private java.lang.String Description;
    /** 
        Name of the service. NOTE: when inserting a SpecialistService this
 * field must be non-null.
     */ 
    private java.lang.String Name;
    /** 
        Reference to the parent SpecialistService.  Null for top level
 * nodes, which have no parent.
     */ 
    private com.guidewire.ab.webservices.entity.SpecialistService Parent;

    public SpecialistService() {
    }

    public SpecialistService(
           java.lang.Boolean Active,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.SpecialistServiceParent[] ChildSpecialistServiceParents,
           java.lang.String Code,
           java.lang.String Description,
           java.lang.String Name,
           com.guidewire.ab.webservices.entity.SpecialistService Parent) {
           this.Active = Active;
           this.BeanVersion = BeanVersion;
           this.ChildSpecialistServiceParents = ChildSpecialistServiceParents;
           this.Code = Code;
           this.Description = Description;
           this.Name = Name;
           this.Parent = Parent;
    }


    /**
     *  Indicates whether the service should be used for new service requests.
     * 
     * @return Active Indicates whether the service should be used for new service requests.
     */
    public java.lang.Boolean getActive() {
        return Active;
    }


    /**
     *  Indicates whether the service should be used for new service requests.
     * 
     * @param Active Indicates whether the service should be used for new service requests.
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
     *  Array of SpecialistServiceParents corresponding to SpecialistServices
 * for which this is the Parent.
     * 
     * @return ChildSpecialistServiceParents Array of SpecialistServiceParents corresponding to SpecialistServices
 * for which this is the Parent.
     */
    public com.guidewire.ab.webservices.entity.SpecialistServiceParent[] getChildSpecialistServiceParents() {
        return ChildSpecialistServiceParents;
    }


    /**
     *  Array of SpecialistServiceParents corresponding to SpecialistServices
 * for which this is the Parent.
     * 
     * @param ChildSpecialistServiceParents Array of SpecialistServiceParents corresponding to SpecialistServices
 * for which this is the Parent.
     */
    public void setChildSpecialistServiceParents(com.guidewire.ab.webservices.entity.SpecialistServiceParent[] ChildSpecialistServiceParents) {
        this.ChildSpecialistServiceParents = ChildSpecialistServiceParents;
    }


    /**
     *  Unique string identifying this service. NOTE: when inserting a
 * SpecialistService this field must be non-null.
     * 
     * @return Code Unique string identifying this service. NOTE: when inserting a
 * SpecialistService this field must be non-null.
     */
    public java.lang.String getCode() {
        return Code;
    }


    /**
     *  Unique string identifying this service. NOTE: when inserting a
 * SpecialistService this field must be non-null.
     * 
     * @param Code Unique string identifying this service. NOTE: when inserting a
 * SpecialistService this field must be non-null.
     */
    public void setCode(java.lang.String Code) {
        this.Code = Code;
    }


    /**
     *  Description of the service.
     * 
     * @return Description Description of the service.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Description of the service.
     * 
     * @param Description Description of the service.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  Name of the service. NOTE: when inserting a SpecialistService this
 * field must be non-null.
     * 
     * @return Name Name of the service. NOTE: when inserting a SpecialistService this
 * field must be non-null.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  Name of the service. NOTE: when inserting a SpecialistService this
 * field must be non-null.
     * 
     * @param Name Name of the service. NOTE: when inserting a SpecialistService this
 * field must be non-null.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  Reference to the parent SpecialistService.  Null for top level
 * nodes, which have no parent.
     * 
     * @return Parent Reference to the parent SpecialistService.  Null for top level
 * nodes, which have no parent.
     */
    public com.guidewire.ab.webservices.entity.SpecialistService getParent() {
        return Parent;
    }


    /**
     *  Reference to the parent SpecialistService.  Null for top level
 * nodes, which have no parent.
     * 
     * @param Parent Reference to the parent SpecialistService.  Null for top level
 * nodes, which have no parent.
     */
    public void setParent(com.guidewire.ab.webservices.entity.SpecialistService Parent) {
        this.Parent = Parent;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecialistService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SpecialistService"));
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
        elemField.setFieldName("childSpecialistServiceParents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChildSpecialistServiceParents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SpecialistServiceParent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SpecialistService"));
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
