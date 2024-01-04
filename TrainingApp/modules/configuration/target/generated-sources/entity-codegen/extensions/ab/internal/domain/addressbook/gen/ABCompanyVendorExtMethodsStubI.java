
package extensions.ab.internal.domain.addressbook.gen;

import com.guidewire.commons.metadata.types.LinkPropertyInfoCache;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.contact.typekey.ManagerRelationshipType;
import gw.ab.addressbook.entity.ABCompanyVendor;
import gw.ab.addressbook.entity.ABPerson;
import gw.entity.ILinkPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.persistence.type.EntityPropertyInfoReference;

public interface ABCompanyVendorExtMethodsStubI {

    EntityPropertyInfoReference<ILinkPropertyInfo> FINANCEMANAGER_PROP = new LinkPropertyInfoCache(ABCompanyVendor.TYPE, "FinanceManager");
    EntityPropertyInfoReference<ILinkPropertyInfo> PAYMENTCONTACT_PROP = new LinkPropertyInfoCache(ABCompanyVendor.TYPE, "PaymentContact");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> FINANCEMGRRELATIONSHIP_PROP = new TypekeyPropertyInfoCache(ABCompanyVendor.TYPE, "FinanceMgrRelationship");

    /**
     * Gets the value of the FinanceManager field.
     * 
     * 
     */
    ABPerson getFinanceManager();

    /**
     * Sets the value of the FinanceManager field.
     * 
     */
    void setFinanceManager(ABPerson value);

    /**
     * Gets the value of the PaymentContact field.
     * 
     * 
     */
    ABPerson getPaymentContact();

    /**
     * Sets the value of the PaymentContact field.
     * 
     */
    void setPaymentContact(ABPerson value);

    /**
     * Gets the value of the FinanceMgrRelationship field.
     * Relationship To Finance Manager
     * 
     */
    ManagerRelationshipType getFinanceMgrRelationship();

    /**
     * Sets the value of the FinanceMgrRelationship field.
     * 
     */
    void setFinanceMgrRelationship(ManagerRelationshipType value);

}
