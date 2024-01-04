
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy;
import extensions.ab.contact.typekey.FlagEntryReason;
import gw.ab.addressbook.entity.ABContact;
import gw.pl.community.entity.User;
import gw.pl.persistence.core.Key;

public abstract class FlagEntryStub
    extends AbstractEditableRetireableBeanProxy
    implements FlagEntryInternalStubI
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
    public Date getFlagDate() {
        return ((Date) getFieldValue(FLAGDATE_PROP.get()));
    }

    @Override
    public void setFlagDate(Date value) {
        setFieldValue(FLAGDATE_PROP.get(), value);
    }

    @Override
    public Date getUnflagDate() {
        return ((Date) getFieldValue(UNFLAGDATE_PROP.get()));
    }

    @Override
    public void setUnflagDate(Date value) {
        setFieldValue(UNFLAGDATE_PROP.get(), value);
    }

    @Override
    public String getResolution() {
        return ((String) getFieldValueForCodegen(RESOLUTION_PROP.get()));
    }

    @Override
    public void setResolution(String value) {
        setFieldValueForCodegen(RESOLUTION_PROP.get(), value);
    }

    @Override
    public Boolean isIsOpen() {
        return ((Boolean) getFieldValue(ISOPEN_PROP.get()));
    }

    @Override
    public void setIsOpen(Boolean value) {
        setFieldValue(ISOPEN_PROP.get(), value);
    }

    @Override
    public FlagEntryReason getReason() {
        return ((FlagEntryReason) getFieldValue(REASON_PROP.get()));
    }

    @Override
    public void setReason(FlagEntryReason value) {
        setFieldValue(REASON_PROP.get(), value);
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
    public User getUnflagUser() {
        return ((User) getFieldValue(UNFLAGUSER_PROP.get()));
    }

    @Override
    public void setUnflagUser(User value) {
        setFieldValue(UNFLAGUSER_PROP.get(), value);
    }

    @Override
    public Key getUnflagUserID() {
        return ((Key) getRawFieldValue(UNFLAGUSER_PROP.get()));
    }

    @Override
    public void setUnflagUserID(Key value) {
        setFieldValue(UNFLAGUSER_PROP.get(), value);
    }

}
