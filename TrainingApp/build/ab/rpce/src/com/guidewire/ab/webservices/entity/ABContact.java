/**
 * ABContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Feb 24, 2009 (02:51:19 PST) WSDL2Java emitter.
 */

package com.guidewire.ab.webservices.entity;


/**
 * Generic contact (either a person or a company).
 */
public abstract class ABContact  extends com.guidewire.ab.webservices.entity.GWObject  implements java.io.Serializable {
    /** 
        Array of ABContactSpecialistServices.
     */ 
    private com.guidewire.ab.webservices.entity.ABContactSpecialistService[] ABContactSpecialistServices;
    /** 
        Assigned user
     */ 
    private com.guidewire.ab.webservices.entity.User AssignedUser;
    /** 
        Bank accounts
     */ 
    private com.guidewire.ab.webservices.entity.BankAccount[] BankAccounts;
    /** 
        Auto-incremented object version
     */ 
    private java.lang.Integer BeanVersion;
    /** 
        Buildings
     */ 
    private com.guidewire.ab.webservices.entity.Building_Ext[] Buildings_Ext;
    /** 
        List of categories and their scores, associated with this Review.
     */ 
    private com.guidewire.ab.webservices.entity.ABContactCategoryScore[] CategoryScores;
    /** 
        Secondary addresses associated with the contact.
     */ 
    private com.guidewire.ab.webservices.entity.ABContactAddress[] ContactAddresses;
    /** 
        Notes
     */ 
    private com.guidewire.ab.webservices.entity.ContactNote[] ContactNotes;
    /** 
     */ 
    private com.guidewire.ab.webservices.enumeration.ContactTier ContactTier;
    /** 
        Creation status of this contact
     */ 
    private com.guidewire.ab.webservices.enumeration.ContactCreationApprovalStatus CreateStatus;
    /** 
        Electronic Funds Transfer data for the contact
     */ 
    private com.guidewire.ab.webservices.entity.EFTData[] EFTRecords;
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
        Financial summary for contact (if contact holds one or more policies)
     */ 
    private com.guidewire.ab.webservices.entity.FinancialSummary FinancialSummary;
    /** 
        Flag entries
     */ 
    private com.guidewire.ab.webservices.entity.FlagEntry[] FlagEntries;
    /** 
        History entries
     */ 
    private com.guidewire.ab.webservices.entity.HistoryEntry[] HistoryEntries;
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
        Has this vendor contact been recommended to external service evaluation
 * companies?
     */ 
    private java.lang.Boolean IsVendorRecommended;
    /** 
        Keyword is the general term for Name (Companies and Places) and
 * LastName (for Persons)
     */ 
    private java.lang.String Keyword;
    /** 
        KeywordKanji is the general term for the Kanji Name (Companies
 * and Places) and LastName (for Persons).  Used only for Japanese names
 * and will be null otherwise.
     */ 
    private java.lang.String KeywordKanji;
    /** 
        Date the last legal case report was received
     */ 
    private java.util.Calendar LastLegalCaseReportDate;
    /** 
        Status of legal case reports
     */ 
    private com.guidewire.ab.webservices.enumeration.LegalCaseReportStatus LegalCaseReportStatus;
    /** 
        Legal cases
     */ 
    private com.guidewire.ab.webservices.entity.LegalCase[] LegalCases;
    /** 
        Represents the ID used by client applications to link with the
 * Address Book.
     */ 
    private java.lang.String LinkID;
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
        Whether the vendor is a preferred vendor.
     */ 
    private java.lang.Boolean Preferred;
    /** 
        The contact's preferred currency.
     */ 
    private com.guidewire.ab.webservices.enumeration.Currency PreferredCurrency;
    /** 
        Does this contact prefer to be contacted via email
     */ 
    private java.lang.Boolean PrefersContactByEmail;
    /** 
        Primary address.
     */ 
    private com.guidewire.ab.webservices.entity.Address PrimaryAddress;
    /** 
        Primary phone number type for the contact.
     */ 
    private com.guidewire.ab.webservices.enumeration.PrimaryPhoneType PrimaryPhone;
    /** 
        Overall review Score for this Contact
     */ 
    private java.lang.Integer Score;
    /** 
        List of ABContactTags.
     */ 
    private com.guidewire.ab.webservices.entity.ABContactTag[] Tags;
    /** 
        Tax ID for the contact (SSN or EIN).
     */ 
    private java.lang.String TaxID;
    /** 
        Status of the contact's tax ID; whether it is known or unknown.
     */ 
    private com.guidewire.ab.webservices.enumeration.TaxStatus TaxStatus;
    /** 
        Flag indicating the score needs to be updated because of new or
 * deleted ReviewSummaries.
     */ 
    private java.lang.Boolean UpdateScore;
    /** 
        The availability of a vendor.
     */ 
    private com.guidewire.ab.webservices.enumeration.VendorAvailabilityType VendorAvailability;
    /** 
        Vendor evaluations
     */ 
    private com.guidewire.ab.webservices.entity.VendorEvaluation[] VendorEvaluations;
    /** 
        Vendor number for the contact.
     */ 
    private java.lang.String VendorNumber;
    /** 
        ID for profile created by external service evaluation companies
     */ 
    private java.lang.String VendorProfileCode;
    /** 
        The company's vendor type.
     */ 
    private com.guidewire.ab.webservices.enumeration.VendorType VendorType;
    /** 
        Message decribing a vendor's unavailability.
     */ 
    private java.lang.String VendorUnavailableMessage;
    /** 
        Has W-9 form been received
     */ 
    private java.lang.Boolean W9Received;
    /** 
        W-9 form received date
     */ 
    private java.util.Calendar W9ReceivedDate;
    /** 
        W-9 valid start date
     */ 
    private java.util.Calendar W9ValidFrom;
    /** 
        W-9 valid to date
     */ 
    private java.util.Calendar W9ValidTo;
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

