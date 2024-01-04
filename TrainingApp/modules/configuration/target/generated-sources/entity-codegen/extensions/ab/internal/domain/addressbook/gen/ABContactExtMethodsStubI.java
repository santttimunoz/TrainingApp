
package extensions.ab.internal.domain.addressbook.gen;

import java.util.Date;
import com.guidewire.commons.metadata.types.ArrayPropertyInfoCache;
import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.LinkPropertyInfoCache;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.contact.entity.BankAccount;
import extensions.ab.contact.entity.Building_Ext;
import extensions.ab.contact.entity.ContactNote;
import extensions.ab.contact.entity.FinancialSummary;
import extensions.ab.contact.entity.FlagEntry;
import extensions.ab.contact.entity.HistoryEntry;
import extensions.ab.contact.entity.LegalCase;
import extensions.ab.contact.entity.VendorEvaluation;
import extensions.ab.contact.typekey.ContactTier;
import extensions.ab.contact.typekey.LegalCaseReportStatus;
import gw.ab.addressbook.entity.ABContact;
import gw.ab.contact.entity.EFTData;
import gw.entity.IArrayPropertyInfo;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ILinkPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.community.entity.User;
import gw.pl.persistence.type.EntityPropertyInfoReference;

public interface ABContactExtMethodsStubI {

    EntityPropertyInfoReference<IColumnPropertyInfo> W9RECEIVED_PROP = new ColumnPropertyInfoCache(ABContact.TYPE, "W9Received");
    EntityPropertyInfoReference<IColumnPropertyInfo> W9RECEIVEDDATE_PROP = new ColumnPropertyInfoCache(ABContact.TYPE, "W9ReceivedDate");
    EntityPropertyInfoReference<IColumnPropertyInfo> W9VALIDFROM_PROP = new ColumnPropertyInfoCache(ABContact.TYPE, "W9ValidFrom");
    EntityPropertyInfoReference<IColumnPropertyInfo> W9VALIDTO_PROP = new ColumnPropertyInfoCache(ABContact.TYPE, "W9ValidTo");
    EntityPropertyInfoReference<IColumnPropertyInfo> KEYWORDKANJI_PROP = new ColumnPropertyInfoCache(ABContact.TYPE, "KeywordKanji");
    EntityPropertyInfoReference<ILinkPropertyInfo> ASSIGNEDUSER_PROP = new LinkPropertyInfoCache(ABContact.TYPE, "AssignedUser");
    EntityPropertyInfoReference<IColumnPropertyInfo> PREFERSCONTACTBYEMAIL_PROP = new ColumnPropertyInfoCache(ABContact.TYPE, "PrefersContactByEmail");
    EntityPropertyInfoReference<IArrayPropertyInfo> BANKACCOUNTS_PROP = new ArrayPropertyInfoCache(ABContact.TYPE, "BankAccounts");
    EntityPropertyInfoReference<IArrayPropertyInfo> EFTRECORDS_PROP = new ArrayPropertyInfoCache(ABContact.TYPE, "EFTRecords");
    EntityPropertyInfoReference<ILinkPropertyInfo> FINANCIALSUMMARY_PROP = new LinkPropertyInfoCache(ABContact.TYPE, "FinancialSummary");
    EntityPropertyInfoReference<IArrayPropertyInfo> BUILDINGS_EXT_PROP = new ArrayPropertyInfoCache(ABContact.TYPE, "Buildings_Ext");
    EntityPropertyInfoReference<IArrayPropertyInfo> FLAGENTRIES_PROP = new ArrayPropertyInfoCache(ABContact.TYPE, "FlagEntries");
    EntityPropertyInfoReference<IArrayPropertyInfo> HISTORYENTRIES_PROP = new ArrayPropertyInfoCache(ABContact.TYPE, "HistoryEntries");
    EntityPropertyInfoReference<IArrayPropertyInfo> LEGALCASES_PROP = new ArrayPropertyInfoCache(ABContact.TYPE, "LegalCases");
    EntityPropertyInfoReference<IColumnPropertyInfo> LASTLEGALCASEREPORTDATE_PROP = new ColumnPropertyInfoCache(ABContact.TYPE, "LastLegalCaseReportDate");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> LEGALCASEREPORTSTATUS_PROP = new TypekeyPropertyInfoCache(ABContact.TYPE, "LegalCaseReportStatus");
    EntityPropertyInfoReference<IArrayPropertyInfo> VENDOREVALUATIONS_PROP = new ArrayPropertyInfoCache(ABContact.TYPE, "VendorEvaluations");
    EntityPropertyInfoReference<IColumnPropertyInfo> ISVENDORRECOMMENDED_PROP = new ColumnPropertyInfoCache(ABContact.TYPE, "IsVendorRecommended");
    EntityPropertyInfoReference<IColumnPropertyInfo> VENDORPROFILECODE_PROP = new ColumnPropertyInfoCache(ABContact.TYPE, "VendorProfileCode");
    EntityPropertyInfoReference<IArrayPropertyInfo> CONTACTNOTES_PROP = new ArrayPropertyInfoCache(ABContact.TYPE, "ContactNotes");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> CONTACTTIER_PROP = new TypekeyPropertyInfoCache(ABContact.TYPE, "ContactTier");

