/**
 * ContactUpdateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * ContactUpdateResult has been deprecated as of ClaimCenter 8.0 along
 * with IAddressBookAdapter..
 *       ContactUpdateResult represents the result of creating or updating
 * a Contact. This operation can
 *       either succeed or fail. If it failed, then errors will be accessible
 * via getValidationResult. If it succeeded,
 *       then there should be no errors in the ValidationResult, and
 * the created or updated Contact will be accessible
 *       via getContact.
 */
public class ContactUpdateResult  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Gets the Contact that was created or updated. Ignored if errors
 * occurred.
     */ 
    private com.guidewire.ab.webservices.entity.Contact Contact;
    /** 
        Used to report any errors that occurred during creation or update.
 * May be null to report no errors.
     */ 
    private com.guidewire.ab.webservices.entity.ValidationResult ContactValidationResult;
    /** 
        The address book's mapping of the given temp ids to permanent ids
     */ 
    private com.guidewire.ab.webservices.entity.TempToPermEntry[] TempToPermEntrys;

    public ContactUpdateResult() {
    }

    public ContactUpdateResult(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.Contact Contact,
           com.guidewire.ab.webservices.entity.ValidationResult ContactValidationResult,
           com.guidewire.ab.webservices.entity.TempToPermEntry[] TempToPermEntrys) {
           this.BeanVersion = BeanVersion;
           this.Contact = Contact;
           this.ContactValidationResult = ContactValidationResult;
           this.TempToPermEntrys = TempToPermEntrys;
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


    /**
     *  Gets the Contact that was created or updated. Ignored if errors
 * occurred.
     * 
     * @return Contact Gets the Contact that was created or updated. Ignored if errors
 * occurred.
     */
    public com.guidewire.ab.webservices.entity.Contact getContact() {
        return Contact;
    }


    /**
     *  Gets the Contact that was created or updated. Ignored if errors
 * occurred.
     * 
     * @param Contact Gets the Contact that was created or updated. Ignored if errors
 * occurred.
     */
    public void setContact(com.guidewire.ab.webservices.entity.Contact Contact) {
        this.Contact = Contact;
    }


    /**
     *  Used to report any errors that occurred during creation or update.
 * May be null to report no errors.
     * 
     * @return ContactValidationResult Used to report any errors that occurred during creation or update.
 * May be null to report no errors.
     */
    public com.guidewire.ab.webservices.entity.ValidationResult getContactValidationResult() {
        return ContactValidationResult;
    }


    /**
     *  Used to report any errors that occurred during creation or update.
 * May be null to report no errors.
     * 
     * @param ContactValidationResult Used to report any errors that occurred during creation or update.
 * May be null to report no errors.
     */
    public void setContactValidationResult(com.guidewire.ab.webservices.entity.ValidationResult ContactValidationResult) {
        this.ContactValidationResult = ContactValidationResult;
    }


    /**
     *  The address book's mapping of the given temp ids to permanent ids
     * 
     * @return TempToPermEntrys The address book's mapping of the given temp ids to permanent ids
     */
    public com.guidewire.ab.webservices.entity.TempToPermEntry[] getTempToPermEntrys() {
        return TempToPermEntrys;
    }


    /**
     *  The address book's mapping of the given temp ids to permanent ids
     * 
     * @param TempToPermEntrys The address book's mapping of the given temp ids to permanent ids
     */
    public void setTempToPermEntrys(com.guidewire.ab.webservices.entity.TempToPermEntry[] TempToPermEntrys) {
        this.TempToPermEntrys = TempToPermEntrys;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactUpdateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactUpdateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactValidationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactValidationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ValidationResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempToPermEntrys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TempToPermEntrys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "TempToPermEntry"));
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
