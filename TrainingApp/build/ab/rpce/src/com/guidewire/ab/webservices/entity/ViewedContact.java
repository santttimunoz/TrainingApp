/**
 * ViewedContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Viewed contact
 */
public class ViewedContact  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Contact that was viewed
     */ 
    private com.guidewire.ab.webservices.entity.ABContact ViewedContact;
    /** 
        User who viewed contact
     */ 
    private com.guidewire.ab.webservices.entity.User ViewingUser;

    public ViewedContact() {
    }

    public ViewedContact(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.ABContact ViewedContact,
           com.guidewire.ab.webservices.entity.User ViewingUser) {
           this.BeanVersion = BeanVersion;
           this.ViewedContact = ViewedContact;
           this.ViewingUser = ViewingUser;
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
     *  Contact that was viewed
     * 
     * @return ViewedContact Contact that was viewed
     */
    public com.guidewire.ab.webservices.entity.ABContact getViewedContact() {
        return ViewedContact;
    }


    /**
     *  Contact that was viewed
     * 
     * @param ViewedContact Contact that was viewed
     */
    public void setViewedContact(com.guidewire.ab.webservices.entity.ABContact ViewedContact) {
        this.ViewedContact = ViewedContact;
    }


    /**
     *  User who viewed contact
     * 
     * @return ViewingUser User who viewed contact
     */
    public com.guidewire.ab.webservices.entity.User getViewingUser() {
        return ViewingUser;
    }


    /**
     *  User who viewed contact
     * 
     * @param ViewingUser User who viewed contact
     */
    public void setViewingUser(com.guidewire.ab.webservices.entity.User ViewingUser) {
        this.ViewingUser = ViewingUser;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewedContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ViewedContact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewedContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ViewedContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewingUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ViewingUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "User"));
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
