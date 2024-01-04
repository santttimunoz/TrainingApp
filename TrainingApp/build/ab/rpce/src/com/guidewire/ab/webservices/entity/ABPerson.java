/**
 * ABPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Generic person.
 */
public class ABPerson  extends com.guidewire.ab.webservices.entity.ABContact  implements java.io.Serializable {
    /** 
        Mobile phone number associated with the contact.
     */ 
    private java.lang.String CellPhone;
    /** 
        Mobile phone country.
     */ 
    private com.guidewire.ab.webservices.enumeration.PhoneCountryCode CellPhoneCountry;
    /** 
        Mobile phone extension.
     */ 
    private java.lang.String CellPhoneExtension;
    /** 
        Date of birth.
     */ 
    private java.util.Calendar DateOfBirth;
    /** 
        First name.
     */ 
    private java.lang.String FirstName;
    /** 
        First name in kanji (used only for Japanese names and will be null
 * otherwise)
     */ 
    private java.lang.String FirstNameKanji;
    /** 
        Person's former name, if any.
     */ 
    private java.lang.String FormerName;
    /** 
        Gender.
     */ 
    private com.guidewire.ab.webservices.enumeration.GenderType Gender;
    /** 
        Last name. NOTE: when inserting a ABPerson this field must be non-null.
     */ 
    private java.lang.String LastName;
    /** 
        Last name in kanji (used only for Japanese names and will be null
 * otherwise)
     */ 
    private java.lang.String LastNameKanji;
    /** 
        Driver's license number.
     */ 
    private java.lang.String LicenseNumber;
    /** 
        Driver's license jurisdiction.
     */ 
    private com.guidewire.ab.webservices.enumeration.Jurisdiction LicenseState;
    /** 
        Marital status.
     */ 
    private com.guidewire.ab.webservices.enumeration.MaritalStatus MaritalStatus;
    /** 
        Middle name or initial.
     */ 
    private java.lang.String MiddleName;
    /** 
        Number of dependents the employee has.
     */ 
    private java.lang.Integer NumDependents;
    /** 
        Number of dependents under 18.
     */ 
    private java.lang.Integer NumDependentsU18;
    /** 
        Number of dependents over 18 and under 25.
     */ 
    private java.lang.Integer NumDependentsU25;
    /** 
        Occupation.
     */ 
    private java.lang.String Occupation;
    /** 
        Particle, such as 'de', 'von' (used for French names and will be
 * null otherwise)
     */ 
    private java.lang.String Particle;
    /** 
        Prefix for the person's name.
     */ 
    private com.guidewire.ab.webservices.enumeration.NamePrefix Prefix;
    /** 
        Suffix for the person's name.
     */ 
    private com.guidewire.ab.webservices.enumeration.NameSuffix Suffix;
    /** 
        State-specific field.
     */ 
    private com.guidewire.ab.webservices.enumeration.TaxFilingStatusType TaxFilingStatus;

    public ABPerson() {
    }

