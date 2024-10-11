/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet31AsyncRead_Coverage_Test_Failing {
  private ServletInputStream inputStream;
  private PingServlet31AsyncRead pingServlet;
  private ServletConfig mockConfig;
  private HttpServletResponse res;
  private AsyncContext asyncContext;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_CIEG0() {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    String result = servlet.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_CallsDoPost_yaNT0() throws ServletException, IOException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_HandlesIOException_GvVZ1() throws ServletException, IOException {
    PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    doThrow(new IOException("Test IOException")).when(res).getWriter();
    try {
      servlet.doGet(req, res);
    } catch (IOException e) {
      assertEquals("Test IOException", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetContentType_qLLA1_DfqX0() throws ServletException, IOException {
    PingServlet31AsyncRead pingServlet = new PingServlet31AsyncRead();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet.doGet(req, res);
    verify(res).setContentType("application/json");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitCallsSuperInit_wXNB1() throws ServletException {
    pingServlet.init(mockConfig);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetContentType_qLLA1_DfqX0_fid3() throws ServletException, IOException {
    PingServlet31AsyncRead pingServlet = new PingServlet31AsyncRead();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/html");
  }
}