/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeScenarioServlet_Test_Failing {
  TradeScenarioServlet tradeScenarioServlet;
  ServletConfig servletConfig;
  private HttpServletResponse httpServletResponse;
  private HttpServletRequest httpServletRequest;
  private static final String tasPathPrefix = "/app?action=";

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_rfYc0() throws Exception {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    servlet.doPost(request, response);
    verify(request, atLeastOnce()).getParameter(anyString());
    verify(response, atLeastOnce()).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_muTs0() {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    String actual = servlet.getServletInfo();
    String expected = "TradeScenarioServlet emulates a population of web users";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_HodT0_1() throws Exception {
    servletConfig = mock(ServletConfig.class);
    tradeScenarioServlet = new TradeScenarioServlet();
    tradeScenarioServlet.init(servletConfig);
    Enumeration<String> parameterNames = Collections.enumeration(Arrays.asList("param1", "param2"));
    when(servletConfig.getInitParameterNames()).thenReturn(parameterNames);
    when(servletConfig.getInitParameter("param1")).thenReturn("value1");
    when(servletConfig.getInitParameter("param2")).thenReturn("value2");
    tradeScenarioServlet.init(servletConfig);
    verify(servletConfig).getInitParameterNames();
    verify(servletConfig).getInitParameter("param1");
    verify(servletConfig).getInitParameter("param2");
    assertEquals("value1", tradeScenarioServlet.getInitParameter("param1"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_HodT0_2() throws Exception {
    servletConfig = mock(ServletConfig.class);
    tradeScenarioServlet = new TradeScenarioServlet();
    tradeScenarioServlet.init(servletConfig);
    Enumeration<String> parameterNames = Collections.enumeration(Arrays.asList("param1", "param2"));
    when(servletConfig.getInitParameterNames()).thenReturn(parameterNames);
    when(servletConfig.getInitParameter("param1")).thenReturn("value1");
    when(servletConfig.getInitParameter("param2")).thenReturn("value2");
    tradeScenarioServlet.init(servletConfig);
    verify(servletConfig).getInitParameterNames();
    verify(servletConfig).getInitParameter("param1");
    verify(servletConfig).getInitParameter("param2");
    assertEquals("value2", servletConfig.getInitParameter("param2"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_muTs0_fid2() {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    String expected = "TradeScenarioServlet emulates a population of web users";
    assertEquals(expected, servlet.getServletInfo());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_HodT0_1_fid3() throws Exception {
    servletConfig = mock(ServletConfig.class);
    tradeScenarioServlet = new TradeScenarioServlet();
    tradeScenarioServlet.init(servletConfig);
    Enumeration<String> parameterNames = Collections.enumeration(Arrays.asList("param1", "param2"));
    when(servletConfig.getInitParameterNames()).thenReturn(parameterNames);
    when(servletConfig.getInitParameter("param1")).thenReturn("value1");
    when(servletConfig.getInitParameter("param2")).thenReturn("value2");
    tradeScenarioServlet.init(servletConfig);
    verify(servletConfig).getInitParameterNames();
    verify(servletConfig).getInitParameter("param1");
    verify(servletConfig).getInitParameter("param2");
    assertEquals("value1", servletConfig.getInitParameter("param1"));
  }
}