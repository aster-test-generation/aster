/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

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

public class Aster_PingServlet2Session2EntityCollection_Coverage_Test_Failing {
  private ServletConfig config;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_Nvjr0() {
    PingServlet2Session2EntityCollection servlet = new PingServlet2Session2EntityCollection();
    String expected = "web primitive, tests Servlet to Session to Entity returning a collection of Entity EJBs";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_dBho0() throws ServletException, IOException {
    PingServlet2Session2EntityCollection servlet = new PingServlet2Session2EntityCollection();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(200);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithException_thcv1() throws ServletException, IOException {
    PingServlet2Session2EntityCollection servlet = new PingServlet2Session2EntityCollection();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    doThrow(new IOException()).when(req).getMethod();
    servlet.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(500);
  }
}