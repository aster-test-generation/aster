/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.beanutils.LazyDynaBean;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StrictLazyDynaBeanPointerFactory_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithLazyDynaBean_WXKU0_1() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        QName name = new QName("test");
        LazyDynaBean lazyDynaBean = new LazyDynaBean();
        NodePointer pointer = factory.createNodePointer(parent, name, lazyDynaBean);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithLazyDynaBean_WXKU0_2() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        QName name = new QName("test");
        LazyDynaBean lazyDynaBean = new LazyDynaBean();
        NodePointer pointer = factory.createNodePointer(parent, name, lazyDynaBean);
        assertEquals(parent, pointer.getParent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithLazyDynaBean_WXKU0_3() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        QName name = new QName("test");
        LazyDynaBean lazyDynaBean = new LazyDynaBean();
        NodePointer pointer = factory.createNodePointer(parent, name, lazyDynaBean);
        assertEquals(name, pointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithLazyDynaBean_WXKU0_4() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        QName name = new QName("test");
        LazyDynaBean lazyDynaBean = new LazyDynaBean();
        NodePointer pointer = factory.createNodePointer(parent, name, lazyDynaBean);
        assertEquals(lazyDynaBean, pointer.getNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonLazyDynaBean_bQhm1() {
        StrictLazyDynaBeanPointerFactory factory = new StrictLazyDynaBeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        QName name = new QName("test");
        Object object = new Object();
        NodePointer pointer = factory.createNodePointer(parent, name, object);
        assertNull(pointer);
    }
}