
package extensions.ab.internal.domain.community.gen;

import java.math.BigDecimal;
import java.util.Date;
import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import gw.api.financials.CurrencyAmount;
import gw.pl.community.entity.Organization;

public abstract class OrganizationExtMethodsStub
    extends AspectBase
    implements OrganizationExtInternalMethodsStubI
{


    protected OrganizationExtMethodsStub(Organization owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public Organization getOwner() {
        return ((Organization) super.getOwner());
    }

    @Override
    public String getNameKanji() {
        return ((String) getFieldValueForCodegen(NAMEKANJI_PROP.get()));
    }

    @Override
    public void setNameKanji(String value) {
        setFieldValueForCodegen(NAMEKANJI_PROP.get(), value);
    }

    @Override
    public Integer getNumberOfEmployees_Ext() {
        return ((Integer) getFieldValue(NUMBEROFEMPLOYEES_EXT_PROP.get()));
    }

    @Override
    public void setNumberOfEmployees_Ext(Integer value) {
        setFieldValue(NUMBEROFEMPLOYEES_EXT_PROP.get(), value);
    }

    @Override
    public BigDecimal getRiskFactor_Ext() {
        return ((BigDecimal) getFieldValue(RISKFACTOR_EXT_PROP.get()));
    }

    @Override
    public void setRiskFactor_Ext(BigDecimal value) {
        setFieldValue(RISKFACTOR_EXT_PROP.get(), value);
    }

    @Override
    public CurrencyAmount getStockPrice_Ext() {
        return ((CurrencyAmount) getFieldValue(STOCKPRICE_EXT_PROP.get()));
    }

    @Override
    public void setStockPrice_Ext(CurrencyAmount value) {
        setFieldValue(STOCKPRICE_EXT_PROP.get(), value);
    }

    @Override
    public Integer getLargeClaimPercent_Ext() {
        return ((Integer) getFieldValue(LARGECLAIMPERCENT_EXT_PROP.get()));
    }

    @Override
    public void setLargeClaimPercent_Ext(Integer value) {
        setFieldValue(LARGECLAIMPERCENT_EXT_PROP.get(), value);
    }

    @Override
    public String getStockTicker_Ext() {
        return ((String) getFieldValueForCodegen(STOCKTICKER_EXT_PROP.get()));
    }

    @Override
    public void setStockTicker_Ext(String value) {
        setFieldValueForCodegen(STOCKTICKER_EXT_PROP.get(), value);
    }

    @Override
    public Date getIPODate_Ext() {
        return ((Date) getFieldValue(IPODATE_EXT_PROP.get()));
    }

    @Override
    public void setIPODate_Ext(Date value) {
        setFieldValue(IPODATE_EXT_PROP.get(), value);
    }

    @Override
    public Boolean isIsTaxExempt_Ext() {
        return ((Boolean) getFieldValue(ISTAXEXEMPT_EXT_PROP.get()));
    }

    @Override
    public void setIsTaxExempt_Ext(Boolean value) {
        setFieldValue(ISTAXEXEMPT_EXT_PROP.get(), value);
    }

    @Override
    public Boolean isIsPublic_Ext() {
        return ((Boolean) getFieldValue(ISPUBLIC_EXT_PROP.get()));
    }

    @Override
    public void setIsPublic_Ext(Boolean value) {
        setFieldValue(ISPUBLIC_EXT_PROP.get(), value);
    }

    @Override
    public String getPurchaseOrderAccountNumber_Ext() {
        return ((String) getFieldValueForCodegen(PURCHASEORDERACCOUNTNUMBER_EXT_PROP.get()));
    }

    @Override
    public void setPurchaseOrderAccountNumber_Ext(String value) {
        setFieldValueForCodegen(PURCHASEORDERACCOUNTNUMBER_EXT_PROP.get(), value);
    }

    @Override
    public Boolean isPurchaseOrderAccountNumberVerified_Ext() {
        return ((Boolean) getFieldValue(PURCHASEORDERACCOUNTNUMBERVERIFIED_EXT_PROP.get()));
    }

    @Override
    public void setPurchaseOrderAccountNumberVerified_Ext(Boolean value) {
        setFieldValue(PURCHASEORDERACCOUNTNUMBERVERIFIED_EXT_PROP.get(), value);
    }

}
