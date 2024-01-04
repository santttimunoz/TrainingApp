
package extensions.ab.internal.domain.addressbook.gen;

import java.math.BigDecimal;
import java.util.Date;
import com.guidewire.ab.domain.addressbook.impl.ABPolicyPersonImpl;
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
import extensions.ab.contact.typekey.YesNo;
import extensions.ab.internal.domain.addressbook.impl.ABContactExtInternal;
import extensions.ab.internal.domain.addressbook.impl.ABContactExtMethodsImpl;
import extensions.ab.internal.domain.addressbook.impl.ABPersonExtInternal;
import extensions.ab.internal.domain.addressbook.impl.ABPolicyPersonExtInternal;
import extensions.ab.internal.domain.addressbook.impl.ABPolicyPersonExtMethodsImpl;
import extensions.ab.internal.domain.contact.impl.GlobalContactNameExtInternal;
import extensions.ab.internal.domain.contact.impl.GlobalContactNameExtMethodsImpl;
import extensions.ab.internal.domain.contact.impl.GlobalPersonNameExtInternal;
import extensions.ab.internal.domain.contact.impl.GlobalPersonNameExtMethodsImpl;
import gw.ab.contact.entity.EFTData;
import gw.pl.community.entity.User;
import gw.pl.persistence.core.Key;

