/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketTextSync_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_FbVm0() {
        PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
        Throwable throwable = new IOException("Test IOException");
        pingWebSocketTextSync.onError(throwable);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnErrorTimeoutException_WMwp1_EwRn1() {
        PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
        java.util.concurrent.TimeoutException throwable = new java.util.concurrent.TimeoutException();
        pingWebSocketTextSync.onError(throwable);
    }
}