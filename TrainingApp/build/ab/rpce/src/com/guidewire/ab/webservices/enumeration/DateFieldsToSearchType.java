/**
 * DateFieldsToSearchType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * The search options for the date searches in search
 */
public class DateFieldsToSearchType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DateFieldsToSearchType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_EffectiveDate;
    private static java.lang.String _TC_ExpirationDate;
    private static java.lang.String _TC_SubmissionDate;

/**
 * Find by Effective Date
 */
    public static DateFieldsToSearchType TC_EffectiveDate;

/**
 * Find by Expiration Date
 */
    public static DateFieldsToSearchType TC_ExpirationDate;

/**
 * Find by Submission Date
 */
    public static DateFieldsToSearchType TC_SubmissionDate;

    private static void initValues0() {
      _TC_EffectiveDate = "TC_EffectiveDate";
      TC_EffectiveDate = new DateFieldsToSearchType(_TC_EffectiveDate);
      _TC_ExpirationDate = "TC_ExpirationDate";
      TC_ExpirationDate = new DateFieldsToSearchType(_TC_ExpirationDate);
      _TC_SubmissionDate = "TC_SubmissionDate";
      TC_SubmissionDate = new DateFieldsToSearchType(_TC_SubmissionDate);
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
    public static DateFieldsToSearchType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DateFieldsToSearchType enumeration = (DateFieldsToSearchType) internalFromCode(value);
        if (enumeration == null) enumeration = (DateFieldsToSearchType) internalFromCode("TC_" + value);
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
    public static DateFieldsToSearchType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static DateFieldsToSearchType internalFromCode(java.lang.String value){
        DateFieldsToSearchType enumeration = (DateFieldsToSearchType)
            _table_.get(value);
        return enumeration;
    }
    public static DateFieldsToSearchType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DateFieldsToSearchType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DateFieldsToSearchType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
