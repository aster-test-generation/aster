/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletPush_Coverage_Test_Failing {
private ServletConfig servletConfig;
private PingServletPush pingServletPush;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_eMwu0() throws javax.servlet.ServletException {
        pingServletPush = new PingServletPush();
        servletConfig = mock(ServletConfig.class);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_SuperInitCalled_imJJ1() throws ServletException {
        pingServletPush.init(servletConfig);
        verify(servletConfig).getServletContext(); // This will verify that super.init(config) is called
    }
}