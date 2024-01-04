
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.ab.domain.contact.impl.EFTDataImpl;
import extensions.ab.contact.typekey.BankAccountType;
import extensions.ab.internal.domain.contact.impl.EFTDataDelegateExtInternal;
import extensions.ab.internal.domain.contact.impl.EFTDataDelegateExtMethodsImpl;
import extensions.ab.internal.domain.contact.impl.EFTDataExtInternal;

public class EFTDataExtStub
    extends EFTDataImpl
    implements EFTDataDelegateExtInternal, EFTDataExtInternal
{


    @Override
    public String getAccountName() {
        return getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).getAccountName();
    }

    @Override
    public void setAccountName(String value) {
        getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).setAccountName(value);
    }

    @Override
    public String getBankName() {
        return getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).getBankName();
    }

    @Override
    public void setBankName(String value) {
        getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).setBankName(value);
    }

    @Override
    public BankAccountType getBankAccountType() {
        return getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).getBankAccountType();
    }

    @Override
    public void setBankAccountType(BankAccountType value) {
        getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).setBankAccountType(value);
    }

    @Override
    public String getBankAccountNumber() {
        return getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).getBankAccountNumber();
    }

    @Override
    public void setBankAccountNumber(String value) {
        getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).setBankAccountNumber(value);
    }

    @Override
    public String getBankRoutingNumber() {
        return getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).getBankRoutingNumber();
    }

    @Override
    public void setBankRoutingNumber(String value) {
        getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).setBankRoutingNumber(value);
    }

    @Override
    public Boolean isIsPrimary() {
        return getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).isIsPrimary();
    }

    @Override
    public void setIsPrimary(Boolean value) {
        getExtensionDelegate(EFTDataDelegateExtMethodsImpl.class).setIsPrimary(value);
    }

}
