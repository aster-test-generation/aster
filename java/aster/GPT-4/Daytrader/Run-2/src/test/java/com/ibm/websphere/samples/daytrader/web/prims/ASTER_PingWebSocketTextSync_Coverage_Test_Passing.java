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
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingWebSocketTextSync_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnClose_mlqd0() {
        PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
        Session mockSession = null; // Assuming session can be mocked or null for this test case
        CloseReason mockReason = new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "Normal Closure");
        pingWebSocketTextSync.onClose(mockSession, mockReason);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnErrorWithActualException_SXbZ1() {
        PingWebSocketTextSync pingWebSocketTextSync = new PingWebSocketTextSync();
        Throwable mockThrowable = mock(Throwable.class);
        doNothing().when(mockThrowable).printStackTrace();
        pingWebSocketTextSync.onError(mockThrowable);
        verify(mockThrowable, times(1)).printStackTrace();
    }
}