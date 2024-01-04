/**
 * LoadErrorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Types of load error events
 */
public class LoadErrorType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LoadErrorType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_zerolengthstring;
    private static java.lang.String _TC_abstractdatatype;
    private static java.lang.String _TC_checkconstraint;
    private static java.lang.String _TC_consistchildren2;
    private static java.lang.String _TC_consistchildren1;
    private static java.lang.String _TC_dtordering;
    private static java.lang.String _TC_foreignkeysub;
    private static java.lang.String _TC_reftoexistingreffedrow;
    private static java.lang.String _TC_reftoexistingrow;
    private static java.lang.String _TC_badassignable;
    private static java.lang.String _TC_foreignkey;
    private static java.lang.String _TC_foreignkeynonadmin;
    private static java.lang.String _TC_typekey;
    private static java.lang.String _TC_monetaryamount;
    private static java.lang.String _TC_edgeforeignkey;
    private static java.lang.String _TC_onetoone;
    private static java.lang.String _TC_subtypespec;
    private static java.lang.String _TC_nonull;
    private static java.lang.String _TC_nonullsubtype;
    private static java.lang.String _TC_ppeerror;
    private static java.lang.String _TC_requiredmatch;
    private static java.lang.String _TC_subtype;
    private static java.lang.String _TC_uniqconstraint2;
    private static java.lang.String _TC_uniqconstraint1;
    private static java.lang.String _TC_nomatchlvquery;
    private static java.lang.String _TC_typekeyinset;
    private static java.lang.String _TC_typekeynotinset;

/**
 * Rows found in table with 0-length strings in varchar columns
 */
    public static LoadErrorType TC_zerolengthstring;

/**
 * Rows found in staging table with values that violate rules of an
 * abstract data type
 */
    public static LoadErrorType TC_abstractdatatype;

/**
 * Rows found in staging table that violate a check constraint
 */
    public static LoadErrorType TC_checkconstraint;

/**
 * Consistent children failure found between staging and source tables
 */
    public static LoadErrorType TC_consistchildren2;

/**
 * Consistent children failure found within staging tables
 */
    public static LoadErrorType TC_consistchildren1;

/**
 * Rows found in staging table that violate a date time ordering
 */
    public static LoadErrorType TC_dtordering;

/**
 * Rows found in table with foreign key references to incorrect subtype
 */
    public static LoadErrorType TC_foreignkeysub;

/**
 * Rows found in table with foreign key references to an existing
 * row in a source table that is already referenced from other existing
 * rows, when such references are not allowed
 */
    public static LoadErrorType TC_reftoexistingreffedrow;

/**
 * Rows found in table with foreign key references to an existing
 * row in a source table when such references are not allowed
 */
    public static LoadErrorType TC_reftoexistingrow;

/**
 * Rows found in staging table that violate rules for assignable objects
 */
    public static LoadErrorType TC_badassignable;

/**
 * Rows found in table with invalid values for a foreign key column
 */
    public static LoadErrorType TC_foreignkey;

/**
 * Rows found in table with foreign key references to existing row
 * in a non-admin table when only existing rows in admin tables can be
 * referenced
 */
    public static LoadErrorType TC_foreignkeynonadmin;

/**
 * Rows found in table with invalid values for a typekey column
 */
    public static LoadErrorType TC_typekey;

/**
 * One or the other of the amount and currency column for a monetary
 * amount contains null when the other does not.
 */
    public static LoadErrorType TC_monetaryamount;

/**
 * Not exactly one row found in table for non-nullable edge foreign
 * key relationships
 */
    public static LoadErrorType TC_edgeforeignkey;

/**
 * Not exactly one row found in table for non-nullable one-to-one
 * relationships
 */
    public static LoadErrorType TC_onetoone;

/**
 * Rows found in table with non-null values for one or more subtype-specific
 * columns for a different subtype
 */
    public static LoadErrorType TC_subtypespec;

/**
 * Rows found in table with null values for one or more non-nullable
 * columns in the source table
 */
    public static LoadErrorType TC_nonull;

/**
 * Rows found in table with null values for one or more non-nullable
 * columns for the subtype in the source table
 */
    public static LoadErrorType TC_nonullsubtype;

/**
 * PostPopulateExecutors failures detected after populating source
 * tables
 */
    public static LoadErrorType TC_ppeerror;

/**
 * Rows found in staging table with required referencing rows in array
 * table
 */
    public static LoadErrorType TC_requiredmatch;

/**
 * Rows found in table with invalid values for a subtype column
 */
    public static LoadErrorType TC_subtype;

/**
 * Rows found in staging table that match rows in source table on
 * all columns of a unique index
 */
    public static LoadErrorType TC_uniqconstraint2;

/**
 * Rows found in staging table that violate a unique constraint
 */
    public static LoadErrorType TC_uniqconstraint1;

