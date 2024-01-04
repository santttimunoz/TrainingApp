
package extensions.ab.contact.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.contact.typekey.AddressType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class AddressTypeExtConstants {

    /**
     * Billing
     * Billing
     * 
     */
    public final static TypeKeyReference<AddressType> TC_BILLING = new TypeKeyCache<AddressType>(AddressType.TYPE, "billing");
    /**
     * Business
     * Business
     * 
     */
    public final static TypeKeyReference<AddressType> TC_BUSINESS = new TypeKeyCache<AddressType>(AddressType.TYPE, "business");
    /**
     * Home
     * Home
     * 
     */
    public final static TypeKeyReference<AddressType> TC_HOME = new TypeKeyCache<AddressType>(AddressType.TYPE, "home");
    /**
     * Other
     * Other
     * 
     */
    public final static TypeKeyReference<AddressType> TC_OTHER = new TypeKeyCache<AddressType>(AddressType.TYPE, "other");

}
