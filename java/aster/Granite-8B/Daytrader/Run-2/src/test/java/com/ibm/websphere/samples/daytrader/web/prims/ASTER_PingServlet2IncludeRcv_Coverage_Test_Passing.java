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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_PingServlet2IncludeRcv_Coverage_Test_Passing {
PingServlet2IncludeRcv servlet = new PingServlet2IncludeRcv();
HttpServletResponse mockResponse = null;
HttpServletRequest mockRequest = null;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDoGet_DlXB0() throws ServletException, IOException {
		PingServlet2IncludeRcv servlet = new PingServlet2IncludeRcv();
		servlet.doGet(null, null);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDoPost1_IcNs0() throws ServletException, IOException {
		mockRequest = new MockHttpServletRequest("GET", "/PingServlet2IncludeRcv");
		mockResponse = new MockHttpServletResponse();
		servlet.doPost(mockRequest, mockResponse);
	}
}