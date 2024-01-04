/**
 * ABCompanyVendor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Contact type representing vendors that are companies.
 */
public class ABCompanyVendor  extends com.guidewire.ab.webservices.entity.ABCompany  implements java.io.Serializable {
    /** 
     */ 
    private com.guidewire.ab.webservices.entity.ABPerson FinanceManager;
    /** 
        Relationship To Finance Manager
     */ 
    private com.guidewire.ab.webservices.enumeration.ManagerRelationshipType FinanceMgrRelationship;
    /** 
     */ 
    private com.guidewire.ab.webservices.entity.ABPerson PaymentContact;

    public ABCompanyVendor() {
    }

    public ABCompanyVendor(
           com.guidewire.ab.webservices.entity.ABPerson FinanceManager,
           com.guidewire.ab.webservices.enumeration.ManagerRelationshipType FinanceMgrRelationship,
           com.guidewire.ab.webservices.entity.ABPerson PaymentContact) {
           this.FinanceManager = FinanceManager;
           this.FinanceMgrRelationship = FinanceMgrRelationship;
           this.PaymentContact = PaymentContact;
    }


    /**
     * 
     * 
     * @return FinanceManager
     */
    public com.guidewire.ab.webservices.entity.ABPerson getFinanceManager() {
        return FinanceManager;
    }


    /**
     * 
     * 
     * @param FinanceManager
     */
    public void setFinanceManager(com.guidewire.ab.webservices.entity.ABPerson FinanceManager) {
        this.FinanceManager = FinanceManager;
    }


    /**
     *  Relationship To Finance Manager
     * 
     * @return FinanceMgrRelationship Relationship To Finance Manager
     */
    public com.guidewire.ab.webservices.enumeration.ManagerRelationshipType getFinanceMgrRelationship() {
        return FinanceMgrRelationship;
    }


    /**
     *  Relationship To Finance Manager
     * 
     * @param FinanceMgrRelationship Relationship To Finance Manager
     */
    public void setFinanceMgrRelationship(com.guidewire.ab.webservices.enumeration.ManagerRelationshipType FinanceMgrRelationship) {
        this.FinanceMgrRelationship = FinanceMgrRelationship;
    }


    /**
     * 
     * 
     * @return PaymentContact
     */
    public com.guidewire.ab.webservices.entity.ABPerson getPaymentContact() {
        return PaymentContact;
    }


    /**
     * 
     * 
     * @param PaymentContact
     */
    public void setPaymentContact(com.guidewire.ab.webservices.entity.ABPerson PaymentContact) {
        this.PaymentContact = PaymentContact;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABCompanyVendor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABCompanyVendor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financeManager");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FinanceManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABPerson"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financeMgrRelationship");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FinanceMgrRelationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ManagerRelationshipType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaymentContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABPerson"));
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
