/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletLargeContentLength_Test_Passing {
    @Mock
    ServletConfig servletConfig;
    @InjectMocks
    PingServletLargeContentLength pingservletlargecontentlength;
    HttpServlet httpservlet;
    HttpServletRequest httpservletrequest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws ServletException {
        MockitoAnnotations.initMocks(this);
        pingservletlargecontentlength.init(servletConfig);
        Mockito.verify(servletConfig, Mockito.times(1)).getServletContext();
        Mockito.verify(servletConfig, Mockito.times(1)).getServletContext().getAttribute("javax.servlet.context.tempdir");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservlet = mock(HttpServlet.class);
        httpservletrequest = mock(HttpServletRequest.class);
        pingservletlargecontentlength = new PingServletLargeContentLength();
        // Set up the request
        when(httpservletrequest.getContentLengthLong()).thenReturn(1000L);
        // Call the doPost method
        pingservletlargecontentlength.doPost(httpservletrequest, mock(HttpServletResponse.class));
        // Verify the output
        verify(httpservletrequest).getContentLengthLong();
        verify(System.out).println("Length: 1000");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_nFZz0() {
        PingServletLargeContentLength servlet = new PingServletLargeContentLength();
        String result = servlet.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        httpservlet = mock(HttpServlet.class);
        httpservletrequest = mock(HttpServletRequest.class);
        pingservletlargecontentlength = new PingServletLargeContentLength();
        // Arrange
        when(httpservletrequest.getMethod()).thenReturn("GET");
        when(httpservletrequest.getRequestDispatcher("")).thenReturn(null);
        // Act
        pingservletlargecontentlength.doGet(httpservletrequest, mock(HttpServletResponse.class));
        // Assert
        verify(httpservletrequest).getMethod();
        verify(httpservletrequest).getRequestDispatcher("");
        verify(pingservletlargecontentlength, times(1)).doPost(httpservletrequest, mock(HttpServletResponse.class));
    }
}