
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy;
import gw.ab.addressbook.entity.ABContact;
import gw.api.financials.CurrencyAmount;
import gw.pl.persistence.core.Key;

public abstract class FinancialSummaryStub
    extends AbstractEditableRetireableBeanProxy
    implements FinancialSummaryInternalStubI
{


    @Override
    public Long getLoadCommandID() {
        return ((Long) getFieldValue(LOADCOMMANDID_PROP.get()));
    }

    @Override
    public void setLoadCommandID(Long value) {
        setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }

    @Override
    public ABContact getABContact() {
        return ((ABContact) getFieldValue(ABCONTACT_PROP.get()));
    }

    @Override
    public void setABContact(ABContact value) {
        setFieldValue(ABCONTACT_PROP.get(), value);
    }

    @Override
    public Key getABContactID() {
        return ((Key) getRawFieldValue(ABCONTACT_PROP.get()));
    }

    @Override
    public void setABContactID(Key value) {
        setFieldValue(ABCONTACT_PROP.get(), value);
    }

    @Override
    public CurrencyAmount getTotalPolicyPremiumBilled() {
        return ((CurrencyAmount) getFieldValue(TOTALPOLICYPREMIUMBILLED_PROP.get()));
    }

    @Override
    public void setTotalPolicyPremiumBilled(CurrencyAmount value) {
        setFieldValue(TOTALPOLICYPREMIUMBILLED_PROP.get(), value);
    }

    @Override
    public CurrencyAmount getTotalPolicyPremiumPaid() {
        return ((CurrencyAmount) getFieldValue(TOTALPOLICYPREMIUMPAID_PROP.get()));
    }

    @Override
    public void setTotalPolicyPremiumPaid(CurrencyAmount value) {
        setFieldValue(TOTALPOLICYPREMIUMPAID_PROP.get(), value);
    }

    @Override
    public CurrencyAmount getTotalPolicyPremiumRefunded() {
        return ((CurrencyAmount) getFieldValue(TOTALPOLICYPREMIUMREFUNDED_PROP.get()));
    }

    @Override
    public void setTotalPolicyPremiumRefunded(CurrencyAmount value) {
        setFieldValue(TOTALPOLICYPREMIUMREFUNDED_PROP.get(), value);
    }

    @Override
    public CurrencyAmount getTotalClaimPaymentsMade() {
        return ((CurrencyAmount) getFieldValue(TOTALCLAIMPAYMENTSMADE_PROP.get()));
    }

    @Override
    public void setTotalClaimPaymentsMade(CurrencyAmount value) {
        setFieldValue(TOTALCLAIMPAYMENTSMADE_PROP.get(), value);
    }

    @Override
    public Integer getNumberOfClaims() {
        return ((Integer) getFieldValue(NUMBEROFCLAIMS_PROP.get()));
    }

    @Override
    public void setNumberOfClaims(Integer value) {
        setFieldValue(NUMBEROFCLAIMS_PROP.get(), value);
    }

    @Override
    public Date getMostRecentClaim() {
        return ((Date) getFieldValue(MOSTRECENTCLAIM_PROP.get()));
    }

    @Override
    public void setMostRecentClaim(Date value) {
        setFieldValue(MOSTRECENTCLAIM_PROP.get(), value);
    }

}
