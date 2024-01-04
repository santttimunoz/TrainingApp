
package extensions.ab.contact.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.contact.typekey.ContactRel;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class ContactRelExtConstants {

    /**
     * Collection Agency
     * Collection Agency
     * 
     */
    public final static TypeKeyReference<ContactRel> TC_COLLECTIONAGENCY = new TypeKeyCache<ContactRel>(ContactRel.TYPE, "collectionagency");
    /**
     * Employer
     * Employer
     * 
     */
    public final static TypeKeyReference<ContactRel> TC_EMPLOYER = new TypeKeyCache<ContactRel>(ContactRel.TYPE, "employer");
    /**
     * Parent / Guardian
     * Parent of a child or Guardian of a ward.
     * 
     */
    public final static TypeKeyReference<ContactRel> TC_GUARDIAN = new TypeKeyCache<ContactRel>(ContactRel.TYPE, "guardian");
    /**
     * Primary Contact
     * Primary contact
     * 
     */
    public final static TypeKeyReference<ContactRel> TC_PRIMARYCONTACT = new TypeKeyCache<ContactRel>(ContactRel.TYPE, "primarycontact");
    /**
     * Third-Party Insurer
     * Third-Party Insurer
     * 
     */
    public final static TypeKeyReference<ContactRel> TC_THIRDPARTYINSURER = new TypeKeyCache<ContactRel>(ContactRel.TYPE, "thirdpartyinsurer");

}
