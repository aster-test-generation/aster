/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import java.math.BigDecimal;
import java.util.Date;
import javax.enterprise.inject.Instance;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MarketSummaryJSF_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpenTSIA_dbzl0() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    QuoteData[] topLosers = marketSummaryJSF.getTopLosers();
    assertNotNull(topLosers);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGainPercent_SpBo0() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    QuoteData[] result = marketSummaryJSF.getTopLosers();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOpenTSIA_UPAv0() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    BigDecimal openTSIA = new BigDecimal("10.0");
    marketSummaryJSF.setOpenTSIA(openTSIA);
    assertNotNull(marketSummaryJSF.getTopLosers());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTSIA_FXbf0() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    BigDecimal tSIA = new BigDecimal("10.0");
    marketSummaryJSF.setTSIA(tSIA);
    assertNotNull(marketSummaryJSF.getTopLosers());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSummaryDate_QfMy0() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    Date summaryDate = new Date();
    marketSummaryJSF.setSummaryDate(summaryDate);
    assertNotNull(marketSummaryJSF.getTopLosers());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTopLosers_zukw0() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    assertNotNull(marketSummaryJSF.getTopLosers());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTopLosers_cBvU0() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    QuoteData[] topLosers = new QuoteData[1];
    marketSummaryJSF.setTopLosers(topLosers);
    assertArrayEquals(topLosers, marketSummaryJSF.getTopLosers());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTopLosers_SBQO0() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    QuoteData[] topLosers = marketSummaryJSF.getTopLosers();
    assertNull(topLosers);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGainPercentHTML_plZD0_LLeg0() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    marketSummaryJSF.setGainPercent(BigDecimal.valueOf(10.0));
    assertEquals("<span style='color:green'>10.0%</span>", marketSummaryJSF.getGainPercentHTML());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpenTSIA_dbzl0_fid2() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    BigDecimal openTSIA = marketSummaryJSF.getOpenTSIA();
    assertNotNull(openTSIA);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGainPercent_SpBo0_fid2() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    BigDecimal result = marketSummaryJSF.getGainPercent();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOpenTSIA_UPAv0_fid2() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    BigDecimal openTSIA = new BigDecimal("10.0");
    marketSummaryJSF.setOpenTSIA(openTSIA);
    assertEquals(openTSIA, marketSummaryJSF.getOpenTSIA());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTopGainers_WZsh0() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    QuoteData[] topGainers = new QuoteData[1];
    marketSummaryJSF.setTopGainers(topGainers);
    assertArrayEquals(topGainers, marketSummaryJSF.getTopGainers());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTSIA_FXbf0_fid2() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    BigDecimal tSIA = new BigDecimal("10.0");
    marketSummaryJSF.setTSIA(tSIA);
    assertEquals(tSIA, marketSummaryJSF.getTSIA());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGainPercent_jjXz0() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    BigDecimal gainPercent = new BigDecimal("10.12345");
    marketSummaryJSF.setGainPercent(gainPercent);
    assertEquals(new BigDecimal("10.12"), marketSummaryJSF.getGainPercent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetVolume_Zwms0() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    marketSummaryJSF.setVolume(10.0);
    assertEquals(10.0, marketSummaryJSF.getVolume(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSummaryDate_QfMy0_fid2() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    Date summaryDate = new Date();
    marketSummaryJSF.setSummaryDate(summaryDate);
    assertEquals(summaryDate, marketSummaryJSF.getSummaryDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSummaryDate_aDmB0() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    Date expected = new Date();
    marketSummaryJSF.setSummaryDate(expected);
    Date actual = marketSummaryJSF.getSummaryDate();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTSIA_YqWj0_fid2() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    BigDecimal result = marketSummaryJSF.getTSIA();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetVolume_zukw0() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    assertEquals(0.0, marketSummaryJSF.getVolume(), 0.0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTopLosers_cBvU0_fid2() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    QuoteData[] topLosers = new QuoteData[1];
    marketSummaryJSF.setTopLosers(topLosers);
    assertArrayEquals(topLosers, marketSummaryJSF.getTopLosers());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTopGainers_RQEE0() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    QuoteData[] topGainers = marketSummaryJSF.getTopGainers();
    assertNotNull(topGainers);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTopLosers_SBQO0_fid2() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    QuoteData[] topLosers = marketSummaryJSF.getTopLosers();
    assertNotNull(topLosers);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGainPercentHTML_plZD0_LLeg0_fid3() {
    Instance<TradeServices> services = mock(Instance.class);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    marketSummaryJSF.setGainPercent(BigDecimal.valueOf(10.0));
    assertEquals(FinancialUtils.printGainPercentHTML(BigDecimal.valueOf(10.0)), marketSummaryJSF.getGainPercentHTML());
}
}