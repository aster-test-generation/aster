/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AsyncOrder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertiesWithBothNull_Etcn3_CxtT0_1() {
        AsyncOrder asyncOrder = new AsyncOrder();
        asyncOrder.setProperties(null, false);
        assertNull(asyncOrder.orderID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertiesWithBothNull_Etcn3_CxtT0_2() {
        AsyncOrder asyncOrder = new AsyncOrder();
        asyncOrder.setProperties(null, false);
        assertFalse(asyncOrder.twoPhase);
    }
}