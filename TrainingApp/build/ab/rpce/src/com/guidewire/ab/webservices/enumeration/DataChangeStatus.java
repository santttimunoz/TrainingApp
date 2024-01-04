/**
 * DataChangeStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Status of a DataChange.
 */
public class DataChangeStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DataChangeStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_Completed;
    private static java.lang.String _TC_Discarded;
    private static java.lang.String _TC_Executing;
    private static java.lang.String _TC_Failed;
    private static java.lang.String _TC_Open;

/**
 * The gosu was executed and did not throw an exception
 */
    public static DataChangeStatus TC_Completed;

/**
 * The gosu was discarded without being run
 */
    public static DataChangeStatus TC_Discarded;

/**
 * The gosu is being executed
 */
    public static DataChangeStatus TC_Executing;

/**
 * The gosu was executed but threw an exception
 */
    public static DataChangeStatus TC_Failed;

/**
 * The gosu was added but not yet run
 */
    public static DataChangeStatus TC_Open;

    private static void initValues0() {
      _TC_Completed = "TC_Completed";
      TC_Completed = new DataChangeStatus(_TC_Completed);
      _TC_Discarded = "TC_Discarded";
      TC_Discarded = new DataChangeStatus(_TC_Discarded);
      _TC_Executing = "TC_Executing";
      TC_Executing = new DataChangeStatus(_TC_Executing);
      _TC_Failed = "TC_Failed";
      TC_Failed = new DataChangeStatus(_TC_Failed);
      _TC_Open = "TC_Open";
      TC_Open = new DataChangeStatus(_TC_Open);
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
    public static DataChangeStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DataChangeStatus enumeration = (DataChangeStatus) internalFromCode(value);
        if (enumeration == null) enumeration = (DataChangeStatus) internalFromCode("TC_" + value);
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
    public static DataChangeStatus fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static DataChangeStatus internalFromCode(java.lang.String value){
        DataChangeStatus enumeration = (DataChangeStatus)
            _table_.get(value);
        return enumeration;
    }
    public static DataChangeStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DataChangeStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DataChangeStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
