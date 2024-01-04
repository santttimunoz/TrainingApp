
package extensions.ab.community.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.community.typekey.BusinessType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class BusinessTypeExtConstants {

    /**
     * Agency
     * Agency
     * 
     */
    public final static TypeKeyReference<BusinessType> TC_AGENCY = new TypeKeyCache<BusinessType>(BusinessType.TYPE, "agency");
    /**
     * Broker
     * Broker
     * 
     */
    public final static TypeKeyReference<BusinessType> TC_BROKER = new TypeKeyCache<BusinessType>(BusinessType.TYPE, "broker");
    /**
     * Insurer
     * Insurer
     * 
     */
    public final static TypeKeyReference<BusinessType> TC_INSURER = new TypeKeyCache<BusinessType>(BusinessType.TYPE, "insurer");

}
