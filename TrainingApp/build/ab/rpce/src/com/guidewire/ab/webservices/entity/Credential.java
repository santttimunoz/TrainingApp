/**
 * Credential.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Maintains a user's system level-security identification. Each user
 * has a corresponding Credential object. This entity
 *       maintains information related to authorization and authentication
 * on the system. A Credential holds both the user's
 *       password and controls whether or not the user is active or not.
 * This entity also tracks login attempts.
 */
public class Credential  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Whether this credential is active. Inactive credentials are not
 * allowed to log in.
     */ 
    private java.lang.Boolean Active;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        User password. NOTE: when inserting a Credential this field must
 * be non-null.
     */ 
    private java.lang.String Password;
    /** 
        User login name. NOTE: when inserting a Credential this field must
 * be non-null.
     */ 
    private java.lang.String UserName;

    public Credential() {
    }

    public Credential(
           java.lang.Boolean Active,
           java.lang.Integer BeanVersion,
           java.lang.String Password,
           java.lang.String UserName) {
           this.Active = Active;
           this.BeanVersion = BeanVersion;
           this.Password = Password;
           this.UserName = UserName;
    }


    /**
     *  Whether this credential is active. Inactive credentials are not
 * allowed to log in.
     * 
     * @return Active Whether this credential is active. Inactive credentials are not
 * allowed to log in.
     */
    public java.lang.Boolean getActive() {
        return Active;
    }


    /**
     *  Whether this credential is active. Inactive credentials are not
 * allowed to log in.
     * 
     * @param Active Whether this credential is active. Inactive credentials are not
 * allowed to log in.
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
     *  User password. NOTE: when inserting a Credential this field must
 * be non-null.
     * 
     * @return Password User password. NOTE: when inserting a Credential this field must
 * be non-null.
     */
    public java.lang.String getPassword() {
        return Password;
    }


    /**
     *  User password. NOTE: when inserting a Credential this field must
 * be non-null.
     * 
     * @param Password User password. NOTE: when inserting a Credential this field must
 * be non-null.
     */
    public void setPassword(java.lang.String Password) {
        this.Password = Password;
    }


    /**
     *  User login name. NOTE: when inserting a Credential this field must
 * be non-null.
     * 
     * @return UserName User login name. NOTE: when inserting a Credential this field must
 * be non-null.
     */
    public java.lang.String getUserName() {
        return UserName;
    }


    /**
     *  User login name. NOTE: when inserting a Credential this field must
 * be non-null.
     * 
     * @param UserName User login name. NOTE: when inserting a Credential this field must
 * be non-null.
     */
    public void setUserName(java.lang.String UserName) {
        this.UserName = UserName;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Credential.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Credential"));
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
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserName"));
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
