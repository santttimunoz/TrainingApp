/**
 * ABAttorney.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Attorney
 */
public class ABAttorney  extends com.guidewire.ab.webservices.entity.ABPersonVendor  implements java.io.Serializable {
    /** 
        Attorney's business license number.
     */ 
    private java.lang.String AttorneyLicense;
    /** 
        Attorney's specialty
     */ 
    private com.guidewire.ab.webservices.enumeration.LegalSpecialty AttorneySpecialty;

    public ABAttorney() {
    }

    public ABAttorney(
           java.lang.String AttorneyLicense,
           com.guidewire.ab.webservices.enumeration.LegalSpecialty AttorneySpecialty) {
           this.AttorneyLicense = AttorneyLicense;
           this.AttorneySpecialty = AttorneySpecialty;
    }


    /**
     *  Attorney's business license number.
     * 
     * @return AttorneyLicense Attorney's business license number.
     */
    public java.lang.String getAttorneyLicense() {
        return AttorneyLicense;
    }


    /**
     *  Attorney's business license number.
     * 
     * @param AttorneyLicense Attorney's business license number.
     */
    public void setAttorneyLicense(java.lang.String AttorneyLicense) {
        this.AttorneyLicense = AttorneyLicense;
    }


    /**
     *  Attorney's specialty
     * 
     * @return AttorneySpecialty Attorney's specialty
     */
    public com.guidewire.ab.webservices.enumeration.LegalSpecialty getAttorneySpecialty() {
        return AttorneySpecialty;
    }


    /**
     *  Attorney's specialty
     * 
     * @param AttorneySpecialty Attorney's specialty
     */
    public void setAttorneySpecialty(com.guidewire.ab.webservices.enumeration.LegalSpecialty AttorneySpecialty) {
        this.AttorneySpecialty = AttorneySpecialty;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABAttorney.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABAttorney"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attorneyLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttorneyLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attorneySpecialty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttorneySpecialty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LegalSpecialty"));
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
