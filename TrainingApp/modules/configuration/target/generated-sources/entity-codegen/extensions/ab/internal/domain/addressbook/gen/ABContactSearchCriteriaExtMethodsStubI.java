
package extensions.ab.internal.domain.addressbook.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.addressbook.typekey.AdjudicativeDomain;
import extensions.ab.addressbook.typekey.LegalSpecialty;
import gw.ab.addressbook.entity.ABContactSearchCriteria;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.contact.typekey.SpecialtyType;
import gw.pl.persistence.type.EntityPropertyInfoReference;

public interface ABContactSearchCriteriaExtMethodsStubI {

    EntityPropertyInfoReference<IColumnPropertyInfo> KEYWORDKANJI_PROP = new ColumnPropertyInfoCache(ABContactSearchCriteria.TYPE, "KeywordKanji");
    EntityPropertyInfoReference<IColumnPropertyInfo> FIRSTNAMEKANJI_PROP = new ColumnPropertyInfoCache(ABContactSearchCriteria.TYPE, "FirstNameKanji");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> ADJUDICATIVEDOMAIN_PROP = new TypekeyPropertyInfoCache(ABContactSearchCriteria.TYPE, "AdjudicativeDomain");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> ATTORNEYSPECIALTY_PROP = new TypekeyPropertyInfoCache(ABContactSearchCriteria.TYPE, "AttorneySpecialty");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> DOCTORSPECIALTY_PROP = new TypekeyPropertyInfoCache(ABContactSearchCriteria.TYPE, "DoctorSpecialty");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> MEDICALORGSPECIALTY_PROP = new TypekeyPropertyInfoCache(ABContactSearchCriteria.TYPE, "MedicalOrgSpecialty");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> LAWFIRMSPECIALTY_PROP = new TypekeyPropertyInfoCache(ABContactSearchCriteria.TYPE, "LawFirmSpecialty");

    /**
     * Gets the value of the KeywordKanji field.
     * Name/LastName in kanji.  Used only for Japanese names and will be null otherwise.
     * 
     */
    String getKeywordKanji();

    /**
     * Sets the value of the KeywordKanji field.
     * 
     */
    void setKeywordKanji(String value);

    /**
     * Gets the value of the FirstNameKanji field.
     * First name in kanji.  Used only for Japanese names and will be null otherwise.
     * 
     */
    String getFirstNameKanji();

    /**
     * Sets the value of the FirstNameKanji field.
     * 
     */
    void setFirstNameKanji(String value);

    /**
     * Gets the value of the AdjudicativeDomain field.
     * Adjudicative Domain
     * 
     */
    AdjudicativeDomain getAdjudicativeDomain();

    /**
     * Sets the value of the AdjudicativeDomain field.
     * 
     */
    void setAdjudicativeDomain(AdjudicativeDomain value);

    /**
     * Gets the value of the AttorneySpecialty field.
     * Attorney's specialty
     * 
     */
    LegalSpecialty getAttorneySpecialty();

    /**
     * Sets the value of the AttorneySpecialty field.
     * 
     */
    void setAttorneySpecialty(LegalSpecialty value);

    /**
     * Gets the value of the DoctorSpecialty field.
     * Doctor's specialty
     * 
     */
    SpecialtyType getDoctorSpecialty();

    /**
     * Sets the value of the DoctorSpecialty field.
     * 
     */
    void setDoctorSpecialty(SpecialtyType value);

    /**
     * Gets the value of the MedicalOrgSpecialty field.
     * Medical specialty type
     * 
     */
    SpecialtyType getMedicalOrgSpecialty();

    /**
     * Sets the value of the MedicalOrgSpecialty field.
     * 
     */
    void setMedicalOrgSpecialty(SpecialtyType value);

    /**
     * Gets the value of the LawFirmSpecialty field.
     * Law firm Specialty
     * 
     */
    LegalSpecialty getLawFirmSpecialty();

    /**
     * Sets the value of the LawFirmSpecialty field.
     * 
     */
    void setLawFirmSpecialty(LegalSpecialty value);

}
