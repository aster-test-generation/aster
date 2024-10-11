/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.beanutils.LazyDynaBean;
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
public class Aster_StrictLazyDynaBeanPointerFactory_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithLazyDynaBean_RqTp0_1() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("test");
        LazyDynaBean object = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, object, locale);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithLazyDynaBean_RqTp0_2() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("test");
        LazyDynaBean object = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, object, locale);
        assertEquals(name, pointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithLazyDynaBean_RqTp0_3() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("test");
        LazyDynaBean object = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, object, locale);
        assertEquals(object, pointer.getNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithLazyDynaBean_RqTp0_4() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("test");
        LazyDynaBean object = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, object, locale);
        assertEquals(locale, pointer.getLocale());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonLazyDynaBean_KnIz1() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("test");
        Object object = new Object();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, object, locale);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonNullPrefixAndNonNullLocalName_bZCs2_1() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("test", "test");
        LazyDynaBean object = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, object, locale);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonNullPrefixAndNonNullLocalName_bZCs2_2() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("test", "test");
        LazyDynaBean object = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, object, locale);
        assertEquals(name, pointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonNullPrefixAndNonNullLocalName_bZCs2_3() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("test", "test");
        LazyDynaBean object = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, object, locale);
        assertEquals(object, pointer.getNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonNullPrefixAndNonNullLocalName_bZCs2_4() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("test", "test");
        LazyDynaBean object = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, object, locale);
        assertEquals(locale, pointer.getLocale());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_PIUk0() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        int order = factory.getOrder();
        assertEquals(DynaBeanPointerFactory.DYNA_BEAN_POINTER_FACTORY_ORDER - 1, order);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullParent_WcEz2() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("name");
        LazyDynaBean object = new LazyDynaBean();
        NodePointer pointer = factory.createNodePointer(null, name, object);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithLazyDynaBean_RqTp0() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("test");
        LazyDynaBean object = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, object, locale);
        assertNotNull(pointer);
        assertEquals(name, pointer.getName());
        assertEquals(object, pointer.getNode());
        assertEquals(locale, pointer.getLocale());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonNullPrefixAndNonNullLocalName_bZCs2() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        QName name = new QName("test", "test");
        LazyDynaBean object = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(name, object, locale);
        assertNotNull(pointer);
        assertEquals(name, pointer.getName());
        assertEquals(object, pointer.getNode());
        assertEquals(locale, pointer.getLocale());
    }
}