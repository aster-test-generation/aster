/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PrimFilter_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithNonNullConfig_eHZp0() throws ServletException {
        FilterConfig mockFilterConfig = mock(FilterConfig.class);
        PrimFilter primFilter = new PrimFilter();
        primFilter.init(mockFilterConfig);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithNullConfig_OZdz1() throws ServletException {
        PrimFilter primFilter = new PrimFilter();
        primFilter.init(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDiagnosticsCheck_VZSo2() throws IOException, ServletException {
        PrimFilter filter = new PrimFilter();
        ServletRequest request = mock(ServletRequest.class);
        ServletResponse response = mock(ServletResponse.class);
        FilterChain chain = mock(FilterChain.class);
        filter.doFilter(request, response, chain);
    }
}