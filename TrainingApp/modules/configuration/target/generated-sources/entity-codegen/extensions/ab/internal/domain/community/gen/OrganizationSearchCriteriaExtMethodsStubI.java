
package extensions.ab.internal.domain.community.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import gw.entity.IColumnPropertyInfo;
import gw.pl.community.entity.OrganizationSearchCriteria;
import gw.pl.persistence.type.EntityPropertyInfoReference;

public interface OrganizationSearchCriteriaExtMethodsStubI {

    EntityPropertyInfoReference<IColumnPropertyInfo> NAMEKANJI_PROP = new ColumnPropertyInfoCache(OrganizationSearchCriteria.TYPE, "NameKanji");
    EntityPropertyInfoReference<IColumnPropertyInfo> CONTACTCITYKANJI_PROP = new ColumnPropertyInfoCache(OrganizationSearchCriteria.TYPE, "ContactCityKanji");

    /**
     * Gets the value of the NameKanji field.
     * The kanji name of the organization. Used only for Japanese.
     * 
     */
    String getNameKanji();

    /**
     * Sets the value of the NameKanji field.
     * 
     */
    void setNameKanji(String value);

    /**
     * Gets the value of the ContactCityKanji field.
     * The contact city kanji for the organization. Used only for Japanese.
     * 
     */
    String getContactCityKanji();

    /**
     * Sets the value of the ContactCityKanji field.
     * 
     */
    void setContactCityKanji(String value);

}
