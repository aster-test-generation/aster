/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
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
    @Mock
    private ServletConfig servletConfig;
    @InjectMocks
    private PingServletSimple pingservletsimple;
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private PrintWriter printWriter;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        initTime = "2022-01-01 00:00:00";
        hitCount = 0;
        // Set up the response
        when(response.getWriter()).thenReturn(printWriter);
        // Set up the request
        when(request.getMethod()).thenReturn("GET");
        // Call the doGet method
        pingservletsimple.doGet(request, response);
        // Verify the hit count
        assertEquals(1, hitCount);
        // Verify the response
        verify(printWriter, times(1)).write(anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_bWlj0() throws Exception {
        PingServletSimple pingServletSimple = new PingServletSimple();
        HttpServletRequest req = null;
        HttpServletResponse resp = null;
        PrintWriter respWriter = null;
        pingServletSimple.doGet(req, resp);
    }
}