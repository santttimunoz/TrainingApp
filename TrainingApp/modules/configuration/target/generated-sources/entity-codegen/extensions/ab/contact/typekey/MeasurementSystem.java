
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class MeasurementSystem
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<MeasurementSystem> TYPE = new TypeListIntrinsicTypeCache<MeasurementSystem>("MeasurementSystem");
    /**
     * Metric System
     * Metric system
     * 
     */
    public final static TypeKeyReference<MeasurementSystem> TC_METRIC = new TypeKeyCache<MeasurementSystem>(MeasurementSystem.TYPE, "metric");
    /**
     * US Customary System
     * US Customary system
     * 
     */
    public final static TypeKeyReference<MeasurementSystem> TC_US_CUSTOMARY = new TypeKeyCache<MeasurementSystem>(MeasurementSystem.TYPE, "us_customary");

    public MeasurementSystem(ITypeList type, String code) {
        super(type, code);
    }

    public static MeasurementSystem getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<MeasurementSystem> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
