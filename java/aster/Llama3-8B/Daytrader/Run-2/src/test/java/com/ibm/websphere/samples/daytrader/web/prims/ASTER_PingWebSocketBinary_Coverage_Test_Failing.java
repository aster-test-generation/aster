/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingWebSocketBinary_Coverage_Test_Failing {
    private Session session;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnClose_OpenSession_sFKb0() {
        PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
        CloseReason reason = new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "Normal closure");
        pingWebSocketBinary.onClose(session, reason);
    }
}