/**
 * EFTData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Electronic funds transfer or EFT refers to the computer-based systems
 * used to perform financial transactions electronically.
 */
public class EFTData  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        The name on the account
     */ 
    private java.lang.String AccountName;
    /** 
        The bank account number
     */ 
    private java.lang.String BankAccountNumber;
    /** 
        The type of bank accout e.g. checking, savings etc
     */ 
    private com.guidewire.ab.webservices.enumeration.BankAccountType BankAccountType;
    /** 
        The name of the bank
     */ 
    private java.lang.String BankName;
    /** 
        The routing number is a nine digit bank code used in the United
 * States
     */ 
    private java.lang.String BankRoutingNumber;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Contact this EFT record relates to
     */ 
    private com.guidewire.ab.webservices.entity.ABContact Contact;
    /** 
        Indicates if this is the primary EFT record for the contact
     */ 
    private java.lang.Boolean IsPrimary;
    /** 
        Represents the ID used by client applications to link with the
 * Address Book.
     */ 
    private java.lang.String LinkID;

    public EFTData() {
    }

    public EFTData(
           java.lang.String AccountName,
           java.lang.String BankAccountNumber,
           com.guidewire.ab.webservices.enumeration.BankAccountType BankAccountType,
           java.lang.String BankName,
           java.lang.String BankRoutingNumber,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.ABContact Contact,
           java.lang.Boolean IsPrimary,
           java.lang.String LinkID) {
           this.AccountName = AccountName;
           this.BankAccountNumber = BankAccountNumber;
           this.BankAccountType = BankAccountType;
           this.BankName = BankName;
           this.BankRoutingNumber = BankRoutingNumber;
           this.BeanVersion = BeanVersion;
           this.Contact = Contact;
           this.IsPrimary = IsPrimary;
           this.LinkID = LinkID;
    }


    /**
     *  The name on the account
     * 
     * @return AccountName The name on the account
     */
    public java.lang.String getAccountName() {
        return AccountName;
    }


    /**
     *  The name on the account
     * 
     * @param AccountName The name on the account
     */
    public void setAccountName(java.lang.String AccountName) {
        this.AccountName = AccountName;
    }


    /**
     *  The bank account number
     * 
     * @return BankAccountNumber The bank account number
     */
    public java.lang.String getBankAccountNumber() {
        return BankAccountNumber;
    }


    /**
     *  The bank account number
     * 
     * @param BankAccountNumber The bank account number
     */
    public void setBankAccountNumber(java.lang.String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }


    /**
     *  The type of bank accout e.g. checking, savings etc
     * 
     * @return BankAccountType The type of bank accout e.g. checking, savings etc
     */
    public com.guidewire.ab.webservices.enumeration.BankAccountType getBankAccountType() {
        return BankAccountType;
    }


    /**
     *  The type of bank accout e.g. checking, savings etc
     * 
     * @param BankAccountType The type of bank accout e.g. checking, savings etc
     */
    public void setBankAccountType(com.guidewire.ab.webservices.enumeration.BankAccountType BankAccountType) {
        this.BankAccountType = BankAccountType;
    }


    /**
     *  The name of the bank
     * 
     * @return BankName The name of the bank
     */
    public java.lang.String getBankName() {
        return BankName;
    }


    /**
     *  The name of the bank
     * 
     * @param BankName The name of the bank
     */
    public void setBankName(java.lang.String BankName) {
        this.BankName = BankName;
    }


    /**
     *  The routing number is a nine digit bank code used in the United
 * States
     * 
     * @return BankRoutingNumber The routing number is a nine digit bank code used in the United
 * States
     */
    public java.lang.String getBankRoutingNumber() {
        return BankRoutingNumber;
    }


    /**
     *  The routing number is a nine digit bank code used in the United
 * States
     * 
     * @param BankRoutingNumber The routing number is a nine digit bank code used in the United
 * States
     */
    public void setBankRoutingNumber(java.lang.String BankRoutingNumber) {
        this.BankRoutingNumber = BankRoutingNumber;
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
     *  Contact this EFT record relates to
     * 
     * @return Contact Contact this EFT record relates to
     */
    public com.guidewire.ab.webservices.entity.ABContact getContact() {
        return Contact;
    }


    /**
     *  Contact this EFT record relates to
     * 
     * @param Contact Contact this EFT record relates to
     */
    public void setContact(com.guidewire.ab.webservices.entity.ABContact Contact) {
        this.Contact = Contact;
    }


    /**
     *  Indicates if this is the primary EFT record for the contact
     * 
     * @return IsPrimary Indicates if this is the primary EFT record for the contact
     */
    public java.lang.Boolean getIsPrimary() {
        return IsPrimary;
    }


    /**
     *  Indicates if this is the primary EFT record for the contact
     * 
     * @param IsPrimary Indicates if this is the primary EFT record for the contact
     */
    public void setIsPrimary(java.lang.Boolean IsPrimary) {
        this.IsPrimary = IsPrimary;
    }


    /**
     *  Represents the ID used by client applications to link with the
 * Address Book.
     * 
     * @return LinkID Represents the ID used by client applications to link with the
 * Address Book.
     */
    public java.lang.String getLinkID() {
        return LinkID;
    }


    /**
     *  Represents the ID used by client applications to link with the
 * Address Book.
     * 
     * @param LinkID Represents the ID used by client applications to link with the
 * Address Book.
     */
    public void setLinkID(java.lang.String LinkID) {
        this.LinkID = LinkID;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EFTData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "EFTData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BankAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BankAccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BankAccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankRoutingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BankRoutingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinkID"));
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
