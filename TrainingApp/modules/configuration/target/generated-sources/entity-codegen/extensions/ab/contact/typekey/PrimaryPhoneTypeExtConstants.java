
package extensions.ab.contact.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.contact.typekey.PrimaryPhoneType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class PrimaryPhoneTypeExtConstants {

    /**
     * Home
     * Home
     * 
     */
    public final static TypeKeyReference<PrimaryPhoneType> TC_HOME = new TypeKeyCache<PrimaryPhoneType>(PrimaryPhoneType.TYPE, "home");
    /**
     * Mobile
     * Mobile
     * 
     */
    public final static TypeKeyReference<PrimaryPhoneType> TC_MOBILE = new TypeKeyCache<PrimaryPhoneType>(PrimaryPhoneType.TYPE, "mobile");
    /**
     * Work
     * Work
     * 
     */
    public final static TypeKeyReference<PrimaryPhoneType> TC_WORK = new TypeKeyCache<PrimaryPhoneType>(PrimaryPhoneType.TYPE, "work");

}
