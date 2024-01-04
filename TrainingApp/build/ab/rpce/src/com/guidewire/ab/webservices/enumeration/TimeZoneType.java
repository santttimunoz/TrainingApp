/**
 * TimeZoneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Users' timezones
 */
public class TimeZoneType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TimeZoneType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_US$46$Alaska;
    private static java.lang.String _TC_US$46$Central;
    private static java.lang.String _TC_US$46$East$45$Indiana;
    private static java.lang.String _TC_US$46$Eastern;
    private static java.lang.String _TC_US$46$Hawaii;
    private static java.lang.String _TC_US$46$Aleutian;
    private static java.lang.String _TC_US$46$Arizona;
    private static java.lang.String _TC_US$46$Mountain;
    private static java.lang.String _TC_US$46$Pacific;

/**
 * GMT -09:00
 */
    public static TimeZoneType TC_US$46$Alaska;

/**
 * GMT -06:00
 */
    public static TimeZoneType TC_US$46$Central;

/**
 * GMT -05:00
 */
    public static TimeZoneType TC_US$46$East$45$Indiana;

/**
 * GMT -05:00
 */
    public static TimeZoneType TC_US$46$Eastern;

/**
 * GMT -10:00
 */
    public static TimeZoneType TC_US$46$Hawaii;

/**
 * GMT -10:00
 */
    public static TimeZoneType TC_US$46$Aleutian;

/**
 * GMT -07:00
 */
    public static TimeZoneType TC_US$46$Arizona;

/**
 * GMT -07:00
 */
    public static TimeZoneType TC_US$46$Mountain;

/**
 * GMT -08:00
 */
    public static TimeZoneType TC_US$46$Pacific;

    private static void initValues0() {
      _TC_US$46$Alaska = "TC_US$46$Alaska";
      TC_US$46$Alaska = new TimeZoneType(_TC_US$46$Alaska);
      _TC_US$46$Central = "TC_US$46$Central";
      TC_US$46$Central = new TimeZoneType(_TC_US$46$Central);
      _TC_US$46$East$45$Indiana = "TC_US$46$East$45$Indiana";
      TC_US$46$East$45$Indiana = new TimeZoneType(_TC_US$46$East$45$Indiana);
      _TC_US$46$Eastern = "TC_US$46$Eastern";
      TC_US$46$Eastern = new TimeZoneType(_TC_US$46$Eastern);
      _TC_US$46$Hawaii = "TC_US$46$Hawaii";
      TC_US$46$Hawaii = new TimeZoneType(_TC_US$46$Hawaii);
      _TC_US$46$Aleutian = "TC_US$46$Aleutian";
      TC_US$46$Aleutian = new TimeZoneType(_TC_US$46$Aleutian);
      _TC_US$46$Arizona = "TC_US$46$Arizona";
      TC_US$46$Arizona = new TimeZoneType(_TC_US$46$Arizona);
      _TC_US$46$Mountain = "TC_US$46$Mountain";
      TC_US$46$Mountain = new TimeZoneType(_TC_US$46$Mountain);
      _TC_US$46$Pacific = "TC_US$46$Pacific";
      TC_US$46$Pacific = new TimeZoneType(_TC_US$46$Pacific);
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
    public static TimeZoneType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TimeZoneType enumeration = (TimeZoneType) internalFromCode(value);
        if (enumeration == null) enumeration = (TimeZoneType) internalFromCode("TC_" + value);
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
    public static TimeZoneType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static TimeZoneType internalFromCode(java.lang.String value){
        TimeZoneType enumeration = (TimeZoneType)
            _table_.get(value);
        return enumeration;
    }
    public static TimeZoneType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TimeZoneType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "TimeZoneType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
