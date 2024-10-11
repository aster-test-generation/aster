/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet31AsyncRead_Coverage_Test_Failing {
    PingServlet31AsyncRead servlet;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_HWso0() {
        PingServlet31AsyncRead pingServlet31AsyncRead = new PingServlet31AsyncRead();
        String result = pingServlet31AsyncRead.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetContentType_wUxf0() throws ServletException, IOException {
        PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(response, times(1)).setContentType("text/html");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStartAsync_aZfN1() throws ServletException, IOException {
        PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(request, times(1)).startAsync();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStream_JwRM2() throws ServletException, IOException {
        PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(request, times(1)).getInputStream();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void before_krwg0() throws javax.servlet.ServletException {
        servlet = new PingServlet31AsyncRead();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit2_rBSa2() throws ServletException {
        ServletConfig mockConfig = mock(ServletConfig.class);
        servlet.init(mockConfig);
        verify(mockConfig).getInitParameter("maxThreads");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit3_ualg3() throws ServletException {
        ServletConfig mockConfig = mock(ServletConfig.class);
        servlet.init(mockConfig);
        verify(mockConfig).getInitParameter("maxTime");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit4_sRLP4() throws ServletException {
        ServletConfig mockConfig = mock(ServletConfig.class);
        servlet.init(mockConfig);
        verify(mockConfig).getInitParameter("minTime");
    }
}