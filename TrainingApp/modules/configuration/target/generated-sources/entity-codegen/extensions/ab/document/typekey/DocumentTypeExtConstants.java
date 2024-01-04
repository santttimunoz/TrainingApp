
package extensions.ab.document.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.document.typekey.DocumentType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class DocumentTypeExtConstants {

    /**
     * Diagram
     * Diagram
     * 
     */
    public final static TypeKeyReference<DocumentType> TC_DIAGRAM = new TypeKeyCache<DocumentType>(DocumentType.TYPE, "diagram");
    /**
     * Email
     * Email
     * 
     */
    public final static TypeKeyReference<DocumentType> TC_EMAIL = new TypeKeyCache<DocumentType>(DocumentType.TYPE, "email");
    /**
     * First notice of loss
     * First notice of loss (original report)
     * 
     */
    public final static TypeKeyReference<DocumentType> TC_FNOL = new TypeKeyCache<DocumentType>(DocumentType.TYPE, "fnol");
    /**
     * Letter received
     * Letter received
     * 
     */
    public final static TypeKeyReference<DocumentType> TC_LETTER_RECEIVED = new TypeKeyCache<DocumentType>(DocumentType.TYPE, "letter_received");
    /**
     * Letter sent
     * Letter sent
     * 
     */
    public final static TypeKeyReference<DocumentType> TC_LETTER_SENT = new TypeKeyCache<DocumentType>(DocumentType.TYPE, "letter_sent");
    /**
     * Police report
     * Police report
     * 
     */
    public final static TypeKeyReference<DocumentType> TC_POLICEREPORT = new TypeKeyCache<DocumentType>(DocumentType.TYPE, "policereport");
    /**
     * Repair estimate
     * Repair estimate
     * 
     */
    public final static TypeKeyReference<DocumentType> TC_REPAIRESTIMATE = new TypeKeyCache<DocumentType>(DocumentType.TYPE, "repairestimate");
    /**
     * Statement
     * Statement
     * 
     */
    public final static TypeKeyReference<DocumentType> TC_STATEMENT = new TypeKeyCache<DocumentType>(DocumentType.TYPE, "statement");

}
