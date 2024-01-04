
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class ContactNoteType
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<ContactNoteType> TYPE = new TypeListIntrinsicTypeCache<ContactNoteType>("ContactNoteType");
    /**
     * Update Contact Data
     * Update Contact Data
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ContactNoteType> TC_DATA_UPDATE = new TypeKeyCache<extensions.ab.contact.typekey.ContactNoteType>(extensions.ab.contact.typekey.ContactNoteType.TYPE, "data_update");
    /**
     * General
     * General
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ContactNoteType> TC_GENERAL = new TypeKeyCache<extensions.ab.contact.typekey.ContactNoteType>(extensions.ab.contact.typekey.ContactNoteType.TYPE, "general");
    /**
     * License / Certification
     * License / Certification
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ContactNoteType> TC_LICENSE = new TypeKeyCache<extensions.ab.contact.typekey.ContactNoteType>(extensions.ab.contact.typekey.ContactNoteType.TYPE, "license");
    /**
     * Problem
     * Problem
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.ContactNoteType> TC_PROBLEM = new TypeKeyCache<extensions.ab.contact.typekey.ContactNoteType>(extensions.ab.contact.typekey.ContactNoteType.TYPE, "problem");

    public ContactNoteType(ITypeList type, String code) {
        super(type, code);
    }

    public static ContactNoteType getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<ContactNoteType> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
