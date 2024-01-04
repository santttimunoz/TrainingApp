
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class CatastropheType
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<CatastropheType> TYPE = new TypeListIntrinsicTypeCache<CatastropheType>("CatastropheType");
    /**
     * Internal
     * Internal
     * 
     */
    public final static TypeKeyReference<CatastropheType> TC_INTERNAL = new TypeKeyCache<CatastropheType>(CatastropheType.TYPE, "internal");
    /**
     * ISO
     * ISO
     * 
     */
    public final static TypeKeyReference<CatastropheType> TC_ISO = new TypeKeyCache<CatastropheType>(CatastropheType.TYPE, "iso");

    public CatastropheType(ITypeList type, String code) {
        super(type, code);
    }

    public static CatastropheType getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<CatastropheType> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
