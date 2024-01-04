
package extensions.ab.internal.domain.contact.gen;

import java.util.List;
import com.guidewire.pl.domain.messaging.impl.EventAwareInternal;
import com.guidewire.pl.system.entity.BeanEvent;
import com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy;
import gw.pl.messaging.entity.EventAware;

public abstract class MessageGeneratorStub
    extends AbstractEditableRetireableBeanProxy
    implements MessageGeneratorInternalStubI
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
    public String getName() {
        return ((String) getFieldValueForCodegen(NAME_PROP.get()));
    }

    @Override
    public void setName(String value) {
        setFieldValueForCodegen(NAME_PROP.get(), value);
    }

    @Override
    public Boolean isThrowExceptionInRequest() {
        return ((Boolean) getFieldValue(THROWEXCEPTIONINREQUEST_PROP.get()));
    }

    @Override
    public void setThrowExceptionInRequest(Boolean value) {
        setFieldValue(THROWEXCEPTIONINREQUEST_PROP.get(), value);
    }

    @Override
    public Boolean isThrowExceptionInTransport() {
        return ((Boolean) getFieldValue(THROWEXCEPTIONINTRANSPORT_PROP.get()));
    }

    @Override
    public void setThrowExceptionInTransport(Boolean value) {
        setFieldValue(THROWEXCEPTIONINTRANSPORT_PROP.get(), value);
    }

    @Override
    public Boolean isThrowExceptionInReply() {
        return ((Boolean) getFieldValue(THROWEXCEPTIONINREPLY_PROP.get()));
    }

    @Override
    public void setThrowExceptionInReply(Boolean value) {
        setFieldValue(THROWEXCEPTIONINREPLY_PROP.get(), value);
    }

    @Override
    public Boolean isAutoAckMessage() {
        return ((Boolean) getFieldValue(AUTOACKMESSAGE_PROP.get()));
    }

    @Override
    public void setAutoAckMessage(Boolean value) {
        setFieldValue(AUTOACKMESSAGE_PROP.get(), value);
    }

    @Override
    public void addEvent(String p0) {
        getEntityDelegate(EventAware.class).addEvent(p0);
    }

    @Override
    public void addEvent(BeanEvent p0) {
        ((EventAwareInternal) getEntityDelegate(EventAware.class)).addEvent(p0);
    }

    @Override
    public BeanEvent[] getEvents() {
        return ((EventAwareInternal) getEntityDelegate(EventAware.class)).getEvents();
    }

    @Override
    public List generateInsertEvents() {
        return ((EventAwareInternal) getEntityDelegate(EventAware.class)).generateInsertEvents();
    }

    @Override
    public List generateUpdateEvents() {
        return ((EventAwareInternal) getEntityDelegate(EventAware.class)).generateUpdateEvents();
    }

    @Override
    public List generateRemoveEvents() {
        return ((EventAwareInternal) getEntityDelegate(EventAware.class)).generateRemoveEvents();
    }

}
