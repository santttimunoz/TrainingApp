/**
 * DataChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * The change to production data.
 */
public class DataChange  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Date the gosu was added.
     */ 
    private java.util.Calendar CreateDate;
    /** 
        The user who created the gosu. NOTE: value is the PublicId of the
 * User.
     */ 
    private java.lang.String CreateUser;
    /** 
        Description of the change requested.
     */ 
    private java.lang.String Description;
    /** 
        The time the gosu was executed.
     */ 
    private java.util.Calendar ExecuteDate;
    /** 
        The user who executed the gosu. NOTE: value is the PublicId of
 * the User.
     */ 
    private java.lang.String ExecuteUser;
    /** 
        An external reference for tracking change requests.
     */ 
    private java.lang.String ExternalReference;
    /** 
        The gosu to execute.
     */ 
    private java.lang.String Gosu;
    /** 
        The result of executing the gosu.
     */ 
    private java.lang.String Result;
    /** 
     */ 
    private com.guidewire.ab.webservices.enumeration.DataChangeStatus Status;

    public DataChange() {
    }

    public DataChange(
           java.util.Calendar CreateDate,
           java.lang.String CreateUser,
           java.lang.String Description,
           java.util.Calendar ExecuteDate,
           java.lang.String ExecuteUser,
           java.lang.String ExternalReference,
           java.lang.String Gosu,
           java.lang.String Result,
           com.guidewire.ab.webservices.enumeration.DataChangeStatus Status) {
           this.CreateDate = CreateDate;
           this.CreateUser = CreateUser;
           this.Description = Description;
           this.ExecuteDate = ExecuteDate;
           this.ExecuteUser = ExecuteUser;
           this.ExternalReference = ExternalReference;
           this.Gosu = Gosu;
           this.Result = Result;
           this.Status = Status;
    }


    /**
     *  Date the gosu was added.
     * 
     * @return CreateDate Date the gosu was added.
     */
    public java.util.Calendar getCreateDate() {
        return CreateDate;
    }


    /**
     *  Date the gosu was added.
     * 
     * @param CreateDate Date the gosu was added.
     */
    public void setCreateDate(java.util.Calendar CreateDate) {
        this.CreateDate = CreateDate;
    }


    /**
     *  The user who created the gosu. NOTE: value is the PublicId of the
 * User.
     * 
     * @return CreateUser The user who created the gosu. NOTE: value is the PublicId of the
 * User.
     */
    public java.lang.String getCreateUser() {
        return CreateUser;
    }


    /**
     *  The user who created the gosu. NOTE: value is the PublicId of the
 * User.
     * 
     * @param CreateUser The user who created the gosu. NOTE: value is the PublicId of the
 * User.
     */
    public void setCreateUser(java.lang.String CreateUser) {
        this.CreateUser = CreateUser;
    }


    /**
     *  Description of the change requested.
     * 
     * @return Description Description of the change requested.
     */
    public java.lang.String getDescription() {
        return Description;
    }


    /**
     *  Description of the change requested.
     * 
     * @param Description Description of the change requested.
     */
    public void setDescription(java.lang.String Description) {
        this.Description = Description;
    }


    /**
     *  The time the gosu was executed.
     * 
     * @return ExecuteDate The time the gosu was executed.
     */
    public java.util.Calendar getExecuteDate() {
        return ExecuteDate;
    }


    /**
     *  The time the gosu was executed.
     * 
     * @param ExecuteDate The time the gosu was executed.
     */
    public void setExecuteDate(java.util.Calendar ExecuteDate) {
        this.ExecuteDate = ExecuteDate;
    }


    /**
     *  The user who executed the gosu. NOTE: value is the PublicId of
 * the User.
     * 
     * @return ExecuteUser The user who executed the gosu. NOTE: value is the PublicId of
 * the User.
     */
    public java.lang.String getExecuteUser() {
        return ExecuteUser;
    }


    /**
     *  The user who executed the gosu. NOTE: value is the PublicId of
 * the User.
     * 
     * @param ExecuteUser The user who executed the gosu. NOTE: value is the PublicId of
 * the User.
     */
    public void setExecuteUser(java.lang.String ExecuteUser) {
        this.ExecuteUser = ExecuteUser;
    }


    /**
     *  An external reference for tracking change requests.
     * 
     * @return ExternalReference An external reference for tracking change requests.
     */
    public java.lang.String getExternalReference() {
        return ExternalReference;
    }


    /**
     *  An external reference for tracking change requests.
     * 
     * @param ExternalReference An external reference for tracking change requests.
     */
    public void setExternalReference(java.lang.String ExternalReference) {
        this.ExternalReference = ExternalReference;
    }


    /**
     *  The gosu to execute.
     * 
     * @return Gosu The gosu to execute.
     */
    public java.lang.String getGosu() {
        return Gosu;
    }


    /**
     *  The gosu to execute.
     * 
     * @param Gosu The gosu to execute.
     */
    public void setGosu(java.lang.String Gosu) {
        this.Gosu = Gosu;
    }


    /**
     *  The result of executing the gosu.
     * 
     * @return Result The result of executing the gosu.
     */
    public java.lang.String getResult() {
        return Result;
    }


    /**
     *  The result of executing the gosu.
     * 
     * @param Result The result of executing the gosu.
     */
    public void setResult(java.lang.String Result) {
        this.Result = Result;
    }


    /**
     * 
     * 
     * @return Status
     */
    public com.guidewire.ab.webservices.enumeration.DataChangeStatus getStatus() {
        return Status;
    }


    /**
     * 
     * 
     * @param Status
     */
    public void setStatus(com.guidewire.ab.webservices.enumeration.DataChangeStatus Status) {
        this.Status = Status;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataChange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "DataChange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("executeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExecuteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executeUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExecuteUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExternalReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gosu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Gosu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DataChangeStatus"));
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
