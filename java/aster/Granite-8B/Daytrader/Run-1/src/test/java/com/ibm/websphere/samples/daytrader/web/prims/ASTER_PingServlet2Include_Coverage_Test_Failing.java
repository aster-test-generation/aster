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
public class Aster_PingServlet2Include_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost1_irgO0() throws ServletException, IOException {
	PingServlet2Include servlet = new PingServlet2Include();
	HttpServletRequest mockRequest = null;
	HttpServletResponse mockResponse = null;
	servlet.doPost(mockRequest, mockResponse);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_init_0_OOjY0() throws ServletException {
		PingServlet2Include pingServlet2Include = new PingServlet2Include();
		pingServlet2Include.init(null);
	}
}