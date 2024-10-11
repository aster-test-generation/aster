/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BeanPointerFactory_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullBean_FjbR0() {
        BeanPointerFactory factory = new BeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        QName name = new QName("test");
        NodePointer pointer = factory.createNodePointer(parent, name, null);
        assertTrue(pointer instanceof NullPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonNullBean_nhUq1() {
        BeanPointerFactory factory = new BeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        QName name = new QName("test");
        Object bean = new Object();
        NodePointer pointer = factory.createNodePointer(parent, name, bean);
        assertTrue(pointer instanceof BeanPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonNullBeanAndNonNullParent_WCVt2() {
        BeanPointerFactory factory = new BeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        QName name = new QName("test");
        Object bean = new Object();
        NodePointer pointer = factory.createNodePointer(parent, name, bean);
        assertEquals(parent, pointer.getParent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonNullBeanAndNonNullName_qEZW3() {
        BeanPointerFactory factory = new BeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        QName name = new QName("test");
        Object bean = new Object();
        NodePointer pointer = factory.createNodePointer(parent, name, bean);
        assertEquals(name, pointer.getName());
    }
}