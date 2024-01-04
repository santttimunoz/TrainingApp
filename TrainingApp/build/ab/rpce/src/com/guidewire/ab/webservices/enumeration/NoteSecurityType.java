/**
 * NoteSecurityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Type of the note for access-restriction purposes
 */
public class NoteSecurityType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NoteSecurityType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_private;
    private static java.lang.String _TC_public;
    private static java.lang.String _TC_sensitive;

/**
 * Note viewable by internal users only
 */
    public static NoteSecurityType TC_private;

/**
 * Note viewable by any user in the system
 */
    public static NoteSecurityType TC_public;

/**
 * Confidential note, viewable by select internal users only
 */
    public static NoteSecurityType TC_sensitive;

    private static void initValues0() {
      _TC_private = "TC_private";
      TC_private = new NoteSecurityType(_TC_private);
      _TC_public = "TC_public";
      TC_public = new NoteSecurityType(_TC_public);
      _TC_sensitive = "TC_sensitive";
      TC_sensitive = new NoteSecurityType(_TC_sensitive);
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
    public static NoteSecurityType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NoteSecurityType enumeration = (NoteSecurityType) internalFromCode(value);
        if (enumeration == null) enumeration = (NoteSecurityType) internalFromCode("TC_" + value);
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
    public static NoteSecurityType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static NoteSecurityType internalFromCode(java.lang.String value){
        NoteSecurityType enumeration = (NoteSecurityType)
            _table_.get(value);
        return enumeration;
    }
    public static NoteSecurityType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NoteSecurityType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NoteSecurityType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
