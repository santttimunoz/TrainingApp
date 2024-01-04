
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import java.util.List;
import com.guidewire.pl.domain.messaging.impl.EventAwareInternal;
import com.guidewire.pl.system.entity.BeanEvent;
import com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy;
import extensions.ab.contact.typekey.BankAccountType;
import extensions.ab.contact.typekey.VerificationStatus;
import gw.ab.addressbook.entity.ABContact;
import gw.pl.messaging.entity.EventAware;
import gw.pl.persistence.core.Key;

public abstract class BankAccountStub
    extends AbstractEditableRetireableBeanProxy
    implements BankAccountInternalStubI
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
    public String getBankName() {
        return ((String) getFieldValueForCodegen(BANKNAME_PROP.get()));
    }

    @Override
    public void setBankName(String value) {
        setFieldValueForCodegen(BANKNAME_PROP.get(), value);
    }

    @Override
    public String getRoutingNumber() {
        return ((String) getFieldValueForCodegen(ROUTINGNUMBER_PROP.get()));
    }

    @Override
    public void setRoutingNumber(String value) {
        setFieldValueForCodegen(ROUTINGNUMBER_PROP.get(), value);
    }

    @Override
    public String getAccountNumber() {
        return ((String) getFieldValueForCodegen(ACCOUNTNUMBER_PROP.get()));
    }

    @Override
    public void setAccountNumber(String value) {
        setFieldValueForCodegen(ACCOUNTNUMBER_PROP.get(), value);
    }

    @Override
    public BankAccountType getAccountType() {
        return ((BankAccountType) getFieldValue(ACCOUNTTYPE_PROP.get()));
    }

    @Override
    public void setAccountType(BankAccountType value) {
        setFieldValue(ACCOUNTTYPE_PROP.get(), value);
    }

    @Override
    public VerificationStatus getIsVerified() {
        return ((VerificationStatus) getFieldValue(ISVERIFIED_PROP.get()));
    }

    @Override
    public void setIsVerified(VerificationStatus value) {
        setFieldValue(ISVERIFIED_PROP.get(), value);
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
    public Date getOrginateDate() {
        return ((Date) getFieldValue(ORGINATEDATE_PROP.get()));
    }

    @Override
    public void setOrginateDate(Date value) {
        setFieldValue(ORGINATEDATE_PROP.get(), value);
    }

    @Override
    public void addEvent(String p0) {
        getEntityDelegate(EventAware.class).addEvent(p0);
    }

    @Override
    public void addEvent(BeanEvent p0) {
        ((EventAwareInternal) getEntityDelegate(EventAware.class)).addEvent(p0);
    }

    @Override
    public BeanEvent[] getEvents() {
        return ((EventAwareInternal) getEntityDelegate(EventAware.class)).getEvents();
    }

    @Override
    public List generateInsertEvents() {
        return ((EventAwareInternal) getEntityDelegate(EventAware.class)).generateInsertEvents();
    }

    @Override
    public List generateUpdateEvents() {
        return ((EventAwareInternal) getEntityDelegate(EventAware.class)).generateUpdateEvents();
    }

    @Override
    public List generateRemoveEvents() {
        return ((EventAwareInternal) getEntityDelegate(EventAware.class)).generateRemoveEvents();
    }

}
