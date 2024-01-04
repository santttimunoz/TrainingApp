/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Subtype typelist for entity Contact
 */
public class Contact implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Contact(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_Company;
    private static java.lang.String _TC_Person;
    private static java.lang.String _TC_Place;
    private static java.lang.String _TC_Contact;
    private static java.lang.String _TC_LegalVenue;
    private static java.lang.String _TC_UserContact;
    private static java.lang.String _TC_CompanyVendor;
    private static java.lang.String _TC_PersonVendor;

/**
 * Company
 */
    public static Contact TC_Company;

/**
 * Person
 */
    public static Contact TC_Person;

/**
 * Place
 */
    public static Contact TC_Place;

/**
 * Contact
 */
    public static Contact TC_Contact;

/**
 * Legal Venue
 */
    public static Contact TC_LegalVenue;

/**
 * User Contact
 */
    public static Contact TC_UserContact;

/**
 * Vendor (Company)
 */
    public static Contact TC_CompanyVendor;

/**
 * Vendor (Person)
 */
    public static Contact TC_PersonVendor;

    private static void initValues0() {
      _TC_Company = "TC_Company";
      TC_Company = new Contact(_TC_Company);
      _TC_Person = "TC_Person";
      TC_Person = new Contact(_TC_Person);
      _TC_Place = "TC_Place";
      TC_Place = new Contact(_TC_Place);
      _TC_Contact = "TC_Contact";
      TC_Contact = new Contact(_TC_Contact);
      _TC_LegalVenue = "TC_LegalVenue";
      TC_LegalVenue = new Contact(_TC_LegalVenue);
      _TC_UserContact = "TC_UserContact";
      TC_UserContact = new Contact(_TC_UserContact);
      _TC_CompanyVendor = "TC_CompanyVendor";
      TC_CompanyVendor = new Contact(_TC_CompanyVendor);
      _TC_PersonVendor = "TC_PersonVendor";
      TC_PersonVendor = new Contact(_TC_PersonVendor);
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
    public static Contact fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Contact enumeration = (Contact) internalFromCode(value);
        if (enumeration == null) enumeration = (Contact) internalFromCode("TC_" + value);
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
    public static Contact fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static Contact internalFromCode(java.lang.String value){
        Contact enumeration = (Contact)
            _table_.get(value);
        return enumeration;
    }
    public static Contact fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Contact.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Contact"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
