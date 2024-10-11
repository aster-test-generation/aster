/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynamicPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashcode1_bghm0() {
        DynamicPointer dp = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals1_lyOT0() {
        DynamicPointer pointer1 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale(""));
        DynamicPointer pointer2 = pointer1;
        boolean result = pointer1.equals(pointer2);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals2_eRsn1() {
        DynamicPointer pointer1 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale(""));
        boolean result = pointer1.equals(pointer1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals3_zkVL2() {
        DynamicPointer pointer1 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale(""));
        DynamicPointer pointer2 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale(""));
        boolean result = pointer1.equals(pointer2);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isLeaf_0_KjgK0() throws Exception {
        DynamicPointer dynamicPointer = new DynamicPointer(new QName("qualifiedName"), new Object(), new PageContextHandler(), new Locale("en", "US"));
        boolean actual = dynamicPointer.isLeaf();
        boolean expected = false;
        assertEquals(expected, actual);
    }
}