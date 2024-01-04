/**
 * ABCompany.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Generic organization.
 */
public class ABCompany  extends com.guidewire.ab.webservices.entity.ABContact  implements java.io.Serializable {
    /** 
        Can employees be added to this company?
     */ 
    private java.lang.Boolean CanAddEmployees;
    /** 
        This score measures how satisfied the company's employees are with
 * the company
     */ 
    private java.lang.Integer EmployeeScore;
    /** 
        Date of business inspection
     */ 
    private java.util.Calendar InspectionDate;
    /** 
        Is a business inspection required for this company?
     */ 
    private java.lang.Boolean InspectionRequired;

    public ABCompany() {
    }

    public ABCompany(
           java.lang.Boolean CanAddEmployees,
           java.lang.Integer EmployeeScore,
           java.util.Calendar InspectionDate,
           java.lang.Boolean InspectionRequired) {
           this.CanAddEmployees = CanAddEmployees;
           this.EmployeeScore = EmployeeScore;
           this.InspectionDate = InspectionDate;
           this.InspectionRequired = InspectionRequired;
    }


    /**
     *  Can employees be added to this company?
     * 
     * @return CanAddEmployees Can employees be added to this company?
     */
    public java.lang.Boolean getCanAddEmployees() {
        return CanAddEmployees;
    }


    /**
     *  Can employees be added to this company?
     * 
     * @param CanAddEmployees Can employees be added to this company?
     */
    public void setCanAddEmployees(java.lang.Boolean CanAddEmployees) {
        this.CanAddEmployees = CanAddEmployees;
    }


    /**
     *  This score measures how satisfied the company's employees are with
 * the company
     * 
     * @return EmployeeScore This score measures how satisfied the company's employees are with
 * the company
     */
    public java.lang.Integer getEmployeeScore() {
        return EmployeeScore;
    }


    /**
     *  This score measures how satisfied the company's employees are with
 * the company
     * 
     * @param EmployeeScore This score measures how satisfied the company's employees are with
 * the company
     */
    public void setEmployeeScore(java.lang.Integer EmployeeScore) {
        this.EmployeeScore = EmployeeScore;
    }


    /**
     *  Date of business inspection
     * 
     * @return InspectionDate Date of business inspection
     */
    public java.util.Calendar getInspectionDate() {
        return InspectionDate;
    }


    /**
     *  Date of business inspection
     * 
     * @param InspectionDate Date of business inspection
     */
    public void setInspectionDate(java.util.Calendar InspectionDate) {
        this.InspectionDate = InspectionDate;
    }


    /**
     *  Is a business inspection required for this company?
     * 
     * @return InspectionRequired Is a business inspection required for this company?
     */
    public java.lang.Boolean getInspectionRequired() {
        return InspectionRequired;
    }


    /**
     *  Is a business inspection required for this company?
     * 
     * @param InspectionRequired Is a business inspection required for this company?
     */
    public void setInspectionRequired(java.lang.Boolean InspectionRequired) {
        this.InspectionRequired = InspectionRequired;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABCompany.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABCompany"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canAddEmployees");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CanAddEmployees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeScore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployeeScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inspectionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InspectionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inspectionRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InspectionRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
