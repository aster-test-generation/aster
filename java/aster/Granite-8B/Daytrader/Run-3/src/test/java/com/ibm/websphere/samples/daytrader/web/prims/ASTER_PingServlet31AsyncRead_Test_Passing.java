/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.ReadListener;
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
public class Aster_PingServlet31AsyncRead_Test_Passing {
    private static String initTime;
    private static int hitCount;
    PingServlet31AsyncRead pingservlet31asyncread;
    HttpServlet httpservlet;
    @Mock
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    @Mock
    HttpServletRequest httpServletRequest;
    @Mock
    ServletInputStream servletInputStream;
    PingServlet31AsyncRead pingServlet31AsyncRead;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservlet31asyncread = new PingServlet31AsyncRead();
        pingservlet31asyncread.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertEquals(initTime, new java.util.Date().toString());
        assertEquals(hitCount, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost() throws Exception {
        pingServlet31AsyncRead = new PingServlet31AsyncRead();
        when(httpServletRequest.getInputStream()).thenReturn(servletInputStream);
        pingServlet31AsyncRead.doPost(httpServletRequest, httpServletResponse);
        verify(httpServletResponse).setContentType("text/html");
        verify(httpServletRequest).startAsync();
        verify(servletInputStream).setReadListener(any(ReadListener.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet() throws Exception {
        httpServlet = mock(HttpServlet.class);
        httpServletResponse = mock(HttpServletResponse.class);
        httpServletRequest = mock(HttpServletRequest.class);
        servletInputStream = mock(ServletInputStream.class);
        pingServlet31AsyncRead = new PingServlet31AsyncRead();
        when(httpServletRequest.getInputStream()).thenReturn(servletInputStream);
        pingServlet31AsyncRead.doGet(httpServletRequest, httpServletResponse);
        verify(httpServletRequest).getInputStream();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_VtDj0() {
        PingServlet31AsyncRead pingServlet31AsyncRead = new PingServlet31AsyncRead();
        String servletInfo = pingServlet31AsyncRead.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_1() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservlet31asyncread = new PingServlet31AsyncRead();
        pingservlet31asyncread.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertEquals(initTime, new java.util.Date().toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_2() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservlet31asyncread = new PingServlet31AsyncRead();
        pingservlet31asyncread.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertEquals(hitCount, 0);
    }
}