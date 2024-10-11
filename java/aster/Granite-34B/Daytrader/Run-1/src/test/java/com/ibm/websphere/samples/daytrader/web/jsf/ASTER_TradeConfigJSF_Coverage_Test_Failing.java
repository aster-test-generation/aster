/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeConfigJSF_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade1_EKhV0() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertEquals("Trade Reset completed successfully", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade2_deUW1() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertNotEquals("Trade Reset Error  - see log for details", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade3_Anvp2() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade4_RWCv3() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertTrue(result.length() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade5_WexT4() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade6_DtGs5() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade7_EdJO6() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertTrue(result.matches("[a-zA-Z]+"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade8_FhqO7() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertTrue(result.matches("[0-9]+"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade9_dsNA8() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertTrue(result.matches("[a-zA-Z0-9]+"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade10_FLzq9() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertFalse(result.matches("[a-zA-Z]+"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade11_ajLr10() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertFalse(result.matches("[0-9]+"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade12_daTd11() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertFalse(result.matches("[a-zA-Z0-9]+"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade13_UxyJ12() {
        TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
        String result = tradeConfigJSF.resetTrade();
        Assertions.assertTrue(result.contains("Trade Reset completed successfully"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPopulateDatabase_Oczc0() {
        TradeConfigJSF tradeConfig = new TradeConfigJSF();
        String result = tradeConfig.populateDatabase();
        assertEquals("TradeBuildDB: **** DayTrader Database Built - 100 users created, 1000 quotes created. ****<br/>TradeBuildDB: **** Check System.Out for any errors. ****<br/>", result);
    }
}