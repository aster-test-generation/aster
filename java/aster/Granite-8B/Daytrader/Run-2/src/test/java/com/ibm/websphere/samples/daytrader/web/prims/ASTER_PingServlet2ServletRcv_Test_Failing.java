/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2ServletRcv_Test_Failing {
    private static String initTime = null;
    PingServlet2ServletRcv pingServlet2ServletRcv;
    HttpServlet httpServlet;
    @Mock
    HttpServletRequest httpServletRequest;
    @Mock
    HttpServletResponse httpServletResponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServlet2ServletRcv = new PingServlet2ServletRcv();
        pingServlet2ServletRcv.init(null);
        verify(httpServlet).init(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost() throws ServletException, IOException {
        pingServlet2ServletRcv = new PingServlet2ServletRcv();
        pingServlet2ServletRcv.doPost(httpServletRequest, httpServletResponse);
        verify(httpServletRequest).getParameter("param");
        verify(httpServletResponse).getWriter();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_HaAW1() throws ServletException, IOException {
        PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        servlet.doPost(req, res);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet() throws Exception {
        httpServlet = mock(HttpServlet.class);
        httpServletRequest = mock(HttpServletRequest.class);
        httpServletResponse = mock(HttpServletResponse.class);
        pingServlet2ServletRcv = new PingServlet2ServletRcv();
        PingBean pingBean = mock(PingBean.class);
        when(httpServletRequest.getAttribute("ab")).thenReturn(pingBean);
        when(pingBean.getMsg()).thenReturn("Hello, World!");
        pingServlet2ServletRcv.doGet(httpServletRequest, httpServletResponse);
        verify(httpServletResponse).setContentType("text/html");
        PrintWriter out = mock(PrintWriter.class);
        verify(httpServletResponse).getWriter();
        verify(out).println("<html><head><title>Ping Servlet2Servlet</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">PingServlet2Servlet:</FONT><BR><BR><B>Message from Servlet: </B>" + "Hello, World!" + "</body></html>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_fid1() throws Exception {
        HttpServlet httpServlet = mock(HttpServlet.class);
        PingServlet2ServletRcv pingServlet2ServletRcv = new PingServlet2ServletRcv();
        pingServlet2ServletRcv.init(null);
        verify(httpServlet).init(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_fid1() throws ServletException, IOException {
        PingServlet2ServletRcv pingServlet2ServletRcv = new PingServlet2ServletRcv();
        pingServlet2ServletRcv.doPost(httpServletRequest, httpServletResponse);
        verify(httpServletRequest).getParameter("param");
        verify(httpServletResponse).getWriter();
    }
}