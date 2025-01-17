/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynaBeanPointerFactory_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithoutDynaBean_scmq1() {
        DynaBeanPointerFactory factory = new DynaBeanPointerFactory();
        QName name = new QName("testName");
        Object bean = new Object();
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, bean, locale);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void set(String name, Object value) {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_NotDynaBean_HSxF1_namJ0() {
        DynaBeanPointerFactory factory = new DynaBeanPointerFactory();
        NodePointer parent = new DOMNodePointer(null, Locale.US, "id");
        QName name = new QName("name");
        Object bean = new Object();
        NodePointer result = factory.createNodePointer(parent, name, bean);
        assertNull(result);
    }
}