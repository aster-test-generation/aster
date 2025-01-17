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
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingJDBCWrite_Coverage_Test_Failing {
    private PingJDBCWrite pingJDBCWrite;
    private ServletConfig servletConfig;
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_ServletExceptionThrown_jGdA4() throws ServletException {
        ServletConfig config = mock(ServletConfig.class);
        when(config.getServletContext()).thenThrow(new ServletException());
        pingJDBCWrite.init(config);
    }
}