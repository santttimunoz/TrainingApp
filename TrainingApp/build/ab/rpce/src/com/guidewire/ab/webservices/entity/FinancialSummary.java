/**
 * FinancialSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Financial information about a contact that holds one or more policies
 */
public class FinancialSummary  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Related ABContact
     */ 
    private com.guidewire.ab.webservices.entity.ABContact ABContact;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Date of most recent claim (whether money was paid or not)
     */ 
    private java.util.Calendar MostRecentClaim;
    /** 
        Number of claims made against policies held by contact
     */ 
    private java.lang.Integer NumberOfClaims;
    /** 
        Total amount of money paid for claims on policies held by contact
     */ 
    private com.guidewire.ab.webservices.entity.CurrencyAmount TotalClaimPaymentsMade;
    /** 
        Total amount of money billed to contact for all policies held
     */ 
    private com.guidewire.ab.webservices.entity.CurrencyAmount TotalPolicyPremiumBilled;
    /** 
        Total amount of money paid by contact for all policies held
     */ 
    private com.guidewire.ab.webservices.entity.CurrencyAmount TotalPolicyPremiumPaid;
    /** 
        Total amount of money refunded to contact
     */ 
    private com.guidewire.ab.webservices.entity.CurrencyAmount TotalPolicyPremiumRefunded;

    public FinancialSummary() {
    }

    public FinancialSummary(
           com.guidewire.ab.webservices.entity.ABContact ABContact,
           java.lang.Integer BeanVersion,
           java.util.Calendar MostRecentClaim,
           java.lang.Integer NumberOfClaims,
           com.guidewire.ab.webservices.entity.CurrencyAmount TotalClaimPaymentsMade,
           com.guidewire.ab.webservices.entity.CurrencyAmount TotalPolicyPremiumBilled,
           com.guidewire.ab.webservices.entity.CurrencyAmount TotalPolicyPremiumPaid,
           com.guidewire.ab.webservices.entity.CurrencyAmount TotalPolicyPremiumRefunded) {
           this.ABContact = ABContact;
           this.BeanVersion = BeanVersion;
           this.MostRecentClaim = MostRecentClaim;
           this.NumberOfClaims = NumberOfClaims;
           this.TotalClaimPaymentsMade = TotalClaimPaymentsMade;
           this.TotalPolicyPremiumBilled = TotalPolicyPremiumBilled;
           this.TotalPolicyPremiumPaid = TotalPolicyPremiumPaid;
           this.TotalPolicyPremiumRefunded = TotalPolicyPremiumRefunded;
    }


    /**
     *  Related ABContact
     * 
     * @return ABContact Related ABContact
     */
    public com.guidewire.ab.webservices.entity.ABContact getABContact() {
        return ABContact;
    }


    /**
     *  Related ABContact
     * 
     * @param ABContact Related ABContact
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
     *  Date of most recent claim (whether money was paid or not)
     * 
     * @return MostRecentClaim Date of most recent claim (whether money was paid or not)
     */
    public java.util.Calendar getMostRecentClaim() {
        return MostRecentClaim;
    }


    /**
     *  Date of most recent claim (whether money was paid or not)
     * 
     * @param MostRecentClaim Date of most recent claim (whether money was paid or not)
     */
    public void setMostRecentClaim(java.util.Calendar MostRecentClaim) {
        this.MostRecentClaim = MostRecentClaim;
    }


    /**
     *  Number of claims made against policies held by contact
     * 
     * @return NumberOfClaims Number of claims made against policies held by contact
     */
    public java.lang.Integer getNumberOfClaims() {
        return NumberOfClaims;
    }


    /**
     *  Number of claims made against policies held by contact
     * 
     * @param NumberOfClaims Number of claims made against policies held by contact
     */
    public void setNumberOfClaims(java.lang.Integer NumberOfClaims) {
        this.NumberOfClaims = NumberOfClaims;
    }


    /**
     *  Total amount of money paid for claims on policies held by contact
     * 
     * @return TotalClaimPaymentsMade Total amount of money paid for claims on policies held by contact
     */
    public com.guidewire.ab.webservices.entity.CurrencyAmount getTotalClaimPaymentsMade() {
        return TotalClaimPaymentsMade;
    }


    /**
     *  Total amount of money paid for claims on policies held by contact
     * 
     * @param TotalClaimPaymentsMade Total amount of money paid for claims on policies held by contact
     */
    public void setTotalClaimPaymentsMade(com.guidewire.ab.webservices.entity.CurrencyAmount TotalClaimPaymentsMade) {
        this.TotalClaimPaymentsMade = TotalClaimPaymentsMade;
    }


    /**
     *  Total amount of money billed to contact for all policies held
     * 
     * @return TotalPolicyPremiumBilled Total amount of money billed to contact for all policies held
     */
    public com.guidewire.ab.webservices.entity.CurrencyAmount getTotalPolicyPremiumBilled() {
        return TotalPolicyPremiumBilled;
    }


    /**
     *  Total amount of money billed to contact for all policies held
     * 
     * @param TotalPolicyPremiumBilled Total amount of money billed to contact for all policies held
     */
    public void setTotalPolicyPremiumBilled(com.guidewire.ab.webservices.entity.CurrencyAmount TotalPolicyPremiumBilled) {
        this.TotalPolicyPremiumBilled = TotalPolicyPremiumBilled;
    }


    /**
     *  Total amount of money paid by contact for all policies held
     * 
     * @return TotalPolicyPremiumPaid Total amount of money paid by contact for all policies held
     */
    public com.guidewire.ab.webservices.entity.CurrencyAmount getTotalPolicyPremiumPaid() {
        return TotalPolicyPremiumPaid;
    }


    /**
     *  Total amount of money paid by contact for all policies held
     * 
     * @param TotalPolicyPremiumPaid Total amount of money paid by contact for all policies held
     */
    public void setTotalPolicyPremiumPaid(com.guidewire.ab.webservices.entity.CurrencyAmount TotalPolicyPremiumPaid) {
        this.TotalPolicyPremiumPaid = TotalPolicyPremiumPaid;
    }


    /**
     *  Total amount of money refunded to contact
     * 
     * @return TotalPolicyPremiumRefunded Total amount of money refunded to contact
     */
    public com.guidewire.ab.webservices.entity.CurrencyAmount getTotalPolicyPremiumRefunded() {
        return TotalPolicyPremiumRefunded;
    }


    /**
     *  Total amount of money refunded to contact
     * 
     * @param TotalPolicyPremiumRefunded Total amount of money refunded to contact
     */
    public void setTotalPolicyPremiumRefunded(com.guidewire.ab.webservices.entity.CurrencyAmount TotalPolicyPremiumRefunded) {
        this.TotalPolicyPremiumRefunded = TotalPolicyPremiumRefunded;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FinancialSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FinancialSummary"));
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
        elemField.setFieldName("mostRecentClaim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MostRecentClaim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfClaims");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumberOfClaims"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalClaimPaymentsMade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalClaimPaymentsMade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CurrencyAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPolicyPremiumBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalPolicyPremiumBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CurrencyAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPolicyPremiumPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalPolicyPremiumPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CurrencyAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPolicyPremiumRefunded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalPolicyPremiumRefunded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CurrencyAmount"));
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
