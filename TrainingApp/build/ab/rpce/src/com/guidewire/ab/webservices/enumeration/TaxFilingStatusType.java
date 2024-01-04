/**
 * TaxFilingStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * type of employee
 */
public class TaxFilingStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TaxFilingStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_single;
    private static java.lang.String _TC_married$45$joint;
    private static java.lang.String _TC_married$45$separate;
    private static java.lang.String _TC_headofhousehold;
    private static java.lang.String _TC_widow;

/**
 * Single
 */
    public static TaxFilingStatusType TC_single;

/**
 * Married filing jointly
 */
    public static TaxFilingStatusType TC_married$45$joint;

/**
 * Married filing separately
 */
    public static TaxFilingStatusType TC_married$45$separate;

/**
 * Head of household
 */
    public static TaxFilingStatusType TC_headofhousehold;

/**
 * Qualifying widow(er) with dependent child
 */
    public static TaxFilingStatusType TC_widow;

    private static void initValues0() {
      _TC_single = "TC_single";
      TC_single = new TaxFilingStatusType(_TC_single);
      _TC_married$45$joint = "TC_married$45$joint";
      TC_married$45$joint = new TaxFilingStatusType(_TC_married$45$joint);
      _TC_married$45$separate = "TC_married$45$separate";
      TC_married$45$separate = new TaxFilingStatusType(_TC_married$45$separate);
      _TC_headofhousehold = "TC_headofhousehold";
      TC_headofhousehold = new TaxFilingStatusType(_TC_headofhousehold);
      _TC_widow = "TC_widow";
      TC_widow = new TaxFilingStatusType(_TC_widow);
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
    public static TaxFilingStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TaxFilingStatusType enumeration = (TaxFilingStatusType) internalFromCode(value);
        if (enumeration == null) enumeration = (TaxFilingStatusType) internalFromCode("TC_" + value);
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
    public static TaxFilingStatusType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static TaxFilingStatusType internalFromCode(java.lang.String value){
        TaxFilingStatusType enumeration = (TaxFilingStatusType)
            _table_.get(value);
        return enumeration;
    }
    public static TaxFilingStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TaxFilingStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "TaxFilingStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
