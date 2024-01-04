
package extensions.ab.addressbook.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class LegalSpecialty
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<LegalSpecialty> TYPE = new TypeListIntrinsicTypeCache<LegalSpecialty>("LegalSpecialty");
    /**
     * General Liability
     * General Liability
     * 
     */
    public final static TypeKeyReference<extensions.ab.addressbook.typekey.LegalSpecialty> TC_GENERALLIABILITY = new TypeKeyCache<extensions.ab.addressbook.typekey.LegalSpecialty>(extensions.ab.addressbook.typekey.LegalSpecialty.TYPE, "generalliability");
    /**
     * Motor Vehicle Liability
     * Motor Vehicle Liability
     * 
     */
    public final static TypeKeyReference<extensions.ab.addressbook.typekey.LegalSpecialty> TC_MOTORVEHLIABILITY = new TypeKeyCache<extensions.ab.addressbook.typekey.LegalSpecialty>(extensions.ab.addressbook.typekey.LegalSpecialty.TYPE, "motorvehliability");
    /**
     * Personal Injury
     * Personal Injury
     * 
     */
    public final static TypeKeyReference<extensions.ab.addressbook.typekey.LegalSpecialty> TC_PERSONALINJURY = new TypeKeyCache<extensions.ab.addressbook.typekey.LegalSpecialty>(extensions.ab.addressbook.typekey.LegalSpecialty.TYPE, "personalinjury");
    /**
     * Workers' Compensation
     * Workers' Compensation
     * 
     */
    public final static TypeKeyReference<extensions.ab.addressbook.typekey.LegalSpecialty> TC_WORKERSCOMP = new TypeKeyCache<extensions.ab.addressbook.typekey.LegalSpecialty>(extensions.ab.addressbook.typekey.LegalSpecialty.TYPE, "workerscomp");

    public LegalSpecialty(ITypeList type, String code) {
        super(type, code);
    }

    public static LegalSpecialty getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<LegalSpecialty> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
