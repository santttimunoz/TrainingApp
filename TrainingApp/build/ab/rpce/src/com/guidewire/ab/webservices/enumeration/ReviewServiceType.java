/**
 * ReviewServiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Service types list for Service Provider Management Reviews; generally,
 * this will be extended by customers
 */
public class ReviewServiceType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReviewServiceType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_body;
    private static java.lang.String _TC_brakes;
    private static java.lang.String _TC_other;
    private static java.lang.String _TC_paint;
    private static java.lang.String _TC_suspension;
    private static java.lang.String _TC_drivetrain;

/**
 * Body
 */
    public static ReviewServiceType TC_body;

/**
 * Brakes
 */
    public static ReviewServiceType TC_brakes;

/**
 * Indicates that no more specific service type is applicable.
 */
    public static ReviewServiceType TC_other;

/**
 * Paint
 */
    public static ReviewServiceType TC_paint;

/**
 * Suspension
 */
    public static ReviewServiceType TC_suspension;

/**
 * Transmission and Engine
 */
    public static ReviewServiceType TC_drivetrain;

    private static void initValues0() {
      _TC_body = "TC_body";
      TC_body = new ReviewServiceType(_TC_body);
      _TC_brakes = "TC_brakes";
      TC_brakes = new ReviewServiceType(_TC_brakes);
      _TC_other = "TC_other";
      TC_other = new ReviewServiceType(_TC_other);
      _TC_paint = "TC_paint";
      TC_paint = new ReviewServiceType(_TC_paint);
      _TC_suspension = "TC_suspension";
      TC_suspension = new ReviewServiceType(_TC_suspension);
      _TC_drivetrain = "TC_drivetrain";
      TC_drivetrain = new ReviewServiceType(_TC_drivetrain);
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
    public static ReviewServiceType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReviewServiceType enumeration = (ReviewServiceType) internalFromCode(value);
        if (enumeration == null) enumeration = (ReviewServiceType) internalFromCode("TC_" + value);
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
    public static ReviewServiceType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static ReviewServiceType internalFromCode(java.lang.String value){
        ReviewServiceType enumeration = (ReviewServiceType)
            _table_.get(value);
        return enumeration;
    }
    public static ReviewServiceType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReviewServiceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ReviewServiceType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
