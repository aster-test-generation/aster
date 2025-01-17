/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;
import java.io.IOException;
import javax.servlet.ServletException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServlet2TwoPhase_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitSuperInit_svKG0() throws javax.servlet.ServletException {
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        servlet.init(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_qfSu0() {
        PingServlet2TwoPhase pingServlet2TwoPhase = new PingServlet2TwoPhase();
        String expected = "web primitive, tests Servlet to Session to Entity EJB and JMS -- 2-phase commit path";
        String actual = pingServlet2TwoPhase.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_EJac0_RkqY0() throws java.io.IOException, javax.servlet.ServletException {
    PingServlet2TwoPhase pingServlet2TwoPhase = new PingServlet2TwoPhase();
}
}