
package extensions.ab.contact.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.contact.typekey.ReviewCategory;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class ReviewCategoryExtConstants {

    /**
     * Accuracy of Quote
     * Accuracy of Quote
     * 
     */
    public final static TypeKeyReference<ReviewCategory> TC_ACCURACY = new TypeKeyCache<ReviewCategory>(ReviewCategory.TYPE, "accuracy");
    /**
     * Adjuster
     * Section for adjusters to add comments
     * 
     */
    public final static TypeKeyReference<ReviewCategory> TC_ADJUSTER = new TypeKeyCache<ReviewCategory>(ReviewCategory.TYPE, "adjuster");
    /**
     * Communication
     * Communication
     * 
     */
    public final static TypeKeyReference<ReviewCategory> TC_COMMUNICATION = new TypeKeyCache<ReviewCategory>(ReviewCategory.TYPE, "communication");
    /**
     * General
     * A default category for general questions.
     * 
     */
    public final static TypeKeyReference<ReviewCategory> TC_GENERAL = new TypeKeyCache<ReviewCategory>(ReviewCategory.TYPE, "general");
    /**
     * Office Personnel
     * Office Personnel.
     * 
     */
    public final static TypeKeyReference<ReviewCategory> TC_OFFICESTAFF = new TypeKeyCache<ReviewCategory>(ReviewCategory.TYPE, "officestaff");
    /**
     * Quality of Work
     * Quality of Work
     * 
     */
    public final static TypeKeyReference<ReviewCategory> TC_QUALITY = new TypeKeyCache<ReviewCategory>(ReviewCategory.TYPE, "quality");
    /**
     * Technicians
     * Technicians
     * 
     */
    public final static TypeKeyReference<ReviewCategory> TC_TECHNICIANS = new TypeKeyCache<ReviewCategory>(ReviewCategory.TYPE, "technicians");
    /**
     * Timeliness
     * Timeliness
     * 
     */
    public final static TypeKeyReference<ReviewCategory> TC_TIMELINESS = new TypeKeyCache<ReviewCategory>(ReviewCategory.TYPE, "timeliness");

}
