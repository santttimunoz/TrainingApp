
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import extensions.ab.contact.entity.ABAutoRepairShop;
import gw.ab.addressbook.entity.ABCompanyVendor;
import gw.entity.IColumnPropertyInfo;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface ABAutoRepairShopStubI
    extends ABCompanyVendor
{

    EntityTypeReference<ABAutoRepairShop> TYPE = new EntityIntrinsicTypeReference<ABAutoRepairShop>("entity.ABAutoRepairShop");
    EntityPropertyInfoReference<IColumnPropertyInfo> AUTOREPAIRLICENSE_PROP = new ColumnPropertyInfoCache(TYPE, "AutoRepairLicense");
    EntityPropertyInfoReference<IColumnPropertyInfo> ISFRANCHISE_PROP = new ColumnPropertyInfoCache(TYPE, "IsFranchise");
    EntityPropertyInfoReference<IColumnPropertyInfo> TOWINGPROVIDER_PROP = new ColumnPropertyInfoCache(TYPE, "TowingProvider");

    /**
     * Gets the value of the AutoRepairLicense field.
     * Auto repair shop business license number
     * 
     */
    String getAutoRepairLicense();

    /**
     * Sets the value of the AutoRepairLicense field.
     * 
     */
    void setAutoRepairLicense(String value);

    /**
     * Gets the value of the IsFranchise field.
     * Is this agency a franchise?
     * 
     */
    Boolean isIsFranchise();

    /**
     * Sets the value of the IsFranchise field.
     * 
     */
    void setIsFranchise(Boolean value);

    /**
     * Gets the value of the TowingProvider field.
     * Secondary towing provider
     * 
     */
    String getTowingProvider();

    /**
     * Sets the value of the TowingProvider field.
     * 
     */
    void setTowingProvider(String value);

}
