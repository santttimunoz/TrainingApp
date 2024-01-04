/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Represents a generic contact like a person or a business. The Contact
 * is a primary object in the
 *         ClaimCenter system that is used in the management of your
 * company's vendors and the
 *         participants in a Claim. Contact is an abstract supertype
 * with subtypes such as Person, Company, and Place.
 *         Guidewire provides an initial hierarchy of Contact types that
 * you can extend.
 *         From a Contact entity you can reach the expected Contact data
 * such as physical address, phone, and fax
 *         information. (In general, only the Primary Address is used
 * for location-based functionality like
 *         Assignment and Geocoding/Proximity Search.) Contact and its
 * subtypes can also contain management-related
 *         information such as social security number, tax ID, organization
 * type , and so forth.
 *         Within ClaimCenter, users create Contacts that are associated
 * only with a particular Claim. For example,
 *         an injured party is a typical claim contact. ClaimCenter does
 * not attempt to determine if a contact
 *         associated with one claim appears elsewhere on another claim.
 * Thus, any claim contact that users create,
 *         like an auto body shop, can be a duplicate of one or more
 * other claim contacts associated with different
 *         claims.
 *         If ClaimCenter is integrated with Guidewire's ContactManager
 * application, your users can create contacts
 *         and then access them centrally through the linking feature.Your
 * company can have both centrally
 *         managed contacts, such as a vendor business, and locally managed
 * contacts, such as an injured
 *         party.
 *         To support this behavior, ContactManager and ClaimCenter have
 * matching hierarchies of Contact
 *         entities, which they can keep synchronized. So, for example,
 * an extension made to a ClaimCenter Contact
 *         entity should also be made to a ContactManager ABContact entity.
 * See the Contact Management Guide
 *         for more information about the integration between ClaimCenter
 * and ContactManager.
 */
