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
public class Aster_PingServlet2Session2CMROne2One_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_JlRD0() {
        PingServlet2Session2CMROne2One servlet = new PingServlet2Session2CMROne2One();
        String expected = "web primitive, tests Servlet to Entity EJB path";
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_WKoO0_zrci0() throws javax.servlet.ServletException, java.io.IOException {
    PingServlet2Session2CMROne2One pingServlet2Session2CMROne2One = new PingServlet2Session2CMROne2One();
}
}