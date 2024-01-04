/**
 * DataGenInfoDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Details for data gen.
 */
public class DataGenInfoDetail  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Parent.
     */ 
    private com.guidewire.ab.webservices.entity.DataGenInfo DataGenInfo;
    /** 
        Line for detailed description.
     */ 
    private java.lang.String Description;
    /** 
        display order within parent NOTE: when inserting a DataGenInfoDetail
 * this field must be non-null.
     */ 
    private java.lang.Integer DisplayOrder;
    /** 
        # of tabs for readability NOTE: when inserting a DataGenInfoDetail
 * this field must be non-null.
     */ 
    private java.lang.Integer NumIndents;

    public DataGenInfoDetail() {
    }

    public DataGenInfoDetail(
           com.guidewire.ab.webservices.entity.DataGenInfo DataGenInfo,
           java.lang.String Description,
           java.lang.Integer DisplayOrder,
           java.lang.Integer NumIndents) {
           this.DataGenInfo = DataGenInfo;
           this.Description = Description;
           this.DisplayOrder = DisplayOrder;
           this.NumIndents = NumIndents;
    }


    /**
     *  Parent.
     * 
     * @return DataGenInfo Parent.
     */
    public com.guidewire.ab.webservices.entity.DataGenInfo getDataGenInfo() {
        return DataGenInfo;
    }


    /**
     *  Parent.
     * 
     * @param DataGenInfo Parent.
     */
    public void setDataGenInfo(com.guidewire.ab.webservices.entity.DataGenInfo DataGenInfo) {
        this.DataGenInfo = DataGenInfo;
    }


    /**
     *  Line for detailed description.
     * 
     * @return Description Line for detailed description.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Line for detailed description.
     * 
     * @param Description Line for detailed description.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  display order within parent NOTE: when inserting a DataGenInfoDetail
 * this field must be non-null.
     * 
     * @return DisplayOrder display order within parent NOTE: when inserting a DataGenInfoDetail
 * this field must be non-null.
     */
    public java.lang.Integer getDisplayOrder() {
        return DisplayOrder;
    }


    /**
     *  display order within parent NOTE: when inserting a DataGenInfoDetail
 * this field must be non-null.
     * 
     * @param DisplayOrder display order within parent NOTE: when inserting a DataGenInfoDetail
 * this field must be non-null.
     */
    public void setDisplayOrder(java.lang.Integer DisplayOrder) {
        this.DisplayOrder = DisplayOrder;
    }


    /**
     *  # of tabs for readability NOTE: when inserting a DataGenInfoDetail
 * this field must be non-null.
     * 
     * @return NumIndents # of tabs for readability NOTE: when inserting a DataGenInfoDetail
 * this field must be non-null.
     */
    public java.lang.Integer getNumIndents() {
        return NumIndents;
    }


    /**
     *  # of tabs for readability NOTE: when inserting a DataGenInfoDetail
 * this field must be non-null.
     * 
     * @param NumIndents # of tabs for readability NOTE: when inserting a DataGenInfoDetail
 * this field must be non-null.
     */
    public void setNumIndents(java.lang.Integer NumIndents) {
        this.NumIndents = NumIndents;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataGenInfoDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DataGenInfoDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataGenInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataGenInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DataGenInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DisplayOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numIndents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumIndents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
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
