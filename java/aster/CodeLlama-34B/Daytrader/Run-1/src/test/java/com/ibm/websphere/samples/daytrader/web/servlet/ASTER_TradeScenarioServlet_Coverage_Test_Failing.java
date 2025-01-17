/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

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

public class Aster_TradeScenarioServlet_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_ZexH0() {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    String expected = "TradeScenarioServlet emulates a population of web users";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_YPmr0() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doGet(request, response);
    verify(servlet).performTask(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_vyyF1() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    doThrow(new ServletException()).when(servlet).performTask(request, response);
    servlet.doGet(request, response);
    verify(servlet).performTask(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_oJtk0() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
    verify(servlet).performTask(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostException_wiPt1() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    doThrow(new IOException()).when(servlet).performTask(request, response);
    servlet.doPost(request, response);
    verify(servlet).performTask(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask_newAction_kAgt1() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("n");
    servlet.performTask(req, resp);
    verify(resp).setContentType("text/html");
    verify(resp).getOutputStream();
    verify(resp).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask_nullUserID_PEIM2() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("a");
    servlet.performTask(req, resp);
    verify(resp).setContentType("text/html");
    verify(resp).getOutputStream();
    verify(resp).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPerformTask_nullAction_EHug0() throws ServletException, IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    servlet.performTask(req, resp);
    verify(resp).setContentType("text/html");
    verify(resp).getOutputStream();
  }
}