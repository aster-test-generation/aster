/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletCDIBeanManagerViaJNDI_Test_Failing {
    private static String initTime;
    PingServletCDIBeanManagerViaJNDI pingservletcdibeanmanagerviajndi;
    HttpServlet httpservlet;
    PingServletCDIBeanManagerViaJNDI pingServletCDIBeanManagerViaJNDI;
    HttpServlet httpServlet;
    HttpServletResponse httpServletResponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletcdibeanmanagerviajndi = new PingServletCDIBeanManagerViaJNDI();
        pingservletcdibeanmanagerviajndi.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
    }
}