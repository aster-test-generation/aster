/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
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
public class Aster_PingServlet2ServletRcv_Test_Failing {
    private static String initTime = null;
    PingServlet2ServletRcv pingservlet2servletrcv;
    @Mock
    HttpServletRequest mockHttpServletRequest;
    @Mock
    HttpServletResponse mockHttpServletResponse;
    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;
    @Mock
    PingBean ab;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        // Set up expected behavior for the mocks
        when(mockHttpServletRequest.getParameter("param1")).thenReturn("value1");
        when(mockHttpServletRequest.getParameter("param2")).thenReturn("value2");
        // Call the method to be tested
        pingservlet2servletrcv.doPost(mockHttpServletRequest, mockHttpServletResponse);
        // Add meaningful assertions here
        verify(mockHttpServletResponse).setStatus(HttpServletResponse.SC_OK);
        verify(mockHttpServletResponse).getWriter();
        verify(mockHttpServletResponse).getWriter().println("Success");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullRequest_qhJK1() throws ServletException, IOException {
        PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
        HttpServletRequest request = null;
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullResponse_xHqN2() throws ServletException, IOException {
        PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = null;
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullRequestAndResponse_ZdqO3() throws ServletException, IOException {
        PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        pingservlet2servletrcv = new PingServlet2ServletRcv();
        when(request.getAttribute("ab")).thenReturn(ab);
        when(ab.getMsg()).thenReturn("Test message");
        when(request.getContentType()).thenReturn("text/html");
        PrintWriter printWriter = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(printWriter);
        pingservlet2servletrcv.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(printWriter).println("<html><head><title>Ping Servlet2Servlet</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">PingServlet2Servlet:<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time: " + initTime + "</FONT><BR><BR><B>Message from Servlet: </B>" + "Test message" + "</body></html>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_aksT0() throws ServletException, IOException {
        PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingBean pingBean = new PingBean();
        when(request.getAttribute("ab")).thenReturn(pingBean);
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithException_Boqo1() throws ServletException, IOException {
        PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingBean pingBean = new PingBean();
        when(request.getAttribute("ab")).thenThrow(new Exception());
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost_fid1() throws Exception {
        // Set up expected behavior for the mocks
        when(mockHttpServletRequest.getParameter("param1")).thenReturn("value1");
        when(mockHttpServletRequest.getParameter("param2")).thenReturn("value2");
        // Create an instance of the class under test
        PingServlet2ServletRcv pingservlet2servletrcv = new PingServlet2ServletRcv();
        // Call the method to be tested
        pingservlet2servletrcv.doPost(mockHttpServletRequest, mockHttpServletResponse);
        // Add meaningful assertions here
        verify(mockHttpServletResponse).setStatus(HttpServletResponse.SC_OK);
        verify(mockHttpServletResponse).getWriter();
        verify(mockHttpServletResponse).getWriter().println("Success");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNonNullRequestAndResponse_INsR4() throws ServletException, IOException {
        PingServlet2ServletRcv servlet = new PingServlet2ServletRcv();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_gSQU0() throws Exception {
        pingservlet2servletrcv = mock(PingServlet2ServletRcv.class);
        ServletConfig config = mock(ServletConfig.class);
        doCallRealMethod().when(pingservlet2servletrcv).init(config);
        pingservlet2servletrcv.init(config);
        verify(pingservlet2servletrcv, times(1)).init(config);
        assertEquals("initTime should be set", initTime, new java.util.Date().toString());
    }
}