
package extensions.ab.internal.domain.community.gen;

import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import extensions.ab.contact.typekey.MeasurementSystem;
import gw.pl.community.entity.User;

public abstract class UserExtMethodsStub
    extends AspectBase
    implements UserExtInternalMethodsStubI
{


    protected UserExtMethodsStub(User owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public User getOwner() {
        return ((User) super.getOwner());
    }

    @Override
    public Integer getIntegerExt() {
        return ((Integer) getFieldValue(INTEGEREXT_PROP.get()));
    }

    @Override
    public void setIntegerExt(Integer value) {
        setFieldValue(INTEGEREXT_PROP.get(), value);
    }

    @Override
    public Boolean isUseHelperLabels() {
        return ((Boolean) getFieldValue(USEHELPERLABELS_PROP.get()));
    }

    @Override
    public void setUseHelperLabels(Boolean value) {
        setFieldValue(USEHELPERLABELS_PROP.get(), value);
    }

    @Override
    public MeasurementSystem getMeasurementSystemPreference() {
        return ((MeasurementSystem) getFieldValue(MEASUREMENTSYSTEMPREFERENCE_PROP.get()));
    }

    @Override
    public void setMeasurementSystemPreference(MeasurementSystem value) {
        setFieldValue(MEASUREMENTSYSTEMPREFERENCE_PROP.get(), value);
    }

}
