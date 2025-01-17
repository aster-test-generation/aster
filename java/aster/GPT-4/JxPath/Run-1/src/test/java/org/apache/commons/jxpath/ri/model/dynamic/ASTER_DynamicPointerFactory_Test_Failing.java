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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicPointerFactory_Test_Failing {
@InjectMocks
    private DynamicPointerFactory dynamicPointerFactory;
@Mock
    private NodePointer parent;
@Mock
    private QName name;
@Mock
    private JXPathBeanInfo beanInfo;
@Mock
    private DynamicPropertyHandler handler;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDynamicBean() throws Exception {
        dynamicPointerFactory = new DynamicPointerFactory();
        Object bean = new Object();
        when(JXPathIntrospector.getBeanInfo(bean.getClass())).thenReturn(beanInfo);
        when(beanInfo.isDynamic()).thenReturn(true);
        when(ValueUtils.getDynamicPropertyHandler(beanInfo.getDynamicPropertyHandlerClass())).thenReturn(handler);
        NodePointer result = dynamicPointerFactory.createNodePointer(parent, name, bean);
        assertTrue(result instanceof DynamicPointer, "Expected a DynamicPointer for dynamic bean");
        verify(beanInfo).isDynamic();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonDynamicBean() throws Exception {
        dynamicPointerFactory = new DynamicPointerFactory();
        Object bean = new Object();
        when(JXPathIntrospector.getBeanInfo(bean.getClass())).thenReturn(beanInfo);
        when(beanInfo.isDynamic()).thenReturn(false);
        NodePointer result = dynamicPointerFactory.createNodePointer(parent, name, bean);
        assertNull(result, "Expected null for non-dynamic bean");
        verify(beanInfo).isDynamic();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrder_Qtnq0_JKcC0() {
    DynamicPointerFactory factory = new DynamicPointerFactory();
    int expected = 0; // Assuming default order as 0 since DYNAMIC_POINTER_FACTORY_ORDER is not defined
    assertEquals(expected, factory.getOrder());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithDynamicBean_mdnc0_NxEr0() {
    DynamicPointerFactory factory = new DynamicPointerFactory();
    QName name = new QName("testName");
    Object dynamicBean = new Object() {
    };
    NodePointer parent = null; // Assuming parent can be null for this test case
    NodePointer result = factory.createNodePointer(parent, name, dynamicBean);
    assertNotNull(result, "Expected non-null NodePointer for dynamic bean");
}
}