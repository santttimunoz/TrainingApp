/**
 * ZoneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;

public class ZoneType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ZoneType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_city;
    private static java.lang.String _TC_citykanji;
    private static java.lang.String _TC_country;
    private static java.lang.String _TC_county;
    private static java.lang.String _TC_fsa;
    private static java.lang.String _TC_postcodearea;
    private static java.lang.String _TC_postcoderegion;
    private static java.lang.String _TC_postalcode;
    private static java.lang.String _TC_prefecture;
    private static java.lang.String _TC_province;
    private static java.lang.String _TC_state;
    private static java.lang.String _TC_zip;
    private static java.lang.String _TC_unknown;

/**
 * City
 */
    public static ZoneType TC_city;

/**
 * CityKanji
 */
    public static ZoneType TC_citykanji;

/**
 * Country
 */
    public static ZoneType TC_country;

/**
 * County
 */
    public static ZoneType TC_county;

/**
 * FSA
 */
    public static ZoneType TC_fsa;

/**
 * Post Code Area
 */
    public static ZoneType TC_postcodearea;

/**
 * Post Code Region
 */
    public static ZoneType TC_postcoderegion;

/**
 * PostalCode
 */
    public static ZoneType TC_postalcode;

/**
 * Prefecture
 */
    public static ZoneType TC_prefecture;

/**
 * Province
 */
    public static ZoneType TC_province;

/**
 * State
 */
    public static ZoneType TC_state;

/**
 * Zip code
 */
    public static ZoneType TC_zip;

/**
 * Placeholder typecode for fields that should be populated with another
 * ZoneType
 */
    public static ZoneType TC_unknown;

    private static void initValues0() {
      _TC_city = "TC_city";
      TC_city = new ZoneType(_TC_city);
      _TC_citykanji = "TC_citykanji";
      TC_citykanji = new ZoneType(_TC_citykanji);
      _TC_country = "TC_country";
      TC_country = new ZoneType(_TC_country);
      _TC_county = "TC_county";
      TC_county = new ZoneType(_TC_county);
      _TC_fsa = "TC_fsa";
      TC_fsa = new ZoneType(_TC_fsa);
      _TC_postcodearea = "TC_postcodearea";
      TC_postcodearea = new ZoneType(_TC_postcodearea);
      _TC_postcoderegion = "TC_postcoderegion";
      TC_postcoderegion = new ZoneType(_TC_postcoderegion);
      _TC_postalcode = "TC_postalcode";
      TC_postalcode = new ZoneType(_TC_postalcode);
      _TC_prefecture = "TC_prefecture";
      TC_prefecture = new ZoneType(_TC_prefecture);
      _TC_province = "TC_province";
      TC_province = new ZoneType(_TC_province);
      _TC_state = "TC_state";
      TC_state = new ZoneType(_TC_state);
      _TC_zip = "TC_zip";
      TC_zip = new ZoneType(_TC_zip);
      _TC_unknown = "TC_unknown";
      TC_unknown = new ZoneType(_TC_unknown);
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
    public static ZoneType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ZoneType enumeration = (ZoneType) internalFromCode(value);
        if (enumeration == null) enumeration = (ZoneType) internalFromCode("TC_" + value);
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
    public static ZoneType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static ZoneType internalFromCode(java.lang.String value){
        ZoneType enumeration = (ZoneType)
            _table_.get(value);
        return enumeration;
    }
    public static ZoneType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ZoneType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ZoneType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
