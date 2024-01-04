
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class DoctorSpecialtyType
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<DoctorSpecialtyType> TYPE = new TypeListIntrinsicTypeCache<DoctorSpecialtyType>("DoctorSpecialtyType");
    /**
     * Critical Care Medicine
     * Critical Care Medicine
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_CRITICALCAREMEDICINE = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "CriticalCareMedicine");
    /**
     * Dentistry/Oral Surgery
     * Dentistry/Oral Surgery
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_DENTISTRY = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "Dentistry");
    /**
     * Emergency Medicine
     * Emergency Medicine
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_EMERGENCYMEDICINE = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "EmergencyMedicine");
    /**
     * Foot Surgery
     * Foot Surgery
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_FOOTSURGERY = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "FootSurgery");
    /**
     * General Surgery
     * General Surgery
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_GENERALSURGERY = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "GeneralSurgery");
    /**
     * Hand Surgery
     * Hand Surgery
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_HANDSURGERY = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "HandSurgery");
    /**
     * Hospitalist
     * Hospitalist
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_HOSPITALIST = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "Hospitalist");
    /**
     * Internal Medicine
     * Internal Medicine
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_INTERNALMEDICINE = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "InternalMedicine");
    /**
     * Neurology
     * Neurology
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_NEUROLOGY = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "Neurology");
    /**
     * Orthopaedics
     * Orthopaedics
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_ORTHOPAEDICS = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "Orthopaedics");
    /**
     * Pain Management
     * Pain Management
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_PAINMANAGEMENT = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "PainManagement");
    /**
     * Physical Rehabilitation
     * Physical Rehabilitation
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_PHYSICALREHABILITATION = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "PhysicalRehabilitation");
    /**
     * Podiatry
     * Podiatry
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_PODIATRY = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "Podiatry");
    /**
     * Reconstructive Surgery
     * Reconstructive Surgery
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_RECONSTRUCTIVESURGERY = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "ReconstructiveSurgery");
    /**
     * Unspecified
     * Unspecified
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.DoctorSpecialtyType> TC_UNSPECIFIED = new TypeKeyCache<extensions.ab.contact.typekey.DoctorSpecialtyType>(extensions.ab.contact.typekey.DoctorSpecialtyType.TYPE, "Unspecified");

    public DoctorSpecialtyType(ITypeList type, String code) {
        super(type, code);
    }

    public static DoctorSpecialtyType getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<DoctorSpecialtyType> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
