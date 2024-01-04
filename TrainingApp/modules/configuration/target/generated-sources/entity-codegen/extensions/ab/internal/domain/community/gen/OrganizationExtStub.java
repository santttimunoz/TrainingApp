
package extensions.ab.internal.domain.community.gen;

import java.math.BigDecimal;
import java.util.Date;
import com.guidewire.ab.domain.community.impl.OrganizationCoreExtImpl;
import extensions.ab.internal.domain.community.impl.OrganizationExtInternal;
import extensions.ab.internal.domain.community.impl.OrganizationExtMethodsImpl;
import gw.api.financials.CurrencyAmount;

public class OrganizationExtStub
    extends OrganizationCoreExtImpl
    implements OrganizationExtInternal
{


    @Override
    public String getNameKanji() {
        return getExtensionDelegate(OrganizationExtMethodsImpl.class).getNameKanji();
    }

    @Override
    public void setNameKanji(String value) {
        getExtensionDelegate(OrganizationExtMethodsImpl.class).setNameKanji(value);
    }

    @Override
    public Integer getNumberOfEmployees_Ext() {
        return getExtensionDelegate(OrganizationExtMethodsImpl.class).getNumberOfEmployees_Ext();
    }

    @Override
    public void setNumberOfEmployees_Ext(Integer value) {
        getExtensionDelegate(OrganizationExtMethodsImpl.class).setNumberOfEmployees_Ext(value);
    }

    @Override
    public BigDecimal getRiskFactor_Ext() {
        return getExtensionDelegate(OrganizationExtMethodsImpl.class).getRiskFactor_Ext();
    }

    @Override
    public void setRiskFactor_Ext(BigDecimal value) {
        getExtensionDelegate(OrganizationExtMethodsImpl.class).setRiskFactor_Ext(value);
    }

    @Override
    public CurrencyAmount getStockPrice_Ext() {
        return getExtensionDelegate(OrganizationExtMethodsImpl.class).getStockPrice_Ext();
    }

    @Override
    public void setStockPrice_Ext(CurrencyAmount value) {
        getExtensionDelegate(OrganizationExtMethodsImpl.class).setStockPrice_Ext(value);
    }

    @Override
    public Integer getLargeClaimPercent_Ext() {
        return getExtensionDelegate(OrganizationExtMethodsImpl.class).getLargeClaimPercent_Ext();
    }

    @Override
    public void setLargeClaimPercent_Ext(Integer value) {
        getExtensionDelegate(OrganizationExtMethodsImpl.class).setLargeClaimPercent_Ext(value);
    }

    @Override
    public String getStockTicker_Ext() {
        return getExtensionDelegate(OrganizationExtMethodsImpl.class).getStockTicker_Ext();
    }

    @Override
    public void setStockTicker_Ext(String value) {
        getExtensionDelegate(OrganizationExtMethodsImpl.class).setStockTicker_Ext(value);
    }

    @Override
    public Date getIPODate_Ext() {
        return getExtensionDelegate(OrganizationExtMethodsImpl.class).getIPODate_Ext();
    }

    @Override
    public void setIPODate_Ext(Date value) {
        getExtensionDelegate(OrganizationExtMethodsImpl.class).setIPODate_Ext(value);
    }

    @Override
    public Boolean isIsTaxExempt_Ext() {
        return getExtensionDelegate(OrganizationExtMethodsImpl.class).isIsTaxExempt_Ext();
    }

    @Override
    public void setIsTaxExempt_Ext(Boolean value) {
        getExtensionDelegate(OrganizationExtMethodsImpl.class).setIsTaxExempt_Ext(value);
    }

    @Override
    public Boolean isIsPublic_Ext() {
        return getExtensionDelegate(OrganizationExtMethodsImpl.class).isIsPublic_Ext();
    }

    @Override
    public void setIsPublic_Ext(Boolean value) {
        getExtensionDelegate(OrganizationExtMethodsImpl.class).setIsPublic_Ext(value);
    }

    @Override
    public String getPurchaseOrderAccountNumber_Ext() {
        return getExtensionDelegate(OrganizationExtMethodsImpl.class).getPurchaseOrderAccountNumber_Ext();
    }

    @Override
    public void setPurchaseOrderAccountNumber_Ext(String value) {
        getExtensionDelegate(OrganizationExtMethodsImpl.class).setPurchaseOrderAccountNumber_Ext(value);
    }

    @Override
    public Boolean isPurchaseOrderAccountNumberVerified_Ext() {
        return getExtensionDelegate(OrganizationExtMethodsImpl.class).isPurchaseOrderAccountNumberVerified_Ext();
    }

    @Override
    public void setPurchaseOrderAccountNumberVerified_Ext(Boolean value) {
        getExtensionDelegate(OrganizationExtMethodsImpl.class).setPurchaseOrderAccountNumberVerified_Ext(value);
    }

}
