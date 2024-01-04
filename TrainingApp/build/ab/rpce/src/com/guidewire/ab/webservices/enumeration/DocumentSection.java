/**
 * DocumentSection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;

public class DocumentSection implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DocumentSection(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_bills;
    private static java.lang.String _TC_correspondence;
    private static java.lang.String _TC_indemnity;
    private static java.lang.String _TC_legal;
    private static java.lang.String _TC_medical;
    private static java.lang.String _TC_misc;
    private static java.lang.String _TC_rehab;

/**
 * Bills
 */
    public static DocumentSection TC_bills;

/**
 * Correspondence
 */
    public static DocumentSection TC_correspondence;

/**
 * Indemnity
 */
    public static DocumentSection TC_indemnity;

/**
 * Legal
 */
    public static DocumentSection TC_legal;

/**
 * Medical
 */
    public static DocumentSection TC_medical;

/**
 * Misc
 */
    public static DocumentSection TC_misc;

/**
 * Rehab
 */
    public static DocumentSection TC_rehab;

    private static void initValues0() {
      _TC_bills = "TC_bills";
      TC_bills = new DocumentSection(_TC_bills);
      _TC_correspondence = "TC_correspondence";
      TC_correspondence = new DocumentSection(_TC_correspondence);
      _TC_indemnity = "TC_indemnity";
      TC_indemnity = new DocumentSection(_TC_indemnity);
      _TC_legal = "TC_legal";
      TC_legal = new DocumentSection(_TC_legal);
      _TC_medical = "TC_medical";
      TC_medical = new DocumentSection(_TC_medical);
      _TC_misc = "TC_misc";
      TC_misc = new DocumentSection(_TC_misc);
      _TC_rehab = "TC_rehab";
      TC_rehab = new DocumentSection(_TC_rehab);
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
    public static DocumentSection fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DocumentSection enumeration = (DocumentSection) internalFromCode(value);
        if (enumeration == null) enumeration = (DocumentSection) internalFromCode("TC_" + value);
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
    public static DocumentSection fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static DocumentSection internalFromCode(java.lang.String value){
        DocumentSection enumeration = (DocumentSection)
            _table_.get(value);
        return enumeration;
    }
    public static DocumentSection fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DocumentSection.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentSection"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
