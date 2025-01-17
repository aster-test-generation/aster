/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingReentryServlet_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_rGsu0() throws javax.servlet.ServletException {
        PingReentryServlet servlet = new PingReentryServlet();
        servlet.init(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_zKQZ0() {
        PingReentryServlet servlet = new PingReentryServlet();
        String result = servlet.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet1_WtMw0() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(out);
        when(request.getParameter("numReentries")).thenReturn("0");
        when(request.getParameter("sleep")).thenReturn("0");
        servlet.doGet(request, response);
        verify(out).println(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet2_gqHs1() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(out);
        when(request.getParameter("numReentries")).thenReturn("1");
        when(request.getParameter("sleep")).thenReturn("0");
        servlet.doGet(request, response);
        verify(out).println(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet3_LwkU2() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(out);
        when(request.getParameter("numReentries")).thenReturn("2");
        when(request.getParameter("sleep")).thenReturn("0");
        servlet.doGet(request, response);
        verify(out).println(2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet4_YMIP3() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(out);
        when(request.getParameter("numReentries")).thenReturn("3");
        when(request.getParameter("sleep")).thenReturn("0");
        servlet.doGet(request, response);
        verify(out).println(3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet5_YVbE4() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(out);
        when(request.getParameter("numReentries")).thenReturn("4");
        when(request.getParameter("sleep")).thenReturn("0");
        servlet.doGet(request, response);
        verify(out).println(4);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet6_MuAP5() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(out);
        when(request.getParameter("numReentries")).thenReturn("5");
        when(request.getParameter("sleep")).thenReturn("0");
        servlet.doGet(request, response);
        verify(out).println(5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet7_uuIE6() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(out);
        when(request.getParameter("numReentries")).thenReturn("6");
        when(request.getParameter("sleep")).thenReturn("0");
        servlet.doGet(request, response);
        verify(out).println(6);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet8_jFfF7() throws Exception {
        PingReentryServlet servlet = new PingReentryServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(out);
        when(request.getParameter("numReentries")).thenReturn("7");
        when(request.getParameter("sleep")).thenReturn("0");
        servlet.doGet(request, response);
        verify(out).println(7);
    }
}