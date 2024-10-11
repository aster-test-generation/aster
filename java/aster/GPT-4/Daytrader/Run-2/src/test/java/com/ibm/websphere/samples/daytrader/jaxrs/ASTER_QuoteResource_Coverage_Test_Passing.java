/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;
import javax.enterprise.inject.Instance;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuoteResource_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setUp_xoxV0_nejj0() {
    Instance<TradeServices> servicesInstance = mock(Instance.class);
    TradeServices tradeService = mock(TradeServices.class);
    when(servicesInstance.get()).thenReturn(tradeService);
    QuoteResource quoteResource = new QuoteResource(servicesInstance);
}
}