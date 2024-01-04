
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class VerificationStatus
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<VerificationStatus> TYPE = new TypeListIntrinsicTypeCache<VerificationStatus>("VerificationStatus");
    /**
     * Invalid
     * Invalid
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.VerificationStatus> TC_INVALID = new TypeKeyCache<extensions.ab.contact.typekey.VerificationStatus>(extensions.ab.contact.typekey.VerificationStatus.TYPE, "invalid");
    /**
     * Pending
     * Pending
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.VerificationStatus> TC_PENDING = new TypeKeyCache<extensions.ab.contact.typekey.VerificationStatus>(extensions.ab.contact.typekey.VerificationStatus.TYPE, "pending");
    /**
     * Verified
     * Verified
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.VerificationStatus> TC_VERIFIED = new TypeKeyCache<extensions.ab.contact.typekey.VerificationStatus>(extensions.ab.contact.typekey.VerificationStatus.TYPE, "verified");

    public VerificationStatus(ITypeList type, String code) {
        super(type, code);
    }

    public static VerificationStatus getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<VerificationStatus> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