    public ABPerson(
           java.lang.String CellPhone,
           com.guidewire.ab.webservices.enumeration.PhoneCountryCode CellPhoneCountry,
           java.lang.String CellPhoneExtension,
           java.util.Calendar DateOfBirth,
           java.lang.String FirstName,
           java.lang.String FirstNameKanji,
           java.lang.String FormerName,
           com.guidewire.ab.webservices.enumeration.GenderType Gender,
           java.lang.String LastName,
           java.lang.String LastNameKanji,
           java.lang.String LicenseNumber,
           com.guidewire.ab.webservices.enumeration.Jurisdiction LicenseState,
           com.guidewire.ab.webservices.enumeration.MaritalStatus MaritalStatus,
           java.lang.String MiddleName,
           java.lang.Integer NumDependents,
           java.lang.Integer NumDependentsU18,
           java.lang.Integer NumDependentsU25,
           java.lang.String Occupation,
           java.lang.String Particle,
           com.guidewire.ab.webservices.enumeration.NamePrefix Prefix,
           com.guidewire.ab.webservices.enumeration.NameSuffix Suffix,
           com.guidewire.ab.webservices.enumeration.TaxFilingStatusType TaxFilingStatus) {
           this.CellPhone = CellPhone;
           this.CellPhoneCountry = CellPhoneCountry;
           this.CellPhoneExtension = CellPhoneExtension;
           this.DateOfBirth = DateOfBirth;
           this.FirstName = FirstName;
           this.FirstNameKanji = FirstNameKanji;
           this.FormerName = FormerName;
           this.Gender = Gender;
           this.LastName = LastName;
           this.LastNameKanji = LastNameKanji;
           this.LicenseNumber = LicenseNumber;
           this.LicenseState = LicenseState;
           this.MaritalStatus = MaritalStatus;
           this.MiddleName = MiddleName;
           this.NumDependents = NumDependents;
           this.NumDependentsU18 = NumDependentsU18;
           this.NumDependentsU25 = NumDependentsU25;
           this.Occupation = Occupation;
           this.Particle = Particle;
           this.Prefix = Prefix;
           this.Suffix = Suffix;
           this.TaxFilingStatus = TaxFilingStatus;
    }


    /**
     *  Mobile phone number associated with the contact.
     * 
     * @return CellPhone Mobile phone number associated with the contact.
     */
    public java.lang.String getCellPhone() {
        return CellPhone;
    }


    /**
     *  Mobile phone number associated with the contact.
     * 
     * @param CellPhone Mobile phone number associated with the contact.
     */
    public void setCellPhone(java.lang.String CellPhone) {
        this.CellPhone = CellPhone;
    }


    /**
     *  Mobile phone country.
     * 
     * @return CellPhoneCountry Mobile phone country.
     */
    public com.guidewire.ab.webservices.enumeration.PhoneCountryCode getCellPhoneCountry() {
        return CellPhoneCountry;
    }


    /**
     *  Mobile phone country.
     * 
     * @param CellPhoneCountry Mobile phone country.
     */
    public void setCellPhoneCountry(com.guidewire.ab.webservices.enumeration.PhoneCountryCode CellPhoneCountry) {
        this.CellPhoneCountry = CellPhoneCountry;
    }


    /**
     *  Mobile phone extension.
     * 
     * @return CellPhoneExtension Mobile phone extension.
     */
    public java.lang.String getCellPhoneExtension() {
        return CellPhoneExtension;
    }


    /**
     *  Mobile phone extension.
     * 
     * @param CellPhoneExtension Mobile phone extension.
     */
    public void setCellPhoneExtension(java.lang.String CellPhoneExtension) {
        this.CellPhoneExtension = CellPhoneExtension;
    }


    /**
     *  Date of birth.
     * 
     * @return DateOfBirth Date of birth.
     */
    public java.util.Calendar getDateOfBirth() {
        return DateOfBirth;
    }


    /**
     *  Date of birth.
     * 
     * @param DateOfBirth Date of birth.
     */
    public void setDateOfBirth(java.util.Calendar DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }


    /**
     *  First name.
     * 
     * @return FirstName First name.
     */
    public java.lang.String getFirstName() {
        return FirstName;
    }


    /**
     *  First name.
     * 
     * @param FirstName First name.
     */
    public void setFirstName(java.lang.String FirstName) {
        this.FirstName = FirstName;
    }


    /**
     *  First name in kanji (used only for Japanese names and will be null
 * otherwise)
     * 
     * @return FirstNameKanji First name in kanji (used only for Japanese names and will be null
 * otherwise)
     */
    public java.lang.String getFirstNameKanji() {
        return FirstNameKanji;
    }


    /**
     *  First name in kanji (used only for Japanese names and will be null
 * otherwise)
     * 
     * @param FirstNameKanji First name in kanji (used only for Japanese names and will be null
 * otherwise)
     */
    public void setFirstNameKanji(java.lang.String FirstNameKanji) {
        this.FirstNameKanji = FirstNameKanji;
    }


    /**
     *  Person's former name, if any.
     * 
     * @return FormerName Person's former name, if any.
     */
    public java.lang.String getFormerName() {
        return FormerName;
    }


