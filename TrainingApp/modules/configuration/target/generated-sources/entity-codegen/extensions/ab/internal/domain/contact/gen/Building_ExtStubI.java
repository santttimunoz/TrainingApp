
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.LinkPropertyInfoCache;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.contact.entity.Building_Ext;
import extensions.ab.contact.typekey.BuildingType_Ext;
import gw.ab.addressbook.entity.ABContact;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ILinkPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.contact.entity.Address;
import gw.pl.persistence.core.entity.Retireable;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface Building_ExtStubI
    extends Retireable
{

    EntityTypeReference<Building_Ext> TYPE = new EntityIntrinsicTypeReference<Building_Ext>("entity.Building_Ext");
    EntityPropertyInfoReference<IColumnPropertyInfo> LOADCOMMANDID_PROP = new ColumnPropertyInfoCache(TYPE, "LoadCommandID");
    EntityPropertyInfoReference<ILinkPropertyInfo> ADDRESS_PROP = new LinkPropertyInfoCache(TYPE, "Address");
    EntityPropertyInfoReference<ILinkPropertyInfo> ABCONTACT_PROP = new LinkPropertyInfoCache(TYPE, "ABContact");
    EntityPropertyInfoReference<IColumnPropertyInfo> NUMBEROFEMPLOYEES_PROP = new ColumnPropertyInfoCache(TYPE, "NumberOfEmployees");
    EntityPropertyInfoReference<IColumnPropertyInfo> INSPECTIONDATE_PROP = new ColumnPropertyInfoCache(TYPE, "InspectionDate");
    EntityPropertyInfoReference<IColumnPropertyInfo> HASPARKING_PROP = new ColumnPropertyInfoCache(TYPE, "HasParking");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> BUILDINGTYPE_PROP = new TypekeyPropertyInfoCache(TYPE, "BuildingType");
    EntityPropertyInfoReference<IColumnPropertyInfo> RETIREDVALUE_PROP = new ColumnPropertyInfoCache(TYPE, "RetiredValue");
    EntityPropertyInfoReference<IColumnPropertyInfo> CREATETIME_PROP = new ColumnPropertyInfoCache(TYPE, "CreateTime");
    EntityPropertyInfoReference<IColumnPropertyInfo> UPDATETIME_PROP = new ColumnPropertyInfoCache(TYPE, "UpdateTime");
    EntityPropertyInfoReference<ILinkPropertyInfo> CREATEUSER_PROP = new LinkPropertyInfoCache(TYPE, "CreateUser");
    EntityPropertyInfoReference<ILinkPropertyInfo> UPDATEUSER_PROP = new LinkPropertyInfoCache(TYPE, "UpdateUser");
    EntityPropertyInfoReference<IColumnPropertyInfo> BEANVERSION_PROP = new ColumnPropertyInfoCache(TYPE, "BeanVersion");
    EntityPropertyInfoReference<IColumnPropertyInfo> ID_PROP = new ColumnPropertyInfoCache(TYPE, "ID");
    EntityPropertyInfoReference<IColumnPropertyInfo> PUBLICID_PROP = new ColumnPropertyInfoCache(TYPE, "PublicID");

    /**
     * Gets the value of the LoadCommandID field.
     * 
     * 
     */
    Long getLoadCommandID();

    /**
     * Gets the value of the Address field.
     * Address at which building is located
     * 
     */
    Address getAddress();

    /**
     * Sets the value of the Address field.
     * 
     */
    void setAddress(Address value);

    /**
     * Gets the value of the ABContact field.
     * Associated ABContact
     * 
     */
    ABContact getABContact();

    /**
     * Sets the value of the ABContact field.
     * 
     */
    void setABContact(ABContact value);

    /**
     * Gets the value of the NumberOfEmployees field.
     * Number of employees in this building
     * 
     */
    Integer getNumberOfEmployees();

    /**
     * Sets the value of the NumberOfEmployees field.
     * 
     */
    void setNumberOfEmployees(Integer value);

    /**
     * Gets the value of the InspectionDate field.
     * Date of last inspection
     * 
     */
    Date getInspectionDate();

    /**
     * Sets the value of the InspectionDate field.
     * 
     */
    void setInspectionDate(Date value);

    /**
     * Gets the value of the HasParking field.
     * Is there a parking structure at this building?
     * 
     */
    Boolean isHasParking();

    /**
     * Sets the value of the HasParking field.
     * 
     */
    void setHasParking(Boolean value);

    /**
     * Gets the value of the BuildingType field.
     * Building type
     * 
     */
    BuildingType_Ext getBuildingType();

    /**
     * Sets the value of the BuildingType field.
     * 
     */
    void setBuildingType(BuildingType_Ext value);

}
