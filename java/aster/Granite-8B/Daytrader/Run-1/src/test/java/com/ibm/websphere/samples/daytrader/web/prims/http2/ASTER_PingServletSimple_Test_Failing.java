/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;

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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletSimple_Test_Failing {
    private static String initTime;
    private static int hitCount;
    PingServletSimple pingservletsimple;
    HttpServlet httpservlet;
    HttpServletResponse httpservletresponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletsimple = new PingServletSimple();
        pingservletsimple.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitServletConfig_iWkn0() throws ServletException {
        PingServletSimple pingServletSimple = new PingServletSimple();
        ServletConfig config = mock(ServletConfig.class);
        pingServletSimple.init(config);
        verify(config).getInitParameter("initTime");
        verify(config).getInitParameter("hitCount");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNullRequest_pUfB0() throws ServletException, IOException {
        PingServletSimple servlet = new PingServletSimple();
        servlet.doGet(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithValidRequest_GbQU1() throws ServletException, IOException {
        PingServletSimple servlet = new PingServletSimple();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doGet(request, response);
        verify(response, times(1)).getWriter();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithValidRequestAndWriter_RXAm2() throws ServletException, IOException {
        PingServletSimple servlet = new PingServletSimple();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter writer = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(writer);
        servlet.doGet(request, response);
        verify(writer, times(1)).write(anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNullRequest_pUfB0_fid1() throws ServletException, IOException {
        PingServletSimple servlet = new PingServletSimple();
        servlet.init(null);
        servlet.doGet(null, null);
    }
}