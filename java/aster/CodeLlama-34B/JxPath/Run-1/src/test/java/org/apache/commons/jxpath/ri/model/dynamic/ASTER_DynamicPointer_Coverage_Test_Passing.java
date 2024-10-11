/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynamicPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_beanNotEqual_OSrC0() {
        DynamicPointer dp1 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("en"));
        DynamicPointer dp2 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("en"));
        assertFalse(dp1.equals(dp2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_nameNotEqual_LdnA1() {
        DynamicPointer dp1 = new DynamicPointer(new QName("name1"), new Object(), new PageContextHandler(), new Locale("en"));
        DynamicPointer dp2 = new DynamicPointer(new QName("name2"), new Object(), new PageContextHandler(), new Locale("en"));
        assertFalse(dp1.equals(dp2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_FhjW0() {
        DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("en"));
        boolean result = dynamicPointer.isLeaf();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithNullValue_tsJA1() {
        DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), null, new PageContextHandler(), new Locale("en"));
        boolean result = dynamicPointer.isLeaf();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithNonAtomicValue_AGJX2_Stdd1() {
        DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale("en"));
        JXPathIntrospector.getBeanInfo(dynamicPointer.getClass()).isAtomic();
        boolean result = dynamicPointer.isLeaf();
        assertFalse(result);
    }
}