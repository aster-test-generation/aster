/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingEJBLocalDecorator_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMsg_xFmc0() {
    PingEJBLocalDecorator pingEJBLocalDecorator = new PingEJBLocalDecorator();
    pingEJBLocalDecorator.ejb = new PingEJBLocal() {
        @Override
        public String getMsg() {
            return "Ping";
        }
    };
    String result = pingEJBLocalDecorator.getMsg();
    assertEquals("Decorated Ping", result);
}
}