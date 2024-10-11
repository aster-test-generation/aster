/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketTextAsync_Test_Passing {
    private PingWebSocketTextAsync target;
    private Session currentSession;
    private int hitCount;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void onErrorTest_cJcI0() throws Exception {
        PingWebSocketTextAsync pingWebSocketTextAsync = new PingWebSocketTextAsync();
        Throwable t = new Throwable();
        pingWebSocketTextAsync.onError(t);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void onClose(final Session session, CloseReason reason)
    {
        currentSession = session;
        hitCount = 0;
    }
}