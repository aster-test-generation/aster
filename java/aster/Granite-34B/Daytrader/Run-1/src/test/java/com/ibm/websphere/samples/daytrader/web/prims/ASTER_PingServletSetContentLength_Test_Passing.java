/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletSetContentLength_Test_Passing {
    @Mock
    ServletConfig config;
    PingServletSetContentLength pingservletsetcontentlength;
    @Mock
    HttpServletRequest mockHttpServletRequest;
    @Mock
    HttpServletResponse mockHttpServletResponse;
    @InjectMocks
    PingServletSetContentLength pingServletSetContentLength;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        MockitoAnnotations.openMocks(this);
        pingservletsetcontentlength = new PingServletSetContentLength();
        Mockito.when(config.getInitParameter("content-length")).thenReturn("1024");
        pingservletsetcontentlength.init(config);
        Mockito.verify(config, Mockito.times(1)).getInitParameter("content-length");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_GPAw0() throws ServletException {
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        ServletConfig config = new MockServletConfig();
        servlet.init(config);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithNullConfig_ZcOx1() throws ServletException {
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        try {
            servlet.init(null);
            fail("Expected ServletException");
        } catch (ServletException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithValidConfigAndSuperException_YiJL5() throws ServletException {
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        ServletConfig config = new MockServletConfig();
        try {
            servlet.init(config);
            fail("Expected ServletException");
        } catch (ServletException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        MockitoAnnotations.openMocks(this);
        Mockito.when(mockHttpServletRequest.getParameter("param1")).thenReturn("value1");
        Mockito.when(mockHttpServletRequest.getParameter("param2")).thenReturn("value2");
        Mockito.doNothing().when(pingServletSetContentLength).doGet(mockHttpServletRequest, mockHttpServletResponse);
        pingServletSetContentLength.doPost(mockHttpServletRequest, mockHttpServletResponse);
        Mockito.verify(pingServletSetContentLength, Mockito.times(1)).doGet(mockHttpServletRequest, mockHttpServletResponse);
        Mockito.verify(mockHttpServletRequest, Mockito.times(1)).getParameter("param1");
        Mockito.verify(mockHttpServletRequest, Mockito.times(1)).getParameter("param2");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_xhxb0() throws ServletException, IOException {
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doPost(request, response);
        assertEquals(200, response.getStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithException_meOz1() throws ServletException, IOException {
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doPost(request, response);
        assertEquals(500, response.getStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_aHdh0() {
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        String result = servlet.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        pingservletsetcontentlength = new PingServletSetContentLength();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream output = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(output);
        when(request.getParameter("contentLength")).thenReturn("100");
        pingservletsetcontentlength.doGet(request, response);
        verify(response, times(1)).setContentType("text/html");
        verify(request, times(1)).getParameter("contentLength");
        verify(response, times(1)).getOutputStream();
        verify(output, times(1)).println("<html><head><title>Ping Servlet</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet<BR></FONT><FONT size=\"+1\" color=\"#000066\">" + "aa</B></body></html>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNoContentLength_ELPL0() throws ServletException, IOException {
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("contentLength")).thenReturn(null);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(out);
        servlet.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(out).println("<html><head><title>Ping Servlet</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet<BR></FONT><FONT size=\"+1\" color=\"#000066\"></B></body></html>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithValidContentLength_OPvF1() throws ServletException, IOException {
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("contentLength")).thenReturn("100");
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(out);
        servlet.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(out).println("<html><head><title>Ping Servlet</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet<BR></FONT><FONT size=\"+1\" color=\"#000066\">");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithInvalidContentLength_Yqvd2() throws ServletException, IOException {
        PingServletSetContentLength servlet = new PingServletSetContentLength();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("contentLength")).thenReturn("invalid");
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(out);
        servlet.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(out).println("<html><head><title>Ping Servlet</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet<BR></FONT><FONT size=\"+1\" color=\"#000066\">");
    }
}