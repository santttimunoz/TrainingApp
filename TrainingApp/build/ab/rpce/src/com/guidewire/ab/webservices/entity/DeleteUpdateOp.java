/**
 * DeleteUpdateOp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * This non-persistent entity has been deprecated since ClaimCenter
 * 8.0 along with the IAddressBookAdapter.
 */
public class DeleteUpdateOp  extends com.guidewire.ab.webservices.entity.UpdateOp  implements java.io.Serializable {
    /** 
        Identifies the entity type.  e.g. Person, Company, or Adjudicator.
 * (Entity type on the application side not a ContactManager entity type)
     */ 
    private java.lang.String EntityTypeName;
    /** 
        An AddressBookUId of an entity in Address Book that is to be deleted.
     */ 
    private java.lang.String ObjectUId;
    /** 
        Associated UpdateBatch.
     */ 
    private com.guidewire.ab.webservices.entity.UpdateBatch UpdateBatch;

    public DeleteUpdateOp() {
    }

    public DeleteUpdateOp(
           java.lang.String EntityTypeName,
           java.lang.String ObjectUId,
           com.guidewire.ab.webservices.entity.UpdateBatch UpdateBatch) {
           this.EntityTypeName = EntityTypeName;
           this.ObjectUId = ObjectUId;
           this.UpdateBatch = UpdateBatch;
    }


    /**
     *  Identifies the entity type.  e.g. Person, Company, or Adjudicator.
 * (Entity type on the application side not a ContactManager entity type)
     * 
     * @return EntityTypeName Identifies the entity type.  e.g. Person, Company, or Adjudicator.
 * (Entity type on the application side not a ContactManager entity type)
     */
    public java.lang.String getEntityTypeName() {
        return EntityTypeName;
    }


    /**
     *  Identifies the entity type.  e.g. Person, Company, or Adjudicator.
 * (Entity type on the application side not a ContactManager entity type)
     * 
     * @param EntityTypeName Identifies the entity type.  e.g. Person, Company, or Adjudicator.
 * (Entity type on the application side not a ContactManager entity type)
     */
    public void setEntityTypeName(java.lang.String EntityTypeName) {
        this.EntityTypeName = EntityTypeName;
    }


    /**
     *  An AddressBookUId of an entity in Address Book that is to be deleted.
     * 
     * @return ObjectUId An AddressBookUId of an entity in Address Book that is to be deleted.
     */
    public java.lang.String getObjectUId() {
        return ObjectUId;
    }


    /**
     *  An AddressBookUId of an entity in Address Book that is to be deleted.
     * 
     * @param ObjectUId An AddressBookUId of an entity in Address Book that is to be deleted.
     */
    public void setObjectUId(java.lang.String ObjectUId) {
        this.ObjectUId = ObjectUId;
    }


    /**
     *  Associated UpdateBatch.
     * 
     * @return UpdateBatch Associated UpdateBatch.
     */
    public com.guidewire.ab.webservices.entity.UpdateBatch getUpdateBatch() {
        return UpdateBatch;
    }


    /**
     *  Associated UpdateBatch.
     * 
     * @param UpdateBatch Associated UpdateBatch.
     */
    public void setUpdateBatch(com.guidewire.ab.webservices.entity.UpdateBatch UpdateBatch) {
        this.UpdateBatch = UpdateBatch;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteUpdateOp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DeleteUpdateOp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntityTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectUId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectUId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateBatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UpdateBatch"));
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
