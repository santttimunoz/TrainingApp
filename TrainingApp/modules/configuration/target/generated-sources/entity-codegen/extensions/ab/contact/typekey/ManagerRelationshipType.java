
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class ManagerRelationshipType
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<ManagerRelationshipType> TYPE = new TypeListIntrinsicTypeCache<ManagerRelationshipType>("ManagerRelationshipType");
    /**
     * Administrative Assistant
     * Administrative Assistant
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ManagerRelationshipType> TC_ADMIN_ASSIST = new TypeKeyCache<extensions.ab.contact.typekey.ManagerRelationshipType>(extensions.ab.contact.typekey.ManagerRelationshipType.TYPE, "admin_assist");
    /**
     * Claims Manager
     * Claims Manager
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ManagerRelationshipType> TC_CLAIMS_MANAGER = new TypeKeyCache<extensions.ab.contact.typekey.ManagerRelationshipType>(extensions.ab.contact.typekey.ManagerRelationshipType.TYPE, "claims_manager");
    /**
     * Other
     * Other
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ManagerRelationshipType> TC_OTHER = new TypeKeyCache<extensions.ab.contact.typekey.ManagerRelationshipType>(extensions.ab.contact.typekey.ManagerRelationshipType.TYPE, "other");
    /**
     * Self
     * Self
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ManagerRelationshipType> TC_SELF = new TypeKeyCache<extensions.ab.contact.typekey.ManagerRelationshipType>(extensions.ab.contact.typekey.ManagerRelationshipType.TYPE, "self");
    /**
     * Unknown
     * Unknown
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ManagerRelationshipType> TC_UNKNOWN = new TypeKeyCache<extensions.ab.contact.typekey.ManagerRelationshipType>(extensions.ab.contact.typekey.ManagerRelationshipType.TYPE, "unknown");

    public ManagerRelationshipType(ITypeList type, String code) {
        super(type, code);
    }

    public static ManagerRelationshipType getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<ManagerRelationshipType> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
