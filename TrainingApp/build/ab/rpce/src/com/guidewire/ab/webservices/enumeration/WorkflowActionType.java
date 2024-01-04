/**
 * WorkflowActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * What action is the Workflow currently trying to take?
 */
public class WorkflowActionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WorkflowActionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_activity;
    private static java.lang.String _TC_assert;
    private static java.lang.String _TC_branch;
    private static java.lang.String _TC_enter;
    private static java.lang.String _TC_exit;
    private static java.lang.String _TC_finish;
    private static java.lang.String _TC_selectBranch;
    private static java.lang.String _TC_start;

/**
 * Creating Activities
 */
    public static WorkflowActionType TC_activity;

/**
 * Executing Assertions
 */
    public static WorkflowActionType TC_assert;

/**
 * Executing a Branch (or Timeout, Trigger, etc.)
 */
    public static WorkflowActionType TC_branch;

/**
 * Executing an Enter block
 */
    public static WorkflowActionType TC_enter;

/**
 * Executing an Exit block
 */
    public static WorkflowActionType TC_exit;

/**
 * Executing a Finish block
 */
    public static WorkflowActionType TC_finish;

/**
 * Looking for one of the branches to be ready to execute
 */
    public static WorkflowActionType TC_selectBranch;

/**
 * Executing a Start block
 */
    public static WorkflowActionType TC_start;

    private static void initValues0() {
      _TC_activity = "TC_activity";
      TC_activity = new WorkflowActionType(_TC_activity);
      _TC_assert = "TC_assert";
      TC_assert = new WorkflowActionType(_TC_assert);
      _TC_branch = "TC_branch";
      TC_branch = new WorkflowActionType(_TC_branch);
      _TC_enter = "TC_enter";
      TC_enter = new WorkflowActionType(_TC_enter);
      _TC_exit = "TC_exit";
      TC_exit = new WorkflowActionType(_TC_exit);
      _TC_finish = "TC_finish";
      TC_finish = new WorkflowActionType(_TC_finish);
      _TC_selectBranch = "TC_selectBranch";
      TC_selectBranch = new WorkflowActionType(_TC_selectBranch);
      _TC_start = "TC_start";
      TC_start = new WorkflowActionType(_TC_start);
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
    public static WorkflowActionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WorkflowActionType enumeration = (WorkflowActionType) internalFromCode(value);
        if (enumeration == null) enumeration = (WorkflowActionType) internalFromCode("TC_" + value);
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
    public static WorkflowActionType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static WorkflowActionType internalFromCode(java.lang.String value){
        WorkflowActionType enumeration = (WorkflowActionType)
            _table_.get(value);
        return enumeration;
    }
    public static WorkflowActionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WorkflowActionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "WorkflowActionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
