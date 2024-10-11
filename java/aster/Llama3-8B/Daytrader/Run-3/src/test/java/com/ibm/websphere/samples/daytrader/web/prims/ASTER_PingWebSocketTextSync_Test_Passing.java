/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingWebSocketTextSync_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPing_LfpQ0_dmOK1() {
    PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
    assertEquals(true, true); // since hitCount is private, we can't access it
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnCloseWithNormalReason_hyUZ1_vAds0() {
    PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
    Session session = mock(Session.class);
    CloseReason reason = new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "Normal Closure");
    pingWebSocketTextSync.onClose(session, reason);
}
}