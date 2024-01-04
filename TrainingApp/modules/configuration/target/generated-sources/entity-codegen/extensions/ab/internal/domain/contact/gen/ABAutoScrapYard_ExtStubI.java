
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import extensions.ab.contact.entity.ABAutoScrapYard_Ext;
import gw.ab.addressbook.entity.ABCompanyVendor;
import gw.entity.IColumnPropertyInfo;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface ABAutoScrapYard_ExtStubI
    extends ABCompanyVendor
{

    EntityTypeReference<ABAutoScrapYard_Ext> TYPE = new EntityIntrinsicTypeReference<ABAutoScrapYard_Ext>("entity.ABAutoScrapYard_Ext");
    EntityPropertyInfoReference<IColumnPropertyInfo> CANPICKUPVEHICLES_PROP = new ColumnPropertyInfoCache(TYPE, "CanPickUpVehicles");

    /**
     * Gets the value of the CanPickUpVehicles field.
     * Can this yard tow non-operational vehicles to its yard?
     * 
     */
    Boolean isCanPickUpVehicles();

    /**
     * Sets the value of the CanPickUpVehicles field.
     * 
     */
    void setCanPickUpVehicles(Boolean value);

}
