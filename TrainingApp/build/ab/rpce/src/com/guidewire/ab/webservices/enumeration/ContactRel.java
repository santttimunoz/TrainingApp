/**
 * ContactRel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;

public class ContactRel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ContactRel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_collectionagency;
    private static java.lang.String _TC_employer;
    private static java.lang.String _TC_guardian;
    private static java.lang.String _TC_primarycontact;
    private static java.lang.String _TC_thirdpartyinsurer;

/**
 * Collection Agency
 */
    public static ContactRel TC_collectionagency;

/**
 * Employer
 */
    public static ContactRel TC_employer;

/**
 * Parent of a child or Guardian of a ward.
 */
    public static ContactRel TC_guardian;

/**
 * Primary contact
 */
    public static ContactRel TC_primarycontact;

/**
 * Third-Party Insurer
 */
    public static ContactRel TC_thirdpartyinsurer;

    private static void initValues0() {
      _TC_collectionagency = "TC_collectionagency";
      TC_collectionagency = new ContactRel(_TC_collectionagency);
      _TC_employer = "TC_employer";
      TC_employer = new ContactRel(_TC_employer);
      _TC_guardian = "TC_guardian";
      TC_guardian = new ContactRel(_TC_guardian);
      _TC_primarycontact = "TC_primarycontact";
      TC_primarycontact = new ContactRel(_TC_primarycontact);
      _TC_thirdpartyinsurer = "TC_thirdpartyinsurer";
      TC_thirdpartyinsurer = new ContactRel(_TC_thirdpartyinsurer);
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
    public static ContactRel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ContactRel enumeration = (ContactRel) internalFromCode(value);
        if (enumeration == null) enumeration = (ContactRel) internalFromCode("TC_" + value);
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
    public static ContactRel fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static ContactRel internalFromCode(java.lang.String value){
        ContactRel enumeration = (ContactRel)
            _table_.get(value);
        return enumeration;
    }
    public static ContactRel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ContactRel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactRel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
