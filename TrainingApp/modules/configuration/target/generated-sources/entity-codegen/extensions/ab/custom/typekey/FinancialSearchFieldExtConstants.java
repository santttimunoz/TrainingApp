
package extensions.ab.custom.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.custom.typekey.FinancialSearchField;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class FinancialSearchFieldExtConstants {

    /**
     * Amount
     * Amount
     * 
     */
    public final static TypeKeyReference<FinancialSearchField> TC_AMOUNT = new TypeKeyCache<FinancialSearchField>(FinancialSearchField.TYPE, "Amount");

}
