/**
 * ABAutoRepairShop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class ABAutoRepairShop  extends com.guidewire.ab.webservices.entity.ABCompanyVendor  implements java.io.Serializable {
    /** 
        Auto repair shop business license number
     */ 
    private java.lang.String AutoRepairLicense;
    /** 
        Is this agency a franchise?
     */ 
    private java.lang.Boolean IsFranchise;
    /** 
        Secondary towing provider
     */ 
    private java.lang.String TowingProvider;

    public ABAutoRepairShop() {
    }

    public ABAutoRepairShop(
           java.lang.String AutoRepairLicense,
           java.lang.Boolean IsFranchise,
           java.lang.String TowingProvider) {
           this.AutoRepairLicense = AutoRepairLicense;
           this.IsFranchise = IsFranchise;
           this.TowingProvider = TowingProvider;
    }


    /**
     *  Auto repair shop business license number
     * 
     * @return AutoRepairLicense Auto repair shop business license number
     */
    public java.lang.String getAutoRepairLicense() {
        return AutoRepairLicense;
    }


    /**
     *  Auto repair shop business license number
     * 
     * @param AutoRepairLicense Auto repair shop business license number
     */
    public void setAutoRepairLicense(java.lang.String AutoRepairLicense) {
        this.AutoRepairLicense = AutoRepairLicense;
    }


    /**
     *  Is this agency a franchise?
     * 
     * @return IsFranchise Is this agency a franchise?
     */
    public java.lang.Boolean getIsFranchise() {
        return IsFranchise;
    }


    /**
     *  Is this agency a franchise?
     * 
     * @param IsFranchise Is this agency a franchise?
     */
    public void setIsFranchise(java.lang.Boolean IsFranchise) {
        this.IsFranchise = IsFranchise;
    }


    /**
     *  Secondary towing provider
     * 
     * @return TowingProvider Secondary towing provider
     */
    public java.lang.String getTowingProvider() {
        return TowingProvider;
    }


    /**
     *  Secondary towing provider
     * 
     * @param TowingProvider Secondary towing provider
     */
    public void setTowingProvider(java.lang.String TowingProvider) {
        this.TowingProvider = TowingProvider;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABAutoRepairShop.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABAutoRepairShop"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRepairLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoRepairLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFranchise");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsFranchise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("towingProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TowingProvider"));
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
