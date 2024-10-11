/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Aster_TradeScenarioServlet_Coverage_Test_Failing {
  private TradeConfig tradeConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_tDdQ0() {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    String expected = "TradeScenarioServlet emulates a population of web users";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_cnxN0() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doGet(request, response);
    verify(servlet).performTask(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_nxUq0() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask1_vpuX0() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    servlet.performTask(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask2_nTIM1() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    req.setAttribute("action", "n");
    servlet.performTask(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask3_yZbs2() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    req.setAttribute("action", "l");
    servlet.performTask(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask4_IVeO3() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    req.setAttribute("action", "u");
    servlet.performTask(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask5_ITAa4() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    req.setAttribute("action", "h");
    servlet.performTask(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask6_ZCCd5() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    req.setAttribute("action", "p");
    servlet.performTask(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask7_EQyt6() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    req.setAttribute("action", "r");
    servlet.performTask(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask8_akoF7() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    req.setAttribute("action", "s");
    servlet.performTask(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask9_LCnH8() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    req.setAttribute("action", "b");
    servlet.performTask(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask10_XZdd9() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    req.setAttribute("action", "o");
    servlet.performTask(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask11_beFb10() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = null;
    HttpServletResponse resp = null;
    req.setAttribute("action", "q");
    servlet.performTask(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask12_GgkT11() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
  }

  @Test
  public void testPerformTask_CLXC0() throws ServletException, IOException {
    TradeScenarioServlet servlet = mock(TradeScenarioServlet.class);
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    ServletConfig servletConfig = mock(ServletConfig.class);
    servlet.init(servletConfig);
    servlet.performTask(request, response);
  }

  @Test
  public void testPerformTask_CLXC0_fid1() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    ServletConfig servletConfig = mock(ServletConfig.class);
    servlet.init(servletConfig);
    servlet.performTask(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask_FgkB1() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.performTask(request, response);
  }
}