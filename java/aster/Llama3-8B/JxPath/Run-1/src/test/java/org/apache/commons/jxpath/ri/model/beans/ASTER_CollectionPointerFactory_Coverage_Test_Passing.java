/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CollectionPointerFactory_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerCollection_QlVA0() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("testName");
        Object bean = new Integer[]{1, 2, 3};
        Locale locale = new Locale("en", "US");
        NodePointer result = factory.createNodePointer(name, bean, locale);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerNotCollection_gjzB1() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("testName");
        Object bean = new Integer(1);
        Locale locale = new Locale("en", "US");
        NodePointer result = factory.createNodePointer(name, bean, locale);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerNullBean_OPck2() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("testName");
        Locale locale = new Locale("en", "US");
        NodePointer result = factory.createNodePointer(name, null, locale);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerCollection_dQWk0_YMrc0() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("test");
        Object bean = new ArrayList<>();
        NodePointer parent = null;
        NodePointer result = factory.createNodePointer(parent, name, bean);
        assertNotNull(result);
    }
}