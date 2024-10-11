/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrdersAlertFilter_Test_Failing {
@Mock
    private FilterConfig filterConfig;
@Mock
    private TradeServices tradeAction;
@Mock
    private ServletRequest servletRequest;
@Mock
    private ServletResponse servletResponse;
@Mock
    private FilterChain filterChain;
private OrdersAlertFilter ordersAlertFilter;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_CAWy0() throws ServletException {
        OrdersAlertFilter filter = new OrdersAlertFilter(null);
        FilterConfig filterConfig = mock(FilterConfig.class);
        filter.init(filterConfig);
        verify(filterConfig, times(1)).getInitParameter(anyString());
        verify(filterConfig, times(1)).getServletContext();
    }
}