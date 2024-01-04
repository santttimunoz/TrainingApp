
package extensions.ab.addressbook.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class AdjudicativeDomain
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<AdjudicativeDomain> TYPE = new TypeListIntrinsicTypeCache<AdjudicativeDomain>("AdjudicativeDomain");
    /**
     * Appeals
     * Appeals
     * 
     */
    public final static TypeKeyReference<extensions.ab.addressbook.typekey.AdjudicativeDomain> TC_APPEALS = new TypeKeyCache<extensions.ab.addressbook.typekey.AdjudicativeDomain>(extensions.ab.addressbook.typekey.AdjudicativeDomain.TYPE, "Appeals");
    /**
     * County
     * County
     * 
     */
    public final static TypeKeyReference<extensions.ab.addressbook.typekey.AdjudicativeDomain> TC_COUNTY = new TypeKeyCache<extensions.ab.addressbook.typekey.AdjudicativeDomain>(extensions.ab.addressbook.typekey.AdjudicativeDomain.TYPE, "County");
    /**
     * Alternative Dispute Resolutions (ADR)
     * Alternative Dispute Resolutions (ADR)
     * 
     */
    public final static TypeKeyReference<extensions.ab.addressbook.typekey.AdjudicativeDomain> TC_DISPUTES = new TypeKeyCache<extensions.ab.addressbook.typekey.AdjudicativeDomain>(extensions.ab.addressbook.typekey.AdjudicativeDomain.TYPE, "Disputes");
    /**
     * Federal
     * Federal
     * 
     */
    public final static TypeKeyReference<extensions.ab.addressbook.typekey.AdjudicativeDomain> TC_FEDERAL = new TypeKeyCache<extensions.ab.addressbook.typekey.AdjudicativeDomain>(extensions.ab.addressbook.typekey.AdjudicativeDomain.TYPE, "Federal");
    /**
     * Municipal
     * Municipal
     * 
     */
    public final static TypeKeyReference<extensions.ab.addressbook.typekey.AdjudicativeDomain> TC_MUNICIPAL = new TypeKeyCache<extensions.ab.addressbook.typekey.AdjudicativeDomain>(extensions.ab.addressbook.typekey.AdjudicativeDomain.TYPE, "Municipal");
    /**
     * Supreme
     * Supreme
     * 
     */
    public final static TypeKeyReference<extensions.ab.addressbook.typekey.AdjudicativeDomain> TC_SUPREME = new TypeKeyCache<extensions.ab.addressbook.typekey.AdjudicativeDomain>(extensions.ab.addressbook.typekey.AdjudicativeDomain.TYPE, "Supreme");

    public AdjudicativeDomain(ITypeList type, String code) {
        super(type, code);
    }

    public static AdjudicativeDomain getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<AdjudicativeDomain> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
