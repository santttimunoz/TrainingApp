
package extensions.ab.community.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.community.typekey.UserExperienceType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class UserExperienceTypeExtConstants {

    /**
     * High
     * Expert
     * 
     */
    public final static TypeKeyReference<UserExperienceType> TC_HIGH = new TypeKeyCache<UserExperienceType>(UserExperienceType.TYPE, "high");
    /**
     * Low
     * Novice
     * 
     */
    public final static TypeKeyReference<UserExperienceType> TC_LOW = new TypeKeyCache<UserExperienceType>(UserExperienceType.TYPE, "low");
    /**
     * Mid
     * Average
     * 
     */
    public final static TypeKeyReference<UserExperienceType> TC_MID = new TypeKeyCache<UserExperienceType>(UserExperienceType.TYPE, "mid");

}
