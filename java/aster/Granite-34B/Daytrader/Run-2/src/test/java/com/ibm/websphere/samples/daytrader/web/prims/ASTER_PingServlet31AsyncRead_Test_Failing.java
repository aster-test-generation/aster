/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet31AsyncRead_Test_Failing {
    private static String initTime;
    private static int hitCount;
    PingServlet31AsyncRead pingservlet31asyncread;
    HttpServlet httpservlet;
    HttpServletResponse httpservletresponse;
    HttpServletRequest httpservletrequest;
    ServletInputStream servletinputstream;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservlet31asyncread = new PingServlet31AsyncRead();
        doNothing().when(httpservlet).init(any());
        pingservlet31asyncread.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithNullConfig_zuBm1() {
        PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
        try {
            servlet.init(null);
            fail("Expected ServletException");
        } catch (ServletException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_AVfs0() throws Exception {
        PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doPost(request, response);
        assertTrue(response.getContentType().equals("text/html"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithStartAsync_qBrM2() throws Exception {
        PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        AsyncContext ac = request.startAsync();
        servlet.doPost(request, response);
        assertTrue(ac.hasOriginalRequestAndResponse());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithGetInputStream_noDF3() throws Exception {
        PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        ServletInputStream input = request.getInputStream();
        servlet.doPost(request, response);
        assertTrue(input.isReady());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_getServletInfo_PjmF0() {
        PingServlet31AsyncRead obj = new PingServlet31AsyncRead();
        String actual = obj.getServletInfo();
        String expected = "Basic dynamic HTML generation through a servlet";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        httpservletrequest = mock(HttpServletRequest.class);
        servletinputstream = mock(ServletInputStream.class);
        httpservlet = mock(HttpServlet.class);
        pingservlet31asyncread = new PingServlet31AsyncRead();
        when(httpservletrequest.getInputStream()).thenReturn(servletinputstream);
        pingservlet31asyncread.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletrequest, times(1)).getInputStream();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNullRequestAndResponse_YQTq3() throws ServletException, IOException {
        PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_XrkO0_nZDF0() throws ServletException, IOException {
        PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNullRequest_gTNn1_qLGH0() throws ServletException, IOException {
        PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
        HttpServletRequest request = null;
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNullResponse_qnSd2_NAUs0() throws ServletException, IOException {
        PingServlet31AsyncRead servlet = new PingServlet31AsyncRead();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = null;
        servlet.doGet(request, response);
    }
}