    /**
     *  Person's former name, if any.
     * 
     * @param FormerName Person's former name, if any.
     */
    public void setFormerName(java.lang.String FormerName) {
        this.FormerName = FormerName;
    }


    /**
     *  Gender.
     * 
     * @return Gender Gender.
     */
    public com.guidewire.ab.webservices.enumeration.GenderType getGender() {
        return Gender;
    }


    /**
     *  Gender.
     * 
     * @param Gender Gender.
     */
    public void setGender(com.guidewire.ab.webservices.enumeration.GenderType Gender) {
        this.Gender = Gender;
    }


    /**
     *  Last name. NOTE: when inserting a ABPerson this field must be non-null.
     * 
     * @return LastName Last name. NOTE: when inserting a ABPerson this field must be non-null.
     */
    public java.lang.String getLastName() {
        return LastName;
    }


    /**
     *  Last name. NOTE: when inserting a ABPerson this field must be non-null.
     * 
     * @param LastName Last name. NOTE: when inserting a ABPerson this field must be non-null.
     */
    public void setLastName(java.lang.String LastName) {
        this.LastName = LastName;
    }


    /**
     *  Last name in kanji (used only for Japanese names and will be null
 * otherwise)
     * 
     * @return LastNameKanji Last name in kanji (used only for Japanese names and will be null
 * otherwise)
     */
    public java.lang.String getLastNameKanji() {
        return LastNameKanji;
    }


    /**
     *  Last name in kanji (used only for Japanese names and will be null
 * otherwise)
     * 
     * @param LastNameKanji Last name in kanji (used only for Japanese names and will be null
 * otherwise)
     */
    public void setLastNameKanji(java.lang.String LastNameKanji) {
        this.LastNameKanji = LastNameKanji;
    }


    /**
     *  Driver's license number.
     * 
     * @return LicenseNumber Driver's license number.
     */
    public java.lang.String getLicenseNumber() {
        return LicenseNumber;
    }


    /**
     *  Driver's license number.
     * 
     * @param LicenseNumber Driver's license number.
     */
    public void setLicenseNumber(java.lang.String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }


    /**
     *  Driver's license jurisdiction.
     * 
     * @return LicenseState Driver's license jurisdiction.
     */
    public com.guidewire.ab.webservices.enumeration.Jurisdiction getLicenseState() {
        return LicenseState;
    }


    /**
     *  Driver's license jurisdiction.
     * 
     * @param LicenseState Driver's license jurisdiction.
     */
    public void setLicenseState(com.guidewire.ab.webservices.enumeration.Jurisdiction LicenseState) {
        this.LicenseState = LicenseState;
    }


    /**
     *  Marital status.
     * 
     * @return MaritalStatus Marital status.
     */
    public com.guidewire.ab.webservices.enumeration.MaritalStatus getMaritalStatus() {
        return MaritalStatus;
    }


    /**
     *  Marital status.
     * 
     * @param MaritalStatus Marital status.
     */
    public void setMaritalStatus(com.guidewire.ab.webservices.enumeration.MaritalStatus MaritalStatus) {
        this.MaritalStatus = MaritalStatus;
    }


    /**
     *  Middle name or initial.
     * 
     * @return MiddleName Middle name or initial.
     */
    public java.lang.String getMiddleName() {
        return MiddleName;
    }


    /**
     *  Middle name or initial.
     * 
     * @param MiddleName Middle name or initial.
     */
    public void setMiddleName(java.lang.String MiddleName) {
        this.MiddleName = MiddleName;
    }


    /**
     *  Number of dependents the employee has.
     * 
     * @return NumDependents Number of dependents the employee has.
     */
    public java.lang.Integer getNumDependents() {
        return NumDependents;
    }


    /**
     *  Number of dependents the employee has.
     * 
     * @param NumDependents Number of dependents the employee has.
     */
    public void setNumDependents(java.lang.Integer NumDependents) {
        this.NumDependents = NumDependents;
    }


