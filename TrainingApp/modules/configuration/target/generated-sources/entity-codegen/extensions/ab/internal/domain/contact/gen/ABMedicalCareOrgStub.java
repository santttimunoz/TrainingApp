
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.ab.domain.addressbook.impl.ABCompanyVendorImpl;
import gw.pl.contact.typekey.SpecialtyType;

public abstract class ABMedicalCareOrgStub
    extends ABCompanyVendorImpl
    implements ABMedicalCareOrgInternalStubI
{


    @Override
    public SpecialtyType getMedicalOrgSpecialty() {
        return ((SpecialtyType) getFieldValue(MEDICALORGSPECIALTY_PROP.get()));
    }

    @Override
    public void setMedicalOrgSpecialty(SpecialtyType value) {
        setFieldValue(MEDICALORGSPECIALTY_PROP.get(), value);
    }

    @Override
    public Boolean isIsMemberOfNetwork() {
        return ((Boolean) getFieldValue(ISMEMBEROFNETWORK_PROP.get()));
    }

    @Override
    public void setIsMemberOfNetwork(Boolean value) {
        setFieldValue(ISMEMBEROFNETWORK_PROP.get(), value);
    }

    @Override
    public String getNetworkName() {
        return ((String) getFieldValueForCodegen(NETWORKNAME_PROP.get()));
    }

    @Override
    public void setNetworkName(String value) {
        setFieldValueForCodegen(NETWORKNAME_PROP.get(), value);
    }

}
