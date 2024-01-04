/**
 * UserRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Joins a User with their security roles. The system creates this
 * entity when you assign a Role to a User.
 *         The User will be granted the union of all the permissions
 * granted by their Roles.
 */
public class UserRole  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Security role granted to the user. NOTE: when inserting a UserRole
 * this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.entity.Role Role;

    public UserRole() {
    }

    public UserRole(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.Role Role) {
           this.BeanVersion = BeanVersion;
           this.Role = Role;
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
     *  Security role granted to the user. NOTE: when inserting a UserRole
 * this field must be non-null.
     * 
     * @return Role Security role granted to the user. NOTE: when inserting a UserRole
 * this field must be non-null.
     */
    public com.guidewire.ab.webservices.entity.Role getRole() {
        return Role;
    }


    /**
     *  Security role granted to the user. NOTE: when inserting a UserRole
 * this field must be non-null.
     * 
     * @param Role Security role granted to the user. NOTE: when inserting a UserRole
 * this field must be non-null.
     */
    public void setRole(com.guidewire.ab.webservices.entity.Role Role) {
        this.Role = Role;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UserRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Role"));
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
