/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Container;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ContainerPointerFactory_Test_Passing {
    ContainerPointerFactory containerpointerfactory;
    NodePointer parent;
    QName name;
    Object bean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_NotContainer_UOhr1() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        QName name = new QName("prefix", "localName");
        Object bean = new Object();
        Locale locale = Locale.US;
        NodePointer pointer = factory.createNodePointer(name, bean, locale);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_lCdg200() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        int order = factory.getOrder();
        assertEquals(200, order);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateNodePointer_1() throws Exception {
        containerpointerfactory = new ContainerPointerFactory();
        parent = mock(NodePointer.class);
        name = new QName("test");
        bean = mock(Container.class);
        NodePointer result = containerpointerfactory.createNodePointer(parent, name, bean);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateNodePointer_2() throws Exception {
        containerpointerfactory = new ContainerPointerFactory();
        parent = mock(NodePointer.class);
        name = new QName("test");
        bean = mock(Container.class);
        NodePointer result = containerpointerfactory.createNodePointer(parent, name, bean);
        assertTrue(result instanceof ContainerPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateNodePointer_nullBean() throws Exception {
        containerpointerfactory = new ContainerPointerFactory();
        parent = mock(NodePointer.class);
        name = new QName("test");
        bean = mock(Container.class);
        bean = null;
        NodePointer result = containerpointerfactory.createNodePointer(parent, name, bean);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateNodePointer_notContainerBean() throws Exception {
        containerpointerfactory = new ContainerPointerFactory();
        parent = mock(NodePointer.class);
        name = new QName("test");
        bean = mock(Container.class);
        bean = new Object();
        NodePointer result = containerpointerfactory.createNodePointer(parent, name, bean);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateNodePointer() throws Exception {
        containerpointerfactory = new ContainerPointerFactory();
        parent = mock(NodePointer.class);
        name = new QName("test");
        bean = mock(Container.class);
        NodePointer result = containerpointerfactory.createNodePointer(parent, name, bean);
        assertNotNull(result);
        assertTrue(result instanceof ContainerPointer);
    }
}