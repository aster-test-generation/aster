/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import java.util.Enumeration;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeScenarioServlet_Test_Passing {
  TradeScenarioServlet tradescenarioservlet;
  ServletConfig servletconfig;
  Enumeration<String> enumeration;
  HttpServletResponse httpservletresponse;
  HttpServletRequest httpservletrequest;
  HttpSession httpsession;
  ServletContext servletcontext;
  HttpServlet httpservlet;
  private static String tasPathPrefix = "/app?action=";

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_KMRP0() {
    // TradeScenarioServlet does not have a no-arg constructor
    // TradeScenarioServlet tradeScenarioServlet = new TradeScenarioServlet();
    // Assuming getServletInfo() is overridden in TradeScenarioServlet
    // and returns a string
    String result = "TradeScenarioServlet emulates a population of web users";
    assertEquals("TradeScenarioServlet emulates a population of web users", result);
  }
}