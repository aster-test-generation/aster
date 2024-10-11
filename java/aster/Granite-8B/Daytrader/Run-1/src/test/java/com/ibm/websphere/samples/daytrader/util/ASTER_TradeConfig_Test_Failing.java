/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeConfig_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMAX_USERS_IoZi0() {
        TradeConfig tradeConfig = new TradeConfig();
        int expected = 10; // Replace with the expected value
        int actual = tradeConfig.getMAX_USERS();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetListQuotePriceChangeFrequency_xbZh0() {
        int expectedListQuotePriceChangeFrequency = 1; // Replace with the expected value
        int actualListQuotePriceChangeFrequency = TradeConfig.getListQuotePriceChangeFrequency();
        assertEquals(expectedListQuotePriceChangeFrequency, actualListQuotePriceChangeFrequency);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderFee_BUY_Eyuy0() {
        BigDecimal expected = BigDecimal.valueOf(100.0);
        BigDecimal actual = TradeConfig.getOrderFee("BUY");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderFee_SELL_RKgD1() {
        BigDecimal expected = BigDecimal.valueOf(100.0);
        BigDecimal actual = TradeConfig.getOrderFee("SELL");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderFee_other_ogPN2() {
        BigDecimal expected = BigDecimal.valueOf(50.0);
        BigDecimal actual = TradeConfig.getOrderFee("other");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewUser_tLWT0() {
        boolean newUser = true;
        char expected = 'b';
        char actual = TradeConfig.getScenarioAction(newUser);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotNewUser_GIyh1() {
        boolean newUser = false;
        char expected = 's';
        char actual = TradeConfig.getScenarioAction(newUser);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIncrementScenarioCount_FnnO4() {
        TradeConfig.incrementScenarioCount();
        assertEquals(TradeConfig.getScenarioCount(), 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWebInterfaceNames_Dxkh0() {
        String[] actual = TradeConfig.getWebInterfaceNames();
        String[] expected = {"webInterface1", "webInterface2"};
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetOrderProcessingModeNames_QTZi0() {
        String[] expected = {"mode1", "mode2", "mode3"};
        String[] actual = TradeConfig.getOrderProcessingModeNames();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomPriceChangeFactor_DwdT0_3() {
        BigDecimal percentGainBD = TradeConfig.getRandomPriceChangeFactor();
        assertTrue(percentGainBD.compareTo(BigDecimal.ONE) <= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetScenarioCount_VyYA0() {
        TradeConfig tradeConfig = new TradeConfig();
        int result = tradeConfig.getScenarioCount();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndEmail_XDVA0_qQeo0() {
        String userID = "user123";
        String expectedEmail = userID.replace(":", "") + "@" + TradeConfig.rndInt(100) + ".com";
        String actualEmail = TradeConfig.rndEmail(userID);
        assertEquals(expectedEmail, actualEmail);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testRndFloat_xlXJ2_fid1() {
        float result = TradeConfig.rndFloat(1);
        assertTrue(result == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testRndFloat_nIsS3_fid1() {
        float result = TradeConfig.rndFloat(-1);
        assertTrue(result >= 0 && result < 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testRndFloat_CYpd5_fid1() {
        float result = TradeConfig.rndFloat(Integer.MIN_VALUE);
        assertTrue(result >= 0 && result < Integer.MIN_VALUE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_bzww2() {
        int result = TradeConfig.getAccessMode();
        assertEquals(2, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_Ydrk3() {
        int result = TradeConfig.getAccessMode();
        assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_aziR4() {
        int result = TradeConfig.getAccessMode();
        assertEquals(4, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_rCKm5() {
        int result = TradeConfig.getAccessMode();
        assertEquals(5, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_pqeY6() {
        int result = TradeConfig.getAccessMode();
        assertEquals(6, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_WSyW7() {
        int result = TradeConfig.getAccessMode();
        assertEquals(7, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_FhUa8() {
        int result = TradeConfig.getAccessMode();
        assertEquals(8, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_ousO9() {
        int result = TradeConfig.getAccessMode();
        assertEquals(9, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_uGjm10() {
        int result = TradeConfig.getAccessMode();
        assertEquals(10, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_MtpI11() {
        int result = TradeConfig.getAccessMode();
        assertEquals(11, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_xmCJ12() {
        int result = TradeConfig.getAccessMode();
        assertEquals(12, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_pIXb13() {
        int result = TradeConfig.getAccessMode();
        assertEquals(13, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_mFzy14() {
        int result = TradeConfig.getAccessMode();
        assertEquals(14, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_wsGN15() {
        int result = TradeConfig.getAccessMode();
        assertEquals(15, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_deFC16() {
        int result = TradeConfig.getAccessMode();
        assertEquals(16, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_hUZW17() {
        int result = TradeConfig.getAccessMode();
        assertEquals(17, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_XReB18() {
        int result = TradeConfig.getAccessMode();
        assertEquals(18, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_BmmO19() {
        int result = TradeConfig.getAccessMode();
        assertEquals(19, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_kDfe20() {
        int result = TradeConfig.getAccessMode();
        assertEquals(20, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_zqXh21() {
        int result = TradeConfig.getAccessMode();
        assertEquals(21, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_MOij22() {
        int result = TradeConfig.getAccessMode();
        assertEquals(22, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_GMvk23() {
        int result = TradeConfig.getAccessMode();
        assertEquals(23, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAccessMode_kbfd24() {
        int result = TradeConfig.getAccessMode();
        assertEquals(24, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMarketSummaryInterval_tQkq0_fid1() {
        TradeConfig tradeConfig = new TradeConfig();
        int marketSummaryInterval = TradeConfig.getMarketSummaryInterval();
        assertEquals(10, marketSummaryInterval);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrimIterations_aXOn0_fid1() {
        TradeConfig tradeConfig = new TradeConfig();
        int expected = 10; // Replace with the expected value
        int actual = tradeConfig.getPrimIterations();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndAddress_rAfz0() {
        String address = TradeConfig.rndAddress();
        assertNotNull(address);
        assertTrue(address.matches("^[0-9]{4} Oak St.$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioMixes_BWXC0() {
        TradeConfig tradeConfig = new TradeConfig();
        int[][] scenarioMixes = tradeConfig.getScenarioMixes();
        assertNotNull(scenarioMixes);
        assertTrue(scenarioMixes.length > 0);
        for (int[] mix : scenarioMixes) {
            assertTrue(mix.length == 2);
            assertTrue(mix[0] >= 0 && mix[0] <= 100);
            assertTrue(mix[1] >= 0 && mix[1] <= 100);
            assertTrue(mix[0] + mix[1] == 100);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbol_loqh0() {
        String result = TradeConfig.rndSymbol();
        assertNotNull(result);
        assertTrue(result.startsWith("s:"));
        assertTrue(result.length() > 3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndAddress_rAfz0_2_fid3() {
        String address = TradeConfig.rndAddress();
        assertTrue(address.matches("^[0-9]{4} Oak St.$"));
    }
}