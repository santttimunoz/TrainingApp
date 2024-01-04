/**
 * NameSuffix.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;

public class NameSuffix implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NameSuffix(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_jr;
    private static java.lang.String _TC_sr;
    private static java.lang.String _TC_c_Ir;
    private static java.lang.String _TC_c_II;
    private static java.lang.String _TC_c_III;
    private static java.lang.String _TC_c_IV;
    private static java.lang.String _TC_c_md;
    private static java.lang.String _TC_c_phd;
    private static java.lang.String _TC_c_do;
    private static java.lang.String _TC_esq;

/**
 * Jr.
 */
    public static NameSuffix TC_jr;

/**
 * Sr.
 */
    public static NameSuffix TC_sr;

/**
 * I
 */
    public static NameSuffix TC_c_Ir;

/**
 * II
 */
    public static NameSuffix TC_c_II;

/**
 * III
 */
    public static NameSuffix TC_c_III;

/**
 * IV
 */
    public static NameSuffix TC_c_IV;

/**
 * M.D.
 */
    public static NameSuffix TC_c_md;

/**
 * PhD.
 */
    public static NameSuffix TC_c_phd;

/**
 * D.O.
 */
    public static NameSuffix TC_c_do;

/**
 * Esquire
 */
    public static NameSuffix TC_esq;

    private static void initValues0() {
      _TC_jr = "TC_jr";
      TC_jr = new NameSuffix(_TC_jr);
      _TC_sr = "TC_sr";
      TC_sr = new NameSuffix(_TC_sr);
      _TC_c_Ir = "TC_c_Ir";
      TC_c_Ir = new NameSuffix(_TC_c_Ir);
      _TC_c_II = "TC_c_II";
      TC_c_II = new NameSuffix(_TC_c_II);
      _TC_c_III = "TC_c_III";
      TC_c_III = new NameSuffix(_TC_c_III);
      _TC_c_IV = "TC_c_IV";
      TC_c_IV = new NameSuffix(_TC_c_IV);
      _TC_c_md = "TC_c_md";
      TC_c_md = new NameSuffix(_TC_c_md);
      _TC_c_phd = "TC_c_phd";
      TC_c_phd = new NameSuffix(_TC_c_phd);
      _TC_c_do = "TC_c_do";
      TC_c_do = new NameSuffix(_TC_c_do);
      _TC_esq = "TC_esq";
      TC_esq = new NameSuffix(_TC_esq);
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
    public static NameSuffix fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NameSuffix enumeration = (NameSuffix) internalFromCode(value);
        if (enumeration == null) enumeration = (NameSuffix) internalFromCode("TC_" + value);
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
    public static NameSuffix fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static NameSuffix internalFromCode(java.lang.String value){
        NameSuffix enumeration = (NameSuffix)
            _table_.get(value);
        return enumeration;
    }
    public static NameSuffix fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NameSuffix.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NameSuffix"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
