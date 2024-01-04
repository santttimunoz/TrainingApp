/**
 * LocaleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Users' preferred languages
 */
public class LocaleType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocaleType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_en_AU;
    private static java.lang.String _TC_en_CA;
    private static java.lang.String _TC_fr_CA;
    private static java.lang.String _TC_fr_FR;
    private static java.lang.String _TC_de_DE;
    private static java.lang.String _TC_en_GB;
    private static java.lang.String _TC_ja_JP;
    private static java.lang.String _TC_en_US;

/**
 * Australia (English)
 */
    public static LocaleType TC_en_AU;

/**
 * Canada (English)
 */
    public static LocaleType TC_en_CA;

/**
 * Canada (French)
 */
    public static LocaleType TC_fr_CA;

/**
 * France (French)
 */
    public static LocaleType TC_fr_FR;

/**
 * Germany (German)
 */
    public static LocaleType TC_de_DE;

/**
 * Great Britain (English)
 */
    public static LocaleType TC_en_GB;

/**
 * Japan (Japanese)
 */
    public static LocaleType TC_ja_JP;

/**
 * United States (English)
 */
    public static LocaleType TC_en_US;

    private static void initValues0() {
      _TC_en_AU = "TC_en_AU";
      TC_en_AU = new LocaleType(_TC_en_AU);
      _TC_en_CA = "TC_en_CA";
      TC_en_CA = new LocaleType(_TC_en_CA);
      _TC_fr_CA = "TC_fr_CA";
      TC_fr_CA = new LocaleType(_TC_fr_CA);
      _TC_fr_FR = "TC_fr_FR";
      TC_fr_FR = new LocaleType(_TC_fr_FR);
      _TC_de_DE = "TC_de_DE";
      TC_de_DE = new LocaleType(_TC_de_DE);
      _TC_en_GB = "TC_en_GB";
      TC_en_GB = new LocaleType(_TC_en_GB);
      _TC_ja_JP = "TC_ja_JP";
      TC_ja_JP = new LocaleType(_TC_ja_JP);
      _TC_en_US = "TC_en_US";
      TC_en_US = new LocaleType(_TC_en_US);
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
    public static LocaleType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocaleType enumeration = (LocaleType) internalFromCode(value);
        if (enumeration == null) enumeration = (LocaleType) internalFromCode("TC_" + value);
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
    public static LocaleType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static LocaleType internalFromCode(java.lang.String value){
        LocaleType enumeration = (LocaleType)
            _table_.get(value);
        return enumeration;
    }
    public static LocaleType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocaleType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LocaleType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
