/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AsyncOrder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRun_avsL0() {
        AsyncOrder asyncOrder = new AsyncOrder();
        try {
            asyncOrder.run();
        } catch (Exception e) {
            assert e.getMessage().equals("Exception");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperties_jWgr0_zRmk0_1() {
        AsyncOrder asyncOrder = new AsyncOrder();
        asyncOrder.setProperties(1, true);
        assertEquals(1, asyncOrder.orderID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProperties_jWgr0_zRmk0_2() {
        AsyncOrder asyncOrder = new AsyncOrder();
        asyncOrder.setProperties(1, true);
        assertTrue(asyncOrder.twoPhase);
    }
}