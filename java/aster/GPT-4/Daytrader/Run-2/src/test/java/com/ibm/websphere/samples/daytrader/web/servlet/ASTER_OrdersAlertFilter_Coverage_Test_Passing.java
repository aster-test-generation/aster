/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_OrdersAlertFilter_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitAssignsFilterConfig_ylYd0() throws ServletException {
        FilterConfig mockFilterConfig = mock(FilterConfig.class);
        OrdersAlertFilter filter = new OrdersAlertFilter(null);
        filter.init(mockFilterConfig);
    }
}