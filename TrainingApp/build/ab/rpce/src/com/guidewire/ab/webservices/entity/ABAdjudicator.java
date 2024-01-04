/**
 * ABAdjudicator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Judge or arbitrator.
 */
public class ABAdjudicator  extends com.guidewire.ab.webservices.entity.ABPerson  implements java.io.Serializable {
    /** 
        Adjudicative Domain
     */ 
    private com.guidewire.ab.webservices.enumeration.AdjudicativeDomain AdjudicativeDomain;
    /** 
        Adjudicator's business license number.
     */ 
    private java.lang.String AdjudicatorLicense;

    public ABAdjudicator() {
    }

    public ABAdjudicator(
           com.guidewire.ab.webservices.enumeration.AdjudicativeDomain AdjudicativeDomain,
           java.lang.String AdjudicatorLicense) {
           this.AdjudicativeDomain = AdjudicativeDomain;
           this.AdjudicatorLicense = AdjudicatorLicense;
    }


    /**
     *  Adjudicative Domain
     * 
     * @return AdjudicativeDomain Adjudicative Domain
     */
    public com.guidewire.ab.webservices.enumeration.AdjudicativeDomain getAdjudicativeDomain() {
        return AdjudicativeDomain;
    }


    /**
     *  Adjudicative Domain
     * 
     * @param AdjudicativeDomain Adjudicative Domain
     */
    public void setAdjudicativeDomain(com.guidewire.ab.webservices.enumeration.AdjudicativeDomain AdjudicativeDomain) {
        this.AdjudicativeDomain = AdjudicativeDomain;
    }


    /**
     *  Adjudicator's business license number.
     * 
     * @return AdjudicatorLicense Adjudicator's business license number.
     */
    public java.lang.String getAdjudicatorLicense() {
        return AdjudicatorLicense;
    }


    /**
     *  Adjudicator's business license number.
     * 
     * @param AdjudicatorLicense Adjudicator's business license number.
     */
    public void setAdjudicatorLicense(java.lang.String AdjudicatorLicense) {
        this.AdjudicatorLicense = AdjudicatorLicense;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABAdjudicator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABAdjudicator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjudicativeDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdjudicativeDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "AdjudicativeDomain"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjudicatorLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdjudicatorLicense"));
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
