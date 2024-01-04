/**
 * DoctorSpecialtyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * DoctorSpecialtyType
 */
public class DoctorSpecialtyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DoctorSpecialtyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_CriticalCareMedicine;
    private static java.lang.String _TC_Dentistry;
    private static java.lang.String _TC_EmergencyMedicine;
    private static java.lang.String _TC_FootSurgery;
    private static java.lang.String _TC_GeneralSurgery;
    private static java.lang.String _TC_HandSurgery;
    private static java.lang.String _TC_Hospitalist;
    private static java.lang.String _TC_InternalMedicine;
    private static java.lang.String _TC_Neurology;
    private static java.lang.String _TC_Orthopaedics;
    private static java.lang.String _TC_PainManagement;
    private static java.lang.String _TC_PhysicalRehabilitation;
    private static java.lang.String _TC_Podiatry;
    private static java.lang.String _TC_ReconstructiveSurgery;
    private static java.lang.String _TC_Unspecified;

/**
 * Critical Care Medicine
 */
    public static DoctorSpecialtyType TC_CriticalCareMedicine;

/**
 * Dentistry/Oral Surgery
 */
    public static DoctorSpecialtyType TC_Dentistry;

/**
 * Emergency Medicine
 */
    public static DoctorSpecialtyType TC_EmergencyMedicine;

/**
 * Foot Surgery
 */
    public static DoctorSpecialtyType TC_FootSurgery;

/**
 * General Surgery
 */
    public static DoctorSpecialtyType TC_GeneralSurgery;

/**
 * Hand Surgery
 */
    public static DoctorSpecialtyType TC_HandSurgery;

/**
 * Hospitalist
 */
    public static DoctorSpecialtyType TC_Hospitalist;

/**
 * Internal Medicine
 */
    public static DoctorSpecialtyType TC_InternalMedicine;

/**
 * Neurology
 */
    public static DoctorSpecialtyType TC_Neurology;

/**
 * Orthopaedics
 */
    public static DoctorSpecialtyType TC_Orthopaedics;

/**
 * Pain Management
 */
    public static DoctorSpecialtyType TC_PainManagement;

/**
 * Physical Rehabilitation
 */
    public static DoctorSpecialtyType TC_PhysicalRehabilitation;

/**
 * Podiatry
 */
    public static DoctorSpecialtyType TC_Podiatry;

/**
 * Reconstructive Surgery
 */
    public static DoctorSpecialtyType TC_ReconstructiveSurgery;

/**
 * Unspecified
 */
    public static DoctorSpecialtyType TC_Unspecified;

    private static void initValues0() {
      _TC_CriticalCareMedicine = "TC_CriticalCareMedicine";
      TC_CriticalCareMedicine = new DoctorSpecialtyType(_TC_CriticalCareMedicine);
      _TC_Dentistry = "TC_Dentistry";
      TC_Dentistry = new DoctorSpecialtyType(_TC_Dentistry);
      _TC_EmergencyMedicine = "TC_EmergencyMedicine";
      TC_EmergencyMedicine = new DoctorSpecialtyType(_TC_EmergencyMedicine);
      _TC_FootSurgery = "TC_FootSurgery";
      TC_FootSurgery = new DoctorSpecialtyType(_TC_FootSurgery);
      _TC_GeneralSurgery = "TC_GeneralSurgery";
      TC_GeneralSurgery = new DoctorSpecialtyType(_TC_GeneralSurgery);
      _TC_HandSurgery = "TC_HandSurgery";
      TC_HandSurgery = new DoctorSpecialtyType(_TC_HandSurgery);
      _TC_Hospitalist = "TC_Hospitalist";
      TC_Hospitalist = new DoctorSpecialtyType(_TC_Hospitalist);
      _TC_InternalMedicine = "TC_InternalMedicine";
      TC_InternalMedicine = new DoctorSpecialtyType(_TC_InternalMedicine);
      _TC_Neurology = "TC_Neurology";
      TC_Neurology = new DoctorSpecialtyType(_TC_Neurology);
      _TC_Orthopaedics = "TC_Orthopaedics";
      TC_Orthopaedics = new DoctorSpecialtyType(_TC_Orthopaedics);
      _TC_PainManagement = "TC_PainManagement";
      TC_PainManagement = new DoctorSpecialtyType(_TC_PainManagement);
      _TC_PhysicalRehabilitation = "TC_PhysicalRehabilitation";
      TC_PhysicalRehabilitation = new DoctorSpecialtyType(_TC_PhysicalRehabilitation);
      _TC_Podiatry = "TC_Podiatry";
      TC_Podiatry = new DoctorSpecialtyType(_TC_Podiatry);
      _TC_ReconstructiveSurgery = "TC_ReconstructiveSurgery";
      TC_ReconstructiveSurgery = new DoctorSpecialtyType(_TC_ReconstructiveSurgery);
      _TC_Unspecified = "TC_Unspecified";
      TC_Unspecified = new DoctorSpecialtyType(_TC_Unspecified);
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
    public static DoctorSpecialtyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DoctorSpecialtyType enumeration = (DoctorSpecialtyType) internalFromCode(value);
        if (enumeration == null) enumeration = (DoctorSpecialtyType) internalFromCode("TC_" + value);
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
    public static DoctorSpecialtyType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static DoctorSpecialtyType internalFromCode(java.lang.String value){
        DoctorSpecialtyType enumeration = (DoctorSpecialtyType)
            _table_.get(value);
        return enumeration;
    }
    public static DoctorSpecialtyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DoctorSpecialtyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DoctorSpecialtyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