    /**
     * Gets the value of the W9Received field.
     * Has W-9 form been received
     * 
     */
    Boolean isW9Received();

    /**
     * Sets the value of the W9Received field.
     * 
     */
    void setW9Received(Boolean value);

    /**
     * Gets the value of the W9ReceivedDate field.
     * W-9 form received date
     * 
     */
    Date getW9ReceivedDate();

    /**
     * Sets the value of the W9ReceivedDate field.
     * 
     */
    void setW9ReceivedDate(Date value);

    /**
     * Gets the value of the W9ValidFrom field.
     * W-9 valid start date
     * 
     */
    Date getW9ValidFrom();

    /**
     * Sets the value of the W9ValidFrom field.
     * 
     */
    void setW9ValidFrom(Date value);

    /**
     * Gets the value of the W9ValidTo field.
     * W-9 valid to date
     * 
     */
    Date getW9ValidTo();

    /**
     * Sets the value of the W9ValidTo field.
     * 
     */
    void setW9ValidTo(Date value);

    /**
     * Gets the value of the KeywordKanji field.
     * KeywordKanji is the general term for the Kanji Name (Companies and Places) and LastName (for Persons).  Used only for Japanese names and will be null otherwise.
     * 
     */
    String getKeywordKanji();

    /**
     * Sets the value of the KeywordKanji field.
     * 
     */
    void setKeywordKanji(String value);

    /**
     * Gets the value of the AssignedUser field.
     * Assigned user
     * 
     */
    User getAssignedUser();

    /**
     * Sets the value of the AssignedUser field.
     * 
     */
    void setAssignedUser(User value);

    /**
     * Gets the value of the PrefersContactByEmail field.
     * Does this contact prefer to be contacted via email
     * 
     */
    Boolean isPrefersContactByEmail();

    /**
     * Sets the value of the PrefersContactByEmail field.
     * 
     */
    void setPrefersContactByEmail(Boolean value);

    /**
     * Gets the value of the BankAccounts field.
     * Bank accounts
     * 
     */
    BankAccount[] getBankAccounts();

    /**
     * Adds the given element to the BankAccounts array. This is achieved by setting the parent foreign key to this entity instance.
     * 
     */
    void addToBankAccounts(BankAccount value);

    /**
     * Removes the given element from the BankAccounts array. This is achieved by marking the element for removal.
     * 
     */
    void removeFromBankAccounts(BankAccount value);

    /**
     * Gets the value of the EFTRecords field.
     * Electronic Funds Transfer data for the contact
     * 
     */
    EFTData[] getEFTRecords();

    /**
     * Adds the given element to the EFTRecords array. This is achieved by setting the parent foreign key to this entity instance.
     * 
     */
    void addToEFTRecords(EFTData value);

    /**
     * Removes the given element from the EFTRecords array. This is achieved by marking the element for removal.
     * 
     */
    void removeFromEFTRecords(EFTData value);

    /**
     * Gets the value of the FinancialSummary field.
     * Financial summary for contact (if contact holds one or more policies)
     * 
     */
    FinancialSummary getFinancialSummary();

    /**
     * Sets the value of the FinancialSummary field.
     * 
     */
    void setFinancialSummary(FinancialSummary value);

    /**
     * Gets the value of the Buildings_Ext field.
     * Buildings
     * 
     */
    Building_Ext[] getBuildings_Ext();

