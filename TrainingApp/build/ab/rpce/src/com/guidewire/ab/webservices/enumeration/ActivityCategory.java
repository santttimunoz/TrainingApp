/**
 * ActivityCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;

public class ActivityCategory implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActivityCategory(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_approval;
    private static java.lang.String _TC_approvaldenied;
    private static java.lang.String _TC_assignmentreview;
    private static java.lang.String _TC_correspondence;
    private static java.lang.String _TC_general;
    private static java.lang.String _TC_interview;
    private static java.lang.String _TC_newmail;
    private static java.lang.String _TC_reminder;
    private static java.lang.String _TC_request;
    private static java.lang.String _TC_response;
    private static java.lang.String _TC_tool;
    private static java.lang.String _TC_warning;

/**
 * Approval
 */
    public static ActivityCategory TC_approval;

/**
 * Approval Denied
 */
    public static ActivityCategory TC_approvaldenied;

/**
 * Assignment Review
 */
    public static ActivityCategory TC_assignmentreview;

/**
 * Correspondence
 */
    public static ActivityCategory TC_correspondence;

/**
 * General
 */
    public static ActivityCategory TC_general;

/**
 * Interview
 */
    public static ActivityCategory TC_interview;

/**
 * New Mail
 */
    public static ActivityCategory TC_newmail;

/**
 * Reminder
 */
    public static ActivityCategory TC_reminder;

/**
 * Request
 */
    public static ActivityCategory TC_request;

/**
 * Response
 */
    public static ActivityCategory TC_response;

/**
 * Tool
 */
    public static ActivityCategory TC_tool;

/**
 * Warning
 */
    public static ActivityCategory TC_warning;

    private static void initValues0() {
      _TC_approval = "TC_approval";
      TC_approval = new ActivityCategory(_TC_approval);
      _TC_approvaldenied = "TC_approvaldenied";
      TC_approvaldenied = new ActivityCategory(_TC_approvaldenied);
      _TC_assignmentreview = "TC_assignmentreview";
      TC_assignmentreview = new ActivityCategory(_TC_assignmentreview);
      _TC_correspondence = "TC_correspondence";
      TC_correspondence = new ActivityCategory(_TC_correspondence);
      _TC_general = "TC_general";
      TC_general = new ActivityCategory(_TC_general);
      _TC_interview = "TC_interview";
      TC_interview = new ActivityCategory(_TC_interview);
      _TC_newmail = "TC_newmail";
      TC_newmail = new ActivityCategory(_TC_newmail);
      _TC_reminder = "TC_reminder";
      TC_reminder = new ActivityCategory(_TC_reminder);
      _TC_request = "TC_request";
      TC_request = new ActivityCategory(_TC_request);
      _TC_response = "TC_response";
      TC_response = new ActivityCategory(_TC_response);
      _TC_tool = "TC_tool";
      TC_tool = new ActivityCategory(_TC_tool);
      _TC_warning = "TC_warning";
      TC_warning = new ActivityCategory(_TC_warning);
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
    public static ActivityCategory fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActivityCategory enumeration = (ActivityCategory) internalFromCode(value);
        if (enumeration == null) enumeration = (ActivityCategory) internalFromCode("TC_" + value);
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
    public static ActivityCategory fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static ActivityCategory internalFromCode(java.lang.String value){
        ActivityCategory enumeration = (ActivityCategory)
            _table_.get(value);
        return enumeration;
    }
    public static ActivityCategory fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ActivityCategory.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ActivityCategory"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
