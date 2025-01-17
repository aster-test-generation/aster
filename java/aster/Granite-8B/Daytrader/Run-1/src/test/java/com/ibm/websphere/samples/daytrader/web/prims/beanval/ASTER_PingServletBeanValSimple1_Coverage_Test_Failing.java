/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;
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
public class Aster_PingServletBeanValSimple1_Coverage_Test_Failing {
PingServletBeanValSimple1 servlet;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_vdJX0() throws ServletException, IOException {
	PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
	HttpServletRequest req = mock(HttpServletRequest.class);
	HttpServletResponse res = mock(HttpServletResponse.class);
	pingServletBeanValSimple1.doGet(req, res);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetServletInfo_UFSl0_TRRt1() {
		PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
		assertEquals("Basic dynamic HTML generation through a servlet", pingServletBeanValSimple1.getServletInfo());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void setUp_uIdY0() throws ServletException {
		servlet = new PingServletBeanValSimple1();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInit1_hGMl1() throws ServletException {
		ServletConfig config = null;
		servlet.init(config);
	}
}