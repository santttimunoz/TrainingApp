
package extensions.ab.document.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.document.typekey.DocumentSecurityType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class DocumentSecurityTypeExtConstants {

    /**
     * Internal Only document
     * Document which should not be viewed by people outside the company
     * 
     */
    public final static TypeKeyReference<DocumentSecurityType> TC_INTERNALONLY = new TypeKeyCache<DocumentSecurityType>(DocumentSecurityType.TYPE, "internalonly");
    /**
     * Sensitive document
     * Document which is sensitive in nature
     * 
     */
    public final static TypeKeyReference<DocumentSecurityType> TC_SENSITIVE = new TypeKeyCache<DocumentSecurityType>(DocumentSecurityType.TYPE, "sensitive");
    /**
     * Unrestricted document
     * Document which does not require access restriction
     * 
     */
    public final static TypeKeyReference<DocumentSecurityType> TC_UNRESTRICTED = new TypeKeyCache<DocumentSecurityType>(DocumentSecurityType.TYPE, "unrestricted");

}
