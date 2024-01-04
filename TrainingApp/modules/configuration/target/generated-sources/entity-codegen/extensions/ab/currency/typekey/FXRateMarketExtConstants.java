
package extensions.ab.currency.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.currency.typekey.FXRateMarket;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class FXRateMarketExtConstants {

    /**
     * StaticTable
     * A static table of one-way rates.
     * 
     */
    public final static TypeKeyReference<FXRateMarket> TC_STATIC_TABLE = new TypeKeyCache<FXRateMarket>(FXRateMarket.TYPE, "static_table");

}
