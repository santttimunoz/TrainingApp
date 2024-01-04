
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class ContactTier
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<ContactTier> TYPE = new TypeListIntrinsicTypeCache<ContactTier>("ContactTier");
    /**
     * Gold
     * Gold
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ContactTier> TC_GOLD = new TypeKeyCache<extensions.ab.contact.typekey.ContactTier>(extensions.ab.contact.typekey.ContactTier.TYPE, "gold");
    /**
     * Platinum
     * Platinum
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ContactTier> TC_PLATINUM = new TypeKeyCache<extensions.ab.contact.typekey.ContactTier>(extensions.ab.contact.typekey.ContactTier.TYPE, "platinum");
    /**
     * Silver
     * Silver
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ContactTier> TC_SILVER = new TypeKeyCache<extensions.ab.contact.typekey.ContactTier>(extensions.ab.contact.typekey.ContactTier.TYPE, "silver");
    /**
     * Unknown
     * Unknown
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ContactTier> TC_UNKNOWN = new TypeKeyCache<extensions.ab.contact.typekey.ContactTier>(extensions.ab.contact.typekey.ContactTier.TYPE, "unknown");

    public ContactTier(ITypeList type, String code) {
        super(type, code);
    }

    public static ContactTier getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<ContactTier> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
