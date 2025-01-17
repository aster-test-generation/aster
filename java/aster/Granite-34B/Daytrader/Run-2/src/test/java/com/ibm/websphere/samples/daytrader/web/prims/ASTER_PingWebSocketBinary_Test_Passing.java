/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingWebSocketBinary_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_BpqA0() {
        PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
        Throwable t = new Throwable();
        pingWebSocketBinary.onError(t);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnErrorWithNoThrowable_HSbI2() {
        PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
        pingWebSocketBinary.onError(new Throwable());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnCloseWhenSessionisOpen_ytVv0_iIcQ0() {
        PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
        Session session = mock(Session.class);
        CloseReason reason = new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "test");
        try {
            when(session.isOpen()).thenReturn(true);
            pingWebSocketBinary.onClose(session, reason);
            verify(session, times(1)).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnCloseWhenSessionisClosed_rvtg1_zHek0() {
        PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
        Session session = mock(Session.class);
        CloseReason reason = new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "test");
        try {
            when(session.isOpen()).thenReturn(false);
            pingWebSocketBinary.onClose(session, reason);
            verify(session, times(0)).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}