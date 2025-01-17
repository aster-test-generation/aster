/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

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

public class Aster_PingServlet2Include_Coverage_Test_Failing {
  private PingServlet2Include pingServlet;
  private ServletConfig mockConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetContentType_bymN1_wicL0() throws Exception {
    PingServlet2Include pingServlet = new PingServlet2Include();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getContentType()).thenReturn("text/html");
    pingServlet.doGet(req, res);
    verify(res).setContentType(eq("text/html"));
    assertEquals("text/html", res.getContentType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetContentType_bymN1_wicL0_fid2() throws Exception {
    PingServlet2Include pingServlet = new PingServlet2Include();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet.doGet(req, res);
    verify(res).setContentType(eq("text/html"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_zNAl0() throws javax.servlet.ServletException {
    pingServlet = new PingServlet2Include();
    mockConfig = mock(ServletConfig.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSuperInitCalled_EZlr1() throws ServletException {
    pingServlet.init(mockConfig);
  }
}