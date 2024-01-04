
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class DoctorCategoryType
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<DoctorCategoryType> TYPE = new TypeListIntrinsicTypeCache<DoctorCategoryType>("DoctorCategoryType");
    /**
     * General Care
     * General Care
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorCategoryType> TC_GENERALCARE = new TypeKeyCache<extensions.ab.contact.typekey.DoctorCategoryType>(extensions.ab.contact.typekey.DoctorCategoryType.TYPE, "GeneralCare");
    /**
     * Immediate Care
     * Immediate Care
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorCategoryType> TC_IMMEDIATECARE = new TypeKeyCache<extensions.ab.contact.typekey.DoctorCategoryType>(extensions.ab.contact.typekey.DoctorCategoryType.TYPE, "ImmediateCare");
    /**
     * Long-Term Care
     * Long-Term Care
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorCategoryType> TC_LONGTERMCARE = new TypeKeyCache<extensions.ab.contact.typekey.DoctorCategoryType>(extensions.ab.contact.typekey.DoctorCategoryType.TYPE, "LongTermCare");
    /**
     * Surgery
     * Surgery
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorCategoryType> TC_SURGERY = new TypeKeyCache<extensions.ab.contact.typekey.DoctorCategoryType>(extensions.ab.contact.typekey.DoctorCategoryType.TYPE, "Surgery");
    /**
     * Unspecified
     * Unspecified
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorCategoryType> TC_UNSPECIFIED = new TypeKeyCache<extensions.ab.contact.typekey.DoctorCategoryType>(extensions.ab.contact.typekey.DoctorCategoryType.TYPE, "Unspecified");

    public DoctorCategoryType(ITypeList type, String code) {
        super(type, code);
    }

    public static DoctorCategoryType getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<DoctorCategoryType> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