    public ABContact() {
    }

    public ABContact(
           com.guidewire.ab.webservices.entity.ABContactSpecialistService[] ABContactSpecialistServices,
           com.guidewire.ab.webservices.entity.User AssignedUser,
           com.guidewire.ab.webservices.entity.BankAccount[] BankAccounts,
           java.lang.Integer BeanVersion,
           com.guidewire.ab.webservices.entity.Building_Ext[] Buildings_Ext,
           com.guidewire.ab.webservices.entity.ABContactCategoryScore[] CategoryScores,
           com.guidewire.ab.webservices.entity.ABContactAddress[] ContactAddresses,
           com.guidewire.ab.webservices.entity.ContactNote[] ContactNotes,
           com.guidewire.ab.webservices.enumeration.ContactTier ContactTier,
           com.guidewire.ab.webservices.enumeration.ContactCreationApprovalStatus CreateStatus,
           com.guidewire.ab.webservices.entity.EFTData[] EFTRecords,
           java.lang.String EmailAddress1,
           java.lang.String EmailAddress2,
           java.lang.String FaxPhone,
           com.guidewire.ab.webservices.enumeration.PhoneCountryCode FaxPhoneCountry,
           java.lang.String FaxPhoneExtension,
           com.guidewire.ab.webservices.entity.FinancialSummary FinancialSummary,
           com.guidewire.ab.webservices.entity.FlagEntry[] FlagEntries,
           com.guidewire.ab.webservices.entity.HistoryEntry[] HistoryEntries,
           java.lang.String HomePhone,
           com.guidewire.ab.webservices.enumeration.PhoneCountryCode HomePhoneCountry,
           java.lang.String HomePhoneExtension,
           java.lang.Boolean IsVendorRecommended,
           java.lang.String Keyword,
           java.lang.String KeywordKanji,
           java.util.Calendar LastLegalCaseReportDate,
           com.guidewire.ab.webservices.enumeration.LegalCaseReportStatus LegalCaseReportStatus,
           com.guidewire.ab.webservices.entity.LegalCase[] LegalCases,
           java.lang.String LinkID,
           java.lang.String Name,
           java.lang.String NameKanji,
           java.lang.String Notes,
           java.lang.Boolean Preferred,
           com.guidewire.ab.webservices.enumeration.Currency PreferredCurrency,
           java.lang.Boolean PrefersContactByEmail,
           com.guidewire.ab.webservices.entity.Address PrimaryAddress,
           com.guidewire.ab.webservices.enumeration.PrimaryPhoneType PrimaryPhone,
           java.lang.Integer Score,
           com.guidewire.ab.webservices.entity.ABContactTag[] Tags,
           java.lang.String TaxID,
           com.guidewire.ab.webservices.enumeration.TaxStatus TaxStatus,
           java.lang.Boolean UpdateScore,
           com.guidewire.ab.webservices.enumeration.VendorAvailabilityType VendorAvailability,
           com.guidewire.ab.webservices.entity.VendorEvaluation[] VendorEvaluations,
           java.lang.String VendorNumber,
           java.lang.String VendorProfileCode,
           com.guidewire.ab.webservices.enumeration.VendorType VendorType,
           java.lang.String VendorUnavailableMessage,
           java.lang.Boolean W9Received,
           java.util.Calendar W9ReceivedDate,
           java.util.Calendar W9ValidFrom,
           java.util.Calendar W9ValidTo,
           java.math.BigDecimal WithholdingRate,
           java.lang.String WorkPhone,
           com.guidewire.ab.webservices.enumeration.PhoneCountryCode WorkPhoneCountry,
           java.lang.String WorkPhoneExtension) {
           this.ABContactSpecialistServices = ABContactSpecialistServices;
           this.AssignedUser = AssignedUser;
           this.BankAccounts = BankAccounts;
           this.BeanVersion = BeanVersion;
           this.Buildings_Ext = Buildings_Ext;
           this.CategoryScores = CategoryScores;
           this.ContactAddresses = ContactAddresses;
           this.ContactNotes = ContactNotes;
           this.ContactTier = ContactTier;
           this.CreateStatus = CreateStatus;
           this.EFTRecords = EFTRecords;
           this.EmailAddress1 = EmailAddress1;
           this.EmailAddress2 = EmailAddress2;
           this.FaxPhone = FaxPhone;
           this.FaxPhoneCountry = FaxPhoneCountry;
           this.FaxPhoneExtension = FaxPhoneExtension;
           this.FinancialSummary = FinancialSummary;
           this.FlagEntries = FlagEntries;
           this.HistoryEntries = HistoryEntries;
           this.HomePhone = HomePhone;
           this.HomePhoneCountry = HomePhoneCountry;
           this.HomePhoneExtension = HomePhoneExtension;
           this.IsVendorRecommended = IsVendorRecommended;
           this.Keyword = Keyword;
           this.KeywordKanji = KeywordKanji;
           this.LastLegalCaseReportDate = LastLegalCaseReportDate;
           this.LegalCaseReportStatus = LegalCaseReportStatus;
           this.LegalCases = LegalCases;
           this.LinkID = LinkID;
           this.Name = Name;
           this.NameKanji = NameKanji;
           this.Notes = Notes;
           this.Preferred = Preferred;
           this.PreferredCurrency = PreferredCurrency;
           this.PrefersContactByEmail = PrefersContactByEmail;
           this.PrimaryAddress = PrimaryAddress;
           this.PrimaryPhone = PrimaryPhone;
           this.Score = Score;
           this.Tags = Tags;
           this.TaxID = TaxID;
           this.TaxStatus = TaxStatus;
           this.UpdateScore = UpdateScore;
           this.VendorAvailability = VendorAvailability;
           this.VendorEvaluations = VendorEvaluations;
           this.VendorNumber = VendorNumber;
           this.VendorProfileCode = VendorProfileCode;
           this.VendorType = VendorType;
           this.VendorUnavailableMessage = VendorUnavailableMessage;
           this.W9Received = W9Received;
           this.W9ReceivedDate = W9ReceivedDate;
           this.W9ValidFrom = W9ValidFrom;
           this.W9ValidTo = W9ValidTo;
           this.WithholdingRate = WithholdingRate;
           this.WorkPhone = WorkPhone;
           this.WorkPhoneCountry = WorkPhoneCountry;
           this.WorkPhoneExtension = WorkPhoneExtension;
    }


