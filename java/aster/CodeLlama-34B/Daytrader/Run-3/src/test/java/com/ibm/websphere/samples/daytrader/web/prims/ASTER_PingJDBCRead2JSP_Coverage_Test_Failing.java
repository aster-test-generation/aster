/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

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

public class Aster_PingJDBCRead2JSP_Coverage_Test_Failing {
  private ServletConfig config;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_fVjE0() throws ServletException, IOException {
    PingJDBCRead2JSP pingJDBCRead2JSP = new PingJDBCRead2JSP();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingJDBCRead2JSP.doPost(req, res);
    verify(pingJDBCRead2JSP).doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithException_nxWx1() throws ServletException, IOException {
    PingJDBCRead2JSP pingJDBCRead2JSP = new PingJDBCRead2JSP();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    doThrow(new ServletException()).when(pingJDBCRead2JSP).doGet(req, res);
    pingJDBCRead2JSP.doPost(req, res);
    verify(pingJDBCRead2JSP).doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_OBxZ0() {
    PingJDBCRead2JSP pingJDBCRead2JSP = new PingJDBCRead2JSP();
    String servletInfo = pingJDBCRead2JSP.getServletInfo();
    assertEquals("Basic JDBC Read using a prepared statment forwarded to a JSP, makes use of TradeJDBC class", servletInfo);
  }
}