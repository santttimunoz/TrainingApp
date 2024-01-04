
package extensions.ab.history.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.history.typekey.CustomHistoryType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class CustomHistoryTypeExtConstants {

    /**
     * Data change
     * Data change
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_DATACHANGE = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "DataChange");
    /**
     * Exported to Mainframe
     * Integration: New claim exported to mainframe
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_EXPORT = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "Export");
    /**
     * Auto: No fault rating
     * Claim exception: Fault rating no set on auto claim
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_A_N_F_R = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "a_n_f_r");
    /**
     * Address Added
     * Address Added
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_ADDRESSADDED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "addressadded");
    /**
     * Address Removed
     * Address Removed
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_ADDRESSREMOVED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "addressremoved");
    /**
     * Address Updated
     * Address Updated
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_ADDRESSUPDATED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "addressupdated");
    /**
     * Contact Created
     * Contact Created
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_CONTACTCREATED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "contactcreated");
    /**
     * Contact Merged (Kept)
     * Contact Merged (Kept)
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_CONTACTMERGEDKEPT = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "contactmergedkept");
    /**
     * Contact Merged (Retired)
     * Contact Merged (Retired)
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_CONTACTMERGEDRETIRED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "contactmergedretired");
    /**
     * Contact Removed
     * Contact Removed
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_CONTACTREMOVED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "contactremoved");
    /**
     * Exposure with no reserves
     * Claim exception: No reserve set for exposure
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_E_W_N_R = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "e_w_n_r");
    /**
     * Name Updated
     * Name Updated
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_NAMEUPDATED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "nameupdated");
    /**
     * Pending Change Rejected
     * Pending Change Rejected
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_PENDINGCHANGEREJECTED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "pendingchangerejected");
    /**
     * Pending Create Approved
     * Pending Create Approved
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_PENDINGCREATEAPPROVED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "pendingcreateapproved");
    /**
     * Phone Number Added
     * Phone Number Added
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_PHONEADDED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "phoneadded");
    /**
     * Phone Number Removed
     * Phone Number Removed
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_PHONEREMOVED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "phoneremoved");
    /**
     * Phone Number Updated
     * Phone Number Updated
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_PHONEUPDATED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "phoneupdated");
    /**
     * Primary Address Added
     * Primary Address Added
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_PRIMARYADDRESSADDED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "primaryaddressadded");
    /**
     * Primary Address Changed
     * Primary Address Changed from One Address to Another
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_PRIMARYADDRESSCHANGED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "primaryaddresschanged");
    /**
     * Primary Address Removed
     * Primary Address Removed
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_PRIMARYADDRESSREMOVED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "primaryaddressremoved");
    /**
     * Primary Address Updated
     * Primary Address Updated
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_PRIMARYADDRESSUPDATED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "primaryaddressupdated");
    /**
     * Primary Phone Type Changed
     * Primary Phone Type Changed
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_PRIMARYPHONECHANGED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "primaryphonechanged");
    /**
     * Related Contact Added
     * Related Contact Added
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_RELATEDCONTACTADDED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "relatedcontactadded");
    /**
     * Related Contact Removed
     * Related Contact Removed
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_RELATEDCONTACTREMOVED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "relatedcontactremoved");
    /**
     * Related Contact Updated
     * Related Contact Updated
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_RELATEDCONTACTUPDATED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "relatedcontactupdated");
    /**
     * Contact Subtype Changed
     * Contact Subtype Changed
     * 
     */
    public final static TypeKeyReference<CustomHistoryType> TC_SUBTYPECHANGED = new TypeKeyCache<CustomHistoryType>(CustomHistoryType.TYPE, "subtypechanged");

}
