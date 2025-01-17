/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Session2CMROne2Many_Test_Passing {
    private static int hitCount;
    private static String initTime;
    PingServlet2Session2CMROne2Many pingservlet2session2cmrone2many;
    HttpServlet httpservlet;
    PingServlet2Session2CMROne2Many pingServlet2Session2CMROne2Many;
    HttpServlet httpServlet;
    HttpServletResponse httpServletResponse;
    private TradeServices tradeSLSBLocal;
    @Mock
    HttpServletResponse httpservletresponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservlet2session2cmrone2many = new PingServlet2Session2CMROne2Many();
        pingservlet2session2cmrone2many.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_EtHd0() {
        PingServlet2Session2CMROne2Many pingServlet2Session2CMROne2Many = new PingServlet2Session2CMROne2Many();
        String servletInfo = pingServlet2Session2CMROne2Many.getServletInfo();
        assertEquals("web primitive, tests Servlet to Entity EJB path", servletInfo);
    }
}