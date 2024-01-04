
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.ab.domain.addressbook.impl.ABCompanyVendorImpl;
import extensions.ab.addressbook.typekey.LegalSpecialty;

public abstract class ABLawFirmStub
    extends ABCompanyVendorImpl
    implements ABLawFirmInternalStubI
{


    @Override
    public LegalSpecialty getLawFirmSpecialty() {
        return ((LegalSpecialty) getFieldValue(LAWFIRMSPECIALTY_PROP.get()));
    }

    @Override
    public void setLawFirmSpecialty(LegalSpecialty value) {
        setFieldValue(LAWFIRMSPECIALTY_PROP.get(), value);
    }

}
