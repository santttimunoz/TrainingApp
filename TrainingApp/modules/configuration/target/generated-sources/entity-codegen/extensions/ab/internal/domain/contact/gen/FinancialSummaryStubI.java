
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.LinkPropertyInfoCache;
import extensions.ab.contact.entity.FinancialSummary;
import gw.ab.addressbook.entity.ABContact;
import gw.api.financials.CurrencyAmount;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ILinkPropertyInfo;
import gw.pl.persistence.core.entity.Retireable;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface FinancialSummaryStubI
    extends Retireable
{

    EntityTypeReference<FinancialSummary> TYPE = new EntityIntrinsicTypeReference<FinancialSummary>("entity.FinancialSummary");
    EntityPropertyInfoReference<IColumnPropertyInfo> LOADCOMMANDID_PROP = new ColumnPropertyInfoCache(TYPE, "LoadCommandID");
    EntityPropertyInfoReference<ILinkPropertyInfo> ABCONTACT_PROP = new LinkPropertyInfoCache(TYPE, "ABContact");
    EntityPropertyInfoReference<IColumnPropertyInfo> TOTALPOLICYPREMIUMBILLED_PROP = new ColumnPropertyInfoCache(TYPE, "TotalPolicyPremiumBilled");
    EntityPropertyInfoReference<IColumnPropertyInfo> TOTALPOLICYPREMIUMPAID_PROP = new ColumnPropertyInfoCache(TYPE, "TotalPolicyPremiumPaid");
    EntityPropertyInfoReference<IColumnPropertyInfo> TOTALPOLICYPREMIUMREFUNDED_PROP = new ColumnPropertyInfoCache(TYPE, "TotalPolicyPremiumRefunded");
    EntityPropertyInfoReference<IColumnPropertyInfo> TOTALCLAIMPAYMENTSMADE_PROP = new ColumnPropertyInfoCache(TYPE, "TotalClaimPaymentsMade");
    EntityPropertyInfoReference<IColumnPropertyInfo> NUMBEROFCLAIMS_PROP = new ColumnPropertyInfoCache(TYPE, "NumberOfClaims");
    EntityPropertyInfoReference<IColumnPropertyInfo> MOSTRECENTCLAIM_PROP = new ColumnPropertyInfoCache(TYPE, "MostRecentClaim");
    EntityPropertyInfoReference<IColumnPropertyInfo> RETIREDVALUE_PROP = new ColumnPropertyInfoCache(TYPE, "RetiredValue");
    EntityPropertyInfoReference<IColumnPropertyInfo> CREATETIME_PROP = new ColumnPropertyInfoCache(TYPE, "CreateTime");
    EntityPropertyInfoReference<IColumnPropertyInfo> UPDATETIME_PROP = new ColumnPropertyInfoCache(TYPE, "UpdateTime");
    EntityPropertyInfoReference<ILinkPropertyInfo> CREATEUSER_PROP = new LinkPropertyInfoCache(TYPE, "CreateUser");
    EntityPropertyInfoReference<ILinkPropertyInfo> UPDATEUSER_PROP = new LinkPropertyInfoCache(TYPE, "UpdateUser");
    EntityPropertyInfoReference<IColumnPropertyInfo> BEANVERSION_PROP = new ColumnPropertyInfoCache(TYPE, "BeanVersion");
    EntityPropertyInfoReference<IColumnPropertyInfo> ID_PROP = new ColumnPropertyInfoCache(TYPE, "ID");
    EntityPropertyInfoReference<IColumnPropertyInfo> PUBLICID_PROP = new ColumnPropertyInfoCache(TYPE, "PublicID");

    /**
     * Gets the value of the LoadCommandID field.
     * 
     * 
     */
    Long getLoadCommandID();

    /**
     * Gets the value of the ABContact field.
     * Related ABContact
     * 
     */
    ABContact getABContact();

    /**
     * Sets the value of the ABContact field.
     * 
     */
    void setABContact(ABContact value);

    /**
     * Gets the value of the TotalPolicyPremiumBilled field.
     * Total amount of money billed to contact for all policies held
     * 
     */
    CurrencyAmount getTotalPolicyPremiumBilled();

    /**
     * Sets the value of the TotalPolicyPremiumBilled field.
     * 
     */
    void setTotalPolicyPremiumBilled(CurrencyAmount value);

    /**
     * Gets the value of the TotalPolicyPremiumPaid field.
     * Total amount of money paid by contact for all policies held
     * 
     */
    CurrencyAmount getTotalPolicyPremiumPaid();

    /**
     * Sets the value of the TotalPolicyPremiumPaid field.
     * 
     */
    void setTotalPolicyPremiumPaid(CurrencyAmount value);

    /**
     * Gets the value of the TotalPolicyPremiumRefunded field.
     * Total amount of money refunded to contact
     * 
     */
    CurrencyAmount getTotalPolicyPremiumRefunded();

    /**
     * Sets the value of the TotalPolicyPremiumRefunded field.
     * 
     */
    void setTotalPolicyPremiumRefunded(CurrencyAmount value);

    /**
     * Gets the value of the TotalClaimPaymentsMade field.
     * Total amount of money paid for claims on policies held by contact
     * 
     */
    CurrencyAmount getTotalClaimPaymentsMade();

    /**
     * Sets the value of the TotalClaimPaymentsMade field.
     * 
     */
    void setTotalClaimPaymentsMade(CurrencyAmount value);

    /**
     * Gets the value of the NumberOfClaims field.
     * Number of claims made against policies held by contact
     * 
     */
    Integer getNumberOfClaims();

    /**
     * Sets the value of the NumberOfClaims field.
     * 
     */
    void setNumberOfClaims(Integer value);

    /**
     * Gets the value of the MostRecentClaim field.
     * Date of most recent claim (whether money was paid or not)
     * 
     */
    Date getMostRecentClaim();

    /**
     * Sets the value of the MostRecentClaim field.
     * 
     */
    void setMostRecentClaim(Date value);

}
