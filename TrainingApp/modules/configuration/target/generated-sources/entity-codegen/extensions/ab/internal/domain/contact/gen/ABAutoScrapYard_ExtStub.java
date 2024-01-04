
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.ab.domain.addressbook.impl.ABCompanyVendorImpl;

public abstract class ABAutoScrapYard_ExtStub
    extends ABCompanyVendorImpl
    implements ABAutoScrapYard_ExtInternalStubI
{


    @Override
    public Boolean isCanPickUpVehicles() {
        return ((Boolean) getFieldValue(CANPICKUPVEHICLES_PROP.get()));
    }

    @Override
    public void setCanPickUpVehicles(Boolean value) {
        setFieldValue(CANPICKUPVEHICLES_PROP.get(), value);
    }

}
