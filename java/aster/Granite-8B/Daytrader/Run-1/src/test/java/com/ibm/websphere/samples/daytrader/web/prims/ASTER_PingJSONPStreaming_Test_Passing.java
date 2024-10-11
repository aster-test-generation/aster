/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.Date;
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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJSONPStreaming_Test_Passing {
    private static String initTime;
    private static int hitCount;
    PingJSONPStreaming pingjsonpstreaming;
    HttpServlet httpservlet;
    @Mock
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    @Mock
    ServletOutputStream servletOutputStream;
    PingJSONPStreaming pingJSONPStreaming;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_1() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingjsonpstreaming = new PingJSONPStreaming();
        // Mock the init method
        pingjsonpstreaming.init(httpservlet);
        // Verify that the initTime and hitCount variables are set correctly
        verify(httpservlet, times(1)).init(any());
        assertEquals(initTime, new java.util.Date().toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_2() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingjsonpstreaming = new PingJSONPStreaming();
        // Mock the init method
        pingjsonpstreaming.init(httpservlet);
        // Verify that the initTime and hitCount variables are set correctly
        verify(httpservlet, times(1)).init(any());
        assertEquals(hitCount, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingjsonpstreaming = new PingJSONPStreaming();
        // Mock the init method
        pingjsonpstreaming.init(httpservlet);
        // Verify that the initTime and hitCount variables are set correctly
        verify(httpservlet, times(1)).init(any());
        assertEquals(initTime, new java.util.Date().toString());
        assertEquals(hitCount, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_ANeU0() throws ServletException, IOException {
        PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getParameter("callback")).thenReturn("callbackFunction");
        when(req.getParameter("ping")).thenReturn("pingValue");
        pingJSONPStreaming.doPost(req, res);
        verify(res, times(1)).setContentType("application/javascript");
        verify(res, times(1)).setCharacterEncoding("UTF-8");
        verify(res, times(1)).getWriter();
        verify(res, times(1)).getWriter().write("callbackFunction({\"ping\":\"pingValue\"})");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_CoJt0() {
        PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
        String actual = pingJSONPStreaming.getServletInfo();
        String expected = "Basic JSON generation and parsing in a servlet";
        assertEquals(expected, actual);
    }
}