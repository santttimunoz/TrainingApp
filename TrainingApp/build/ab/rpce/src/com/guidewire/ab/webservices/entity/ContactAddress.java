/**
 * ContactAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Table linking contacts to addresses. Note that Contacts can also
 * be related to Addresses through
 *       a direct foreign key/relationship to their Primary Address.<p/>
 * This is represented as a many-to-many relationship, although addresses
 * created through the UI will always
 *       belong uniquely to only one contact.
 */
public class ContactAddress  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Associated address. NOTE: when inserting a ContactAddress this
 * field must be non-null.
     */ 
    private com.guidewire.ab.webservices.entity.Address Address;
    /** 
        Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     */ 
    private java.lang.String AddressBookUID;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;

    public ContactAddress() {
    }

    public ContactAddress(
           com.guidewire.ab.webservices.entity.Address Address,
           java.lang.String AddressBookUID,
           java.lang.Integer BeanVersion) {
           this.Address = Address;
           this.AddressBookUID = AddressBookUID;
           this.BeanVersion = BeanVersion;
    }


    /**
     *  Associated address. NOTE: when inserting a ContactAddress this
 * field must be non-null.
     * 
     * @return Address Associated address. NOTE: when inserting a ContactAddress this
 * field must be non-null.
     */
    public com.guidewire.ab.webservices.entity.Address getAddress() {
        return Address;
    }


    /**
     *  Associated address. NOTE: when inserting a ContactAddress this
 * field must be non-null.
     * 
     * @param Address Associated address. NOTE: when inserting a ContactAddress this
 * field must be non-null.
     */
    public void setAddress(com.guidewire.ab.webservices.entity.Address Address) {
        this.Address = Address;
    }


    /**
     *  Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     * 
     * @return AddressBookUID Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     */
    public java.lang.String getAddressBookUID() {
        return AddressBookUID;
    }


    /**
     *  Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     * 
     * @param AddressBookUID Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     */
    public void setAddressBookUID(java.lang.String AddressBookUID) {
        this.AddressBookUID = AddressBookUID;
    }


    /**
     *  Auto-incremented object version
     * 
     * @return BeanVersion Auto-incremented object version
     */
    public java.lang.Integer getBeanVersion() {
        return BeanVersion;
    }


    /**
     *  Auto-incremented object version
     * 
     * @param BeanVersion Auto-incremented object version
     */
    public void setBeanVersion(java.lang.Integer BeanVersion) {
        this.BeanVersion = BeanVersion;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressBookUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressBookUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
