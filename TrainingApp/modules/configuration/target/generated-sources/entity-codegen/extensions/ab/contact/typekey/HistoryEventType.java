
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class HistoryEventType
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<HistoryEventType> TYPE = new TypeListIntrinsicTypeCache<HistoryEventType>("HistoryEventType");
    /**
     * Assigned
     * ABContact assigned user was set or reset
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.HistoryEventType> TC_ASSIGNED = new TypeKeyCache<extensions.ab.contact.typekey.HistoryEventType>(extensions.ab.contact.typekey.HistoryEventType.TYPE, "assigned");
    /**
     * Created
     * ABContact was created
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.HistoryEventType> TC_CREATED = new TypeKeyCache<extensions.ab.contact.typekey.HistoryEventType>(extensions.ab.contact.typekey.HistoryEventType.TYPE, "created");
    /**
     * Flagged
     * ABContact was flagged
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.HistoryEventType> TC_FLAGGED = new TypeKeyCache<extensions.ab.contact.typekey.HistoryEventType>(extensions.ab.contact.typekey.HistoryEventType.TYPE, "flagged");
    /**
     * Unflagged
     * ABContact was unflagged
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.HistoryEventType> TC_UNFLAGGED = new TypeKeyCache<extensions.ab.contact.typekey.HistoryEventType>(extensions.ab.contact.typekey.HistoryEventType.TYPE, "unflagged");
    /**
     * Viewed
     * ABContact was viewed
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.HistoryEventType> TC_VIEWED = new TypeKeyCache<extensions.ab.contact.typekey.HistoryEventType>(extensions.ab.contact.typekey.HistoryEventType.TYPE, "viewed");

    public HistoryEventType(ITypeList type, String code) {
        super(type, code);
    }

    public static HistoryEventType getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<HistoryEventType> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
