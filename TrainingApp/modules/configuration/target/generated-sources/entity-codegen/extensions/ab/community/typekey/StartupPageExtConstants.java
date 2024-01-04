
package extensions.ab.community.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.community.typekey.StartupPage;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class StartupPageExtConstants {

    /**
     * Admin
     * Admin
     * 
     */
    public final static TypeKeyReference<StartupPage> TC_ADMIN = new TypeKeyCache<StartupPage>(StartupPage.TYPE, "Admin");
    /**
     * Search
     * Search
     * 
     */
    public final static TypeKeyReference<StartupPage> TC_SEARCH = new TypeKeyCache<StartupPage>(StartupPage.TYPE, "Search");

}
