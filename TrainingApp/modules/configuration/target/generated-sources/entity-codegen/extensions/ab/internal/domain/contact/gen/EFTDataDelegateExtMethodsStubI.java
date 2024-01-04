
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.commons.metadata.types.ColumnDynPropertyInfo;
import com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo;
import extensions.ab.contact.typekey.BankAccountType;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.persistence.type.DynamicEntityPropertyInfoReference;

public interface EFTDataDelegateExtMethodsStubI {

    DynamicEntityPropertyInfoReference<IColumnPropertyInfo> ACCOUNTNAME_DYNPROP = new ColumnDynPropertyInfo("AccountName", "AccountName");
    DynamicEntityPropertyInfoReference<IColumnPropertyInfo> BANKNAME_DYNPROP = new ColumnDynPropertyInfo("BankName", "BankName");
    DynamicEntityPropertyInfoReference<ITypekeyPropertyInfo> BANKACCOUNTTYPE_DYNPROP = new TypekeyDynPropertyInfo("BankAccountType", "BankAccountType");
    DynamicEntityPropertyInfoReference<IColumnPropertyInfo> BANKACCOUNTNUMBER_DYNPROP = new ColumnDynPropertyInfo("BankAccountNumber", "BankAccountNumber");
    DynamicEntityPropertyInfoReference<IColumnPropertyInfo> BANKROUTINGNUMBER_DYNPROP = new ColumnDynPropertyInfo("BankRoutingNumber", "BankRoutingNumber");
    DynamicEntityPropertyInfoReference<IColumnPropertyInfo> ISPRIMARY_DYNPROP = new ColumnDynPropertyInfo("IsPrimary", "IsPrimary");

    /**
     * Gets the value of the AccountName field.
     * The name on the account
     * 
     */
    String getAccountName();

    /**
     * Sets the value of the AccountName field.
     * 
     */
    void setAccountName(String value);

    /**
     * Gets the value of the BankName field.
     * The name of the bank
     * 
     */
    String getBankName();

    /**
     * Sets the value of the BankName field.
     * 
     */
    void setBankName(String value);

    /**
     * Gets the value of the BankAccountType field.
     * The type of bank accout e.g. checking, savings etc
     * 
     */
    BankAccountType getBankAccountType();

    /**
     * Sets the value of the BankAccountType field.
     * 
     */
    void setBankAccountType(BankAccountType value);

    /**
     * Gets the value of the BankAccountNumber field.
     * The bank account number
     * 
     */
    String getBankAccountNumber();

    /**
     * Sets the value of the BankAccountNumber field.
     * 
     */
    void setBankAccountNumber(String value);

    /**
     * Gets the value of the BankRoutingNumber field.
     * The routing number is a nine digit bank code used in the United States
     * 
     */
    String getBankRoutingNumber();

    /**
     * Sets the value of the BankRoutingNumber field.
     * 
     */
    void setBankRoutingNumber(String value);

    /**
     * Gets the value of the IsPrimary field.
     * Indicates if this is the primary EFT record for the contact
     * 
     */
    Boolean isIsPrimary();

    /**
     * Sets the value of the IsPrimary field.
     * 
     */
    void setIsPrimary(Boolean value);

}
