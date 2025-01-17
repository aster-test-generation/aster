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

public class Aster_PingWebSocketBinary_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnOpenWithNullSession_xZLM1() {
        PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
        pingWebSocketBinary.onOpen(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void onClose_sessionisOpen_closeSession_TewR0() throws IOException {
        PingWebSocketBinary cut = new PingWebSocketBinary();
        Session session = mock(Session.class);
        CloseReason reason = mock(CloseReason.class);
        when(session.isOpen()).thenReturn(true);
        cut.onClose(session, reason);
        verify(session, times(1)).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void onClose_sessionisOpen_printStacktrace_MoAQ1() throws IOException {
        PingWebSocketBinary cut = new PingWebSocketBinary();
        Session session = mock(Session.class);
        CloseReason reason = mock(CloseReason.class);
        IOException e = new IOException();
        when(session.isOpen()).thenReturn(true);
        cut.onClose(session, reason);
        verify(session, times(1)).close();
        verify(e, times(1)).printStackTrace();
    }
}