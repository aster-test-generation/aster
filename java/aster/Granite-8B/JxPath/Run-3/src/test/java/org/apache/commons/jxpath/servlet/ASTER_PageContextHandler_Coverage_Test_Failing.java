/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PageContextHandler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames1_EwgN0() {
        PageContextHandler instance = new PageContextHandler();
        String[] expResult = {};
        String[] result = instance.getPropertyNames(null);
        assertArrayEquals(expResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames2_SjeL1() {
        PageContextHandler instance = new PageContextHandler();
        String[] expResult = {};
        String[] result = instance.getPropertyNames("");
        assertArrayEquals(expResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames3_TvkP2() {
        PageContextHandler instance = new PageContextHandler();
        String[] expResult = {};
        String[] result = instance.getPropertyNames(new Object());
        assertArrayEquals(expResult, result);
    }
}