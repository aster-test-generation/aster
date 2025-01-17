/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.annotation.Priority;
import javax.enterprise.event.ObservesAsync;
import javax.interceptor.Interceptor;
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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletCDIEventAsync_Test_Passing {
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
    public void onAsyncEvent2(@ObservesAsync @Priority(Interceptor.Priority.APPLICATION) @HitAsync String event)
    {
        hitCount2++;
    }
}