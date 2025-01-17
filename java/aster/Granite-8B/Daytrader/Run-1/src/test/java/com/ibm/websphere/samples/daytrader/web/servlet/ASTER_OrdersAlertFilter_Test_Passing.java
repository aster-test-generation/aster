/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.servlet.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrdersAlertFilter_Test_Passing {
    private FilterConfig filterConfig = null;
    private TradeServices tradeAction;
    @Mock
    private ServletRequest req;
    @Mock
    private ServletResponse resp;
    @Mock
    private FilterChain chain;
    @Mock
    private Instance<TradeServices> services;
    @InjectMocks
    private OrdersAlertFilter ordersAlertFilter;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFilterWhenDisplayOrderAlertsIsFalse_TSax2() throws IOException, ServletException {
        when(TradeConfig.getDisplayOrderAlerts()).thenReturn(false);
        ordersAlertFilter.doFilter(req, resp, chain);
        verify(chain).doFilter(req, resp);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFilterWhenDisplayOrderAlertsIsFalse_TSax2_DCxa0() throws IOException, ServletException {
        when(TradeConfig.getDisplayOrderAlerts()).thenReturn(false);
        FilterChain chain = mock(FilterChain.class);
        ordersAlertFilter.doFilter(req, resp, chain);
        verify(chain).doFilter(req, resp);
    }
}