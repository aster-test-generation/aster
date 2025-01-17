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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ContainerPointerFactory_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_QName_Object_Locale_Null_IslT1() {
        QName name = null;
        Object bean = null;
        Locale locale = null;
        NodePointer pointer = new ContainerPointerFactory().createNodePointer(name, bean, locale);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_QName_Object_Locale_NotContainer_XoZN2() {
        QName name = new QName("name");
        Object bean = new Object();
        Locale locale = Locale.getDefault();
        NodePointer pointer = new ContainerPointerFactory().createNodePointer(name, bean, locale);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithNullPointerAndEmptyParameter_UnWs14() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithZeroParameter_Tqcn5_jBuk0() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        int order = factory.getOrder();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithMaximumParameter_HBsg8_dKmi1() {
        ContainerPointerFactory factory = new ContainerPointerFactory();
        int order = factory.getOrder();
        assertEquals(200, order);
    }
}