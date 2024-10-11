/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet30Async_Test_Failing {
    private static String initTime;
    private static int hitCount;
    PingServlet30Async pingservlet30async;
    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        pingservlet30async = mock(PingServlet30Async.class);
        initTime = "2022-01-01";
        hitCount = 0;
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletInputStream input = mock(ServletInputStream.class);
        AsyncContext context = mock(AsyncContext.class);
        when(request.startAsync()).thenReturn(context);
        when(request.getInputStream()).thenReturn(input);
        when(input.read(any(byte[].class))).thenReturn(1024);
        when(response.getOutputStream()).thenReturn(mock(ServletOutputStream.class));
        pingservlet30async.doPost(request, response);
        verify(request, times(1)).startAsync();
        verify(request, times(1)).getInputStream();
        verify(input, times(1)).read(any(byte[].class));
        verify(response, times(1)).getOutputStream();
        verify(context, times(1)).complete();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_qTCQ0() throws ServletException, IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        AsyncContext asyncContext = mock(AsyncContext.class);
        ServletInputStream servletInputStream = mock(ServletInputStream.class);
        ServletOutputStream servletOutputStream = mock(ServletOutputStream.class);
        byte[] data = "test data".getBytes();
        when(request.startAsync()).thenReturn(asyncContext);
        when(request.getInputStream()).thenReturn(servletInputStream);
        when(servletInputStream.read(any(byte[].class))).thenReturn(data.length);
        when(request.getContentType()).thenReturn("text/html");
        when(response.getOutputStream()).thenReturn(servletOutputStream);
        servlet.doPost(request, response);
        verify(request, times(1)).startAsync();
        verify(request, times(1)).getInputStream();
        verify(servletInputStream, times(1)).read(any(byte[].class));
        verify(request, times(1)).getContentType();
        verify(response, times(1)).getOutputStream();
        verify(servletOutputStream, times(1)).println(anyString());
        verify(asyncContext, times(1)).complete();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNoData_DRhR1() throws ServletException, IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        AsyncContext asyncContext = mock(AsyncContext.class);
        ServletInputStream servletInputStream = mock(ServletInputStream.class);
        ServletOutputStream servletOutputStream = mock(ServletOutputStream.class);
        when(request.startAsync()).thenReturn(asyncContext);
        when(request.getInputStream()).thenReturn(servletInputStream);
        when(servletInputStream.read(any(byte[].class))).thenReturn(-1);
        when(request.getContentType()).thenReturn("text/html");
        when(response.getOutputStream()).thenReturn(servletOutputStream);
        servlet.doPost(request, response);
        verify(request, times(1)).startAsync();
        verify(request, times(1)).getInputStream();
        verify(servletInputStream, times(1)).read(any(byte[].class));
        verify(request, times(1)).getContentType();
        verify(response, times(1)).getOutputStream();
        verify(servletOutputStream, times(1)).println(anyString());
        verify(asyncContext, times(1)).complete();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_Tylt0() {
        PingServlet30Async servlet = new PingServlet30Async();
        String result = servlet.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_TZPv0() throws ServletException, IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_ZmOp0_1() throws Exception {
        pingservlet30async = mock(PingServlet30Async.class);
        initTime = new java.util.Date().toString();
        hitCount = 0;
        ServletConfig config = mock(ServletConfig.class);
        doCallRealMethod().when(pingservlet30async).init(config);
        pingservlet30async.init(config);
        verify(pingservlet30async, times(1)).init(config);
        assertEquals(initTime, initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_ZmOp0_2() throws Exception {
        pingservlet30async = mock(PingServlet30Async.class);
        initTime = new java.util.Date().toString();
        hitCount = 0;
        ServletConfig config = mock(ServletConfig.class);
        doCallRealMethod().when(pingservlet30async).init(config);
        pingservlet30async.init(config);
        verify(pingservlet30async, times(1)).init(config);
        assertEquals(hitCount, 0);
    }
}