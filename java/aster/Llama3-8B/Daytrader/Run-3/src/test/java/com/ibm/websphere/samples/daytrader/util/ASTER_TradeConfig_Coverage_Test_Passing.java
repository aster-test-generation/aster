/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeConfig_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextUserID_Tieu0() {
        TradeConfig tradeConfig = new TradeConfig();
        String expectedUserID = "uid:0";
        String actualUserID = tradeConfig.nextUserID();
        assertEquals(expectedUserID, actualUserID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioAction_NewUser_YIno0() {
        char result = TradeConfig.getScenarioAction(true);
        assertEquals('b', result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioAction_OldUser_ActionNotB_mVCY1() {
        char result = TradeConfig.getScenarioAction(false);
        assertNotEquals('b', result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomPriceChangeFactor_WhenPercentGainBDIsGreaterThanZero_Sfde1() {
        TradeConfig tradeConfig = new TradeConfig();
        BigDecimal result = tradeConfig.getRandomPriceChangeFactor();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndNewUserID_HostNameNull_brtO0_1() {
        TradeConfig tradeConfig = new TradeConfig();
        String result = tradeConfig.rndNewUserID();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderFeeForBuyOrder_aaVE0_dkmd0() {
    String orderType = "BUY";
    String orderFee = TradeConfig.rndBalance();
    assertEquals("1000000", TradeConfig.rndBalance());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderFeeForSellOrder_CwFB1_mQck1() {
    String orderType = "SELL";
    String result = TradeConfig.rndBalance();
    assertEquals("1000000", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndNewUserID_HostNameNotNull_gVbT1_vYrf1_1() {
    TradeConfig tradeConfig = new TradeConfig();
    String result = tradeConfig.rndBalance();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRndNewUserID_HostNameNotNull_gVbT1_vYrf1_2() {
    TradeConfig tradeConfig = new TradeConfig();
    String result = tradeConfig.rndBalance();
    assertEquals("1000000", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetScenarioAction_OldUser_ActionB_kNat2_IGRo1() {
    TradeConfig tradeConfig = new TradeConfig();
    assertEquals("1000000", TradeConfig.rndBalance());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetScenarioAction_OldUser_ActionB_SellDeficitZero_bMKB3_ZlEw1() {
    TradeConfig tradeConfig = new TradeConfig();
    String sellDeficit = "0";
    String result = TradeConfig.rndBalance();
    assertEquals("1000000", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextUserIDWhenCountIsMaxUsers_GJWo1_xYHs0_fid2() {
    TradeConfig tradeConfig = new TradeConfig();
    String expectedUserID = "1000000";
    String actualUserID = tradeConfig.rndBalance();
    assertEquals(expectedUserID, actualUserID);
}
}