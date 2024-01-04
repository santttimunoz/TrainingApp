/**
 * FlagEntryReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * FlagEntryReason
 */
public class FlagEntryReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FlagEntryReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_doctor_specialty_unspecified;
    private static java.lang.String _TC_overdue_legal_report;
    private static java.lang.String _TC_no_email;
    private static java.lang.String _TC_vendor_fax;
    private static java.lang.String _TC_invalid_address;
    private static java.lang.String _TC_fraudulent_activity;

/**
 * Doctor Specialty Unspecified
 */
    public static FlagEntryReason TC_doctor_specialty_unspecified;

/**
 * Legal case report is overdue.
 */
    public static FlagEntryReason TC_overdue_legal_report;

/**
 * No email
 */
    public static FlagEntryReason TC_no_email;

/**
 * No vendor fax
 */
    public static FlagEntryReason TC_vendor_fax;

/**
 * Invalid address
 */
    public static FlagEntryReason TC_invalid_address;

/**
 * Report of insurance fraud
 */
    public static FlagEntryReason TC_fraudulent_activity;

    private static void initValues0() {
      _TC_doctor_specialty_unspecified = "TC_doctor_specialty_unspecified";
      TC_doctor_specialty_unspecified = new FlagEntryReason(_TC_doctor_specialty_unspecified);
      _TC_overdue_legal_report = "TC_overdue_legal_report";
      TC_overdue_legal_report = new FlagEntryReason(_TC_overdue_legal_report);
      _TC_no_email = "TC_no_email";
      TC_no_email = new FlagEntryReason(_TC_no_email);
      _TC_vendor_fax = "TC_vendor_fax";
      TC_vendor_fax = new FlagEntryReason(_TC_vendor_fax);
      _TC_invalid_address = "TC_invalid_address";
      TC_invalid_address = new FlagEntryReason(_TC_invalid_address);
      _TC_fraudulent_activity = "TC_fraudulent_activity";
      TC_fraudulent_activity = new FlagEntryReason(_TC_fraudulent_activity);
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
    public static FlagEntryReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FlagEntryReason enumeration = (FlagEntryReason) internalFromCode(value);
        if (enumeration == null) enumeration = (FlagEntryReason) internalFromCode("TC_" + value);
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
    public static FlagEntryReason fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static FlagEntryReason internalFromCode(java.lang.String value){
        FlagEntryReason enumeration = (FlagEntryReason)
            _table_.get(value);
        return enumeration;
    }
    public static FlagEntryReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FlagEntryReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "FlagEntryReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
