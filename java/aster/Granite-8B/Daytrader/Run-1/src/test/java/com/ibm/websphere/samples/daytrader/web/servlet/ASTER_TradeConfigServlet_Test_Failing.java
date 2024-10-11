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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeConfigServlet_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithNullConfig_Flyn1() throws ServletException {
        TradeConfigServlet servlet = new TradeConfigServlet();
        ServletConfig config = null;
        servlet.init(config);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testService_LqzE0() throws ServletException, IOException {
        TradeConfigServlet servlet = new TradeConfigServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String action = "updateConfig";
        when(req.getParameter("action")).thenReturn(action);
        servlet.service(req, resp);
        verify(resp, times(1)).setContentType("text/html");
        verify(resp, times(1)).getWriter();
        verify(resp, times(1)).getWriter().println("<B><BR>DayTrader Configuration Updated</BR></B>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testService2_wTFU1() throws ServletException, IOException {
        TradeConfigServlet servlet = new TradeConfigServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String action = "resetTrade";
        when(req.getParameter("action")).thenReturn(action);
        servlet.service(req, resp);
        verify(resp, times(1)).setContentType("text/html");
        verify(resp, times(1)).getWriter();
        verify(resp, times(1)).getWriter().println("<B><BR>DayTrader Reset Trade</BR></B>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testService3_ldBy2() throws ServletException, IOException {
        TradeConfigServlet servlet = new TradeConfigServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String action = "buildDB";
        when(req.getParameter("action")).thenReturn(action);
        servlet.service(req, resp);
        verify(resp, times(1)).setContentType("text/html");
        verify(resp, times(1)).getWriter();
        verify(resp, times(1)).getWriter().println("DayTrader Database Built - 100 users created");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testService4_eAMG3() throws ServletException, IOException {
        TradeConfigServlet servlet = new TradeConfigServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String action = "buildDBTables";
        when(req.getParameter("action")).thenReturn(action);
        servlet.service(req, resp);
        verify(resp, times(1)).setContentType("text/html");
        verify(resp, times(1)).getWriter();
        verify(resp, times(1)).getWriter().println("<BR>TradeBuildDB: **** Database Product detected: Oracle ****</BR>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoResetTrade_rDLn0() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String results = "initial results";
        servlet.doResetTrade(req, resp, results);
        assertEquals("Trade Reset completed successfully", results);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigDisplay_CBaQ0() throws Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        String results = "success";
        servlet.doConfigDisplay(request, response, results);
        assertEquals("success", request.getAttribute("status"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdate_hMNw0() throws Exception {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String currentConfigStr = "\n\n########## Trade configuration update. Current config:\n\n";
        currentConfigStr += "\t\tRuntimeMode:\t\t" + TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()] + "\n";
        String orderProcessingModeStr = "0";
        when(req.getParameter("OrderProcessingMode")).thenReturn(orderProcessingModeStr);
        tradeConfigServlet.doConfigUpdate(req, resp);
        currentConfigStr += "\t\tOrderProcessingMode:\t\t" + TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()] + "\n";
        String webInterfaceStr = "0";
        when(req.getParameter("WebInterface")).thenReturn(webInterfaceStr);
        tradeConfigServlet.doConfigUpdate(req, resp);
        currentConfigStr += "\t\tWeb Interface:\t\t\t" + TradeConfig.getWebInterfaceNames()[TradeConfig.getWebInterface()] + "\n";
        String parm = "10";
        when(req.getParameter("MaxUsers")).thenReturn(parm);
        tradeConfigServlet.doConfigUpdate(req, resp);
        currentConfigStr += "\t\tTrade Users:\t\t\t" + TradeConfig.getMAX_USERS() + "\n";
        parm = "100";
        when(req.getParameter("MaxQuotes")).thenReturn(parm);
        tradeConfigServlet.doConfigUpdate(req, resp);
        currentConfigStr += "\t\tTrade Quotes:\t\t\t" + TradeConfig.getMAX_QUOTES() + "\n";
        parm = "10";
        when(req.getParameter("marketSummaryInterval")).thenReturn(parm);
        tradeConfigServlet.doConfigUpdate(req, resp);
        currentConfigStr += "\t\tMarket Summary Interval:\t" + TradeConfig.getMarketSummaryInterval() + "\n";
        parm = "10";
        when(req.getParameter("primIterations")).thenReturn(parm);
        tradeConfigServlet.doConfigUpdate(req, resp);
        currentConfigStr += "\t\tPrimitive Iterations:\t\t" + TradeConfig.getPrimIterations() + "\n";
        String enablePublishQuotePriceChange = "true";
        when(req.getParameter("EnablePublishQuotePriceChange")).thenReturn(enablePublishQuotePriceChange);
        tradeConfigServlet.doConfigUpdate(req, resp);
        currentConfigStr += "\t\tTradeStreamer MDB Enabled:\t" + TradeConfig.getPublishQuotePriceChange() + "\n";
        parm = "10";
        when(req.getParameter("ListQuotePriceChangeFrequency")).thenReturn(parm);
        tradeConfigServlet.doConfigUpdate(req, resp);
        currentConfigStr += "\t\t% of trades on Websocket:\t" + TradeConfig.getListQuotePriceChangeFrequency() + "\n";
        String enableLongRun = "true";
        when(req.getParameter("EnableLongRun")).thenReturn(enableLongRun);
        tradeConfigServlet.doConfigUpdate(req, resp);
        currentConfigStr += "\t\tLong Run Enabled:\t\t" + TradeConfig.getLongRun() + "\n";
        String displayOrderAlerts = "true";
        when(req.getParameter("DisplayOrderAlerts")).thenReturn(displayOrderAlerts);
        tradeConfigServlet.doConfigUpdate(req, resp);
        currentConfigStr += "\t\tDisplay Order Alerts:\t\t" + TradeConfig.getDisplayOrderAlerts() + "\n";
        System.out.println(currentConfigStr);
    }
}