    /**
     *  Array of ABContactSpecialistServices.
     * 
     * @return ABContactSpecialistServices Array of ABContactSpecialistServices.
     */
    public com.guidewire.ab.webservices.entity.ABContactSpecialistService[] getABContactSpecialistServices() {
        return ABContactSpecialistServices;
    }


    /**
     *  Array of ABContactSpecialistServices.
     * 
     * @param ABContactSpecialistServices Array of ABContactSpecialistServices.
     */
    public void setABContactSpecialistServices(com.guidewire.ab.webservices.entity.ABContactSpecialistService[] ABContactSpecialistServices) {
        this.ABContactSpecialistServices = ABContactSpecialistServices;
    }


    /**
     *  Assigned user
     * 
     * @return AssignedUser Assigned user
     */
    public com.guidewire.ab.webservices.entity.User getAssignedUser() {
        return AssignedUser;
    }


    /**
     *  Assigned user
     * 
     * @param AssignedUser Assigned user
     */
    public void setAssignedUser(com.guidewire.ab.webservices.entity.User AssignedUser) {
        this.AssignedUser = AssignedUser;
    }


    /**
     *  Bank accounts
     * 
     * @return BankAccounts Bank accounts
     */
    public com.guidewire.ab.webservices.entity.BankAccount[] getBankAccounts() {
        return BankAccounts;
    }


