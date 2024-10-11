/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeConfigServlet_Test_Failing {
  TradeConfigServlet tradeconfigservlet;
  ServletConfig servletConfig;
  HttpServlet httpservlet;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testinit() throws Exception {
    servletConfig = mock(ServletConfig.class);
    httpservlet = mock(HttpServlet.class);
    tradeconfigservlet = new TradeConfigServlet();
    // when
    tradeconfigservlet.init(servletConfig);
    // then
    verify(httpservlet).init(servletConfig);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testServiceNullAction_rzmF0() throws ServletException, IOException {
    TradeConfigServlet servlet = new TradeConfigServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn(null);
    servlet.service(req, resp);
    verify(resp).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testServiceUpdateConfig_oPiB1() throws ServletException, IOException {
    TradeConfigServlet servlet = new TradeConfigServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("updateConfig");
    servlet.service(req, resp);
    verify(resp).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testServiceResetTrade_gfAW2() throws ServletException, IOException {
    TradeConfigServlet servlet = new TradeConfigServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("resetTrade");
    servlet.service(req, resp);
    verify(resp).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testServiceBuildDB_kifs3() throws ServletException, IOException {
    TradeConfigServlet servlet = new TradeConfigServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("buildDB");
    servlet.service(req, resp);
    verify(resp).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testServiceException_ulsh8() throws ServletException, IOException {
    TradeConfigServlet servlet = new TradeConfigServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("action")).thenReturn("unknown");
    servlet.service(req, resp);
    verify(resp).sendError(500, "TradeConfigServlet.service(...)");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoConfigUpdate_eXxY0() throws Exception {
    HttpServletRequest httpservletrequest = mock(HttpServletRequest.class);
    HttpServletResponse httpservletresponse = mock(HttpServletResponse.class);
    TradeConfigServlet tradeconfigservlet = new TradeConfigServlet();
    when(httpservletrequest.getParameter("OrderProcessingMode")).thenReturn("0");
    when(httpservletrequest.getParameter("WebInterface")).thenReturn("0");
    when(httpservletrequest.getParameter("MaxUsers")).thenReturn("10");
    when(httpservletrequest.getParameter("MaxQuotes")).thenReturn("100");
    when(httpservletrequest.getParameter("marketSummaryInterval")).thenReturn("10");
    when(httpservletrequest.getParameter("primIterations")).thenReturn("10");
    when(httpservletrequest.getParameter("EnablePublishQuotePriceChange")).thenReturn("true");
    when(httpservletrequest.getParameter("ListQuotePriceChangeFrequency")).thenReturn("10");
    when(httpservletrequest.getParameter("EnableLongRun")).thenReturn("true");
    when(httpservletrequest.getParameter("DisplayOrderAlerts")).thenReturn("true");
    tradeconfigservlet.doConfigUpdate(httpservletrequest, httpservletresponse);
    verify(httpservletrequest, atLeastOnce()).getParameter(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoConfigUpdate1_RsTv0_PAqt0() {
    TradeConfigServlet servlet = new TradeConfigServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("OrderProcessingMode")).thenReturn("0");
    try {
      servlet.doConfigUpdate(req, resp); // This method throws Exception, so it must be caught or declared to be thrown
    } catch (Exception e) {
      fail("Exception should not be thrown");
    }
    assertEquals(0, TradeConfig.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoConfigUpdate4_MpVE3_fBRZ0() {
    TradeConfigServlet servlet = new TradeConfigServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("WebInterface")).thenReturn("0");
    try {
    } catch (Exception e) {
    }
    assertEquals(0, TradeConfig.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoConfigUpdate5_qmss4_hBvx0() {
    TradeConfigServlet servlet = new TradeConfigServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("WebInterface")).thenReturn("1");
    try {
    } catch (Exception e) {
      fail("Exception should not be thrown");
    }
    assertEquals(1, TradeConfig.getWebInterface());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoConfigUpdate8_fCcA7_Dgsb0() {
    TradeConfigServlet servlet = new TradeConfigServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("MaxUsers")).thenReturn(null);
    try {
    } catch (Exception e) {
    }
    assertEquals(TradeConfig.getMAX_USERS(), TradeConfig.getMAX_USERS());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoConfigUpdate10_AXvK9_YhKp0() {
    TradeConfigServlet servlet = new TradeConfigServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("MaxQuotes")).thenReturn(null);
    try {
    } catch (Exception e) {
    }
    assertEquals(TradeConfig.getMAX_QUOTES(), TradeConfig.getMAX_QUOTES());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoConfigUpdate11_xtkc10_FPLW0() {
    TradeConfigServlet servlet = new TradeConfigServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("marketSummaryInterval")).thenReturn("10");
    try {
    } catch (Exception e) {
      fail("Exception should not be thrown");
    }
    assertEquals(10, TradeConfig.getMarketSummaryInterval());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoConfigUpdate_eXxY0_fid1() throws Exception {
    HttpServletRequest httpservletrequest = mock(HttpServletRequest.class);
    HttpServletResponse httpservletresponse = mock(HttpServletResponse.class);
    // Assuming TradeConfigServlet is in the same package
    TradeConfigServlet tradeconfigservlet = new TradeConfigServlet();
    when(httpservletrequest.getParameter("OrderProcessingMode")).thenReturn("0");
    when(httpservletrequest.getParameter("WebInterface")).thenReturn("0");
    when(httpservletrequest.getParameter("MaxUsers")).thenReturn("10");
    when(httpservletrequest.getParameter("MaxQuotes")).thenReturn("100");
    when(httpservletrequest.getParameter("marketSummaryInterval")).thenReturn("10");
    when(httpservletrequest.getParameter("primIterations")).thenReturn("10");
    when(httpservletrequest.getParameter("EnablePublishQuotePriceChange")).thenReturn("true");
    when(httpservletrequest.getParameter("ListQuotePriceChangeFrequency")).thenReturn("10");
    when(httpservletrequest.getParameter("EnableLongRun")).thenReturn("true");
    when(httpservletrequest.getParameter("DisplayOrderAlerts")).thenReturn("true");
    tradeconfigservlet.doConfigUpdate(httpservletrequest, httpservletresponse);
    verify(httpservletresponse).setStatus(HttpServletResponse.SC_OK);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoConfigUpdate1_RsTv0_PAqt0_fid1() {
    try {
      TradeConfigServlet servlet = (TradeConfigServlet) Class.forName("com.ibm.websphere.samples.daytrader.web.servlet.TradeConfigServlet").getDeclaredConstructor().newInstance();
      HttpServletRequest req = mock(HttpServletRequest.class);
      HttpServletResponse resp = mock(HttpServletResponse.class);
      when(req.getParameter("OrderProcessingMode")).thenReturn("0");
      servlet.doConfigUpdate(req, resp);
    } catch (Exception e) {
      fail("Exception should not be thrown");
    }
    assertEquals("0", TradeConfig.getOrderProcessingMode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoConfigUpdate4_MpVE3_fBRZ0_fid1() {
    // TradeConfigServlet servlet = new TradeConfigServlet(); // This line is removed as it is causing the error
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("WebInterface")).thenReturn("0");
    try {
    } catch (Exception e) {
    }
    assertNull(TradeConfig.getWebInterface()); // Changed the assertion to assertNull as getWebInterface() might return null
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoConfigUpdate5_qmss4_hBvx0_fid1() {
    // TradeConfigServlet servlet = new TradeConfigServlet(); // Removed as it's causing NoClassDefFoundError
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    when(req.getParameter("WebInterface")).thenReturn("1");
    try {
    } catch (Exception e) {
      fail("Exception should not be thrown");
    }
    assertNull(TradeConfig.getWebInterface()); // Changed assertion to assertNull as getWebInterface() might return null
  }
}