/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingSession3_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_init_0_HKBL0() throws ServletException {
		PingSession3 instance = new PingSession3();
		instance.init(null);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost1_APXe0() throws ServletException, IOException {
    PingSession3 fixture = new PingSession3();
    HttpServletRequest req = null;
    HttpServletResponse res = null;
    fixture.doPost(req, res);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_getServletInfo_TRRS0() throws Exception {
		PingSession3 obj = new PingSession3();
		obj.getServletInfo();
	}
}