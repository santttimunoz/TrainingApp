/**
 * ContactMatchResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Represents the result of definitive match search.
 */
public class ContactMatchResultType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ContactMatchResultType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_CLOSE_MATCH;
    private static java.lang.String _TC_IMPLAUSIBLE_MATCH;
    private static java.lang.String _TC_INCOMPATIBLE_TYPE;
    private static java.lang.String _TC_NO_MATCH;
    private static java.lang.String _TC_PLAUSIBLE_MATCH;
    private static java.lang.String _TC_POSSIBLE_MATCH;

/**
 * At least one contact in the Address Book closely matched a given
 * contact.
 */
    public static ContactMatchResultType TC_CLOSE_MATCH;

/**
 * A definitive match was found, but the contact does not match in
 * terms of potential match fields.
 */
    public static ContactMatchResultType TC_IMPLAUSIBLE_MATCH;

/**
 * A definitive match was found, but its type is incompatible with
 * the type of the candidate contact. That is, the matched contact could
 * not be cast to the type of the candidate contact.
 */
    public static ContactMatchResultType TC_INCOMPATIBLE_TYPE;

/**
 * No match was found.
 */
    public static ContactMatchResultType TC_NO_MATCH;

/**
 * A definitive match was found that matches a contact in the Address
 * Book in terms of potential match fields.
 */
    public static ContactMatchResultType TC_PLAUSIBLE_MATCH;

/**
 * One or more contacts in the Address Book possibly matched a given
 * contact.
 */
    public static ContactMatchResultType TC_POSSIBLE_MATCH;

    private static void initValues0() {
      _TC_CLOSE_MATCH = "TC_CLOSE_MATCH";
      TC_CLOSE_MATCH = new ContactMatchResultType(_TC_CLOSE_MATCH);
      _TC_IMPLAUSIBLE_MATCH = "TC_IMPLAUSIBLE_MATCH";
      TC_IMPLAUSIBLE_MATCH = new ContactMatchResultType(_TC_IMPLAUSIBLE_MATCH);
      _TC_INCOMPATIBLE_TYPE = "TC_INCOMPATIBLE_TYPE";
      TC_INCOMPATIBLE_TYPE = new ContactMatchResultType(_TC_INCOMPATIBLE_TYPE);
      _TC_NO_MATCH = "TC_NO_MATCH";
      TC_NO_MATCH = new ContactMatchResultType(_TC_NO_MATCH);
      _TC_PLAUSIBLE_MATCH = "TC_PLAUSIBLE_MATCH";
      TC_PLAUSIBLE_MATCH = new ContactMatchResultType(_TC_PLAUSIBLE_MATCH);
      _TC_POSSIBLE_MATCH = "TC_POSSIBLE_MATCH";
      TC_POSSIBLE_MATCH = new ContactMatchResultType(_TC_POSSIBLE_MATCH);
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
    public static ContactMatchResultType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ContactMatchResultType enumeration = (ContactMatchResultType) internalFromCode(value);
        if (enumeration == null) enumeration = (ContactMatchResultType) internalFromCode("TC_" + value);
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
    public static ContactMatchResultType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static ContactMatchResultType internalFromCode(java.lang.String value){
        ContactMatchResultType enumeration = (ContactMatchResultType)
            _table_.get(value);
        return enumeration;
    }
    public static ContactMatchResultType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ContactMatchResultType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactMatchResultType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