    /**
     *  Number of dependents under 18.
     * 
     * @return NumDependentsU18 Number of dependents under 18.
     */
    public java.lang.Integer getNumDependentsU18() {
        return NumDependentsU18;
    }


    /**
     *  Number of dependents under 18.
     * 
     * @param NumDependentsU18 Number of dependents under 18.
     */
    public void setNumDependentsU18(java.lang.Integer NumDependentsU18) {
        this.NumDependentsU18 = NumDependentsU18;
    }


    /**
     *  Number of dependents over 18 and under 25.
     * 
     * @return NumDependentsU25 Number of dependents over 18 and under 25.
     */
    public java.lang.Integer getNumDependentsU25() {
        return NumDependentsU25;
    }


    /**
     *  Number of dependents over 18 and under 25.
     * 
     * @param NumDependentsU25 Number of dependents over 18 and under 25.
     */
    public void setNumDependentsU25(java.lang.Integer NumDependentsU25) {
        this.NumDependentsU25 = NumDependentsU25;
    }


    /**
     *  Occupation.
     * 
     * @return Occupation Occupation.
     */
    public java.lang.String getOccupation() {
        return Occupation;
    }


    /**
     *  Occupation.
     * 
     * @param Occupation Occupation.
     */
    public void setOccupation(java.lang.String Occupation) {
        this.Occupation = Occupation;
    }


    /**
     *  Particle, such as 'de', 'von' (used for French names and will be
 * null otherwise)
     * 
     * @return Particle Particle, such as 'de', 'von' (used for French names and will be
 * null otherwise)
     */
    public java.lang.String getParticle() {
        return Particle;
    }


    /**
     *  Particle, such as 'de', 'von' (used for French names and will be
 * null otherwise)
     * 
     * @param Particle Particle, such as 'de', 'von' (used for French names and will be
 * null otherwise)
     */
    public void setParticle(java.lang.String Particle) {
        this.Particle = Particle;
    }


    /**
     *  Prefix for the person's name.
     * 
     * @return Prefix Prefix for the person's name.
     */
    public com.guidewire.ab.webservices.enumeration.NamePrefix getPrefix() {
        return Prefix;
    }


    /**
     *  Prefix for the person's name.
     * 
     * @param Prefix Prefix for the person's name.
     */
    public void setPrefix(com.guidewire.ab.webservices.enumeration.NamePrefix Prefix) {
        this.Prefix = Prefix;
    }


    /**
     *  Suffix for the person's name.
     * 
     * @return Suffix Suffix for the person's name.
     */
    public com.guidewire.ab.webservices.enumeration.NameSuffix getSuffix() {
        return Suffix;
    }


    /**
     *  Suffix for the person's name.
     * 
     * @param Suffix Suffix for the person's name.
     */
    public void setSuffix(com.guidewire.ab.webservices.enumeration.NameSuffix Suffix) {
        this.Suffix = Suffix;
    }


    /**
     *  State-specific field.
     * 
     * @return TaxFilingStatus State-specific field.
     */
    public com.guidewire.ab.webservices.enumeration.TaxFilingStatusType getTaxFilingStatus() {
        return TaxFilingStatus;
    }


    /**
     *  State-specific field.
     * 
     * @param TaxFilingStatus State-specific field.
     */
    public void setTaxFilingStatus(com.guidewire.ab.webservices.enumeration.TaxFilingStatusType TaxFilingStatus) {
        this.TaxFilingStatus = TaxFilingStatus;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ABPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABPerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CellPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellPhoneCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CellPhoneCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "PhoneCountryCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellPhoneExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CellPhoneExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstNameKanji");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FirstNameKanji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FormerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "GenderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastNameKanji");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastNameKanji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LicenseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LicenseState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Jurisdiction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "MaritalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numDependents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumDependents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numDependentsU18");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumDependentsU18"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numDependentsU25");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumDependentsU25"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Occupation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("particle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Particle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NamePrefix"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Suffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "NameSuffix"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxFilingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxFilingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "TaxFilingStatusType"));
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
