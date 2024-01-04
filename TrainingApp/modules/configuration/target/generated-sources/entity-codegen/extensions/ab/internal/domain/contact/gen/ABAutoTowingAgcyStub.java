
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.ab.domain.addressbook.impl.ABCompanyVendorImpl;

public abstract class ABAutoTowingAgcyStub
    extends ABCompanyVendorImpl
    implements ABAutoTowingAgcyInternalStubI
{


    @Override
    public String getAutoTowingLicense() {
        return ((String) getFieldValueForCodegen(AUTOTOWINGLICENSE_PROP.get()));
    }

    @Override
    public void setAutoTowingLicense(String value) {
        setFieldValueForCodegen(AUTOTOWINGLICENSE_PROP.get(), value);
    }

}
