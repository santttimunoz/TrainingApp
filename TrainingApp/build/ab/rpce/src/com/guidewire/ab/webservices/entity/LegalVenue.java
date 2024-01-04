/**
 * LegalVenue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Represents a court as a Place. May specify that a court is of a
 * specific type.
 */
public class LegalVenue  extends com.guidewire.ab.webservices.entity.Place  implements java.io.Serializable {
    /** 
        Type of court.
     */ 
    private com.guidewire.ab.webservices.enumeration.VenueType VenueType;

    public LegalVenue() {
    }

    public LegalVenue(
           com.guidewire.ab.webservices.enumeration.VenueType VenueType) {
           this.VenueType = VenueType;
    }


    /**
     *  Type of court.
     * 
     * @return VenueType Type of court.
     */
    public com.guidewire.ab.webservices.enumeration.VenueType getVenueType() {
        return VenueType;
    }


    /**
     *  Type of court.
     * 
     * @param VenueType Type of court.
     */
    public void setVenueType(com.guidewire.ab.webservices.enumeration.VenueType VenueType) {
        this.VenueType = VenueType;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LegalVenue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LegalVenue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("venueType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VenueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VenueType"));
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
