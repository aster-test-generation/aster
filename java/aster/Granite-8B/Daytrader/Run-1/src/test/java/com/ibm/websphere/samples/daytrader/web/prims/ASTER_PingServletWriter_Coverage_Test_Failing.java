/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletWriter_Coverage_Test_Failing {
PingServletWriter pingServletWriter;
private HttpServletResponse mockHttpServletResponse;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetServletInfo_tPKr0() {
		PingServletWriter pingServletWriter = new PingServletWriter();
		String result = pingServletWriter.getServletInfo();
		assertEquals("Basic dynamic HTML generation through a servlet using a PrintWriter", result);
	}
}