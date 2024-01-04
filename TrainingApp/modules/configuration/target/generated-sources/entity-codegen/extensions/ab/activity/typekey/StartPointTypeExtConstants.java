
package extensions.ab.activity.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.activity.typekey.StartPointType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class StartPointTypeExtConstants {

    /**
     * Activity creation date
     * Creation date of the activity
     * 
     */
    public final static TypeKeyReference<StartPointType> TC_ACTIVITYCREATION = new TypeKeyCache<StartPointType>(StartPointType.TYPE, "activitycreation");
    /**
     * Activity start date
     * Start date on activity
     * 
     */
    public final static TypeKeyReference<StartPointType> TC_STARTDATE = new TypeKeyCache<StartPointType>(StartPointType.TYPE, "startdate");

}
