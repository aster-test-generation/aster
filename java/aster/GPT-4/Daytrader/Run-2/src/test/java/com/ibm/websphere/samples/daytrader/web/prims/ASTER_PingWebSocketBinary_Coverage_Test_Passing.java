/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.websocket.CloseReason;
import javax.websocket.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingWebSocketBinary_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnErrorWithActualException_OBSg1() {
        PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
        Throwable mockThrowable = mock(Throwable.class);
        doNothing().when(mockThrowable).printStackTrace();
        pingWebSocketBinary.onError(mockThrowable);
        verify(mockThrowable, times(1)).printStackTrace();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnCloseWhenSessionOpenThrowsIOException_SdjB0() throws Exception {
        Session mockSession = mock(Session.class);
        when(mockSession.isOpen()).thenReturn(true);
        doThrow(new IOException()).when(mockSession).close();
        PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
        CloseReason mockReason = mock(CloseReason.class);
        pingWebSocketBinary.onClose(mockSession, mockReason);
        verify(mockSession).close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOnCloseWhenSessionIsAlreadyClosed_zGKs1() throws Exception {
        Session mockSession = mock(Session.class);
        when(mockSession.isOpen()).thenReturn(false);
        PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
        CloseReason mockReason = mock(CloseReason.class);
        pingWebSocketBinary.onClose(mockSession, mockReason);
        verify(mockSession, never()).close();
    }
}