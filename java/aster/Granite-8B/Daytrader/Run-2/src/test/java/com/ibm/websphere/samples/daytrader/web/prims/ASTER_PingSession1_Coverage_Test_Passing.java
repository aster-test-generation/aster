/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingSession1_Coverage_Test_Passing {
	PingSession1 pingSession1 = new PingSession1();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetServletInfo_qUNK0() {
		String expected = "HTTP Session Key: Tests management of a read only unique id";
		String actual = pingSession1.getServletInfo();
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost1_VCAD0() throws ServletException, IOException {
        PingSession1 pingSession1 = new PingSession1();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        pingSession1.doPost(request, response);
    }
}