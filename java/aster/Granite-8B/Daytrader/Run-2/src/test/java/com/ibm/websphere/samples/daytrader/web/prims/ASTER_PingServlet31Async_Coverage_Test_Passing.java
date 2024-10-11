/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServlet31Async_Coverage_Test_Passing {
    PingServlet31Async servlet = new PingServlet31Async();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetServletInfo_PpNo0() {
		PingServlet31Async pingServlet31Async = new PingServlet31Async();
		assertEquals("Basic dynamic HTML generation through a servlet", pingServlet31Async.getServletInfo());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetContentType_AHTN0() throws ServletException, IOException {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        servlet.doPost(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_init_0_GlRn0() throws ServletException {
		PingServlet31Async pingServlet31Async = new PingServlet31Async();
		pingServlet31Async.init(null);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_init_1_WEif1_GgBp0() throws ServletException {
		PingServlet31Async pingServlet31Async = new PingServlet31Async();
		ServletConfig config = mock(ServletConfig.class);
		pingServlet31Async.init(config);
	}
}