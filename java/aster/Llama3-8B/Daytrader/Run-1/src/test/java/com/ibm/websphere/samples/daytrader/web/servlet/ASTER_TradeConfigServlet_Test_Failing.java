/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirectDBUtils;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.Arrays;
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
import org.springframework.mock.web.MockServletContext;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeConfigServlet_Test_Failing {
    TradeConfigServlet tradeconfigservlet;
    ServletConfig servletConfig;
    HttpServlet httpServlet;
    private TradeDirectDBUtils dbUtils;
    @Mock
    private HttpServletRequest httpservletrequest;
    @Mock
    private ServletConfig servletconfig;
    @Mock
    private HttpServletResponse httpservletresponse;
    private TradeConfigServlet tradeConfigServlet;
    private HttpServletRequest httpServletRequest;
    private HttpServletResponse httpServletResponse;
    @Mock
    private TradeConfig tradeConfig;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigDisplay() throws Exception {
        tradeConfigServlet = new TradeConfigServlet();
        when(httpServletRequest.getAttribute("tradeConfig")).thenReturn(tradeConfig);
        when(httpServletRequest.getAttribute("status")).thenReturn("results");
        when(servletConfig.getServletContext()).thenReturn(new MockServletContext());
        when(TradeConfig.getPage(TradeConfig.CONFIG_PAGE)).thenReturn("/configPage");
        tradeConfigServlet.doConfigDisplay(httpServletRequest, httpServletResponse, "results");
        verify(httpServletRequest, times(1)).setAttribute("tradeConfig", tradeConfig);
        verify(httpServletRequest, times(1)).setAttribute("status", "results");
        verify(servletConfig.getServletContext(), times(1)).getRequestDispatcher("/configPage");
        verify(servletConfig.getServletContext(), times(1)).getRequestDispatcher("/configPage").include(httpServletRequest, httpServletResponse);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_vCSR0() throws ServletException {
        httpServlet = mock(HttpServlet.class);
        servletConfig = mock(ServletConfig.class);
        tradeconfigservlet = new TradeConfigServlet();
        tradeconfigservlet.init(servletConfig);
        verify(servletConfig, times(1)).getServletContext();
        verify(servletConfig, times(1)).getInitParameter("param1");
        verify(servletConfig, times(1)).getInitParameter("param2");
        verify(servletConfig, times(1)).getInitParameter(anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testService_BuildDBTables_cDXa0() throws Exception {
        TradeDirectDBUtils dbUtils = mock(TradeDirectDBUtils.class);
        HttpServletRequest httpservletrequest = mock(HttpServletRequest.class);
        ServletConfig servletconfig = mock(ServletConfig.class);
        HttpServletResponse httpservletresponse = mock(HttpServletResponse.class);
        TradeConfigServlet tradeconfigservlet = new TradeConfigServlet();
        when(httpservletrequest.getParameter("action")).thenReturn("buildDBTables");
        when(dbUtils.checkDBProductName()).thenReturn("DB2");
        tradeconfigservlet.doConfigUpdate(httpservletrequest, httpservletresponse);
        verify(dbUtils, times(1)).checkDBProductName();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testService_ResetTrade_kdWt0() throws Exception {
        TradeDirectDBUtils dbUtils = mock(TradeDirectDBUtils.class);
        HttpServletRequest httpservletrequest = mock(HttpServletRequest.class);
        ServletConfig servletconfig = mock(ServletConfig.class);
        HttpServletResponse httpservletresponse = mock(HttpServletResponse.class);
        TradeConfigServlet tradeconfigservlet = new TradeConfigServlet();
        when(httpservletrequest.getParameter("action")).thenReturn("resetTrade");
        tradeconfigservlet.doConfigUpdate(httpservletrequest, httpservletresponse);
        verify(dbUtils, times(0)).resetTrade(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoResetTrade_VgUB0() throws Exception {
        dbUtils = mock(TradeDirectDBUtils.class);
        httpServletRequest = mock(HttpServletRequest.class);
        httpServletResponse = mock(HttpServletResponse.class);
        servletConfig = mock(ServletConfig.class);
        tradeConfigServlet = new TradeConfigServlet();
        when(dbUtils.resetTrade(false)).thenReturn(new RunStatsDataBean());
        when(httpServletRequest.getAttribute("results")).thenReturn("results");
        when(httpServletRequest.getAttribute("status")).thenReturn("status");
        tradeConfigServlet.doConfigUpdate(httpServletRequest, httpServletResponse);
        verify(dbUtils, times(1)).resetTrade(false);
        verify(httpServletRequest, times(1)).setAttribute("runStatsData", any(RunStatsDataBean.class));
        verify(httpServletRequest, times(1)).setAttribute("tradeConfig", any(TradeConfig.class));
        verify(httpServletRequest, times(1)).setAttribute("status", "Trade Reset completed successfully");
        verify(httpServletResponse, times(1)).setStatus(HttpServletResponse.SC_OK);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoConfigUpdate_OrderProcessingMode_yYUu0() throws Exception {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        String orderProcessingMode = "ORDER_PROCESSING_MODE";
        when(httpservletrequest.getParameter("OrderProcessingMode")).thenReturn(orderProcessingMode);
        tradeConfigServlet.doConfigUpdate(httpservletrequest, httpservletresponse);
        verify(tradeConfig, times(1)).setOrderProcessingMode(Arrays.asList(TradeConfig.getOrderProcessingModeNames()).indexOf(orderProcessingMode));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoConfigUpdate_MAX_USERS_bDGP0() throws Exception {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        String maxUsers = "5";
        when(httpservletrequest.getParameter("MaxUsers")).thenReturn(maxUsers);
        tradeConfigServlet.doConfigUpdate(httpservletrequest, httpservletresponse);
        verify(tradeConfig).setMAX_USERS(Integer.parseInt(maxUsers));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoConfigUpdate_MAX_QUOTES_JJac0() throws Exception {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        String maxQuotes = "5";
        when(httpservletrequest.getParameter("MaxQuotes")).thenReturn(maxQuotes);
        tradeConfigServlet.doConfigUpdate(httpservletrequest, httpservletresponse);
        verify(tradeConfig).setMAX_QUOTES(Integer.parseInt(maxQuotes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoConfigUpdate_marketSummaryInterval_VErK0() throws Exception {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        String marketSummaryInterval = "5";
        when(httpservletrequest.getParameter("marketSummaryInterval")).thenReturn(marketSummaryInterval);
        tradeConfigServlet.doConfigUpdate(httpservletrequest, httpservletresponse);
        verify(tradeConfig).setMarketSummaryInterval(Integer.parseInt(marketSummaryInterval));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoConfigUpdate_primIterations_wYZo0() throws Exception {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        String primIterations = "5";
        when(httpservletrequest.getParameter("primIterations")).thenReturn(primIterations);
        tradeConfigServlet.doConfigUpdate(httpservletrequest, httpservletresponse);
        verify(tradeConfig).setPrimIterations(Integer.parseInt(primIterations));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoConfigUpdate_EnablePublishQuotePriceChange_giQZ0() throws Exception {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        String enablePublishQuotePriceChange = "true";
        when(httpservletrequest.getParameter("EnablePublishQuotePriceChange")).thenReturn(enablePublishQuotePriceChange);
        tradeConfigServlet.doConfigUpdate(httpservletrequest, httpservletresponse);
        verify(tradeConfig).setPublishQuotePriceChange(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoConfigUpdate_ListQuotePriceChangeFrequency_kiue0() throws Exception {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        String listQuotePriceChangeFrequency = "5";
        when(httpservletrequest.getParameter("ListQuotePriceChangeFrequency")).thenReturn(listQuotePriceChangeFrequency);
        tradeConfigServlet.doConfigUpdate(httpservletrequest, httpservletresponse);
        verify(tradeConfig).setListQuotePriceChangeFrequency(Integer.parseInt(listQuotePriceChangeFrequency));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoConfigUpdate_EnableLongRun_wqPn0() throws Exception {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        String enableLongRun = "true";
        when(httpservletrequest.getParameter("EnableLongRun")).thenReturn(enableLongRun);
        tradeConfigServlet.doConfigUpdate(httpservletrequest, httpservletresponse);
        verify(tradeConfig).setLongRun(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoConfigUpdate_DisplayOrderAlerts_WnSS0() throws Exception {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        String displayOrderAlerts = "true";
        when(httpservletrequest.getParameter("DisplayOrderAlerts")).thenReturn(displayOrderAlerts);
        tradeConfigServlet.doConfigUpdate(httpservletrequest, httpservletresponse);
        verify(tradeConfig).setDisplayOrderAlerts(true);
    }
}