    /**
     * Adds the given element to the Buildings_Ext array. This is achieved by setting the parent foreign key to this entity instance.
     * 
     */
    void addToBuildings_Ext(Building_Ext value);

    /**
     * Removes the given element from the Buildings_Ext array. This is achieved by marking the element for removal.
     * 
     */
    void removeFromBuildings_Ext(Building_Ext value);

    /**
     * Gets the value of the FlagEntries field.
     * Flag entries
     * 
     */
    FlagEntry[] getFlagEntries();

    /**
     * Adds the given element to the FlagEntries array. This is achieved by setting the parent foreign key to this entity instance.
     * 
     */
    void addToFlagEntries(FlagEntry value);

    /**
     * Removes the given element from the FlagEntries array. This is achieved by marking the element for removal.
     * 
     */
    void removeFromFlagEntries(FlagEntry value);

    /**
     * Gets the value of the HistoryEntries field.
     * History entries
     * 
     */
    HistoryEntry[] getHistoryEntries();

    /**
     * Adds the given element to the HistoryEntries array. This is achieved by setting the parent foreign key to this entity instance.
     * 
     */
    void addToHistoryEntries(HistoryEntry value);

    /**
     * Removes the given element from the HistoryEntries array. This is achieved by marking the element for removal.
     * 
     */
    void removeFromHistoryEntries(HistoryEntry value);

    /**
     * Gets the value of the LegalCases field.
     * Legal cases
     * 
     */
    LegalCase[] getLegalCases();

    /**
     * Adds the given element to the LegalCases array. This is achieved by setting the parent foreign key to this entity instance.
     * 
     */
    void addToLegalCases(LegalCase value);

    /**
     * Removes the given element from the LegalCases array. This is achieved by marking the element for removal.
     * 
     */
    void removeFromLegalCases(LegalCase value);

    /**
     * Gets the value of the LastLegalCaseReportDate field.
     * Date the last legal case report was received
     * 
     */
    Date getLastLegalCaseReportDate();

    /**
     * Sets the value of the LastLegalCaseReportDate field.
     * 
     */
    void setLastLegalCaseReportDate(Date value);

    /**
     * Gets the value of the LegalCaseReportStatus field.
     * Status of legal case reports
     * 
     */
    LegalCaseReportStatus getLegalCaseReportStatus();

    /**
     * Sets the value of the LegalCaseReportStatus field.
     * 
     */
    void setLegalCaseReportStatus(LegalCaseReportStatus value);

    /**
     * Gets the value of the VendorEvaluations field.
     * Vendor evaluations
     * 
     */
    VendorEvaluation[] getVendorEvaluations();

    /**
     * Adds the given element to the VendorEvaluations array. This is achieved by setting the parent foreign key to this entity instance.
     * 
     */
    void addToVendorEvaluations(VendorEvaluation value);

    /**
     * Removes the given element from the VendorEvaluations array. This is achieved by marking the element for removal.
     * 
     */
    void removeFromVendorEvaluations(VendorEvaluation value);

    /**
     * Gets the value of the IsVendorRecommended field.
     * Has this vendor contact been recommended to external service evaluation companies?
     * 
     */
    Boolean isIsVendorRecommended();

    /**
     * Sets the value of the IsVendorRecommended field.
     * 
     */
    void setIsVendorRecommended(Boolean value);

    /**
     * Gets the value of the VendorProfileCode field.
     * ID for profile created by external service evaluation companies
     * 
     */
    String getVendorProfileCode();

    /**
     * Sets the value of the VendorProfileCode field.
     * 
     */
    void setVendorProfileCode(String value);

    /**
     * Gets the value of the ContactNotes field.
     * Notes
     * 
     */
    ContactNote[] getContactNotes();

    /**
     * Adds the given element to the ContactNotes array. This is achieved by setting the parent foreign key to this entity instance.
     * 
     */
    void addToContactNotes(ContactNote value);

    /**
     * Removes the given element from the ContactNotes array. This is achieved by marking the element for removal.
     * 
     */
    void removeFromContactNotes(ContactNote value);

    /**
     * Gets the value of the ContactTier field.
     * 
     * 
     */
    ContactTier getContactTier();

    /**
     * Sets the value of the ContactTier field.
     * 
     */
    void setContactTier(ContactTier value);

}
