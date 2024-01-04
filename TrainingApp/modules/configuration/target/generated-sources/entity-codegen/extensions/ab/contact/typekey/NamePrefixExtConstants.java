
package extensions.ab.contact.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.contact.typekey.NamePrefix;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class NamePrefixExtConstants {

    /**
     * Dr.
     * Dr.
     * 
     */
    public final static TypeKeyReference<NamePrefix> TC_DR = new TypeKeyCache<NamePrefix>(NamePrefix.TYPE, "dr");
    /**
     * Mr.
     * Mr.
     * 
     */
    public final static TypeKeyReference<NamePrefix> TC_MR = new TypeKeyCache<NamePrefix>(NamePrefix.TYPE, "mr");
    /**
     * Mrs.
     * Mrs.
     * 
     */
    public final static TypeKeyReference<NamePrefix> TC_MRS = new TypeKeyCache<NamePrefix>(NamePrefix.TYPE, "mrs");
    /**
     * Ms.
     * Ms.
     * 
     */
    public final static TypeKeyReference<NamePrefix> TC_MS = new TypeKeyCache<NamePrefix>(NamePrefix.TYPE, "ms");

}
