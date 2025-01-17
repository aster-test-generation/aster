/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import java.io.IOException;
import javax.enterprise.inject.Instance;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_OrdersAlertFilter_Coverage_Test_Passing {
private FilterConfig filterConfig;
private OrdersAlertFilter ordersAlertFilter;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFilter_ActionIsEmpty_qBVR3() throws IOException, ServletException {
        OrdersAlertFilter filter = new OrdersAlertFilter(mock(Instance.class));
        ServletRequest req = mock(ServletRequest.class);
        ServletResponse resp = mock(ServletResponse.class);
        FilterChain chain = mock(FilterChain.class);
        TradeConfig.setDisplayOrderAlerts(true);
        when(req.getParameter("action")).thenReturn("");
        filter.doFilter(req, resp, chain);
        verify(chain).doFilter(req, resp);
    }
}