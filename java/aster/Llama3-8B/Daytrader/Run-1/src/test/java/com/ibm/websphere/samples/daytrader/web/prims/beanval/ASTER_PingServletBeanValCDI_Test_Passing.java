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
public class Aster_PingServletBeanValCDI_Test_Passing {
    private static LocalDateTime initTime;
    @Mock
    private ServletConfig servletConfig;
    @Mock
    private HttpServlet httpServlet;
    private PingServletBeanValCDI pingservletbeanvalcdi;
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;
    HttpServletRequest httprequest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httprequest = mock(HttpServletRequest.class);
        pingservletbeanvalcdi = new PingServletBeanValCDI();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingservletbeanvalcdi.doPost(httprequest, httpservletresponse);
        verify(servletoutputstream).write("Hello, World!".getBytes());
        verify(servletoutputstream).flush();
        verify(servletoutputstream).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_jJAB0() {
        PingServletBeanValCDI pingServletBeanValCDI = new PingServletBeanValCDI();
        String result = pingServletBeanValCDI.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_WLsz0() throws ServletException, IOException {
        PingServletBeanValCDI pingServletBeanValCDI = new PingServletBeanValCDI();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getParameter("param")).thenReturn("value");
        when(req.getParameter("param2")).thenReturn("value2");
        pingServletBeanValCDI.doGet(req, res);
        assertEquals("text/html", res.getContentType());
        assertEquals("value", req.getParameter("param"));
        assertEquals("value2", req.getParameter("param2"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_WLsz0_1() throws ServletException, IOException {
        PingServletBeanValCDI pingServletBeanValCDI = new PingServletBeanValCDI();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getParameter("param")).thenReturn("value");
        when(req.getParameter("param2")).thenReturn("value2");
        pingServletBeanValCDI.doGet(req, res);
        assertEquals("text/html", res.getContentType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_WLsz0_2() throws ServletException, IOException {
        PingServletBeanValCDI pingServletBeanValCDI = new PingServletBeanValCDI();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getParameter("param")).thenReturn("value");
        when(req.getParameter("param2")).thenReturn("value2");
        pingServletBeanValCDI.doGet(req, res);
        assertEquals("value", req.getParameter("param"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_WLsz0_3() throws ServletException, IOException {
        PingServletBeanValCDI pingServletBeanValCDI = new PingServletBeanValCDI();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getParameter("param")).thenReturn("value");
        when(req.getParameter("param2")).thenReturn("value2");
        pingServletBeanValCDI.doGet(req, res);
        assertEquals("value2", req.getParameter("param2"));
    }
}