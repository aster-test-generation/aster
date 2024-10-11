/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeConfigJSF_Coverage_Test_Failing {
  private Log log;
  private TradeConfig tradeConfig;
  private TradeServices tradeServices;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testResult_vQNI4_1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.populateDatabase();
    Assertions.assertTrue(result.contains("TradeBuildDB: **** DayTrader Database Built - " + TradeConfig.getMAX_USERS() + " users created, " + TradeConfig.getMAX_QUOTES() + " quotes created. ****<br/>"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testResult_vQNI4_2() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.populateDatabase();
    Assertions.assertTrue(result.contains("TradeBuildDB: **** Check System.Out for any errors. ****<br/>"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testResetTrade_djfb0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.resetTrade();
    assertEquals("stats", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testResult_vQNI4() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    String result = tradeConfigJSF.populateDatabase();
    Assertions.assertTrue(result.contains("TradeBuildDB: **** DayTrader Database Built - " + TradeConfig.getMAX_USERS() + " users created, " + TradeConfig.getMAX_QUOTES() + " quotes created. ****<br/>"));
    Assertions.assertTrue(result.contains("TradeBuildDB: **** Check System.Out for any errors. ****<br/>"));
  }
}