/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;

import java.util.concurrent.TimeUnit;
import javax.ws.rs.sse.Sse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_BroadcastResource_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSse2_fRuN1() {
        BroadcastResource broadcastResource = new BroadcastResource();
        Sse sse = mock(Sse.class);
        when(sse.newBroadcaster()).thenReturn(null);
        when(sse.newEventBuilder()).thenReturn(null);
        broadcastResource.setSse(sse);
        verify(sse, times(1)).newBroadcaster();
        verify(sse, times(1)).newEventBuilder();
    }
}