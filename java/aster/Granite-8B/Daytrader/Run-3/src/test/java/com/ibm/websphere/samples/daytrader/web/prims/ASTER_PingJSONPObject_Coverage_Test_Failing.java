/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingJSONPObject_Coverage_Test_Failing {
    PingJSONPObject pingJSONPObject;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_qjko0() {
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        String actualServletInfo = pingJSONPObject.getServletInfo();
        String expectedServletInfo = "Basic JSON generation and parsing in a servlet";
        assertEquals(expectedServletInfo, actualServletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitServletConfig_xRTm0() throws javax.servlet.ServletException {
        pingJSONPObject = new PingJSONPObject();
        pingJSONPObject.init(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetOutputStream_FEvv3() throws ServletException, IOException {
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        pingJSONPObject.doGet(request, response);
        assertTrue(response.getOutputStream() instanceof ServletOutputStream);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetPrintln_GAbr4() throws ServletException, IOException {
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        pingJSONPObject.doGet(request, response);
        assertTrue(response.getWriter().toString().contains("<html><head><title>Ping JSONP</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping JSONP</FONT><BR>Generated JSON:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetPrintln2_arag5() throws ServletException, IOException {
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        pingJSONPObject.doGet(request, response);
        assertTrue(response.getWriter().toString().contains("Parsed JSON:"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetPrintln3_yPdb6() throws ServletException, IOException {
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        pingJSONPObject.doGet(request, response);
        assertTrue(response.getWriter().toString().contains("</body></html>"));
    }
}