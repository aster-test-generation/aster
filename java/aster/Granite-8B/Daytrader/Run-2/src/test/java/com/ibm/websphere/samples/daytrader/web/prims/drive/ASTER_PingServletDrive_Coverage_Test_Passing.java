/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.drive;
import javax.servlet.ServletException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletDrive_Coverage_Test_Passing {
    PingServletDrive pingServletDrive;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void init_CXtF0() throws javax.servlet.ServletException {
        pingServletDrive = new PingServletDrive();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit1_PWxy1() throws javax.servlet.ServletException {
        pingServletDrive.init(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetServletInfo_Fpxn0() {
		PingServletDrive pingServletDrive = new PingServletDrive();
		String expected = "Basic dynamic HTML generation through a servlet";
		String actual = pingServletDrive.getServletInfo();
		assertEquals(expected, actual);
	}
}