/**
 * ABLawFirm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class ABLawFirm  extends com.guidewire.ab.webservices.entity.ABCompanyVendor  implements java.io.Serializable {
    /** 
        Law firm specialty
     */ 
    private com.guidewire.ab.webservices.enumeration.LegalSpecialty LawFirmSpecialty;

    public ABLawFirm() {
    }

    public ABLawFirm(
           com.guidewire.ab.webservices.enumeration.LegalSpecialty LawFirmSpecialty) {
           this.LawFirmSpecialty = LawFirmSpecialty;
    }


    /**
     *  Law firm specialty
     * 
     * @return LawFirmSpecialty Law firm specialty
     */
    public com.guidewire.ab.webservices.enumeration.LegalSpecialty getLawFirmSpecialty() {
        return LawFirmSpecialty;
    }


    /**
     *  Law firm specialty
     * 
     * @param LawFirmSpecialty Law firm specialty
     */
    public void setLawFirmSpecialty(com.guidewire.ab.webservices.enumeration.LegalSpecialty LawFirmSpecialty) {
        this.LawFirmSpecialty = LawFirmSpecialty;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABLawFirm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABLawFirm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lawFirmSpecialty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LawFirmSpecialty"));
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
