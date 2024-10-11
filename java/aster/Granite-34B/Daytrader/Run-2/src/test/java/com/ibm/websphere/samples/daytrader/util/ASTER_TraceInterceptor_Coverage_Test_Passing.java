/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import javax.interceptor.InvocationContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_TraceInterceptor_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogMethodEntryWithNullCtx_AaPg2() throws Exception {
        TraceInterceptor traceInterceptor = new TraceInterceptor();
        try {
            traceInterceptor.logMethodEntry(null);
            fail("Exception expected");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogMethodEntry_AntF0_FRUa0() throws Exception {
        TraceInterceptor traceInterceptor = new TraceInterceptor();
        InvocationContext ctx = mock(InvocationContext.class);
        Object result = traceInterceptor.logMethodEntry(ctx);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogMethodEntryWithException_kRlQ1_GFUP0() throws Exception {
        TraceInterceptor traceInterceptor = new TraceInterceptor();
        InvocationContext ctx = mock(InvocationContext.class);
        try {
            traceInterceptor.logMethodEntry(ctx);
            fail("Exception expected");
        } catch (Exception e) {
        }
    }
}