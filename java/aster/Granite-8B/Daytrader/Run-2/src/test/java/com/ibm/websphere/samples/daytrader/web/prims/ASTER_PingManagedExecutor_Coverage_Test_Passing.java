/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.AsyncContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingManagedExecutor_Coverage_Test_Passing {
private ServletOutputStream out;
    PingManagedExecutor pingManagedExecutor;
    private HttpServletResponse response;
    private AsyncContext asyncContext;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testgetServletInfo_pLXk0()
	{
		PingManagedExecutor pingManagedExecutor = new PingManagedExecutor();
		String result = pingManagedExecutor.getServletInfo();
		assertEquals("Tests a ManagedExecutor", result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setUp_VhVm1() {
}
}