/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;
import java.math.BigDecimal;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeConfig_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRunTimeModeNames_PqqH0() {
        String[] expected = {"Full EJB3", "mode2", "mode3"};
        String[] actual = TradeConfig.getRunTimeModeNames();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndAddress_gaCJ1() {
        String result = TradeConfig.rndAddress();
        assertEquals("526 Oak St.", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndFullName_Mohq0() {
        String result = TradeConfig.rndFullName();
        assertEquals("first:" + TradeConfig.rndInt(1000) + " last:" + TradeConfig.rndInt(5000), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioMixes_ouZT0_1() {
        int[][] expected = {{1, 2}, {3, 4}};
        int[][] actual = TradeConfig.getScenarioMixes();
        assertArrayEquals(expected, actual);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndQuantity_HLxk0() {
        float result = TradeConfig.rndQuantity();
        assertEquals(169.0f, result, 0.1f);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndNewUserID_YdTQ0() {
        TradeConfig tradeConfig = new TradeConfig();
        String hostname = "localhost";
        long currentTimeMillis = System.currentTimeMillis();
        int count = 0;
        String expected = "newUserPrefix" + hostname + currentTimeMillis + count;
        assertEquals(expected, tradeConfig.rndNewUserID());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioActionNewUser_wNNk0() {
        boolean newUser = true;
        char result = TradeConfig.getScenarioAction(newUser);
        assertEquals('h', result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioActionNotNewUser_fzOc1() {
        boolean newUser = false;
        char result = TradeConfig.getScenarioAction(newUser);
        assertEquals('q', result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbols_ovXz0() {
        String symbols = TradeConfig.rndSymbols();
        assertEquals("s:5,s:5,s:5,s:3,s:0,s:3,s:8,s:1", symbols);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbolsMultipleSymbols_HXAO1() {
        String symbols = TradeConfig.rndSymbols();
        assertEquals("s:3,s:3,s:6", symbols);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbolsMaxSymbols_ljkr2() {
        String symbols = TradeConfig.rndSymbols();
        assertEquals("s:2,s:6,s:3,s:3", symbols);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomPriceChangeFactorPositive_RaLZ0() {
        BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
        double value = result.doubleValue();
        assertEquals(1.0, value, 0.01);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomPriceChangeFactorNegative_fHCm1() {
        BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
        double value = result.doubleValue();
        assertEquals(0.91, value, 0.01);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomPriceChangeFactorZero_RTGe2() {
        BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
        double value = result.doubleValue();
        assertEquals(1.01, value, 0.01);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserID_RND_USER_TRUE_LxZm0() {
        TradeConfig tradeConfig = new TradeConfig();
        tradeConfig.RND_USER = true;
        String result = TradeConfig.getUserID();
        assertEquals(tradeConfig.rndUserID(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserID_RND_USER_FALSE_Vprw1() {
        TradeConfig tradeConfig = new TradeConfig();
        tradeConfig.RND_USER = false;
        String result = TradeConfig.getUserID();
        assertEquals(tradeConfig.nextUserID(), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndEmail_InhF1() {
        String userID = "test:123";
        String expected = "test123@28.com";
        String result = TradeConfig.rndEmail(userID);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndCreditCard_IfNc0_2() {
        String result = TradeConfig.rndCreditCard();
        assertEquals("8", result.charAt(4));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndCreditCard_IfNc0_3() {
        String result = TradeConfig.rndCreditCard();
        assertEquals("-", result.charAt(9));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndCreditCard_IfNc0_4() {
        String result = TradeConfig.rndCreditCard();
        assertEquals("6", result.charAt(13));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParamNullParmWithException_jMCi10() {
        try {
            TradeConfig.setConfigParam(null, "value");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParamEmptyParmWithException_twhJ11() {
        try {
            TradeConfig.setConfigParam("", "value");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParamNullValueWithException_Ewnk12() {
        try {
            TradeConfig.setConfigParam("parm", null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParamInvalidValueWithException_IOEr13() {
        try {
            TradeConfig.setConfigParam("maxUsers", "abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParamInvalidValueWithException2_oEwc14() {
        try {
            TradeConfig.setConfigParam("primIterations", "abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParamInvalidValueWithException3_pwiO15() {
        try {
            TradeConfig.setConfigParam("maxQuotes", "abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioCount_LuTX3() {
        assertEquals(3, TradeConfig.getScenarioCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndBigDecimal_xxtW0() {
        Random random = new Random();
        float f = 10.0f;
        BigDecimal result = TradeConfig.rndBigDecimal(f);
        BigDecimal expected = new BigDecimal(random.nextFloat() * f).setScale(2, BigDecimal.ROUND_HALF_UP);
        assert result.compareTo(expected) == 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndUserIDDeckNotShuffled_lpZD1_2() {
        TradeConfig tradeConfig = new TradeConfig();
        String result = tradeConfig.rndUserID();
        assertEquals("uid:3", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndUserIDDeckShuffled_XsQJ2_2() {
        TradeConfig tradeConfig = new TradeConfig();
        String result = tradeConfig.rndUserID();
        assertEquals("uid:2260", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndUserIDDeckFull_IHGo3_2() {
        TradeConfig tradeConfig = new TradeConfig();
        for (int i = 0; i < 10; i++) {
            tradeConfig.rndUserID();
        }
        String result = tradeConfig.rndUserID();
        assertEquals("uid:4", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessMode_IDiu0() {
        assertEquals(0, TradeConfig.getAccessMode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRunTimeModeNames_PqqH0_fid1() {
        String[] expected = {"mode1", "mode2", "mode3"};
        String[] actual = TradeConfig.getRunTimeModeNames();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndAddress_gaCJ1_fid1() {
        String result = TradeConfig.rndAddress();
        assertEquals("0 Oak St.", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndQuantity_HLxk0_fid1() {
        float result = TradeConfig.rndQuantity();
        assertEquals(1.0f, result, 0.1f);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDisplayOrderAlertsFalse_NJwc1_fid1() {
        TradeConfig tradeConfig = new TradeConfig();
        assertFalse(TradeConfig.getDisplayOrderAlerts());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMAX_HOLDINGS_JRQR0() {
        assertEquals(0, TradeConfig.getMAX_HOLDINGS());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioActionNewUser_wNNk0_fid1() {
        boolean newUser = true;
        char result = TradeConfig.getScenarioAction(newUser);
        assertEquals('b', result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioActionNotNewUser_fzOc1_fid1() {
        boolean newUser = false;
        char result = TradeConfig.getScenarioAction(newUser);
        assertEquals('b', result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUpdateQuotePrices_uBSM0_fid1() {
        TradeConfig tradeConfig = new TradeConfig();
        boolean result = TradeConfig.getUpdateQuotePrices();
        assertEquals(true, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbols_ovXz0_fid1() {
        String symbols = TradeConfig.rndSymbols();
        assertEquals("s:0", symbols);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbolsMultipleSymbols_HXAO1_fid1() {
        String symbols = TradeConfig.rndSymbols();
        assertEquals("s:0,s:1", symbols);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndSymbolsMaxSymbols_ljkr2_fid1() {
        String symbols = TradeConfig.rndSymbols();
        assertEquals("s:0,s:1,s:2", symbols);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomPriceChangeFactorNegative_fHCm1_fid1() {
        BigDecimal result = TradeConfig.getRandomPriceChangeFactor();
        double value = result.doubleValue();
        assertEquals(0.9, value, 0.01);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndEmail_InhF1_fid1() {
        String userID = "test:123";
        String expected = "test123@54.com";
        String result = TradeConfig.rndEmail(userID);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndCreditCard_IfNc0_1_fid1() {
        String result = TradeConfig.rndCreditCard();
        assertEquals(19, result.length());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndCreditCard_IfNc0_2_fid1() {
        String result = TradeConfig.rndCreditCard();
        assertEquals("-", result.charAt(4));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndCreditCard_IfNc0_4_fid1() {
        String result = TradeConfig.rndCreditCard();
        assertEquals("-", result.charAt(13));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioCount_LuTX0() {
        assertEquals(0, TradeConfig.getScenarioCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRunTimeMode_VFrA0() {
        assertEquals(0, TradeConfig.getRunTimeMode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndUserIDDeckNotShuffled_lpZD1_2_fid1() {
        TradeConfig tradeConfig = new TradeConfig();
        String result = tradeConfig.rndUserID();
        assertEquals("uid:0", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndUserIDDeckShuffled_XsQJ2_2_fid1() {
        TradeConfig tradeConfig = new TradeConfig();
        String result = tradeConfig.rndUserID();
        assertEquals("uid:1", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndUserIDDeckFull_IHGo3_2_fid1() {
        TradeConfig tradeConfig = new TradeConfig();
        for (int i = 0; i < 10; i++) {
            tradeConfig.rndUserID();
        }
        String result = tradeConfig.rndUserID();
        assertEquals("uid:0", result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderFeeForBuyOrder_YNUa0_BARS0_fid1() {
    BigDecimal orderFee = new BigDecimal("0.01"); // Initialize orderFee
    BigDecimal result = TradeConfig.getOrderFee("BUY");
    assertEquals(orderFee.doubleValue(), result.doubleValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderFeeForSellOrder_noBO1_grjb0_fid1() {
    BigDecimal orderFee = new BigDecimal("0.01"); // Initialize orderFee
    BigDecimal result = TradeConfig.getOrderFee("SELL");
    assertEquals(orderFee.doubleValue(), result.doubleValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderFeeForInvalidOrderType_GhcO2_bNUG0_fid1() {
    String result = TradeConfig.rndUserID();
    assertEquals("uid:", result); // Assuming rndUserID returns a string
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetScenarioActionNoSellDeficit_rFLy3_CVfT0_fid1() {
    boolean newUser = false;
    TradeConfig tradeConfig = new TradeConfig();
    char result = TradeConfig.getScenarioAction(newUser);
    assertEquals('b', result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetScenarioMixes_ouZT0() {
        int[][] expected = {{1, 2}, {3, 4}};
        int[][] actual = TradeConfig.getScenarioMixes();
        assertArrayEquals(expected, actual);
        assertNotNull(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndCreditCard_IfNc0() {
        String result = TradeConfig.rndCreditCard();
        assertEquals(19, result.length());
        assertEquals("-", result.charAt(4));
        assertEquals("-", result.charAt(9));
        assertEquals("-", result.charAt(13));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndUserIDDeckNotShuffled_lpZD1() {
        TradeConfig tradeConfig = new TradeConfig();
        String result = tradeConfig.rndUserID();
        assertNotNull(result);
        assertEquals("uid:0", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndUserIDDeckShuffled_XsQJ2() {
        TradeConfig tradeConfig = new TradeConfig();
        String result = tradeConfig.rndUserID();
        assertNotNull(result);
        assertEquals("uid:1", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRndUserIDDeckFull_IHGo3() {
        TradeConfig tradeConfig = new TradeConfig();
        for (int i = 0; i < 10; i++) {
            tradeConfig.rndUserID();
        }
        String result = tradeConfig.rndUserID();
        assertNotNull(result);
        assertEquals("uid:0", result);
    }
}