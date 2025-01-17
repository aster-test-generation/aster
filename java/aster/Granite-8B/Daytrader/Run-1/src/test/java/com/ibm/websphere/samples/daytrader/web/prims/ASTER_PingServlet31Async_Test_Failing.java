/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet31Async_Test_Failing {
    private static String initTime;
    private static int hitCount;
    PingServlet31Async pingServlet31Async;
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    @Mock
    HttpServletRequest httpServletRequest;
    @Mock
    ServletInputStream servletInputStream;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServlet31Async = new PingServlet31Async();
        pingServlet31Async.init(httpServlet);
        verify(httpServlet, times(1)).init(any(ServletConfig.class));
        assertEquals(initTime, new java.util.Date().toString());
        assertEquals(hitCount, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost() throws Exception {
        pingServlet31Async = new PingServlet31Async();
        when(httpServletRequest.getInputStream()).thenReturn(servletInputStream);
        pingServlet31Async.doPost(httpServletRequest, httpServletResponse);
        verify(httpServletResponse).setContentType("text/html");
        verify(httpServletRequest).startAsync();
        verify(servletInputStream).setReadListener(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_jvKF0() {
        PingServlet31Async pingServlet31Async = new PingServlet31Async();
        String servletInfo = pingServlet31Async.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet() throws Exception {
        httpServletResponse = mock(HttpServletResponse.class);
        httpServletRequest = mock(HttpServletRequest.class);
        servletInputStream = mock(ServletInputStream.class);
        httpServlet = mock(HttpServlet.class);
        pingServlet31Async = new PingServlet31Async();
        when(httpServletRequest.getInputStream()).thenReturn(servletInputStream);
        pingServlet31Async.doGet(httpServletRequest, httpServletResponse);
        verify(httpServletRequest).getInputStream();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_1() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServlet31Async = new PingServlet31Async();
        pingServlet31Async.init(httpServlet);
        verify(httpServlet, times(1)).init(any(ServletConfig.class));
        assertEquals(initTime, new java.util.Date().toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_2() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServlet31Async = new PingServlet31Async();
        pingServlet31Async.init(httpServlet);
        verify(httpServlet, times(1)).init(any(ServletConfig.class));
        assertEquals(hitCount, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_fid2() throws Exception {
        PingServlet31Async pingServlet31Async = new PingServlet31Async();
        when(httpServletRequest.getInputStream()).thenReturn(servletInputStream);
        pingServlet31Async.doPost(httpServletRequest, httpServletResponse);
        verify(httpServletResponse).setContentType("text/html");
        verify(httpServletRequest).startAsync();
        verify(servletInputStream).setReadListener(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_fid2() throws Exception {
        httpServletResponse = mock(HttpServletResponse.class);
        httpServletRequest = mock(HttpServletRequest.class);
        servletInputStream = mock(ServletInputStream.class);
        pingServlet31Async = new PingServlet31Async();
        when(httpServletRequest.getInputStream()).thenReturn(servletInputStream);
        pingServlet31Async.doGet(httpServletRequest, httpServletResponse);
        verify(httpServletRequest).getInputStream();
    }
}