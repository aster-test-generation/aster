/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2TwoPhase_Test_Failing {
    private static int hitCount;
    private static String initTime;
    PingServlet2TwoPhase pingServlet2TwoPhase;
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    private TradeServices tradeSLSBLocal;
    PingServlet2TwoPhase pingservlet2twophase;
    HttpServlet httpservlet;
    HttpServletResponse httpservletresponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServlet2TwoPhase = new PingServlet2TwoPhase();
        pingServlet2TwoPhase.init(null);
        verify(httpServlet).init(null);
        assertEquals(0, hitCount);
        assertNotNull(initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithNullConfig_qJVA2() {
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        try {
            servlet.init(null);
            fail("ServletException should be thrown");
        } catch (ServletException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletInfo_PZMn0() {
        PingServlet2TwoPhase pingServlet2TwoPhase = new PingServlet2TwoPhase();
        String servletInfo = pingServlet2TwoPhase.getServletInfo();
        assertEquals("web primitive, tests Servlet to Session to Entity EJB and JMS -- 2-phase commit path", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_1() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServlet2TwoPhase = new PingServlet2TwoPhase();
        pingServlet2TwoPhase.init(null);
        verify(httpServlet).init(null);
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_2() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServlet2TwoPhase = new PingServlet2TwoPhase();
        pingServlet2TwoPhase.init(null);
        verify(httpServlet).init(null);
        assertNotNull(initTime);
    }
}