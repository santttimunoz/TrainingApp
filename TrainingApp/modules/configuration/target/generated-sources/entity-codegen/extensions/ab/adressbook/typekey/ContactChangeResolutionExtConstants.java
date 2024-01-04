
package extensions.ab.adressbook.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.adressbook.typekey.ContactChangeResolution;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class ContactChangeResolutionExtConstants {

    /**
     * Already Applied
     * Already Applied
     * 
     */
    public final static TypeKeyReference<ContactChangeResolution> TC_ALREADY_APPLIED = new TypeKeyCache<ContactChangeResolution>(ContactChangeResolution.TYPE, "already_applied");
    /**
     * Approved
     * Approved
     * 
     */
    public final static TypeKeyReference<ContactChangeResolution> TC_APPROVED = new TypeKeyCache<ContactChangeResolution>(ContactChangeResolution.TYPE, "approved");
    /**
     * More Information Required
     * More Information Required
     * 
     */
    public final static TypeKeyReference<ContactChangeResolution> TC_MORE_INFO_REQ = new TypeKeyCache<ContactChangeResolution>(ContactChangeResolution.TYPE, "more_info_req");
    /**
     * Rejected
     * Rejected
     * 
     */
    public final static TypeKeyReference<ContactChangeResolution> TC_REJECTED = new TypeKeyCache<ContactChangeResolution>(ContactChangeResolution.TYPE, "rejected");

}
