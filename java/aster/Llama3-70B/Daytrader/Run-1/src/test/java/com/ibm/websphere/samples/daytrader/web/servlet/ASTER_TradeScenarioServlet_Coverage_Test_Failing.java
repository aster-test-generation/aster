/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_TradeScenarioServlet_Coverage_Test_Failing {
  private TradeConfig tradeConfig;
  private HttpServletResponse response;
  private PrintWriter out;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_guCV0() {
    try {
      TradeScenarioServlet tradeScenarioServlet = (TradeScenarioServlet) Class.forName("com.ibm.websphere.samples.daytrader.web.servlet.TradeScenarioServlet").getDeclaredConstructor().newInstance();
      String actual = tradeScenarioServlet.getServletInfo();
      assertNotNull(actual);
    } catch (Exception e) {
      fail("Exception occurred: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask3_aNum2() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("n");
    servlet.performTask(req, resp);
    verify(resp).getOutputStream();
  }

  @Test
  public void testPerformTask103_XnrQ3_NHrP0() throws ServletException, IOException {
    // Assuming TradeScenarioServlet is in the package com.ibm.websphere.samples.daytrader.web.servlet
    com.ibm.websphere.samples.daytrader.web.servlet.TradeScenarioServlet servlet = new com.ibm.websphere.samples.daytrader.web.servlet.TradeScenarioServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getAttribute("holdingDataBeans")).thenReturn(Collections.emptyList());
    servlet.performTask(req, resp);
    assertNull(req.getAttribute("holdingDataBeans"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_NullServletConfig_DagF8_Irga0_1() throws javax.servlet.ServletException {
    // Assuming TradeScenarioServlet is in the package com.ibm.websphere.samples.daytrader.web.servlet
    com.ibm.websphere.samples.daytrader.web.servlet.TradeScenarioServlet tradeScenarioServlet = new com.ibm.websphere.samples.daytrader.web.servlet.TradeScenarioServlet();
    NullPointerException exception = Assertions.assertThrows(NullPointerException.class,
        () -> {
          ServletConfig servletConfig = null;
          tradeScenarioServlet.init(servletConfig);
        });
    Assertions.assertNotNull(exception);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask1_yxbA0_Ayvy0() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_guCV0_fid1() {
    TradeScenarioServlet tradeScenarioServlet = new TradeScenarioServlet();
    String expected = "TradeScenarioServlet emulates a population of web users";
    String actual = tradeScenarioServlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  public void testPerformTask103_XnrQ3_NHrP0_fid1() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getAttribute("holdingDataBeans")).thenReturn(Collections.emptyList());
    servlet.performTask(req, resp);
    assertEquals(0, ((Collection<?>) req.getAttribute("holdingDataBeans")).size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_NullServletConfig_DagF8_Irga0_1_fid1() throws javax.servlet.ServletException {
    TradeScenarioServlet tradeScenarioServlet = new TradeScenarioServlet();
    NullPointerException exception = Assertions.assertThrows(NullPointerException.class,
        () -> {
          ServletConfig servletConfig = null;
          tradeScenarioServlet.init(servletConfig);
        });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask1_yxbA0_Ayvy0_fid1() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    servlet.performTask(req, resp);
    verify(resp).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_GetInitParameterCalled_YNGs5_sADr0() throws ServletException {
    TradeScenarioServlet tradeScenarioServlet = new TradeScenarioServlet();
    ServletConfig servletConfig = mock(ServletConfig.class);
    when(servletConfig.getInitParameterNames()).thenReturn(Collections.enumeration(Collections.singleton("parm")));
    tradeScenarioServlet.init(servletConfig);
    verify(servletConfig).getInitParameter("parm");
  }
}