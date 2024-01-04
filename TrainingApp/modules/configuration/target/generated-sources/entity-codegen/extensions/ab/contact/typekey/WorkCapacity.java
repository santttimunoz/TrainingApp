
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class WorkCapacity
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<WorkCapacity> TYPE = new TypeListIntrinsicTypeCache<WorkCapacity>("WorkCapacity");
    /**
     * Estimated RTW date
     * Estimated RTW date
     * 
     */
    public final static TypeKeyReference<WorkCapacity> TC_ESTIMATEDRTW = new TypeKeyCache<WorkCapacity>(WorkCapacity.TYPE, "estimatedrtw");
    /**
     * RTW - full duty
     * Full duty
     * 
     */
    public final static TypeKeyReference<WorkCapacity> TC_FULLDUTY = new TypeKeyCache<WorkCapacity>(WorkCapacity.TYPE, "fullduty");
    /**
     * RTW - modified duty
     * Modified duty
     * 
     */
    public final static TypeKeyReference<WorkCapacity> TC_MODIFIEDDUTY = new TypeKeyCache<WorkCapacity>(WorkCapacity.TYPE, "modifiedduty");
    /**
     * Stopped work
     * Stopped work
     * 
     */
    public final static TypeKeyReference<WorkCapacity> TC_STOPPED_WORK = new TypeKeyCache<WorkCapacity>(WorkCapacity.TYPE, "stopped_work");

    public WorkCapacity(ITypeList type, String code) {
        super(type, code);
    }

    public static WorkCapacity getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<WorkCapacity> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
