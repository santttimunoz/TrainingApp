
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.LinkPropertyInfoCache;
import com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache;
import extensions.ab.contact.entity.ContactNote;
import extensions.ab.contact.typekey.ContactNoteType;
import gw.ab.addressbook.entity.ABContact;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ILinkPropertyInfo;
import gw.entity.ITypekeyPropertyInfo;
import gw.pl.persistence.core.entity.Retireable;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface ContactNoteStubI
    extends Retireable
{

    EntityTypeReference<ContactNote> TYPE = new EntityIntrinsicTypeReference<ContactNote>("entity.ContactNote");
    EntityPropertyInfoReference<IColumnPropertyInfo> LOADCOMMANDID_PROP = new ColumnPropertyInfoCache(TYPE, "LoadCommandID");
    EntityPropertyInfoReference<IColumnPropertyInfo> SUBJECT_PROP = new ColumnPropertyInfoCache(TYPE, "Subject");
    EntityPropertyInfoReference<IColumnPropertyInfo> BODY_PROP = new ColumnPropertyInfoCache(TYPE, "Body");
    EntityPropertyInfoReference<IColumnPropertyInfo> ISCONFIDENTIAL_PROP = new ColumnPropertyInfoCache(TYPE, "IsConfidential");
    EntityPropertyInfoReference<ITypekeyPropertyInfo> CONTACTNOTETYPE_PROP = new TypekeyPropertyInfoCache(TYPE, "ContactNoteType");
    EntityPropertyInfoReference<ILinkPropertyInfo> ABCONTACT_PROP = new LinkPropertyInfoCache(TYPE, "ABContact");
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
     * Gets the value of the Subject field.
     * Subject
     * 
     */
    String getSubject();

    /**
     * Sets the value of the Subject field.
     * 
     */
    void setSubject(String value);

    /**
     * Gets the value of the Body field.
     * Body
     * 
     */
    String getBody();

    /**
     * Sets the value of the Body field.
     * 
     */
    void setBody(String value);

    /**
     * Gets the value of the IsConfidential field.
     * IsConfidential
     * 
     */
    Boolean isIsConfidential();

    /**
     * Sets the value of the IsConfidential field.
     * 
     */
    void setIsConfidential(Boolean value);

    /**
     * Gets the value of the ContactNoteType field.
     * Contact note type
     * 
     */
    ContactNoteType getContactNoteType();

    /**
     * Sets the value of the ContactNoteType field.
     * 
     */
    void setContactNoteType(ContactNoteType value);

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

}
