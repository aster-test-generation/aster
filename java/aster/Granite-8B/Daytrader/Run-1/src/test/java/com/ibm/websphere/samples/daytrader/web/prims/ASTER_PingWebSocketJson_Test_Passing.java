/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.naming.InitialContext;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingWebSocketJson_Test_Passing {
    private Session currentSession = null;
    private Integer sentHitCount = null;
    private Integer receivedHitCount = null;
    @Mock
    private Session session;
    @Mock
    private ManagedThreadFactory mtf;
    @Mock
    private InitialContext context;
    @InjectMocks
    private PingWebSocketJson pingWebSocketJson;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_gQtu0() {
        PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
        Throwable t = new Throwable();
        pingWebSocketJson.onError(t);
    }
}