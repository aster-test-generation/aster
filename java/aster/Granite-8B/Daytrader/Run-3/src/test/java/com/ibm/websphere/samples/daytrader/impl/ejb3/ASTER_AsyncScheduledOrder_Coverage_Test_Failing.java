/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AsyncScheduledOrder_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_run_1_FUfX1() {
        AsyncScheduledOrder asyncScheduledOrder = new AsyncScheduledOrder(null);
        asyncScheduledOrder.run();
    }
}