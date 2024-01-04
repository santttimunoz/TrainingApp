
package extensions.ab.internal.domain.contact.gen;

import com.guidewire.commons.metadata.types.ColumnPropertyInfoCache;
import com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference;
import com.guidewire.commons.metadata.types.LinkPropertyInfoCache;
import extensions.ab.contact.entity.MessageGenerator;
import gw.entity.IColumnPropertyInfo;
import gw.entity.ILinkPropertyInfo;
import gw.pl.messaging.entity.EventAware;
import gw.pl.persistence.core.entity.Retireable;
import gw.pl.persistence.type.EntityPropertyInfoReference;
import gw.pl.persistence.type.EntityTypeReference;

public interface MessageGeneratorStubI
    extends EventAware, Retireable
{

    EntityTypeReference<MessageGenerator> TYPE = new EntityIntrinsicTypeReference<MessageGenerator>("entity.MessageGenerator");
    EntityPropertyInfoReference<IColumnPropertyInfo> LOADCOMMANDID_PROP = new ColumnPropertyInfoCache(TYPE, "LoadCommandID");
    EntityPropertyInfoReference<IColumnPropertyInfo> NAME_PROP = new ColumnPropertyInfoCache(TYPE, "Name");
    EntityPropertyInfoReference<IColumnPropertyInfo> THROWEXCEPTIONINREQUEST_PROP = new ColumnPropertyInfoCache(TYPE, "ThrowExceptionInRequest");
    EntityPropertyInfoReference<IColumnPropertyInfo> THROWEXCEPTIONINTRANSPORT_PROP = new ColumnPropertyInfoCache(TYPE, "ThrowExceptionInTransport");
    EntityPropertyInfoReference<IColumnPropertyInfo> THROWEXCEPTIONINREPLY_PROP = new ColumnPropertyInfoCache(TYPE, "ThrowExceptionInReply");
    EntityPropertyInfoReference<IColumnPropertyInfo> AUTOACKMESSAGE_PROP = new ColumnPropertyInfoCache(TYPE, "AutoAckMessage");
    EntityPropertyInfoReference<IColumnPropertyInfo> RETIREDVALUE_PROP = new ColumnPropertyInfoCache(TYPE, "RetiredValue");
    EntityPropertyInfoReference<IColumnPropertyInfo> CREATETIME_PROP = new ColumnPropertyInfoCache(TYPE, "CreateTime");
    EntityPropertyInfoReference<IColumnPropertyInfo> UPDATETIME_PROP = new ColumnPropertyInfoCache(TYPE, "UpdateTime");
    EntityPropertyInfoReference<ILinkPropertyInfo> CREATEUSER_PROP = new LinkPropertyInfoCache(TYPE, "CreateUser");
    EntityPropertyInfoReference<ILinkPropertyInfo> UPDATEUSER_PROP = new LinkPropertyInfoCache(TYPE, "UpdateUser");
    EntityPropertyInfoReference<IColumnPropertyInfo> BEANVERSION_PROP = new ColumnPropertyInfoCache(TYPE, "BeanVersion");
    EntityPropertyInfoReference<IColumnPropertyInfo> ID_PROP = new ColumnPropertyInfoCache(TYPE, "ID");
    EntityPropertyInfoReference<IColumnPropertyInfo> PUBLICID_PROP = new ColumnPropertyInfoCache(TYPE, "PublicID");
    String MESSAGEGENERATORADDED_EVENT = "MessageGeneratorAdded";
    String MESSAGEGENERATORCHANGED_EVENT = "MessageGeneratorChanged";
    String MESSAGEGENERATORREMOVED_EVENT = "MessageGeneratorRemoved";

    /**
     * Gets the value of the LoadCommandID field.
     * 
     * 
     */
    Long getLoadCommandID();

    /**
     * Gets the value of the Name field.
     * Name of instance that is triggering a message
     * 
     */
    String getName();

    /**
     * Sets the value of the Name field.
     * 
     */
    void setName(String value);

    /**
     * Gets the value of the ThrowExceptionInRequest field.
     * Should an exception be thrown during the Request plugin's beforeSend() method?
     * 
     */
    Boolean isThrowExceptionInRequest();

    /**
     * Sets the value of the ThrowExceptionInRequest field.
     * 
     */
    void setThrowExceptionInRequest(Boolean value);

    /**
     * Gets the value of the ThrowExceptionInTransport field.
     * Should an exception be thrown during the Transport plugin's send() method?
     * 
     */
    Boolean isThrowExceptionInTransport();

    /**
     * Sets the value of the ThrowExceptionInTransport field.
     * 
     */
    void setThrowExceptionInTransport(Boolean value);

    /**
     * Gets the value of the ThrowExceptionInReply field.
     * Should an exception be thrown when processing the message reply?
     * 
     */
    Boolean isThrowExceptionInReply();

    /**
     * Sets the value of the ThrowExceptionInReply field.
     * 
     */
    void setThrowExceptionInReply(Boolean value);

    /**
     * Gets the value of the AutoAckMessage field.
     * Should the message generated from this instance be synchronously acknowledged?
     * 
     */
    Boolean isAutoAckMessage();

    /**
     * Sets the value of the AutoAckMessage field.
     * 
     */
    void setAutoAckMessage(Boolean value);

}
