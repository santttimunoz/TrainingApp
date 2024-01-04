/**
 * Role.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * A set of permissions defining a user Role. A User can be given
 * multiple Roles and will be granted
 *         the union of all their Role permission sets.
 */
public class Role  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        If true, this role is applicable to users internal to the carrier
 * organization.
     */ 
    private java.lang.Boolean CarrierInternalRole;
    /** 
        An optional, more detailed description of the role.
     */ 
    private java.lang.String Description;
    /** 
        Displayable name of the role. NOTE: when inserting a Role this
 * field must be non-null.
     */ 
    private java.lang.String Name;
    /** 
        Privileges granted by membership in this role.
     */ 
    private com.guidewire.ab.webservices.entity.RolePrivilege[] Privileges;
    /** 
        Type of the role.
     */ 
    private com.guidewire.ab.webservices.enumeration.RoleType RoleType;

    public Role() {
    }

    public Role(
           java.lang.Integer BeanVersion,
           java.lang.Boolean CarrierInternalRole,
           java.lang.String Description,
           java.lang.String Name,
           com.guidewire.ab.webservices.entity.RolePrivilege[] Privileges,
           com.guidewire.ab.webservices.enumeration.RoleType RoleType) {
           this.BeanVersion = BeanVersion;
           this.CarrierInternalRole = CarrierInternalRole;
           this.Description = Description;
           this.Name = Name;
           this.Privileges = Privileges;
           this.RoleType = RoleType;
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
     *  If true, this role is applicable to users internal to the carrier
 * organization.
     * 
     * @return CarrierInternalRole If true, this role is applicable to users internal to the carrier
 * organization.
     */
    public java.lang.Boolean getCarrierInternalRole() {
        return CarrierInternalRole;
    }


    /**
     *  If true, this role is applicable to users internal to the carrier
 * organization.
     * 
     * @param CarrierInternalRole If true, this role is applicable to users internal to the carrier
 * organization.
     */
    public void setCarrierInternalRole(java.lang.Boolean CarrierInternalRole) {
        this.CarrierInternalRole = CarrierInternalRole;
    }


    /**
     *  An optional, more detailed description of the role.
     * 
     * @return Description An optional, more detailed description of the role.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  An optional, more detailed description of the role.
     * 
     * @param Description An optional, more detailed description of the role.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  Displayable name of the role. NOTE: when inserting a Role this
 * field must be non-null.
     * 
     * @return Name Displayable name of the role. NOTE: when inserting a Role this
 * field must be non-null.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  Displayable name of the role. NOTE: when inserting a Role this
 * field must be non-null.
     * 
     * @param Name Displayable name of the role. NOTE: when inserting a Role this
 * field must be non-null.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  Privileges granted by membership in this role.
     * 
     * @return Privileges Privileges granted by membership in this role.
     */
    public com.guidewire.ab.webservices.entity.RolePrivilege[] getPrivileges() {
        return Privileges;
    }


    /**
     *  Privileges granted by membership in this role.
     * 
     * @param Privileges Privileges granted by membership in this role.
     */
    public void setPrivileges(com.guidewire.ab.webservices.entity.RolePrivilege[] Privileges) {
        this.Privileges = Privileges;
    }


    /**
     *  Type of the role.
     * 
     * @return RoleType Type of the role.
     */
    public com.guidewire.ab.webservices.enumeration.RoleType getRoleType() {
        return RoleType;
    }


    /**
     *  Type of the role.
     * 
     * @param RoleType Type of the role.
     */
    public void setRoleType(com.guidewire.ab.webservices.enumeration.RoleType RoleType) {
        this.RoleType = RoleType;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Role.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Role"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierInternalRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CarrierInternalRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
        elemField.setFieldName("privileges");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Privileges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "RolePrivilege"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RoleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "RoleType"));
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