public abstract class Contact  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     */ 
    private java.lang.String AddressBookUID;
    /** 
        A status code to indicate whether this entity allows auto-sync
 * or not. Null means disallow.
     */ 
    private com.guidewire.ab.webservices.enumeration.AutoSync AutoSync;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        List of categories and their average scores, associated with this
 * Contact.
     */ 
    private com.guidewire.ab.webservices.entity.ContactCategoryScore[] CategoryScores;
    /** 
        Secondary addresses associated with the contact.
     */ 
    private com.guidewire.ab.webservices.entity.ContactAddress[] ContactAddresses;
    /** 
        Primary email address associated with the contact.
     */ 
    private java.lang.String EmailAddress1;
    /** 
        Secondary email address associated with the contact.
     */ 
    private java.lang.String EmailAddress2;
    /** 
        Fax number associated with the contact.
     */ 
    private java.lang.String FaxPhone;
    /** 
        Fax phone country.
     */ 
    private com.guidewire.ab.webservices.enumeration.PhoneCountryCode FaxPhoneCountry;
    /** 
        Fax phone extension.
     */ 
    private java.lang.String FaxPhoneExtension;
    /** 
        Home phone number associated with the contact.
     */ 
    private java.lang.String HomePhone;
    /** 
        Home phone country.
     */ 
    private com.guidewire.ab.webservices.enumeration.PhoneCountryCode HomePhoneCountry;
    /** 
        Home phone extension.
     */ 
    private java.lang.String HomePhoneExtension;
    /** 
        This contact's name.
     */ 
    private java.lang.String Name;
    /** 
        This contact's name in kanji (used only for Japanese names and
 * will be null otherwise)
     */ 
    private java.lang.String NameKanji;
    /** 
        Notes on this contact.
     */ 
    private java.lang.String Notes;
    /** 
        TaxIDs associated with this contact
     */ 
    private com.guidewire.ab.webservices.entity.OfficialID[] OfficialIDs;
    /** 
        Whether the vendor is a preferred vendor.
     */ 
    private java.lang.Boolean Preferred;
    /** 
        The contact's preferred currency.
     */ 
    private com.guidewire.ab.webservices.enumeration.Currency PreferredCurrency;
    /** 
        Primary address associated with the contact.
     */ 
    private com.guidewire.ab.webservices.entity.Address PrimaryAddress;
    /** 
        The account's preferred language
     */ 
    private com.guidewire.ab.webservices.enumeration.LanguageType PrimaryLanguage;
    /** 
        The account's preferred locale
     */ 
    private com.guidewire.ab.webservices.enumeration.LocaleType PrimaryLocale;
    /** 
        Primary phone number type for the contact.
     */ 
    private com.guidewire.ab.webservices.enumeration.PrimaryPhoneType PrimaryPhone;
    /** 
        Overall review Score for this Contact
     */ 
    private java.lang.Integer Score;
    /** 
        Contacts that point to this contact.
     */ 
    private com.guidewire.ab.webservices.entity.ContactContact[] SourceRelatedContacts;
    /** 
        List of ContactTags.
     */ 
    private com.guidewire.ab.webservices.entity.ContactTag[] Tags;
    /** 
        Contacts that this Contact points to.
     */ 
    private com.guidewire.ab.webservices.entity.ContactContact[] TargetRelatedContacts;
    /** 
        Tax ID for the contact (SSN or EIN).
     */ 
    private java.lang.String TaxID;
    /** 
        Status of the contact's tax ID; whether it is known or unknown.
     */ 
    private com.guidewire.ab.webservices.enumeration.TaxStatus TaxStatus;
    /** 
        Vendor number for the contact.
     */ 
    private java.lang.String VendorNumber;
    /** 
        The company's vendor type.
     */ 
    private com.guidewire.ab.webservices.enumeration.VendorType VendorType;
    /** 
        The contact's backup withholding rate, or null if backup withholding
 * is not required or is not known to be required.
     */ 
    private java.math.BigDecimal WithholdingRate;
    /** 
        Business phone number associated with the contact.
     */ 
    private java.lang.String WorkPhone;
    /** 
        Work phone country.
     */ 
    private com.guidewire.ab.webservices.enumeration.PhoneCountryCode WorkPhoneCountry;
    /** 
        Business phone extension.
     */ 
    private java.lang.String WorkPhoneExtension;

    public Contact() {
    }

    public Contact(
           java.lang.String AddressBookUID,
           com.guidewire.ab.webservices.enumeration.AutoSync AutoSync,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.ContactCategoryScore[] CategoryScores,
           com.guidewire.ab.webservices.entity.ContactAddress[] ContactAddresses,
           java.lang.String EmailAddress1,
           java.lang.String EmailAddress2,
           java.lang.String FaxPhone,
           com.guidewire.ab.webservices.enumeration.PhoneCountryCode FaxPhoneCountry,
           java.lang.String FaxPhoneExtension,
           java.lang.String HomePhone,
           com.guidewire.ab.webservices.enumeration.PhoneCountryCode HomePhoneCountry,
           java.lang.String HomePhoneExtension,
           java.lang.String Name,
           java.lang.String NameKanji,
           java.lang.String Notes,
           com.guidewire.ab.webservices.entity.OfficialID[] OfficialIDs,
           java.lang.Boolean Preferred,
           com.guidewire.ab.webservices.enumeration.Currency PreferredCurrency,
           com.guidewire.ab.webservices.entity.Address PrimaryAddress,
           com.guidewire.ab.webservices.enumeration.LanguageType PrimaryLanguage,
           com.guidewire.ab.webservices.enumeration.LocaleType PrimaryLocale,
           com.guidewire.ab.webservices.enumeration.PrimaryPhoneType PrimaryPhone,
           java.lang.Integer Score,
           com.guidewire.ab.webservices.entity.ContactContact[] SourceRelatedContacts,
           com.guidewire.ab.webservices.entity.ContactTag[] Tags,
           com.guidewire.ab.webservices.entity.ContactContact[] TargetRelatedContacts,
           java.lang.String TaxID,
           com.guidewire.ab.webservices.enumeration.TaxStatus TaxStatus,
           java.lang.String VendorNumber,
           com.guidewire.ab.webservices.enumeration.VendorType VendorType,
           java.math.BigDecimal WithholdingRate,
           java.lang.String WorkPhone,
           com.guidewire.ab.webservices.enumeration.PhoneCountryCode WorkPhoneCountry,
           java.lang.String WorkPhoneExtension) {
           this.AddressBookUID = AddressBookUID;
           this.AutoSync = AutoSync;
           this.BeanVersion = BeanVersion;
           this.CategoryScores = CategoryScores;
           this.ContactAddresses = ContactAddresses;
           this.EmailAddress1 = EmailAddress1;
           this.EmailAddress2 = EmailAddress2;
           this.FaxPhone = FaxPhone;
           this.FaxPhoneCountry = FaxPhoneCountry;
           this.FaxPhoneExtension = FaxPhoneExtension;
           this.HomePhone = HomePhone;
           this.HomePhoneCountry = HomePhoneCountry;
           this.HomePhoneExtension = HomePhoneExtension;
           this.Name = Name;
           this.NameKanji = NameKanji;
           this.Notes = Notes;
           this.OfficialIDs = OfficialIDs;
           this.Preferred = Preferred;
           this.PreferredCurrency = PreferredCurrency;
           this.PrimaryAddress = PrimaryAddress;
           this.PrimaryLanguage = PrimaryLanguage;
           this.PrimaryLocale = PrimaryLocale;
           this.PrimaryPhone = PrimaryPhone;
           this.Score = Score;
           this.SourceRelatedContacts = SourceRelatedContacts;
           this.Tags = Tags;
           this.TargetRelatedContacts = TargetRelatedContacts;
           this.TaxID = TaxID;
           this.TaxStatus = TaxStatus;
           this.VendorNumber = VendorNumber;
           this.VendorType = VendorType;
           this.WithholdingRate = WithholdingRate;
           this.WorkPhone = WorkPhone;
           this.WorkPhoneCountry = WorkPhoneCountry;
           this.WorkPhoneExtension = WorkPhoneExtension;
    }


    /**
     *  Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     * 
     * @return AddressBookUID Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     */
    public java.lang.String getAddressBookUID() {
        return AddressBookUID;
    }


    /**
     *  Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     * 
     * @param AddressBookUID Represents the ID of the associated object in Address Book.  Null
 * if the object is not linked to Address Book.
     */
    public void setAddressBookUID(java.lang.String AddressBookUID) {
        this.AddressBookUID = AddressBookUID;
    }


    /**
     *  A status code to indicate whether this entity allows auto-sync
 * or not. Null means disallow.
     * 
     * @return AutoSync A status code to indicate whether this entity allows auto-sync
 * or not. Null means disallow.
     */
    public com.guidewire.ab.webservices.enumeration.AutoSync getAutoSync() {
        return AutoSync;
    }


    /**
     *  A status code to indicate whether this entity allows auto-sync
 * or not. Null means disallow.
     * 
     * @param AutoSync A status code to indicate whether this entity allows auto-sync
 * or not. Null means disallow.
     */
    public void setAutoSync(com.guidewire.ab.webservices.enumeration.AutoSync AutoSync) {
        this.AutoSync = AutoSync;
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
     *  List of categories and their average scores, associated with this
 * Contact.
     * 
     * @return CategoryScores List of categories and their average scores, associated with this
 * Contact.
     */
    public com.guidewire.ab.webservices.entity.ContactCategoryScore[] getCategoryScores() {
        return CategoryScores;
    }


    /**
     *  List of categories and their average scores, associated with this
 * Contact.
     * 
     * @param CategoryScores List of categories and their average scores, associated with this
 * Contact.
     */
    public void setCategoryScores(com.guidewire.ab.webservices.entity.ContactCategoryScore[] CategoryScores) {
        this.CategoryScores = CategoryScores;
    }


    /**
     *  Secondary addresses associated with the contact.
     * 
     * @return ContactAddresses Secondary addresses associated with the contact.
     */
    public com.guidewire.ab.webservices.entity.ContactAddress[] getContactAddresses() {
        return ContactAddresses;
    }


    /**
     *  Secondary addresses associated with the contact.
     * 
     * @param ContactAddresses Secondary addresses associated with the contact.
     */
    public void setContactAddresses(com.guidewire.ab.webservices.entity.ContactAddress[] ContactAddresses) {
        this.ContactAddresses = ContactAddresses;
    }


    /**
     *  Primary email address associated with the contact.
     * 
     * @return EmailAddress1 Primary email address associated with the contact.
     */
    public java.lang.String getEmailAddress1() {
        return EmailAddress1;
    }


    /**
     *  Primary email address associated with the contact.
     * 
     * @param EmailAddress1 Primary email address associated with the contact.
     */
    public void setEmailAddress1(java.lang.String EmailAddress1) {
        this.EmailAddress1 = EmailAddress1;
    }


    /**
     *  Secondary email address associated with the contact.
     * 
     * @return EmailAddress2 Secondary email address associated with the contact.
     */
    public java.lang.String getEmailAddress2() {
        return EmailAddress2;
    }


    /**
     *  Secondary email address associated with the contact.
     * 
     * @param EmailAddress2 Secondary email address associated with the contact.
     */
    public void setEmailAddress2(java.lang.String EmailAddress2) {
        this.EmailAddress2 = EmailAddress2;
    }


    /**
     *  Fax number associated with the contact.
     * 
     * @return FaxPhone Fax number associated with the contact.
     */
    public java.lang.String getFaxPhone() {
        return FaxPhone;
    }


    /**
     *  Fax number associated with the contact.
     * 
     * @param FaxPhone Fax number associated with the contact.
     */
    public void setFaxPhone(java.lang.String FaxPhone) {
        this.FaxPhone = FaxPhone;
    }


    /**
     *  Fax phone country.
     * 
     * @return FaxPhoneCountry Fax phone country.
     */
    public com.guidewire.ab.webservices.enumeration.PhoneCountryCode getFaxPhoneCountry() {
        return FaxPhoneCountry;
    }


    /**
     *  Fax phone country.
     * 
     * @param FaxPhoneCountry Fax phone country.
     */
    public void setFaxPhoneCountry(com.guidewire.ab.webservices.enumeration.PhoneCountryCode FaxPhoneCountry) {
        this.FaxPhoneCountry = FaxPhoneCountry;
    }


    /**
     *  Fax phone extension.
     * 
     * @return FaxPhoneExtension Fax phone extension.
     */
    public java.lang.String getFaxPhoneExtension() {
        return FaxPhoneExtension;
    }


    /**
     *  Fax phone extension.
     * 
     * @param FaxPhoneExtension Fax phone extension.
     */
    public void setFaxPhoneExtension(java.lang.String FaxPhoneExtension) {
        this.FaxPhoneExtension = FaxPhoneExtension;
    }


    /**
     *  Home phone number associated with the contact.
     * 
     * @return HomePhone Home phone number associated with the contact.
     */
    public java.lang.String getHomePhone() {
        return HomePhone;
    }


    /**
     *  Home phone number associated with the contact.
     * 
     * @param HomePhone Home phone number associated with the contact.
     */
    public void setHomePhone(java.lang.String HomePhone) {
        this.HomePhone = HomePhone;
    }


    /**
     *  Home phone country.
     * 
     * @return HomePhoneCountry Home phone country.
     */
    public com.guidewire.ab.webservices.enumeration.PhoneCountryCode getHomePhoneCountry() {
        return HomePhoneCountry;
    }


    /**
     *  Home phone country.
     * 
     * @param HomePhoneCountry Home phone country.
     */
    public void setHomePhoneCountry(com.guidewire.ab.webservices.enumeration.PhoneCountryCode HomePhoneCountry) {
        this.HomePhoneCountry = HomePhoneCountry;
    }


    /**
     *  Home phone extension.
     * 
     * @return HomePhoneExtension Home phone extension.
     */
    public java.lang.String getHomePhoneExtension() {
        return HomePhoneExtension;
    }


    /**
     *  Home phone extension.
     * 
     * @param HomePhoneExtension Home phone extension.
     */
    public void setHomePhoneExtension(java.lang.String HomePhoneExtension) {
        this.HomePhoneExtension = HomePhoneExtension;
    }


    /**
     *  This contact's name.
     * 
     * @return Name This contact's name.
     */
    public java.lang.String getName() {
        return Name;
    }


    /**
     *  This contact's name.
     * 
     * @param Name This contact's name.
     */
    public void setName(java.lang.String Name) {
        this.Name = Name;
    }


    /**
     *  This contact's name in kanji (used only for Japanese names and
 * will be null otherwise)
     * 
     * @return NameKanji This contact's name in kanji (used only for Japanese names and
 * will be null otherwise)
     */
    public java.lang.String getNameKanji() {
        return NameKanji;
    }


    /**
     *  This contact's name in kanji (used only for Japanese names and
 * will be null otherwise)
     * 
     * @param NameKanji This contact's name in kanji (used only for Japanese names and
 * will be null otherwise)
     */
    public void setNameKanji(java.lang.String NameKanji) {
        this.NameKanji = NameKanji;
    }


    /**
     *  Notes on this contact.
     * 
     * @return Notes Notes on this contact.
     */
    public java.lang.String getNotes() {
        return Notes;
    }


    /**
     *  Notes on this contact.
     * 
     * @param Notes Notes on this contact.
     */
    public void setNotes(java.lang.String Notes) {
        this.Notes = Notes;
    }


    /**
     *  TaxIDs associated with this contact
     * 
     * @return OfficialIDs TaxIDs associated with this contact
     */
    public com.guidewire.ab.webservices.entity.OfficialID[] getOfficialIDs() {
        return OfficialIDs;
    }


    /**
     *  TaxIDs associated with this contact
     * 
     * @param OfficialIDs TaxIDs associated with this contact
     */
    public void setOfficialIDs(com.guidewire.ab.webservices.entity.OfficialID[] OfficialIDs) {
        this.OfficialIDs = OfficialIDs;
    }


    /**
     *  Whether the vendor is a preferred vendor.
     * 
     * @return Preferred Whether the vendor is a preferred vendor.
     */
    public java.lang.Boolean getPreferred() {
        return Preferred;
    }


    /**
     *  Whether the vendor is a preferred vendor.
     * 
     * @param Preferred Whether the vendor is a preferred vendor.
     */
    public void setPreferred(java.lang.Boolean Preferred) {
        this.Preferred = Preferred;
    }


    /**
     *  The contact's preferred currency.
     * 
     * @return PreferredCurrency The contact's preferred currency.
     */
    public com.guidewire.ab.webservices.enumeration.Currency getPreferredCurrency() {
        return PreferredCurrency;
    }


    /**
     *  The contact's preferred currency.
     * 
     * @param PreferredCurrency The contact's preferred currency.
     */
    public void setPreferredCurrency(com.guidewire.ab.webservices.enumeration.Currency PreferredCurrency) {
        this.PreferredCurrency = PreferredCurrency;
    }


    /**
     *  Primary address associated with the contact.
     * 
     * @return PrimaryAddress Primary address associated with the contact.
     */
    public com.guidewire.ab.webservices.entity.Address getPrimaryAddress() {
        return PrimaryAddress;
    }


    /**
     *  Primary address associated with the contact.
     * 
     * @param PrimaryAddress Primary address associated with the contact.
     */
    public void setPrimaryAddress(com.guidewire.ab.webservices.entity.Address PrimaryAddress) {
        this.PrimaryAddress = PrimaryAddress;
    }


    /**
     *  The account's preferred language
     * 
     * @return PrimaryLanguage The account's preferred language
     */
    public com.guidewire.ab.webservices.enumeration.LanguageType getPrimaryLanguage() {
        return PrimaryLanguage;
    }


    /**
     *  The account's preferred language
     * 
     * @param PrimaryLanguage The account's preferred language
     */
    public void setPrimaryLanguage(com.guidewire.ab.webservices.enumeration.LanguageType PrimaryLanguage) {
        this.PrimaryLanguage = PrimaryLanguage;
    }


    /**
     *  The account's preferred locale
     * 
     * @return PrimaryLocale The account's preferred locale
     */
    public com.guidewire.ab.webservices.enumeration.LocaleType getPrimaryLocale() {
        return PrimaryLocale;
    }


    /**
     *  The account's preferred locale
     * 
     * @param PrimaryLocale The account's preferred locale
     */
    public void setPrimaryLocale(com.guidewire.ab.webservices.enumeration.LocaleType PrimaryLocale) {
        this.PrimaryLocale = PrimaryLocale;
    }


    /**
     *  Primary phone number type for the contact.
     * 
     * @return PrimaryPhone Primary phone number type for the contact.
     */
    public com.guidewire.ab.webservices.enumeration.PrimaryPhoneType getPrimaryPhone() {
        return PrimaryPhone;
    }


    /**
     *  Primary phone number type for the contact.
     * 
     * @param PrimaryPhone Primary phone number type for the contact.
     */
    public void setPrimaryPhone(com.guidewire.ab.webservices.enumeration.PrimaryPhoneType PrimaryPhone) {
        this.PrimaryPhone = PrimaryPhone;
    }


    /**
     *  Overall review Score for this Contact
     * 
     * @return Score Overall review Score for this Contact
     */
    public java.lang.Integer getScore() {
        return Score;
    }


    /**
     *  Overall review Score for this Contact
     * 
     * @param Score Overall review Score for this Contact
     */
    public void setScore(java.lang.Integer Score) {
        this.Score = Score;
    }


    /**
     *  Contacts that point to this contact.
     * 
     * @return SourceRelatedContacts Contacts that point to this contact.
     */
    public com.guidewire.ab.webservices.entity.ContactContact[] getSourceRelatedContacts() {
        return SourceRelatedContacts;
    }


    /**
     *  Contacts that point to this contact.
     * 
     * @param SourceRelatedContacts Contacts that point to this contact.
     */
    public void setSourceRelatedContacts(com.guidewire.ab.webservices.entity.ContactContact[] SourceRelatedContacts) {
        this.SourceRelatedContacts = SourceRelatedContacts;
    }


    /**
     *  List of ContactTags.
     * 
     * @return Tags List of ContactTags.
     */
    public com.guidewire.ab.webservices.entity.ContactTag[] getTags() {
        return Tags;
    }


    /**
     *  List of ContactTags.
     * 
     * @param Tags List of ContactTags.
     */
    public void setTags(com.guidewire.ab.webservices.entity.ContactTag[] Tags) {
        this.Tags = Tags;
    }


    /**
     *  Contacts that this Contact points to.
     * 
     * @return TargetRelatedContacts Contacts that this Contact points to.
     */
    public com.guidewire.ab.webservices.entity.ContactContact[] getTargetRelatedContacts() {
        return TargetRelatedContacts;
    }


    /**
     *  Contacts that this Contact points to.
     * 
     * @param TargetRelatedContacts Contacts that this Contact points to.
     */
    public void setTargetRelatedContacts(com.guidewire.ab.webservices.entity.ContactContact[] TargetRelatedContacts) {
        this.TargetRelatedContacts = TargetRelatedContacts;
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
     *  Status of the contact's tax ID; whether it is known or unknown.
     * 
     * @return TaxStatus Status of the contact's tax ID; whether it is known or unknown.
     */
    public com.guidewire.ab.webservices.enumeration.TaxStatus getTaxStatus() {
        return TaxStatus;
    }


    /**
     *  Status of the contact's tax ID; whether it is known or unknown.
     * 
     * @param TaxStatus Status of the contact's tax ID; whether it is known or unknown.
     */
    public void setTaxStatus(com.guidewire.ab.webservices.enumeration.TaxStatus TaxStatus) {
        this.TaxStatus = TaxStatus;
    }


    /**
     *  Vendor number for the contact.
     * 
     * @return VendorNumber Vendor number for the contact.
     */
    public java.lang.String getVendorNumber() {
        return VendorNumber;
    }


    /**
     *  Vendor number for the contact.
     * 
     * @param VendorNumber Vendor number for the contact.
     */
    public void setVendorNumber(java.lang.String VendorNumber) {
        this.VendorNumber = VendorNumber;
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


    /**
     *  The contact's backup withholding rate, or null if backup withholding
 * is not required or is not known to be required.
     * 
     * @return WithholdingRate The contact's backup withholding rate, or null if backup withholding
 * is not required or is not known to be required.
     */
    public java.math.BigDecimal getWithholdingRate() {
        return WithholdingRate;
    }


    /**
     *  The contact's backup withholding rate, or null if backup withholding
 * is not required or is not known to be required.
     * 
     * @param WithholdingRate The contact's backup withholding rate, or null if backup withholding
 * is not required or is not known to be required.
     */
    public void setWithholdingRate(java.math.BigDecimal WithholdingRate) {
        this.WithholdingRate = WithholdingRate;
    }


    /**
     *  Business phone number associated with the contact.
     * 
     * @return WorkPhone Business phone number associated with the contact.
     */
    public java.lang.String getWorkPhone() {
        return WorkPhone;
    }


    /**
     *  Business phone number associated with the contact.
     * 
     * @param WorkPhone Business phone number associated with the contact.
     */
    public void setWorkPhone(java.lang.String WorkPhone) {
        this.WorkPhone = WorkPhone;
    }


    /**
     *  Work phone country.
     * 
     * @return WorkPhoneCountry Work phone country.
     */
    public com.guidewire.ab.webservices.enumeration.PhoneCountryCode getWorkPhoneCountry() {
        return WorkPhoneCountry;
    }


    /**
     *  Work phone country.
     * 
     * @param WorkPhoneCountry Work phone country.
     */
    public void setWorkPhoneCountry(com.guidewire.ab.webservices.enumeration.PhoneCountryCode WorkPhoneCountry) {
        this.WorkPhoneCountry = WorkPhoneCountry;
    }


    /**
     *  Business phone extension.
     * 
     * @return WorkPhoneExtension Business phone extension.
     */
    public java.lang.String getWorkPhoneExtension() {
        return WorkPhoneExtension;
    }


    /**
     *  Business phone extension.
     * 
     * @param WorkPhoneExtension Business phone extension.
     */
    public void setWorkPhoneExtension(java.lang.String WorkPhoneExtension) {
        this.WorkPhoneExtension = WorkPhoneExtension;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Contact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressBookUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressBookUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoSync");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoSync"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "AutoSync"));
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
        elemField.setFieldName("categoryScores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CategoryScores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactCategoryScore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmailAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmailAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FaxPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxPhoneCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FaxPhoneCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "PhoneCountryCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxPhoneExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FaxPhoneExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HomePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhoneCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HomePhoneCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "PhoneCountryCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhoneExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HomePhoneExtension"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officialIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OfficialIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "OfficialID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferred");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Preferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreferredCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "Currency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaryLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LanguageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaryLocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LocaleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaryPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "PrimaryPhoneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceRelatedContacts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceRelatedContacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactTag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetRelatedContacts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetRelatedContacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactContact"));
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
        elemField.setFieldName("taxStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "TaxStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VendorNumber"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withholdingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WithholdingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhoneCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkPhoneCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "PhoneCountryCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhoneExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkPhoneExtension"));
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
