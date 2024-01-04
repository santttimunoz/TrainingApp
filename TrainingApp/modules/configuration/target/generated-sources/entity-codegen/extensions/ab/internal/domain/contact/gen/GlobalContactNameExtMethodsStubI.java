
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.commons.metadata.types.ColumnDynPropertyInfo;
import gw.entity.IColumnPropertyInfo;
import gw.pl.persistence.type.DynamicEntityPropertyInfoReference;

public interface GlobalContactNameExtMethodsStubI {

    DynamicEntityPropertyInfoReference<IColumnPropertyInfo> NAMEKANJI_DYNPROP = new ColumnDynPropertyInfo("NameKanji", "NameKanji");

    /**
     * Gets the value of the NameKanji field.
     * This contact's name in kanji (used only for Japanese names and will be null otherwise)
     * 
     */
    String getNameKanji();

    /**
     * Sets the value of the NameKanji field.
     * 
     */
    void setNameKanji(String value);

}
