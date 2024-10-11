/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.io.IOException;
import java.time.LocalDateTime;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletBeanValSimple1_Test_Failing {
  private static LocalDateTime initTime;
  private static int hitCount = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_OIUA0() throws ServletException, IOException {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter().println("<html><body>PingServletBeanValSimple1</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidRequest_arwK1() throws ServletException, IOException {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("POST");
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).setContentType("text/html");
    verify(res).getWriter().println("<html><body>Invalid request</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidResponse_ZYaP2() throws ServletException, IOException {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getWriter()).thenThrow(new IOException());
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).setContentType("text/html");
    verify(res).getWriter().println("<html><body>Error</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_uhja0() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    String expected = "Basic dynamic HTML generation through a servlet";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_XvWz1() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    String expected = null;
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithEmptyString_WeVX2() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    String expected = "";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithRandomString_iPgN3() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    String expected = "Random string";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidString_BKOq4() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    String expected = "Invalid string";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNullServlet_OTtf5() {
    PingServletBeanValSimple1 servlet = null;
    String expected = null;
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithInvalidServlet_NSbt6() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    String expected = "Invalid servlet";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitWithNullServletContext_iTQe5_FwWk0() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    try {
      servlet.init(null);
      assertNull(servlet.getServletContext());
    } catch (ServletException e) {
      fail("ServletException thrown: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithInvalidRequest_arwK1_fid2() throws ServletException, IOException {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("POST");
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    verify(res).setContentType("text/html");
    verify(res).getWriter().println("<html><body>Invalid request</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNull_XvWz1_fid2() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    String expected = "Ping Servlet Bean Validation Simple";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfoWithNullServlet_OTtf5_fid2() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    String expected = "PingServletBeanValSimple1";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }
}