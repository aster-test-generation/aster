/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet2ServletRcv_Coverage_Test_Failing {
  private PingServlet2ServletRcv servlet;
  private HttpServletRequest request;
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_ioZX0() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req).getParameter("message");
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).getWriter().println("Pong");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithException_qdaa1() throws ServletException, IOException {
    PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("message")).thenThrow(new RuntimeException());
    servlet.doPost(req, res);
    verify(res).sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_Shvm0() throws javax.servlet.ServletException, java.io.IOException {
    servlet = new PingServlet2ServletRcv();
    request = new MockHttpServletRequest();
    response = new MockHttpServletResponse();
  }
}