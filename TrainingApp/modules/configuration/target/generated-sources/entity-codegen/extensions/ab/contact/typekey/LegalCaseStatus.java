
package extensions.ab.contact.typekey;

import java.util.List;
import com.guidewire.commons.metadata.types.TypeKeyCache;
import com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache;
import com.guidewire.commons.typelist.TypeKeyImpl;
import gw.entity.ITypeList;
import gw.pl.persistence.type.TypeListTypeReference;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class LegalCaseStatus
    extends TypeKeyImpl
{

    public final static TypeListTypeReference<LegalCaseStatus> TYPE = new TypeListIntrinsicTypeCache<LegalCaseStatus>("LegalCaseStatus");
    /**
     * Case Dismissed
     * Case Dismissed (court rejected it)
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseStatus> TC_CASE_DISMISSED = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseStatus>(extensions.ab.contact.typekey.LegalCaseStatus.TYPE, "case_dismissed");
    /**
     * Case Dropped
     * Case Dropped (plaintiff withdrew)
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseStatus> TC_CASE_DROPPED = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseStatus>(extensions.ab.contact.typekey.LegalCaseStatus.TYPE, "case_dropped");
    /**
     * Guilty
     * Guilty
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseStatus> TC_GUILTY = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseStatus>(extensions.ab.contact.typekey.LegalCaseStatus.TYPE, "guilty");
    /**
     * In Progress
     * In Progress
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseStatus> TC_IN_PROGRESS = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseStatus>(extensions.ab.contact.typekey.LegalCaseStatus.TYPE, "in_progress");
    /**
     * Mistrial
     * Mistrial
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseStatus> TC_MISTRIAL = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseStatus>(extensions.ab.contact.typekey.LegalCaseStatus.TYPE, "mistrial");
    /**
     * Not Guilty
     * Not Guilty
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseStatus> TC_NOT_GUILTY = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseStatus>(extensions.ab.contact.typekey.LegalCaseStatus.TYPE, "not_guilty");
    /**
     * Settled Out of Court
     * Settled Out of Court
     * 
     */
    public final static TypeKeyReference<extensions.ab.contact.typekey.LegalCaseStatus> TC_SETTLED = new TypeKeyCache<extensions.ab.contact.typekey.LegalCaseStatus>(extensions.ab.contact.typekey.LegalCaseStatus.TYPE, "settled");

    public LegalCaseStatus(ITypeList type, String code) {
        super(type, code);
    }

    public static LegalCaseStatus getTypeKey(String code) {
        return TYPE.get().getTypeKey(code);
    }

    public static List<LegalCaseStatus> getAllTypeKeys() {
        return TYPE.get().getTypeKeys(true);
    }

    @Override
    protected Object readResolve() {
        return getTypeKey(getCode());
    }

}
