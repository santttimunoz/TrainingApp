/**
 * WorkItemSetState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * State of a WorkItemSet
 */
public class WorkItemSetState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WorkItemSetState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_Canceling;
    private static java.lang.String _TC_Completed;
    private static java.lang.String _TC_CurrentlyPaused;
    private static java.lang.String _TC_Processing;
    private static java.lang.String _TC_CurrentlyStarting;
    private static java.lang.String _TC_CurrentlyStuck;

/**
 * a WorkItemSet goes into this state when the user requests that
 * we cease further processing. Workers will continue processing current
 * WorkItems, but will not start new ones.
 */
    public static WorkItemSetState TC_Canceling;

/**
 * all WorkItems have been processed. Some WorkItems may have been
 * successful and others may have failed
 */
    public static WorkItemSetState TC_Completed;

/**
 * the WorkItemSet is currently paused
 */
    public static WorkItemSetState TC_CurrentlyPaused;

/**
 * the WorkItemSet is being worked on, i.e. there is at least one
 * WorkItem that has not been completed yet
 */
    public static WorkItemSetState TC_Processing;

/**
 * the WorkItemSet is currently starting up
 */
    public static WorkItemSetState TC_CurrentlyStarting;

/**
 * the WorkItemSet appears to be stuck. Please cancel.
 */
    public static WorkItemSetState TC_CurrentlyStuck;

    private static void initValues0() {
      _TC_Canceling = "TC_Canceling";
      TC_Canceling = new WorkItemSetState(_TC_Canceling);
      _TC_Completed = "TC_Completed";
      TC_Completed = new WorkItemSetState(_TC_Completed);
      _TC_CurrentlyPaused = "TC_CurrentlyPaused";
      TC_CurrentlyPaused = new WorkItemSetState(_TC_CurrentlyPaused);
      _TC_Processing = "TC_Processing";
      TC_Processing = new WorkItemSetState(_TC_Processing);
      _TC_CurrentlyStarting = "TC_CurrentlyStarting";
      TC_CurrentlyStarting = new WorkItemSetState(_TC_CurrentlyStarting);
      _TC_CurrentlyStuck = "TC_CurrentlyStuck";
      TC_CurrentlyStuck = new WorkItemSetState(_TC_CurrentlyStuck);
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
    public static WorkItemSetState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WorkItemSetState enumeration = (WorkItemSetState) internalFromCode(value);
        if (enumeration == null) enumeration = (WorkItemSetState) internalFromCode("TC_" + value);
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
    public static WorkItemSetState fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static WorkItemSetState internalFromCode(java.lang.String value){
        WorkItemSetState enumeration = (WorkItemSetState)
            _table_.get(value);
        return enumeration;
    }
    public static WorkItemSetState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WorkItemSetState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "WorkItemSetState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
