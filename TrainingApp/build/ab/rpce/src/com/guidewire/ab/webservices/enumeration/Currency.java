/**
 * Currency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Types of Currencies.
 */
public class Currency implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Currency(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_usd;
    private static java.lang.String _TC_eur;
    private static java.lang.String _TC_gbp;
    private static java.lang.String _TC_cad;
    private static java.lang.String _TC_aud;
    private static java.lang.String _TC_rub;
    private static java.lang.String _TC_jpy;

/**
 * US Dollar
 */
    public static Currency TC_usd;

/**
 * Euro
 */
    public static Currency TC_eur;

/**
 * United Kingdom Pound
 */
    public static Currency TC_gbp;

/**
 * Canadian Dollar
 */
    public static Currency TC_cad;

/**
 * Australian Dollar
 */
    public static Currency TC_aud;

/**
 * Russian Ruble
 */
    public static Currency TC_rub;

/**
 * Japanese Yen
 */
    public static Currency TC_jpy;

    private static void initValues0() {
      _TC_usd = "TC_usd";
      TC_usd = new Currency(_TC_usd);
      _TC_eur = "TC_eur";
      TC_eur = new Currency(_TC_eur);
      _TC_gbp = "TC_gbp";
      TC_gbp = new Currency(_TC_gbp);
      _TC_cad = "TC_cad";
      TC_cad = new Currency(_TC_cad);
      _TC_aud = "TC_aud";
      TC_aud = new Currency(_TC_aud);
      _TC_rub = "TC_rub";
      TC_rub = new Currency(_TC_rub);
      _TC_jpy = "TC_jpy";
      TC_jpy = new Currency(_TC_jpy);
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
    public static Currency fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Currency enumeration = (Currency) internalFromCode(value);
        if (enumeration == null) enumeration = (Currency) internalFromCode("TC_" + value);
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
    public static Currency fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static Currency internalFromCode(java.lang.String value){
        Currency enumeration = (Currency)
            _table_.get(value);
        return enumeration;
    }
    public static Currency fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Currency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Currency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
