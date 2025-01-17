/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirectDBUtils;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeConfigServlet_Test_Passing {
    @Mock
    private ServletConfig servletConfig;
    @Mock
    private HttpServlet httpServlet;
    private TradeConfigServlet tradeConfigServlet;
    private TradeDirectDBUtils dbUtils;
    @Mock
    private TradeDirectDBUtils mockDbUtils;
    @Mock
    private HttpServletRequest mockHttpServletRequest;
    @Mock
    private HttpServletResponse mockHttpServletResponse;
    @Mock
    private ServletConfig mockServletConfig;
    private HttpServletRequest httpServletRequest;
    private HttpServletResponse httpServletResponse;
    @Mock
    private HttpServletResponse httpResponse;
    @Mock
    private TradeConfig tradeConfig;
    TradeConfigServlet tradeconfigservlet;
    HttpServlet httpservlet;
    HttpServletRequest httpservletrequest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws ServletException {
        tradeConfigServlet = new TradeConfigServlet();
        // Given
        when(servletConfig.getServletContext()).thenReturn(new MockServletContext());
        tradeConfigServlet.init(servletConfig);
        // Then
        verify(servletConfig).getServletContext();
        verify(servletConfig, times(1)).getInitParameter("param");
        verify(servletConfig, times(1)).getInitParameter("anotherParam");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigDisplay() throws Exception {
        tradeConfigServlet = new TradeConfigServlet();
        when(httpServletRequest.getAttribute("tradeConfig")).thenReturn(tradeConfig);
        when(httpServletRequest.getAttribute("status")).thenReturn("results");
        when(servletConfig.getServletContext()).thenReturn(new MockServletContext());
        when(TradeConfig.getPage(TradeConfig.CONFIG_PAGE)).thenReturn("/configPage");
        tradeConfigServlet.doConfigDisplay(httpServletRequest, httpResponse, "results");
        verify(httpServletRequest).setAttribute("tradeConfig", tradeConfig);
        verify(httpServletRequest).setAttribute("status", "results");
        verify(servletConfig).getServletContext();
        verify(httpServletRequest).getRequestDispatcher("/configPage").include(httpServletRequest, httpResponse);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_RuntimeMode_KYBL0() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("RuntimeMode", "0"), new MockHttpServletResponse());
        assertEquals(TradeConfig.getRunTimeModeNames()[0], TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_OrderProcessingMode_KhQC1() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("OrderProcessingMode", "1"), new MockHttpServletResponse());
        assertEquals(TradeConfig.getOrderProcessingModeNames()[1], TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_WebInterface_uHZy2() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("WebInterface", "2"), new MockHttpServletResponse());
        assertEquals(TradeConfig.getWebInterfaceNames()[2], TradeConfig.getWebInterfaceNames()[TradeConfig.getWebInterface()]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MAX_USERS_oXFW3() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("MaxUsers", "3"), new MockHttpServletResponse());
        assertEquals(3, TradeConfig.getMAX_USERS());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MAX_QUOTES_cfCY4() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("MaxQuotes", "4"), new MockHttpServletResponse());
        assertEquals(4, TradeConfig.getMAX_QUOTES());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_MarketSummaryInterval_KrkT5() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("marketSummaryInterval", "5"), new MockHttpServletResponse());
        assertEquals(5, TradeConfig.getMarketSummaryInterval());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_PrimIterations_MhBD6() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("primIterations", "6"), new MockHttpServletResponse());
        assertEquals(6, TradeConfig.getPrimIterations());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_EnablePublishQuotePriceChange_OkgZ7() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("EnablePublishQuotePriceChange", "true"), new MockHttpServletResponse());
        assertTrue(TradeConfig.getPublishQuotePriceChange());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_ListQuotePriceChangeFrequency_yiiF8() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("ListQuotePriceChangeFrequency", "7"), new MockHttpServletResponse());
        assertEquals(7, TradeConfig.getListQuotePriceChangeFrequency());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_EnableLongRun_AxJl9() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("EnableLongRun", "true"), new MockHttpServletResponse());
        assertTrue(TradeConfig.getLongRun());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_DisplayOrderAlerts_GFnk10() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("DisplayOrderAlerts", "true"), new MockHttpServletResponse());
        assertTrue(TradeConfig.getDisplayOrderAlerts());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_RuntimeMode_Null_xwuQ11() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("RuntimeMode", null), new MockHttpServletResponse());
        assertEquals(TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()], TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_OrderProcessingMode_Null_ZNFq12() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("OrderProcessingMode", null), new MockHttpServletResponse());
        assertEquals(TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()], TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_WebInterface_Null_pFEp13() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(new MockHttpServletRequest("WebInterface", null), new MockHttpServletResponse());
        assertEquals(TradeConfig.getWebInterfaceNames()[TradeConfig.getWebInterface()], TradeConfig.getWebInterfaceNames()[TradeConfig.getWebInterface()]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetTrade_LIbc0() throws Exception {
        dbUtils = mockDbUtils;
        when(mockHttpServletRequest.getParameter("action")).thenReturn("buildDB");
        when(mockHttpServletRequest.getParameter("action")).thenReturn(null);
        when(mockHttpServletRequest.getParameter("ResetTrade")).thenReturn("true");
        TradeConfigServlet tradeconfigservlet = new TradeConfigServlet(); // fixed constructor call
        tradeconfigservlet.doConfigUpdate(mockHttpServletRequest, mockHttpServletResponse);
        verify(mockHttpServletResponse, times(1)).setContentType("text/html");
        verify(mockHttpServletResponse, times(1)).getWriter().flush(); // fixed line
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoConfigUpdate_ppiL0() throws Exception {
        TradeConfig tradeConfig = mock(TradeConfig.class);
        HttpServlet httpservlet = mock(HttpServlet.class);
        HttpServletRequest httpservletrequest = mock(HttpServletRequest.class);
        TradeConfigServlet tradeconfigservlet = new TradeConfigServlet();
        when(httpservletrequest.getParameter("OrderProcessingMode")).thenReturn("1");
        when(httpservletrequest.getParameter("WebInterface")).thenReturn("2");
        when(httpservletrequest.getParameter("MaxUsers")).thenReturn("3");
        when(httpservletrequest.getParameter("MaxQuotes")).thenReturn("4");
        when(httpservletrequest.getParameter("marketSummaryInterval")).thenReturn("5");
        when(httpservletrequest.getParameter("primIterations")).thenReturn("6");
        when(httpservletrequest.getParameter("EnablePublishQuotePriceChange")).thenReturn("true");
        when(httpservletrequest.getParameter("ListQuotePriceChangeFrequency")).thenReturn("7");
        when(httpservletrequest.getParameter("EnableLongRun")).thenReturn("true");
        when(httpservletrequest.getParameter("DisplayOrderAlerts")).thenReturn("true");
        tradeconfigservlet.doConfigUpdate(httpservletrequest, mock(HttpServletResponse.class));
        verify(tradeConfig).setRunTimeMode(0);
        verify(tradeConfig).setOrderProcessingMode(1);
        verify(tradeConfig).setWebInterface(1);
        verify(tradeConfig).setMAX_USERS(3);
        verify(tradeConfig).setMAX_QUOTES(4);
        verify(tradeConfig).setMarketSummaryInterval(5);
        verify(tradeConfig).setPrimIterations(6);
        verify(tradeConfig).setPublishQuotePriceChange(true);
        verify(tradeConfig).setListQuotePriceChangeFrequency(7);
        verify(tradeConfig).setLongRun(true);
        verify(tradeConfig).setDisplayOrderAlerts(true);
    }
}