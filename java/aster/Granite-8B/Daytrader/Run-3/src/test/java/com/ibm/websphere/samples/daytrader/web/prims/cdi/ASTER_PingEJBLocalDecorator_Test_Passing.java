/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingEJBLocalDecorator_Test_Passing {
    PingEJBLocal ejb = new PingEJBLocal();
    PingEJBLocalDecorator decorator = new PingEJBLocalDecorator();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetMsg_RfbK0() {
        String expected = "Decorated " + ejb.getMsg();
        String actual = decorator.getMsg();
        assertEquals(expected, actual);
    }
}