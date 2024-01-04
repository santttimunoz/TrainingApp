
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.ab.domain.addressbook.impl.ABCompanyVendorImpl;

public abstract class ABAutoRepairShopStub
    extends ABCompanyVendorImpl
    implements ABAutoRepairShopInternalStubI
{


    @Override
    public String getAutoRepairLicense() {
        return ((String) getFieldValueForCodegen(AUTOREPAIRLICENSE_PROP.get()));
    }

    @Override
    public void setAutoRepairLicense(String value) {
        setFieldValueForCodegen(AUTOREPAIRLICENSE_PROP.get(), value);
    }

    @Override
    public Boolean isIsFranchise() {
        return ((Boolean) getFieldValue(ISFRANCHISE_PROP.get()));
    }

    @Override
    public void setIsFranchise(Boolean value) {
        setFieldValue(ISFRANCHISE_PROP.get(), value);
    }

    @Override
    public String getTowingProvider() {
        return ((String) getFieldValueForCodegen(TOWINGPROVIDER_PROP.get()));
    }

    @Override
    public void setTowingProvider(String value) {
        setFieldValueForCodegen(TOWINGPROVIDER_PROP.get(), value);
    }

}
