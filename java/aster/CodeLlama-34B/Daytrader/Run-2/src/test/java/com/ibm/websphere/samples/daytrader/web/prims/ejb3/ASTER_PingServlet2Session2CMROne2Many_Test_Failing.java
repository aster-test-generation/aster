/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Session2CMROne2Many_Test_Failing {
  private TradeServices tradeSLSBLocal;
  private static int hitCount;
  private static String initTime;
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_LSaX0() {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    String expected = "web primitive, tests Servlet to Entity EJB path";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_UynP1() {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    String expected = null;
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ovOt0() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    assertEquals("text/html", res.getContentType());
    assertEquals(200, res.getStatus());
    assertTrue(res.getWriter().toString().contains("PingServlet2Session2CMROne2Many"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetException_TXgc1() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("userID")).thenThrow(new ServletException("Test exception"));
    servlet.doGet(req, res);
    assertEquals(500, res.getStatus());
    assertTrue(res.getWriter().toString().contains("PingServlet2Session2CMROne2Many.doGet(...): error"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetNullUserID_Avkd2() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("userID")).thenReturn(null);
    servlet.doGet(req, res);
    assertEquals(400, res.getStatus());
    assertTrue(res.getWriter().toString().contains("Invalid userID"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ovOt0_1() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    assertEquals("text/html", res.getContentType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ovOt0_2() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    assertEquals(200, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ovOt0_3() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    assertTrue(res.getWriter().toString().contains("PingServlet2Session2CMROne2Many"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetException_TXgc1_1() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("userID")).thenThrow(new ServletException("Test exception"));
    servlet.doGet(req, res);
    assertEquals(500, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetException_TXgc1_2() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("userID")).thenThrow(new ServletException("Test exception"));
    servlet.doGet(req, res);
    assertTrue(res.getWriter().toString().contains("PingServlet2Session2CMROne2Many.doGet(...): error"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetNullUserID_Avkd2_1() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("userID")).thenReturn(null);
    servlet.doGet(req, res);
    assertEquals(400, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetNullUserID_Avkd2_2() throws IOException, ServletException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("userID")).thenReturn(null);
    servlet.doGet(req, res);
    assertTrue(res.getWriter().toString().contains("Invalid userID"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_UynP1_fid2() {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    String expected = "Servlet2Session2CMROne20ne";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }
}