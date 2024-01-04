
package extensions.ab.internal.domain.addressbook.gen;

import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import extensions.ab.addressbook.typekey.AdjudicativeDomain;
import extensions.ab.addressbook.typekey.LegalSpecialty;
import gw.ab.addressbook.entity.RelatedABContactSearchCriteria;
import gw.pl.contact.typekey.SpecialtyType;

public abstract class RelatedABContactSearchCriteriaExtMethodsStub
    extends AspectBase
    implements RelatedABContactSearchCriteriaExtInternalMethodsStubI
{


    protected RelatedABContactSearchCriteriaExtMethodsStub(RelatedABContactSearchCriteria owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public RelatedABContactSearchCriteria getOwner() {
        return ((RelatedABContactSearchCriteria) super.getOwner());
    }

    @Override
    public AdjudicativeDomain getAdjudicativeDomain() {
        return ((AdjudicativeDomain) getFieldValue(ADJUDICATIVEDOMAIN_PROP.get()));
    }

    @Override
    public void setAdjudicativeDomain(AdjudicativeDomain value) {
        setFieldValue(ADJUDICATIVEDOMAIN_PROP.get(), value);
    }

    @Override
    public LegalSpecialty getAttorneySpecialty() {
        return ((LegalSpecialty) getFieldValue(ATTORNEYSPECIALTY_PROP.get()));
    }

    @Override
    public void setAttorneySpecialty(LegalSpecialty value) {
        setFieldValue(ATTORNEYSPECIALTY_PROP.get(), value);
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
    public SpecialtyType getMedicalOrgSpecialty() {
        return ((SpecialtyType) getFieldValue(MEDICALORGSPECIALTY_PROP.get()));
    }

    @Override
    public void setMedicalOrgSpecialty(SpecialtyType value) {
        setFieldValue(MEDICALORGSPECIALTY_PROP.get(), value);
    }

    @Override
    public LegalSpecialty getLawFirmSpecialty() {
        return ((LegalSpecialty) getFieldValue(LAWFIRMSPECIALTY_PROP.get()));
    }

    @Override
    public void setLawFirmSpecialty(LegalSpecialty value) {
        setFieldValue(LAWFIRMSPECIALTY_PROP.get(), value);
    }

}
