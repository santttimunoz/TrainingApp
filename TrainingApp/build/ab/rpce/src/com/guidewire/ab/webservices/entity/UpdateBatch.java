/**
 * UpdateBatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * UpdateBatch has been deprecated since ClaimCenter 8.0 along with
 * the IAddressBookAdapter.
 */
public class UpdateBatch  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        List of objects to be created in the Address Book.
     */ 
    private com.guidewire.ab.webservices.entity.CreateUpdateOp[] CreateUpdateOps;
    /** 
        List of entities to be deleted from the Address Book.
     */ 
    private com.guidewire.ab.webservices.entity.DeleteUpdateOp[] DeleteUpdateOps;
    /** 
        List of changes to fields' values in different entities.  Notice
 * that in this list every entry may apply to a different entity.
     */ 
    private com.guidewire.ab.webservices.entity.FieldChangeUpdateOp[] FieldChangeUpdateOps;
    /** 
        List of validation warnings to be ignored by Address Book
     */ 
    private com.guidewire.ab.webservices.entity.ValidationWarning[] ValidationWarningsToIgnore;

    public UpdateBatch() {
    }

    public UpdateBatch(
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.CreateUpdateOp[] CreateUpdateOps,
           com.guidewire.ab.webservices.entity.DeleteUpdateOp[] DeleteUpdateOps,
           com.guidewire.ab.webservices.entity.FieldChangeUpdateOp[] FieldChangeUpdateOps,
           com.guidewire.ab.webservices.entity.ValidationWarning[] ValidationWarningsToIgnore) {
           this.BeanVersion = BeanVersion;
           this.CreateUpdateOps = CreateUpdateOps;
           this.DeleteUpdateOps = DeleteUpdateOps;
           this.FieldChangeUpdateOps = FieldChangeUpdateOps;
           this.ValidationWarningsToIgnore = ValidationWarningsToIgnore;
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
     *  List of objects to be created in the Address Book.
     * 
     * @return CreateUpdateOps List of objects to be created in the Address Book.
     */
    public com.guidewire.ab.webservices.entity.CreateUpdateOp[] getCreateUpdateOps() {
        return CreateUpdateOps;
    }


    /**
     *  List of objects to be created in the Address Book.
     * 
     * @param CreateUpdateOps List of objects to be created in the Address Book.
     */
    public void setCreateUpdateOps(com.guidewire.ab.webservices.entity.CreateUpdateOp[] CreateUpdateOps) {
        this.CreateUpdateOps = CreateUpdateOps;
    }


    /**
     *  List of entities to be deleted from the Address Book.
     * 
     * @return DeleteUpdateOps List of entities to be deleted from the Address Book.
     */
    public com.guidewire.ab.webservices.entity.DeleteUpdateOp[] getDeleteUpdateOps() {
        return DeleteUpdateOps;
    }


    /**
     *  List of entities to be deleted from the Address Book.
     * 
     * @param DeleteUpdateOps List of entities to be deleted from the Address Book.
     */
    public void setDeleteUpdateOps(com.guidewire.ab.webservices.entity.DeleteUpdateOp[] DeleteUpdateOps) {
        this.DeleteUpdateOps = DeleteUpdateOps;
    }


    /**
     *  List of changes to fields' values in different entities.  Notice
 * that in this list every entry may apply to a different entity.
     * 
     * @return FieldChangeUpdateOps List of changes to fields' values in different entities.  Notice
 * that in this list every entry may apply to a different entity.
     */
    public com.guidewire.ab.webservices.entity.FieldChangeUpdateOp[] getFieldChangeUpdateOps() {
        return FieldChangeUpdateOps;
    }


    /**
     *  List of changes to fields' values in different entities.  Notice
 * that in this list every entry may apply to a different entity.
     * 
     * @param FieldChangeUpdateOps List of changes to fields' values in different entities.  Notice
 * that in this list every entry may apply to a different entity.
     */
    public void setFieldChangeUpdateOps(com.guidewire.ab.webservices.entity.FieldChangeUpdateOp[] FieldChangeUpdateOps) {
        this.FieldChangeUpdateOps = FieldChangeUpdateOps;
    }


    /**
     *  List of validation warnings to be ignored by Address Book
     * 
     * @return ValidationWarningsToIgnore List of validation warnings to be ignored by Address Book
     */
    public com.guidewire.ab.webservices.entity.ValidationWarning[] getValidationWarningsToIgnore() {
        return ValidationWarningsToIgnore;
    }


    /**
     *  List of validation warnings to be ignored by Address Book
     * 
     * @param ValidationWarningsToIgnore List of validation warnings to be ignored by Address Book
     */
    public void setValidationWarningsToIgnore(com.guidewire.ab.webservices.entity.ValidationWarning[] ValidationWarningsToIgnore) {
        this.ValidationWarningsToIgnore = ValidationWarningsToIgnore;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateBatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UpdateBatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createUpdateOps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreateUpdateOps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "CreateUpdateOp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteUpdateOps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeleteUpdateOps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DeleteUpdateOp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldChangeUpdateOps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FieldChangeUpdateOps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FieldChangeUpdateOp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationWarningsToIgnore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidationWarningsToIgnore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ValidationWarning"));
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
