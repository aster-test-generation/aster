/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.naming.InitialContext;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingWebSocketJson_Test_Passing {
private Session currentSession = null;
private Integer sentHitCount = null;
private Integer receivedHitCount = null;
@Mock
    private Session session;
@Mock
    private InitialContext initialContext;
@Mock
    private ManagedThreadFactory managedThreadFactory;
private PingWebSocketJson pingwebsocketjson;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnError_zawH0() {
        PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
        Throwable throwable = new IOException("Test IOException");
        pingWebSocketJson.onError(throwable);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnErrorTimeoutException_NIJz1_YcWh0() {
    PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
    java.util.concurrent.TimeoutException throwable = new java.util.concurrent.TimeoutException();
    pingWebSocketJson.onError(throwable);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnClose_KIkY0_doxq0() {
    PingWebSocketJson pingWebSocketJson = new PingWebSocketJson();
    CloseReason reason = new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "Test reason");
    pingWebSocketJson.onClose(null, reason);
}
}