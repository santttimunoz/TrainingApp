
package extensions.ab.internal.domain.addressbook.gen;

import java.math.BigDecimal;
import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import extensions.ab.contact.typekey.YesNo;
import gw.ab.addressbook.entity.ABPolicyPerson;

public abstract class ABPolicyPersonExtMethodsStub
    extends AspectBase
    implements ABPolicyPersonExtInternalMethodsStubI
{


    protected ABPolicyPersonExtMethodsStub(ABPolicyPerson owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public ABPolicyPerson getOwner() {
        return ((ABPolicyPerson) super.getOwner());
    }

    @Override
    public Boolean isCollateralRequired() {
        return ((Boolean) getFieldValue(COLLATERALREQUIRED_PROP.get()));
    }

    @Override
    public void setCollateralRequired(Boolean value) {
        setFieldValue(COLLATERALREQUIRED_PROP.get(), value);
    }

    @Override
    public Integer getCollateralAmount() {
        return ((Integer) getFieldValue(COLLATERALAMOUNT_PROP.get()));
    }

    @Override
    public void setCollateralAmount(Integer value) {
        setFieldValue(COLLATERALAMOUNT_PROP.get(), value);
    }

    @Override
    public YesNo getPersonCollateralVerified() {
        return ((YesNo) getFieldValue(PERSONCOLLATERALVERIFIED_PROP.get()));
    }

    @Override
    public void setPersonCollateralVerified(YesNo value) {
        setFieldValue(PERSONCOLLATERALVERIFIED_PROP.get(), value);
    }

    @Override
    public BigDecimal getHeightInMeters() {
        return ((BigDecimal) getFieldValue(HEIGHTINMETERS_PROP.get()));
    }

    @Override
    public void setHeightInMeters(BigDecimal value) {
        setFieldValue(HEIGHTINMETERS_PROP.get(), value);
    }

}
