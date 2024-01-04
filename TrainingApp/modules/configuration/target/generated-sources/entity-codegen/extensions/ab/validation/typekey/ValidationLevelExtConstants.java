
package extensions.ab.validation.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.persistence.typelist.TypeKeyReference;
import gw.pl.validation.typekey.ValidationLevel;

public final class ValidationLevelExtConstants {

    /**
     * Send to external system
     * Send to external system
     * 
     */
    public final static TypeKeyReference<ValidationLevel> TC_EXTERNAL = new TypeKeyCache<ValidationLevel>(ValidationLevel.TYPE, "external");
    /**
     * Load and save
     * Load and save
     * 
     */
    public final static TypeKeyReference<ValidationLevel> TC_LOADSAVE = new TypeKeyCache<ValidationLevel>(ValidationLevel.TYPE, "loadsave");

}
