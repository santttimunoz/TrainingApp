
package extensions.ab.contact.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.contact.typekey.TaxFilingStatusType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class TaxFilingStatusTypeExtConstants {

    /**
     * Head of household
     * Head of household
     * 
     */
    public final static TypeKeyReference<TaxFilingStatusType> TC_HEADOFHOUSEHOLD = new TypeKeyCache<TaxFilingStatusType>(TaxFilingStatusType.TYPE, "headofhousehold");
    /**
     * Married filing jointly
     * Married filing jointly
     * 
     */
    public final static TypeKeyReference<TaxFilingStatusType> TC_MARRIED$45$JOINT = new TypeKeyCache<TaxFilingStatusType>(TaxFilingStatusType.TYPE, "married-joint");
    /**
     * Married filing separately
     * Married filing separately
     * 
     */
    public final static TypeKeyReference<TaxFilingStatusType> TC_MARRIED$45$SEPARATE = new TypeKeyCache<TaxFilingStatusType>(TaxFilingStatusType.TYPE, "married-separate");
    /**
     * Single
     * Single
     * 
     */
    public final static TypeKeyReference<TaxFilingStatusType> TC_SINGLE = new TypeKeyCache<TaxFilingStatusType>(TaxFilingStatusType.TYPE, "single");
    /**
     * Qualifying widow(er) with dependent child
     * Qualifying widow(er) with dependent child
     * 
     */
    public final static TypeKeyReference<TaxFilingStatusType> TC_WIDOW = new TypeKeyCache<TaxFilingStatusType>(TaxFilingStatusType.TYPE, "widow");

}
