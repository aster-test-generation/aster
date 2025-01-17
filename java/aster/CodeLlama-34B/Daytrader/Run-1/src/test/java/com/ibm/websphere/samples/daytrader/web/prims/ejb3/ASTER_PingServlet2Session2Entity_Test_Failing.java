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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Session2Entity_Test_Failing {
  private static int hitCount;
  private static String initTime;
  private TradeServices tradeSLSBLocal;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WFhp0() throws ServletException, IOException {
    PingServlet2Session2Entity servlet = new PingServlet2Session2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).getWriter().print("<html><body>Hello, World!</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNameParameter_KNjg1() throws ServletException, IOException {
    PingServlet2Session2Entity servlet = new PingServlet2Session2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("name")).thenReturn("John");
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).getWriter().print("<html><body>Hello, John!</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidNameParameter_Xfth2() throws ServletException, IOException {
    PingServlet2Session2Entity servlet = new PingServlet2Session2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("name")).thenReturn("");
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getWriter().print("<html><body>Invalid name parameter</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithNullNameParameter_iFnf3() throws ServletException, IOException {
    PingServlet2Session2Entity servlet = new PingServlet2Session2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("name")).thenReturn(null);
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(res).setContentType("text/html");
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getWriter().print("<html><body>Invalid name parameter</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_rkjh0() {
    PingServlet2Session2Entity servlet = new PingServlet2Session2Entity();
    String expected = "web primitive, tests Servlet to Session to Entity EJB path";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_vwIF1() {
    PingServlet2Session2Entity servlet = new PingServlet2Session2Entity();
    String expected = null;
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithEmptyString_iyDb2() {
    PingServlet2Session2Entity servlet = new PingServlet2Session2Entity();
    String expected = "";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_vwIF1_fid1() {
    PingServlet2Session2Entity servlet = new PingServlet2Session2Entity();
    String expected = "PingServlet2Session2Entity";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }
}