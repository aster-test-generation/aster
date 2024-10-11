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
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_PingServletSetContentLength_Coverage_Test_Passing {
	PingServletSetContentLength servlet = new PingServletSetContentLength();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDoPost1_wSxN0() throws ServletException, IOException {
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		servlet.doPost(request, response);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetServletInfo_sYNK0() {
		PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
		String result = pingServletSetContentLength.getServletInfo();
		assertEquals("Basic dynamic HTML generation through a servlet, with " + "contentLength set by contentLength parameter.", result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetContentType_CceR0() throws ServletException, IOException {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doGet(request, response);
    verify(response).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetContentLength_ESLi1() throws ServletException, IOException {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getParameter("contentLength")).thenReturn("100");
    servlet.doGet(request, response);
    verify(response).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNullContentLength_WgHf2() throws ServletException, IOException {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getParameter("contentLength")).thenReturn(null);
    servlet.doGet(request, response);
    verify(response).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPrintContent7_MgWh11() throws ServletException, IOException {
    PingServletSetContentLength servlet = new PingServletSetContentLength();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInitServletConfig_BJSH0() throws ServletException {
	PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
	pingServletSetContentLength.init(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGetHttpServletRequestHttpServletResponse_FWfS1() throws ServletException, IOException {
	PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	pingServletSetContentLength.doGet(request, response);
	verify(response, times(1)).setContentType("text/html");
	verify(response, times(1)).getOutputStream();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGetHttpServletRequestHttpServletResponse2_xJeh2() throws ServletException, IOException {
	PingServletSetContentLength pingServletSetContentLength = new PingServletSetContentLength();
	HttpServletRequest request = mock(HttpServletRequest.class);
	HttpServletResponse response = mock(HttpServletResponse.class);
	when(request.getParameter("contentLength")).thenReturn(null);
	pingServletSetContentLength.doGet(request, response);
	verify(response, times(1)).setContentType("text/html");
	verify(response, times(1)).getOutputStream();
}
}