/**
 * ABPersonVendor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Contact type representing vendors that are people.
 */
public class ABPersonVendor  extends com.guidewire.ab.webservices.entity.ABPerson  implements java.io.Serializable {
    /** 
        Date of check for convictions
     */ 
    private java.util.Calendar FraudConvictionsDate_Ext;
    /** 
        Number of convictions for fraud
     */ 
    private java.lang.Integer FraudConvictions_Ext;
    /** 
        Is the vendor self-employed?
     */ 
    private java.lang.Boolean SelfEmployeed_Ext;

    public ABPersonVendor() {
    }

    public ABPersonVendor(
           java.util.Calendar FraudConvictionsDate_Ext,
           java.lang.Integer FraudConvictions_Ext,
           java.lang.Boolean SelfEmployeed_Ext) {
           this.FraudConvictionsDate_Ext = FraudConvictionsDate_Ext;
           this.FraudConvictions_Ext = FraudConvictions_Ext;
           this.SelfEmployeed_Ext = SelfEmployeed_Ext;
    }


    /**
     *  Date of check for convictions
     * 
     * @return FraudConvictionsDate_Ext Date of check for convictions
     */
    public java.util.Calendar getFraudConvictionsDate_Ext() {
        return FraudConvictionsDate_Ext;
    }


    /**
     *  Date of check for convictions
     * 
     * @param FraudConvictionsDate_Ext Date of check for convictions
     */
    public void setFraudConvictionsDate_Ext(java.util.Calendar FraudConvictionsDate_Ext) {
        this.FraudConvictionsDate_Ext = FraudConvictionsDate_Ext;
    }


    /**
     *  Number of convictions for fraud
     * 
     * @return FraudConvictions_Ext Number of convictions for fraud
     */
    public java.lang.Integer getFraudConvictions_Ext() {
        return FraudConvictions_Ext;
    }


    /**
     *  Number of convictions for fraud
     * 
     * @param FraudConvictions_Ext Number of convictions for fraud
     */
    public void setFraudConvictions_Ext(java.lang.Integer FraudConvictions_Ext) {
        this.FraudConvictions_Ext = FraudConvictions_Ext;
    }


    /**
     *  Is the vendor self-employed?
     * 
     * @return SelfEmployeed_Ext Is the vendor self-employed?
     */
    public java.lang.Boolean getSelfEmployeed_Ext() {
        return SelfEmployeed_Ext;
    }


    /**
     *  Is the vendor self-employed?
     * 
     * @param SelfEmployeed_Ext Is the vendor self-employed?
     */
    public void setSelfEmployeed_Ext(java.lang.Boolean SelfEmployeed_Ext) {
        this.SelfEmployeed_Ext = SelfEmployeed_Ext;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABPersonVendor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABPersonVendor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudConvictionsDate_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FraudConvictionsDate_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudConvictions_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FraudConvictions_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfEmployeed_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SelfEmployeed_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
