/**
 * ErrorCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * The type of error for messages that are in error
 */
public class ErrorCategory implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ErrorCategory(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_no_connection;
    private static java.lang.String _TC_database_contention;
    private static java.lang.String _TC_user_authentication;
    private static java.lang.String _TC_unexpected_error;
    private static java.lang.String _TC_permanent_error;
    private static java.lang.String _TC_payload_format;

/**
 * Cannot connect to external system
 */
    public static ErrorCategory TC_no_connection;

/**
 * Contention with external system database
 */
    public static ErrorCategory TC_database_contention;

/**
 * User account doesn't get authenticated
 */
    public static ErrorCategory TC_user_authentication;

/**
 * There was an unexpected error.
 */
    public static ErrorCategory TC_unexpected_error;

/**
 * There is a permanent error related to sending and/or processing
 * this message.
 */
    public static ErrorCategory TC_permanent_error;

/**
 * Issue with the format of the message payload reported by external
 * system
 */
    public static ErrorCategory TC_payload_format;

    private static void initValues0() {
      _TC_no_connection = "TC_no_connection";
      TC_no_connection = new ErrorCategory(_TC_no_connection);
      _TC_database_contention = "TC_database_contention";
      TC_database_contention = new ErrorCategory(_TC_database_contention);
      _TC_user_authentication = "TC_user_authentication";
      TC_user_authentication = new ErrorCategory(_TC_user_authentication);
      _TC_unexpected_error = "TC_unexpected_error";
      TC_unexpected_error = new ErrorCategory(_TC_unexpected_error);
      _TC_permanent_error = "TC_permanent_error";
      TC_permanent_error = new ErrorCategory(_TC_permanent_error);
      _TC_payload_format = "TC_payload_format";
      TC_payload_format = new ErrorCategory(_TC_payload_format);
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
    public static ErrorCategory fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ErrorCategory enumeration = (ErrorCategory) internalFromCode(value);
        if (enumeration == null) enumeration = (ErrorCategory) internalFromCode("TC_" + value);
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
    public static ErrorCategory fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static ErrorCategory internalFromCode(java.lang.String value){
        ErrorCategory enumeration = (ErrorCategory)
            _table_.get(value);
        return enumeration;
    }
    public static ErrorCategory fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ErrorCategory.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ErrorCategory"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
