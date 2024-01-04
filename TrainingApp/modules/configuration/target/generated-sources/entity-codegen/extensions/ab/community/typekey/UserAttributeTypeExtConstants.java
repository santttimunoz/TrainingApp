
package extensions.ab.community.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.community.typekey.UserAttributeType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class UserAttributeTypeExtConstants {

    /**
     * Named Account
     * Named account
     * 
     */
    public final static TypeKeyReference<UserAttributeType> TC_ACCOUNT = new TypeKeyCache<UserAttributeType>(UserAttributeType.TYPE, "Account");
    /**
     * Expertise
     * Expertise
     * 
     */
    public final static TypeKeyReference<UserAttributeType> TC_EXPERTISE = new TypeKeyCache<UserAttributeType>(UserAttributeType.TYPE, "Expertise");
    /**
     * Language
     * Language
     * 
     */
    public final static TypeKeyReference<UserAttributeType> TC_LANGUAGE = new TypeKeyCache<UserAttributeType>(UserAttributeType.TYPE, "Language");
    /**
     * Default
     * Default
     * 
     */
    public final static TypeKeyReference<UserAttributeType> TC_DEFAULT = new TypeKeyCache<UserAttributeType>(UserAttributeType.TYPE, "default");

}
