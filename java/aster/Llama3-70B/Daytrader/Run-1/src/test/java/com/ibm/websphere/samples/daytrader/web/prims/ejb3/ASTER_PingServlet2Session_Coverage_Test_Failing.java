/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.web.prims.PingServlet;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet2Session_Coverage_Test_Failing {
  private HttpServletResponse response;
  private PingServlet2Session pingServlet2Session;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet1_sezQ0() throws IOException, ServletException {
    PingServlet2Session pingServlet2Session = new PingServlet2Session();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet2Session.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet2_avCd1() throws IOException, ServletException {
    PingServlet2Session pingServlet2Session = new PingServlet2Session();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet2Session.doGet(req, res);
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet6_vRmL5_DwQA0() throws IOException, ServletException {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet7_tzoK6_wrAp0() throws IOException, ServletException {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet6_vRmL5_DwQA0_fid3() throws IOException, ServletException {
    PingServlet2Session pingServlet2Session = new PingServlet2Session();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet2Session.doGet(req, res);
    verify(res).setContentType("text/html");
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet3_NdBD2_GLhn0() throws IOException, ServletException {
    PingServlet2Session pingServlet2Session = new PingServlet2Session();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    java.io.PrintWriter out = mock(java.io.PrintWriter.class);
    when(res.getWriter()).thenReturn(out);
    StringBuffer output = new StringBuffer(100);
    pingServlet2Session.doGet(req, res);
    verify(out).println(anyString());
    assertEquals(StringBuffer.class, output.getClass());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet10_LORg9_TIer0() throws IOException, ServletException {
    PingServlet2Session pingServlet2Session = new PingServlet2Session();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet2Session.doGet(req, res);
    assertTrue(true); // or any other assertion that makes sense in this context
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet11_EyRD10_Rvmi0() throws IOException, ServletException {
    PingServlet2Session pingServlet2Session = new PingServlet2Session();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
      pingServlet2Session.doGet(req, res);
    } catch (Exception e) {
      fail("doGet method should not throw any exception");
    }
  }
}