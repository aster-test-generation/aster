/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_MarketSummaryJSF_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSummaryDate_sTsT0_DQuY0() {
    // Assuming a proper non-null instance of TradeServices is required
    TradeServices tradeServices = mock(TradeServices.class); // Mocking TradeServices
    Instance<TradeServices> tradeServicesInstance = mock(Instance.class);
    when(tradeServicesInstance.get()).thenReturn(tradeServices);
    MarketSummaryJSF marketSummary = new MarketSummaryJSF(tradeServicesInstance);
    Date expectedDate = new Date();
    marketSummary.setSummaryDate(expectedDate);
    assertEquals(expectedDate, marketSummary.getSummaryDate());
  }
}