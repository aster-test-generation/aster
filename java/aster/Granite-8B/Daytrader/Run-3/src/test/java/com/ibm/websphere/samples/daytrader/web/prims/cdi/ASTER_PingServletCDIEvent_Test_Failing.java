/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletCDIEvent_Test_Failing {
    private static int hitCount;
    private static String initTime;
    PingServletCDIEvent pingservletcdievent;
    HttpServlet httpservlet;
    PingServletCDIEvent pingServletCDIEvent;
    HttpServlet httpServlet;
    HttpServletResponse httpServletResponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletcdievent = new PingServletCDIEvent();
        pingservletcdievent.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertEquals(0, hitCount);
        assertNotNull(initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_RBxO1() throws ServletException {
        PingServletCDIEvent servlet = new PingServletCDIEvent();
        ServletConfig config = Mockito.mock(ServletConfig.class);
        servlet.init(config);
        Mockito.verify(config).getInitParameter("initTime");
        Mockito.verify(config).getInitParameter("hitCount");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_aAVa0() throws IOException {
        PingServletCDIEvent servlet = new PingServletCDIEvent();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter pw = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(pw);
        servlet.doGet(request, response);
        verify(response, times(1)).getWriter();
        verify(pw, times(1)).write(anyString());
        verify(pw, times(1)).flush();
        verify(pw, times(1)).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_1() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletcdievent = new PingServletCDIEvent();
        pingservletcdievent.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_2() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletcdievent = new PingServletCDIEvent();
        pingservletcdievent.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertNotNull(initTime);
    }
}