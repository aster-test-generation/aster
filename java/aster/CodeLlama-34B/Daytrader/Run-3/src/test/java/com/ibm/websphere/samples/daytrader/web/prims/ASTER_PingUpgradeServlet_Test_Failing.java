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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingUpgradeServlet_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithoutEchoUpgrade_dmvy1() throws ServletException, IOException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getHeader("Upgrade")).thenReturn(null);
    servlet.doPost(req, res);
    verify(res).getWriter().println("No upgrade: " + req.getHeader("Upgrade"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_Evwv0() throws ServletException, IOException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).setContentType("text/html");
    verify(res).getWriter().println("<html><body>Ping Upgrade Servlet</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithInvalidRequest_zQhL1() throws ServletException, IOException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("GET");
    servlet.doGet(req, res);
    verify(res).setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    verify(res).setContentType("text/html");
    verify(res).getWriter().println("<html><body>Method Not Allowed</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithInvalidResponse_qQfN2() throws ServletException, IOException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getWriter()).thenThrow(new IOException());
    servlet.doGet(req, res);
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).setContentType("text/html");
    verify(res).getWriter().println("<html><body>Internal Server Error</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithoutEchoUpgrade_dmvy1_fid1() throws ServletException, IOException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getHeader("Upgrade")).thenReturn(null);
    servlet.doPost(req, res);
    verify(res).getWriter().println("No upgrade: null");
  }
}