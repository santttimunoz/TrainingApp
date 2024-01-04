/**
 * ABPolicyCompany.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Contact type representing policy entities that are companies.
 */
public class ABPolicyCompany  extends com.guidewire.ab.webservices.entity.ABCompany  implements java.io.Serializable {
    /** 
        Amount of collateral required
     */ 
    private java.lang.Integer CollateralAmount;
    /** 
        Is collateral (a deposit) required to insure this company?
     */ 
    private java.lang.Boolean CollateralRequired;
    /** 
        YesNo only
     */ 
    private com.guidewire.ab.webservices.enumeration.YesNo CompanyCollateralVerified;

    public ABPolicyCompany() {
    }

    public ABPolicyCompany(
           java.lang.Integer CollateralAmount,
           java.lang.Boolean CollateralRequired,
           com.guidewire.ab.webservices.enumeration.YesNo CompanyCollateralVerified) {
           this.CollateralAmount = CollateralAmount;
           this.CollateralRequired = CollateralRequired;
           this.CompanyCollateralVerified = CompanyCollateralVerified;
    }


    /**
     *  Amount of collateral required
     * 
     * @return CollateralAmount Amount of collateral required
     */
    public java.lang.Integer getCollateralAmount() {
        return CollateralAmount;
    }


    /**
     *  Amount of collateral required
     * 
     * @param CollateralAmount Amount of collateral required
     */
    public void setCollateralAmount(java.lang.Integer CollateralAmount) {
        this.CollateralAmount = CollateralAmount;
    }


    /**
     *  Is collateral (a deposit) required to insure this company?
     * 
     * @return CollateralRequired Is collateral (a deposit) required to insure this company?
     */
    public java.lang.Boolean getCollateralRequired() {
        return CollateralRequired;
    }


    /**
     *  Is collateral (a deposit) required to insure this company?
     * 
     * @param CollateralRequired Is collateral (a deposit) required to insure this company?
     */
    public void setCollateralRequired(java.lang.Boolean CollateralRequired) {
        this.CollateralRequired = CollateralRequired;
    }


    /**
     *  YesNo only
     * 
     * @return CompanyCollateralVerified YesNo only
     */
    public com.guidewire.ab.webservices.enumeration.YesNo getCompanyCollateralVerified() {
        return CompanyCollateralVerified;
    }


    /**
     *  YesNo only
     * 
     * @param CompanyCollateralVerified YesNo only
     */
    public void setCompanyCollateralVerified(com.guidewire.ab.webservices.enumeration.YesNo CompanyCollateralVerified) {
        this.CompanyCollateralVerified = CompanyCollateralVerified;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABPolicyCompany.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABPolicyCompany"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collateralAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CollateralAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collateralRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CollateralRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCollateralVerified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompanyCollateralVerified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "YesNo"));
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
