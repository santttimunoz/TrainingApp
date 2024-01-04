
package extensions.ab.internal.domain.community.gen;

import com.guidewire.ab.domain.community.impl.UserCoreExtImpl;
import extensions.ab.contact.typekey.MeasurementSystem;
import extensions.ab.internal.domain.community.impl.UserExtInternal;
import extensions.ab.internal.domain.community.impl.UserExtMethodsImpl;

public class UserExtStub
    extends UserCoreExtImpl
    implements UserExtInternal
{


    @Override
    public Integer getIntegerExt() {
        return getExtensionDelegate(UserExtMethodsImpl.class).getIntegerExt();
    }

    @Override
    public void setIntegerExt(Integer value) {
        getExtensionDelegate(UserExtMethodsImpl.class).setIntegerExt(value);
    }

    @Override
    public Boolean isUseHelperLabels() {
        return getExtensionDelegate(UserExtMethodsImpl.class).isUseHelperLabels();
    }

    @Override
    public void setUseHelperLabels(Boolean value) {
        getExtensionDelegate(UserExtMethodsImpl.class).setUseHelperLabels(value);
    }

    @Override
    public MeasurementSystem getMeasurementSystemPreference() {
        return getExtensionDelegate(UserExtMethodsImpl.class).getMeasurementSystemPreference();
    }

    @Override
    public void setMeasurementSystemPreference(MeasurementSystem value) {
        getExtensionDelegate(UserExtMethodsImpl.class).setMeasurementSystemPreference(value);
    }

}
