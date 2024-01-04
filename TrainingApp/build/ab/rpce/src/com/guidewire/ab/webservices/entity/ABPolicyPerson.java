/**
 * ABPolicyPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Contact type representing policy entities that are people.
 */
public class ABPolicyPerson  extends com.guidewire.ab.webservices.entity.ABPerson  implements java.io.Serializable {
    /** 
        Amount of collateral required
     */ 
    private java.lang.Integer CollateralAmount;
    /** 
        Is collateral (a deposit) required to insure this person?
     */ 
    private java.lang.Boolean CollateralRequired;
    /** 
        Height in meters, such as 1.9805
     */ 
    private java.math.BigDecimal HeightInMeters;
    /** 
        YesNo
     */ 
    private com.guidewire.ab.webservices.enumeration.YesNo PersonCollateralVerified;

    public ABPolicyPerson() {
    }

    public ABPolicyPerson(
           java.lang.Integer CollateralAmount,
           java.lang.Boolean CollateralRequired,
           java.math.BigDecimal HeightInMeters,
           com.guidewire.ab.webservices.enumeration.YesNo PersonCollateralVerified) {
           this.CollateralAmount = CollateralAmount;
           this.CollateralRequired = CollateralRequired;
           this.HeightInMeters = HeightInMeters;
           this.PersonCollateralVerified = PersonCollateralVerified;
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
     *  Is collateral (a deposit) required to insure this person?
     * 
     * @return CollateralRequired Is collateral (a deposit) required to insure this person?
     */
    public java.lang.Boolean getCollateralRequired() {
        return CollateralRequired;
    }


    /**
     *  Is collateral (a deposit) required to insure this person?
     * 
     * @param CollateralRequired Is collateral (a deposit) required to insure this person?
     */
    public void setCollateralRequired(java.lang.Boolean CollateralRequired) {
        this.CollateralRequired = CollateralRequired;
    }


    /**
     *  Height in meters, such as 1.9805
     * 
     * @return HeightInMeters Height in meters, such as 1.9805
     */
    public java.math.BigDecimal getHeightInMeters() {
        return HeightInMeters;
    }


    /**
     *  Height in meters, such as 1.9805
     * 
     * @param HeightInMeters Height in meters, such as 1.9805
     */
    public void setHeightInMeters(java.math.BigDecimal HeightInMeters) {
        this.HeightInMeters = HeightInMeters;
    }


    /**
     *  YesNo
     * 
     * @return PersonCollateralVerified YesNo
     */
    public com.guidewire.ab.webservices.enumeration.YesNo getPersonCollateralVerified() {
        return PersonCollateralVerified;
    }


    /**
     *  YesNo
     * 
     * @param PersonCollateralVerified YesNo
     */
    public void setPersonCollateralVerified(com.guidewire.ab.webservices.enumeration.YesNo PersonCollateralVerified) {
        this.PersonCollateralVerified = PersonCollateralVerified;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABPolicyPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABPolicyPerson"));
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
        elemField.setFieldName("heightInMeters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HeightInMeters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personCollateralVerified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PersonCollateralVerified"));
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
