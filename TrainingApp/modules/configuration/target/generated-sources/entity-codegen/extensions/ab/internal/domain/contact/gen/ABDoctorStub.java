
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.ab.domain.addressbook.impl.ABPersonVendorImpl;
import extensions.ab.contact.typekey.DoctorCategoryType;
import extensions.ab.contact.typekey.DoctorSpecialtyType;
import gw.pl.contact.typekey.SpecialtyType;

public abstract class ABDoctorStub
    extends ABPersonVendorImpl
    implements ABDoctorInternalStubI
{


    @Override
    public String getMedicalLicense() {
        return ((String) getFieldValueForCodegen(MEDICALLICENSE_PROP.get()));
    }

    @Override
    public void setMedicalLicense(String value) {
        setFieldValueForCodegen(MEDICALLICENSE_PROP.get(), value);
    }

    @Override
    public SpecialtyType getDoctorSpecialty() {
        return ((SpecialtyType) getFieldValue(DOCTORSPECIALTY_PROP.get()));
    }

    @Override
    public void setDoctorSpecialty(SpecialtyType value) {
        setFieldValue(DOCTORSPECIALTY_PROP.get(), value);
    }

    @Override
    public DoctorCategoryType getCategory() {
        return ((DoctorCategoryType) getFieldValue(CATEGORY_PROP.get()));
    }

    @Override
    public void setCategory(DoctorCategoryType value) {
        setFieldValue(CATEGORY_PROP.get(), value);
    }

    @Override
    public DoctorSpecialtyType getSpecialty() {
        return ((DoctorSpecialtyType) getFieldValue(SPECIALTY_PROP.get()));
    }

    @Override
    public void setSpecialty(DoctorSpecialtyType value) {
        setFieldValue(SPECIALTY_PROP.get(), value);
    }

}
