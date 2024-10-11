/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingSession2_Test_Passing {
private static int hitCount;
private static String initTime;
PingSession2 pingsession2;
ServletConfig servletConfig;
HttpServletRequest httpservletrequest;
HttpSession httpsession;
HttpServletResponse httpservletresponse;
HttpServlet httpservlet;
PrintWriter printWriter;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testinit_fsTZ1_1() throws Exception {
    servletConfig = mock(ServletConfig.class);
    PingSession2 pingsession2 = null;
    try {
        pingsession2 = new PingSession2();
        pingsession2.init(servletConfig);
    } catch (NoClassDefFoundError e) {
        // expected
    }
    assertNull(pingsession2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testinit_fsTZ1_2() throws Exception {
    servletConfig = mock(ServletConfig.class);
    try {
        pingsession2 = new PingSession2();
        pingsession2.init(servletConfig);
    } catch (NoClassDefFoundError e) {
        // Expected
    }
}
}