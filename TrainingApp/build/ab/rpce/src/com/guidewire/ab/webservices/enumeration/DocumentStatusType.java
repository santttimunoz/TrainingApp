/**
 * DocumentStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;

public class DocumentStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DocumentStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_approved;
    private static java.lang.String _TC_approving;
    private static java.lang.String _TC_draft;
    private static java.lang.String _TC_final;
    private static java.lang.String _TC_filed;

/**
 * Approved
 */
    public static DocumentStatusType TC_approved;

/**
 * Approving
 */
    public static DocumentStatusType TC_approving;

/**
 * Draft
 */
    public static DocumentStatusType TC_draft;

/**
 * Final
 */
    public static DocumentStatusType TC_final;

/**
 * Filed
 */
    public static DocumentStatusType TC_filed;

    private static void initValues0() {
      _TC_approved = "TC_approved";
      TC_approved = new DocumentStatusType(_TC_approved);
      _TC_approving = "TC_approving";
      TC_approving = new DocumentStatusType(_TC_approving);
      _TC_draft = "TC_draft";
      TC_draft = new DocumentStatusType(_TC_draft);
      _TC_final = "TC_final";
      TC_final = new DocumentStatusType(_TC_final);
      _TC_filed = "TC_filed";
      TC_filed = new DocumentStatusType(_TC_filed);
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
    public static DocumentStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DocumentStatusType enumeration = (DocumentStatusType) internalFromCode(value);
        if (enumeration == null) enumeration = (DocumentStatusType) internalFromCode("TC_" + value);
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
    public static DocumentStatusType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static DocumentStatusType internalFromCode(java.lang.String value){
        DocumentStatusType enumeration = (DocumentStatusType)
            _table_.get(value);
        return enumeration;
    }
    public static DocumentStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DocumentStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
