/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AsyncScheduledOrder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertiesWithNullServices_fApf1_1() {
        AsyncScheduledOrder asyncScheduledOrder = new AsyncScheduledOrder(null);
        asyncScheduledOrder.setProperties(1, true);
        assertEquals(1, asyncScheduledOrder.orderID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertiesWithNullServices_fApf1_2() {
        AsyncScheduledOrder asyncScheduledOrder = new AsyncScheduledOrder(null);
        asyncScheduledOrder.setProperties(1, true);
        assertTrue(asyncScheduledOrder.twoPhase);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertiesWithNullServices_fApf1() {
        AsyncScheduledOrder asyncScheduledOrder = new AsyncScheduledOrder(null);
        asyncScheduledOrder.setProperties(1, true);
        assertEquals(1, asyncScheduledOrder.orderID);
        assertTrue(asyncScheduledOrder.twoPhase);
    }
}