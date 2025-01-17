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
import static org.mockito.Mockito.mock;

public class Aster_PingWebSocketTextSync_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_GoaT0() {
        PingWebSocketTextSync testee = new PingWebSocketTextSync();
        Throwable t = new Throwable();
        testee.onError(t);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void onCloseTest_xzdy0_eYPG0() {
        PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
        Session session = mock(Session.class);
        CloseReason closeReason = new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "test");
        pingWebSocketTextSync.onClose(session, closeReason);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_NoThrowable_YFpl2_fid1() {
        PingWebSocketTextSync testee = new PingWebSocketTextSync();
        testee.onError(new Throwable());
    }
}