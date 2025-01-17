/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;

import java.util.concurrent.TimeUnit;
import javax.ws.rs.sse.OutboundSseEvent.Builder;
import javax.ws.rs.sse.SseEventSink;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_BroadcastResource_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterWithEmptyList_Ebyj0() {
    BroadcastResource resource = new BroadcastResource();
    SseEventSink mockEventSink = mock(SseEventSink.class);
    Builder mockBuilder = mock(Builder.class);
    when(mockBuilder.data(anyString())).thenReturn(mockBuilder);
    when(mockBuilder.build()).thenReturn(null);
    resource.register(mockEventSink);
    verify(mockEventSink).send(any());
  }
}