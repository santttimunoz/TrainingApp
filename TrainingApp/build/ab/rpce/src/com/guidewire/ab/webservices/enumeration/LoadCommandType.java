/**
 * LoadCommandType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Types of load commands
 */
public class LoadCommandType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LoadCommandType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_dbstatsupdated;
    private static java.lang.String _TC_tablesencrypted;
    private static java.lang.String _TC_errorcleared;
    private static java.lang.String _TC_excludeddeleted;
    private static java.lang.String _TC_exclusioncleared;
    private static java.lang.String _TC_exclusionpop;
    private static java.lang.String _TC_integritychecked;
    private static java.lang.String _TC_nonexcludeddeleted;
    private static java.lang.String _TC_sourceloaded;
    private static java.lang.String _TC_stagingcleared;
    private static java.lang.String _TC_zonesourceloaded;

/**
 * Database statistics updated on staging tables
 */
    public static LoadCommandType TC_dbstatsupdated;

/**
 * Encrypt data in staging tables
 */
    public static LoadCommandType TC_tablesencrypted;

/**
 * Error table cleared
 */
    public static LoadCommandType TC_errorcleared;

/**
 * Excluded rows deleted from staging tables
 */
    public static LoadCommandType TC_excludeddeleted;

/**
 * Exclusion table cleared
 */
    public static LoadCommandType TC_exclusioncleared;

/**
 * Exclusion table populated with failed rows from error table
 */
    public static LoadCommandType TC_exclusionpop;

/**
 * Integrity of staging tables checked
 */
    public static LoadCommandType TC_integritychecked;

/**
 * Non-excluded rows deleted from staging tables
 */
    public static LoadCommandType TC_nonexcludeddeleted;

/**
 * Source tables loaded from staging tables
 */
    public static LoadCommandType TC_sourceloaded;

/**
 * Staging tables cleared
 */
    public static LoadCommandType TC_stagingcleared;

/**
 * Zone Source tables loaded from staging tables
 */
    public static LoadCommandType TC_zonesourceloaded;

    private static void initValues0() {
      _TC_dbstatsupdated = "TC_dbstatsupdated";
      TC_dbstatsupdated = new LoadCommandType(_TC_dbstatsupdated);
      _TC_tablesencrypted = "TC_tablesencrypted";
      TC_tablesencrypted = new LoadCommandType(_TC_tablesencrypted);
      _TC_errorcleared = "TC_errorcleared";
      TC_errorcleared = new LoadCommandType(_TC_errorcleared);
      _TC_excludeddeleted = "TC_excludeddeleted";
      TC_excludeddeleted = new LoadCommandType(_TC_excludeddeleted);
      _TC_exclusioncleared = "TC_exclusioncleared";
      TC_exclusioncleared = new LoadCommandType(_TC_exclusioncleared);
      _TC_exclusionpop = "TC_exclusionpop";
      TC_exclusionpop = new LoadCommandType(_TC_exclusionpop);
      _TC_integritychecked = "TC_integritychecked";
      TC_integritychecked = new LoadCommandType(_TC_integritychecked);
      _TC_nonexcludeddeleted = "TC_nonexcludeddeleted";
      TC_nonexcludeddeleted = new LoadCommandType(_TC_nonexcludeddeleted);
      _TC_sourceloaded = "TC_sourceloaded";
      TC_sourceloaded = new LoadCommandType(_TC_sourceloaded);
      _TC_stagingcleared = "TC_stagingcleared";
      TC_stagingcleared = new LoadCommandType(_TC_stagingcleared);
      _TC_zonesourceloaded = "TC_zonesourceloaded";
      TC_zonesourceloaded = new LoadCommandType(_TC_zonesourceloaded);
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
    public static LoadCommandType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LoadCommandType enumeration = (LoadCommandType) internalFromCode(value);
        if (enumeration == null) enumeration = (LoadCommandType) internalFromCode("TC_" + value);
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
    public static LoadCommandType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static LoadCommandType internalFromCode(java.lang.String value){
        LoadCommandType enumeration = (LoadCommandType)
            _table_.get(value);
        return enumeration;
    }
    public static LoadCommandType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LoadCommandType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LoadCommandType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
