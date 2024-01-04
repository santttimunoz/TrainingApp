
package extensions.ab.internal.domain.custom.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import gw.entity.IColumnPropertyInfo;
import gw.pl.custom.entity.NameCriteria;
import gw.pl.persistence.type.EntityPropertyInfoReference;

public interface NameCriteriaExtMethodsStubI {

    EntityPropertyInfoReference<IColumnPropertyInfo> COMPANYNAMEKANJI_PROP = new ColumnPropertyInfoCache(NameCriteria.TYPE, "CompanyNameKanji");
    EntityPropertyInfoReference<IColumnPropertyInfo> FIRSTNAMEKANJI_PROP = new ColumnPropertyInfoCache(NameCriteria.TYPE, "FirstNameKanji");
    EntityPropertyInfoReference<IColumnPropertyInfo> LASTNAMEKANJI_PROP = new ColumnPropertyInfoCache(NameCriteria.TYPE, "LastNameKanji");
    EntityPropertyInfoReference<IColumnPropertyInfo> NAMEKANJI_PROP = new ColumnPropertyInfoCache(NameCriteria.TYPE, "NameKanji");

    /**
     * Gets the value of the CompanyNameKanji field.
     * The company name, if searching for a company, in kanji.  Used only for Japanese names and will be null otherwise.
     * 
     */
    String getCompanyNameKanji();

    /**
     * Sets the value of the CompanyNameKanji field.
     * 
     */
    void setCompanyNameKanji(String value);

    /**
     * Gets the value of the FirstNameKanji field.
     * The first name, if searching for a person, in kanji.  Used only for Japanese names and will be null otherwise.
     * 
     */
    String getFirstNameKanji();

    /**
     * Sets the value of the FirstNameKanji field.
     * 
     */
    void setFirstNameKanji(String value);

    /**
     * Gets the value of the LastNameKanji field.
     * The last name, if searching for a person, in kanji.  Used only for Japanese names and will be null otherwise.
     * 
     */
    String getLastNameKanji();

    /**
     * Sets the value of the LastNameKanji field.
     * 
     */
    void setLastNameKanji(String value);

    /**
     * Gets the value of the NameKanji field.
     * The last name or the first name in kanji.  Used only for Japanese names and will be null otherwise.
     * 
     */
    String getNameKanji();

    /**
     * Sets the value of the NameKanji field.
     * 
     */
    void setNameKanji(String value);

}
