package examples.pl.plugins.management;

import com.google.common.collect.ImmutableMap;
import gw.pl.logging.LoggerCategory;
import gw.plugin.management.AttributeInfo;
import gw.plugin.management.GWMBean;
import gw.plugin.management.GWMBeanInfo;
import gw.plugin.management.NotificationInfo;
import gw.plugin.management.OperationInfo;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.AttributeNotFoundException;
import javax.management.DynamicMBean;
import javax.management.InvalidAttributeValueException;
import javax.management.ListenerNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanOperationInfo;
import javax.management.Notification;
import javax.management.NotificationBroadcaster;
import javax.management.NotificationBroadcasterSupport;
import javax.management.NotificationFilter;
import javax.management.NotificationListener;
import javax.management.ReflectionException;
import javax.management.openmbean.ArrayType;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.OpenMBeanAttributeInfo;
import javax.management.openmbean.OpenMBeanAttributeInfoSupport;
import javax.management.openmbean.OpenMBeanConstructorInfo;
import javax.management.openmbean.OpenMBeanInfoSupport;
import javax.management.openmbean.OpenMBeanOperationInfo;
import javax.management.openmbean.OpenMBeanOperationInfoSupport;
import javax.management.openmbean.OpenMBeanParameterInfo;
import javax.management.openmbean.OpenType;
import javax.management.openmbean.SimpleType;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GWMBeanWrapper implements DynamicMBean, NotificationBroadcaster {
  private GWMBean _wrappedBean;
  private NotificationBroadcasterSupport _broadcasterSupport;

  public GWMBeanWrapper(GWMBean wrappedBean) {
    _wrappedBean = wrappedBean;
    _broadcasterSupport = new NotificationBroadcasterSupport();
  }

  @Override
  public MBeanInfo getMBeanInfo() {
    GWMBeanInfo info = _wrappedBean.getMBeanInfo();
    List<String> errors = new ArrayList<>();

    List<OpenMBeanAttributeInfo> attributes = new ArrayList<>();
    for (int i = 0; i < info.getAttributes().size(); i++) {
      AttributeInfo attributeInfo = info.getAttributes().get(i);
      try {
        attributes.add(new OpenMBeanAttributeInfoSupport(attributeInfo.getName(), attributeInfo.getDesc(),
                getOpenType(attributeInfo.getType()), attributeInfo.isReadable(), attributeInfo.isWritable(), false));
      } catch (Exception e) {
        errors.add("On attribute[" + i + "] '" + attributeInfo.getName() + "': " + e.getMessage());
      }
    }

    List<MBeanNotificationInfo> notifications = new ArrayList<>();
    for (int i = 0; i < info.getNotifications().size(); i++) {
      NotificationInfo notificationInfo = info.getNotifications().get(i);
      try {
        notifications.add(new MBeanNotificationInfo(notificationInfo.getNotificationTypes(), notificationInfo.getName(), notificationInfo.getDescription()));
      } catch (Exception e) {
        errors.add("On notification[" + i + "] '" + notificationInfo.getName() + "': " + e.getMessage());
      }
    }

    List<OpenMBeanOperationInfo> operations = new ArrayList<>();
    for (int i = 0; i < info.getOperations().size(); i++) {
      OperationInfo operationInfo = info.getOperations().get(i);
      try {
        OpenMBeanParameterInfo[] signature = new OpenMBeanParameterInfo[0];
        OpenType type = getOpenType(operationInfo.getReturnType());
        int impact = (operationInfo.isAction() && operationInfo.isInfo()) ? MBeanOperationInfo.ACTION_INFO
                : operationInfo.isAction() ? MBeanOperationInfo.ACTION
                : operationInfo.isInfo() ? MBeanOperationInfo.INFO
                : MBeanOperationInfo.UNKNOWN;
        operations.add(new OpenMBeanOperationInfoSupport(operationInfo.getName(), operationInfo.getDesc(), signature, type, impact));
      } catch (Exception e) {
        errors.add("On operation[" + i + "] '" + operationInfo.getName() + "': " + e.getMessage());
      }
    }

    if (!errors.isEmpty()) {
      LoggerCategory.PLUGIN.error("On bean " + _wrappedBean.getBeanName() + ": " + errors); // the throw is swallowed
      throw new RuntimeException("On bean " + _wrappedBean.getBeanName() + ": " + errors);
    }
    return new OpenMBeanInfoSupport(info.getName(), info.getDescription(),
            attributes.toArray(new OpenMBeanAttributeInfo[attributes.size()]),
            new OpenMBeanConstructorInfo[0],
            operations.toArray(new OpenMBeanOperationInfo[operations.size()]),
            notifications.toArray(new MBeanNotificationInfo[notifications.size()]));
  }

  @Override
  public Object getAttribute(String s) throws AttributeNotFoundException, MBeanException, ReflectionException {
    try {
      return _wrappedBean.getAttribute(s);
    } catch (gw.plugin.management.AttributeNotFoundException e) {
      throw new AttributeNotFoundException(e.getMessage());
    }
  }

  @Override
  public void setAttribute(Attribute attribute) throws AttributeNotFoundException, InvalidAttributeValueException, MBeanException, ReflectionException {
    try {
      _wrappedBean.setAttribute(new gw.plugin.management.Attribute(attribute.getName(), attribute.getValue()));
    } catch (gw.plugin.management.AttributeNotFoundException e) {
      throw new AttributeNotFoundException(e.getMessage());
    } catch (gw.plugin.management.InvalidAttributeValueException e) {
      throw new InvalidAttributeValueException(e.getMessage());
    }
  }

  @Override
  public AttributeList getAttributes(String[] attributes) {
    AttributeList list = new AttributeList();
    for (String attribute : attributes) {
      try {
        list.add(new Attribute(attribute, getAttribute(attribute)));
      } catch (Exception e) {
        LoggerCategory.PLUGIN.debug(
                "Could not get attribute {} on bean {}", new Object[] { attribute, _wrappedBean.getBeanName(), e });
      }
    }

    return list;
  }

  @Override
  public AttributeList setAttributes(AttributeList attributes) {
    AttributeList list = new AttributeList();
    for (Object obj : attributes) {
      Attribute attribute = (Attribute) obj;
      try {
        setAttribute(attribute);
        list.add(new Attribute(attribute.getName(), getAttribute(attribute.getName())));
      } catch (Exception e) {
        LoggerCategory.PLUGIN.debug(
                "Could not set attribute {} to value {} on bean {}",
                new Object[] { attribute.getName(), attribute.getValue(), _wrappedBean.getBeanName(), e });
      }
    }

    return list;
  }

  @Override
  public MBeanNotificationInfo[] getNotificationInfo() {
    return getMBeanInfo().getNotifications();
  }

  @Override
  public void addNotificationListener(NotificationListener notificationListener, NotificationFilter notificationFilter, Object o) throws IllegalArgumentException {
    _broadcasterSupport.addNotificationListener(notificationListener, notificationFilter, o);
  }

  @Override
  public void removeNotificationListener(NotificationListener notificationListener) throws ListenerNotFoundException {
    _broadcasterSupport.removeNotificationListener(notificationListener);
  }

  public void sendNotification(Notification notification) {
    _broadcasterSupport.sendNotification(notification);
  }

  @Override
  public Object invoke(String methodName, Object[] paramObjs, String[] paramNames) throws MBeanException, ReflectionException {
    try {
      final Method method = _wrappedBean.getClass().getMethod(methodName);
      return method.invoke(_wrappedBean, paramObjs);
    } catch (Exception e) {
      LoggerCategory.PLUGIN.error("On bean " + _wrappedBean.getBeanName() + ": ", e); // the throw is passed to client
      throw new MBeanException(e);
    }
  }

  // See JMX spec, section 3.2 "Basic Data Types"
  private static final ImmutableMap<Class, SimpleType> CLASS_TO_OPEN_TYPE_MAP = new ImmutableMap.Builder<Class, SimpleType>()
          .put(Integer.class, SimpleType.INTEGER)
          .put(String.class, SimpleType.STRING)
          .put(Double.class, SimpleType.DOUBLE)
          .put(Date.class, SimpleType.DATE)
          .put(Boolean.class, SimpleType.BOOLEAN)
          .put(Long.class, SimpleType.LONG)
          .put(Short.class, SimpleType.SHORT)
          .put(Character.class, SimpleType.CHARACTER)
          .put(BigDecimal.class, SimpleType.BIGDECIMAL)
          .put(BigInteger.class, SimpleType.BIGINTEGER)
          .put(int.class, SimpleType.INTEGER)
          .put(long.class, SimpleType.LONG)
          .put(boolean.class, SimpleType.BOOLEAN)
          .put(double.class, SimpleType.DOUBLE)
          .put(float.class, SimpleType.FLOAT)
          .put(byte.class, SimpleType.BYTE)
          .put(short.class, SimpleType.LONG)
          .put(char.class, SimpleType.SHORT)
          .put(void.class, SimpleType.VOID)
          .build();

  @SuppressWarnings("unchecked")
  private OpenType getOpenType(Class type) {
    if (type.isArray()) {
      try {
        return new ArrayType(1, getOpenType(type.getComponentType()));
      } catch (OpenDataException e) {
        throw new IllegalArgumentException(e);
      }
    } else if (CLASS_TO_OPEN_TYPE_MAP.containsKey(type)) {
      return CLASS_TO_OPEN_TYPE_MAP.get(type);
    } else {
      throw new IllegalArgumentException("Class " + type + " hasn't been mapped to an appropriate open type");
    }
  }
}
