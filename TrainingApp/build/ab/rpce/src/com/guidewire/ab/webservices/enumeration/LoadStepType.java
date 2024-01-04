/**
 * LoadStepType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Types of load step events
 */
public class LoadStepType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LoadStepType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_consistencychecked;
    private static java.lang.String _TC_estimatedbstatistics;
    private static java.lang.String _TC_errorcleared;
    private static java.lang.String _TC_excludeddeleted;
    private static java.lang.String _TC_exclusioncleared;
    private static java.lang.String _TC_exclusionpop;
    private static java.lang.String _TC_idsgenerated;
    private static java.lang.String _TC_insertselects;
    private static java.lang.String _TC_integrityexecuted;
    private static java.lang.String _TC_integritychecked;
    private static java.lang.String _TC_lcafterinsertselect;
    private static java.lang.String _TC_lcbeforeinsertselect;
    private static java.lang.String _TC_lcbeforeidgeneration;
    private static java.lang.String _TC_nonexcludeddeleted;
    private static java.lang.String _TC_overwrittencleared;
    private static java.lang.String _TC_ppesexecuted;
    private static java.lang.String _TC_rownumsgenerated;
    private static java.lang.String _TC_sourceloaded;
    private static java.lang.String _TC_stagingcleared;

/**
 * Custom consistency checks executed after populating staging tables
 */
    public static LoadStepType TC_consistencychecked;

/**
 * DB statistics updated with estimates for source tables
 */
    public static LoadStepType TC_estimatedbstatistics;

/**
 * Error table cleared
 */
    public static LoadStepType TC_errorcleared;

/**
 * Excluded rows deleted from staging tables
 */
    public static LoadStepType TC_excludeddeleted;

/**
 * Exclusion table cleared
 */
    public static LoadStepType TC_exclusioncleared;

/**
 * Exclusion table populated with failed rows from error table
 */
    public static LoadStepType TC_exclusionpop;

/**
 * IDs generated for staging tables
 */
    public static LoadStepType TC_idsgenerated;

/**
 * INSERT SELECTs from staging to source tables executed
 */
    public static LoadStepType TC_insertselects;

/**
 * Integrity check queries checks executed
 */
    public static LoadStepType TC_integrityexecuted;

/**
 * Integrity of staging tables checked (Entire phase)
 */
    public static LoadStepType TC_integritychecked;

/**
 * LoaderCallbacks executed after insert/selects into source tables
 */
    public static LoadStepType TC_lcafterinsertselect;

/**
 * LoaderCallbacks executed before insert/selects into source tables
 */
    public static LoadStepType TC_lcbeforeinsertselect;

/**
 * LoaderCallbacks executed before id generation
 */
    public static LoadStepType TC_lcbeforeidgeneration;

/**
 * Non-excluded rows deleted from staging tables
 */
    public static LoadStepType TC_nonexcludeddeleted;

/**
 * Overwritten staging tables and columns cleared
 */
    public static LoadStepType TC_overwrittencleared;

/**
 * PostPopulatorExecutors executed after populating staging tables
 */
    public static LoadStepType TC_ppesexecuted;

/**
 * Row numbers generated for staging tables
 */
    public static LoadStepType TC_rownumsgenerated;

/**
 * Source tables loaded from staging tables (Entire phase)
 */
    public static LoadStepType TC_sourceloaded;

/**
 * Staging tables cleared
 */
    public static LoadStepType TC_stagingcleared;

    private static void initValues0() {
      _TC_consistencychecked = "TC_consistencychecked";
      TC_consistencychecked = new LoadStepType(_TC_consistencychecked);
      _TC_estimatedbstatistics = "TC_estimatedbstatistics";
      TC_estimatedbstatistics = new LoadStepType(_TC_estimatedbstatistics);
      _TC_errorcleared = "TC_errorcleared";
      TC_errorcleared = new LoadStepType(_TC_errorcleared);
      _TC_excludeddeleted = "TC_excludeddeleted";
      TC_excludeddeleted = new LoadStepType(_TC_excludeddeleted);
      _TC_exclusioncleared = "TC_exclusioncleared";
      TC_exclusioncleared = new LoadStepType(_TC_exclusioncleared);
      _TC_exclusionpop = "TC_exclusionpop";
      TC_exclusionpop = new LoadStepType(_TC_exclusionpop);
      _TC_idsgenerated = "TC_idsgenerated";
      TC_idsgenerated = new LoadStepType(_TC_idsgenerated);
      _TC_insertselects = "TC_insertselects";
      TC_insertselects = new LoadStepType(_TC_insertselects);
      _TC_integrityexecuted = "TC_integrityexecuted";
      TC_integrityexecuted = new LoadStepType(_TC_integrityexecuted);
      _TC_integritychecked = "TC_integritychecked";
      TC_integritychecked = new LoadStepType(_TC_integritychecked);
      _TC_lcafterinsertselect = "TC_lcafterinsertselect";
      TC_lcafterinsertselect = new LoadStepType(_TC_lcafterinsertselect);
      _TC_lcbeforeinsertselect = "TC_lcbeforeinsertselect";
      TC_lcbeforeinsertselect = new LoadStepType(_TC_lcbeforeinsertselect);
      _TC_lcbeforeidgeneration = "TC_lcbeforeidgeneration";
      TC_lcbeforeidgeneration = new LoadStepType(_TC_lcbeforeidgeneration);
      _TC_nonexcludeddeleted = "TC_nonexcludeddeleted";
      TC_nonexcludeddeleted = new LoadStepType(_TC_nonexcludeddeleted);
      _TC_overwrittencleared = "TC_overwrittencleared";
      TC_overwrittencleared = new LoadStepType(_TC_overwrittencleared);
      _TC_ppesexecuted = "TC_ppesexecuted";
      TC_ppesexecuted = new LoadStepType(_TC_ppesexecuted);
      _TC_rownumsgenerated = "TC_rownumsgenerated";
      TC_rownumsgenerated = new LoadStepType(_TC_rownumsgenerated);
      _TC_sourceloaded = "TC_sourceloaded";
      TC_sourceloaded = new LoadStepType(_TC_sourceloaded);
      _TC_stagingcleared = "TC_stagingcleared";
      TC_stagingcleared = new LoadStepType(_TC_stagingcleared);
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
    public static LoadStepType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LoadStepType enumeration = (LoadStepType) internalFromCode(value);
        if (enumeration == null) enumeration = (LoadStepType) internalFromCode("TC_" + value);
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
    public static LoadStepType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static LoadStepType internalFromCode(java.lang.String value){
        LoadStepType enumeration = (LoadStepType)
            _table_.get(value);
        return enumeration;
    }
    public static LoadStepType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LoadStepType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LoadStepType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
