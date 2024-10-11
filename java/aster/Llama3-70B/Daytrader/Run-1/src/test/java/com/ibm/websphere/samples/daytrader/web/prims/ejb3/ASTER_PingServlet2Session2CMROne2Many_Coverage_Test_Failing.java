/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.web.prims.PingServlet;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet2Session2CMROne2Many_Coverage_Test_Failing {
  private PingServlet2Session2CMROne2Many servlet;
  private ServletConfig config;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_ctNK0() {
    PingServlet2Session2CMROne2Many pingServlet = new PingServlet2Session2CMROne2Many();
    String expected = "web primitive, tests Servlet to Entity EJB path";
    String actual = pingServlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_vkrt0() throws ServletException, IOException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(servlet).doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_IOException_muhl1() throws ServletException, IOException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    doThrow(new IOException()).when(servlet).doGet(req, res);
    servlet.doPost(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet1_xVQo0() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet2_XTHm1() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet3_NCsI2_KsQH0() throws IOException, ServletException {
    PingServlet servlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setStatus(200);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet7_UgRH6_NzDO0() throws IOException, ServletException {
    PingServlet servlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setContentType("text/html;charset=UTF-8");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_hiqx0() throws Exception {
    servlet = new PingServlet2Session2CMROne2Many();
    config = mock(ServletConfig.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_SuperInitCalled_Ixbs1() throws ServletException {
    servlet.init(config);
    verify(config).getServletContext(); // assuming super.init(config) calls getServletContext()
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_NoExceptionThrown_xHyf4() throws ServletException {
    servlet.init(config);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet6_OJPg5_tvQS0() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res.getWriter()).println(anyString());
  }
}