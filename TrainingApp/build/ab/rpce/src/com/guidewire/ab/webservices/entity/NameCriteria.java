/**
 * NameCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * A component used as part of a larger search criteria entity. Encapsulates
 * the information
 *         entered by the user to restrict the search to particular contact,
 * specified by some combination
 *         of name, tax ID and official ID. One NameCriteria entity will
 * be used for each field that needs to
 *         be restricted. For example if a search criteria was being
 * constructed to specify searches for
 *         an entity which had two different contact fields, then the
 * search criteria would likely
 *         contain two distinct NameCriteria components.
 */
public class NameCriteria  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        The company name, if searching for a company.
     */ 
    private java.lang.String CompanyName;
    /** 
        The company name, if searching for a company, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     */ 
    private java.lang.String CompanyNameKanji;
    /** 
        The first name, if searching for a person.
     */ 
    private java.lang.String FirstName;
    /** 
        The first name, if searching for a person, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     */ 
    private java.lang.String FirstNameKanji;
    /** 
        The last name, if searching for a person.
     */ 
    private java.lang.String LastName;
    /** 
        The last name, if searching for a person, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     */ 
    private java.lang.String LastNameKanji;
    /** 
        The last name or the first name.
     */ 
    private java.lang.String Name;
    /** 
        The last name or the first name in kanji.  Used only for Japanese
 * names and will be null otherwise.
     */ 
    private java.lang.String NameKanji;
    /** 
        Field matched against the OfficialIDValue of the OfficialID objects
 * associated with Contacts.
     */ 
    private java.lang.String OfficialId;
    /** 
        The contact's tax identification number.
     */ 
    private java.lang.String TaxId;

    public NameCriteria() {
    }

    public NameCriteria(
           java.lang.Integer BeanVersion,
           java.lang.String CompanyName,
           java.lang.String CompanyNameKanji,
           java.lang.String FirstName,
           java.lang.String FirstNameKanji,
           java.lang.String LastName,
           java.lang.String LastNameKanji,
           java.lang.String Name,
           java.lang.String NameKanji,
           java.lang.String OfficialId,
           java.lang.String TaxId) {
           this.BeanVersion = BeanVersion;
           this.CompanyName = CompanyName;
           this.CompanyNameKanji = CompanyNameKanji;
           this.FirstName = FirstName;
           this.FirstNameKanji = FirstNameKanji;
           this.LastName = LastName;
           this.LastNameKanji = LastNameKanji;
           this.Name = Name;
           this.NameKanji = NameKanji;
           this.OfficialId = OfficialId;
           this.TaxId = TaxId;
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
     *  The company name, if searching for a company.
     * 
     * @return CompanyName The company name, if searching for a company.
     */
    public java.lang.String getCompanyName() {
        return CompanyName;
    }


    /**
     *  The company name, if searching for a company.
     * 
     * @param CompanyName The company name, if searching for a company.
     */
    public void setCompanyName(java.lang.String CompanyName) {
        this.CompanyName = CompanyName;
    }


    /**
     *  The company name, if searching for a company, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     * 
     * @return CompanyNameKanji The company name, if searching for a company, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     */
    public java.lang.String getCompanyNameKanji() {
        return CompanyNameKanji;
    }


    /**
     *  The company name, if searching for a company, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     * 
     * @param CompanyNameKanji The company name, if searching for a company, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     */
    public void setCompanyNameKanji(java.lang.String CompanyNameKanji) {
        this.CompanyNameKanji = CompanyNameKanji;
    }


    /**
     *  The first name, if searching for a person.
     * 
     * @return FirstName The first name, if searching for a person.
     */
    public java.lang.String getFirstName() {
        return FirstName;
    }


    /**
     *  The first name, if searching for a person.
     * 
     * @param FirstName The first name, if searching for a person.
     */
    public void setFirstName(java.lang.String FirstName) {
        this.FirstName = FirstName;
    }


    /**
     *  The first name, if searching for a person, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     * 
     * @return FirstNameKanji The first name, if searching for a person, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     */
    public java.lang.String getFirstNameKanji() {
        return FirstNameKanji;
    }


    /**
     *  The first name, if searching for a person, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     * 
     * @param FirstNameKanji The first name, if searching for a person, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     */
    public void setFirstNameKanji(java.lang.String FirstNameKanji) {
        this.FirstNameKanji = FirstNameKanji;
    }


    /**
     *  The last name, if searching for a person.
     * 
     * @return LastName The last name, if searching for a person.
     */
    public java.lang.String getLastName() {
        return LastName;
    }


    /**
     *  The last name, if searching for a person.
     * 
     * @param LastName The last name, if searching for a person.
     */
    public void setLastName(java.lang.String LastName) {
        this.LastName = LastName;
    }


    /**
     *  The last name, if searching for a person, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     * 
     * @return LastNameKanji The last name, if searching for a person, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     */
    public java.lang.String getLastNameKanji() {
        return LastNameKanji;
    }


    /**
     *  The last name, if searching for a person, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     * 
     * @param LastNameKanji The last name, if searching for a person, in kanji.  Used only
 * for Japanese names and will be null otherwise.
     */
    public void setLastNameKanji(java.lang.String LastNameKanji) {
        this.LastNameKanji = LastNameKanji;
    }


    /**
     *  The last name or the first name.
     * 
     * @return Name The last name or the first name.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  The last name or the first name.
     * 
     * @param Name The last name or the first name.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  The last name or the first name in kanji.  Used only for Japanese
 * names and will be null otherwise.
     * 
     * @return NameKanji The last name or the first name in kanji.  Used only for Japanese
 * names and will be null otherwise.
     */
    public java.lang.String getNameKanji() {
        return NameKanji;
    }


    /**
     *  The last name or the first name in kanji.  Used only for Japanese
 * names and will be null otherwise.
     * 
     * @param NameKanji The last name or the first name in kanji.  Used only for Japanese
 * names and will be null otherwise.
     */
    public void setNameKanji(java.lang.String NameKanji) {
        this.NameKanji = NameKanji;
    }


    /**
     *  Field matched against the OfficialIDValue of the OfficialID objects
 * associated with Contacts.
     * 
     * @return OfficialId Field matched against the OfficialIDValue of the OfficialID objects
 * associated with Contacts.
     */
    public java.lang.String getOfficialId() {
        return OfficialId;
    }


    /**
     *  Field matched against the OfficialIDValue of the OfficialID objects
 * associated with Contacts.
     * 
     * @param OfficialId Field matched against the OfficialIDValue of the OfficialID objects
 * associated with Contacts.
     */
    public void setOfficialId(java.lang.String OfficialId) {
        this.OfficialId = OfficialId;
    }


    /**
     *  The contact's tax identification number.
     * 
     * @return TaxId The contact's tax identification number.
     */
    public java.lang.String getTaxId() {
        return TaxId;
    }


    /**
     *  The contact's tax identification number.
     * 
     * @param TaxId The contact's tax identification number.
     */
    public void setTaxId(java.lang.String TaxId) {
        this.TaxId = TaxId;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "NameCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beanVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeanVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyNameKanji");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompanyNameKanji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameKanji");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NameKanji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officialId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OfficialId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxId"));
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
