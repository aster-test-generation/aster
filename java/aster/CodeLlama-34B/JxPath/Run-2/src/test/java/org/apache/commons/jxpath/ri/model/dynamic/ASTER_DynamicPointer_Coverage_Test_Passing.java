/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynamicPointer_Coverage_Test_Passing {
    private JXPathIntrospector mockJXPathIntrospector;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NotInstanceOfDynamicPointer_vktz0() {
        DynamicPointer dp = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), Locale.ENGLISH);
        Assertions.assertFalse(dp.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentBean_bCOJ1() {
        DynamicPointer dp1 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), Locale.ENGLISH);
        DynamicPointer dp2 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), Locale.ENGLISH);
        Assertions.assertFalse(dp1.equals(dp2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentName_EEpt2() {
        DynamicPointer dp1 = new DynamicPointer(new QName("name1"), new Object(), new PageContextHandler(), Locale.ENGLISH);
        DynamicPointer dp2 = new DynamicPointer(new QName("name2"), new Object(), new PageContextHandler(), Locale.ENGLISH);
        Assertions.assertFalse(dp1.equals(dp2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameBeanAndName_SvBR3() {
        Object bean = new Object();
        QName name = new QName("name");
        DynamicPointer dp1 = new DynamicPointer(name, bean, new PageContextHandler(), Locale.ENGLISH);
        DynamicPointer dp2 = new DynamicPointer(name, bean, new PageContextHandler(), Locale.ENGLISH);
        Assertions.assertTrue(dp1.equals(dp2));
    }
}