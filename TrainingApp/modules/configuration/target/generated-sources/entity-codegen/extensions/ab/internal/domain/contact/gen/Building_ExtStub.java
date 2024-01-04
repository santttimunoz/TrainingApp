
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy;
import extensions.ab.contact.typekey.BuildingType_Ext;
import gw.ab.addressbook.entity.ABContact;
import gw.pl.contact.entity.Address;
import gw.pl.persistence.core.Key;

public abstract class Building_ExtStub
    extends AbstractEditableRetireableBeanProxy
    implements Building_ExtInternalStubI
{


    @Override
    public Long getLoadCommandID() {
        return ((Long) getFieldValue(LOADCOMMANDID_PROP.get()));
    }

    @Override
    public void setLoadCommandID(Long value) {
        setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }

    @Override
    public Address getAddress() {
        return ((Address) getFieldValue(ADDRESS_PROP.get()));
    }

    @Override
    public void setAddress(Address value) {
        setFieldValue(ADDRESS_PROP.get(), value);
    }

    @Override
    public Key getAddressID() {
        return ((Key) getRawFieldValue(ADDRESS_PROP.get()));
    }

    @Override
    public void setAddressID(Key value) {
        setFieldValue(ADDRESS_PROP.get(), value);
    }

    @Override
    public ABContact getABContact() {
        return ((ABContact) getFieldValue(ABCONTACT_PROP.get()));
    }

    @Override
    public void setABContact(ABContact value) {
        setFieldValue(ABCONTACT_PROP.get(), value);
    }

    @Override
    public Key getABContactID() {
        return ((Key) getRawFieldValue(ABCONTACT_PROP.get()));
    }

    @Override
    public void setABContactID(Key value) {
        setFieldValue(ABCONTACT_PROP.get(), value);
    }

    @Override
    public Integer getNumberOfEmployees() {
        return ((Integer) getFieldValue(NUMBEROFEMPLOYEES_PROP.get()));
    }

    @Override
    public void setNumberOfEmployees(Integer value) {
        setFieldValue(NUMBEROFEMPLOYEES_PROP.get(), value);
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
    public Boolean isHasParking() {
        return ((Boolean) getFieldValue(HASPARKING_PROP.get()));
    }

    @Override
    public void setHasParking(Boolean value) {
        setFieldValue(HASPARKING_PROP.get(), value);
    }

    @Override
    public BuildingType_Ext getBuildingType() {
        return ((BuildingType_Ext) getFieldValue(BUILDINGTYPE_PROP.get()));
    }

    @Override
    public void setBuildingType(BuildingType_Ext value) {
        setFieldValue(BUILDINGTYPE_PROP.get(), value);
    }

}
