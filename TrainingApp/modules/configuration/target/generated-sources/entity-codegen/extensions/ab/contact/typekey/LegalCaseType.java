
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class LegalCaseType
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<LegalCaseType> TYPE = new TypeListIntrinsicTypeCache<LegalCaseType>("LegalCaseType");
    /**
     * Fraud
     * Fraud
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseType> TC_FRAUD = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseType>(extensions.ab.contact.typekey.LegalCaseType.TYPE, "fraud");
    /**
     * Malpractice
     * Malpractice
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseType> TC_MALPRACTICE = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseType>(extensions.ab.contact.typekey.LegalCaseType.TYPE, "malpractice");
    /**
     * Negligence
     * Negligence
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseType> TC_NEGLIGENCE = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseType>(extensions.ab.contact.typekey.LegalCaseType.TYPE, "negligence");
    /**
     * Wrongful Death
     * Wrongful Death
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseType> TC_WRONGFUL_DEATH = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseType>(extensions.ab.contact.typekey.LegalCaseType.TYPE, "wrongful_death");

    public LegalCaseType(ITypeList type, String code) {
        super(type, code);
    }

    public static LegalCaseType getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<LegalCaseType> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