    /**
     *  Bank accounts
     * 
     * @param BankAccounts Bank accounts
     */
    public void setBankAccounts(com.guidewire.ab.webservices.entity.BankAccount[] BankAccounts) {
        this.BankAccounts = BankAccounts;
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
     *  Buildings
     * 
     * @return Buildings_Ext Buildings
     */
    public com.guidewire.ab.webservices.entity.Building_Ext[] getBuildings_Ext() {
        return Buildings_Ext;
    }


    /**
     *  Buildings
     * 
     * @param Buildings_Ext Buildings
     */
    public void setBuildings_Ext(com.guidewire.ab.webservices.entity.Building_Ext[] Buildings_Ext) {
        this.Buildings_Ext = Buildings_Ext;
    }


    /**
     *  List of categories and their scores, associated with this Review.
     * 
     * @return CategoryScores List of categories and their scores, associated with this Review.
     */
    public com.guidewire.ab.webservices.entity.ABContactCategoryScore[] getCategoryScores() {
        return CategoryScores;
    }


    /**
     *  List of categories and their scores, associated with this Review.
     * 
     * @param CategoryScores List of categories and their scores, associated with this Review.
     */
    public void setCategoryScores(com.guidewire.ab.webservices.entity.ABContactCategoryScore[] CategoryScores) {
        this.CategoryScores = CategoryScores;
    }


    /**
     *  Secondary addresses associated with the contact.
     * 
     * @return ContactAddresses Secondary addresses associated with the contact.
     */
    public com.guidewire.ab.webservices.entity.ABContactAddress[] getContactAddresses() {
        return ContactAddresses;
    }


    /**
     *  Secondary addresses associated with the contact.
     * 
     * @param ContactAddresses Secondary addresses associated with the contact.
     */
    public void setContactAddresses(com.guidewire.ab.webservices.entity.ABContactAddress[] ContactAddresses) {
        this.ContactAddresses = ContactAddresses;
    }


    /**
     *  Notes
     * 
     * @return ContactNotes Notes
     */
    public com.guidewire.ab.webservices.entity.ContactNote[] getContactNotes() {
        return ContactNotes;
    }


    /**
     *  Notes
     * 
     * @param ContactNotes Notes
     */
    public void setContactNotes(com.guidewire.ab.webservices.entity.ContactNote[] ContactNotes) {
        this.ContactNotes = ContactNotes;
    }


    /**
     * 
     * 
     * @return ContactTier
     */
    public com.guidewire.ab.webservices.enumeration.ContactTier getContactTier() {
        return ContactTier;
    }


    /**
     * 
     * 
     * @param ContactTier
     */
    public void setContactTier(com.guidewire.ab.webservices.enumeration.ContactTier ContactTier) {
        this.ContactTier = ContactTier;
    }


    /**
     *  Creation status of this contact
     * 
     * @return CreateStatus Creation status of this contact
     */
    public com.guidewire.ab.webservices.enumeration.ContactCreationApprovalStatus getCreateStatus() {
        return CreateStatus;
    }


    /**
     *  Creation status of this contact
     * 
     * @param CreateStatus Creation status of this contact
     */
    public void setCreateStatus(com.guidewire.ab.webservices.enumeration.ContactCreationApprovalStatus CreateStatus) {
        this.CreateStatus = CreateStatus;
    }


    /**
     *  Electronic Funds Transfer data for the contact
     * 
     * @return EFTRecords Electronic Funds Transfer data for the contact
     */
    public com.guidewire.ab.webservices.entity.EFTData[] getEFTRecords() {
        return EFTRecords;
    }


    /**
     *  Electronic Funds Transfer data for the contact
     * 
     * @param EFTRecords Electronic Funds Transfer data for the contact
     */
    public void setEFTRecords(com.guidewire.ab.webservices.entity.EFTData[] EFTRecords) {
        this.EFTRecords = EFTRecords;
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
     *  Financial summary for contact (if contact holds one or more policies)
     * 
     * @return FinancialSummary Financial summary for contact (if contact holds one or more policies)
     */
    public com.guidewire.ab.webservices.entity.FinancialSummary getFinancialSummary() {
        return FinancialSummary;
    }


    /**
     *  Financial summary for contact (if contact holds one or more policies)
     * 
     * @param FinancialSummary Financial summary for contact (if contact holds one or more policies)
     */
    public void setFinancialSummary(com.guidewire.ab.webservices.entity.FinancialSummary FinancialSummary) {
        this.FinancialSummary = FinancialSummary;
    }


    /**
     *  Flag entries
     * 
     * @return FlagEntries Flag entries
     */
    public com.guidewire.ab.webservices.entity.FlagEntry[] getFlagEntries() {
        return FlagEntries;
    }


    /**
     *  Flag entries
     * 
     * @param FlagEntries Flag entries
     */
    public void setFlagEntries(com.guidewire.ab.webservices.entity.FlagEntry[] FlagEntries) {
        this.FlagEntries = FlagEntries;
    }


    /**
     *  History entries
     * 
     * @return HistoryEntries History entries
     */
    public com.guidewire.ab.webservices.entity.HistoryEntry[] getHistoryEntries() {
        return HistoryEntries;
    }


    /**
     *  History entries
     * 
     * @param HistoryEntries History entries
     */
    public void setHistoryEntries(com.guidewire.ab.webservices.entity.HistoryEntry[] HistoryEntries) {
        this.HistoryEntries = HistoryEntries;
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
     *  Has this vendor contact been recommended to external service evaluation
 * companies?
     * 
     * @return IsVendorRecommended Has this vendor contact been recommended to external service evaluation
 * companies?
     */
    public java.lang.Boolean getIsVendorRecommended() {
        return IsVendorRecommended;
    }


    /**
     *  Has this vendor contact been recommended to external service evaluation
 * companies?
     * 
     * @param IsVendorRecommended Has this vendor contact been recommended to external service evaluation
 * companies?
     */
    public void setIsVendorRecommended(java.lang.Boolean IsVendorRecommended) {
        this.IsVendorRecommended = IsVendorRecommended;
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
     *  KeywordKanji is the general term for the Kanji Name (Companies
 * and Places) and LastName (for Persons).  Used only for Japanese names
 * and will be null otherwise.
     * 
     * @return KeywordKanji KeywordKanji is the general term for the Kanji Name (Companies
 * and Places) and LastName (for Persons).  Used only for Japanese names
 * and will be null otherwise.
     */
    public java.lang.String getKeywordKanji() {
        return KeywordKanji;
    }


    /**
     *  KeywordKanji is the general term for the Kanji Name (Companies
 * and Places) and LastName (for Persons).  Used only for Japanese names
 * and will be null otherwise.
     * 
     * @param KeywordKanji KeywordKanji is the general term for the Kanji Name (Companies
 * and Places) and LastName (for Persons).  Used only for Japanese names
 * and will be null otherwise.
     */
    public void setKeywordKanji(java.lang.String KeywordKanji) {
        this.KeywordKanji = KeywordKanji;
    }


    /**
     *  Date the last legal case report was received
     * 
     * @return LastLegalCaseReportDate Date the last legal case report was received
     */
    public java.util.Calendar getLastLegalCaseReportDate() {
        return LastLegalCaseReportDate;
    }


    /**
     *  Date the last legal case report was received
     * 
     * @param LastLegalCaseReportDate Date the last legal case report was received
     */
    public void setLastLegalCaseReportDate(java.util.Calendar LastLegalCaseReportDate) {
        this.LastLegalCaseReportDate = LastLegalCaseReportDate;
    }


    /**
     *  Status of legal case reports
     * 
     * @return LegalCaseReportStatus Status of legal case reports
     */
    public com.guidewire.ab.webservices.enumeration.LegalCaseReportStatus getLegalCaseReportStatus() {
        return LegalCaseReportStatus;
    }


    /**
     *  Status of legal case reports
     * 
     * @param LegalCaseReportStatus Status of legal case reports
     */
    public void setLegalCaseReportStatus(com.guidewire.ab.webservices.enumeration.LegalCaseReportStatus LegalCaseReportStatus) {
        this.LegalCaseReportStatus = LegalCaseReportStatus;
    }


    /**
     *  Legal cases
     * 
     * @return LegalCases Legal cases
     */
    public com.guidewire.ab.webservices.entity.LegalCase[] getLegalCases() {
        return LegalCases;
    }


    /**
     *  Legal cases
     * 
     * @param LegalCases Legal cases
     */
    public void setLegalCases(com.guidewire.ab.webservices.entity.LegalCase[] LegalCases) {
        this.LegalCases = LegalCases;
    }


    /**
     *  Represents the ID used by client applications to link with the
 * Address Book.
     * 
     * @return LinkID Represents the ID used by client applications to link with the
 * Address Book.
     */
    public java.lang.String getLinkID() {
        return LinkID;
    }


    /**
     *  Represents the ID used by client applications to link with the
 * Address Book.
     * 
     * @param LinkID Represents the ID used by client applications to link with the
 * Address Book.
     */
    public void setLinkID(java.lang.String LinkID) {
        this.LinkID = LinkID;
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
     *  Does this contact prefer to be contacted via email
     * 
     * @return PrefersContactByEmail Does this contact prefer to be contacted via email
     */
    public java.lang.Boolean getPrefersContactByEmail() {
        return PrefersContactByEmail;
    }


    /**
     *  Does this contact prefer to be contacted via email
     * 
     * @param PrefersContactByEmail Does this contact prefer to be contacted via email
     */
    public void setPrefersContactByEmail(java.lang.Boolean PrefersContactByEmail) {
        this.PrefersContactByEmail = PrefersContactByEmail;
    }


    /**
     *  Primary address.
     * 
     * @return PrimaryAddress Primary address.
     */
    public com.guidewire.ab.webservices.entity.Address getPrimaryAddress() {
        return PrimaryAddress;
    }


    /**
     *  Primary address.
     * 
     * @param PrimaryAddress Primary address.
     */
    public void setPrimaryAddress(com.guidewire.ab.webservices.entity.Address PrimaryAddress) {
        this.PrimaryAddress = PrimaryAddress;
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
     *  List of ABContactTags.
     * 
     * @return Tags List of ABContactTags.
     */
    public com.guidewire.ab.webservices.entity.ABContactTag[] getTags() {
        return Tags;
    }


    /**
     *  List of ABContactTags.
     * 
     * @param Tags List of ABContactTags.
     */
    public void setTags(com.guidewire.ab.webservices.entity.ABContactTag[] Tags) {
        this.Tags = Tags;
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
     *  Flag indicating the score needs to be updated because of new or
 * deleted ReviewSummaries.
     * 
     * @return UpdateScore Flag indicating the score needs to be updated because of new or
 * deleted ReviewSummaries.
     */
    public java.lang.Boolean getUpdateScore() {
        return UpdateScore;
    }


    /**
     *  Flag indicating the score needs to be updated because of new or
 * deleted ReviewSummaries.
     * 
     * @param UpdateScore Flag indicating the score needs to be updated because of new or
 * deleted ReviewSummaries.
     */
    public void setUpdateScore(java.lang.Boolean UpdateScore) {
        this.UpdateScore = UpdateScore;
    }


    /**
     *  The availability of a vendor.
     * 
     * @return VendorAvailability The availability of a vendor.
     */
    public com.guidewire.ab.webservices.enumeration.VendorAvailabilityType getVendorAvailability() {
        return VendorAvailability;
    }


    /**
     *  The availability of a vendor.
     * 
     * @param VendorAvailability The availability of a vendor.
     */
    public void setVendorAvailability(com.guidewire.ab.webservices.enumeration.VendorAvailabilityType VendorAvailability) {
        this.VendorAvailability = VendorAvailability;
    }


    /**
     *  Vendor evaluations
     * 
     * @return VendorEvaluations Vendor evaluations
     */
    public com.guidewire.ab.webservices.entity.VendorEvaluation[] getVendorEvaluations() {
        return VendorEvaluations;
    }


    /**
     *  Vendor evaluations
     * 
     * @param VendorEvaluations Vendor evaluations
     */
    public void setVendorEvaluations(com.guidewire.ab.webservices.entity.VendorEvaluation[] VendorEvaluations) {
        this.VendorEvaluations = VendorEvaluations;
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
     *  ID for profile created by external service evaluation companies
     * 
     * @return VendorProfileCode ID for profile created by external service evaluation companies
     */
    public java.lang.String getVendorProfileCode() {
        return VendorProfileCode;
    }


    /**
     *  ID for profile created by external service evaluation companies
     * 
     * @param VendorProfileCode ID for profile created by external service evaluation companies
     */
    public void setVendorProfileCode(java.lang.String VendorProfileCode) {
        this.VendorProfileCode = VendorProfileCode;
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
     *  Message decribing a vendor's unavailability.
     * 
     * @return VendorUnavailableMessage Message decribing a vendor's unavailability.
     */
    public java.lang.String getVendorUnavailableMessage() {
        return VendorUnavailableMessage;
    }


    /**
     *  Message decribing a vendor's unavailability.
     * 
     * @param VendorUnavailableMessage Message decribing a vendor's unavailability.
     */
    public void setVendorUnavailableMessage(java.lang.String VendorUnavailableMessage) {
        this.VendorUnavailableMessage = VendorUnavailableMessage;
    }


    /**
     *  Has W-9 form been received
     * 
     * @return W9Received Has W-9 form been received
     */
    public java.lang.Boolean getW9Received() {
        return W9Received;
    }


    /**
     *  Has W-9 form been received
     * 
     * @param W9Received Has W-9 form been received
     */
    public void setW9Received(java.lang.Boolean W9Received) {
        this.W9Received = W9Received;
    }


    /**
     *  W-9 form received date
     * 
     * @return W9ReceivedDate W-9 form received date
     */
    public java.util.Calendar getW9ReceivedDate() {
        return W9ReceivedDate;
    }


    /**
     *  W-9 form received date
     * 
     * @param W9ReceivedDate W-9 form received date
     */
    public void setW9ReceivedDate(java.util.Calendar W9ReceivedDate) {
        this.W9ReceivedDate = W9ReceivedDate;
    }


    /**
     *  W-9 valid start date
     * 
     * @return W9ValidFrom W-9 valid start date
     */
    public java.util.Calendar getW9ValidFrom() {
        return W9ValidFrom;
    }


    /**
     *  W-9 valid start date
     * 
     * @param W9ValidFrom W-9 valid start date
     */
    public void setW9ValidFrom(java.util.Calendar W9ValidFrom) {
        this.W9ValidFrom = W9ValidFrom;
    }


    /**
     *  W-9 valid to date
     * 
     * @return W9ValidTo W-9 valid to date
     */
    public java.util.Calendar getW9ValidTo() {
        return W9ValidTo;
    }


    /**
     *  W-9 valid to date
     * 
     * @param W9ValidTo W-9 valid to date
     */
    public void setW9ValidTo(java.util.Calendar W9ValidTo) {
        this.W9ValidTo = W9ValidTo;
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
        new org.apache.axis.description.TypeDesc(ABContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABContactSpecialistServices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ABContactSpecialistServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactSpecialistService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AssignedUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BankAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "BankAccount"));
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
        elemField.setFieldName("buildings_Ext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Buildings_Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "Building_Ext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryScores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CategoryScores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactCategoryScore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ContactNote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactTier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactTier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactTier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreateStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "ContactCreationApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EFTRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EFTRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "EFTData"));
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
        elemField.setFieldName("financialSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FinancialSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FinancialSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FlagEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "FlagEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HistoryEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "HistoryEntry"));
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
        elemField.setFieldName("isVendorRecommended");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsVendorRecommended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
        elemField.setFieldName("lastLegalCaseReportDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastLegalCaseReportDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalCaseReportStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LegalCaseReportStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "LegalCaseReportStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalCases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LegalCases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "LegalCase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
        elemField.setFieldName("prefersContactByEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrefersContactByEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
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
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "ABContactTag"));
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
        elemField.setFieldName("updateScore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorAvailability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VendorAvailability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://enumeration.webservices.ab.guidewire.com/", "VendorAvailabilityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorEvaluations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VendorEvaluations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity.webservices.ab.guidewire.com/", "VendorEvaluation"));
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
        elemField.setFieldName("vendorProfileCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VendorProfileCode"));
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
        elemField.setFieldName("vendorUnavailableMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VendorUnavailableMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("w9Received");
        elemField.setXmlName(new javax.xml.namespace.QName("", "W9Received"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("w9ReceivedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "W9ReceivedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("w9ValidFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "W9ValidFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("w9ValidTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "W9ValidTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
