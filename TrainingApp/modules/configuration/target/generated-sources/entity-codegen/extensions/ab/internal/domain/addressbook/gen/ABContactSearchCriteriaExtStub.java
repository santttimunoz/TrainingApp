
package extensions.ab.internal.domain.addressbook.gen;

import com.guidewire.ab.domain.addressbook.impl.ABContactSearchCriteriaImpl;
import extensions.ab.addressbook.typekey.AdjudicativeDomain;
import extensions.ab.addressbook.typekey.LegalSpecialty;
import extensions.ab.internal.domain.addressbook.impl.ABContactSearchCriteriaExtInternal;
import extensions.ab.internal.domain.addressbook.impl.ABContactSearchCriteriaExtMethodsImpl;
import gw.pl.contact.typekey.SpecialtyType;

public class ABContactSearchCriteriaExtStub
    extends ABContactSearchCriteriaImpl
    implements ABContactSearchCriteriaExtInternal
{


    @Override
    public String getKeywordKanji() {
        return getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).getKeywordKanji();
    }

    @Override
    public void setKeywordKanji(String value) {
        getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).setKeywordKanji(value);
    }

    @Override
    public String getFirstNameKanji() {
        return getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).getFirstNameKanji();
    }

    @Override
    public void setFirstNameKanji(String value) {
        getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).setFirstNameKanji(value);
    }

    @Override
    public AdjudicativeDomain getAdjudicativeDomain() {
        return getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).getAdjudicativeDomain();
    }

    @Override
    public void setAdjudicativeDomain(AdjudicativeDomain value) {
        getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).setAdjudicativeDomain(value);
    }

    @Override
    public LegalSpecialty getAttorneySpecialty() {
        return getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).getAttorneySpecialty();
    }

    @Override
    public void setAttorneySpecialty(LegalSpecialty value) {
        getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).setAttorneySpecialty(value);
    }

    @Override
    public SpecialtyType getDoctorSpecialty() {
        return getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).getDoctorSpecialty();
    }

    @Override
    public void setDoctorSpecialty(SpecialtyType value) {
        getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).setDoctorSpecialty(value);
    }

    @Override
    public SpecialtyType getMedicalOrgSpecialty() {
        return getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).getMedicalOrgSpecialty();
    }

    @Override
    public void setMedicalOrgSpecialty(SpecialtyType value) {
        getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).setMedicalOrgSpecialty(value);
    }

    @Override
    public LegalSpecialty getLawFirmSpecialty() {
        return getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).getLawFirmSpecialty();
    }

    @Override
    public void setLawFirmSpecialty(LegalSpecialty value) {
        getExtensionDelegate(ABContactSearchCriteriaExtMethodsImpl.class).setLawFirmSpecialty(value);
    }

}
