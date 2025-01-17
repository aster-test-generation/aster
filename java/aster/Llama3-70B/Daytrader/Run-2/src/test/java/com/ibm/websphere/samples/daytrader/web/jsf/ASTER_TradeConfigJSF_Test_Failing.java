/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeConfigJSF_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketSummaryInterval_TQJY0_fid1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int result = tradeConfigJSF.getMarketSummaryInterval();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrimIterations_cMmx0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int result = tradeConfigJSF.getPrimIterations();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxUsers_UeLa0_fid1() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int result = tradeConfigJSF.getMaxUsers();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxQuotes_PlJu0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int result = tradeConfigJSF.getMaxQuotes();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetListQuotePriceChangeFrequency_WyFp0() {
    TradeConfigJSF tradeConfigJSF = new TradeConfigJSF();
    int result = tradeConfigJSF.getListQuotePriceChangeFrequency();
    assertEquals(0, result);
}
}