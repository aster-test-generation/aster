/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingReentryServlet_Test_Failing {
    PingReentryServlet pingreentryservlet;
    HttpServlet httpservlet;
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;
    HttpServletRequest httpservletrequest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingreentryservlet = new PingReentryServlet();
        pingreentryservlet.init(httpservlet);
        // Add meaningful assertion here
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_NullConfig_fwkO1() throws ServletException {
        PingReentryServlet servlet = new PingReentryServlet();
        try {
            servlet.init(null);
            fail("Expected ServletException");
        } catch (ServletException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpservlet = mock(HttpServlet.class);
        pingreentryservlet = new PingReentryServlet();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingreentryservlet.doPost(httpservletrequest, httpservletresponse);
        verify(httpservletresponse, times(1)).getOutputStream();
        verify(servletoutputstream, times(1)).println("Pong");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_LJCw0() throws ServletException, IOException {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullRequest_UurT1() throws ServletException, IOException {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = null;
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullResponse_IFyp2() throws ServletException, IOException {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = null;
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullRequestAndResponse_uECF3() throws ServletException, IOException {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletInfo_Mrww0() {
        PingReentryServlet servlet = new PingReentryServlet();
        String result = servlet.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletInfo_null_YPtN1() {
        PingReentryServlet servlet = new PingReentryServlet();
        String result = servlet.getServletInfo();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletInfo_empty_gFaZ2() {
        PingReentryServlet servlet = new PingReentryServlet();
        String result = servlet.getServletInfo();
        assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletInfo_length_VNpE3() {
        PingReentryServlet servlet = new PingReentryServlet();
        String result = servlet.getServletInfo();
        assertTrue(result.length() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNoParameters_WeFN0() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNumReentriesParameter_oaXu1() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getParameter("numReentries")).thenReturn("5");
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithSleepParameter_UNiC2() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getParameter("sleep")).thenReturn("1000");
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithBothParameters_TCnN3() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getParameter("numReentries")).thenReturn("3");
        when(request.getParameter("sleep")).thenReturn("500");
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doGet(request, response);
    }
}