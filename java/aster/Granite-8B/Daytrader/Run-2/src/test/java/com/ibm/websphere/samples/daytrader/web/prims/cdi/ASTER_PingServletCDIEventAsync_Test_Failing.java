/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletCDIEventAsync_Test_Failing {
    private static int hitCount2;
    private static String initTime;
    private static int hitCount1;
    PingServletCDIEventAsync pingServletCDIEventAsync;
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    private HttpServletRequest mockRequest;
    private HttpServletResponse mockResponse;
    private PrintWriter mockPrintWriter;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServletCDIEventAsync = new PingServletCDIEventAsync();
        // Mock the init method of HttpServlet
        doNothing().when(httpServlet).init(any(ServletConfig.class));
        // Call the init method of PingServletCDIEventAsync
        pingServletCDIEventAsync.init(null);
        // Verify that the init method of HttpServlet is called
        verify(httpServlet).init(any(ServletConfig.class));
        // Add assertions to check the behavior of the init method
        assertEquals(0, hitCount1);
        assertEquals(0, hitCount2);
        assertNotNull(initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_fBnj1() throws IOException {
        pingServletCDIEventAsync.doGet(mockRequest, mockResponse);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_1() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServletCDIEventAsync = new PingServletCDIEventAsync();
        // Mock the init method of HttpServlet
        doNothing().when(httpServlet).init(any(ServletConfig.class));
        // Call the init method of PingServletCDIEventAsync
        pingServletCDIEventAsync.init(null);
        // Verify that the init method of HttpServlet is called
        verify(httpServlet).init(any(ServletConfig.class));
        // Add assertions to check the behavior of the init method
        assertEquals(0, hitCount1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_2() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServletCDIEventAsync = new PingServletCDIEventAsync();
        // Mock the init method of HttpServlet
        doNothing().when(httpServlet).init(any(ServletConfig.class));
        // Call the init method of PingServletCDIEventAsync
        pingServletCDIEventAsync.init(null);
        // Verify that the init method of HttpServlet is called
        verify(httpServlet).init(any(ServletConfig.class));
        // Add assertions to check the behavior of the init method
        assertEquals(0, hitCount2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_3() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServletCDIEventAsync = new PingServletCDIEventAsync();
        // Mock the init method of HttpServlet
        doNothing().when(httpServlet).init(any(ServletConfig.class));
        // Call the init method of PingServletCDIEventAsync
        pingServletCDIEventAsync.init(null);
        // Verify that the init method of HttpServlet is called
        verify(httpServlet).init(any(ServletConfig.class));
        // Add assertions to check the behavior of the init method
        assertNotNull(initTime);
    }
}