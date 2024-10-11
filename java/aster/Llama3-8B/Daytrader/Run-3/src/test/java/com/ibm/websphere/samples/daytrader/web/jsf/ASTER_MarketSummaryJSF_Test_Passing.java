/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import javax.enterprise.inject.Instance;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MarketSummaryJSF_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void doSomething_lUIm1() {
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetVolume_TUTa0_bEeK0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeServices tradeServices = mock(TradeServices.class);
    when(services.get()).thenReturn(tradeServices);
    MarketSummaryJSF marketSummaryJSF = new MarketSummaryJSF(services);
    double volume = marketSummaryJSF.getVolume();
    assertEquals(0.0, volume);
}
}