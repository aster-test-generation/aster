/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TraceInterceptor_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogMethodEntry_oYTp0() throws Exception {
        TraceInterceptor traceInterceptor = new TraceInterceptor();
        String expectedMessage = "TraceInterceptor:logMethodEntry";
        Object result = traceInterceptor.logMethodEntry(null);
        assertEquals(expectedMessage, result);
    }
}