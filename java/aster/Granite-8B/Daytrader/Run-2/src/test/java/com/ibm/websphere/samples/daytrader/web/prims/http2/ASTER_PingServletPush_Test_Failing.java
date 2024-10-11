/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.PushBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletPush_Test_Failing {
    private static String initTime;
    private static int hitCount;
    PingServletPush pingservletpush;
    HttpServlet httpservlet;
    HttpServletRequest httpservletrequest;
    HttpServletResponse httpservletresponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_1() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletpush = new PingServletPush();
        pingservletpush.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertEquals(initTime, new java.util.Date().toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_2() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletpush = new PingServletPush();
        pingservletpush.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertEquals(hitCount, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitServletConfig_DoaP0() throws ServletException {
        PingServletPush pingServletPush = new PingServletPush();
        ServletConfig servletConfig = mock(ServletConfig.class);
        pingServletPush.init(servletConfig);
        verify(servletConfig).getInitParameter("initTime");
        verify(servletConfig).getInitParameter("hitCount");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHttpServletRequestHttpServletResponse_qNmC0() throws ServletException, IOException {
        PingServletPush pingServletPush = new PingServletPush();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        PushBuilder pushBuilder = mock(PushBuilder.class);
        when(req.newPushBuilder()).thenReturn(pushBuilder);
        pingServletPush.doGet(req, resp);
        verify(req, times(1)).newPushBuilder();
        verify(pushBuilder, times(1)).path("images/graph.gif");
        verify(pushBuilder, times(1)).push();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHttpServletRequestHttpServletResponseException_TIyo1() throws ServletException, IOException {
        PingServletPush pingServletPush = new PingServletPush();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        PushBuilder pushBuilder = mock(PushBuilder.class);
        when(req.newPushBuilder()).thenReturn(pushBuilder);
        when(pushBuilder.path("images/graph.gif")).thenThrow(new UnsupportedOperationException());
        pingServletPush.doGet(req, resp);
        verify(req, times(1)).newPushBuilder();
        verify(pushBuilder, times(1)).path("images/graph.gif");
        verify(pushBuilder, times(1)).push();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHttpServletRequestHttpServletResponsePrintWriter_txAM2() throws ServletException, IOException {
        PingServletPush pingServletPush = new PingServletPush();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        PrintWriter respWriter = mock(PrintWriter.class);
        when(resp.getWriter()).thenReturn(respWriter);
        pingServletPush.doGet(req, resp);
        verify(resp, times(1)).getWriter();
        verify(respWriter, times(1)).write("<html><head><title>Ping Servlet HTTP/2</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet HTTP/2<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  <B>Hit Count: " + hitCount + "</B><br>" + "<img src='images/graph.gif'>" + "</body></html>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_VGFm0() throws Exception {
        httpservlet = mock(HttpServlet.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpservletresponse = mock(HttpServletResponse.class);
        pingservletpush = new PingServletPush();
        PushBuilder pushBuilder = mock(PushBuilder.class);
        when(httpservletrequest.newPushBuilder()).thenReturn(pushBuilder);
        when(pushBuilder.path("images/graph.gif")).thenReturn(pushBuilder);
        doReturn(true).when(pushBuilder).push();
        pingservletpush.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletrequest, times(1)).newPushBuilder();
        verify(pushBuilder, times(1)).path("images/graph.gif");
        verify(pushBuilder, times(1)).push();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHttpServletRequestHttpServletResponsePrintWriterException_ZTWx3_luYI0() throws ServletException, IOException {
        PingServletPush pingServletPush = new PingServletPush();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        PrintWriter respWriter = mock(PrintWriter.class);
        when(resp.getWriter()).thenReturn(respWriter);
        doThrow(new UnsupportedOperationException()).when(respWriter).write("<html><head><title>Ping Servlet HTTP/2</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet HTTP/2<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  <B>Hit Count: " + hitCount + "</B><br>" + "<img src='images/graph.gif'>" + "</body></html>");
        pingServletPush.doGet(req, resp);
        verify(resp, times(1)).getWriter();
        verify(respWriter, times(1)).write("<html><head><title>Ping Servlet HTTP/2</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet HTTP/2<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  <B>Hit Count: " + hitCount + "</B><br>" + "<img src='images/graph.gif'>" + "</body></html>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitServletConfig_DoaP0_fid1() throws ServletException {
        PingServletPush pingServletPush = new PingServletPush();
        ServletConfig servletConfig = mock(ServletConfig.class);
        when(servletConfig.getInitParameter("initTime")).thenReturn("10");
        when(servletConfig.getInitParameter("hitCount")).thenReturn("100");
        pingServletPush.init(servletConfig);
        verify(servletConfig).getInitParameter("initTime");
        verify(servletConfig).getInitParameter("hitCount");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitServletConfig2_Owoi1_fid1() throws ServletException {
        PingServletPush pingServletPush = new PingServletPush();
        ServletConfig servletConfig = mock(ServletConfig.class);
        when(servletConfig.getInitParameter("initTime")).thenReturn("1000");
        when(servletConfig.getInitParameter("hitCount")).thenReturn("1000");
        pingServletPush.init(servletConfig);
        verify(servletConfig).getInitParameter("initTime");
        verify(servletConfig).getInitParameter("hitCount");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletpush = new PingServletPush();
        pingservletpush.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertEquals(initTime, new java.util.Date().toString());
        assertEquals(hitCount, 0);
    }
}