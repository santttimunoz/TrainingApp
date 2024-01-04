
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy;
import gw.ab.addressbook.entity.ABContact;
import gw.pl.community.entity.User;
import gw.pl.persistence.core.Key;

public abstract class ViewedContactStub
    extends AbstractEditableRetireableBeanProxy
    implements ViewedContactInternalStubI
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
    public User getViewingUser() {
        return ((User) getFieldValue(VIEWINGUSER_PROP.get()));
    }

    @Override
    public void setViewingUser(User value) {
        setFieldValue(VIEWINGUSER_PROP.get(), value);
    }

    @Override
    public Key getViewingUserID() {
        return ((Key) getRawFieldValue(VIEWINGUSER_PROP.get()));
    }

    @Override
    public void setViewingUserID(Key value) {
        setFieldValue(VIEWINGUSER_PROP.get(), value);
    }

    @Override
    public ABContact getViewedContact() {
        return ((ABContact) getFieldValue(VIEWEDCONTACT_PROP.get()));
    }

    @Override
    public void setViewedContact(ABContact value) {
        setFieldValue(VIEWEDCONTACT_PROP.get(), value);
    }

    @Override
    public Key getViewedContactID() {
        return ((Key) getRawFieldValue(VIEWEDCONTACT_PROP.get()));
    }

    @Override
    public void setViewedContactID(Key value) {
        setFieldValue(VIEWEDCONTACT_PROP.get(), value);
    }

}
