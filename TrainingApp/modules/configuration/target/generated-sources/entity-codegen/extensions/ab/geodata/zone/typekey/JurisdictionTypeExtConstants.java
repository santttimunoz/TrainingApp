
package extensions.ab.geodata.zone.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.geodata.zone.typekey.JurisdictionType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class JurisdictionTypeExtConstants {

    /**
     * Consumption tax
     * Consumption tax such as sales tax or VAT
     * 
     */
    public final static TypeKeyReference<JurisdictionType> TC_CONS_TAX = new TypeKeyCache<JurisdictionType>(JurisdictionType.TYPE, "cons_tax");
    /**
     * Driver's license
     * Driver's license
     * 
     */
    public final static TypeKeyReference<JurisdictionType> TC_DRIVING_LIC = new TypeKeyCache<JurisdictionType>(JurisdictionType.TYPE, "driving_lic");
    /**
     * Insurance Tax
     * Insurance Tax
     * 
     */
    public final static TypeKeyReference<JurisdictionType> TC_INS_TAX = new TypeKeyCache<JurisdictionType>(JurisdictionType.TYPE, "ins_tax");
    /**
     * Insurance
     * Insurance
     * 
     */
    public final static TypeKeyReference<JurisdictionType> TC_INSURANCE = new TypeKeyCache<JurisdictionType>(JurisdictionType.TYPE, "insurance");
    /**
     * Vehicle registration
     * Vehicle registration
     * 
     */
    public final static TypeKeyReference<JurisdictionType> TC_VEHICLE_REG = new TypeKeyCache<JurisdictionType>(JurisdictionType.TYPE, "vehicle_reg");

}
