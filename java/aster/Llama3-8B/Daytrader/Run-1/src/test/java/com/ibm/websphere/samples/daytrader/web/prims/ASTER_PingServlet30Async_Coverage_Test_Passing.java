/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServlet30Async_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_ConfigPassed_qHZq3() throws javax.servlet.ServletException {
        ServletConfig config = mock(ServletConfig.class);
        PingServlet30Async servlet = new PingServlet30Async();
        servlet.init(config);
        verify(config).getServletContext();
    }
}