/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketTextSync_Test_Passing {
    private PingWebSocketTextSync target;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_bgTx0() {
        PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
        Throwable t = new Throwable();
        pingWebSocketTextSync.onError(t);
    }
}