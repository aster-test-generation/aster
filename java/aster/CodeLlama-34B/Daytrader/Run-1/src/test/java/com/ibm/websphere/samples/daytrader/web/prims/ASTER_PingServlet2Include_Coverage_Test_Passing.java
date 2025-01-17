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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet2Include_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_XMYW0() throws ServletException, IOException {
    PingServlet2Include servlet = new PingServlet2Include();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
    verify(servlet).doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithException_obxF1() throws ServletException, IOException {
    PingServlet2Include servlet = new PingServlet2Include();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    doThrow(new ServletException()).when(servlet).doGet(request, response);
    servlet.doPost(request, response);
    verify(servlet).doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet1_GpUC0() throws ServletException, IOException {
    PingServlet2Include servlet = new PingServlet2Include();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet2_YXUq1() throws ServletException, IOException {
    PingServlet2Include servlet = new PingServlet2Include();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet3_JbsP2() throws ServletException, IOException {
    PingServlet2Include servlet = new PingServlet2Include();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).sendError(500, "PingServlet2Include.doGet(...): general exception");
  }
}