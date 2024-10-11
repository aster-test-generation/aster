/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicPointerFactory_Test_Passing {
    DynamicPointerFactory dynamicpointerfactory;
    NodePointer parent;
    QName name;
    Object bean;
    JXPathBeanInfo bi;
    DynamicPropertyHandler handler;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateNodePointer() throws Exception {
        dynamicpointerfactory = new DynamicPointerFactory();
        parent = Mockito.mock(NodePointer.class);
        name = new QName("qualifiedName");
        bean = new Object();
        bi = Mockito.mock(JXPathBeanInfo.class);
        handler = Mockito.mock(DynamicPropertyHandler.class);
        Mockito.when(JXPathIntrospector.getBeanInfo(bean.getClass())).thenReturn(bi);
        Mockito.when(bi.isDynamic()).thenReturn(true);
        Mockito.when(ValueUtils.getDynamicPropertyHandler(bi.getDynamicPropertyHandlerClass())).thenReturn(handler);
        NodePointer result = dynamicpointerfactory.createNodePointer(parent, name, bean);
        assertNotNull(result);
        assertTrue(result instanceof DynamicPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_NonDynamicBean_hFzg1() {
        DynamicPointerFactory factory = new DynamicPointerFactory();
        QName name = new QName("prefix", "localName");
        Object bean = new Object();
        Locale locale = Locale.US;
        NodePointer pointer = factory.createNodePointer(name, bean, locale);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_YQVj800() {
        DynamicPointerFactory dynamicPointerFactory = new DynamicPointerFactory();
        int result = dynamicPointerFactory.getOrder();
        assertEquals(800, result);
    }
}