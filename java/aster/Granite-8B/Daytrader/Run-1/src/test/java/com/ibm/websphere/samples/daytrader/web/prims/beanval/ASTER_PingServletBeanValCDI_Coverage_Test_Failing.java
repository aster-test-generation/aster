/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;
import java.io.IOException;
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
public class Aster_PingServletBeanValCDI_Coverage_Test_Failing {
	{
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetServletInfo_ilEN0()
	{
		PingServletBeanValCDI obj = new PingServletBeanValCDI();
		assertEquals("Basic dynamic HTML generation through a servlet",obj.getServletInfo());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_init_0_clIN1() throws ServletException {
	PingServletBeanValCDI pingServletBeanValCDI = new PingServletBeanValCDI();
	pingServletBeanValCDI.init(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_ZilT0() throws ServletException, IOException {
	PingServletBeanValCDI pingServletBeanValCDI = new PingServletBeanValCDI();
	HttpServletRequest req = mock(HttpServletRequest.class);
	HttpServletResponse res = mock(HttpServletResponse.class);
	pingServletBeanValCDI.doPost(req, res);
}
}