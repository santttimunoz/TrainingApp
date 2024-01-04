/**
 * ContactTier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * ContactTier
 */
public class ContactTier implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ContactTier(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_platinum;
    private static java.lang.String _TC_gold;
    private static java.lang.String _TC_silver;
    private static java.lang.String _TC_unknown;

/**
 * Platinum
 */
    public static ContactTier TC_platinum;

/**
 * Gold
 */
    public static ContactTier TC_gold;

/**
 * Silver
 */
    public static ContactTier TC_silver;

/**
 * Unknown
 */
    public static ContactTier TC_unknown;

    private static void initValues0() {
      _TC_platinum = "TC_platinum";
      TC_platinum = new ContactTier(_TC_platinum);
      _TC_gold = "TC_gold";
      TC_gold = new ContactTier(_TC_gold);
      _TC_silver = "TC_silver";
      TC_silver = new ContactTier(_TC_silver);
      _TC_unknown = "TC_unknown";
      TC_unknown = new ContactTier(_TC_unknown);
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
    public static ContactTier fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ContactTier enumeration = (ContactTier) internalFromCode(value);
        if (enumeration == null) enumeration = (ContactTier) internalFromCode("TC_" + value);
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
    public static ContactTier fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static ContactTier internalFromCode(java.lang.String value){
        ContactTier enumeration = (ContactTier)
            _table_.get(value);
        return enumeration;
    }
    public static ContactTier fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ContactTier.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactTier"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
