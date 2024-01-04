
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.ab.domain.addressbook.impl.ABPersonVendorImpl;
import extensions.ab.addressbook.typekey.LegalSpecialty;

public abstract class ABAttorneyStub
    extends ABPersonVendorImpl
    implements ABAttorneyInternalStubI
{


    @Override
    public String getAttorneyLicense() {
        return ((String) getFieldValueForCodegen(ATTORNEYLICENSE_PROP.get()));
    }

    @Override
    public void setAttorneyLicense(String value) {
        setFieldValueForCodegen(ATTORNEYLICENSE_PROP.get(), value);
    }

    @Override
    public LegalSpecialty getAttorneySpecialty() {
        return ((LegalSpecialty) getFieldValue(ATTORNEYSPECIALTY_PROP.get()));
    }

    @Override
    public void setAttorneySpecialty(LegalSpecialty value) {
        setFieldValue(ATTORNEYSPECIALTY_PROP.get(), value);
    }

}