public class ABPolicyPersonExtStub
    extends ABPolicyPersonImpl
    implements ABContactExtInternal, ABPersonExtInternal, ABPolicyPersonExtInternal, GlobalContactNameExtInternal, GlobalPersonNameExtInternal
{


    @Override
    public Boolean isCollateralRequired() {
        return getExtensionDelegate(ABPolicyPersonExtMethodsImpl.class).isCollateralRequired();
    }

    @Override
    public void setCollateralRequired(Boolean value) {
        getExtensionDelegate(ABPolicyPersonExtMethodsImpl.class).setCollateralRequired(value);
    }

    @Override
    public Integer getCollateralAmount() {
        return getExtensionDelegate(ABPolicyPersonExtMethodsImpl.class).getCollateralAmount();
    }

    @Override
    public void setCollateralAmount(Integer value) {
        getExtensionDelegate(ABPolicyPersonExtMethodsImpl.class).setCollateralAmount(value);
    }

    @Override
    public YesNo getPersonCollateralVerified() {
        return getExtensionDelegate(ABPolicyPersonExtMethodsImpl.class).getPersonCollateralVerified();
    }

    @Override
    public void setPersonCollateralVerified(YesNo value) {
        getExtensionDelegate(ABPolicyPersonExtMethodsImpl.class).setPersonCollateralVerified(value);
    }

    @Override
    public BigDecimal getHeightInMeters() {
        return getExtensionDelegate(ABPolicyPersonExtMethodsImpl.class).getHeightInMeters();
    }

    @Override
    public void setHeightInMeters(BigDecimal value) {
        getExtensionDelegate(ABPolicyPersonExtMethodsImpl.class).setHeightInMeters(value);
    }

    @Override
    public Boolean isW9Received() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).isW9Received();
    }

    @Override
    public void setW9Received(Boolean value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setW9Received(value);
    }

    @Override
    public Date getW9ReceivedDate() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getW9ReceivedDate();
    }

    @Override
    public void setW9ReceivedDate(Date value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setW9ReceivedDate(value);
    }

    @Override
    public Date getW9ValidFrom() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getW9ValidFrom();
    }

    @Override
    public void setW9ValidFrom(Date value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setW9ValidFrom(value);
    }

    @Override
    public Date getW9ValidTo() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getW9ValidTo();
    }

    @Override
    public void setW9ValidTo(Date value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setW9ValidTo(value);
    }

    @Override
    public String getKeywordKanji() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getKeywordKanji();
    }

    @Override
    public void setKeywordKanji(String value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setKeywordKanji(value);
    }

    @Override
    public User getAssignedUser() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getAssignedUser();
    }

    @Override
    public void setAssignedUser(User value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setAssignedUser(value);
    }

    @Override
    public Key getAssignedUserID() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getAssignedUserID();
    }

    @Override
    public void setAssignedUserID(Key value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setAssignedUserID(value);
    }

    @Override
    public Boolean isPrefersContactByEmail() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).isPrefersContactByEmail();
    }

    @Override
    public void setPrefersContactByEmail(Boolean value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setPrefersContactByEmail(value);
    }

    @Override
    public BankAccount[] getBankAccounts() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getBankAccounts();
    }

    @Override
    public void addToBankAccounts(BankAccount value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).addToBankAccounts(value);
    }

    @Override
    public void removeFromBankAccounts(BankAccount value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).removeFromBankAccounts(value);
    }

    @Override
    public EFTData[] getEFTRecords() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getEFTRecords();
    }

    @Override
    public void addToEFTRecords(EFTData value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).addToEFTRecords(value);
    }

    @Override
    public void removeFromEFTRecords(EFTData value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).removeFromEFTRecords(value);
    }

    @Override
    public FinancialSummary getFinancialSummary() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getFinancialSummary();
    }

    @Override
    public void setFinancialSummary(FinancialSummary value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setFinancialSummary(value);
    }

    @Override
    public Key getFinancialSummaryID() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getFinancialSummaryID();
    }

    @Override
    public void setFinancialSummaryID(Key value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setFinancialSummaryID(value);
    }

    @Override
    public Building_Ext[] getBuildings_Ext() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getBuildings_Ext();
    }

    @Override
    public void addToBuildings_Ext(Building_Ext value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).addToBuildings_Ext(value);
    }

    @Override
    public void removeFromBuildings_Ext(Building_Ext value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).removeFromBuildings_Ext(value);
    }

    @Override
    public FlagEntry[] getFlagEntries() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getFlagEntries();
    }

    @Override
    public void addToFlagEntries(FlagEntry value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).addToFlagEntries(value);
    }

    @Override
    public void removeFromFlagEntries(FlagEntry value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).removeFromFlagEntries(value);
    }

    @Override
    public HistoryEntry[] getHistoryEntries() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getHistoryEntries();
    }

    @Override
    public void addToHistoryEntries(HistoryEntry value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).addToHistoryEntries(value);
    }

    @Override
    public void removeFromHistoryEntries(HistoryEntry value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).removeFromHistoryEntries(value);
    }

    @Override
    public LegalCase[] getLegalCases() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getLegalCases();
    }

    @Override
    public void addToLegalCases(LegalCase value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).addToLegalCases(value);
    }

    @Override
    public void removeFromLegalCases(LegalCase value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).removeFromLegalCases(value);
    }

    @Override
    public Date getLastLegalCaseReportDate() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getLastLegalCaseReportDate();
    }

    @Override
    public void setLastLegalCaseReportDate(Date value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setLastLegalCaseReportDate(value);
    }

    @Override
    public LegalCaseReportStatus getLegalCaseReportStatus() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getLegalCaseReportStatus();
    }

    @Override
    public void setLegalCaseReportStatus(LegalCaseReportStatus value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setLegalCaseReportStatus(value);
    }

    @Override
    public VendorEvaluation[] getVendorEvaluations() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getVendorEvaluations();
    }

    @Override
    public void addToVendorEvaluations(VendorEvaluation value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).addToVendorEvaluations(value);
    }

    @Override
    public void removeFromVendorEvaluations(VendorEvaluation value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).removeFromVendorEvaluations(value);
    }

    @Override
    public Boolean isIsVendorRecommended() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).isIsVendorRecommended();
    }

    @Override
    public void setIsVendorRecommended(Boolean value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setIsVendorRecommended(value);
    }

    @Override
    public String getVendorProfileCode() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getVendorProfileCode();
    }

    @Override
    public void setVendorProfileCode(String value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setVendorProfileCode(value);
    }

    @Override
    public ContactNote[] getContactNotes() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getContactNotes();
    }

    @Override
    public void addToContactNotes(ContactNote value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).addToContactNotes(value);
    }

    @Override
    public void removeFromContactNotes(ContactNote value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).removeFromContactNotes(value);
    }

    @Override
    public ContactTier getContactTier() {
        return getExtensionDelegate(ABContactExtMethodsImpl.class).getContactTier();
    }

    @Override
    public void setContactTier(ContactTier value) {
        getExtensionDelegate(ABContactExtMethodsImpl.class).setContactTier(value);
    }

    @Override
    public String getNameKanji() {
        return getExtensionDelegate(GlobalContactNameExtMethodsImpl.class).getNameKanji();
    }

    @Override
    public void setNameKanji(String value) {
        getExtensionDelegate(GlobalContactNameExtMethodsImpl.class).setNameKanji(value);
    }

    @Override
    public String getFirstNameKanji() {
        return getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).getFirstNameKanji();
    }

    @Override
    public void setFirstNameKanji(String value) {
        getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).setFirstNameKanji(value);
    }

    @Override
    public String getLastNameKanji() {
        return getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).getLastNameKanji();
    }

    @Override
    public void setLastNameKanji(String value) {
        getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).setLastNameKanji(value);
    }

    @Override
    public String getParticle() {
        return getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).getParticle();
    }

    @Override
    public void setParticle(String value) {
        getExtensionDelegate(GlobalPersonNameExtMethodsImpl.class).setParticle(value);
    }

}