/**
 * Rows found in staging table by query that should return 0 rows
 */
    public static LoadErrorType TC_nomatchlvquery;

/**
 * Rows found in table include typekey values that are invalid when
 * loading via the staging tables
 */
    public static LoadErrorType TC_typekeyinset;

/**
 * Rows found in table include typekey values that are invalid when
 * loading via the staging tables
 */
    public static LoadErrorType TC_typekeynotinset;

    private static void initValues0() {
      _TC_zerolengthstring = "TC_zerolengthstring";
      TC_zerolengthstring = new LoadErrorType(_TC_zerolengthstring);
      _TC_abstractdatatype = "TC_abstractdatatype";
      TC_abstractdatatype = new LoadErrorType(_TC_abstractdatatype);
      _TC_checkconstraint = "TC_checkconstraint";
      TC_checkconstraint = new LoadErrorType(_TC_checkconstraint);
      _TC_consistchildren2 = "TC_consistchildren2";
      TC_consistchildren2 = new LoadErrorType(_TC_consistchildren2);
      _TC_consistchildren1 = "TC_consistchildren1";
      TC_consistchildren1 = new LoadErrorType(_TC_consistchildren1);
      _TC_dtordering = "TC_dtordering";
      TC_dtordering = new LoadErrorType(_TC_dtordering);
      _TC_foreignkeysub = "TC_foreignkeysub";
      TC_foreignkeysub = new LoadErrorType(_TC_foreignkeysub);
      _TC_reftoexistingreffedrow = "TC_reftoexistingreffedrow";
      TC_reftoexistingreffedrow = new LoadErrorType(_TC_reftoexistingreffedrow);
      _TC_reftoexistingrow = "TC_reftoexistingrow";
      TC_reftoexistingrow = new LoadErrorType(_TC_reftoexistingrow);
      _TC_badassignable = "TC_badassignable";
      TC_badassignable = new LoadErrorType(_TC_badassignable);
      _TC_foreignkey = "TC_foreignkey";
      TC_foreignkey = new LoadErrorType(_TC_foreignkey);
      _TC_foreignkeynonadmin = "TC_foreignkeynonadmin";
      TC_foreignkeynonadmin = new LoadErrorType(_TC_foreignkeynonadmin);
      _TC_typekey = "TC_typekey";
      TC_typekey = new LoadErrorType(_TC_typekey);
      _TC_monetaryamount = "TC_monetaryamount";
      TC_monetaryamount = new LoadErrorType(_TC_monetaryamount);
      _TC_edgeforeignkey = "TC_edgeforeignkey";
      TC_edgeforeignkey = new LoadErrorType(_TC_edgeforeignkey);
      _TC_onetoone = "TC_onetoone";
      TC_onetoone = new LoadErrorType(_TC_onetoone);
      _TC_subtypespec = "TC_subtypespec";
      TC_subtypespec = new LoadErrorType(_TC_subtypespec);
      _TC_nonull = "TC_nonull";
      TC_nonull = new LoadErrorType(_TC_nonull);
      _TC_nonullsubtype = "TC_nonullsubtype";
      TC_nonullsubtype = new LoadErrorType(_TC_nonullsubtype);
      _TC_ppeerror = "TC_ppeerror";
      TC_ppeerror = new LoadErrorType(_TC_ppeerror);
      _TC_requiredmatch = "TC_requiredmatch";
      TC_requiredmatch = new LoadErrorType(_TC_requiredmatch);
      _TC_subtype = "TC_subtype";
      TC_subtype = new LoadErrorType(_TC_subtype);
      _TC_uniqconstraint2 = "TC_uniqconstraint2";
      TC_uniqconstraint2 = new LoadErrorType(_TC_uniqconstraint2);
      _TC_uniqconstraint1 = "TC_uniqconstraint1";
      TC_uniqconstraint1 = new LoadErrorType(_TC_uniqconstraint1);
      _TC_nomatchlvquery = "TC_nomatchlvquery";
      TC_nomatchlvquery = new LoadErrorType(_TC_nomatchlvquery);
      _TC_typekeyinset = "TC_typekeyinset";
      TC_typekeyinset = new LoadErrorType(_TC_typekeyinset);
      _TC_typekeynotinset = "TC_typekeynotinset";
      TC_typekeynotinset = new LoadErrorType(_TC_typekeynotinset);
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
    public static LoadErrorType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LoadErrorType enumeration = (LoadErrorType) internalFromCode(value);
        if (enumeration == null) enumeration = (LoadErrorType) internalFromCode("TC_" + value);
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
    public static LoadErrorType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static LoadErrorType internalFromCode(java.lang.String value){
        LoadErrorType enumeration = (LoadErrorType)
            _table_.get(value);
        return enumeration;
    }
    public static LoadErrorType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LoadErrorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LoadErrorType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
