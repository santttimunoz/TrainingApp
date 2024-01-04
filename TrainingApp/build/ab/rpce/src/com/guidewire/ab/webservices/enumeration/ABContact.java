/**
 * ABContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Subtype typelist for entity ABContact
 */
public class ABContact implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ABContact(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_ABAdjudicator;
    private static java.lang.String _TC_ABAttorney;
    private static java.lang.String _TC_ABAutoRepairShop;
    private static java.lang.String _TC_ABAutoScrapYard_Ext;
    private static java.lang.String _TC_ABAutoTowingAgcy;
    private static java.lang.String _TC_ABCompany;
    private static java.lang.String _TC_ABContact;
    private static java.lang.String _TC_ABDoctor;
    private static java.lang.String _TC_ABLawFirm;
    private static java.lang.String _TC_ABLegalVenue;
    private static java.lang.String _TC_ABMedicalCareOrg;
    private static java.lang.String _TC_ABPerson;
    private static java.lang.String _TC_ABPlace;
    private static java.lang.String _TC_ABPolicyCompany;
    private static java.lang.String _TC_ABPolicyPerson;
    private static java.lang.String _TC_ABUserContact;
    private static java.lang.String _TC_ABCompanyVendor;
    private static java.lang.String _TC_ABPersonVendor;

/**
 * Adjudicator
 */
    public static ABContact TC_ABAdjudicator;

/**
 * Attorney
 */
    public static ABContact TC_ABAttorney;

/**
 * Auto Repair Shop
 */
    public static ABContact TC_ABAutoRepairShop;

/**
 * Auto Scrap Yard
 */
    public static ABContact TC_ABAutoScrapYard_Ext;

/**
 * Auto Towing Agency
 */
    public static ABContact TC_ABAutoTowingAgcy;

/**
 * Company
 */
    public static ABContact TC_ABCompany;

/**
 * Contact
 */
    public static ABContact TC_ABContact;

/**
 * Doctor
 */
    public static ABContact TC_ABDoctor;

/**
 * Law Firm
 */
    public static ABContact TC_ABLawFirm;

/**
 * Legal Venue
 */
    public static ABContact TC_ABLegalVenue;

/**
 * Medical Care Organization
 */
    public static ABContact TC_ABMedicalCareOrg;

/**
 * Person
 */
    public static ABContact TC_ABPerson;

/**
 * Place
 */
    public static ABContact TC_ABPlace;

/**
 * Policy Company
 */
    public static ABContact TC_ABPolicyCompany;

/**
 * Policy Person
 */
    public static ABContact TC_ABPolicyPerson;

/**
 * User Contact
 */
    public static ABContact TC_ABUserContact;

/**
 * Vendor (Company)
 */
    public static ABContact TC_ABCompanyVendor;

/**
 * Vendor (Person)
 */
    public static ABContact TC_ABPersonVendor;

    private static void initValues0() {
      _TC_ABAdjudicator = "TC_ABAdjudicator";
      TC_ABAdjudicator = new ABContact(_TC_ABAdjudicator);
      _TC_ABAttorney = "TC_ABAttorney";
      TC_ABAttorney = new ABContact(_TC_ABAttorney);
      _TC_ABAutoRepairShop = "TC_ABAutoRepairShop";
      TC_ABAutoRepairShop = new ABContact(_TC_ABAutoRepairShop);
      _TC_ABAutoScrapYard_Ext = "TC_ABAutoScrapYard_Ext";
      TC_ABAutoScrapYard_Ext = new ABContact(_TC_ABAutoScrapYard_Ext);
      _TC_ABAutoTowingAgcy = "TC_ABAutoTowingAgcy";
      TC_ABAutoTowingAgcy = new ABContact(_TC_ABAutoTowingAgcy);
      _TC_ABCompany = "TC_ABCompany";
      TC_ABCompany = new ABContact(_TC_ABCompany);
      _TC_ABContact = "TC_ABContact";
      TC_ABContact = new ABContact(_TC_ABContact);
      _TC_ABDoctor = "TC_ABDoctor";
      TC_ABDoctor = new ABContact(_TC_ABDoctor);
      _TC_ABLawFirm = "TC_ABLawFirm";
      TC_ABLawFirm = new ABContact(_TC_ABLawFirm);
      _TC_ABLegalVenue = "TC_ABLegalVenue";
      TC_ABLegalVenue = new ABContact(_TC_ABLegalVenue);
      _TC_ABMedicalCareOrg = "TC_ABMedicalCareOrg";
      TC_ABMedicalCareOrg = new ABContact(_TC_ABMedicalCareOrg);
      _TC_ABPerson = "TC_ABPerson";
      TC_ABPerson = new ABContact(_TC_ABPerson);
      _TC_ABPlace = "TC_ABPlace";
      TC_ABPlace = new ABContact(_TC_ABPlace);
      _TC_ABPolicyCompany = "TC_ABPolicyCompany";
      TC_ABPolicyCompany = new ABContact(_TC_ABPolicyCompany);
      _TC_ABPolicyPerson = "TC_ABPolicyPerson";
      TC_ABPolicyPerson = new ABContact(_TC_ABPolicyPerson);
      _TC_ABUserContact = "TC_ABUserContact";
      TC_ABUserContact = new ABContact(_TC_ABUserContact);
      _TC_ABCompanyVendor = "TC_ABCompanyVendor";
      TC_ABCompanyVendor = new ABContact(_TC_ABCompanyVendor);
      _TC_ABPersonVendor = "TC_ABPersonVendor";
      TC_ABPersonVendor = new ABContact(_TC_ABPersonVendor);
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
    public static ABContact fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ABContact enumeration = (ABContact) internalFromCode(value);
        if (enumeration == null) enumeration = (ABContact) internalFromCode("TC_" + value);
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
    public static ABContact fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static ABContact internalFromCode(java.lang.String value){
        ABContact enumeration = (ABContact)
            _table_.get(value);
        return enumeration;
    }
    public static ABContact fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ABContact.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ABContact"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
