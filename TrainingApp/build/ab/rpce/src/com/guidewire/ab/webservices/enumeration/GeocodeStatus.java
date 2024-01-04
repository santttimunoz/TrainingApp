/**
 * GeocodeStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Describes the status of a geocode on an Address: customers may
 * modify it for different geocoding providers.
 */
public class GeocodeStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GeocodeStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_city;
    private static java.lang.String _TC_exact;
    private static java.lang.String _TC_failure;
    private static java.lang.String _TC_none;
    private static java.lang.String _TC_postalcode;
    private static java.lang.String _TC_street;

/**
 * The Geocoding service was only able to locate the city from the
 * supplied address.
 */
    public static GeocodeStatus TC_city;

/**
 * The Geocoding service was able to find an exact match for the supplied
 * address.
 */
    public static GeocodeStatus TC_exact;

/**
 * The Geocoding service was unable to geocode the address.
 */
    public static GeocodeStatus TC_failure;

/**
 * An Address has never been submitted for geocoding.
 */
    public static GeocodeStatus TC_none;

/**
 * The Geocoding service was only able to locate the postal code from
 * the supplied address.
 */
    public static GeocodeStatus TC_postalcode;

/**
 * The Geocoding service was only able to locate the street from the
 * supplied address.
 */
    public static GeocodeStatus TC_street;

    private static void initValues0() {
      _TC_city = "TC_city";
      TC_city = new GeocodeStatus(_TC_city);
      _TC_exact = "TC_exact";
      TC_exact = new GeocodeStatus(_TC_exact);
      _TC_failure = "TC_failure";
      TC_failure = new GeocodeStatus(_TC_failure);
      _TC_none = "TC_none";
      TC_none = new GeocodeStatus(_TC_none);
      _TC_postalcode = "TC_postalcode";
      TC_postalcode = new GeocodeStatus(_TC_postalcode);
      _TC_street = "TC_street";
      TC_street = new GeocodeStatus(_TC_street);
    }

    static {
      initValues0();
    }
/**
Returns the String representation of the enumeration, equivalent to toString()
 */
    public java.lang.String getValue() { return _value_;}
/**
Returns the enumeration instance which matches the String.<p><b>Note:</b> Requires a preceding "TC_" to be appended to the code value of a typekey
 */
    public static GeocodeStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GeocodeStatus enumeration = (GeocodeStatus) internalFromCode(value);
        if (enumeration == null) enumeration = (GeocodeStatus) internalFromCode("TC_" + value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public java.lang.String toCode() {
        if (_value_.length() <= 3 || _value_ == null){
            return _value_;
        }
        if (_value_.startsWith("TC_")){
            return _value_.substring(3);
        }
        return toString();
    }
    public static GeocodeStatus fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static GeocodeStatus internalFromCode(java.lang.String value){
        GeocodeStatus enumeration = (GeocodeStatus)
            _table_.get(value);
        return enumeration;
    }
    public static GeocodeStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeocodeStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "GeocodeStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
