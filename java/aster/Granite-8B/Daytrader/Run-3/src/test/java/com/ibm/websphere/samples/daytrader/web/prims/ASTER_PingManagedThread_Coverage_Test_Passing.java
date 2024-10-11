/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingManagedThread_Coverage_Test_Passing {
    PingManagedThread pingManagedThread;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithPrintln6_qtmr8() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithAsyncContext_HRBa0() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        AsyncContext asyncContext = mock(AsyncContext.class);
        when(req.startAsync()).thenReturn(asyncContext);
        pingManagedThread = new PingManagedThread();
        pingManagedThread.doGet(req, res);
        verify(req, times(1)).startAsync();
    }
}