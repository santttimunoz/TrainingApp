/**
 * VendorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;

public class VendorType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VendorType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_autoglass;
    private static java.lang.String _TC_autorental;
    private static java.lang.String _TC_autorepair;
    private static java.lang.String _TC_bldingcontractor;
    private static java.lang.String _TC_defenseatt;
    private static java.lang.String _TC_doctor;
    private static java.lang.String _TC_externaladjuster;
    private static java.lang.String _TC_fireinspector;
    private static java.lang.String _TC_government;
    private static java.lang.String _TC_hospital;
    private static java.lang.String _TC_indautoinspector;
    private static java.lang.String _TC_indpropinspector;
    private static java.lang.String _TC_insuranceagent;
    private static java.lang.String _TC_nurse;
    private static java.lang.String _TC_plaintiffatt;
    private static java.lang.String _TC_towingservice;

/**
 * Auto glass shop
 */
    public static VendorType TC_autoglass;

/**
 * Auto rental service
 */
    public static VendorType TC_autorental;

/**
 * Auto repair shop
 */
    public static VendorType TC_autorepair;

/**
 * Building contractor
 */
    public static VendorType TC_bldingcontractor;

/**
 * Defense attorney
 */
    public static VendorType TC_defenseatt;

/**
 * Doctor
 */
    public static VendorType TC_doctor;

/**
 * External adjuster
 */
    public static VendorType TC_externaladjuster;

/**
 * Fire inspector
 */
    public static VendorType TC_fireinspector;

/**
 * Government authority
 */
    public static VendorType TC_government;

/**
 * Hospital
 */
    public static VendorType TC_hospital;

/**
 * Independent auto inspector
 */
    public static VendorType TC_indautoinspector;

/**
 * Independent property inspector
 */
    public static VendorType TC_indpropinspector;

/**
 * Insurance agent
 */
    public static VendorType TC_insuranceagent;

/**
 * Nurse - for medical management and rehab
 */
    public static VendorType TC_nurse;

/**
 * Plaintiff attorney
 */
    public static VendorType TC_plaintiffatt;

/**
 * Towing service
 */
    public static VendorType TC_towingservice;

    private static void initValues0() {
      _TC_autoglass = "TC_autoglass";
      TC_autoglass = new VendorType(_TC_autoglass);
      _TC_autorental = "TC_autorental";
      TC_autorental = new VendorType(_TC_autorental);
      _TC_autorepair = "TC_autorepair";
      TC_autorepair = new VendorType(_TC_autorepair);
      _TC_bldingcontractor = "TC_bldingcontractor";
      TC_bldingcontractor = new VendorType(_TC_bldingcontractor);
      _TC_defenseatt = "TC_defenseatt";
      TC_defenseatt = new VendorType(_TC_defenseatt);
      _TC_doctor = "TC_doctor";
      TC_doctor = new VendorType(_TC_doctor);
      _TC_externaladjuster = "TC_externaladjuster";
      TC_externaladjuster = new VendorType(_TC_externaladjuster);
      _TC_fireinspector = "TC_fireinspector";
      TC_fireinspector = new VendorType(_TC_fireinspector);
      _TC_government = "TC_government";
      TC_government = new VendorType(_TC_government);
      _TC_hospital = "TC_hospital";
      TC_hospital = new VendorType(_TC_hospital);
      _TC_indautoinspector = "TC_indautoinspector";
      TC_indautoinspector = new VendorType(_TC_indautoinspector);
      _TC_indpropinspector = "TC_indpropinspector";
      TC_indpropinspector = new VendorType(_TC_indpropinspector);
      _TC_insuranceagent = "TC_insuranceagent";
      TC_insuranceagent = new VendorType(_TC_insuranceagent);
      _TC_nurse = "TC_nurse";
      TC_nurse = new VendorType(_TC_nurse);
      _TC_plaintiffatt = "TC_plaintiffatt";
      TC_plaintiffatt = new VendorType(_TC_plaintiffatt);
      _TC_towingservice = "TC_towingservice";
      TC_towingservice = new VendorType(_TC_towingservice);
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
    public static VendorType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VendorType enumeration = (VendorType) internalFromCode(value);
        if (enumeration == null) enumeration = (VendorType) internalFromCode("TC_" + value);
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
    public static VendorType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static VendorType internalFromCode(java.lang.String value){
        VendorType enumeration = (VendorType)
            _table_.get(value);
        return enumeration;
    }
    public static VendorType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VendorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VendorType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
