/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

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

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockServletContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletBeanValSimple1_Test_Passing {
    private static LocalDateTime initTime;
    @Mock
    private ServletConfig servletConfig;
    @Mock
    private ServletException servletException;
    @InjectMocks
    private PingServletBeanValSimple1 pingservletbeanvalsimple1;
    HttpServlet httpservlet;
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;
    HttpServletRequest httprequest;
    private static int hitCount = 0;
    @Mock
    private HttpServletRequest httpServletRequest;
    @Mock
    private HttpServletResponse httpServletResponse;
    @Mock
    private ServletOutputStream servletOutputStream;
    @Mock
    private SimpleBean1 simpleBean1;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservlet = mock(HttpServlet.class);
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httprequest = mock(HttpServletRequest.class);
        pingservletbeanvalsimple1 = new PingServletBeanValSimple1();
        when(httprequest.getMethod()).thenReturn("POST");
        pingservletbeanvalsimple1.doPost(httprequest, httpservletresponse);
        verify(httpservletresponse).setStatus(HttpServletResponse.SC_OK);
        verify(servletoutputstream).write("Hello, World!".getBytes());
        verify(servletoutputstream).flush();
        verify(servletoutputstream).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_bmJm0() {
        PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
        String result = pingServletBeanValSimple1.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_WFQD0() throws ServletException {
        initTime = null;
        when(servletConfig.getServletContext()).thenReturn(new MockServletContext());
        pingservletbeanvalsimple1.init(servletConfig);
        assertEquals(null, initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_jQHy0() throws Exception {
        initTime = LocalDateTime.now();
        pingservletbeanvalsimple1 = new PingServletBeanValSimple1();
        when(httpServletResponse.getOutputStream()).thenReturn(servletOutputStream);
        when(httpServletRequest.getMethod()).thenReturn("GET");
        pingservletbeanvalsimple1.doGet(httpServletRequest, httpServletResponse);
        verify(simpleBean1).checkInjectionValidation();
        verify(servletOutputStream).println(anyString());
        verify(servletOutputStream).flush();
        verify(servletOutputStream).close();
        assertEquals(1, hitCount);
    }
}