
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class BuildingType_Ext
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<BuildingType_Ext> TYPE = new TypeListIntrinsicTypeCache<BuildingType_Ext>("BuildingType_Ext");
    /**
     * Hotel
     * Hotel
     * 
     */
    public final static TypeKeyReference<BuildingType_Ext> TC_HOTEL = new TypeKeyCache<BuildingType_Ext>(BuildingType_Ext.TYPE, "hotel");
    /**
     * Industrial building
     * Factory or manufacturing
     * 
     */
    public final static TypeKeyReference<BuildingType_Ext> TC_INDUSTRIAL = new TypeKeyCache<BuildingType_Ext>(BuildingType_Ext.TYPE, "industrial");
    /**
     * Office building
     * Office building
     * 
     */
    public final static TypeKeyReference<BuildingType_Ext> TC_OFFICE = new TypeKeyCache<BuildingType_Ext>(BuildingType_Ext.TYPE, "office");
    /**
     * Other
     * Other
     * 
     */
    public final static TypeKeyReference<BuildingType_Ext> TC_OTHER = new TypeKeyCache<BuildingType_Ext>(BuildingType_Ext.TYPE, "other");
    /**
     * Residential - multiple dwelling
     * Residential - multiple dwelling
     * 
     */
    public final static TypeKeyReference<BuildingType_Ext> TC_RESIDENTIAL_MUTLI = new TypeKeyCache<BuildingType_Ext>(BuildingType_Ext.TYPE, "residential_mutli");
    /**
     * Residential - single dwelling
     * Residential - single dwelling
     * 
     */
    public final static TypeKeyReference<BuildingType_Ext> TC_RESIDENTIAL_SINGLE = new TypeKeyCache<BuildingType_Ext>(BuildingType_Ext.TYPE, "residential_single");

    public BuildingType_Ext(ITypeList type, String code) {
        super(type, code);
    }

    public static BuildingType_Ext getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<BuildingType_Ext> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
