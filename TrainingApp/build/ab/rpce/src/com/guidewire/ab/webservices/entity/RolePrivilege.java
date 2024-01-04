/**
 * RolePrivilege.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Joins a Role with the permissions granted by it.
 */
public class RolePrivilege  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Permission granted by the parent role. NOTE: when inserting a RolePrivilege
 * this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.enumeration.SystemPermissionType Permission;

    public RolePrivilege() {
    }

    public RolePrivilege(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.enumeration.SystemPermissionType Permission) {
           this.BeanVersion = BeanVersion;
           this.Permission = Permission;
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
     *  Permission granted by the parent role. NOTE: when inserting a RolePrivilege
 * this field must be non-null.
     * 
     * @return Permission Permission granted by the parent role. NOTE: when inserting a RolePrivilege
 * this field must be non-null.
     */
    public com.guidewire.ab.webservices.enumeration.SystemPermissionType getPermission() {
        return Permission;
    }


    /**
     *  Permission granted by the parent role. NOTE: when inserting a RolePrivilege
 * this field must be non-null.
     * 
     * @param Permission Permission granted by the parent role. NOTE: when inserting a RolePrivilege
 * this field must be non-null.
     */
    public void setPermission(com.guidewire.ab.webservices.enumeration.SystemPermissionType Permission) {
        this.Permission = Permission;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RolePrivilege.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "RolePrivilege"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Permission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "SystemPermissionType"));
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
