/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

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

public class Aster_PingServlet2PDF_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_NfYo0() throws ServletException, IOException {
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        PingServlet2PDF servlet = new PingServlet2PDF();
        servlet.doPost(req, res);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost2_oHCN1() throws ServletException, IOException {
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        PingServlet2PDF servlet = new PingServlet2PDF();
        servlet.doPost(req, res);
        servlet.doGet(req, res);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_fVwg0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2PDF servlet = new PingServlet2PDF();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        try {
            servlet.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}