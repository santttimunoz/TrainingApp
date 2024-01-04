/**
 * ReviewCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * Category for Service Provider Management Review questions and categories;
 * generally, this will be extended by customers
 */
public class ReviewCategory implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReviewCategory(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_accuracy;
    private static java.lang.String _TC_adjuster;
    private static java.lang.String _TC_communication;
    private static java.lang.String _TC_general;
    private static java.lang.String _TC_officestaff;
    private static java.lang.String _TC_quality;
    private static java.lang.String _TC_technicians;
    private static java.lang.String _TC_timeliness;

/**
 * Accuracy of Quote
 */
    public static ReviewCategory TC_accuracy;

/**
 * Section for adjusters to add comments
 */
    public static ReviewCategory TC_adjuster;

/**
 * Communication
 */
    public static ReviewCategory TC_communication;

/**
 * A default category for general questions.
 */
    public static ReviewCategory TC_general;

/**
 * Office Personnel.
 */
    public static ReviewCategory TC_officestaff;

/**
 * Quality of Work
 */
    public static ReviewCategory TC_quality;

/**
 * Technicians
 */
    public static ReviewCategory TC_technicians;

/**
 * Timeliness
 */
    public static ReviewCategory TC_timeliness;

    private static void initValues0() {
      _TC_accuracy = "TC_accuracy";
      TC_accuracy = new ReviewCategory(_TC_accuracy);
      _TC_adjuster = "TC_adjuster";
      TC_adjuster = new ReviewCategory(_TC_adjuster);
      _TC_communication = "TC_communication";
      TC_communication = new ReviewCategory(_TC_communication);
      _TC_general = "TC_general";
      TC_general = new ReviewCategory(_TC_general);
      _TC_officestaff = "TC_officestaff";
      TC_officestaff = new ReviewCategory(_TC_officestaff);
      _TC_quality = "TC_quality";
      TC_quality = new ReviewCategory(_TC_quality);
      _TC_technicians = "TC_technicians";
      TC_technicians = new ReviewCategory(_TC_technicians);
      _TC_timeliness = "TC_timeliness";
      TC_timeliness = new ReviewCategory(_TC_timeliness);
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
    public static ReviewCategory fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReviewCategory enumeration = (ReviewCategory) internalFromCode(value);
        if (enumeration == null) enumeration = (ReviewCategory) internalFromCode("TC_" + value);
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
    public static ReviewCategory fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static ReviewCategory internalFromCode(java.lang.String value){
        ReviewCategory enumeration = (ReviewCategory)
            _table_.get(value);
        return enumeration;
    }
    public static ReviewCategory fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReviewCategory.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ReviewCategory"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
