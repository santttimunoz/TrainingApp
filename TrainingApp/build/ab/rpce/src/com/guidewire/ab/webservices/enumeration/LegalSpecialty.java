/**
 * LegalSpecialty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * specialty types for attornies
 */
public class LegalSpecialty implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LegalSpecialty(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_generalliability;
    private static java.lang.String _TC_motorvehliability;
    private static java.lang.String _TC_personalinjury;
    private static java.lang.String _TC_workerscomp;

/**
 * General Liability
 */
    public static LegalSpecialty TC_generalliability;

/**
 * Motor Vehicle Liability
 */
    public static LegalSpecialty TC_motorvehliability;

/**
 * Personal Injury
 */
    public static LegalSpecialty TC_personalinjury;

/**
 * Workers' Compensation
 */
    public static LegalSpecialty TC_workerscomp;

    private static void initValues0() {
      _TC_generalliability = "TC_generalliability";
      TC_generalliability = new LegalSpecialty(_TC_generalliability);
      _TC_motorvehliability = "TC_motorvehliability";
      TC_motorvehliability = new LegalSpecialty(_TC_motorvehliability);
      _TC_personalinjury = "TC_personalinjury";
      TC_personalinjury = new LegalSpecialty(_TC_personalinjury);
      _TC_workerscomp = "TC_workerscomp";
      TC_workerscomp = new LegalSpecialty(_TC_workerscomp);
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
    public static LegalSpecialty fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LegalSpecialty enumeration = (LegalSpecialty) internalFromCode(value);
        if (enumeration == null) enumeration = (LegalSpecialty) internalFromCode("TC_" + value);
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
    public static LegalSpecialty fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static LegalSpecialty internalFromCode(java.lang.String value){
        LegalSpecialty enumeration = (LegalSpecialty)
            _table_.get(value);
        return enumeration;
    }
    public static LegalSpecialty fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LegalSpecialty.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LegalSpecialty"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
