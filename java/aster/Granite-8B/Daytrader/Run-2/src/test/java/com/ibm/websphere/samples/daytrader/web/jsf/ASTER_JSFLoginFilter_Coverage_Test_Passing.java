/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import java.io.IOException;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JSFLoginFilter_Coverage_Test_Passing {
    JSFLoginFilter filter = new JSFLoginFilter();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDestroy2_MQBC1() {
        filter.destroy();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testInit1_Izgi0() throws javax.servlet.ServletException {
		JSFLoginFilter fixture = new JSFLoginFilter();
		FilterConfig filterConfig = null;
		fixture.init(filterConfig);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFilterNullRequest_emfz1() throws java.io.IOException, javax.servlet.ServletException {
        filter.doFilter(null, null, null);
}
}