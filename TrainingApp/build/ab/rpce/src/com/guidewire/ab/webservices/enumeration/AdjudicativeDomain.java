/**
 * AdjudicativeDomain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * specialty types for adjudicators
 */
public class AdjudicativeDomain implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdjudicativeDomain(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_Disputes;
    private static java.lang.String _TC_Appeals;
    private static java.lang.String _TC_County;
    private static java.lang.String _TC_Federal;
    private static java.lang.String _TC_Municipal;
    private static java.lang.String _TC_Supreme;

/**
 * Alternative Dispute Resolutions (ADR)
 */
    public static AdjudicativeDomain TC_Disputes;

/**
 * Appeals
 */
    public static AdjudicativeDomain TC_Appeals;

/**
 * County
 */
    public static AdjudicativeDomain TC_County;

/**
 * Federal
 */
    public static AdjudicativeDomain TC_Federal;

/**
 * Municipal
 */
    public static AdjudicativeDomain TC_Municipal;

/**
 * Supreme
 */
    public static AdjudicativeDomain TC_Supreme;

    private static void initValues0() {
      _TC_Disputes = "TC_Disputes";
      TC_Disputes = new AdjudicativeDomain(_TC_Disputes);
      _TC_Appeals = "TC_Appeals";
      TC_Appeals = new AdjudicativeDomain(_TC_Appeals);
      _TC_County = "TC_County";
      TC_County = new AdjudicativeDomain(_TC_County);
      _TC_Federal = "TC_Federal";
      TC_Federal = new AdjudicativeDomain(_TC_Federal);
      _TC_Municipal = "TC_Municipal";
      TC_Municipal = new AdjudicativeDomain(_TC_Municipal);
      _TC_Supreme = "TC_Supreme";
      TC_Supreme = new AdjudicativeDomain(_TC_Supreme);
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
    public static AdjudicativeDomain fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdjudicativeDomain enumeration = (AdjudicativeDomain) internalFromCode(value);
        if (enumeration == null) enumeration = (AdjudicativeDomain) internalFromCode("TC_" + value);
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
    public static AdjudicativeDomain fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static AdjudicativeDomain internalFromCode(java.lang.String value){
        AdjudicativeDomain enumeration = (AdjudicativeDomain)
            _table_.get(value);
        return enumeration;
    }
    public static AdjudicativeDomain fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdjudicativeDomain.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "AdjudicativeDomain"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
