/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BroadcastResource_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegister_NullEventSink_ThrowsNullPointerException_AvjA6() {
        BroadcastResource broadcastResource = new BroadcastResource();
        try {
            broadcastResource.register(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("eventSink", e.getMessage());
        }
    }
}