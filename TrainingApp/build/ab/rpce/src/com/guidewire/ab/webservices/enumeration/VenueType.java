/**
 * VenueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * The types of legal venues.
 */
public class VenueType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VenueType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_ADR;
    private static java.lang.String _TC_County;
    private static java.lang.String _TC_Fed;
    private static java.lang.String _TC_Muni;
    private static java.lang.String _TC_State;
    private static java.lang.String _TC_StateSup;
    private static java.lang.String _TC_Supreme;
    private static java.lang.String _TC_WcAppeals;

/**
 * Alternative dispute resolution
 */
    public static VenueType TC_ADR;

/**
 * County
 */
    public static VenueType TC_County;

/**
 * Federal
 */
    public static VenueType TC_Fed;

/**
 * Municipal
 */
    public static VenueType TC_Muni;

/**
 * State
 */
    public static VenueType TC_State;

/**
 * State Supreme Court
 */
    public static VenueType TC_StateSup;

/**
 * Supreme Court
 */
    public static VenueType TC_Supreme;

/**
 * Workers' Comp Appeals Board
 */
    public static VenueType TC_WcAppeals;

    private static void initValues0() {
      _TC_ADR = "TC_ADR";
      TC_ADR = new VenueType(_TC_ADR);
      _TC_County = "TC_County";
      TC_County = new VenueType(_TC_County);
      _TC_Fed = "TC_Fed";
      TC_Fed = new VenueType(_TC_Fed);
      _TC_Muni = "TC_Muni";
      TC_Muni = new VenueType(_TC_Muni);
      _TC_State = "TC_State";
      TC_State = new VenueType(_TC_State);
      _TC_StateSup = "TC_StateSup";
      TC_StateSup = new VenueType(_TC_StateSup);
      _TC_Supreme = "TC_Supreme";
      TC_Supreme = new VenueType(_TC_Supreme);
      _TC_WcAppeals = "TC_WcAppeals";
      TC_WcAppeals = new VenueType(_TC_WcAppeals);
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
    public static VenueType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VenueType enumeration = (VenueType) internalFromCode(value);
        if (enumeration == null) enumeration = (VenueType) internalFromCode("TC_" + value);
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
    public static VenueType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static VenueType internalFromCode(java.lang.String value){
        VenueType enumeration = (VenueType)
            _table_.get(value);
        return enumeration;
    }
    public static VenueType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VenueType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VenueType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
