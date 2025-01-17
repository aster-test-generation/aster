/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_PingServletBeanValSimple1_Coverage_Test_Failing {
  private ServletConfig config;
  private SimpleBean1 simpleBean1;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_qUbi0() {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    String expected = "Basic dynamic HTML generation through a servlet";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_EfCv0() throws ServletException, IOException {
    PingServletBeanValSimple1 pingServlet = new PingServletBeanValSimple1();
    HttpServletRequest req = null;
    HttpServletResponse res = null;
    pingServlet.doPost(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_noException_lGpC2_frvb0() throws ServletException {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    servlet.init();
    assertTrue(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_noException_lGpC2_frvb0_fid1() throws ServletException {
    PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
    servlet.init();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithValidRequestAndResponse_YSSh1() throws ServletException, IOException {
    PingServletBeanValSimple1 pingServlet = new PingServletBeanValSimple1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet.doPost(req, res);
  }
}