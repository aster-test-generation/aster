/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MarketSummaryJSF_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenTSIAWithNullTradeServices_zjJp1() {
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(null);
    BigDecimal openTSIA = marketSummaryJSF.getOpenTSIA();
    assertNull(openTSIA);
  }
}