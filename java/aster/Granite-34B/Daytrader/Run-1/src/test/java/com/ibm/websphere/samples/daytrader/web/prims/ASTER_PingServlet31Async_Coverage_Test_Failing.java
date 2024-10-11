/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingServlet31Async_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_CCDO0() {
        PingServlet31Async servlet = new PingServlet31Async();
        String expected = "Basic dynamic HTML generation through a servlet";
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_Mhzq0() throws ServletException, IOException {
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        PingServlet31Async servlet = new PingServlet31Async();
        servlet.doGet(req, res);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_LEBB1() throws ServletException, IOException {
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        PingServlet31Async servlet = new PingServlet31Async();
        servlet.doPost(req, res);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_Mhzq0_fid1() throws ServletException, IOException {
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        PingServlet31Async servlet = new PingServlet31Async();
        servlet.doGet(req, res);
        Assertions.assertEquals(null, servlet);
    }
}