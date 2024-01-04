
package extensions.ab.contact.typekey;

import com.guidewire.commons.metadata.types.TypeKeyCache;
import gw.pl.contact.typekey.PayPeriodType;
import gw.pl.persistence.typelist.TypeKeyReference;

public final class PayPeriodTypeExtConstants {

    /**
     * Daily
     * Employee paid on a daily basis
     * 
     */
    public final static TypeKeyReference<PayPeriodType> TC_DAILY = new TypeKeyCache<PayPeriodType>(PayPeriodType.TYPE, "daily");
    /**
     * Every Two Weeks
     * Employee paid every two weeks
     * 
     */
    public final static TypeKeyReference<PayPeriodType> TC_EVERYTWOWEEKS = new TypeKeyCache<PayPeriodType>(PayPeriodType.TYPE, "everytwoweeks");
    /**
     * Monthly
     * Employee paid on a monthly basis
     * 
     */
    public final static TypeKeyReference<PayPeriodType> TC_MONTHLY = new TypeKeyCache<PayPeriodType>(PayPeriodType.TYPE, "monthly");
    /**
     * Employee paid on submitted invoices
     * On Invoice
     * 
     */
    public final static TypeKeyReference<PayPeriodType> TC_ONINVOICE = new TypeKeyCache<PayPeriodType>(PayPeriodType.TYPE, "oninvoice");
    /**
     * Twice a Month
     * Employee paid twice a month
     * 
     */
    public final static TypeKeyReference<PayPeriodType> TC_TWICEAMONTH = new TypeKeyCache<PayPeriodType>(PayPeriodType.TYPE, "twiceamonth");
    /**
     * Weekly
     * Employee paid on a weekly basis
     * 
     */
    public final static TypeKeyReference<PayPeriodType> TC_WEEKLY = new TypeKeyCache<PayPeriodType>(PayPeriodType.TYPE, "weekly");

}
