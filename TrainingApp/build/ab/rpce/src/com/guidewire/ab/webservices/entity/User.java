/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Internal system users.
 */
public class User  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Attributes for the user.
     */ 
    private com.guidewire.ab.webservices.entity.AttributeUser[] Attributes;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Contact entry related to the user. NOTE: when inserting a User
 * this field must be non-null.
     */ 
    private com.guidewire.ab.webservices.entity.UserContact Contact;
    /** 
        Security credential for the user.
     */ 
    private com.guidewire.ab.webservices.entity.Credential Credential;
    /** 
        User's default country
     */ 
    private com.guidewire.ab.webservices.enumeration.Country DefaultCountry;
    /** 
        User's default phone country
     */ 
    private com.guidewire.ab.webservices.enumeration.PhoneCountryCode DefaultPhoneCountry;
    /** 
        User's department within the company.
     */ 
    private java.lang.String Department;
    /** 
        Experience level of the user.
     */ 
    private com.guidewire.ab.webservices.enumeration.UserExperienceType ExperienceLevel;
    /** 
        integer extension; default value of '12'
     */ 
    private java.lang.Integer IntegerExt;
    /** 
        User's job title.
     */ 
    private java.lang.String JobTitle;
    /** 
        User's preferred language.
     */ 
    private com.guidewire.ab.webservices.enumeration.LanguageType Language;
    /** 
        User's preferred locale.
     */ 
    private com.guidewire.ab.webservices.enumeration.LocaleType Locale;
    /** 
        Measurement System Preference
     */ 
    private com.guidewire.ab.webservices.enumeration.MeasurementSystem MeasurementSystemPreference;
    /** 
        Security roles granted to the user.
     */ 
    private com.guidewire.ab.webservices.entity.UserRole[] Roles;
    /** 
        User's time zone.
     */ 
    private com.guidewire.ab.webservices.enumeration.TimeZoneType TimeZone;
    /** 
        Should the helper labels be displayed?
     */ 
    private java.lang.Boolean UseHelperLabels;

    public User() {
    }

    public User(
           com.guidewire.ab.webservices.entity.AttributeUser[] Attributes,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.UserContact Contact,
           com.guidewire.ab.webservices.entity.Credential Credential,
           com.guidewire.ab.webservices.enumeration.Country DefaultCountry,
           com.guidewire.ab.webservices.enumeration.PhoneCountryCode DefaultPhoneCountry,
           java.lang.String Department,
           com.guidewire.ab.webservices.enumeration.UserExperienceType ExperienceLevel,
           java.lang.Integer IntegerExt,
           java.lang.String JobTitle,
           com.guidewire.ab.webservices.enumeration.LanguageType Language,
           com.guidewire.ab.webservices.enumeration.LocaleType Locale,
           com.guidewire.ab.webservices.enumeration.MeasurementSystem MeasurementSystemPreference,
           com.guidewire.ab.webservices.entity.UserRole[] Roles,
           com.guidewire.ab.webservices.enumeration.TimeZoneType TimeZone,
           java.lang.Boolean UseHelperLabels) {
           this.Attributes = Attributes;
           this.BeanVersion = BeanVersion;
           this.Contact = Contact;
           this.Credential = Credential;
           this.DefaultCountry = DefaultCountry;
           this.DefaultPhoneCountry = DefaultPhoneCountry;
           this.Department = Department;
           this.ExperienceLevel = ExperienceLevel;
           this.IntegerExt = IntegerExt;
           this.JobTitle = JobTitle;
           this.Language = Language;
           this.Locale = Locale;
           this.MeasurementSystemPreference = MeasurementSystemPreference;
           this.Roles = Roles;
           this.TimeZone = TimeZone;
           this.UseHelperLabels = UseHelperLabels;
    }


    /**
     *  Attributes for the user.
     * 
     * @return Attributes Attributes for the user.
     */
    public com.guidewire.ab.webservices.entity.AttributeUser[] getAttributes() {
        return Attributes;
    }


    /**
     *  Attributes for the user.
     * 
     * @param Attributes Attributes for the user.
     */
    public void setAttributes(com.guidewire.ab.webservices.entity.AttributeUser[] Attributes) {
        this.Attributes = Attributes;
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
     *  Contact entry related to the user. NOTE: when inserting a User
 * this field must be non-null.
     * 
     * @return Contact Contact entry related to the user. NOTE: when inserting a User
 * this field must be non-null.
     */
    public com.guidewire.ab.webservices.entity.UserContact getContact() {
        return Contact;
    }


    /**
     *  Contact entry related to the user. NOTE: when inserting a User
 * this field must be non-null.
     * 
     * @param Contact Contact entry related to the user. NOTE: when inserting a User
 * this field must be non-null.
     */
    public void setContact(com.guidewire.ab.webservices.entity.UserContact Contact) {
        this.Contact = Contact;
    }


    /**
     *  Security credential for the user.
     * 
     * @return Credential Security credential for the user.
     */
    public com.guidewire.ab.webservices.entity.Credential getCredential() {
        return Credential;
    }


    /**
     *  Security credential for the user.
     * 
     * @param Credential Security credential for the user.
     */
    public void setCredential(com.guidewire.ab.webservices.entity.Credential Credential) {
        this.Credential = Credential;
    }


    /**
     *  User's default country
     * 
     * @return DefaultCountry User's default country
     */
    public com.guidewire.ab.webservices.enumeration.Country getDefaultCountry() {
        return DefaultCountry;
    }


    /**
     *  User's default country
     * 
     * @param DefaultCountry User's default country
     */
    public void setDefaultCountry(com.guidewire.ab.webservices.enumeration.Country DefaultCountry) {
        this.DefaultCountry = DefaultCountry;
    }


    /**
     *  User's default phone country
     * 
     * @return DefaultPhoneCountry User's default phone country
     */
    public com.guidewire.ab.webservices.enumeration.PhoneCountryCode getDefaultPhoneCountry() {
        return DefaultPhoneCountry;
    }


    /**
     *  User's default phone country
     * 
     * @param DefaultPhoneCountry User's default phone country
     */
    public void setDefaultPhoneCountry(com.guidewire.ab.webservices.enumeration.PhoneCountryCode DefaultPhoneCountry) {
        this.DefaultPhoneCountry = DefaultPhoneCountry;
    }


    /**
     *  User's department within the company.
     * 
     * @return Department User's department within the company.
     */
    public java.lang.String getDepartment() {
        return Department;
    }


    /**
     *  User's department within the company.
     * 
     * @param Department User's department within the company.
     */
    public void setDepartment(java.lang.String Department) {
        this.Department = Department;
    }


    /**
     *  Experience level of the user.
     * 
     * @return ExperienceLevel Experience level of the user.
     */
    public com.guidewire.ab.webservices.enumeration.UserExperienceType getExperienceLevel() {
        return ExperienceLevel;
    }


    /**
     *  Experience level of the user.
     * 
     * @param ExperienceLevel Experience level of the user.
     */
    public void setExperienceLevel(com.guidewire.ab.webservices.enumeration.UserExperienceType ExperienceLevel) {
        this.ExperienceLevel = ExperienceLevel;
    }


    /**
     *  integer extension; default value of '12'
     * 
     * @return IntegerExt integer extension; default value of '12'
     */
    public java.lang.Integer getIntegerExt() {
        return IntegerExt;
    }


    /**
     *  integer extension; default value of '12'
     * 
     * @param IntegerExt integer extension; default value of '12'
     */
    public void setIntegerExt(java.lang.Integer IntegerExt) {
        this.IntegerExt = IntegerExt;
    }


    /**
     *  User's job title.
     * 
     * @return JobTitle User's job title.
     */
    public java.lang.String getJobTitle() {
        return JobTitle;
    }


    /**
     *  User's job title.
     * 
     * @param JobTitle User's job title.
     */
    public void setJobTitle(java.lang.String JobTitle) {
        this.JobTitle = JobTitle;
    }


    /**
     *  User's preferred language.
     * 
     * @return Language User's preferred language.
     */
    public com.guidewire.ab.webservices.enumeration.LanguageType getLanguage() {
        return Language;
    }


    /**
     *  User's preferred language.
     * 
     * @param Language User's preferred language.
     */
    public void setLanguage(com.guidewire.ab.webservices.enumeration.LanguageType Language) {
        this.Language = Language;
    }


    /**
     *  User's preferred locale.
     * 
     * @return Locale User's preferred locale.
     */
    public com.guidewire.ab.webservices.enumeration.LocaleType getLocale() {
        return Locale;
    }


    /**
     *  User's preferred locale.
     * 
     * @param Locale User's preferred locale.
     */
    public void setLocale(com.guidewire.ab.webservices.enumeration.LocaleType Locale) {
        this.Locale = Locale;
    }


    /**
     *  Measurement System Preference
     * 
     * @return MeasurementSystemPreference Measurement System Preference
     */
    public com.guidewire.ab.webservices.enumeration.MeasurementSystem getMeasurementSystemPreference() {
        return MeasurementSystemPreference;
    }


    /**
     *  Measurement System Preference
     * 
     * @param MeasurementSystemPreference Measurement System Preference
     */
    public void setMeasurementSystemPreference(com.guidewire.ab.webservices.enumeration.MeasurementSystem MeasurementSystemPreference) {
        this.MeasurementSystemPreference = MeasurementSystemPreference;
    }


    /**
     *  Security roles granted to the user.
     * 
     * @return Roles Security roles granted to the user.
     */
    public com.guidewire.ab.webservices.entity.UserRole[] getRoles() {
        return Roles;
    }


    /**
     *  Security roles granted to the user.
     * 
     * @param Roles Security roles granted to the user.
     */
    public void setRoles(com.guidewire.ab.webservices.entity.UserRole[] Roles) {
        this.Roles = Roles;
    }


    /**
     *  User's time zone.
     * 
     * @return TimeZone User's time zone.
     */
    public com.guidewire.ab.webservices.enumeration.TimeZoneType getTimeZone() {
        return TimeZone;
    }


    /**
     *  User's time zone.
     * 
     * @param TimeZone User's time zone.
     */
    public void setTimeZone(com.guidewire.ab.webservices.enumeration.TimeZoneType TimeZone) {
        this.TimeZone = TimeZone;
    }


    /**
     *  Should the helper labels be displayed?
     * 
     * @return UseHelperLabels Should the helper labels be displayed?
     */
    public java.lang.Boolean getUseHelperLabels() {
        return UseHelperLabels;
    }


    /**
     *  Should the helper labels be displayed?
     * 
     * @param UseHelperLabels Should the helper labels be displayed?
     */
    public void setUseHelperLabels(java.lang.Boolean UseHelperLabels) {
        this.UseHelperLabels = UseHelperLabels;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "AttributeUser"));
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
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UserContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Credential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Credential"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DefaultCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPhoneCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DefaultPhoneCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "PhoneCountryCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experienceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExperienceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "UserExperienceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integerExt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IntegerExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JobTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LanguageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LocaleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measurementSystemPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MeasurementSystemPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "MeasurementSystem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "UserRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "TimeZoneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useHelperLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UseHelperLabels"));
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
