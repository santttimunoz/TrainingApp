/**
 * NoteTopicType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;

public class NoteTopicType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NoteTopicType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_general;
    private static java.lang.String _TC_fnol;
    private static java.lang.String _TC_coverage;
    private static java.lang.String _TC_investigation;
    private static java.lang.String _TC_medical;
    private static java.lang.String _TC_evaluation;
    private static java.lang.String _TC_settlement;
    private static java.lang.String _TC_subrogation;
    private static java.lang.String _TC_salvage;
    private static java.lang.String _TC_litigation;

/**
 * General
 */
    public static NoteTopicType TC_general;

/**
 * First notice of loss
 */
    public static NoteTopicType TC_fnol;

/**
 * Coverage
 */
    public static NoteTopicType TC_coverage;

/**
 * Investigation
 */
    public static NoteTopicType TC_investigation;

/**
 * Medical issues
 */
    public static NoteTopicType TC_medical;

/**
 * Evaluation
 */
    public static NoteTopicType TC_evaluation;

/**
 * Settlement
 */
    public static NoteTopicType TC_settlement;

/**
 * Subrogation
 */
    public static NoteTopicType TC_subrogation;

/**
 * Salvage
 */
    public static NoteTopicType TC_salvage;

/**
 * Litigation
 */
    public static NoteTopicType TC_litigation;

    private static void initValues0() {
      _TC_general = "TC_general";
      TC_general = new NoteTopicType(_TC_general);
      _TC_fnol = "TC_fnol";
      TC_fnol = new NoteTopicType(_TC_fnol);
      _TC_coverage = "TC_coverage";
      TC_coverage = new NoteTopicType(_TC_coverage);
      _TC_investigation = "TC_investigation";
      TC_investigation = new NoteTopicType(_TC_investigation);
      _TC_medical = "TC_medical";
      TC_medical = new NoteTopicType(_TC_medical);
      _TC_evaluation = "TC_evaluation";
      TC_evaluation = new NoteTopicType(_TC_evaluation);
      _TC_settlement = "TC_settlement";
      TC_settlement = new NoteTopicType(_TC_settlement);
      _TC_subrogation = "TC_subrogation";
      TC_subrogation = new NoteTopicType(_TC_subrogation);
      _TC_salvage = "TC_salvage";
      TC_salvage = new NoteTopicType(_TC_salvage);
      _TC_litigation = "TC_litigation";
      TC_litigation = new NoteTopicType(_TC_litigation);
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
    public static NoteTopicType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NoteTopicType enumeration = (NoteTopicType) internalFromCode(value);
        if (enumeration == null) enumeration = (NoteTopicType) internalFromCode("TC_" + value);
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
    public static NoteTopicType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static NoteTopicType internalFromCode(java.lang.String value){
        NoteTopicType enumeration = (NoteTopicType)
            _table_.get(value);
        return enumeration;
    }
    public static NoteTopicType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NoteTopicType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NoteTopicType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
