/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeAppServlet_Test_Failing {
  TradeAppServlet tradeappservlet;
  HttpServlet httpservlet;
  ServletConfig servletconfig;
  Enumeration<String> enumeration;
  HttpServletResponse httpservletresponse;
  HttpServletRequest httpservletrequest;
  HttpSession httpsession;
  ServletContext servletcontext;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    servletconfig = mock(ServletConfig.class);
    httpsession = mock(HttpSession.class);
    tradeappservlet = new TradeAppServlet();
    when(httpservletrequest.getSession()).thenReturn(httpsession);
    when(tradeappservlet.getServletConfig()).thenReturn(servletconfig);
    tradeappservlet.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse, times(1)).setStatus(HttpServletResponse.SC_OK);
    verify(httpservletrequest, times(1)).getSession();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoPost() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    servletconfig = mock(ServletConfig.class);
    httpsession = mock(HttpSession.class);
    httpservlet = mock(HttpServlet.class);
    tradeappservlet = new TradeAppServlet();
    when(httpservletrequest.getSession()).thenReturn(httpsession);
    when(tradeappservlet.getServletConfig()).thenReturn(servletconfig);
    tradeappservlet.doPost(httpservletrequest, httpservletresponse);
    verify(httpservletresponse).setStatus(HttpServletResponse.SC_OK);
    verify(httpservletrequest, times(1)).getSession();
    verify(tradeappservlet, times(1)).getServletConfig();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_wSob0() throws ServletException, IOException {
    TradeAppServlet tradeAppServlet = new TradeAppServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    tradeAppServlet.doPost(request, response);
    verify(request, times(1)).getMethod();
    verify(response, times(1)).getOutputStream();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_TIXB0() {
    TradeAppServlet tradeAppServlet = new TradeAppServlet();
    String result = tradeAppServlet.getServletInfo();
    assertEquals("TradeAppServlet provides the standard web interface to Trade", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testperformTask() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    httpservletrequest = mock(HttpServletRequest.class);
    servletconfig = mock(ServletConfig.class);
    servletcontext = mock(ServletContext.class);
    httpsession = mock(HttpSession.class);
    httpservlet = mock(HttpServlet.class);
    tradeappservlet = new TradeAppServlet();
    when(httpservletrequest.getSession()).thenReturn(httpsession);
    when(tradeappservlet.getServletConfig()).thenReturn(servletconfig);
    when(servletconfig.getServletContext()).thenReturn(servletcontext);
    // Test case 1: action is null
    tradeappservlet.performTask(httpservletrequest, httpservletresponse);
    verify(httpservletresponse).setContentType("text/html");
    verify(servletcontext).getRequestDispatcher(anyString());
    // Test case 2: action is "login"
    when(httpservletrequest.getParameter("action")).thenReturn("login");
    when(httpservletrequest.getParameter("uid")).thenReturn("user1");
    when(httpservletrequest.getParameter("passwd")).thenReturn("password");
    tradeappservlet.performTask(httpservletrequest, httpservletresponse);
    verify(servletcontext).getRequestDispatcher(anyString());
    // Test case 3: action is "register"
    when(httpservletrequest.getParameter("action")).thenReturn("register");
    when(httpservletrequest.getParameter("user id")).thenReturn("user1");
    when(httpservletrequest.getParameter("passwd")).thenReturn("password");
    when(httpservletrequest.getParameter("confirm passwd")).thenReturn("password");
    when(httpservletrequest.getParameter("Full Name")).thenReturn("Full Name");
    when(httpservletrequest.getParameter("Credit Card Number")).thenReturn("1234-5678-9012-3456");
    when(httpservletrequest.getParameter("money")).thenReturn("100.00");
    when(httpservletrequest.getParameter("email")).thenReturn("user@example.com");
    when(httpservletrequest.getParameter("snail mail")).thenReturn("123 Main St");
    tradeappservlet.performTask(httpservletrequest, httpservletresponse);
    verify(servletcontext).getRequestDispatcher(anyString());
    // Test case 4: action is "quotes"
    when(httpservletrequest.getParameter("action")).thenReturn("quotes");
    when(httpservletrequest.getParameter("symbols")).thenReturn("AAPL,GOOG");
    tradeappservlet.performTask(httpservletrequest, httpservletresponse);
    verify(servletcontext).getRequestDispatcher(anyString());
    // Test case 5: action is "buy"
    when(httpservletrequest.getParameter("action")).thenReturn("buy");
    when(httpservletrequest.getParameter("symbol")).thenReturn("AAPL");
    when(httpservletrequest.getParameter("quantity")).thenReturn("10");
    tradeappservlet.performTask(httpservletrequest, httpservletresponse);
    verify(servletcontext).getRequestDispatcher(anyString());
    // Test case 6: action is "sell"
    when(httpservletrequest.getParameter("action")).thenReturn("sell");
    when(httpservletrequest.getParameter("holdingID")).thenReturn("1");
    tradeappservlet.performTask(httpservletrequest, httpservletresponse);
    verify(servletcontext).getRequestDispatcher(anyString());
    // Test case 7: action is "portfolio"
    when(httpservletrequest.getParameter("action")).thenReturn("portfolio");
    tradeappservlet.performTask(httpservletrequest, httpservletresponse);
    verify(servletcontext).getRequestDispatcher(anyString());
    // Test case 8: action is "logout"
    when(httpservletrequest.getParameter("action")).thenReturn("logout");
    tradeappservlet.performTask(httpservletrequest, httpservletresponse);
    verify(servletcontext).getRequestDispatcher(anyString());
    // Test case 9: action is "home"
    when(httpservletrequest.getParameter("action")).thenReturn("home");
    tradeappservlet.performTask(httpservletrequest, httpservletresponse);
    verify(servletcontext).getRequestDispatcher(anyString());
    // Test case 10: action is "account"
    when(httpservletrequest.getParameter("action")).thenReturn("account");
    tradeappservlet.performTask(httpservletrequest, httpservletresponse);
    verify(servletcontext).getRequestDispatcher(anyString());
    // Test case 11: action is "update_profile"
    when(httpservletrequest.getParameter("action")).thenReturn("update_profile");
    when(httpservletrequest.getParameter("password")).thenReturn("newpassword");
    when(httpservletrequest.getParameter("cpassword")).thenReturn("newpassword");
    when(httpservletrequest.getParameter("fullname")).thenReturn("New Full Name");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_wSob0_fid2() throws ServletException, IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getSession()).thenReturn(mock(HttpSession.class));
    when(request.getParameter("action")).thenReturn("login");
    when(request.getParameter("uid")).thenReturn("uid");
    when(request.getParameter("passwd")).thenReturn("passwd");
    TradeAppServlet tradeAppServlet = new TradeAppServlet();
    tradeAppServlet.doPost(request, response);
    verify(request, times(1)).getMethod();
    verify(response, times(1)).setContentType("text/html");
  }
}