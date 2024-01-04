
package extensions.ab.internal.domain.addressbook.gen;

import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import extensions.ab.contact.typekey.ManagerRelationshipType;
import gw.ab.addressbook.entity.ABCompanyVendor;
import gw.ab.addressbook.entity.ABPerson;
import gw.pl.persistence.core.Key;

public abstract class ABCompanyVendorExtMethodsStub
    extends AspectBase
    implements ABCompanyVendorExtInternalMethodsStubI
{


    protected ABCompanyVendorExtMethodsStub(ABCompanyVendor owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public ABCompanyVendor getOwner() {
        return ((ABCompanyVendor) super.getOwner());
    }

    @Override
    public ABPerson getFinanceManager() {
        return ((ABPerson) getFieldValue(FINANCEMANAGER_PROP.get()));
    }

    @Override
    public void setFinanceManager(ABPerson value) {
        setFieldValue(FINANCEMANAGER_PROP.get(), value);
    }

    @Override
    public Key getFinanceManagerID() {
        return ((Key) getRawFieldValue(FINANCEMANAGER_PROP.get()));
    }

    @Override
    public void setFinanceManagerID(Key value) {
        setFieldValue(FINANCEMANAGER_PROP.get(), value);
    }

    @Override
    public ABPerson getPaymentContact() {
        return ((ABPerson) getFieldValue(PAYMENTCONTACT_PROP.get()));
    }

    @Override
    public void setPaymentContact(ABPerson value) {
        setFieldValue(PAYMENTCONTACT_PROP.get(), value);
    }

    @Override
    public Key getPaymentContactID() {
        return ((Key) getRawFieldValue(PAYMENTCONTACT_PROP.get()));
    }

    @Override
    public void setPaymentContactID(Key value) {
        setFieldValue(PAYMENTCONTACT_PROP.get(), value);
    }

    @Override
    public ManagerRelationshipType getFinanceMgrRelationship() {
        return ((ManagerRelationshipType) getFieldValue(FINANCEMGRRELATIONSHIP_PROP.get()));
    }

    @Override
    public void setFinanceMgrRelationship(ManagerRelationshipType value) {
        setFieldValue(FINANCEMGRRELATIONSHIP_PROP.get(), value);
    }

}
