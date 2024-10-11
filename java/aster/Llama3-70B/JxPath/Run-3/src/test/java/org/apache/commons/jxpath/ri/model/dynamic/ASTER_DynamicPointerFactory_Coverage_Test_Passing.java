/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;
import java.util.Locale;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.util.ValueUtils;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynamicPointerFactory_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_Dynamic_bkJM0() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        QName name = new QName("prefix", "localName");
        Object bean = new Object();
        Locale locale = Locale.US;
        JXPathBeanInfo bi = mock(JXPathBeanInfo.class);
        when(JXPathIntrospector.getBeanInfo(bean.getClass())).thenReturn(bi);
        when(bi.isDynamic()).thenReturn(true);
        DynamicPropertyHandler handler = mock(DynamicPropertyHandler.class);
        when(ValueUtils.getDynamicPropertyHandler(bi.getDynamicPropertyHandlerClass())).thenReturn(handler);
        NodePointer pointer = factory.createNodePointer(name, bean, locale);
        assertNotNull(pointer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_NullBean_lxVF0() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        NodePointer parent = mock(NodePointer.class);
        QName name = new QName("test");
        NodePointer result = factory.createNodePointer(parent, name, null);
        assertTrue(result instanceof NullPointer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_DynamicBean_NullHandler_DTGI3() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        NodePointer parent = mock(NodePointer.class);
        QName name = new QName("test");
        Object bean = new Object();
        JXPathBeanInfo bi = mock(JXPathBeanInfo.class);
        when(JXPathIntrospector.getBeanInfo(bean.getClass())).thenReturn(bi);
        when(bi.isDynamic()).thenReturn(true);
        when(ValueUtils.getDynamicPropertyHandler(bi.getDynamicPropertyHandlerClass())).thenReturn(null);
        NodePointer result = factory.createNodePointer(parent, name, bean);
        assertNull(result);
    }
}