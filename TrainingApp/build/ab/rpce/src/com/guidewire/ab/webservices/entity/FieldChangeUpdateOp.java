/**
 * FieldChangeUpdateOp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * This non-persistent entity has been deprecated since ClaimCenter
 * 8.0 along with the IAddressBookAdapter.
 */
public class FieldChangeUpdateOp  extends com.guidewire.ab.webservices.entity.UpdateOp  implements java.io.Serializable {
    /** 
        Identifies the entity type.  e.g. Person, Company, or Adjudicator.
 * (Entity type on the application side not a ContactManager entity type)
     */ 
    private java.lang.String EntityTypeName;
    /** 
        Identifies the field for the application side.
     */ 
    private java.lang.String Field;
    /** 
        Uniquely identifies target object of the operation.  Can be either
 * an AddressBookUId or a temporary ObjectId that was defined in a CreateUpdateOp.
     */ 
    private java.lang.String ObjectUId;
    /** 
        Associated UpdateBatch.
     */ 
    private com.guidewire.ab.webservices.entity.UpdateBatch UpdateBatch;
    /** 
        Identifies the value of the field on the app side.
     */ 
    private java.lang.String Value;

    public FieldChangeUpdateOp() {
    }

    public FieldChangeUpdateOp(
           java.lang.String EntityTypeName,
           java.lang.String Field,
           java.lang.String ObjectUId,
           com.guidewire.ab.webservices.entity.UpdateBatch UpdateBatch,
           java.lang.String Value) {
           this.EntityTypeName = EntityTypeName;
           this.Field = Field;
           this.ObjectUId = ObjectUId;
           this.UpdateBatch = UpdateBatch;
           this.Value = Value;
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
     *  Identifies the field for the application side.
     * 
     * @return Field Identifies the field for the application side.
     */
    public java.lang.String getField() {
        return Field;
    }


    /**
     *  Identifies the field for the application side.
     * 
     * @param Field Identifies the field for the application side.
     */
    public void setField(java.lang.String Field) {
        this.Field = Field;
    }


    /**
     *  Uniquely identifies target object of the operation.  Can be either
 * an AddressBookUId or a temporary ObjectId that was defined in a CreateUpdateOp.
     * 
     * @return ObjectUId Uniquely identifies target object of the operation.  Can be either
 * an AddressBookUId or a temporary ObjectId that was defined in a CreateUpdateOp.
     */
    public java.lang.String getObjectUId() {
        return ObjectUId;
    }


    /**
     *  Uniquely identifies target object of the operation.  Can be either
 * an AddressBookUId or a temporary ObjectId that was defined in a CreateUpdateOp.
     * 
     * @param ObjectUId Uniquely identifies target object of the operation.  Can be either
 * an AddressBookUId or a temporary ObjectId that was defined in a CreateUpdateOp.
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


    /**
     *  Identifies the value of the field on the app side.
     * 
     * @return Value Identifies the value of the field on the app side.
     */
    public java.lang.String getValue() {
        return Value;
    }


    /**
     *  Identifies the value of the field on the app side.
     * 
     * @param Value Identifies the value of the field on the app side.
     */
    public void setValue(java.lang.String Value) {
        this.Value = Value;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldChangeUpdateOp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldChangeUpdateOp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntityTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Field"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
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
