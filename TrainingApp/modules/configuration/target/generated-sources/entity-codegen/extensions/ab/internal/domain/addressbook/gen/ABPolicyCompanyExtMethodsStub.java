
package extensions.ab.internal.domain.addressbook.gen;

import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import extensions.ab.contact.typekey.YesNo;
import gw.ab.addressbook.entity.ABPolicyCompany;

public abstract class ABPolicyCompanyExtMethodsStub
    extends AspectBase
    implements ABPolicyCompanyExtInternalMethodsStubI
{


    protected ABPolicyCompanyExtMethodsStub(ABPolicyCompany owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public ABPolicyCompany getOwner() {
        return ((ABPolicyCompany) super.getOwner());
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
    public YesNo getCompanyCollateralVerified() {
        return ((YesNo) getFieldValue(COMPANYCOLLATERALVERIFIED_PROP.get()));
    }

    @Override
    public void setCompanyCollateralVerified(YesNo value) {
        setFieldValue(COMPANYCOLLATERALVERIFIED_PROP.get(), value);
    }

}
