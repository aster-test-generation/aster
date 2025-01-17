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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Session_Test_Failing {
  private TradeServices tradeSLSBLocal;
  private static String initTime;
  private static int hitCount;
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_hOAR0() throws ServletException, IOException {
    PingServlet2Session servlet = new PingServlet2Session();
    servlet.doPost(request, response);
    assertEquals(HttpServletResponse.SC_OK, response.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidRequest_XQQj1() throws ServletException, IOException {
    when(request.getMethod()).thenReturn("POST");
    when(request.getParameter("username")).thenReturn("");
    when(request.getParameter("password")).thenReturn("");
    PingServlet2Session servlet = new PingServlet2Session();
    servlet.doPost(request, response);
    assertEquals(HttpServletResponse.SC_BAD_REQUEST, response.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithValidRequest_PHMy2() throws ServletException, IOException {
    when(request.getMethod()).thenReturn("POST");
    when(request.getParameter("username")).thenReturn("user");
    when(request.getParameter("password")).thenReturn("password");
    PingServlet2Session servlet = new PingServlet2Session();
    servlet.doPost(request, response);
    assertEquals(HttpServletResponse.SC_OK, response.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_Meaa0() {
    PingServlet2Session servlet = new PingServlet2Session();
    String expected = "web primitive, configured with trade runtime configs, tests Servlet to Session EJB path";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_xhrd1() {
    PingServlet2Session servlet = new PingServlet2Session();
    String expected = null;
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithEmptyString_AAmJ2() {
    PingServlet2Session servlet = new PingServlet2Session();
    String expected = "";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidInput_rNOU4() {
    PingServlet2Session servlet = new PingServlet2Session();
    String expected = "invalid input";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidSession_DWbZ9() {
    PingServlet2Session servlet = new PingServlet2Session();
    String expected = "invalid session";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidServlet_ineZ14() {
    PingServlet2Session servlet = new PingServlet2Session();
    String expected = "invalid servlet";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_xhrd1_fid2() {
    PingServlet2Session servlet = new PingServlet2Session();
    String expected = "PingServlet2Session";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }
}