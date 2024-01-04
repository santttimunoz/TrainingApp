
package extensions.ab.internal.domain.addressbook.gen;

import java.util.Date;
import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import gw.ab.addressbook.entity.ABPersonVendor;

public abstract class ABPersonVendorExtMethodsStub
    extends AspectBase
    implements ABPersonVendorExtInternalMethodsStubI
{


    protected ABPersonVendorExtMethodsStub(ABPersonVendor owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public ABPersonVendor getOwner() {
        return ((ABPersonVendor) super.getOwner());
    }

    @Override
    public Boolean isSelfEmployeed_Ext() {
        return ((Boolean) getFieldValue(SELFEMPLOYEED_EXT_PROP.get()));
    }

    @Override
    public void setSelfEmployeed_Ext(Boolean value) {
        setFieldValue(SELFEMPLOYEED_EXT_PROP.get(), value);
    }

    @Override
    public Integer getFraudConvictions_Ext() {
        return ((Integer) getFieldValue(FRAUDCONVICTIONS_EXT_PROP.get()));
    }

    @Override
    public void setFraudConvictions_Ext(Integer value) {
        setFieldValue(FRAUDCONVICTIONS_EXT_PROP.get(), value);
    }

    @Override
    public Date getFraudConvictionsDate_Ext() {
        return ((Date) getFieldValue(FRAUDCONVICTIONSDATE_EXT_PROP.get()));
    }

    @Override
    public void setFraudConvictionsDate_Ext(Date value) {
        setFieldValue(FRAUDCONVICTIONSDATE_EXT_PROP.get(), value);
    }

}
