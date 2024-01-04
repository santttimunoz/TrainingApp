/**
 * ContactSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;

public class ContactSearchCriteria  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        The address of the contact.  Supercedes the separate fields of
 * City, State, and PostalCode.
     */ 
    private com.guidewire.ab.webservices.entity.Address Address;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Contact class, like Person, Company, and Venue.
     */ 
    private com.guidewire.ab.webservices.enumeration.Contact ContactSubtype;
    /** 
        First Name
     */ 
    private java.lang.String FirstName;
    /** 
        First name in kanji (used only for Japanese names)
     */ 
    private java.lang.String FirstNameKanji;
    /** 
        Keyword is the general term for Name (Companies and Places) and
 * LastName (for Persons)
     */ 
    private java.lang.String Keyword;
    /** 
        KeywordKanji is the general term for NameKanji (Companies and Places)
 * and LastNameKanji (for Persons)
     */ 
    private java.lang.String KeywordKanji;
    /** 
        Match type requirement
     */ 
    private com.guidewire.ab.webservices.enumeration.ContactMatchResultType MatchType;
    /** 
        Field matched against the OfficialIDValue of the OfficialID objects
 * associated with Contacts.
     */ 
    private java.lang.String OfficialId;
    /** 
        Matched against Contacts belonging to an Organization (such as
 * of person's employer) matching this name.
     */ 
    private java.lang.String OrganizationName;
    /** 
        Preferred Vendors
     */ 
    private java.lang.Boolean PreferredVendors;
    /** 
        The center for a proximity search. Ignored if location fields are
 * set on the Proximity Search Parameters.
     */ 
    private com.guidewire.ab.webservices.entity.Address ProximitySearchCenter;
    /** 
        The parameters for a proximity search.
     */ 
    private com.guidewire.ab.webservices.entity.ProximitySearchParameters ProximitySearchParameters;
    /** 
        External search type (external search only)
     */ 
    private com.guidewire.ab.webservices.enumeration.ContactSearchType SearchType;
    /** 
        Tax ID for the contact (SSN or EIN).
     */ 
    private java.lang.String TaxID;
    /** 
        The company's vendor type.
     */ 
    private com.guidewire.ab.webservices.enumeration.VendorType VendorType;

    public ContactSearchCriteria() {
    }

    public ContactSearchCriteria(
           com.guidewire.ab.webservices.entity.Address Address,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.enumeration.Contact ContactSubtype,
           java.lang.String FirstName,
           java.lang.String FirstNameKanji,
           java.lang.String Keyword,
           java.lang.String KeywordKanji,
           com.guidewire.ab.webservices.enumeration.ContactMatchResultType MatchType,
           java.lang.String OfficialId,
           java.lang.String OrganizationName,
           java.lang.Boolean PreferredVendors,
           com.guidewire.ab.webservices.entity.Address ProximitySearchCenter,
           com.guidewire.ab.webservices.entity.ProximitySearchParameters ProximitySearchParameters,
           com.guidewire.ab.webservices.enumeration.ContactSearchType SearchType,
           java.lang.String TaxID,
           com.guidewire.ab.webservices.enumeration.VendorType VendorType) {
           this.Address = Address;
           this.BeanVersion = BeanVersion;
           this.ContactSubtype = ContactSubtype;
           this.FirstName = FirstName;
           this.FirstNameKanji = FirstNameKanji;
           this.Keyword = Keyword;
           this.KeywordKanji = KeywordKanji;
           this.MatchType = MatchType;
           this.OfficialId = OfficialId;
           this.OrganizationName = OrganizationName;
           this.PreferredVendors = PreferredVendors;
           this.ProximitySearchCenter = ProximitySearchCenter;
           this.ProximitySearchParameters = ProximitySearchParameters;
           this.SearchType = SearchType;
           this.TaxID = TaxID;
           this.VendorType = VendorType;
    }


    /**
     *  The address of the contact.  Supercedes the separate fields of
 * City, State, and PostalCode.
     * 
     * @return Address The address of the contact.  Supercedes the separate fields of
 * City, State, and PostalCode.
     */
    public com.guidewire.ab.webservices.entity.Address getAddress() {
        return Address;
    }


    /**
     *  The address of the contact.  Supercedes the separate fields of
 * City, State, and PostalCode.
     * 
     * @param Address The address of the contact.  Supercedes the separate fields of
 * City, State, and PostalCode.
     */
    public void setAddress(com.guidewire.ab.webservices.entity.Address Address) {
        this.Address = Address;
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
     *  Contact class, like Person, Company, and Venue.
     * 
     * @return ContactSubtype Contact class, like Person, Company, and Venue.
     */
    public com.guidewire.ab.webservices.enumeration.Contact getContactSubtype() {
        return ContactSubtype;
    }


    /**
     *  Contact class, like Person, Company, and Venue.
     * 
     * @param ContactSubtype Contact class, like Person, Company, and Venue.
     */
    public void setContactSubtype(com.guidewire.ab.webservices.enumeration.Contact ContactSubtype) {
        this.ContactSubtype = ContactSubtype;
    }


    /**
     *  First Name
     * 
     * @return FirstName First Name
     */
    public java.lang.String getFirstName() {
        return FirstName;
    }


    /**
     *  First Name
     * 
     * @param FirstName First Name
     */
    public void setFirstName(java.lang.String FirstName) {
        this.FirstName = FirstName;
    }


    /**
     *  First name in kanji (used only for Japanese names)
     * 
     * @return FirstNameKanji First name in kanji (used only for Japanese names)
     */
    public java.lang.String getFirstNameKanji() {
        return FirstNameKanji;
    }


    /**
     *  First name in kanji (used only for Japanese names)
     * 
     * @param FirstNameKanji First name in kanji (used only for Japanese names)
     */
    public void setFirstNameKanji(java.lang.String FirstNameKanji) {
        this.FirstNameKanji = FirstNameKanji;
    }


    /**
     *  Keyword is the general term for Name (Companies and Places) and
 * LastName (for Persons)
     * 
     * @return Keyword Keyword is the general term for Name (Companies and Places) and
 * LastName (for Persons)
     */
    public java.lang.String getKeyword() {
        return Keyword;
    }


    /**
     *  Keyword is the general term for Name (Companies and Places) and
 * LastName (for Persons)
     * 
     * @param Keyword Keyword is the general term for Name (Companies and Places) and
 * LastName (for Persons)
     */
    public void setKeyword(java.lang.String Keyword) {
        this.Keyword = Keyword;
    }


    /**
     *  KeywordKanji is the general term for NameKanji (Companies and Places)
 * and LastNameKanji (for Persons)
     * 
     * @return KeywordKanji KeywordKanji is the general term for NameKanji (Companies and Places)
 * and LastNameKanji (for Persons)
     */
    public java.lang.String getKeywordKanji() {
        return KeywordKanji;
    }


    /**
     *  KeywordKanji is the general term for NameKanji (Companies and Places)
 * and LastNameKanji (for Persons)
     * 
     * @param KeywordKanji KeywordKanji is the general term for NameKanji (Companies and Places)
 * and LastNameKanji (for Persons)
     */
    public void setKeywordKanji(java.lang.String KeywordKanji) {
        this.KeywordKanji = KeywordKanji;
    }


    /**
     *  Match type requirement
     * 
     * @return MatchType Match type requirement
     */
    public com.guidewire.ab.webservices.enumeration.ContactMatchResultType getMatchType() {
        return MatchType;
    }


    /**
     *  Match type requirement
     * 
     * @param MatchType Match type requirement
     */
    public void setMatchType(com.guidewire.ab.webservices.enumeration.ContactMatchResultType MatchType) {
        this.MatchType = MatchType;
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
     *  Matched against Contacts belonging to an Organization (such as
 * of person's employer) matching this name.
     * 
     * @return OrganizationName Matched against Contacts belonging to an Organization (such as
 * of person's employer) matching this name.
     */
    public java.lang.String getOrganizationName() {
        return OrganizationName;
    }


    /**
     *  Matched against Contacts belonging to an Organization (such as
 * of person's employer) matching this name.
     * 
     * @param OrganizationName Matched against Contacts belonging to an Organization (such as
 * of person's employer) matching this name.
     */
    public void setOrganizationName(java.lang.String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }


    /**
     *  Preferred Vendors
     * 
     * @return PreferredVendors Preferred Vendors
     */
    public java.lang.Boolean getPreferredVendors() {
        return PreferredVendors;
    }


    /**
     *  Preferred Vendors
     * 
     * @param PreferredVendors Preferred Vendors
     */
    public void setPreferredVendors(java.lang.Boolean PreferredVendors) {
        this.PreferredVendors = PreferredVendors;
    }


    /**
     *  The center for a proximity search. Ignored if location fields are
 * set on the Proximity Search Parameters.
     * 
     * @return ProximitySearchCenter The center for a proximity search. Ignored if location fields are
 * set on the Proximity Search Parameters.
     */
    public com.guidewire.ab.webservices.entity.Address getProximitySearchCenter() {
        return ProximitySearchCenter;
    }


    /**
     *  The center for a proximity search. Ignored if location fields are
 * set on the Proximity Search Parameters.
     * 
     * @param ProximitySearchCenter The center for a proximity search. Ignored if location fields are
 * set on the Proximity Search Parameters.
     */
    public void setProximitySearchCenter(com.guidewire.ab.webservices.entity.Address ProximitySearchCenter) {
        this.ProximitySearchCenter = ProximitySearchCenter;
    }


    /**
     *  The parameters for a proximity search.
     * 
     * @return ProximitySearchParameters The parameters for a proximity search.
     */
    public com.guidewire.ab.webservices.entity.ProximitySearchParameters getProximitySearchParameters() {
        return ProximitySearchParameters;
    }


    /**
     *  The parameters for a proximity search.
     * 
     * @param ProximitySearchParameters The parameters for a proximity search.
     */
    public void setProximitySearchParameters(com.guidewire.ab.webservices.entity.ProximitySearchParameters ProximitySearchParameters) {
        this.ProximitySearchParameters = ProximitySearchParameters;
    }


    /**
     *  External search type (external search only)
     * 
     * @return SearchType External search type (external search only)
     */
    public com.guidewire.ab.webservices.enumeration.ContactSearchType getSearchType() {
        return SearchType;
    }


    /**
     *  External search type (external search only)
     * 
     * @param SearchType External search type (external search only)
     */
    public void setSearchType(com.guidewire.ab.webservices.enumeration.ContactSearchType SearchType) {
        this.SearchType = SearchType;
    }


    /**
     *  Tax ID for the contact (SSN or EIN).
     * 
     * @return TaxID Tax ID for the contact (SSN or EIN).
     */
    public java.lang.String getTaxID() {
        return TaxID;
    }


    /**
     *  Tax ID for the contact (SSN or EIN).
     * 
     * @param TaxID Tax ID for the contact (SSN or EIN).
     */
    public void setTaxID(java.lang.String TaxID) {
        this.TaxID = TaxID;
    }


    /**
     *  The company's vendor type.
     * 
     * @return VendorType The company's vendor type.
     */
    public com.guidewire.ab.webservices.enumeration.VendorType getVendorType() {
        return VendorType;
    }


    /**
     *  The company's vendor type.
     * 
     * @param VendorType The company's vendor type.
     */
    public void setVendorType(com.guidewire.ab.webservices.enumeration.VendorType VendorType) {
        this.VendorType = VendorType;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Address"));
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
        elemField.setFieldName("contactSubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactSubtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Contact"));
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
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordKanji");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KeywordKanji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MatchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactMatchResultType"));
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
        elemField.setFieldName("organizationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrganizationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredVendors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreferredVendors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proximitySearchCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProximitySearchCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proximitySearchParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProximitySearchParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ProximitySearchParameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SearchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactSearchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VendorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VendorType"));
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
