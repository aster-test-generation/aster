/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.ServletException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingJSONPObjectFactory_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_TbQc0() {
        PingJSONPObjectFactory pingJSONPObjectFactory = new PingJSONPObjectFactory();
        String expected = "Basic JSON generation and parsing in a servlet";
        String actual = pingJSONPObjectFactory.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_zuaM0_ocno0() throws javax.servlet.ServletException {
    PingJSONPObjectFactory pingJSONPObjectFactory = new PingJSONPObjectFactory();
}
}