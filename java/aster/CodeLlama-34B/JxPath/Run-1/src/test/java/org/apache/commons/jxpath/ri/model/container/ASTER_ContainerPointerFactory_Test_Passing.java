/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
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

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ContainerPointerFactory_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithInvalidObject_iYIr3() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        QName name = new QName("test");
        Object bean = new Object();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, bean, locale);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_2_KJZn1() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        int order = factory.getOrder();
        assertNotEquals(0, order);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_3_AiUq2() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        int order = factory.getOrder();
        assertTrue(order > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_4_vzvp3() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        int order = factory.getOrder();
        assertFalse(order < 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithInvalidQName_klpG2_wWMB0() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        QName name = new QName("invalid");
        Object bean = null;
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, bean, locale);
        assertNull(pointer);
    }
}