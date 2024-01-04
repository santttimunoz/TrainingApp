
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy;
import extensions.ab.contact.typekey.ContactNoteType;
import gw.ab.addressbook.entity.ABContact;
import gw.pl.persistence.core.Key;

public abstract class ContactNoteStub
    extends AbstractEditableRetireableBeanProxy
    implements ContactNoteInternalStubI
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
    public String getSubject() {
        return ((String) getFieldValueForCodegen(SUBJECT_PROP.get()));
    }

    @Override
    public void setSubject(String value) {
        setFieldValueForCodegen(SUBJECT_PROP.get(), value);
    }

    @Override
    public String getBody() {
        return ((String) getFieldValueForCodegen(BODY_PROP.get()));
    }

    @Override
    public void setBody(String value) {
        setFieldValueForCodegen(BODY_PROP.get(), value);
    }

    @Override
    public Boolean isIsConfidential() {
        return ((Boolean) getFieldValue(ISCONFIDENTIAL_PROP.get()));
    }

    @Override
    public void setIsConfidential(Boolean value) {
        setFieldValue(ISCONFIDENTIAL_PROP.get(), value);
    }

    @Override
    public ContactNoteType getContactNoteType() {
        return ((ContactNoteType) getFieldValue(CONTACTNOTETYPE_PROP.get()));
    }

    @Override
    public void setContactNoteType(ContactNoteType value) {
        setFieldValue(CONTACTNOTETYPE_PROP.get(), value);
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

}
