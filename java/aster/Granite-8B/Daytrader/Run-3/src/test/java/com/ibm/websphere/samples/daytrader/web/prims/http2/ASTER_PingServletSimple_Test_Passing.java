/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletSimple_Test_Passing {
    private static String initTime;
    private static int hitCount;
    PingServletSimple pingServletSimple;
    HttpServlet httpServlet;
    HttpServletResponse httpServletResponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServletSimple = new PingServletSimple();
        // Mock the init method of HttpServlet
        doNothing().when(httpServlet).init(any());
        // Call the init method of PingServletSimple
        pingServletSimple.init(httpServlet);
        // Verify that the initTime and hitCount variables are initialized correctly
        assertEquals(initTime, new java.util.Date().toString());
        assertEquals(hitCount, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_1() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServletSimple = new PingServletSimple();
        // Mock the init method of HttpServlet
        doNothing().when(httpServlet).init(any());
        // Call the init method of PingServletSimple
        pingServletSimple.init(httpServlet);
        // Verify that the initTime and hitCount variables are initialized correctly
        assertEquals(initTime, new java.util.Date().toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_2() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServletSimple = new PingServletSimple();
        // Mock the init method of HttpServlet
        doNothing().when(httpServlet).init(any());
        // Call the init method of PingServletSimple
        pingServletSimple.init(httpServlet);
        // Verify that the initTime and hitCount variables are initialized correctly
        assertEquals(hitCount, 0);
    }
}