/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.beans;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RunStatsDataBean_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTradeUserCount_GoDv0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getTradeUserCount();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBuyOrderCount_husC0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int buyOrderCount = 10;
    runStatsDataBean.setBuyOrderCount(buyOrderCount);
    assertEquals(buyOrderCount, runStatsDataBean.getBuyOrderCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDeletedOrderCount_bnJx0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int deletedOrderCount = 10;
    runStatsDataBean.setDeletedOrderCount(deletedOrderCount);
    assertEquals(deletedOrderCount, runStatsDataBean.getDeletedOrderCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTradeUserCount_HEnL0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setTradeUserCount(10);
    assertEquals(10, runStatsDataBean.getTradeUserCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBuyOrderCount_sDPq0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getBuyOrderCount();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderCount_OwmI0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getOrderCount();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNewUserCount_tfnx0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getNewUserCount();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOpenOrderCount_odDg0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int openOrderCount = 10;
    runStatsDataBean.setOpenOrderCount(openOrderCount);
    assertEquals(openOrderCount, runStatsDataBean.getOpenOrderCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTradeStockCount_Vnsn0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setTradeStockCount(10);
    assertEquals(10, runStatsDataBean.getTradeStockCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSumLoginCount_byLx0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSumLoginCount(10);
    assertEquals(10, runStatsDataBean.getSumLoginCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHoldingCount_MWtE0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setHoldingCount(10);
    assertEquals(10, runStatsDataBean.getHoldingCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCancelledOrderCount_rZJX0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setCancelledOrderCount(5);
    assertEquals(5, runStatsDataBean.getCancelledOrderCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSellOrderCount_iCxy0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sellOrderCount = 10;
    runStatsDataBean.setSellOrderCount(sellOrderCount);
    assertEquals(sellOrderCount, runStatsDataBean.getSellOrderCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_rqQm0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    String result = runStatsDataBean.toString();
    assertNotNull(result);
    assertNotEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTradeStockCount_YDLv0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getTradeStockCount();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDeletedOrderCount_xTqg0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setDeletedOrderCount(5);
    assertEquals(5, runStatsDataBean.getDeletedOrderCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSumLogoutCount_uJij0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getSumLogoutCount();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNewUserCount_jTdI0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int newUserCount = 10;
    runStatsDataBean.setNewUserCount(newUserCount);
    assertEquals(newUserCount, runStatsDataBean.getNewUserCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrderCount_EoXV0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setOrderCount(10);
    assertEquals(10, runStatsDataBean.getOrderCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSumLoginCount_rNlF0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getSumLoginCount();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCancelledOrderCount_rsRI0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int cancelledOrderCount = 10;
    runStatsDataBean.setCancelledOrderCount(cancelledOrderCount);
    assertEquals(cancelledOrderCount, runStatsDataBean.getCancelledOrderCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSumLogoutCount_LuFb0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int sumLogoutCount = 10;
    runStatsDataBean.setSumLogoutCount(sumLogoutCount);
    assertEquals(sumLogoutCount, runStatsDataBean.getSumLogoutCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSellOrderCount_DtsX0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    int result = runStatsDataBean.getSellOrderCount();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_rqQm0_1() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    String result = runStatsDataBean.toString();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_rqQm0_2() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    String result = runStatsDataBean.toString();
    assertNotEquals("", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSellOrderCount_IJTI0_duWi0() {
    RunStatsDataBean runStatsDataBean = new RunStatsDataBean();
    runStatsDataBean.setSellOrderCount(5);
    assertEquals(5, runStatsDataBean.getSellOrderCount());
}
}