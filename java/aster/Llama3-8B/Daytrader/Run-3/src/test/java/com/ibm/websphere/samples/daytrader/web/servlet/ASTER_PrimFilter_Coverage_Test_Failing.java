/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PrimFilter_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testChainDoFilter_FKdW3_BhUt0() throws IOException, ServletException {
    PrimFilter primFilter = new PrimFilter();
    ServletRequest req = mock(ServletRequest.class);
    ServletResponse resp = mock(ServletResponse.class);
    FilterChain chain = mock(FilterChain.class);
    primFilter.doFilter(req, resp, chain);
    verify(chain).doFilter(req, resp);
}
}