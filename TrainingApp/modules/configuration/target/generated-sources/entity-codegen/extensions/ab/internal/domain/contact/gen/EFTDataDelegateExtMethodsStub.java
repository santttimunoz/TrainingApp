
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.pl.system.entity.aspect.AspectBase;
import com.guidewire.pl.system.entity.proxy.BeanProxy;
import extensions.ab.contact.typekey.BankAccountType;
import gw.ab.contact.entity.EFTDataDelegate;

public abstract class EFTDataDelegateExtMethodsStub
    extends AspectBase
    implements EFTDataDelegateExtInternalMethodsStubI
{


    protected EFTDataDelegateExtMethodsStub(EFTDataDelegate owner) {
        super(((BeanProxy) owner));
    }

    @Override
    public EFTDataDelegate getOwner() {
        return ((EFTDataDelegate) super.getOwner());
    }

    @Override
    public String getAccountName() {
        return ((String) getFieldValueForCodegen(ACCOUNTNAME_DYNPROP.get(getOwner().getIntrinsicType())));
    }

    @Override
    public void setAccountName(String value) {
        setFieldValueForCodegen(ACCOUNTNAME_DYNPROP.get(getOwner().getIntrinsicType()), value);
    }

    @Override
    public String getBankName() {
        return ((String) getFieldValueForCodegen(BANKNAME_DYNPROP.get(getOwner().getIntrinsicType())));
    }

    @Override
    public void setBankName(String value) {
        setFieldValueForCodegen(BANKNAME_DYNPROP.get(getOwner().getIntrinsicType()), value);
    }

    @Override
    public BankAccountType getBankAccountType() {
        return ((BankAccountType) getFieldValue(BANKACCOUNTTYPE_DYNPROP.get(getOwner().getIntrinsicType())));
    }

    @Override
    public void setBankAccountType(BankAccountType value) {
        setFieldValue(BANKACCOUNTTYPE_DYNPROP.get(getOwner().getIntrinsicType()), value);
    }

    @Override
    public String getBankAccountNumber() {
        return ((String) getFieldValueForCodegen(BANKACCOUNTNUMBER_DYNPROP.get(getOwner().getIntrinsicType())));
    }

    @Override
    public void setBankAccountNumber(String value) {
        setFieldValueForCodegen(BANKACCOUNTNUMBER_DYNPROP.get(getOwner().getIntrinsicType()), value);
    }

    @Override
    public String getBankRoutingNumber() {
        return ((String) getFieldValueForCodegen(BANKROUTINGNUMBER_DYNPROP.get(getOwner().getIntrinsicType())));
    }

    @Override
    public void setBankRoutingNumber(String value) {
        setFieldValueForCodegen(BANKROUTINGNUMBER_DYNPROP.get(getOwner().getIntrinsicType()), value);
    }

    @Override
    public Boolean isIsPrimary() {
        return ((Boolean) getFieldValue(ISPRIMARY_DYNPROP.get(getOwner().getIntrinsicType())));
    }

    @Override
    public void setIsPrimary(Boolean value) {
        setFieldValue(ISPRIMARY_DYNPROP.get(getOwner().getIntrinsicType()), value);
    }

}
