/**
 * WorkflowActiveState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * The possible states of an active workflow object
 */
public class WorkflowActiveState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WorkflowActiveState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_running;
    private static java.lang.String _TC_waitactivity;
    private static java.lang.String _TC_waitmessage;
    private static java.lang.String _TC_waitmanual;

/**
 * The workflow is currently running.
 */
    public static WorkflowActiveState TC_running;

/**
 * The workflow is waiting for some activities to complete.
 */
    public static WorkflowActiveState TC_waitactivity;

/**
 * The workflow is waiting for a message to be acked.
 */
    public static WorkflowActiveState TC_waitmessage;

/**
 * The workflow is waiting for a trigger or timeout.
 */
    public static WorkflowActiveState TC_waitmanual;

    private static void initValues0() {
      _TC_running = "TC_running";
      TC_running = new WorkflowActiveState(_TC_running);
      _TC_waitactivity = "TC_waitactivity";
      TC_waitactivity = new WorkflowActiveState(_TC_waitactivity);
      _TC_waitmessage = "TC_waitmessage";
      TC_waitmessage = new WorkflowActiveState(_TC_waitmessage);
      _TC_waitmanual = "TC_waitmanual";
      TC_waitmanual = new WorkflowActiveState(_TC_waitmanual);
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
    public static WorkflowActiveState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WorkflowActiveState enumeration = (WorkflowActiveState) internalFromCode(value);
        if (enumeration == null) enumeration = (WorkflowActiveState) internalFromCode("TC_" + value);
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
    public static WorkflowActiveState fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static WorkflowActiveState internalFromCode(java.lang.String value){
        WorkflowActiveState enumeration = (WorkflowActiveState)
            _table_.get(value);
        return enumeration;
    }
    public static WorkflowActiveState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WorkflowActiveState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "WorkflowActiveState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
