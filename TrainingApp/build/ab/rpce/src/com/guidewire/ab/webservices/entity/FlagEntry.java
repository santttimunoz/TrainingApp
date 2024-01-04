/**
 * FlagEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Information about the flagging of a contact
 */
public class FlagEntry  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Contact that was flagged
     */ 
    private com.guidewire.ab.webservices.entity.ABContact ABContact;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Date contact was flagged
     */ 
    private java.util.Calendar FlagDate;
    /** 
        Is the entry open?
     */ 
    private java.lang.Boolean IsOpen;
    /** 
        Reason contact was flagged
     */ 
    private com.guidewire.ab.webservices.enumeration.FlagEntryReason Reason;
    /** 
        Note regarding resolution
     */ 
    private java.lang.String Resolution;
    /** 
        Date contact was unflagged
     */ 
    private java.util.Calendar UnflagDate;
    /** 
        User who unflags contact
     */ 
    private com.guidewire.ab.webservices.entity.User UnflagUser;

    public FlagEntry() {
    }

    public FlagEntry(
           com.guidewire.ab.webservices.entity.ABContact ABContact,
           java.lang.Integer BeanVersion,
           java.util.Calendar FlagDate,
           java.lang.Boolean IsOpen,
           com.guidewire.ab.webservices.enumeration.FlagEntryReason Reason,
           java.lang.String Resolution,
           java.util.Calendar UnflagDate,
           com.guidewire.ab.webservices.entity.User UnflagUser) {
           this.ABContact = ABContact;
           this.BeanVersion = BeanVersion;
           this.FlagDate = FlagDate;
           this.IsOpen = IsOpen;
           this.Reason = Reason;
           this.Resolution = Resolution;
           this.UnflagDate = UnflagDate;
           this.UnflagUser = UnflagUser;
    }


    /**
     *  Contact that was flagged
     * 
     * @return ABContact Contact that was flagged
     */
    public com.guidewire.ab.webservices.entity.ABContact getABContact() {
        return ABContact;
    }


    /**
     *  Contact that was flagged
     * 
     * @param ABContact Contact that was flagged
     */
    public void setABContact(com.guidewire.ab.webservices.entity.ABContact ABContact) {
        this.ABContact = ABContact;
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
     *  Date contact was flagged
     * 
     * @return FlagDate Date contact was flagged
     */
    public java.util.Calendar getFlagDate() {
        return FlagDate;
    }


    /**
     *  Date contact was flagged
     * 
     * @param FlagDate Date contact was flagged
     */
    public void setFlagDate(java.util.Calendar FlagDate) {
        this.FlagDate = FlagDate;
    }


    /**
     *  Is the entry open?
     * 
     * @return IsOpen Is the entry open?
     */
    public java.lang.Boolean getIsOpen() {
        return IsOpen;
    }


    /**
     *  Is the entry open?
     * 
     * @param IsOpen Is the entry open?
     */
    public void setIsOpen(java.lang.Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }


    /**
     *  Reason contact was flagged
     * 
     * @return Reason Reason contact was flagged
     */
    public com.guidewire.ab.webservices.enumeration.FlagEntryReason getReason() {
        return Reason;
    }


    /**
     *  Reason contact was flagged
     * 
     * @param Reason Reason contact was flagged
     */
    public void setReason(com.guidewire.ab.webservices.enumeration.FlagEntryReason Reason) {
        this.Reason = Reason;
    }


    /**
     *  Note regarding resolution
     * 
     * @return Resolution Note regarding resolution
     */
    public java.lang.String getResolution() {
        return Resolution;
    }


    /**
     *  Note regarding resolution
     * 
     * @param Resolution Note regarding resolution
     */
    public void setResolution(java.lang.String Resolution) {
        this.Resolution = Resolution;
    }


    /**
     *  Date contact was unflagged
     * 
     * @return UnflagDate Date contact was unflagged
     */
    public java.util.Calendar getUnflagDate() {
        return UnflagDate;
    }


    /**
     *  Date contact was unflagged
     * 
     * @param UnflagDate Date contact was unflagged
     */
    public void setUnflagDate(java.util.Calendar UnflagDate) {
        this.UnflagDate = UnflagDate;
    }


    /**
     *  User who unflags contact
     * 
     * @return UnflagUser User who unflags contact
     */
    public com.guidewire.ab.webservices.entity.User getUnflagUser() {
        return UnflagUser;
    }


    /**
     *  User who unflags contact
     * 
     * @param UnflagUser User who unflags contact
     */
    public void setUnflagUser(com.guidewire.ab.webservices.entity.User UnflagUser) {
        this.UnflagUser = UnflagUser;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlagEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FlagEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ABContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContact"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("flagDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FlagDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "FlagEntryReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Resolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unflagDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UnflagDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unflagUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UnflagUser"));
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
