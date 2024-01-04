/**
 * MaritalStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * An individual's marital status
 */
public class MaritalStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MaritalStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_single;
    private static java.lang.String _TC_married;
    private static java.lang.String _TC_divorced;
    private static java.lang.String _TC_widowed;
    private static java.lang.String _TC_common;
    private static java.lang.String _TC_separated;
    private static java.lang.String _TC_unknown;

/**
 * Single
 */
    public static MaritalStatus TC_single;

/**
 * Married
 */
    public static MaritalStatus TC_married;

/**
 * Divorced
 */
    public static MaritalStatus TC_divorced;

/**
 * Spouse deceased
 */
    public static MaritalStatus TC_widowed;

/**
 * Common law spouse
 */
    public static MaritalStatus TC_common;

/**
 * Separated
 */
    public static MaritalStatus TC_separated;

/**
 * Unknown
 */
    public static MaritalStatus TC_unknown;

    private static void initValues0() {
      _TC_single = "TC_single";
      TC_single = new MaritalStatus(_TC_single);
      _TC_married = "TC_married";
      TC_married = new MaritalStatus(_TC_married);
      _TC_divorced = "TC_divorced";
      TC_divorced = new MaritalStatus(_TC_divorced);
      _TC_widowed = "TC_widowed";
      TC_widowed = new MaritalStatus(_TC_widowed);
      _TC_common = "TC_common";
      TC_common = new MaritalStatus(_TC_common);
      _TC_separated = "TC_separated";
      TC_separated = new MaritalStatus(_TC_separated);
      _TC_unknown = "TC_unknown";
      TC_unknown = new MaritalStatus(_TC_unknown);
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
    public static MaritalStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MaritalStatus enumeration = (MaritalStatus) internalFromCode(value);
        if (enumeration == null) enumeration = (MaritalStatus) internalFromCode("TC_" + value);
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
    public static MaritalStatus fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static MaritalStatus internalFromCode(java.lang.String value){
        MaritalStatus enumeration = (MaritalStatus)
            _table_.get(value);
        return enumeration;
    }
    public static MaritalStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MaritalStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "MaritalStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
