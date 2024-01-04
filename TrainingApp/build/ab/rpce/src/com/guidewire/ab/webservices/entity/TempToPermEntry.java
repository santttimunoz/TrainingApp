/**
 * TempToPermEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * After an addressbook client-application (for example, ClaimCenter)
 * adds an entity (for example, <code>Contact</code>
 *       or <code>Address</code>) to the addressbook, it usually needs
 * to link the local entity to the newly created entity
 *       in the addressbook by setting the <code>AddressBookUId</code>
 * in the local entity.
 *       After calling <code>AddressBookPluginGateway.submitUpdates(UpdateBatch,AddressBookConvertable)</code>
 * the client application can get the newly generated <code>AddressBookUId</code>
 * from the
 *       <code>ContactUpdateResult.getTempToPermEntrys()</code>.
 */
public class TempToPermEntry  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        The ContactUpdateResult which owns this entry.
     */ 
    private com.guidewire.ab.webservices.entity.ContactUpdateResult ContactUpdateResult;
    /** 
        The permanent AddressBookUId given by the address book
     */ 
    private java.lang.String PermId;
    /** 
        The temporary id given by an UpdateBatch CreateUpdateOp
     */ 
    private java.lang.String TempId;

    public TempToPermEntry() {
    }

    public TempToPermEntry(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.ContactUpdateResult ContactUpdateResult,
           java.lang.String PermId,
           java.lang.String TempId) {
           this.BeanVersion = BeanVersion;
           this.ContactUpdateResult = ContactUpdateResult;
           this.PermId = PermId;
           this.TempId = TempId;
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
     *  The ContactUpdateResult which owns this entry.
     * 
     * @return ContactUpdateResult The ContactUpdateResult which owns this entry.
     */
    public com.guidewire.ab.webservices.entity.ContactUpdateResult getContactUpdateResult() {
        return ContactUpdateResult;
    }


    /**
     *  The ContactUpdateResult which owns this entry.
     * 
     * @param ContactUpdateResult The ContactUpdateResult which owns this entry.
     */
    public void setContactUpdateResult(com.guidewire.ab.webservices.entity.ContactUpdateResult ContactUpdateResult) {
        this.ContactUpdateResult = ContactUpdateResult;
    }


    /**
     *  The permanent AddressBookUId given by the address book
     * 
     * @return PermId The permanent AddressBookUId given by the address book
     */
    public java.lang.String getPermId() {
        return PermId;
    }


    /**
     *  The permanent AddressBookUId given by the address book
     * 
     * @param PermId The permanent AddressBookUId given by the address book
     */
    public void setPermId(java.lang.String PermId) {
        this.PermId = PermId;
    }


    /**
     *  The temporary id given by an UpdateBatch CreateUpdateOp
     * 
     * @return TempId The temporary id given by an UpdateBatch CreateUpdateOp
     */
    public java.lang.String getTempId() {
        return TempId;
    }


    /**
     *  The temporary id given by an UpdateBatch CreateUpdateOp
     * 
     * @param TempId The temporary id given by an UpdateBatch CreateUpdateOp
     */
    public void setTempId(java.lang.String TempId) {
        this.TempId = TempId;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TempToPermEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "TempToPermEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactUpdateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactUpdateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactUpdateResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PermId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TempId"));
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
