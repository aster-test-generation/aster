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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingWebSocketTextSync_Test_Failing {
    PingWebSocketTextSync pingwebsockettextsync;
    Session session;
    CloseReason reason;
    private Session currentSession = mock(Session.class);
    private Integer hitCount = 0;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testonClose() throws Exception {
        pingwebsockettextsync = new PingWebSocketTextSync();
        session = mock(Session.class);
        reason = mock(CloseReason.class);
        pingwebsockettextsync.onClose(session, reason);
        verify(session, times(1)).close(reason);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPing_PQVL0() {
        PingWebSocketTextSync ping = new PingWebSocketTextSync();
        ping.ping("text");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingWithCoverage_sXGb1() {
        PingWebSocketTextSync ping = new PingWebSocketTextSync();
        ping.ping("text");
        ping.ping("text");
        ping.ping("text");
        ping.ping("text");
        ping.ping("text");
        ping.ping("text");
        ping.ping("text");
        ping.ping("text");
        ping.ping("text");
        ping.ping("text");
    }
}