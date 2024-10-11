/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.io.IOException;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.springframework.mock.web.MockServletConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Aster_TradeAppServlet_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getServletInfoTest_PUGc0() {
        TradeAppServlet tradeAppServlet = new TradeAppServlet();
        String expected = "TradeAppServlet provides the standard web interface to Trade";
        assertEquals(expected, tradeAppServlet.getServletInfo());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_DjsA0() throws javax.servlet.ServletException, java.io.IOException {
        TradeAppServlet tradeAppServlet = new TradeAppServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        tradeAppServlet.doPost(request, response);
        verify(tradeAppServlet).performTask(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPerformTask_wKjh1() throws javax.servlet.ServletException, java.io.IOException {
        TradeAppServlet tradeAppServlet = new TradeAppServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        tradeAppServlet.performTask(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPerformTask_QOSQ1() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        TradeAppServlet servlet = new TradeAppServlet();
        servlet.performTask(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_Tres0() throws javax.servlet.ServletException {
        TradeAppServlet tradeAppServlet = new TradeAppServlet();
        ServletConfig config = new MockServletConfig();
        try {
            tradeAppServlet.init(config);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitParameterNames_flYv2() throws javax.servlet.ServletException {
        TradeAppServlet tradeAppServlet = new TradeAppServlet();
        ServletConfig config = new MockServletConfig();
        try {
            tradeAppServlet.init(config);
            java.util.Enumeration<String> en = config.getInitParameterNames();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasMoreElements_FfNf3() throws javax.servlet.ServletException {
        TradeAppServlet tradeAppServlet = new TradeAppServlet();
        ServletConfig config = new MockServletConfig();
        try {
            tradeAppServlet.init(config);
            java.util.Enumeration<String> en = config.getInitParameterNames();
            while (en.hasMoreElements()) {
            }
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextElement_estn4() throws javax.servlet.ServletException {
        TradeAppServlet tradeAppServlet = new TradeAppServlet();
        ServletConfig config = new MockServletConfig();
        try {
            tradeAppServlet.init(config);
            java.util.Enumeration<String> en = config.getInitParameterNames();
            while (en.hasMoreElements()) {
                String parm = en.nextElement();
            }
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInitParameter_Ftjk5() throws javax.servlet.ServletException {
        TradeAppServlet tradeAppServlet = new TradeAppServlet();
        ServletConfig config = new MockServletConfig();
        try {
            tradeAppServlet.init(config);
            java.util.Enumeration<String> en = config.getInitParameterNames();
            while (en.hasMoreElements()) {
                String parm = en.nextElement();
                String value = config.getInitParameter(parm);
            }
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConfigParam_vggH6() throws javax.servlet.ServletException {
        TradeAppServlet tradeAppServlet = new TradeAppServlet();
        ServletConfig config = new MockServletConfig();
        try {
            tradeAppServlet.init(config);
            java.util.Enumeration<String> en = config.getInitParameterNames();
            while (en.hasMoreElements()) {
                String parm = en.nextElement();
                String value = config.getInitParameter(parm);
                TradeConfig.setConfigParam(parm, value);
            }
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}