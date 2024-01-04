
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class UserAttributeSubType
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<UserAttributeSubType> TYPE = new TypeListIntrinsicTypeCache<UserAttributeSubType>("UserAttributeSubType");
    /**
     * Acme
     * Acme
     * 
     */
    public final static TypeKeyReference<UserAttributeSubType> TC_ACME = new TypeKeyCache<UserAttributeSubType>(UserAttributeSubType.TYPE, "Acme");
    /**
     * French
     * French
     * 
     */
    public final static TypeKeyReference<UserAttributeSubType> TC_FRENCH = new TypeKeyCache<UserAttributeSubType>(UserAttributeSubType.TYPE, "French");
    /**
     * German
     * German
     * 
     */
    public final static TypeKeyReference<UserAttributeSubType> TC_GERMAN = new TypeKeyCache<UserAttributeSubType>(UserAttributeSubType.TYPE, "German");
    /**
     * Mold
     * Mold
     * 
     */
    public final static TypeKeyReference<UserAttributeSubType> TC_MOLD = new TypeKeyCache<UserAttributeSubType>(UserAttributeSubType.TYPE, "Mold");
    /**
     * Product Liability
     * Product Liability
     * 
     */
    public final static TypeKeyReference<UserAttributeSubType> TC_PRODLIAB = new TypeKeyCache<UserAttributeSubType>(UserAttributeSubType.TYPE, "ProdLiab");
    /**
     * Spanish
     * Spanish
     * 
     */
    public final static TypeKeyReference<UserAttributeSubType> TC_SPANISH = new TypeKeyCache<UserAttributeSubType>(UserAttributeSubType.TYPE, "Spanish");
    /**
     * TipTop Roofing
     * TipTop Roofing
     * 
     */
    public final static TypeKeyReference<UserAttributeSubType> TC_TIPTOP = new TypeKeyCache<UserAttributeSubType>(UserAttributeSubType.TYPE, "TipTop");
    /**
     * Environmental
     * Environmental Torts
     * 
     */
    public final static TypeKeyReference<UserAttributeSubType> TC_ENV = new TypeKeyCache<UserAttributeSubType>(UserAttributeSubType.TYPE, "env");

    public UserAttributeSubType(ITypeList type, String code) {
        super(type, code);
    }

    public static UserAttributeSubType getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<UserAttributeSubType> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
