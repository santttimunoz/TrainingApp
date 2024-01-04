/**
 * ABMedicalCareOrg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class ABMedicalCareOrg  extends com.guidewire.ab.webservices.entity.ABCompanyVendor  implements java.io.Serializable {
    /** 
        Is this medical care org a member of a healthcare network?
     */ 
    private java.lang.Boolean IsMemberOfNetwork;
    /** 
        Medical specialty
     */ 
    private com.guidewire.ab.webservices.enumeration.SpecialtyType MedicalOrgSpecialty;
    /** 
        Name of healthcare network
     */ 
    private java.lang.String NetworkName;

    public ABMedicalCareOrg() {
    }

    public ABMedicalCareOrg(
           java.lang.Boolean IsMemberOfNetwork,
           com.guidewire.ab.webservices.enumeration.SpecialtyType MedicalOrgSpecialty,
           java.lang.String NetworkName) {
           this.IsMemberOfNetwork = IsMemberOfNetwork;
           this.MedicalOrgSpecialty = MedicalOrgSpecialty;
           this.NetworkName = NetworkName;
    }


    /**
     *  Is this medical care org a member of a healthcare network?
     * 
     * @return IsMemberOfNetwork Is this medical care org a member of a healthcare network?
     */
    public java.lang.Boolean getIsMemberOfNetwork() {
        return IsMemberOfNetwork;
    }


    /**
     *  Is this medical care org a member of a healthcare network?
     * 
     * @param IsMemberOfNetwork Is this medical care org a member of a healthcare network?
     */
    public void setIsMemberOfNetwork(java.lang.Boolean IsMemberOfNetwork) {
        this.IsMemberOfNetwork = IsMemberOfNetwork;
    }


    /**
     *  Medical specialty
     * 
     * @return MedicalOrgSpecialty Medical specialty
     */
    public com.guidewire.ab.webservices.enumeration.SpecialtyType getMedicalOrgSpecialty() {
        return MedicalOrgSpecialty;
    }


    /**
     *  Medical specialty
     * 
     * @param MedicalOrgSpecialty Medical specialty
     */
    public void setMedicalOrgSpecialty(com.guidewire.ab.webservices.enumeration.SpecialtyType MedicalOrgSpecialty) {
        this.MedicalOrgSpecialty = MedicalOrgSpecialty;
    }


    /**
     *  Name of healthcare network
     * 
     * @return NetworkName Name of healthcare network
     */
    public java.lang.String getNetworkName() {
        return NetworkName;
    }


    /**
     *  Name of healthcare network
     * 
     * @param NetworkName Name of healthcare network
     */
    public void setNetworkName(java.lang.String NetworkName) {
        this.NetworkName = NetworkName;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABMedicalCareOrg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABMedicalCareOrg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMemberOfNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsMemberOfNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medicalOrgSpecialty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MedicalOrgSpecialty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "SpecialtyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NetworkName"));
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
