
package extensions.ab.custom.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.custom.typekey.DateFieldsToSearchType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class DateFieldsToSearchTypeExtConstants {

    /**
     * Effective Date
     * Find by Effective Date
     * 
     */
    public final static TypeKeyReference<DateFieldsToSearchType> TC_EFFECTIVEDATE = new TypeKeyCache<DateFieldsToSearchType>(DateFieldsToSearchType.TYPE, "EffectiveDate");
    /**
     * Expiration Date
     * Find by Expiration Date
     * 
     */
    public final static TypeKeyReference<DateFieldsToSearchType> TC_EXPIRATIONDATE = new TypeKeyCache<DateFieldsToSearchType>(DateFieldsToSearchType.TYPE, "ExpirationDate");
    /**
     * Submission Date
     * Find by Submission Date
     * 
     */
    public final static TypeKeyReference<DateFieldsToSearchType> TC_SUBMISSIONDATE = new TypeKeyCache<DateFieldsToSearchType>(DateFieldsToSearchType.TYPE, "SubmissionDate");

}
