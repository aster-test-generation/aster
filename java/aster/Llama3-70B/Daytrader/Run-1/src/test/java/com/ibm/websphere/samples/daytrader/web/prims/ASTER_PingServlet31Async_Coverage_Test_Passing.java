/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet31Async_Coverage_Test_Passing {
  private HttpServletResponse response;
  private PingServlet31Async pingServlet31Async;
  private ServletConfig servletConfig;
  private PingServlet31Async servlet;
  private HttpServletResponse res;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_StartAsync_hCUu2_EkfZ0() throws Exception {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    AsyncContext asyncContext = mock(AsyncContext.class);
    when(request.startAsync(request, response)).thenReturn(asyncContext);
    PingServlet31Async pingServlet31Async = new PingServlet31Async();
    pingServlet31Async.doGet(request, response);
    verify(request, times(1)).startAsync(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_CallsDoPost_WSkq1_vIlf0_fid1() throws Exception {
  }
}