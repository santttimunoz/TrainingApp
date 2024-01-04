
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class LegalCaseReportStatus
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<LegalCaseReportStatus> TYPE = new TypeListIntrinsicTypeCache<LegalCaseReportStatus>("LegalCaseReportStatus");
    /**
     * Never requested
     * Never requested
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseReportStatus> TC_NEVER_REQUESTED = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseReportStatus>(extensions.ab.contact.typekey.LegalCaseReportStatus.TYPE, "never_requested");
    /**
     * Requested and pending
     * Requested and pending
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseReportStatus> TC_REQUESTED_PENDING = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseReportStatus>(extensions.ab.contact.typekey.LegalCaseReportStatus.TYPE, "requested_pending");
    /**
     * Requested and received
     * Requested and received
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseReportStatus> TC_REQUESTED_RECEIVED = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseReportStatus>(extensions.ab.contact.typekey.LegalCaseReportStatus.TYPE, "requested_received");

    public LegalCaseReportStatus(ITypeList type, String code) {
        super(type, code);
    }

    public static LegalCaseReportStatus getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<LegalCaseReportStatus> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
