/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;
import javax.servlet.ServletException;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletSimple_Coverage_Test_Passing {
    PingServletSimple pingServletSimple;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit4_EaaX3() throws javax.servlet.ServletException {
        pingServletSimple = new PingServletSimple();
        pingServletSimple.init(null);
        assertNotNull(pingServletSimple);
    }
}