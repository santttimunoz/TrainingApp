/**
 * SpecialtyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * specialty types for doctors
 */
public class SpecialtyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SpecialtyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_allergy;
    private static java.lang.String _TC_anesthesiology;
    private static java.lang.String _TC_cardiology;
    private static java.lang.String _TC_dermatology;
    private static java.lang.String _TC_emergencymed;
    private static java.lang.String _TC_endocrinology;
    private static java.lang.String _TC_ent;
    private static java.lang.String _TC_familypractice;
    private static java.lang.String _TC_gastroenterology;
    private static java.lang.String _TC_hematologyonc;
    private static java.lang.String _TC_hospitalist;
    private static java.lang.String _TC_infectiousdis;
    private static java.lang.String _TC_internalmed;
    private static java.lang.String _TC_medpeds;
    private static java.lang.String _TC_nephrology;
    private static java.lang.String _TC_neurology;
    private static java.lang.String _TC_obgyn;
    private static java.lang.String _TC_occupationalmed;
    private static java.lang.String _TC_opthalmology;
    private static java.lang.String _TC_pathology;
    private static java.lang.String _TC_physmedrehab;
    private static java.lang.String _TC_plasticsurgery;
    private static java.lang.String _TC_psychiatry;
    private static java.lang.String _TC_pulmcritcare;
    private static java.lang.String _TC_surgery;

/**
 * Allergy
 */
    public static SpecialtyType TC_allergy;

/**
 * Anesthesiology
 */
    public static SpecialtyType TC_anesthesiology;

/**
 * Cardiology
 */
    public static SpecialtyType TC_cardiology;

/**
 * Dermatology
 */
    public static SpecialtyType TC_dermatology;

/**
 * Emergency Medicine
 */
    public static SpecialtyType TC_emergencymed;

/**
 * Endocrinology
 */
    public static SpecialtyType TC_endocrinology;

/**
 * ENT
 */
    public static SpecialtyType TC_ent;

/**
 * Family Practice
 */
    public static SpecialtyType TC_familypractice;

/**
 * Gastroenterology
 */
    public static SpecialtyType TC_gastroenterology;

/**
 * Hematalogy/Oncology
 */
    public static SpecialtyType TC_hematologyonc;

/**
 * Hospitalist
 */
    public static SpecialtyType TC_hospitalist;

/**
 * Infectious Disease
 */
    public static SpecialtyType TC_infectiousdis;

/**
 * Internal Medicine
 */
    public static SpecialtyType TC_internalmed;

/**
 * Med/Peds
 */
    public static SpecialtyType TC_medpeds;

/**
 * Nephrology
 */
    public static SpecialtyType TC_nephrology;

/**
 * Neurology
 */
    public static SpecialtyType TC_neurology;

/**
 * Obstetrics/Gynecology
 */
    public static SpecialtyType TC_obgyn;

/**
 * Occupational Medicine
 */
    public static SpecialtyType TC_occupationalmed;

/**
 * Opthalmology
 */
    public static SpecialtyType TC_opthalmology;

/**
 * Pathology
 */
    public static SpecialtyType TC_pathology;

/**
 * Physical Medicine/Rehabilitation
 */
    public static SpecialtyType TC_physmedrehab;

/**
 * Plastic Surgery
 */
    public static SpecialtyType TC_plasticsurgery;

/**
 * Psychiatry
 */
    public static SpecialtyType TC_psychiatry;

/**
 * Pulmonary/Critical Care
 */
    public static SpecialtyType TC_pulmcritcare;

/**
 * Surgery
 */
    public static SpecialtyType TC_surgery;

    private static void initValues0() {
      _TC_allergy = "TC_allergy";
      TC_allergy = new SpecialtyType(_TC_allergy);
      _TC_anesthesiology = "TC_anesthesiology";
      TC_anesthesiology = new SpecialtyType(_TC_anesthesiology);
      _TC_cardiology = "TC_cardiology";
      TC_cardiology = new SpecialtyType(_TC_cardiology);
      _TC_dermatology = "TC_dermatology";
      TC_dermatology = new SpecialtyType(_TC_dermatology);
      _TC_emergencymed = "TC_emergencymed";
      TC_emergencymed = new SpecialtyType(_TC_emergencymed);
      _TC_endocrinology = "TC_endocrinology";
      TC_endocrinology = new SpecialtyType(_TC_endocrinology);
      _TC_ent = "TC_ent";
      TC_ent = new SpecialtyType(_TC_ent);
      _TC_familypractice = "TC_familypractice";
      TC_familypractice = new SpecialtyType(_TC_familypractice);
      _TC_gastroenterology = "TC_gastroenterology";
      TC_gastroenterology = new SpecialtyType(_TC_gastroenterology);
      _TC_hematologyonc = "TC_hematologyonc";
      TC_hematologyonc = new SpecialtyType(_TC_hematologyonc);
      _TC_hospitalist = "TC_hospitalist";
      TC_hospitalist = new SpecialtyType(_TC_hospitalist);
      _TC_infectiousdis = "TC_infectiousdis";
      TC_infectiousdis = new SpecialtyType(_TC_infectiousdis);
      _TC_internalmed = "TC_internalmed";
      TC_internalmed = new SpecialtyType(_TC_internalmed);
      _TC_medpeds = "TC_medpeds";
      TC_medpeds = new SpecialtyType(_TC_medpeds);
      _TC_nephrology = "TC_nephrology";
      TC_nephrology = new SpecialtyType(_TC_nephrology);
      _TC_neurology = "TC_neurology";
      TC_neurology = new SpecialtyType(_TC_neurology);
      _TC_obgyn = "TC_obgyn";
      TC_obgyn = new SpecialtyType(_TC_obgyn);
      _TC_occupationalmed = "TC_occupationalmed";
      TC_occupationalmed = new SpecialtyType(_TC_occupationalmed);
      _TC_opthalmology = "TC_opthalmology";
      TC_opthalmology = new SpecialtyType(_TC_opthalmology);
      _TC_pathology = "TC_pathology";
      TC_pathology = new SpecialtyType(_TC_pathology);
      _TC_physmedrehab = "TC_physmedrehab";
      TC_physmedrehab = new SpecialtyType(_TC_physmedrehab);
      _TC_plasticsurgery = "TC_plasticsurgery";
      TC_plasticsurgery = new SpecialtyType(_TC_plasticsurgery);
      _TC_psychiatry = "TC_psychiatry";
      TC_psychiatry = new SpecialtyType(_TC_psychiatry);
      _TC_pulmcritcare = "TC_pulmcritcare";
      TC_pulmcritcare = new SpecialtyType(_TC_pulmcritcare);
      _TC_surgery = "TC_surgery";
      TC_surgery = new SpecialtyType(_TC_surgery);
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
    public static SpecialtyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SpecialtyType enumeration = (SpecialtyType) internalFromCode(value);
        if (enumeration == null) enumeration = (SpecialtyType) internalFromCode("TC_" + value);
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
    public static SpecialtyType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static SpecialtyType internalFromCode(java.lang.String value){
        SpecialtyType enumeration = (SpecialtyType)
            _table_.get(value);
        return enumeration;
    }
    public static SpecialtyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SpecialtyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "SpecialtyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
