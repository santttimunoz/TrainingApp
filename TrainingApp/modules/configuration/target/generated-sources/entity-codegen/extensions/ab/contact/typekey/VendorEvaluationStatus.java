
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class VendorEvaluationStatus
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<VendorEvaluationStatus> TYPE = new TypeListIntrinsicTypeCache<VendorEvaluationStatus>("VendorEvaluationStatus");
    /**
     * Pending
     * Pending
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.VendorEvaluationStatus> TC_PENDING = new TypeKeyCache<extensions.ab.contact.typekey.VendorEvaluationStatus>(extensions.ab.contact.typekey.VendorEvaluationStatus.TYPE, "pending");
    /**
     * Unknown
     * Unknown
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.VendorEvaluationStatus> TC_UNKNOWN = new TypeKeyCache<extensions.ab.contact.typekey.VendorEvaluationStatus>(extensions.ab.contact.typekey.VendorEvaluationStatus.TYPE, "unknown");
    /**
     * Unverified
     * Unverified
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.VendorEvaluationStatus> TC_UNVERIFIED = new TypeKeyCache<extensions.ab.contact.typekey.VendorEvaluationStatus>(extensions.ab.contact.typekey.VendorEvaluationStatus.TYPE, "unverified");
    /**
     * Verified
     * Verified
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.VendorEvaluationStatus> TC_VERIFIED = new TypeKeyCache<extensions.ab.contact.typekey.VendorEvaluationStatus>(extensions.ab.contact.typekey.VendorEvaluationStatus.TYPE, "verified");

    public VendorEvaluationStatus(ITypeList type, String code) {
        super(type, code);
    }

    public static VendorEvaluationStatus getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<VendorEvaluationStatus> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
