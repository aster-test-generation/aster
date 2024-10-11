/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet2Session2CMROne2Many_Coverage_Test_Failing {
  private OrderDataBean orderDataBean;
  private ServletConfig config;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_jaqq0() {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    String expected = "web primitive, tests Servlet to Entity EJB path";
    String actual = servlet.getServletInfo();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_wezq0() throws ServletException, IOException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req, times(1)).getMethod();
    verify(res, times(1)).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithGetMethod_zgkB1() throws ServletException, IOException {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("GET");
    servlet.doPost(req, res);
    verify(req, times(1)).getMethod();
    verify(res, times(1)).getWriter();
  }
}