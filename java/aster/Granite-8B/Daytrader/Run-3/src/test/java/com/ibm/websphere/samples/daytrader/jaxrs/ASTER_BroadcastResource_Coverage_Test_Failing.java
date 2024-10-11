/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.jaxrs;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BroadcastResource_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEventStreamCdi_HpAr0() {
        BroadcastResource broadcastResource = new BroadcastResource();
        broadcastResource.eventStreamCdi(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEventStreamCdi1_ZmIP1() {
        BroadcastResource broadcastResource = new BroadcastResource();
        broadcastResource.eventStreamCdi("price");
    }
}