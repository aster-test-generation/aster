/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AsyncScheduledOrderSubmitter_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrder_uQas0() {
        AsyncScheduledOrderSubmitter asyncScheduledOrderSubmitter = new AsyncScheduledOrderSubmitter();
        Integer orderID = 1;
        boolean twoPhase = true;
        Future<?> future = asyncScheduledOrderSubmitter.submitOrder(orderID, twoPhase);
        // Add assertion here
        // For example:
        // assertNotNull(future);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrder_uQas0_fid2() {
        AsyncScheduledOrderSubmitter asyncScheduledOrderSubmitter = new AsyncScheduledOrderSubmitter();
        Integer orderID = 1;
        boolean twoPhase = true;
        Future<?> future = asyncScheduledOrderSubmitter.submitOrder(orderID, twoPhase);
    }
}