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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet2JNDI_Coverage_Test_Failing {
  private PingServlet2JNDI servlet;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_WQjp0() {
    PingServlet2JNDI servlet = new PingServlet2JNDI();
    String expected = "Basic JNDI look up of a JDBC DataSource";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_HVeY0() throws ServletException, IOException {
    PingServlet2JNDI servlet = new PingServlet2JNDI();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(HttpServletResponse.SC_OK);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithException_MYbF1() throws ServletException, IOException {
    PingServlet2JNDI servlet = new PingServlet2JNDI();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenThrow(new IOException());
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_OAaq0() throws javax.servlet.ServletException {
    servlet = new PingServlet2JNDI();
  }
}