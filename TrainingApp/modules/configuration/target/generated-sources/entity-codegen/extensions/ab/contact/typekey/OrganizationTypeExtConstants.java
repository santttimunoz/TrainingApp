
package extensions.ab.contact.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.contact.typekey.OrganizationType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class OrganizationTypeExtConstants {

    /**
     * City
     * City
     * 
     */
    public final static TypeKeyReference<OrganizationType> TC_CITY = new TypeKeyCache<OrganizationType>(OrganizationType.TYPE, "city");
    /**
     * Corporation
     * Corporation
     * 
     */
    public final static TypeKeyReference<OrganizationType> TC_CORPORATION = new TypeKeyCache<OrganizationType>(OrganizationType.TYPE, "corporation");
    /**
     * County
     * County
     * 
     */
    public final static TypeKeyReference<OrganizationType> TC_COUNTY = new TypeKeyCache<OrganizationType>(OrganizationType.TYPE, "county");
    /**
     * Federal
     * Federal
     * 
     */
    public final static TypeKeyReference<OrganizationType> TC_FEDERAL = new TypeKeyCache<OrganizationType>(OrganizationType.TYPE, "federal");
    /**
     * Partnership
     * Partnership
     * 
     */
    public final static TypeKeyReference<OrganizationType> TC_PARTNERSHIP = new TypeKeyCache<OrganizationType>(OrganizationType.TYPE, "partnership");
    /**
     * Sole Proprietorship
     * Sole Proprietorship
     * 
     */
    public final static TypeKeyReference<OrganizationType> TC_SOLEPROPSHIP = new TypeKeyCache<OrganizationType>(OrganizationType.TYPE, "solepropship");
    /**
     * State
     * State
     * 
     */
    public final static TypeKeyReference<OrganizationType> TC_STATE = new TypeKeyCache<OrganizationType>(OrganizationType.TYPE, "state");

}
