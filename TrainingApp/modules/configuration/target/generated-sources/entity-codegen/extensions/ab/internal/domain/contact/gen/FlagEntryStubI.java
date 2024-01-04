
package extensions.ab.internal.domain.contact.gen;

import java.util.Date;
import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.LinkPropertyInfoCache;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.contact.entity.FlagEntry;
import extensions.ab.contact.typekey.FlagEntryReason;
import gw.ab.addressbook.entity.ABContact;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ILinkPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.community.entity.User;
import gw.pl.persistence.core.entity.Retireable;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface FlagEntryStubI
    extends Retireable
{

    EntityTypeReference<FlagEntry> TYPE = new EntityIntrinsicTypeReference<FlagEntry>("entity.FlagEntry");
    EntityPropertyInfoReference<IColumnPropertyInfo> LOADCOMMANDID_PROP = new ColumnPropertyInfoCache(TYPE, "LoadCommandID");
    EntityPropertyInfoReference<IColumnPropertyInfo> FLAGDATE_PROP = new ColumnPropertyInfoCache(TYPE, "FlagDate");
    EntityPropertyInfoReference<IColumnPropertyInfo> UNFLAGDATE_PROP = new ColumnPropertyInfoCache(TYPE, "UnflagDate");
    EntityPropertyInfoReference<IColumnPropertyInfo> RESOLUTION_PROP = new ColumnPropertyInfoCache(TYPE, "Resolution");
    EntityPropertyInfoReference<IColumnPropertyInfo> ISOPEN_PROP = new ColumnPropertyInfoCache(TYPE, "IsOpen");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> REASON_PROP = new TypekeyPropertyInfoCache(TYPE, "Reason");
    EntityPropertyInfoReference<ILinkPropertyInfo> ABCONTACT_PROP = new LinkPropertyInfoCache(TYPE, "ABContact");
    EntityPropertyInfoReference<ILinkPropertyInfo> UNFLAGUSER_PROP = new LinkPropertyInfoCache(TYPE, "UnflagUser");
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
     * Gets the value of the FlagDate field.
     * Date contact was flagged
     * 
     */
    Date getFlagDate();

    /**
     * Sets the value of the FlagDate field.
     * 
     */
    void setFlagDate(Date value);

    /**
     * Gets the value of the UnflagDate field.
     * Date contact was unflagged
     * 
     */
    Date getUnflagDate();

    /**
     * Sets the value of the UnflagDate field.
     * 
     */
    void setUnflagDate(Date value);

    /**
     * Gets the value of the Resolution field.
     * Note regarding resolution
     * 
     */
    String getResolution();

    /**
     * Sets the value of the Resolution field.
     * 
     */
    void setResolution(String value);

    /**
     * Gets the value of the IsOpen field.
     * Is the entry open?
     * 
     */
    Boolean isIsOpen();

    /**
     * Sets the value of the IsOpen field.
     * 
     */
    void setIsOpen(Boolean value);

    /**
     * Gets the value of the Reason field.
     * Reason contact was flagged
     * 
     */
    FlagEntryReason getReason();

    /**
     * Sets the value of the Reason field.
     * 
     */
    void setReason(FlagEntryReason value);

    /**
     * Gets the value of the ABContact field.
     * Contact that was flagged
     * 
     */
    ABContact getABContact();

    /**
     * Sets the value of the ABContact field.
     * 
     */
    void setABContact(ABContact value);

    /**
     * Gets the value of the UnflagUser field.
     * User who unflags contact
     * 
     */
    User getUnflagUser();

    /**
     * Sets the value of the UnflagUser field.
     * 
     */
    void setUnflagUser(User value);

}
