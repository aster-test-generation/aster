/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet2PDF_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_sPbd0() throws Exception {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServlet2PDF servlet = new PingServlet2PDF();
    PingServlet2PDF spyServlet = spy(servlet);
    spyServlet.doPost(request, response);
    verify(spyServlet).doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCompletesWithoutException_ZAaO1() throws javax.servlet.ServletException, java.io.IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServlet2PDF servlet = new PingServlet2PDF();
    try {
      servlet.doPost(request, response);
    } catch (Exception e) {
      fail("doPost threw an exception: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_EnsureProperResourceHandling_SXUF3() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream servletOutputStream = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(servletOutputStream);
    PingServlet2PDF servlet = new PingServlet2PDF();
    servlet.doGet(req, res);
    verify(servletOutputStream).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SetAttributes_BRgr4() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream servletOutputStream = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(servletOutputStream);
    PingServlet2PDF servlet = new PingServlet2PDF();
    servlet.doGet(req, res);
    verify(req).setAttribute(eq("ab"), any());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_HitCountIncrement_VZWk5() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream servletOutputStream = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(servletOutputStream);
    PingServlet2PDF servlet = new PingServlet2PDF();
    servlet.doGet(req, res);
    servlet.doGet(req, res);
  }
}