
package extensions.ab.internal.domain.community.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import gw.entity.IColumnPropertyInfo;
import gw.pl.community.entity.Group;
import gw.pl.persistence.type.EntityPropertyInfoReference;

public interface GroupExtMethodsStubI {

    EntityPropertyInfoReference<IColumnPropertyInfo> NAMEKANJI_PROP = new ColumnPropertyInfoCache(Group.TYPE, "NameKanji");

    /**
     * Gets the value of the NameKanji field.
     * The group name in Kanji. Used only for Japanese and will be null otherwise.
     * 
     */
    String getNameKanji();

    /**
     * Sets the value of the NameKanji field.
     * 
     */
    void setNameKanji(String value);

}
