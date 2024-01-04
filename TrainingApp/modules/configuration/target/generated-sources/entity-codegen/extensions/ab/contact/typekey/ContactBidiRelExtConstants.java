
package extensions.ab.contact.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.contact.typekey.ContactBidiRel;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class ContactBidiRelExtConstants {

    /**
     * Assigned Case
     * Assigned Case
     * 
     */
    public final static TypeKeyReference<ContactBidiRel> TC_CASE = new TypeKeyCache<ContactBidiRel>(ContactBidiRel.TYPE, "case");
    /**
     * Collection Agency
     * Collection Agency
     * 
     */
    public final static TypeKeyReference<ContactBidiRel> TC_COLLECTIONAGENCY = new TypeKeyCache<ContactBidiRel>(ContactBidiRel.TYPE, "collectionagency");
    /**
     * Employee
     * Employee of an employer
     * 
     */
    public final static TypeKeyReference<ContactBidiRel> TC_EMPLOYEE = new TypeKeyCache<ContactBidiRel>(ContactBidiRel.TYPE, "employee");
    /**
     * Employer
     * Employer
     * 
     */
    public final static TypeKeyReference<ContactBidiRel> TC_EMPLOYER = new TypeKeyCache<ContactBidiRel>(ContactBidiRel.TYPE, "employer");
    /**
     * Parent / Guardian
     * Parent of a child or Guardian of a ward.
     * 
     */
    public final static TypeKeyReference<ContactBidiRel> TC_GUARDIAN = new TypeKeyCache<ContactBidiRel>(ContactBidiRel.TYPE, "guardian");
    /**
     * Primary Contact
     * Primary contact
     * 
     */
    public final static TypeKeyReference<ContactBidiRel> TC_PRIMARYCONTACT = new TypeKeyCache<ContactBidiRel>(ContactBidiRel.TYPE, "primarycontact");
    /**
     * Primary Contact For
     * PrimaryContact For
     * 
     */
    public final static TypeKeyReference<ContactBidiRel> TC_PRIMARYCONTACTFOR = new TypeKeyCache<ContactBidiRel>(ContactBidiRel.TYPE, "primarycontactfor");
    /**
     * Third-Party Insured
     * Third-Party Insured
     * 
     */
    public final static TypeKeyReference<ContactBidiRel> TC_THIRDPARTYINSURED = new TypeKeyCache<ContactBidiRel>(ContactBidiRel.TYPE, "thirdpartyinsured");
    /**
     * Third-Party Insurer
     * Third-Party Insurer
     * 
     */
    public final static TypeKeyReference<ContactBidiRel> TC_THIRDPARTYINSURER = new TypeKeyCache<ContactBidiRel>(ContactBidiRel.TYPE, "thirdpartyinsurer");
    /**
     * Child / Ward
     * Child or ward
     * 
     */
    public final static TypeKeyReference<ContactBidiRel> TC_WARD = new TypeKeyCache<ContactBidiRel>(ContactBidiRel.TYPE, "ward");

}
