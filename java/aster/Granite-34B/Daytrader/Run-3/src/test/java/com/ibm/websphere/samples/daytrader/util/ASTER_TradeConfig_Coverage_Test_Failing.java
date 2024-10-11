/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeConfig_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_DMRX0() {
    assertEquals("a-b-1234567890-1", TradeConfig.rndNewUserID());
    assertEquals("a-b-1234567890-2", TradeConfig.rndNewUserID());
    assertEquals("a-b-1234567890-3", TradeConfig.rndNewUserID());
    assertEquals("a-b-1234567891-1", TradeConfig.rndNewUserID());
    assertEquals("a-b-1234567891-2", TradeConfig.rndNewUserID());
    assertEquals("a-b-1234567891-3", TradeConfig.rndNewUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUserID_RND_USER_TRUE_Exception_hmDm2() {
    boolean RND_USER = true;
    String actual = null;
    try {
      actual = TradeConfig.getUserID();
    } catch (Exception e) {
    }
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUserID_RND_USER_FALSE_Exception_ecyT3() {
    boolean RND_USER = false;
    String actual = null;
    try {
      actual = TradeConfig.getUserID();
    } catch (Exception e) {
    }
    assertEquals(null, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_DMRX0_1() {
    assertEquals("a-b-1234567890-1", TradeConfig.rndNewUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_DMRX0_2() {
    assertEquals("a-b-1234567890-2", TradeConfig.rndNewUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_DMRX0_3() {
    assertEquals("a-b-1234567890-3", TradeConfig.rndNewUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_DMRX0_4() {
    assertEquals("a-b-1234567891-1", TradeConfig.rndNewUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_DMRX0_5() {
    assertEquals("a-b-1234567891-2", TradeConfig.rndNewUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRndNewUserID_DMRX0_6() {
    assertEquals("a-b-1234567891-3", TradeConfig.rndNewUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUserID_RND_USER_TRUE_WXnZ0_kdbV0() {
    boolean RND_USER = true;
    String expected = "1000000";
    String actual = TradeConfig.getUserID();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetConfigParam_3_VNeW2_bbqV0() {
    TradeConfig tradeConfig = new TradeConfig();
    tradeConfig.setConfigParam("WebInterface", "value3");
    assertEquals(3, tradeConfig.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUserID_RND_USER_FALSE_fqZs1_cxGg1() {
    boolean RND_USER = false;
    String expected = "12345"; // Replace with the actual value returned by nextUserID()
    String actual = TradeConfig.getUserID();
    assertEquals(expected, actual);
  }
}