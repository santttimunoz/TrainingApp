
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy;
import extensions.ab.contact.typekey.LegalCaseStatus;
import extensions.ab.contact.typekey.LegalCaseType;
import gw.ab.addressbook.entity.ABContact;
import gw.pl.persistence.core.Key;

public abstract class LegalCaseStub
    extends AbstractEditableRetireableBeanProxy
    implements LegalCaseInternalStubI
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
    public Date getFileDate() {
        return ((Date) getFieldValue(FILEDATE_PROP.get()));
    }

    @Override
    public void setFileDate(Date value) {
        setFieldValue(FILEDATE_PROP.get(), value);
    }

    @Override
    public Boolean isFiledByContact() {
        return ((Boolean) getFieldValue(FILEDBYCONTACT_PROP.get()));
    }

    @Override
    public void setFiledByContact(Boolean value) {
        setFieldValue(FILEDBYCONTACT_PROP.get(), value);
    }

    @Override
    public String getPlaintiff() {
        return ((String) getFieldValueForCodegen(PLAINTIFF_PROP.get()));
    }

    @Override
    public void setPlaintiff(String value) {
        setFieldValueForCodegen(PLAINTIFF_PROP.get(), value);
    }

    @Override
    public String getDefendant() {
        return ((String) getFieldValueForCodegen(DEFENDANT_PROP.get()));
    }

    @Override
    public void setDefendant(String value) {
        setFieldValueForCodegen(DEFENDANT_PROP.get(), value);
    }

    @Override
    public LegalCaseType getCaseType() {
        return ((LegalCaseType) getFieldValue(CASETYPE_PROP.get()));
    }

    @Override
    public void setCaseType(LegalCaseType value) {
        setFieldValue(CASETYPE_PROP.get(), value);
    }

    @Override
    public LegalCaseStatus getStatus() {
        return ((LegalCaseStatus) getFieldValue(STATUS_PROP.get()));
    }

    @Override
    public void setStatus(LegalCaseStatus value) {
        setFieldValue(STATUS_PROP.get(), value);
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
