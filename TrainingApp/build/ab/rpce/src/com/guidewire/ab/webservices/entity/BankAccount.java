/**
 * BankAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Contact bank account
 */
public class BankAccount  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Associated contact
     */ 
    private com.guidewire.ab.webservices.entity.ABContact ABContact;
    /** 
        Account number
     */ 
    private java.lang.String AccountNumber;
    /** 
        Type of bank account
     */ 
    private com.guidewire.ab.webservices.enumeration.BankAccountType AccountType;
    /** 
        Bank name
     */ 
    private java.lang.String BankName;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Has the routing and account information been verified with the
 * bank?
     */ 
    private com.guidewire.ab.webservices.enumeration.VerificationStatus IsVerified;
    /** 
     */ 
    private java.util.Calendar OrginateDate;
    /** 
        Account routing number
     */ 
    private java.lang.String RoutingNumber;

    public BankAccount() {
    }

    public BankAccount(
           com.guidewire.ab.webservices.entity.ABContact ABContact,
           java.lang.String AccountNumber,
           com.guidewire.ab.webservices.enumeration.BankAccountType AccountType,
           java.lang.String BankName,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.enumeration.VerificationStatus IsVerified,
           java.util.Calendar OrginateDate,
           java.lang.String RoutingNumber) {
           this.ABContact = ABContact;
           this.AccountNumber = AccountNumber;
           this.AccountType = AccountType;
           this.BankName = BankName;
           this.BeanVersion = BeanVersion;
           this.IsVerified = IsVerified;
           this.OrginateDate = OrginateDate;
           this.RoutingNumber = RoutingNumber;
    }


    /**
     *  Associated contact
     * 
     * @return ABContact Associated contact
     */
    public com.guidewire.ab.webservices.entity.ABContact getABContact() {
        return ABContact;
    }


    /**
     *  Associated contact
     * 
     * @param ABContact Associated contact
     */
    public void setABContact(com.guidewire.ab.webservices.entity.ABContact ABContact) {
        this.ABContact = ABContact;
    }


    /**
     *  Account number
     * 
     * @return AccountNumber Account number
     */
    public java.lang.String getAccountNumber() {
        return AccountNumber;
    }


    /**
     *  Account number
     * 
     * @param AccountNumber Account number
     */
    public void setAccountNumber(java.lang.String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }


    /**
     *  Type of bank account
     * 
     * @return AccountType Type of bank account
     */
    public com.guidewire.ab.webservices.enumeration.BankAccountType getAccountType() {
        return AccountType;
    }


    /**
     *  Type of bank account
     * 
     * @param AccountType Type of bank account
     */
    public void setAccountType(com.guidewire.ab.webservices.enumeration.BankAccountType AccountType) {
        this.AccountType = AccountType;
    }


    /**
     *  Bank name
     * 
     * @return BankName Bank name
     */
    public java.lang.String getBankName() {
        return BankName;
    }


    /**
     *  Bank name
     * 
     * @param BankName Bank name
     */
    public void setBankName(java.lang.String BankName) {
        this.BankName = BankName;
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
     *  Has the routing and account information been verified with the
 * bank?
     * 
     * @return IsVerified Has the routing and account information been verified with the
 * bank?
     */
    public com.guidewire.ab.webservices.enumeration.VerificationStatus getIsVerified() {
        return IsVerified;
    }


    /**
     *  Has the routing and account information been verified with the
 * bank?
     * 
     * @param IsVerified Has the routing and account information been verified with the
 * bank?
     */
    public void setIsVerified(com.guidewire.ab.webservices.enumeration.VerificationStatus IsVerified) {
        this.IsVerified = IsVerified;
    }


    /**
     * 
     * 
     * @return OrginateDate
     */
    public java.util.Calendar getOrginateDate() {
        return OrginateDate;
    }


    /**
     * 
     * 
     * @param OrginateDate
     */
    public void setOrginateDate(java.util.Calendar OrginateDate) {
        this.OrginateDate = OrginateDate;
    }


    /**
     *  Account routing number
     * 
     * @return RoutingNumber Account routing number
     */
    public java.lang.String getRoutingNumber() {
        return RoutingNumber;
    }


    /**
     *  Account routing number
     * 
     * @param RoutingNumber Account routing number
     */
    public void setRoutingNumber(java.lang.String RoutingNumber) {
        this.RoutingNumber = RoutingNumber;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "BankAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ABContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccountType"));
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
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVerified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsVerified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VerificationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orginateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrginateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RoutingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
