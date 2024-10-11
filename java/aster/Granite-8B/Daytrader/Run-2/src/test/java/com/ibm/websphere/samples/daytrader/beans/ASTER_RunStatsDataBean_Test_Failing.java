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
    public void testGetCancelledOrderCountWithNegativeCancelledOrders_ndjD3() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setCancelledOrderCount(-10);
        int cancelledOrderCount = runStatsDataBean.getCancelledOrderCount();
        assertEquals(0, cancelledOrderCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSellOrderCount_fGMy1_4() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setSellOrderCount(0);
        runStatsDataBean.setSellOrderCount(1);
        runStatsDataBean.setSellOrderCount(-1);
        runStatsDataBean.setSellOrderCount(Integer.MAX_VALUE);
        runStatsDataBean.setSellOrderCount(Integer.MIN_VALUE);
        assertEquals(Integer.MAX_VALUE, runStatsDataBean.getSellOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSellOrderCount_fGMy1_1_fid3() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setSellOrderCount(0);
        runStatsDataBean.setSellOrderCount(1);
        runStatsDataBean.setSellOrderCount(-1);
        runStatsDataBean.setSellOrderCount(Integer.MAX_VALUE);
        runStatsDataBean.setSellOrderCount(Integer.MIN_VALUE);
        assertEquals(0, runStatsDataBean.getSellOrderCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSellOrderCount_fGMy1_3_fid3() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setSellOrderCount(0);
        runStatsDataBean.setSellOrderCount(1);
        runStatsDataBean.setSellOrderCount(-1);
        runStatsDataBean.setSellOrderCount(Integer.MAX_VALUE);
        runStatsDataBean.setSellOrderCount(Integer.MIN_VALUE);
        assertEquals(-1, runStatsDataBean.getSellOrderCount());
    }
}