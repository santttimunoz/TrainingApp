
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.LinkPropertyInfoCache;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.contact.entity.BankAccount;
import extensions.ab.contact.typekey.BankAccountType;
import extensions.ab.contact.typekey.VerificationStatus;
import gw.ab.addressbook.entity.ABContact;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ILinkPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.messaging.entity.EventAware;
import gw.pl.persistence.core.entity.Retireable;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface BankAccountStubI
    extends EventAware, Retireable
{

    EntityTypeReference<BankAccount> TYPE = new EntityIntrinsicTypeReference<BankAccount>("entity.BankAccount");
    EntityPropertyInfoReference<IColumnPropertyInfo> LOADCOMMANDID_PROP = new ColumnPropertyInfoCache(TYPE, "LoadCommandID");
    EntityPropertyInfoReference<IColumnPropertyInfo> BANKNAME_PROP = new ColumnPropertyInfoCache(TYPE, "BankName");
    EntityPropertyInfoReference<IColumnPropertyInfo> ROUTINGNUMBER_PROP = new ColumnPropertyInfoCache(TYPE, "RoutingNumber");
    EntityPropertyInfoReference<IColumnPropertyInfo> ACCOUNTNUMBER_PROP = new ColumnPropertyInfoCache(TYPE, "AccountNumber");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> ACCOUNTTYPE_PROP = new TypekeyPropertyInfoCache(TYPE, "AccountType");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> ISVERIFIED_PROP = new TypekeyPropertyInfoCache(TYPE, "IsVerified");
    EntityPropertyInfoReference<ILinkPropertyInfo> ABCONTACT_PROP = new LinkPropertyInfoCache(TYPE, "ABContact");
    EntityPropertyInfoReference<IColumnPropertyInfo> ORGINATEDATE_PROP = new ColumnPropertyInfoCache(TYPE, "OrginateDate");
    EntityPropertyInfoReference<IColumnPropertyInfo> RETIREDVALUE_PROP = new ColumnPropertyInfoCache(TYPE, "RetiredValue");
    EntityPropertyInfoReference<IColumnPropertyInfo> CREATETIME_PROP = new ColumnPropertyInfoCache(TYPE, "CreateTime");
    EntityPropertyInfoReference<IColumnPropertyInfo> UPDATETIME_PROP = new ColumnPropertyInfoCache(TYPE, "UpdateTime");
    EntityPropertyInfoReference<ILinkPropertyInfo> CREATEUSER_PROP = new LinkPropertyInfoCache(TYPE, "CreateUser");
    EntityPropertyInfoReference<ILinkPropertyInfo> UPDATEUSER_PROP = new LinkPropertyInfoCache(TYPE, "UpdateUser");
    EntityPropertyInfoReference<IColumnPropertyInfo> BEANVERSION_PROP = new ColumnPropertyInfoCache(TYPE, "BeanVersion");
    EntityPropertyInfoReference<IColumnPropertyInfo> ID_PROP = new ColumnPropertyInfoCache(TYPE, "ID");
    EntityPropertyInfoReference<IColumnPropertyInfo> PUBLICID_PROP = new ColumnPropertyInfoCache(TYPE, "PublicID");
    String BANKACCOUNTADDED_EVENT = "BankAccountAdded";
    String BANKACCOUNTCHANGED_EVENT = "BankAccountChanged";
    String BANKACCOUNTREMOVED_EVENT = "BankAccountRemoved";

    /**
     * Gets the value of the LoadCommandID field.
     * 
     * 
     */
    Long getLoadCommandID();

    /**
     * Gets the value of the BankName field.
     * Bank name
     * 
     */
    String getBankName();

    /**
     * Sets the value of the BankName field.
     * 
     */
    void setBankName(String value);

    /**
     * Gets the value of the RoutingNumber field.
     * Account routing number
     * 
     */
    String getRoutingNumber();

    /**
     * Sets the value of the RoutingNumber field.
     * 
     */
    void setRoutingNumber(String value);

    /**
     * Gets the value of the AccountNumber field.
     * Account number
     * 
     */
    String getAccountNumber();

    /**
     * Sets the value of the AccountNumber field.
     * 
     */
    void setAccountNumber(String value);

    /**
     * Gets the value of the AccountType field.
     * Type of bank account
     * 
     */
    BankAccountType getAccountType();

    /**
     * Sets the value of the AccountType field.
     * 
     */
    void setAccountType(BankAccountType value);

    /**
     * Gets the value of the IsVerified field.
     * Has the routing and account information been verified with the bank?
     * 
     */
    VerificationStatus getIsVerified();

    /**
     * Sets the value of the IsVerified field.
     * 
     */
    void setIsVerified(VerificationStatus value);

    /**
     * Gets the value of the ABContact field.
     * Associated contact
     * 
     */
    ABContact getABContact();

    /**
     * Sets the value of the ABContact field.
     * 
     */
    void setABContact(ABContact value);

    /**
     * Gets the value of the OrginateDate field.
     * 
     * 
     */
    Date getOrginateDate();

    /**
     * Sets the value of the OrginateDate field.
     * 
     */
    void setOrginateDate(Date value);

}
