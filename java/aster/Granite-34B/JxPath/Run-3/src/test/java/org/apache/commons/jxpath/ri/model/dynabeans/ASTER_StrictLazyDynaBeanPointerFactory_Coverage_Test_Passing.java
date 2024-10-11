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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StrictLazyDynaBeanPointerFactory_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerLazyDynaBean_ScKi0() {
        StrictLazyDynaBeanPointerFactory strictLazyDynaBeanPointerFactory = new StrictLazyDynaBeanPointerFactory();
        LazyDynaBean lazyDynaBean = new LazyDynaBean();
        Locale locale = Locale.getDefault();
        NodePointer nodePointer = strictLazyDynaBeanPointerFactory.createNodePointer(new QName("test"), lazyDynaBean, locale);
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerNotLazyDynaBean_kkRT1() {
        StrictLazyDynaBeanPointerFactory strictLazyDynaBeanPointerFactory = new StrictLazyDynaBeanPointerFactory();
        Object object = new Object();
        Locale locale = Locale.getDefault();
        NodePointer nodePointer = strictLazyDynaBeanPointerFactory.createNodePointer(new QName("test"), object, locale);
        assertNull(nodePointer);
    }
}