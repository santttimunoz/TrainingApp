
package extensions.ab.internal.domain.community.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import gw.entity.IColumnPropertyInfo;
import gw.pl.community.entity.GroupSearchCriteria;
import gw.pl.persistence.type.EntityPropertyInfoReference;

public interface GroupSearchCriteriaExtMethodsStubI {

    EntityPropertyInfoReference<IColumnPropertyInfo> GROUPNAMEKANJI_PROP = new ColumnPropertyInfoCache(GroupSearchCriteria.TYPE, "GroupNameKanji");

    /**
     * Gets the value of the GroupNameKanji field.
     * Group name to search for in kanji (used only for Japanese).
     * 
     */
    String getGroupNameKanji();

    /**
     * Sets the value of the GroupNameKanji field.
     * 
     */
    void setGroupNameKanji(String value);

}
