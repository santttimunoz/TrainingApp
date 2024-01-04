/**
 * SpatialPoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class SpatialPoint  implements java.io.Serializable {
    /** 
        The latitude
     */ 
    private java.math.BigDecimal Latitude;
    /** 
        The longitude
     */ 
    private java.math.BigDecimal Longitude;
    /** 
        the well known text for this geometry object
     */ 
    private java.lang.String WellKnownText;

    public SpatialPoint() {
    }

    public SpatialPoint(
           java.math.BigDecimal Latitude,
           java.math.BigDecimal Longitude,
           java.lang.String WellKnownText) {
           this.Latitude = Latitude;
           this.Longitude = Longitude;
           this.WellKnownText = WellKnownText;
    }


    /**
     *  The latitude
     * 
     * @return Latitude The latitude
     */
    public java.math.BigDecimal getLatitude() {
        return Latitude;
    }


    /**
     *  The latitude
     * 
     * @param Latitude The latitude
     */
    public void setLatitude(java.math.BigDecimal Latitude) {
        this.Latitude = Latitude;
    }


    /**
     *  The longitude
     * 
     * @return Longitude The longitude
     */
    public java.math.BigDecimal getLongitude() {
        return Longitude;
    }


    /**
     *  The longitude
     * 
     * @param Longitude The longitude
     */
    public void setLongitude(java.math.BigDecimal Longitude) {
        this.Longitude = Longitude;
    }


    /**
     *  the well known text for this geometry object
     * 
     * @return WellKnownText the well known text for this geometry object
     */
    public java.lang.String getWellKnownText() {
        return WellKnownText;
    }


    /**
     *  the well known text for this geometry object
     * 
     * @param WellKnownText the well known text for this geometry object
     */
    public void setWellKnownText(java.lang.String WellKnownText) {
        this.WellKnownText = WellKnownText;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpatialPoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "SpatialPoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wellKnownText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WellKnownText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
