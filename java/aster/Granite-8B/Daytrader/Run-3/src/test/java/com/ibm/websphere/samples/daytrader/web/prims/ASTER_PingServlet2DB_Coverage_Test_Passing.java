/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingServlet2DB_Coverage_Test_Passing {
    PingServlet2DB servlet2DB;
    PingServlet2DB servlet = new PingServlet2DB();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost1_WFhN0() throws ServletException, IOException {
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_SGVI0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2DB servlet = new PingServlet2DB();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet2_EvhD1() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2DB servlet = new PingServlet2DB();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        response.setContentType("text/html");
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet3_AlSo2() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2DB servlet = new PingServlet2DB();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        java.io.PrintWriter out = response.getWriter();
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet4_NSFw3() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2DB servlet = new PingServlet2DB();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        String symbol = null;
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet5_YPMa4() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2DB servlet = new PingServlet2DB();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        String symbol = null;
        StringBuffer output = new StringBuffer(100);
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet6_TAZl5_FtxY0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2DB servlet = new PingServlet2DB();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        String symbol = null;
        TradeDirect trade = new TradeDirect();
        try {
            trade.getConnPublic();
        } catch (Exception e) {
            Log.error(e, "PingServlet2DB -- error getting connection to the database", symbol);
            response.sendError(500, "PingServlet2DB Exception caught: " + e.toString());
        }
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void before_eXGo0() throws javax.servlet.ServletException {
        servlet2DB = new PingServlet2DB();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet10_CzQF9() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2DB servlet = new PingServlet2DB();
    }
}