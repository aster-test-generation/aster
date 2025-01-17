/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeConfigServlet_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInit_DtHs0() throws javax.servlet.ServletException {
		TradeConfigServlet servlet = new TradeConfigServlet();
		servlet.init(null);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoResetTrade1_vQLC0() throws Exception {
	TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
	HttpServletRequest req = mock(HttpServletRequest.class);
	HttpServletResponse resp = mock(HttpServletResponse.class);
	String results = "";
	tradeConfigServlet.doResetTrade(req, resp, results);
	verify(req).setAttribute("runStatsData", any());
	verify(req).setAttribute("tradeConfig", any());
	verify(req).setAttribute("status", any());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoResetTrade9_Hfni8() throws Exception {
	TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
	HttpServletRequest req = mock(HttpServletRequest.class);
	HttpServletResponse resp = mock(HttpServletResponse.class);
	String results = "";
	tradeConfigServlet.doResetTrade(req, resp, results);
	verify(req).setAttribute("runStatsData", any());
	verify(req).setAttribute("tradeConfig", any());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdateRuntimeMode_GNYB0() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(null, null);
        String currentConfigStr = "\n\n########## Trade configuration update. Current config:\n\n";
        currentConfigStr += "\t\tRuntimeMode:\t\t" + TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()] + "\n";
        assertEquals("RuntimeMode", "Derby", currentConfigStr);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdateOrderProcessingMode_Ejtt1() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(null, null);
        String currentConfigStr = "\n\n########## Trade configuration update. Current config:\n\n";
        currentConfigStr += "\t\tRuntimeMode:\t\t" + TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()] + "\n";
        String orderProcessingModeStr = "1";
        if (orderProcessingModeStr != null) {
            try {
                int i = Integer.parseInt(orderProcessingModeStr);
                if ((i >= 0) && (i < TradeConfig.getOrderProcessingModeNames().length))
                    TradeConfig.setOrderProcessingMode(i);
            } catch (Exception e) {
                Log.error(e, "TradeConfigServlet.doConfigUpdate(..): minor exception caught", "trying to set orderProcessing to " + orderProcessingModeStr, "reverting to current value");
            }
        }
        currentConfigStr += "\t\tOrderProcessingMode:\t\t" + TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()] + "\n";
        assertEquals("OrderProcessingMode", "Direct", currentConfigStr);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoConfigUpdateWebInterface_DAQo2() throws java.lang.Exception {
        TradeConfigServlet servlet = new TradeConfigServlet();
        servlet.doConfigUpdate(null, null);
        String currentConfigStr = "\n\n########## Trade configuration update. Current config:\n\n";
        currentConfigStr += "\t\tRuntimeMode:\t\t" + TradeConfig.getRunTimeModeNames()[TradeConfig.getRunTimeMode()] + "\n";
        String orderProcessingModeStr = "1";
        if (orderProcessingModeStr != null) {
            try {
                int i = Integer.parseInt(orderProcessingModeStr);
                if ((i >= 0) && (i < TradeConfig.getOrderProcessingModeNames().length))
                    TradeConfig.setOrderProcessingMode(i);
            } catch (Exception e) {
                Log.error(e, "TradeConfigServlet.doConfigUpdate(..): minor exception caught", "trying to set orderProcessing to " + orderProcessingModeStr, "reverting to current value");
            }
        }
        currentConfigStr += "\t\tOrderProcessingMode:\t\t" + TradeConfig.getOrderProcessingModeNames()[TradeConfig.getOrderProcessingMode()] + "\n";
        String webInterfaceStr = "1";
        if (webInterfaceStr != null) {
            try {
                int i = Integer.parseInt(webInterfaceStr);
                if ((i >= 0) && (i < TradeConfig.getWebInterfaceNames().length))
                    TradeConfig.setWebInterface(i);
            } catch (Exception e) {
                Log.error(e, "TradeConfigServlet.doConfigUpdate(..): minor exception caught", "trying to set WebInterface to " + webInterfaceStr, "reverting to current value");
            }
        }
        currentConfigStr += "\t\tWeb Interface:\t\t\t" + TradeConfig.getWebInterfaceNames()[TradeConfig.getWebInterface()] + "\n";
        assertEquals("WebInterface", "JSF", currentConfigStr);
    }
}