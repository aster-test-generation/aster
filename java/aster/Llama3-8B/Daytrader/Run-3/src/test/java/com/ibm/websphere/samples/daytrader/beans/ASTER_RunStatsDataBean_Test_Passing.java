/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RunStatsDataBean_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTradeUserCount_EgQJ0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        int expected = 0;
        int actual = runStatsDataBean.getTradeUserCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBuyOrderCount_OXfG1() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setBuyOrderCount(10);
        assertEquals(10, runStatsDataBean.getBuyOrderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDeletedOrderCount_XVRC1() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setDeletedOrderCount(10);
        assertEquals(10, runStatsDataBean.getDeletedOrderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBuyOrderCount_UADt0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        int expected = 0;
        int actual = runStatsDataBean.getBuyOrderCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTradeUserCount_nbSk1() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setTradeUserCount(10);
        assertEquals(10, runStatsDataBean.getTradeUserCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderCount_ZCzk0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        int actual = runStatsDataBean.getOrderCount();
        int expected = 0; // default value
        assert expected == actual;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenOrderCount_cYrI1() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        int expected = 0;
        int actual = runStatsDataBean.getOpenOrderCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenOrderCount_jNnK0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setOpenOrderCount(10);
        assertEquals(10, runStatsDataBean.getOpenOrderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingCount_uSWt1() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setHoldingCount(10);
        assertEquals(10, runStatsDataBean.getHoldingCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSumLoginCount_cYzy1() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setSumLoginCount(10);
        assertEquals(10, runStatsDataBean.getSumLoginCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCancelledOrderCount_Iylt0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        int expected = 0;
        int actual = runStatsDataBean.getCancelledOrderCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSellOrderCount_LMbN1() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setSellOrderCount(10);
        assertEquals(10, runStatsDataBean.getSellOrderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTradeStockCount_mvwX0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        int expected = 0;
        int actual = runStatsDataBean.getTradeStockCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeletedOrderCount_BOPo0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        int expected = 0;
        int actual = runStatsDataBean.getDeletedOrderCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_FEyf0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        String expected = "\n\tRunStatsData for reset at " + new java.util.Date() + "\n\t\t      tradeUserCount: " + runStatsDataBean.getTradeUserCount() + "\n\t\t        newUserCount: " + runStatsDataBean.getNewUserCount() + "\n\t\t       sumLoginCount: " + runStatsDataBean.getSumLoginCount() + "\n\t\t      sumLogoutCount: " + runStatsDataBean.getSumLogoutCount() + "\n\t\t        holdingCount: " + runStatsDataBean.getHoldingCount() + "\n\t\t          orderCount: " + runStatsDataBean.getOrderCount() + "\n\t\t       buyOrderCount: " + runStatsDataBean.getBuyOrderCount() + "\n\t\t      sellOrderCount: " + runStatsDataBean.getSellOrderCount() + "\n\t\t cancelledOrderCount: " + runStatsDataBean.getCancelledOrderCount() + "\n\t\t      openOrderCount: " + runStatsDataBean.getOpenOrderCount() + "\n\t\t   deletedOrderCount: " + runStatsDataBean.getDeletedOrderCount();
        assertEquals(expected, runStatsDataBean.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSumLogoutCount_mhYi0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        int expected = 0;
        int actual = runStatsDataBean.getSumLogoutCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNewUserCount_tpEL0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setNewUserCount(10);
        assertEquals(10, runStatsDataBean.getNewUserCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrderCount_CtYU0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setOrderCount(10);
        assertEquals(10, runStatsDataBean.getOrderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSumLoginCount_vbrD0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sumLoginCount = runStatsDataBean.getSumLoginCount();
    assertEquals(0, sumLoginCount);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCancelledOrderCount_xoTe1() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setCancelledOrderCount(10);
        assertEquals(10, runStatsDataBean.getCancelledOrderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSellOrderCount_rZHY0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        int expected = 0;
        int actual = runStatsDataBean.getSellOrderCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSumLogoutCount_ffoE1() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        runStatsDataBean.setSumLogoutCount(10);
        assertEquals(10, runStatsDataBean.getSumLogoutCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingCount_lBVG0() {
        RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
        int expected = 0;
        int actual = runStatsDataBean.getHoldingCount();
        assertEquals(expected, actual);
    }
}