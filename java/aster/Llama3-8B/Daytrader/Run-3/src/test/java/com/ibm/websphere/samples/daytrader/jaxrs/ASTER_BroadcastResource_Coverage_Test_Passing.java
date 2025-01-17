/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;
import javax.ws.rs.sse.SseEventSink;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BroadcastResource_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_Ocri0() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegister_EmptyList_SendWelcomeMessage_dTXe0() {
        BroadcastResource broadcastResource = new BroadcastResource();
        SseEventSink eventSink = mock(SseEventSink.class);
        broadcastResource.register(eventSink);
        verify(eventSink, times(1)).send(argThat(message -> message.toString().equals("welcome!")));
}
}