/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynamicPointerFactory_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_BeanIsDynamic_ThrowsExceptionOnHandlerRetrieval_zckr4() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        NodePointer parent = mock(NodePointer.class);
        QName name = new QName("test");
        Object bean = new Object();
        JXPathBeanInfo bi = mock(JXPathBeanInfo.class);
        when(JXPathIntrospector.getBeanInfo(bean.getClass())).thenReturn(bi);
        when(bi.isDynamic()).thenReturn(true);
        when(ValueUtils.getDynamicPropertyHandler(bi.getDynamicPropertyHandlerClass()))
            .thenThrow(new RuntimeException("Handler retrieval failed"));
        NodePointer result = factory.createNodePointer(parent, name, bean);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_BeanIsDynamic_HandlerIsNotNull_GyWw6_1() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        NodePointer parent = mock(NodePointer.class);
        QName name = new QName("test");
        Object bean = new Object();
        JXPathBeanInfo bi = mock(JXPathBeanInfo.class);
        when(JXPathIntrospector.getBeanInfo(bean.getClass())).thenReturn(bi);
        when(bi.isDynamic()).thenReturn(true);
        DynamicPropertyHandler handler = mock(DynamicPropertyHandler.class);
        when(ValueUtils.getDynamicPropertyHandler(bi.getDynamicPropertyHandlerClass())).thenReturn(handler);
        NodePointer result = factory.createNodePointer(parent, name, bean);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_BeanIsDynamic_HandlerIsNotNull_GyWw6_2() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        NodePointer parent = mock(NodePointer.class);
        QName name = new QName("test");
        Object bean = new Object();
        JXPathBeanInfo bi = mock(JXPathBeanInfo.class);
        when(JXPathIntrospector.getBeanInfo(bean.getClass())).thenReturn(bi);
        when(bi.isDynamic()).thenReturn(true);
        DynamicPropertyHandler handler = mock(DynamicPropertyHandler.class);
        when(ValueUtils.getDynamicPropertyHandler(bi.getDynamicPropertyHandlerClass())).thenReturn(handler);
        NodePointer result = factory.createNodePointer(parent, name, bean);
        assertTrue(result instanceof DynamicPointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_BeanIsDynamic_HandlerIsNotNull_GyWw6() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        NodePointer parent = mock(NodePointer.class);
        QName name = new QName("test");
        Object bean = new Object();
        JXPathBeanInfo bi = mock(JXPathBeanInfo.class);
        when(JXPathIntrospector.getBeanInfo(bean.getClass())).thenReturn(bi);
        when(bi.isDynamic()).thenReturn(true);
        DynamicPropertyHandler handler = mock(DynamicPropertyHandler.class);
        when(ValueUtils.getDynamicPropertyHandler(bi.getDynamicPropertyHandlerClass())).thenReturn(handler);
        NodePointer result = factory.createNodePointer(parent, name, bean);
        assertNotNull(result);
        assertTrue(result instanceof DynamicPointer);
    }
}