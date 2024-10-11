/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletCDIEventAsync_Test_Failing {
    private static int hitCount2;
    private static String initTime;
    private static int hitCount1;
    PingServletCDIEventAsync pingservletcdieventasync;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        pingservletcdieventasync = mock(PingServletCDIEventAsync.class);
        ServletConfig config = mock(ServletConfig.class);
        when(config.getInitParameter("initTime")).thenReturn(initTime);
        when(config.getInitParameter("hitCount1")).thenReturn(String.valueOf(hitCount1));
        when(config.getInitParameter("hitCount2")).thenReturn(String.valueOf(hitCount2));
        pingservletcdieventasync.init(config);
        verify(pingservletcdieventasync, times(1)).init(config);
        verifyNoMoreInteractions(pingservletcdieventasync);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnAsyncEvent2_jCCx0() {
        PingServletCDIEventAsync pingServletCDIEventAsync = new PingServletCDIEventAsync();
        String event = "event";
        pingServletCDIEventAsync.onAsyncEvent2(event);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        pingservletcdieventasync = mock(PingServletCDIEventAsync.class);
        hitCount1 = 0;
        hitCount2 = 0;
        initTime = "sometime";
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter pw = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(pw);
        when(pingservletcdieventasync.cdiEventProducer).thenReturn(new CDIEventProducer());
        pingservletcdieventasync.doGet(request, response);
        verify(pingservletcdieventasync, times(1)).cdiEventProducer.produceAsyncEvent();
        verify(pw, times(1)).write("<html><head><title>Ping Servlet CDI Event Async</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet CDI Event Async<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>");
        verify(pw, times(1)).write("<B>hitCount1: " + hitCount1 + "</B><BR><B>hitCount2: " + hitCount2 + "</B></body></html>");
        verify(pw, times(1)).flush();
        verify(pw, times(1)).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_kJHm0() throws Exception {
        PingServletCDIEventAsync servlet = new PingServletCDIEventAsync();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
    }
}