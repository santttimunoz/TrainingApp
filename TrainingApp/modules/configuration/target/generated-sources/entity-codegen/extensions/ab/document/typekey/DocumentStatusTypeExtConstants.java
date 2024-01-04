
package extensions.ab.document.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.document.typekey.DocumentStatusType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class DocumentStatusTypeExtConstants {

    /**
     * Approved
     * Approved
     * 
     */
    public final static TypeKeyReference<DocumentStatusType> TC_APPROVED = new TypeKeyCache<DocumentStatusType>(DocumentStatusType.TYPE, "approved");
    /**
     * Approving
     * Approving
     * 
     */
    public final static TypeKeyReference<DocumentStatusType> TC_APPROVING = new TypeKeyCache<DocumentStatusType>(DocumentStatusType.TYPE, "approving");
    /**
     * Draft
     * Draft
     * 
     */
    public final static TypeKeyReference<DocumentStatusType> TC_DRAFT = new TypeKeyCache<DocumentStatusType>(DocumentStatusType.TYPE, "draft");
    /**
     * Filed
     * Filed
     * 
     */
    public final static TypeKeyReference<DocumentStatusType> TC_FILED = new TypeKeyCache<DocumentStatusType>(DocumentStatusType.TYPE, "filed");
    /**
     * Final
     * Final
     * 
     */
    public final static TypeKeyReference<DocumentStatusType> TC_FINAL = new TypeKeyCache<DocumentStatusType>(DocumentStatusType.TYPE, "final");

}
