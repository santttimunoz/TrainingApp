
package extensions.ab.internal.domain.addressbook.gen;

import com.guidewire.ab.domain.addressbook.impl.RelatedABContactSearchCriteriaImpl;
import extensions.ab.addressbook.typekey.AdjudicativeDomain;
import extensions.ab.addressbook.typekey.LegalSpecialty;
import extensions.ab.internal.domain.addressbook.impl.RelatedABContactSearchCriteriaExtInternal;
import extensions.ab.internal.domain.addressbook.impl.RelatedABContactSearchCriteriaExtMethodsImpl;
import gw.pl.contact.typekey.SpecialtyType;

public class RelatedABContactSearchCriteriaExtStub
    extends RelatedABContactSearchCriteriaImpl
    implements RelatedABContactSearchCriteriaExtInternal
{


    @Override
    public AdjudicativeDomain getAdjudicativeDomain() {
        return getExtensionDelegate(RelatedABContactSearchCriteriaExtMethodsImpl.class).getAdjudicativeDomain();
    }

    @Override
    public void setAdjudicativeDomain(AdjudicativeDomain value) {
        getExtensionDelegate(RelatedABContactSearchCriteriaExtMethodsImpl.class).setAdjudicativeDomain(value);
    }

    @Override
    public LegalSpecialty getAttorneySpecialty() {
        return getExtensionDelegate(RelatedABContactSearchCriteriaExtMethodsImpl.class).getAttorneySpecialty();
    }

    @Override
    public void setAttorneySpecialty(LegalSpecialty value) {
        getExtensionDelegate(RelatedABContactSearchCriteriaExtMethodsImpl.class).setAttorneySpecialty(value);
    }

    @Override
    public SpecialtyType getDoctorSpecialty() {
        return getExtensionDelegate(RelatedABContactSearchCriteriaExtMethodsImpl.class).getDoctorSpecialty();
    }

    @Override
    public void setDoctorSpecialty(SpecialtyType value) {
        getExtensionDelegate(RelatedABContactSearchCriteriaExtMethodsImpl.class).setDoctorSpecialty(value);
    }

    @Override
    public SpecialtyType getMedicalOrgSpecialty() {
        return getExtensionDelegate(RelatedABContactSearchCriteriaExtMethodsImpl.class).getMedicalOrgSpecialty();
    }

    @Override
    public void setMedicalOrgSpecialty(SpecialtyType value) {
        getExtensionDelegate(RelatedABContactSearchCriteriaExtMethodsImpl.class).setMedicalOrgSpecialty(value);
    }

    @Override
    public LegalSpecialty getLawFirmSpecialty() {
        return getExtensionDelegate(RelatedABContactSearchCriteriaExtMethodsImpl.class).getLawFirmSpecialty();
    }

    @Override
    public void setLawFirmSpecialty(LegalSpecialty value) {
        getExtensionDelegate(RelatedABContactSearchCriteriaExtMethodsImpl.class).setLawFirmSpecialty(value);
    }

}
