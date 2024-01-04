
package extensions.ab.document.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.document.typekey.DocumentSection;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class DocumentSectionExtConstants {

    /**
     * Bills
     * Bills
     * 
     */
    public final static TypeKeyReference<DocumentSection> TC_BILLS = new TypeKeyCache<DocumentSection>(DocumentSection.TYPE, "bills");
    /**
     * Correspondence
     * Correspondence
     * 
     */
    public final static TypeKeyReference<DocumentSection> TC_CORRESPONDENCE = new TypeKeyCache<DocumentSection>(DocumentSection.TYPE, "correspondence");
    /**
     * Indemnity
     * Indemnity
     * 
     */
    public final static TypeKeyReference<DocumentSection> TC_INDEMNITY = new TypeKeyCache<DocumentSection>(DocumentSection.TYPE, "indemnity");
    /**
     * Legal
     * Legal
     * 
     */
    public final static TypeKeyReference<DocumentSection> TC_LEGAL = new TypeKeyCache<DocumentSection>(DocumentSection.TYPE, "legal");
    /**
     * Medical
     * Medical
     * 
     */
    public final static TypeKeyReference<DocumentSection> TC_MEDICAL = new TypeKeyCache<DocumentSection>(DocumentSection.TYPE, "medical");
    /**
     * Misc
     * Misc
     * 
     */
    public final static TypeKeyReference<DocumentSection> TC_MISC = new TypeKeyCache<DocumentSection>(DocumentSection.TYPE, "misc");
    /**
     * Rehab
     * Rehab
     * 
     */
    public final static TypeKeyReference<DocumentSection> TC_REHAB = new TypeKeyCache<DocumentSection>(DocumentSection.TYPE, "rehab");

}
