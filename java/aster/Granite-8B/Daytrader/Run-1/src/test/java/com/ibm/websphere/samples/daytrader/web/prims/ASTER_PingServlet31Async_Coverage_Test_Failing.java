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
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServlet31Async_Coverage_Test_Failing {
	PingServlet31Async servlet;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_init_0_tCKY0() throws ServletException {
		servlet = new PingServlet31Async();
		servlet.init(null);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetContentType_pbtw0() throws ServletException, IOException {
        PingServlet31Async servlet = new PingServlet31Async();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(response, times(1)).setContentType("text/html");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStartAsync_DLxh1() throws ServletException, IOException {
        PingServlet31Async servlet = new PingServlet31Async();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(request, times(1)).startAsync();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStream_yVGE2() throws ServletException, IOException {
        PingServlet31Async servlet = new PingServlet31Async();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(request, times(1)).getInputStream();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_haul5() throws ServletException, IOException {
        PingServlet31Async servlet = new PingServlet31Async();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDoGet1_gewI0_yRbz0() throws ServletException, IOException {
		PingServlet31Async pingServlet31Async = new PingServlet31Async();
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		pingServlet31Async.doGet(request, response);
	}
}