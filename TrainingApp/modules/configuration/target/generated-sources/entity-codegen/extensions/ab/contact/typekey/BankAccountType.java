
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class BankAccountType
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<BankAccountType> TYPE = new TypeListIntrinsicTypeCache<BankAccountType>("BankAccountType");
    /**
     * Checking
     * Checking
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.BankAccountType> TC_CHECKING = new TypeKeyCache<extensions.ab.contact.typekey.BankAccountType>(extensions.ab.contact.typekey.BankAccountType.TYPE, "checking");
    /**
     * Other
     * Other
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.BankAccountType> TC_OTHER = new TypeKeyCache<extensions.ab.contact.typekey.BankAccountType>(extensions.ab.contact.typekey.BankAccountType.TYPE, "other");
    /**
     * Savings
     * Savings
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.BankAccountType> TC_SAVINGS = new TypeKeyCache<extensions.ab.contact.typekey.BankAccountType>(extensions.ab.contact.typekey.BankAccountType.TYPE, "savings");

    public BankAccountType(ITypeList type, String code) {
        super(type, code);
    }

    public static BankAccountType getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<BankAccountType> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
