/**
 * HistoryEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * HistoryEventType
 */
public class HistoryEventType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HistoryEventType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_created;
    private static java.lang.String _TC_assigned;
    private static java.lang.String _TC_flagged;
    private static java.lang.String _TC_unflagged;
    private static java.lang.String _TC_viewed;

/**
 * ABContact was created
 */
    public static HistoryEventType TC_created;

/**
 * ABContact assigned user was set or reset
 */
    public static HistoryEventType TC_assigned;

/**
 * ABContact was flagged
 */
    public static HistoryEventType TC_flagged;

/**
 * ABContact was unflagged
 */
    public static HistoryEventType TC_unflagged;

/**
 * ABContact was viewed
 */
    public static HistoryEventType TC_viewed;

    private static void initValues0() {
      _TC_created = "TC_created";
      TC_created = new HistoryEventType(_TC_created);
      _TC_assigned = "TC_assigned";
      TC_assigned = new HistoryEventType(_TC_assigned);
      _TC_flagged = "TC_flagged";
      TC_flagged = new HistoryEventType(_TC_flagged);
      _TC_unflagged = "TC_unflagged";
      TC_unflagged = new HistoryEventType(_TC_unflagged);
      _TC_viewed = "TC_viewed";
      TC_viewed = new HistoryEventType(_TC_viewed);
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
    public static HistoryEventType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HistoryEventType enumeration = (HistoryEventType) internalFromCode(value);
        if (enumeration == null) enumeration = (HistoryEventType) internalFromCode("TC_" + value);
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
    public static HistoryEventType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static HistoryEventType internalFromCode(java.lang.String value){
        HistoryEventType enumeration = (HistoryEventType)
            _table_.get(value);
        return enumeration;
    }
    public static HistoryEventType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HistoryEventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "HistoryEventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
