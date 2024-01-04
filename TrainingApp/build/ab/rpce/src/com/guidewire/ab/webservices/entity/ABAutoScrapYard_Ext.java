/**
 * ABAutoScrapYard_Ext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class ABAutoScrapYard_Ext  extends com.guidewire.ab.webservices.entity.ABCompanyVendor  implements java.io.Serializable {
    /** 
        Can this yard tow non-operational vehicles to its yard?
     */ 
    private java.lang.Boolean CanPickUpVehicles;

    public ABAutoScrapYard_Ext() {
    }

    public ABAutoScrapYard_Ext(
           java.lang.Boolean CanPickUpVehicles) {
           this.CanPickUpVehicles = CanPickUpVehicles;
    }


    /**
     *  Can this yard tow non-operational vehicles to its yard?
     * 
     * @return CanPickUpVehicles Can this yard tow non-operational vehicles to its yard?
     */
    public java.lang.Boolean getCanPickUpVehicles() {
        return CanPickUpVehicles;
    }


    /**
     *  Can this yard tow non-operational vehicles to its yard?
     * 
     * @param CanPickUpVehicles Can this yard tow non-operational vehicles to its yard?
     */
    public void setCanPickUpVehicles(java.lang.Boolean CanPickUpVehicles) {
        this.CanPickUpVehicles = CanPickUpVehicles;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABAutoScrapYard_Ext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABAutoScrapYard_Ext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canPickUpVehicles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CanPickUpVehicles"));
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
