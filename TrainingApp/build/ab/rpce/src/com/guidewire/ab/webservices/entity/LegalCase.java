/**
 * LegalCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Legal case
 */
public class LegalCase  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Associated contact
     */ 
    private com.guidewire.ab.webservices.entity.ABContact ABContact;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Type of case
     */ 
    private com.guidewire.ab.webservices.enumeration.LegalCaseType CaseType;
    /** 
        Defendant of the lawsuit (if contact is the plaintiff)
     */ 
    private java.lang.String Defendant;
    /** 
        Date the case was filed with the courts
     */ 
    private java.util.Calendar FileDate;
    /** 
        Did the contact file this case?
     */ 
    private java.lang.Boolean FiledByContact;
    /** 
        Plaintiff of the lawsuit (if contact is defendant)
     */ 
    private java.lang.String Plaintiff;
    /** 
        Status of case
     */ 
    private com.guidewire.ab.webservices.enumeration.LegalCaseStatus Status;

    public LegalCase() {
    }

    public LegalCase(
           com.guidewire.ab.webservices.entity.ABContact ABContact,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.enumeration.LegalCaseType CaseType,
           java.lang.String Defendant,
           java.util.Calendar FileDate,
           java.lang.Boolean FiledByContact,
           java.lang.String Plaintiff,
           com.guidewire.ab.webservices.enumeration.LegalCaseStatus Status) {
           this.ABContact = ABContact;
           this.BeanVersion = BeanVersion;
           this.CaseType = CaseType;
           this.Defendant = Defendant;
           this.FileDate = FileDate;
           this.FiledByContact = FiledByContact;
           this.Plaintiff = Plaintiff;
           this.Status = Status;
    }


    /**
     *  Associated contact
     * 
     * @return ABContact Associated contact
     */
    public com.guidewire.ab.webservices.entity.ABContact getABContact() {
        return ABContact;
    }


    /**
     *  Associated contact
     * 
     * @param ABContact Associated contact
     */
    public void setABContact(com.guidewire.ab.webservices.entity.ABContact ABContact) {
        this.ABContact = ABContact;
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
     *  Type of case
     * 
     * @return CaseType Type of case
     */
    public com.guidewire.ab.webservices.enumeration.LegalCaseType getCaseType() {
        return CaseType;
    }


    /**
     *  Type of case
     * 
     * @param CaseType Type of case
     */
    public void setCaseType(com.guidewire.ab.webservices.enumeration.LegalCaseType CaseType) {
        this.CaseType = CaseType;
    }


    /**
     *  Defendant of the lawsuit (if contact is the plaintiff)
     * 
     * @return Defendant Defendant of the lawsuit (if contact is the plaintiff)
     */
    public java.lang.String getDefendant() {
        return Defendant;
    }


    /**
     *  Defendant of the lawsuit (if contact is the plaintiff)
     * 
     * @param Defendant Defendant of the lawsuit (if contact is the plaintiff)
     */
    public void setDefendant(java.lang.String Defendant) {
        this.Defendant = Defendant;
    }


    /**
     *  Date the case was filed with the courts
     * 
     * @return FileDate Date the case was filed with the courts
     */
    public java.util.Calendar getFileDate() {
        return FileDate;
    }


    /**
     *  Date the case was filed with the courts
     * 
     * @param FileDate Date the case was filed with the courts
     */
    public void setFileDate(java.util.Calendar FileDate) {
        this.FileDate = FileDate;
    }


    /**
     *  Did the contact file this case?
     * 
     * @return FiledByContact Did the contact file this case?
     */
    public java.lang.Boolean getFiledByContact() {
        return FiledByContact;
    }


    /**
     *  Did the contact file this case?
     * 
     * @param FiledByContact Did the contact file this case?
     */
    public void setFiledByContact(java.lang.Boolean FiledByContact) {
        this.FiledByContact = FiledByContact;
    }


    /**
     *  Plaintiff of the lawsuit (if contact is defendant)
     * 
     * @return Plaintiff Plaintiff of the lawsuit (if contact is defendant)
     */
    public java.lang.String getPlaintiff() {
        return Plaintiff;
    }


    /**
     *  Plaintiff of the lawsuit (if contact is defendant)
     * 
     * @param Plaintiff Plaintiff of the lawsuit (if contact is defendant)
     */
    public void setPlaintiff(java.lang.String Plaintiff) {
        this.Plaintiff = Plaintiff;
    }


    /**
     *  Status of case
     * 
     * @return Status Status of case
     */
    public com.guidewire.ab.webservices.enumeration.LegalCaseStatus getStatus() {
        return Status;
    }


    /**
     *  Status of case
     * 
     * @param Status Status of case
     */
    public void setStatus(com.guidewire.ab.webservices.enumeration.LegalCaseStatus Status) {
        this.Status = Status;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LegalCase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LegalCase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ABContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContact"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LegalCaseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defendant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Defendant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FileDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filedByContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FiledByContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plaintiff");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Plaintiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LegalCaseStatus"));
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
