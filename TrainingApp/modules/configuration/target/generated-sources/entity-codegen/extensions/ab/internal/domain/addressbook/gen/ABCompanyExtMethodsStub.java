
package extensions.ab.internal.domain.addressbook.gen;

import java.util.Date;
import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import gw.ab.addressbook.entity.ABCompany;

public abstract class ABCompanyExtMethodsStub
    extends AspectBase
    implements ABCompanyExtInternalMethodsStubI
{


    protected ABCompanyExtMethodsStub(ABCompany owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public ABCompany getOwner() {
        return ((ABCompany) super.getOwner());
    }

    @Override
    public Boolean isCanAddEmployees() {
        return ((Boolean) getFieldValue(CANADDEMPLOYEES_PROP.get()));
    }

    @Override
    public void setCanAddEmployees(Boolean value) {
        setFieldValue(CANADDEMPLOYEES_PROP.get(), value);
    }

    @Override
    public Boolean isInspectionRequired() {
        return ((Boolean) getFieldValue(INSPECTIONREQUIRED_PROP.get()));
    }

    @Override
    public void setInspectionRequired(Boolean value) {
        setFieldValue(INSPECTIONREQUIRED_PROP.get(), value);
    }

    @Override
    public Date getInspectionDate() {
        return ((Date) getFieldValue(INSPECTIONDATE_PROP.get()));
    }

    @Override
    public void setInspectionDate(Date value) {
        setFieldValue(INSPECTIONDATE_PROP.get(), value);
    }

    @Override
    public Integer getEmployeeScore() {
        return ((Integer) getFieldValue(EMPLOYEESCORE_PROP.get()));
    }

    @Override
    public void setEmployeeScore(Integer value) {
        setFieldValue(EMPLOYEESCORE_PROP.get(), value);
    }

}
