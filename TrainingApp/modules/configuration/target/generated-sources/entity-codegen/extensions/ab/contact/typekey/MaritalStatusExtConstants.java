
package extensions.ab.contact.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.contact.typekey.MaritalStatus;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class MaritalStatusExtConstants {

    /**
     * Common law spouse
     * Common law spouse
     * 
     */
    public final static TypeKeyReference<MaritalStatus> TC_COMMON = new TypeKeyCache<MaritalStatus>(MaritalStatus.TYPE, "common");
    /**
     * Divorced
     * Divorced
     * 
     */
    public final static TypeKeyReference<MaritalStatus> TC_DIVORCED = new TypeKeyCache<MaritalStatus>(MaritalStatus.TYPE, "divorced");
    /**
     * Married
     * Married
     * 
     */
    public final static TypeKeyReference<MaritalStatus> TC_MARRIED = new TypeKeyCache<MaritalStatus>(MaritalStatus.TYPE, "married");
    /**
     * Separated
     * Separated
     * 
     */
    public final static TypeKeyReference<MaritalStatus> TC_SEPARATED = new TypeKeyCache<MaritalStatus>(MaritalStatus.TYPE, "separated");
    /**
     * Single
     * Single
     * 
     */
    public final static TypeKeyReference<MaritalStatus> TC_SINGLE = new TypeKeyCache<MaritalStatus>(MaritalStatus.TYPE, "single");
    /**
     * Unknown
     * Unknown
     * 
     */
    public final static TypeKeyReference<MaritalStatus> TC_UNKNOWN = new TypeKeyCache<MaritalStatus>(MaritalStatus.TYPE, "unknown");
    /**
     * Spouse deceased
     * Spouse deceased
     * 
     */
    public final static TypeKeyReference<MaritalStatus> TC_WIDOWED = new TypeKeyCache<MaritalStatus>(MaritalStatus.TYPE, "widowed");

}
