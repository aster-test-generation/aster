/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DOMPointerFactory_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullBean_ffuO1() {
        DOMPointerFactory factory = new DOMPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        QName name = new QName("test");
        NodePointer pointer = factory.createNodePointer(parent, name, null);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonNodeBean_Gqjc2() {
        DOMPointerFactory factory = new DOMPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        QName name = new QName("test");
        Object bean = new Object();
        NodePointer pointer = factory.createNodePointer(parent, name, bean);
        assertNull(pointer);
    }
}