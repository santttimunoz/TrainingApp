/**
 * DocumentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;

public class DocumentType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DocumentType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_diagram;
    private static java.lang.String _TC_email;
    private static java.lang.String _TC_fnol;
    private static java.lang.String _TC_letter_received;
    private static java.lang.String _TC_letter_sent;
    private static java.lang.String _TC_policereport;
    private static java.lang.String _TC_repairestimate;
    private static java.lang.String _TC_statement;

/**
 * Diagram
 */
    public static DocumentType TC_diagram;

/**
 * Email
 */
    public static DocumentType TC_email;

/**
 * First notice of loss (original report)
 */
    public static DocumentType TC_fnol;

/**
 * Letter received
 */
    public static DocumentType TC_letter_received;

/**
 * Letter sent
 */
    public static DocumentType TC_letter_sent;

/**
 * Police report
 */
    public static DocumentType TC_policereport;

/**
 * Repair estimate
 */
    public static DocumentType TC_repairestimate;

/**
 * Statement
 */
    public static DocumentType TC_statement;

    private static void initValues0() {
      _TC_diagram = "TC_diagram";
      TC_diagram = new DocumentType(_TC_diagram);
      _TC_email = "TC_email";
      TC_email = new DocumentType(_TC_email);
      _TC_fnol = "TC_fnol";
      TC_fnol = new DocumentType(_TC_fnol);
      _TC_letter_received = "TC_letter_received";
      TC_letter_received = new DocumentType(_TC_letter_received);
      _TC_letter_sent = "TC_letter_sent";
      TC_letter_sent = new DocumentType(_TC_letter_sent);
      _TC_policereport = "TC_policereport";
      TC_policereport = new DocumentType(_TC_policereport);
      _TC_repairestimate = "TC_repairestimate";
      TC_repairestimate = new DocumentType(_TC_repairestimate);
      _TC_statement = "TC_statement";
      TC_statement = new DocumentType(_TC_statement);
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
    public static DocumentType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DocumentType enumeration = (DocumentType) internalFromCode(value);
        if (enumeration == null) enumeration = (DocumentType) internalFromCode("TC_" + value);
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
    public static DocumentType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static DocumentType internalFromCode(java.lang.String value){
        DocumentType enumeration = (DocumentType)
            _table_.get(value);
        return enumeration;
    }
    public static DocumentType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DocumentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
