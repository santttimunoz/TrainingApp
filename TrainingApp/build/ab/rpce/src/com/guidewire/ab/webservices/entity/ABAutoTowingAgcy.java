/**
 * ABAutoTowingAgcy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class ABAutoTowingAgcy  extends com.guidewire.ab.webservices.entity.ABCompanyVendor  implements java.io.Serializable {
    /** 
        Auto towing agency business license number
     */ 
    private java.lang.String AutoTowingLicense;

    public ABAutoTowingAgcy() {
    }

    public ABAutoTowingAgcy(
           java.lang.String AutoTowingLicense) {
           this.AutoTowingLicense = AutoTowingLicense;
    }


    /**
     *  Auto towing agency business license number
     * 
     * @return AutoTowingLicense Auto towing agency business license number
     */
    public java.lang.String getAutoTowingLicense() {
        return AutoTowingLicense;
    }


    /**
     *  Auto towing agency business license number
     * 
     * @param AutoTowingLicense Auto towing agency business license number
     */
    public void setAutoTowingLicense(java.lang.String AutoTowingLicense) {
        this.AutoTowingLicense = AutoTowingLicense;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABAutoTowingAgcy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABAutoTowingAgcy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoTowingLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoTowingLicense"));
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
