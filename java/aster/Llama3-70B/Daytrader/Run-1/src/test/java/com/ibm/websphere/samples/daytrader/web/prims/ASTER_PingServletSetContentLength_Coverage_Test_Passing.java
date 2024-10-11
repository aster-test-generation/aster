/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import com.ibm.websphere.samples.daytrader.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletSetContentLength_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_InitI_rEOY6_cDxX0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServlet pingServlet = new PingServlet();
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/html;charset=UTF-8");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_MhPs0_RvaL0() throws javax.servlet.ServletException, java.io.IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServlet pingServlet = new PingServlet();
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/plain");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_MhPs0_twHi1() throws javax.servlet.ServletException, java.io.IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServlet pingServlet = new PingServlet();
    pingServlet.doGet(req, res);
    verify(res).setStatus(200);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_LengthParamIsNotNull_CTWi4_ZVde0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("contentLength")).thenReturn("100");
    PingServletSetContentLength pingServlet = new PingServletSetContentLength();
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res, atLeastOnce()).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_LengthParamIsZero_pqMz13_mJGM0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("contentLength")).thenReturn("0");
    when(res.getOutputStream()).thenReturn(out);
    PingServletSetContentLength pingServlet = new PingServletSetContentLength();
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).setContentLength(0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SendError_sZHs11_YaiN0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("contentLength")).thenReturn("abc");
    PingServletSetContentLength pingServlet = new PingServletSetContentLength();
    try {
      pingServlet.doGet(req, res);
      fail("Expected Exception");
    } catch (Exception e) {
      verify(res, times(1)).sendError(500, "For input string: \"abc\"");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_LengthParamIsNegative_DKyi14_XHOI0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServlet pingServlet = new PingServlet();
    when(req.getParameter("contentLength")).thenReturn("-1");
    try {
      pingServlet.doGet(req, res);
      fail("Expected IOException");
    } catch (IOException e) {
      assertEquals("Invalid content length", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_CatchException_xatE10_YLiZ0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("contentLength")).thenReturn("abc");
    when(res.getOutputStream()).thenThrow(new IOException());
    PingServletSetContentLength pingServlet = new PingServletSetContentLength();
    try {
      pingServlet.doGet(req, res);
      fail("Expected Exception");
    } catch (IOException e) {
      // No need to verify log as it's not being used in the method under test
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_InitI_rEOY6_cDxX0_fid2() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServletSetContentLength pingServlet = new PingServletSetContentLength();
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_MhPs0_twHi1_fid2() throws javax.servlet.ServletException, java.io.IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServletSetContentLength pingServlet = new PingServletSetContentLength();
    pingServlet.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_LengthParamIsNotNull_CTWi4_ZVde0_fid2() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("contentLength")).thenReturn("100");
    when(res.getOutputStream()).thenReturn(out);
    PingServletSetContentLength pingServlet = new PingServletSetContentLength();
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_GetOutputStream_QGlH5_Rdpi0() throws Exception {
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(res.getOutputStream()).thenReturn(out);
    HttpServletRequest req = mock(HttpServletRequest.class);
    when(req.getParameter("contentLength")).thenReturn("100");
    PingServletSetContentLength pingServlet = new PingServletSetContentLength();
    pingServlet.doGet(req, res);
    verify(res, times(1)).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SendError_sZHs11_YaiN0_fid2() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("contentLength")).thenReturn("abc");
    when(res.getOutputStream()).thenReturn(out);
    PingServletSetContentLength pingServlet = new PingServletSetContentLength();
    try {
      pingServlet.doGet(req, res);
      fail("Expected Exception");
    } catch (Exception e) {
      verify(res, times(1)).sendError(500, e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_LengthParamIsNegative_DKyi14_XHOI0_fid2() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServletSetContentLength pingServlet = new PingServletSetContentLength();
    when(req.getParameter("contentLength")).thenReturn("-1");
    try {
      pingServlet.doGet((HttpServletRequest) req, (HttpServletResponse) res);
      fail("Expected Exception");
    } catch (NumberFormatException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_CatchException_xatE10_YLiZ0_fid2() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    Log log = mock(Log.class);
    PingServletSetContentLength pingServlet = new PingServletSetContentLength();
    when(req.getParameter("contentLength")).thenReturn("abc");
    when(res.getOutputStream()).thenReturn(out);
    try {
      pingServlet.doGet(req, res);
      fail("Expected Exception");
    } catch (Exception e) {
      verify(log).error(e, "PingServlet.doGet(...): general exception caught");
    }
  }
}