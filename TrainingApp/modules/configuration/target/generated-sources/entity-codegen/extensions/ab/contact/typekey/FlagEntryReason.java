
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class FlagEntryReason
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<FlagEntryReason> TYPE = new TypeListIntrinsicTypeCache<FlagEntryReason>("FlagEntryReason");
    /**
     * Doctor specialty is unspecified.
     * Doctor Specialty Unspecified
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.FlagEntryReason> TC_DOCTOR_SPECIALTY_UNSPECIFIED = new TypeKeyCache<extensions.ab.contact.typekey.FlagEntryReason>(extensions.ab.contact.typekey.FlagEntryReason.TYPE, "doctor_specialty_unspecified");
    /**
     * Report of insurance fraud.
     * Report of insurance fraud
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.FlagEntryReason> TC_FRAUDULENT_ACTIVITY = new TypeKeyCache<extensions.ab.contact.typekey.FlagEntryReason>(extensions.ab.contact.typekey.FlagEntryReason.TYPE, "fraudulent_activity");
    /**
     * Primary address is no longer valid.
     * Invalid address
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.FlagEntryReason> TC_INVALID_ADDRESS = new TypeKeyCache<extensions.ab.contact.typekey.FlagEntryReason>(extensions.ab.contact.typekey.FlagEntryReason.TYPE, "invalid_address");
    /**
     * No email address for this contact.
     * No email
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.FlagEntryReason> TC_NO_EMAIL = new TypeKeyCache<extensions.ab.contact.typekey.FlagEntryReason>(extensions.ab.contact.typekey.FlagEntryReason.TYPE, "no_email");
    /**
     * Legal case report is overdue.
     * Legal case report is overdue.
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.FlagEntryReason> TC_OVERDUE_LEGAL_REPORT = new TypeKeyCache<extensions.ab.contact.typekey.FlagEntryReason>(extensions.ab.contact.typekey.FlagEntryReason.TYPE, "overdue_legal_report");
    /**
     * Preferred vendor with no fax number.
     * No vendor fax
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.FlagEntryReason> TC_VENDOR_FAX = new TypeKeyCache<extensions.ab.contact.typekey.FlagEntryReason>(extensions.ab.contact.typekey.FlagEntryReason.TYPE, "vendor_fax");

    public FlagEntryReason(ITypeList type, String code) {
        super(type, code);
    }

    public static FlagEntryReason getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<FlagEntryReason> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
