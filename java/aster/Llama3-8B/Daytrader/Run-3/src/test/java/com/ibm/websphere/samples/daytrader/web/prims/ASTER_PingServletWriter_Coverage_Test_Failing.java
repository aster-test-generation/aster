/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletWriter_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_tcdc0() {
        PingServletWriter pingServletWriter = new PingServletWriter();
        String servletInfo = pingServletWriter.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet using a PrintWriter", servletInfo);
    }
}