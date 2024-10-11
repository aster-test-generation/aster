/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.verify;

public class Aster_PingServletBeanValCDI_Coverage_Test_Failing {
  private ServletConfig config;
  private PingServletBeanValCDI servlet;
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_ntpS0() throws ServletException {
    servlet = new PingServletBeanValCDI();
    servlet.init(config);
    verify(config).getInitParameter("initTime");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_nEjZ0() {
    PingServletBeanValCDI servlet = new PingServletBeanValCDI();
    String expected = "Basic dynamic HTML generation through a servlet";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet1_BIgn0() throws ServletException, IOException {
    PingServletBeanValCDI pingServlet = new PingServletBeanValCDI();
    HttpServletRequest req = null;
    HttpServletResponse res = null;
    pingServlet.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet2_BVdf1() throws ServletException, IOException {
    PingServletBeanValCDI pingServlet = new PingServletBeanValCDI();
    HttpServletRequest req = null;
    HttpServletResponse res = null;
    ServletOutputStream out = res.getOutputStream();
    pingServlet.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet3_ryfK2() throws ServletException, IOException {
    PingServletBeanValCDI pingServlet = new PingServletBeanValCDI();
    HttpServletRequest req = null;
    HttpServletResponse res = null;
    int currentHitCount = 0;
    pingServlet.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_ntpS0_RKfc0() throws ServletException {
    PingServletBeanValCDI servlet = new PingServletBeanValCDI();
    servlet.init(config);
    verify(config).getInitParameter("initTime");
  }
}