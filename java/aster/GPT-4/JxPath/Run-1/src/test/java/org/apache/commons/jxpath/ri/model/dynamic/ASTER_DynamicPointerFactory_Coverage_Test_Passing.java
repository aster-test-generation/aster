/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import static org.junit.jupiter.api.Assertions.*;
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
    public void testGetOrder_YVpk0() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        int expected = DynamicPointerFactory.DYNAMIC_POINTER_FACTORY_ORDER;
        assertEquals(expected, factory.getOrder());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullBean_dnmU0_1() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        NodePointer parent = mock(NodePointer.class);
        QName name = new QName("test");
        NodePointer result = factory.createNodePointer(parent, name, null);
        assertTrue(result instanceof NullPointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullBean_dnmU0_2() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        NodePointer parent = mock(NodePointer.class);
        QName name = new QName("test");
        NodePointer result = factory.createNodePointer(parent, name, null);
        assertEquals(name, result.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDynamicBeanButHandlerIsNull_BrFg3() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        NodePointer parent = mock(NodePointer.class);
        QName name = new QName("test");
        Object bean = mock(Object.class); // Mocking to simulate a dynamic bean
        JXPathBeanInfo bi = mock(JXPathBeanInfo.class);
        when(JXPathIntrospector.getBeanInfo(bean.getClass())).thenReturn(bi);
        when(bi.isDynamic()).thenReturn(true);
        when(bi.getDynamicPropertyHandlerClass()).thenReturn(null);
        NodePointer result = factory.createNodePointer(parent, name, bean);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithNonDynamicBean_aKns1_cTbE0() {
    QName name = new QName("testName");
    Object bean = mock(Object.class);
    NodePointer parent = mock(NodePointer.class);
    JXPathBeanInfo bi = mock(JXPathBeanInfo.class);
    when(bi.isDynamic()).thenReturn(false);
    when(JXPathIntrospector.getBeanInfo(bean.getClass())).thenReturn(bi);
    DynamicPointerFactory factory = new DynamicPointerFactory();
    NodePointer result = factory.createNodePointer(parent, name, bean);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithBeanInfoNotSet_bzXM6_fOQd0() {
    QName name = new QName("testName");
    Object bean = mock(Object.class);
    NodePointer parent = null; // Assuming parent can be null for this test
    DynamicPointerFactory factory = new DynamicPointerFactory();
    NodePointer result = factory.createNodePointer(parent, name, bean);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullBean_dnmU0() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        NodePointer parent = mock(NodePointer.class);
        QName name = new QName("test");
        NodePointer result = factory.createNodePointer(parent, name, null);
        assertTrue(result instanceof NullPointer);
        assertEquals(name, result.getName());
    }
}