/**
 * ManagerRelationshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.enumeration;


/**
 * ManagerRelationshipType
 */
public class ManagerRelationshipType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagerRelationshipType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    private static java.lang.String _TC_self;
    private static java.lang.String _TC_admin_assist;
    private static java.lang.String _TC_claims_manager;
    private static java.lang.String _TC_other;
    private static java.lang.String _TC_unknown;

/**
 * Self
 */
    public static ManagerRelationshipType TC_self;

/**
 * Administrative Assistant
 */
    public static ManagerRelationshipType TC_admin_assist;

/**
 * Claims Manager
 */
    public static ManagerRelationshipType TC_claims_manager;

/**
 * Other
 */
    public static ManagerRelationshipType TC_other;

/**
 * Unknown
 */
    public static ManagerRelationshipType TC_unknown;

    private static void initValues0() {
      _TC_self = "TC_self";
      TC_self = new ManagerRelationshipType(_TC_self);
      _TC_admin_assist = "TC_admin_assist";
      TC_admin_assist = new ManagerRelationshipType(_TC_admin_assist);
      _TC_claims_manager = "TC_claims_manager";
      TC_claims_manager = new ManagerRelationshipType(_TC_claims_manager);
      _TC_other = "TC_other";
      TC_other = new ManagerRelationshipType(_TC_other);
      _TC_unknown = "TC_unknown";
      TC_unknown = new ManagerRelationshipType(_TC_unknown);
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
    public static ManagerRelationshipType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagerRelationshipType enumeration = (ManagerRelationshipType) internalFromCode(value);
        if (enumeration == null) enumeration = (ManagerRelationshipType) internalFromCode("TC_" + value);
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
    public static ManagerRelationshipType fromCode(java.lang.String value) {
        try {
            return fromString("TC_" + value);
        } catch (java.lang.IllegalArgumentException iae) {
           return null;
        }
    }
    private static ManagerRelationshipType internalFromCode(java.lang.String value){
        ManagerRelationshipType enumeration = (ManagerRelationshipType)
            _table_.get(value);
        return enumeration;
    }
    public static ManagerRelationshipType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagerRelationshipType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ManagerRelationshipType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
