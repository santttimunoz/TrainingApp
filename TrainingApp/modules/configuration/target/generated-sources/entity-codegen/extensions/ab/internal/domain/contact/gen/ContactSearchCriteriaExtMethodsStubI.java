
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import gw.entity.IColumnPropertyInfo;
import gw.pl.contact.entity.ContactSearchCriteria;
import gw.pl.persistence.type.EntityPropertyInfoReference;

public interface ContactSearchCriteriaExtMethodsStubI {

    EntityPropertyInfoReference<IColumnPropertyInfo> FIRSTNAMEKANJI_PROP = new ColumnPropertyInfoCache(ContactSearchCriteria.TYPE, "FirstNameKanji");
    EntityPropertyInfoReference<IColumnPropertyInfo> KEYWORDKANJI_PROP = new ColumnPropertyInfoCache(ContactSearchCriteria.TYPE, "KeywordKanji");

    /**
     * Gets the value of the FirstNameKanji field.
     * First name in kanji (used only for Japanese names)
     * 
     */
    String getFirstNameKanji();

    /**
     * Sets the value of the FirstNameKanji field.
     * 
     */
    void setFirstNameKanji(String value);

    /**
     * Gets the value of the KeywordKanji field.
     * KeywordKanji is the general term for NameKanji (Companies and Places) and LastNameKanji (for Persons)
     * 
     */
    String getKeywordKanji();

    /**
     * Sets the value of the KeywordKanji field.
     * 
     */
    void setKeywordKanji(String value);

}
