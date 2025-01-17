/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_PingServlet_Coverage_Test_Passing {
private HttpServletResponse mockResponse;
private ServletOutputStream mockOut;
    private PingServlet pingServlet;
    private HttpServletRequest mockRequest;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDoPost1_ULJr0() throws ServletException, IOException {
		PingServlet servlet = new PingServlet();
		HttpServletRequest req = new MockHttpServletRequest();
		HttpServletResponse res = new MockHttpServletResponse();
		servlet.doPost(req, res);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_init_20_XyEc20() throws ServletException {
		PingServlet instance = new PingServlet();
		instance.init(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_init_2_fTuR2_FEXn0() throws ServletException {
		PingServlet instance = new PingServlet();
		instance.init(null);
		PingServlet pingServlet = new PingServlet();
		pingServlet.init(null);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void init_VwBE0() {
    pingServlet = new PingServlet();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void tearDown_HSWf1() throws javax.servlet.ServletException, java.io.IOException {
        pingServlet = null;
        mockRequest = null;
        mockResponse = null;
        mockOut = null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetContentType_LNpi2() throws ServletException, IOException {
        pingServlet.doGet(mockRequest, mockResponse);
        verify(mockResponse).setContentType("text/html");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOutputStream_kxnz3() throws ServletException, IOException {
        pingServlet.doGet(mockRequest, mockResponse);
        verify(mockResponse).getOutputStream();
    }
}