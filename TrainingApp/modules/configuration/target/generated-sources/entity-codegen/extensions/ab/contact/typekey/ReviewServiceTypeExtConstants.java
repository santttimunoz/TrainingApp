
package extensions.ab.contact.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.contact.typekey.ReviewServiceType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class ReviewServiceTypeExtConstants {

    /**
     * Body
     * Body
     * 
     */
    public final static TypeKeyReference<ReviewServiceType> TC_BODY = new TypeKeyCache<ReviewServiceType>(ReviewServiceType.TYPE, "body");
    /**
     * Brakes
     * Brakes
     * 
     */
    public final static TypeKeyReference<ReviewServiceType> TC_BRAKES = new TypeKeyCache<ReviewServiceType>(ReviewServiceType.TYPE, "brakes");
    /**
     * Transmission and Engine
     * Transmission and Engine
     * 
     */
    public final static TypeKeyReference<ReviewServiceType> TC_DRIVETRAIN = new TypeKeyCache<ReviewServiceType>(ReviewServiceType.TYPE, "drivetrain");
    /**
     * Other
     * Indicates that no more specific service type is applicable.
     * 
     */
    public final static TypeKeyReference<ReviewServiceType> TC_OTHER = new TypeKeyCache<ReviewServiceType>(ReviewServiceType.TYPE, "other");
    /**
     * Paint
     * Paint
     * 
     */
    public final static TypeKeyReference<ReviewServiceType> TC_PAINT = new TypeKeyCache<ReviewServiceType>(ReviewServiceType.TYPE, "paint");
    /**
     * Suspension
     * Suspension
     * 
     */
    public final static TypeKeyReference<ReviewServiceType> TC_SUSPENSION = new TypeKeyCache<ReviewServiceType>(ReviewServiceType.TYPE, "suspension");

}
