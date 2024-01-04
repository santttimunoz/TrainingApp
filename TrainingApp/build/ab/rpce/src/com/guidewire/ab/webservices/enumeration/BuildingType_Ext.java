/**
 * BuildingType_Ext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * BuildingType_Ext
 */
public class BuildingType_Ext implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BuildingType_Ext(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_residential_single;
    private static java.lang.String _TC_residential_mutli;
    private static java.lang.String _TC_office;
    private static java.lang.String _TC_industrial;
    private static java.lang.String _TC_hotel;
    private static java.lang.String _TC_other;

/**
 * Residential - single dwelling
 */
    public static BuildingType_Ext TC_residential_single;

/**
 * Residential - multiple dwelling
 */
    public static BuildingType_Ext TC_residential_mutli;

/**
 * Office building
 */
    public static BuildingType_Ext TC_office;

/**
 * Factory or manufacturing
 */
    public static BuildingType_Ext TC_industrial;

/**
 * Hotel
 */
    public static BuildingType_Ext TC_hotel;

/**
 * Other
 */
    public static BuildingType_Ext TC_other;

    private static void initValues0() {
      _TC_residential_single = "TC_residential_single";
      TC_residential_single = new BuildingType_Ext(_TC_residential_single);
      _TC_residential_mutli = "TC_residential_mutli";
      TC_residential_mutli = new BuildingType_Ext(_TC_residential_mutli);
      _TC_office = "TC_office";
      TC_office = new BuildingType_Ext(_TC_office);
      _TC_industrial = "TC_industrial";
      TC_industrial = new BuildingType_Ext(_TC_industrial);
      _TC_hotel = "TC_hotel";
      TC_hotel = new BuildingType_Ext(_TC_hotel);
      _TC_other = "TC_other";
      TC_other = new BuildingType_Ext(_TC_other);
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
    public static BuildingType_Ext fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BuildingType_Ext enumeration = (BuildingType_Ext) internalFromCode(value);
        if (enumeration == null) enumeration = (BuildingType_Ext) internalFromCode("TC_" + value);
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
    public static BuildingType_Ext fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static BuildingType_Ext internalFromCode(java.lang.String value){
        BuildingType_Ext enumeration = (BuildingType_Ext)
            _table_.get(value);
        return enumeration;
    }
    public static BuildingType_Ext fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BuildingType_Ext.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "BuildingType_Ext"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
