/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RunStatsDataBean_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCancelledOrderCountWithNegativeNumber_NMET3() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setCancelledOrderCount(-10);
        assertEquals(0, runStatsDataBean.getCancelledOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCancelledOrderCountWithNegativeNumber_NMET3_fid1() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setCancelledOrderCount(-1 - 10);
        assertEquals(-10, runStatsDataBean.getCancelledOrderCount());
    }
}