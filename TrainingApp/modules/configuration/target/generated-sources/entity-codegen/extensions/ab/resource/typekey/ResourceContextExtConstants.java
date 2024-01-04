
package extensions.ab.resource.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.persistence.typelist.TypeKeyReference;
import gw.pl.resource.typekey.ResourceContext;

public final class ResourceContextExtConstants {

    /**
     * Guidewire Base
     * Guidewire Base Configuration related resources
     * 
     */
    public final static TypeKeyReference<ResourceContext> TC_BASE = new TypeKeyCache<ResourceContext>(ResourceContext.TYPE, "base");
    /**
     * Guidewire Sample Data
     * Guidewire Sample Data related resources
     * 
     */
    public final static TypeKeyReference<ResourceContext> TC_SAMPLE = new TypeKeyCache<ResourceContext>(ResourceContext.TYPE, "sample");
    /**
     * Guidewire WC
     * Guidewire Workers Compensation related resources
     * 
     */
    public final static TypeKeyReference<ResourceContext> TC_WC = new TypeKeyCache<ResourceContext>(ResourceContext.TYPE, "wc");

}
