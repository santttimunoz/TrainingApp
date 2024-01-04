
package extensions.ab.note.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.note.typekey.NoteType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class NoteTypeExtConstants {

    /**
     * Action plan
     * Action plan
     * 
     */
    public final static TypeKeyReference<NoteType> TC_ACTIONPLAN = new TypeKeyCache<NoteType>(NoteType.TYPE, "actionplan");
    /**
     * General
     * General
     * 
     */
    public final static TypeKeyReference<NoteType> TC_DIAGRAM = new TypeKeyCache<NoteType>(NoteType.TYPE, "diagram");
    /**
     * Inbound
     * Inbound
     * 
     */
    public final static TypeKeyReference<NoteType> TC_INBOUND = new TypeKeyCache<NoteType>(NoteType.TYPE, "inbound");
    /**
     * Interview report
     * Interview report
     * 
     */
    public final static TypeKeyReference<NoteType> TC_INTERVIEWREPORT = new TypeKeyCache<NoteType>(NoteType.TYPE, "interviewreport");
    /**
     * Outbound
     * Outbond
     * 
     */
    public final static TypeKeyReference<NoteType> TC_OUTBOUND = new TypeKeyCache<NoteType>(NoteType.TYPE, "outbound");
    /**
     * Status report
     * Status report
     * 
     */
    public final static TypeKeyReference<NoteType> TC_STATUSREPORT = new TypeKeyCache<NoteType>(NoteType.TYPE, "statusreport");
    /**
     * Transferred Call
     * Transferred Call
     * 
     */
    public final static TypeKeyReference<NoteType> TC_TRANSFERREDCALL = new TypeKeyCache<NoteType>(NoteType.TYPE, "transferredcall");

}
