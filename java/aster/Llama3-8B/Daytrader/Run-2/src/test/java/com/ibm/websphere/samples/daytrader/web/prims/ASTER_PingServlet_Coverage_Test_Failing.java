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
public class Aster_PingServlet_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_TVnc0() {
        PingServlet pingServlet = new PingServlet();
        String expected = "Basic dynamic HTML generation through a servlet";
        String actual = pingServlet.getServletInfo();
        assertEquals(expected, actual);
    }
}