/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingWebSocketTextSync_Test_Failing {
    PingWebSocketTextSync target = new PingWebSocketTextSync();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPing_nEFz0() {
        String text = "Hello, World!";
        target.ping(text);
        assertEquals("1", text);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingWithNullText_RyDj1() {
        String text = null;
        target.ping(text);
        assertEquals(null, text);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingWithEmptyText_vlgl2() {
        String text = "";
        target.ping(text);
        assertEquals("", text);
    }
}