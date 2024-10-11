/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
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
public class Aster_PingServletBeanValSimple1_Test_Passing {
    private static LocalDateTime initTime;
    PingServletBeanValSimple1 pingServletBeanValSimple1;
    HttpServlet httpServlet;
    @Mock
    private HttpServletResponse httpServletResponse;
    @Mock
    private ServletOutputStream servletOutputStream;
    private static int hitCount = 0;
    PingServletBeanValSimple1 pingservletbeanvalsimple1;
    HttpServlet httpservlet;
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServletBeanValSimple1 = new PingServletBeanValSimple1();
        pingServletBeanValSimple1.init(null);
        verify(httpServlet, times(1)).init(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitServletConfig_goIh0() throws ServletException {
        PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
        ServletConfig config = mock(ServletConfig.class);
        pingServletBeanValSimple1.init(config);
        verify(config).getInitParameter("initTime");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_UeWe0() {
        PingServletBeanValSimple1 pingServlet = new PingServletBeanValSimple1();
        String servletInfo = pingServlet.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_loIL0_CzIg0() throws ServletException, IOException {
        PingServletBeanValSimple1 pingServlet = new PingServletBeanValSimple1();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        pingServlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_ZoYP0_UHIe0() throws ServletException, IOException {
        PingServletBeanValSimple1 pingServlet = new PingServletBeanValSimple1();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        pingServlet.doGet(request, response);
    }
}