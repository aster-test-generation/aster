/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PrimFilter_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoFilterWithNullFilterConfig_inms0() throws IOException, ServletException {
    PrimFilter filter = new PrimFilter();
    ServletRequest req = mock(ServletRequest.class);
    ServletResponse resp = mock(ServletResponse.class);
    FilterChain chain = mock(FilterChain.class);
    filter.doFilter(req, resp, chain);
    verify(chain, never()).doFilter(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoFilterWithNonNullFilterConfig_kRps1() throws IOException, ServletException {
    PrimFilter filter = new PrimFilter();
    ServletRequest req = mock(ServletRequest.class);
    ServletResponse resp = mock(ServletResponse.class);
    FilterChain chain = mock(FilterChain.class);
    filter.doFilter(req, resp, chain);
    verify(chain, times(1)).doFilter(req, resp);
  }
}