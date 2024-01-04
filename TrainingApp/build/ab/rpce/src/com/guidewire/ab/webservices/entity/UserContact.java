/**
 * UserContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Represents the contact data for a system User as a Person.  One
 * UserContact entity
 *       will normally exist in the system for each User, and is linked
 * to by a direct foreign key from that User.
 */
public class UserContact  extends com.guidewire.ab.webservices.entity.Person  implements java.io.Serializable {
    /** 
        Employee ID number. Applies to user contacts.
     */ 
    private java.lang.String EmployeeNumber;

    public UserContact() {
    }

    public UserContact(
           java.lang.String EmployeeNumber) {
           this.EmployeeNumber = EmployeeNumber;
    }


    /**
     *  Employee ID number. Applies to user contacts.
     * 
     * @return EmployeeNumber Employee ID number. Applies to user contacts.
     */
    public java.lang.String getEmployeeNumber() {
        return EmployeeNumber;
    }


    /**
     *  Employee ID number. Applies to user contacts.
     * 
     * @param EmployeeNumber Employee ID number. Applies to user contacts.
     */
    public void setEmployeeNumber(java.lang.String EmployeeNumber) {
        this.EmployeeNumber = EmployeeNumber;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UserContact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployeeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
