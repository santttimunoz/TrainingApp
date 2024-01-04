/**
 * NamePrefix.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;

public class NamePrefix implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NamePrefix(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_mr;
    private static java.lang.String _TC_mrs;
    private static java.lang.String _TC_ms;
    private static java.lang.String _TC_dr;

/**
 * Mr.
 */
    public static NamePrefix TC_mr;

/**
 * Mrs.
 */
    public static NamePrefix TC_mrs;

/**
 * Ms.
 */
    public static NamePrefix TC_ms;

/**
 * Dr.
 */
    public static NamePrefix TC_dr;

    private static void initValues0() {
      _TC_mr = "TC_mr";
      TC_mr = new NamePrefix(_TC_mr);
      _TC_mrs = "TC_mrs";
      TC_mrs = new NamePrefix(_TC_mrs);
      _TC_ms = "TC_ms";
      TC_ms = new NamePrefix(_TC_ms);
      _TC_dr = "TC_dr";
      TC_dr = new NamePrefix(_TC_dr);
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
    public static NamePrefix fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NamePrefix enumeration = (NamePrefix) internalFromCode(value);
        if (enumeration == null) enumeration = (NamePrefix) internalFromCode("TC_" + value);
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
    public static NamePrefix fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static NamePrefix internalFromCode(java.lang.String value){
        NamePrefix enumeration = (NamePrefix)
            _table_.get(value);
        return enumeration;
    }
    public static NamePrefix fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NamePrefix.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NamePrefix"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
