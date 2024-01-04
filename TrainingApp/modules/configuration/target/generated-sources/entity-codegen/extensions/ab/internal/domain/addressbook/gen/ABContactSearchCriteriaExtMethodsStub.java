
package extensions.ab.internal.domain.addressbook.gen;

import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import extensions.ab.addressbook.typekey.AdjudicativeDomain;
import extensions.ab.addressbook.typekey.LegalSpecialty;
import gw.ab.addressbook.entity.ABContactSearchCriteria;
import gw.pl.contact.typekey.SpecialtyType;

public abstract class ABContactSearchCriteriaExtMethodsStub
    extends AspectBase
    implements ABContactSearchCriteriaExtInternalMethodsStubI
{


    protected ABContactSearchCriteriaExtMethodsStub(ABContactSearchCriteria owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public ABContactSearchCriteria getOwner() {
        return ((ABContactSearchCriteria) super.getOwner());
    }

    @Override
    public String getKeywordKanji() {
        return ((String) getFieldValueForCodegen(KEYWORDKANJI_PROP.get()));
    }

    @Override
    public void setKeywordKanji(String value) {
        setFieldValueForCodegen(KEYWORDKANJI_PROP.get(), value);
    }

    @Override
    public String getFirstNameKanji() {
        return ((String) getFieldValueForCodegen(FIRSTNAMEKANJI_PROP.get()));
    }

    @Override
    public void setFirstNameKanji(String value) {
        setFieldValueForCodegen(FIRSTNAMEKANJI_PROP.get(), value);
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
