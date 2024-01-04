/**
 * DocumentSecurityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Type of the document for access-restriction purposes
 */
public class DocumentSecurityType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DocumentSecurityType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_internalonly;
    private static java.lang.String _TC_sensitive;
    private static java.lang.String _TC_unrestricted;

/**
 * Document which should not be viewed by people outside the company
 */
    public static DocumentSecurityType TC_internalonly;

/**
 * Document which is sensitive in nature
 */
    public static DocumentSecurityType TC_sensitive;

/**
 * Document which does not require access restriction
 */
    public static DocumentSecurityType TC_unrestricted;

    private static void initValues0() {
      _TC_internalonly = "TC_internalonly";
      TC_internalonly = new DocumentSecurityType(_TC_internalonly);
      _TC_sensitive = "TC_sensitive";
      TC_sensitive = new DocumentSecurityType(_TC_sensitive);
      _TC_unrestricted = "TC_unrestricted";
      TC_unrestricted = new DocumentSecurityType(_TC_unrestricted);
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
    public static DocumentSecurityType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DocumentSecurityType enumeration = (DocumentSecurityType) internalFromCode(value);
        if (enumeration == null) enumeration = (DocumentSecurityType) internalFromCode("TC_" + value);
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
    public static DocumentSecurityType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static DocumentSecurityType internalFromCode(java.lang.String value){
        DocumentSecurityType enumeration = (DocumentSecurityType)
            _table_.get(value);
        return enumeration;
    }
    public static DocumentSecurityType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DocumentSecurityType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DocumentSecurityType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
