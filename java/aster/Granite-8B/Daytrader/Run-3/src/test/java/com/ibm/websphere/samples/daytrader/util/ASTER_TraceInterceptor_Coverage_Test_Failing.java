/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TraceInterceptor_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogMethodEntry_eXoY0() throws java.lang.Exception {
        TraceInterceptor traceInterceptor = new TraceInterceptor();
        traceInterceptor.logMethodEntry(null);
    }
}