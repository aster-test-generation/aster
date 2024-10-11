/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
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
public class Aster_PingServlet_Test_Passing {
    private static int hitCount;
    private static String initTime;
    PingServlet pingservlet;
    HttpServlet httpservlet;
    @Mock
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    @Mock
    ServletOutputStream servletOutputStream;
    PingServlet pingServlet;
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_1() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservlet = new PingServlet();
        // Mock the init method of HttpServlet
        doNothing().when(httpservlet).init(any());
        // Call the init method of PingServlet
        pingservlet.init(null);
        // Assert that the initTime and hitCount variables are set correctly
        assertEquals(initTime, new java.util.Date().toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_2() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservlet = new PingServlet();
        // Mock the init method of HttpServlet
        doNothing().when(httpservlet).init(any());
        // Call the init method of PingServlet
        pingservlet.init(null);
        // Assert that the initTime and hitCount variables are set correctly
        assertEquals(hitCount, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletInfo_SAyp0() throws Exception {
        PingServlet pingServlet = new PingServlet();
        String servletInfo = pingServlet.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_init_aUwN4() throws Exception {
        PingServlet pingServlet = new PingServlet();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservlet = new PingServlet();
        // Mock the init method of HttpServlet
        doNothing().when(httpservlet).init(any());
        // Call the init method of PingServlet
        pingservlet.init(null);
        // Assert that the initTime and hitCount variables are set correctly
        assertEquals(initTime, new java.util.Date().toString());
        assertEquals(hitCount, 0);
    }
}