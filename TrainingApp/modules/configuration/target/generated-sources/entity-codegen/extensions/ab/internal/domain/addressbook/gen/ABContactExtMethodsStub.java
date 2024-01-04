
package extensions.ab.internal.domain.addressbook.gen;

import java.util.Date;
import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
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
import gw.pl.community.entity.User;
import gw.pl.persistence.core.Key;

public abstract class ABContactExtMethodsStub
    extends AspectBase
    implements ABContactExtInternalMethodsStubI
{


    protected ABContactExtMethodsStub(ABContact owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public ABContact getOwner() {
        return ((ABContact) super.getOwner());
    }

    @Override
    public Boolean isW9Received() {
        return ((Boolean) getFieldValue(W9RECEIVED_PROP.get()));
    }

    @Override
    public void setW9Received(Boolean value) {
        setFieldValue(W9RECEIVED_PROP.get(), value);
    }

    @Override
    public Date getW9ReceivedDate() {
        return ((Date) getFieldValue(W9RECEIVEDDATE_PROP.get()));
    }

    @Override
    public void setW9ReceivedDate(Date value) {
        setFieldValue(W9RECEIVEDDATE_PROP.get(), value);
    }

    @Override
    public Date getW9ValidFrom() {
        return ((Date) getFieldValue(W9VALIDFROM_PROP.get()));
    }

    @Override
    public void setW9ValidFrom(Date value) {
        setFieldValue(W9VALIDFROM_PROP.get(), value);
    }

    @Override
    public Date getW9ValidTo() {
        return ((Date) getFieldValue(W9VALIDTO_PROP.get()));
    }

    @Override
    public void setW9ValidTo(Date value) {
        setFieldValue(W9VALIDTO_PROP.get(), value);
    }

    @Override
    public String getKeywordKanji() {
        return ((String) getFieldValueForCodegen(KEYWORDKANJI_PROP.get()));
    }

    @Override
    public void setKeywordKanji(String value) {
        setFieldValueForCodegen(KEYWORDKANJI_PROP.get(), value);
    }

    @Override
    public User getAssignedUser() {
        return ((User) getFieldValue(ASSIGNEDUSER_PROP.get()));
    }

    @Override
    public void setAssignedUser(User value) {
        setFieldValue(ASSIGNEDUSER_PROP.get(), value);
    }

    @Override
    public Key getAssignedUserID() {
        return ((Key) getRawFieldValue(ASSIGNEDUSER_PROP.get()));
    }

    @Override
    public void setAssignedUserID(Key value) {
        setFieldValue(ASSIGNEDUSER_PROP.get(), value);
    }

    @Override
    public Boolean isPrefersContactByEmail() {
        return ((Boolean) getFieldValue(PREFERSCONTACTBYEMAIL_PROP.get()));
    }

    @Override
    public void setPrefersContactByEmail(Boolean value) {
        setFieldValue(PREFERSCONTACTBYEMAIL_PROP.get(), value);
    }

    @Override
    public BankAccount[] getBankAccounts() {
        return ((BankAccount[]) getFieldValue(BANKACCOUNTS_PROP.get()));
    }

    @Override
    public void addToBankAccounts(BankAccount value) {
        addArrayElement(BANKACCOUNTS_PROP.get(), value);
    }

    @Override
    public void removeFromBankAccounts(BankAccount value) {
        removeArrayElement(BANKACCOUNTS_PROP.get(), value);
    }

    @Override
    public EFTData[] getEFTRecords() {
        return ((EFTData[]) getFieldValue(EFTRECORDS_PROP.get()));
    }

    @Override
    public void addToEFTRecords(EFTData value) {
        addArrayElement(EFTRECORDS_PROP.get(), value);
    }

    @Override
    public void removeFromEFTRecords(EFTData value) {
        removeArrayElement(EFTRECORDS_PROP.get(), value);
    }

    @Override
    public FinancialSummary getFinancialSummary() {
        return ((FinancialSummary) getFieldValue(FINANCIALSUMMARY_PROP.get()));
    }

    @Override
    public void setFinancialSummary(FinancialSummary value) {
        setFieldValue(FINANCIALSUMMARY_PROP.get(), value);
    }

    @Override
    public Key getFinancialSummaryID() {
        return ((Key) getRawFieldValue(FINANCIALSUMMARY_PROP.get()));
    }

    @Override
    public void setFinancialSummaryID(Key value) {
        setFieldValue(FINANCIALSUMMARY_PROP.get(), value);
    }

    @Override
    public Building_Ext[] getBuildings_Ext() {
        return ((Building_Ext[]) getFieldValue(BUILDINGS_EXT_PROP.get()));
    }

    @Override
    public void addToBuildings_Ext(Building_Ext value) {
        addArrayElement(BUILDINGS_EXT_PROP.get(), value);
    }

    @Override
    public void removeFromBuildings_Ext(Building_Ext value) {
        removeArrayElement(BUILDINGS_EXT_PROP.get(), value);
    }

    @Override
    public FlagEntry[] getFlagEntries() {
        return ((FlagEntry[]) getFieldValue(FLAGENTRIES_PROP.get()));
    }

    @Override
    public void addToFlagEntries(FlagEntry value) {
        addArrayElement(FLAGENTRIES_PROP.get(), value);
    }

    @Override
    public void removeFromFlagEntries(FlagEntry value) {
        removeArrayElement(FLAGENTRIES_PROP.get(), value);
    }

    @Override
    public HistoryEntry[] getHistoryEntries() {
        return ((HistoryEntry[]) getFieldValue(HISTORYENTRIES_PROP.get()));
    }

    @Override
    public void addToHistoryEntries(HistoryEntry value) {
        addArrayElement(HISTORYENTRIES_PROP.get(), value);
    }

    @Override
    public void removeFromHistoryEntries(HistoryEntry value) {
        removeArrayElement(HISTORYENTRIES_PROP.get(), value);
    }

    @Override
    public LegalCase[] getLegalCases() {
        return ((LegalCase[]) getFieldValue(LEGALCASES_PROP.get()));
    }

    @Override
    public void addToLegalCases(LegalCase value) {
        addArrayElement(LEGALCASES_PROP.get(), value);
    }

    @Override
    public void removeFromLegalCases(LegalCase value) {
        removeArrayElement(LEGALCASES_PROP.get(), value);
    }

    @Override
    public Date getLastLegalCaseReportDate() {
        return ((Date) getFieldValue(LASTLEGALCASEREPORTDATE_PROP.get()));
    }

    @Override
    public void setLastLegalCaseReportDate(Date value) {
        setFieldValue(LASTLEGALCASEREPORTDATE_PROP.get(), value);
    }

    @Override
    public LegalCaseReportStatus getLegalCaseReportStatus() {
        return ((LegalCaseReportStatus) getFieldValue(LEGALCASEREPORTSTATUS_PROP.get()));
    }

    @Override
    public void setLegalCaseReportStatus(LegalCaseReportStatus value) {
        setFieldValue(LEGALCASEREPORTSTATUS_PROP.get(), value);
    }

    @Override
    public VendorEvaluation[] getVendorEvaluations() {
        return ((VendorEvaluation[]) getFieldValue(VENDOREVALUATIONS_PROP.get()));
    }

    @Override
    public void addToVendorEvaluations(VendorEvaluation value) {
        addArrayElement(VENDOREVALUATIONS_PROP.get(), value);
    }

    @Override
    public void removeFromVendorEvaluations(VendorEvaluation value) {
        removeArrayElement(VENDOREVALUATIONS_PROP.get(), value);
    }

    @Override
    public Boolean isIsVendorRecommended() {
        return ((Boolean) getFieldValue(ISVENDORRECOMMENDED_PROP.get()));
    }

    @Override
    public void setIsVendorRecommended(Boolean value) {
        setFieldValue(ISVENDORRECOMMENDED_PROP.get(), value);
    }

    @Override
    public String getVendorProfileCode() {
        return ((String) getFieldValueForCodegen(VENDORPROFILECODE_PROP.get()));
    }

    @Override
    public void setVendorProfileCode(String value) {
        setFieldValueForCodegen(VENDORPROFILECODE_PROP.get(), value);
    }

    @Override
    public ContactNote[] getContactNotes() {
        return ((ContactNote[]) getFieldValue(CONTACTNOTES_PROP.get()));
    }

    @Override
    public void addToContactNotes(ContactNote value) {
        addArrayElement(CONTACTNOTES_PROP.get(), value);
    }

    @Override
    public void removeFromContactNotes(ContactNote value) {
        removeArrayElement(CONTACTNOTES_PROP.get(), value);
    }

    @Override
    public ContactTier getContactTier() {
        return ((ContactTier) getFieldValue(CONTACTTIER_PROP.get()));
    }

    @Override
    public void setContactTier(ContactTier value) {
        setFieldValue(CONTACTTIER_PROP.get(), value);
    }

}
