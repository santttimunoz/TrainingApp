
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import extensions.ab.contact.entity.Verifiable_Ext;
import gw.pl.activity.typekey.Priority;

public abstract class Verifiable_ExtStub
    extends AspectBase
    implements Verifiable_ExtInternalStubI
{


    protected Verifiable_ExtStub(Verifiable_Ext owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public Verifiable_Ext getOwner() {
        return ((Verifiable_Ext) super.getOwner());
    }

    @Override
    public Boolean isRequiresVerification() {
        return ((Boolean) getFieldValue(REQUIRESVERIFICATION_DYNPROP.get(getOwner().getIntrinsicType())));
    }

    @Override
    public void setRequiresVerification(Boolean value) {
        setFieldValue(REQUIRESVERIFICATION_DYNPROP.get(getOwner().getIntrinsicType()), value);
    }

    @Override
    public Date getVerificationDate() {
        return ((Date) getFieldValue(VERIFICATIONDATE_DYNPROP.get(getOwner().getIntrinsicType())));
    }

    @Override
    public void setVerificationDate(Date value) {
        setFieldValue(VERIFICATIONDATE_DYNPROP.get(getOwner().getIntrinsicType()), value);
    }

    @Override
    public Date getVerificationDueDate() {
        return ((Date) getFieldValue(VERIFICATIONDUEDATE_DYNPROP.get(getOwner().getIntrinsicType())));
    }

    @Override
    public void setVerificationDueDate(Date value) {
        setFieldValue(VERIFICATIONDUEDATE_DYNPROP.get(getOwner().getIntrinsicType()), value);
    }

    @Override
    public Priority getPriority() {
        return ((Priority) getFieldValue(PRIORITY_DYNPROP.get(getOwner().getIntrinsicType())));
    }

    @Override
    public void setPriority(Priority value) {
        setFieldValue(PRIORITY_DYNPROP.get(getOwner().getIntrinsicType()), value);
    }

}
