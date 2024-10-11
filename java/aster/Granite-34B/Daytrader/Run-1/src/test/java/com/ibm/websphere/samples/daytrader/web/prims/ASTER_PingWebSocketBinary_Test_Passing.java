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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingWebSocketBinary_Test_Passing {
    PingWebSocketBinary pingwebsocketbinary;
    @Mock
    Session session;
    @Mock
    CloseReason reason;
    private Session currentSession = null;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testonClose() throws Exception {
        pingwebsocketbinary = new PingWebSocketBinary();
        lenient().when(session.isOpen()).thenReturn(true);
        pingwebsocketbinary.onClose(session, reason);
        verify(session, times(1)).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_poyZ0() {
        PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
        Throwable t = new Throwable();
        pingWebSocketBinary.onError(t);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnErrorWithNullParameter_hUSw1() {
        PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
        pingWebSocketBinary.onError(new Throwable());
    }
}