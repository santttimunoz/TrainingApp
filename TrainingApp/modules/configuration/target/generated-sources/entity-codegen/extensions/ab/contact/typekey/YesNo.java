
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class YesNo
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<YesNo> TYPE = new TypeListIntrinsicTypeCache<YesNo>("YesNo");
    /**
     * No
     * No
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.YesNo> TC_NO = new TypeKeyCache<extensions.ab.contact.typekey.YesNo>(extensions.ab.contact.typekey.YesNo.TYPE, "no");
    /**
     * Unknown
     * Unknown
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.YesNo> TC_UNKNOWN = new TypeKeyCache<extensions.ab.contact.typekey.YesNo>(extensions.ab.contact.typekey.YesNo.TYPE, "unknown");
    /**
     * Yes
     * Yes
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.YesNo> TC_YES = new TypeKeyCache<extensions.ab.contact.typekey.YesNo>(extensions.ab.contact.typekey.YesNo.TYPE, "yes");

    public YesNo(ITypeList type, String code) {
        super(type, code);
    }

    public static YesNo getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<YesNo> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
