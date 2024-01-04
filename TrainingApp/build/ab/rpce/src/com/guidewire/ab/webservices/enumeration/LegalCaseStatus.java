/**
 * LegalCaseStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * LegalCaseStatus
 */
public class LegalCaseStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LegalCaseStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_in_progress;
    private static java.lang.String _TC_case_dismissed;
    private static java.lang.String _TC_case_dropped;
    private static java.lang.String _TC_guilty;
    private static java.lang.String _TC_mistrial;
    private static java.lang.String _TC_not_guilty;
    private static java.lang.String _TC_settled;

/**
 * In Progress
 */
    public static LegalCaseStatus TC_in_progress;

/**
 * Case Dismissed (court rejected it)
 */
    public static LegalCaseStatus TC_case_dismissed;

/**
 * Case Dropped (plaintiff withdrew)
 */
    public static LegalCaseStatus TC_case_dropped;

/**
 * Guilty
 */
    public static LegalCaseStatus TC_guilty;

/**
 * Mistrial
 */
    public static LegalCaseStatus TC_mistrial;

/**
 * Not Guilty
 */
    public static LegalCaseStatus TC_not_guilty;

/**
 * Settled Out of Court
 */
    public static LegalCaseStatus TC_settled;

    private static void initValues0() {
      _TC_in_progress = "TC_in_progress";
      TC_in_progress = new LegalCaseStatus(_TC_in_progress);
      _TC_case_dismissed = "TC_case_dismissed";
      TC_case_dismissed = new LegalCaseStatus(_TC_case_dismissed);
      _TC_case_dropped = "TC_case_dropped";
      TC_case_dropped = new LegalCaseStatus(_TC_case_dropped);
      _TC_guilty = "TC_guilty";
      TC_guilty = new LegalCaseStatus(_TC_guilty);
      _TC_mistrial = "TC_mistrial";
      TC_mistrial = new LegalCaseStatus(_TC_mistrial);
      _TC_not_guilty = "TC_not_guilty";
      TC_not_guilty = new LegalCaseStatus(_TC_not_guilty);
      _TC_settled = "TC_settled";
      TC_settled = new LegalCaseStatus(_TC_settled);
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
    public static LegalCaseStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LegalCaseStatus enumeration = (LegalCaseStatus) internalFromCode(value);
        if (enumeration == null) enumeration = (LegalCaseStatus) internalFromCode("TC_" + value);
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
    public static LegalCaseStatus fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static LegalCaseStatus internalFromCode(java.lang.String value){
        LegalCaseStatus enumeration = (LegalCaseStatus)
            _table_.get(value);
        return enumeration;
    }
    public static LegalCaseStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LegalCaseStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LegalCaseStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
