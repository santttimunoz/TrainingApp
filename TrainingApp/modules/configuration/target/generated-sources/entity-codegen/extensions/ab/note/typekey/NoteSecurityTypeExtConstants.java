
package extensions.ab.note.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.note.typekey.NoteSecurityType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class NoteSecurityTypeExtConstants {

    /**
     * Private
     * Note viewable by internal users only
     * 
     */
    public final static TypeKeyReference<NoteSecurityType> TC_PRIVATE = new TypeKeyCache<NoteSecurityType>(NoteSecurityType.TYPE, "private");
    /**
     * Public
     * Note viewable by any user in the system
     * 
     */
    public final static TypeKeyReference<NoteSecurityType> TC_PUBLIC = new TypeKeyCache<NoteSecurityType>(NoteSecurityType.TYPE, "public");
    /**
     * Sensitive
     * Confidential note, viewable by select internal users only
     * 
     */
    public final static TypeKeyReference<NoteSecurityType> TC_SENSITIVE = new TypeKeyCache<NoteSecurityType>(NoteSecurityType.TYPE, "sensitive");

}
