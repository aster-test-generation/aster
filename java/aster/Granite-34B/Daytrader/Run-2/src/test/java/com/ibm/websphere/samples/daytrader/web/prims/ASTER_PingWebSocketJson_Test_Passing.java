/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.naming.InitialContext;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedConstruction;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingWebSocketJson_Test_Passing {
    private Session currentSession = null;
    private Integer sentHitCount = null;
    private Integer receivedHitCount = null;
    PingWebSocketJson pingwebsocketjson;
    InitialContext initialcontext;
    MockedConstruction<InitialContext> mockedInitialContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_reZc0() {
        PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
        Throwable t = new Throwable();
        pingWebSocketJson.onError(t);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnClose_dYDl0_pDMt0() {
        PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
        Session session = mock(Session.class);
        CloseReason closeReason = new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "NORMAL_CLOSURE");
        pingWebSocketJson.onClose(session, closeReason);
    }
}