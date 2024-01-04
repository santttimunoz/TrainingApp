/**
 * OfficialIDType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Type of official id (i.e. SSN, FEIN, State Tax, State Unemployment,
 * etc)
 */
public class OfficialIDType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OfficialIDType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_BureauID;
    private static java.lang.String _TC_NCCIID;
    private static java.lang.String _TC_DOLID;
    private static java.lang.String _TC_DUNS;
    private static java.lang.String _TC_FEIN;
    private static java.lang.String _TC_SSN;
    private static java.lang.String _TC_STAX;
    private static java.lang.String _TC_STUN;
    private static java.lang.String _TC_TUNS;

/**
 * Bureau ID
 */
    public static OfficialIDType TC_BureauID;

/**
 * Bureau ID
 */
    public static OfficialIDType TC_NCCIID;

/**
 * Dept of Labor ID
 */
    public static OfficialIDType TC_DOLID;

/**
 * Dun & Bradstreet Number
 */
    public static OfficialIDType TC_DUNS;

/**
 * Federal Employer Identification Number
 */
    public static OfficialIDType TC_FEIN;

/**
 * Social Security Number
 */
    public static OfficialIDType TC_SSN;

/**
 * State Tax Identification Number
 */
    public static OfficialIDType TC_STAX;

/**
 * State Unemployment Identification Number
 */
    public static OfficialIDType TC_STUN;

/**
 * Temporary Dun & Bradstreet Number
 */
    public static OfficialIDType TC_TUNS;

    private static void initValues0() {
      _TC_BureauID = "TC_BureauID";
      TC_BureauID = new OfficialIDType(_TC_BureauID);
      _TC_NCCIID = "TC_NCCIID";
      TC_NCCIID = new OfficialIDType(_TC_NCCIID);
      _TC_DOLID = "TC_DOLID";
      TC_DOLID = new OfficialIDType(_TC_DOLID);
      _TC_DUNS = "TC_DUNS";
      TC_DUNS = new OfficialIDType(_TC_DUNS);
      _TC_FEIN = "TC_FEIN";
      TC_FEIN = new OfficialIDType(_TC_FEIN);
      _TC_SSN = "TC_SSN";
      TC_SSN = new OfficialIDType(_TC_SSN);
      _TC_STAX = "TC_STAX";
      TC_STAX = new OfficialIDType(_TC_STAX);
      _TC_STUN = "TC_STUN";
      TC_STUN = new OfficialIDType(_TC_STUN);
      _TC_TUNS = "TC_TUNS";
      TC_TUNS = new OfficialIDType(_TC_TUNS);
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
    public static OfficialIDType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OfficialIDType enumeration = (OfficialIDType) internalFromCode(value);
        if (enumeration == null) enumeration = (OfficialIDType) internalFromCode("TC_" + value);
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
    public static OfficialIDType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static OfficialIDType internalFromCode(java.lang.String value){
        OfficialIDType enumeration = (OfficialIDType)
            _table_.get(value);
        return enumeration;
    }
    public static OfficialIDType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OfficialIDType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "OfficialIDType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
