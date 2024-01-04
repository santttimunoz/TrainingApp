/**
 * ABDoctor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Doctor
 */
public class ABDoctor  extends com.guidewire.ab.webservices.entity.ABPersonVendor  implements java.io.Serializable {
    /** 
        Doctor's type
     */ 
    private com.guidewire.ab.webservices.enumeration.DoctorCategoryType Category;
    /** 
        Doctor's medical specialty
     */ 
    private com.guidewire.ab.webservices.enumeration.SpecialtyType DoctorSpecialty;
    /** 
        Doctor's medical license number.
     */ 
    private java.lang.String MedicalLicense;
    /** 
        Doctor's specialty
     */ 
    private com.guidewire.ab.webservices.enumeration.DoctorSpecialtyType Specialty;

    public ABDoctor() {
    }

    public ABDoctor(
           com.guidewire.ab.webservices.enumeration.DoctorCategoryType Category,
           com.guidewire.ab.webservices.enumeration.SpecialtyType DoctorSpecialty,
           java.lang.String MedicalLicense,
           com.guidewire.ab.webservices.enumeration.DoctorSpecialtyType Specialty) {
           this.Category = Category;
           this.DoctorSpecialty = DoctorSpecialty;
           this.MedicalLicense = MedicalLicense;
           this.Specialty = Specialty;
    }


    /**
     *  Doctor's type
     * 
     * @return Category Doctor's type
     */
    public com.guidewire.ab.webservices.enumeration.DoctorCategoryType getCategory() {
        return Category;
    }


    /**
     *  Doctor's type
     * 
     * @param Category Doctor's type
     */
    public void setCategory(com.guidewire.ab.webservices.enumeration.DoctorCategoryType Category) {
        this.Category = Category;
    }


    /**
     *  Doctor's medical specialty
     * 
     * @return DoctorSpecialty Doctor's medical specialty
     */
    public com.guidewire.ab.webservices.enumeration.SpecialtyType getDoctorSpecialty() {
        return DoctorSpecialty;
    }


    /**
     *  Doctor's medical specialty
     * 
     * @param DoctorSpecialty Doctor's medical specialty
     */
    public void setDoctorSpecialty(com.guidewire.ab.webservices.enumeration.SpecialtyType DoctorSpecialty) {
        this.DoctorSpecialty = DoctorSpecialty;
    }


    /**
     *  Doctor's medical license number.
     * 
     * @return MedicalLicense Doctor's medical license number.
     */
    public java.lang.String getMedicalLicense() {
        return MedicalLicense;
    }


    /**
     *  Doctor's medical license number.
     * 
     * @param MedicalLicense Doctor's medical license number.
     */
    public void setMedicalLicense(java.lang.String MedicalLicense) {
        this.MedicalLicense = MedicalLicense;
    }


    /**
     *  Doctor's specialty
     * 
     * @return Specialty Doctor's specialty
     */
    public com.guidewire.ab.webservices.enumeration.DoctorSpecialtyType getSpecialty() {
        return Specialty;
    }


    /**
     *  Doctor's specialty
     * 
     * @param Specialty Doctor's specialty
     */
    public void setSpecialty(com.guidewire.ab.webservices.enumeration.DoctorSpecialtyType Specialty) {
        this.Specialty = Specialty;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABDoctor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABDoctor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DoctorCategoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctorSpecialty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DoctorSpecialty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "SpecialtyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medicalLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MedicalLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Specialty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "DoctorSpecialtyType"));
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
