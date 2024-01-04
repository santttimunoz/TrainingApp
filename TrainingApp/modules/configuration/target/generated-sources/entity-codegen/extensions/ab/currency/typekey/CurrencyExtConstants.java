
package extensions.ab.currency.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.currency.typekey.Currency;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class CurrencyExtConstants {

    /**
     * AUD
     * Australian Dollar
     * 
     */
    public final static TypeKeyReference<Currency> TC_AUD = new TypeKeyCache<Currency>(Currency.TYPE, "aud");
    /**
     * CAD
     * Canadian Dollar
     * 
     */
    public final static TypeKeyReference<Currency> TC_CAD = new TypeKeyCache<Currency>(Currency.TYPE, "cad");
    /**
     * EUR
     * Euro
     * 
     */
    public final static TypeKeyReference<Currency> TC_EUR = new TypeKeyCache<Currency>(Currency.TYPE, "eur");
    /**
     * GBP
     * United Kingdom Pound
     * 
     */
    public final static TypeKeyReference<Currency> TC_GBP = new TypeKeyCache<Currency>(Currency.TYPE, "gbp");
    /**
     * JPY
     * Japanese Yen
     * 
     */
    public final static TypeKeyReference<Currency> TC_JPY = new TypeKeyCache<Currency>(Currency.TYPE, "jpy");
    /**
     * RUB
     * Russian Ruble
     * 
     */
    public final static TypeKeyReference<Currency> TC_RUB = new TypeKeyCache<Currency>(Currency.TYPE, "rub");
    /**
     * USD
     * US Dollar
     * 
     */
    public final static TypeKeyReference<Currency> TC_USD = new TypeKeyCache<Currency>(Currency.TYPE, "usd");

}
