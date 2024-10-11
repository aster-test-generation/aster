/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_TradeConfigServlet_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_mVil0() throws ServletException {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        ServletConfig servletConfig = mock(ServletConfig.class);
        tradeConfigServlet.init(servletConfig);
        verify(servletConfig, times(1)).getInitParameter("param");
        verify(servletConfig, times(1)).getServletContext();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_RuntimeMode_rYam0() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest(), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_OrderProcessingMode_Null_uCvT1() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("OrderProcessingMode", null), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_OrderProcessingMode_Valid_iQAg2() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("OrderProcessingMode", "1"), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_OrderProcessingMode_Invalid_Bqyk3() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("OrderProcessingMode", "10"), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_WebInterface_Null_ODOL4() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("WebInterface", null), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_WebInterface_Valid_JyAb5() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("WebInterface", "1"), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_WebInterface_Invalid_NGsA6() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("WebInterface", "10"), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MaxUsers_Null_WHyL7() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("MaxUsers", null), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MaxUsers_Valid_ulEO8() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("MaxUsers", "10"), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MaxUsers_Invalid_DAmy9() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("MaxUsers", "abc"), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MaxQuotes_Null_aBFU10() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("MaxQuotes", null), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MaxQuotes_Valid_zMjE11() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("MaxQuotes", "10"), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MaxQuotes_Invalid_lTTn12() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("MaxQuotes", "abc"), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MarketSummaryInterval_Null_dSWp13() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("marketSummaryInterval", null), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MarketSummaryInterval_Valid_Szfi14() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("marketSummaryInterval", "10"), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MarketSummaryInterval_Invalid_HXbx15() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("marketSummaryInterval", "abc"), new MockHttpServletResponse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_PrimIterations_Null_IarP16() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("primIterations", null), new MockHttpServletResponse());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_KbiL0_aOLP0() throws java.lang.Exception {
    TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getParameter("OrderProcessingMode")).thenReturn("0");
    when(request.getParameter("WebInterface")).thenReturn("0");
    when(request.getParameter("MaxUsers")).thenReturn("10");
    when(request.getParameter("MaxQuotes")).thenReturn("20");
    when(request.getParameter("marketSummaryInterval")).thenReturn("30");
    when(request.getParameter("primIterations")).thenReturn("40");
    when(request.getParameter("EnablePublishQuotePriceChange")).thenReturn("true");
    when(request.getParameter("ListQuotePriceChangeFrequency")).thenReturn("50");
    when(request.getParameter("EnableLongRun")).thenReturn("true");
    when(request.getParameter("DisplayOrderAlerts")).thenReturn("true");
    tradeConfigServlet.doConfigUpdate(request, response);
}
}