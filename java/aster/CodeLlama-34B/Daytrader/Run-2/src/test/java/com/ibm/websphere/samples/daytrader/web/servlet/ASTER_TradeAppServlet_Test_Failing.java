/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Assertions;
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
  public void testPerformTaskWithNullAction_gnSM0() {
    TradeAppServlet servlet = new TradeAppServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    verify(resp).setContentType("text/html");
  }

  public void testPerformTaskWithLoginAction_gXJd1() {
    TradeAppServlet servlet = new TradeAppServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("login");
    verify(resp).setContentType("text/html");
  }

  public void testPerformTaskWithRegisterAction_klwh2() {
    TradeAppServlet servlet = new TradeAppServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("register");
    verify(resp).setContentType("text/html");
  }

  public void testPerformTaskWithQuotesAction_LiHt3() {
    TradeAppServlet servlet = new TradeAppServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("quotes");
    verify(resp).setContentType("text/html");
  }

  public void testPerformTaskWithBuyAction_nohu4() {
    TradeAppServlet servlet = new TradeAppServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("buy");
    verify(resp).setContentType("text/html");
  }

  public void testPerformTaskWithSellAction_iImb5() {
    TradeAppServlet servlet = new TradeAppServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("sell");
    verify(resp).setContentType("text/html");
  }

  public void testPerformTaskWithPortfolioAction_bmpd6() {
    TradeAppServlet servlet = new TradeAppServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("portfolio");
    verify(resp).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_DQLr0() throws ServletException, IOException {
    TradeAppServlet servlet = new TradeAppServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doGet(request, response);
    verify(request).getParameter("task");
    verify(response).setContentType("text/html");
    verify(response).setStatus(HttpServletResponse.SC_OK);
    verify(response).getWriter().print("<html><body>Task completed successfully</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithInvalidTask_GnhZ1() throws ServletException, IOException {
    TradeAppServlet servlet = new TradeAppServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getParameter("task")).thenReturn("invalid_task");
    servlet.doGet(request, response);
    verify(request).getParameter("task");
    verify(response).setContentType("text/html");
    verify(response).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(response).getWriter().print("<html><body>Invalid task</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetWithException_zbEP2() throws ServletException, IOException {
    TradeAppServlet servlet = new TradeAppServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getParameter("task")).thenThrow(new ServletException("Test exception"));
    servlet.doGet(request, response);
    verify(request).getParameter("task");
    verify(response).setContentType("text/html");
    verify(response).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(response).getWriter().print("<html><body>Error occurred while processing the request</body></html>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_dwdq0() throws ServletException, IOException {
    TradeAppServlet servlet = new TradeAppServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
    verify(response).setStatus(HttpServletResponse.SC_OK);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_Ache0() {
    TradeAppServlet servlet = new TradeAppServlet();
    String expected = "TradeAppServlet provides the standard web interface to Trade";
    String actual = servlet.getServletInfo();
    Assertions.assertEquals(expected, actual);
  }
}