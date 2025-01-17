/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2PDF_Test_Passing {
    @Mock
    HttpServletRequest mockHttpServletRequest;
    @Mock
    HttpServletResponse mockHttpServletResponse;
    @InjectMocks
    PingServlet2PDF pingservlet2pdf;
    private static int BUFFER_SIZE = 1024 * 8;
    private static int hitCount = 0;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        MockitoAnnotations.initMocks(this);
        // Set up expected behavior for the mocks
        Mockito.when(mockHttpServletRequest.getParameter("param1")).thenReturn("value1");
        Mockito.when(mockHttpServletRequest.getParameter("param2")).thenReturn("value2");
        // Call the method to be tested
        pingservlet2pdf.doPost(mockHttpServletRequest, mockHttpServletResponse);
        // Add meaningful assertions here
        Mockito.verify(mockHttpServletResponse).setStatus(HttpServletResponse.SC_OK);
        Mockito.verify(mockHttpServletResponse).getWriter();
        Mockito.verify(mockHttpServletResponse).getWriter().println("Mocked response");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_FRbq0() throws ServletException, IOException {
        PingServlet2PDF servlet = new PingServlet2PDF();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNullRequest_Aixm1() throws ServletException, IOException {
        PingServlet2PDF servlet = new PingServlet2PDF();
        HttpServletRequest request = null;
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNullResponse_wHou2() throws ServletException, IOException {
        PingServlet2PDF servlet = new PingServlet2PDF();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = null;
        servlet.doGet(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithIOException_Jquo3() throws ServletException, IOException {
        PingServlet2PDF servlet = new PingServlet2PDF();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_uyXO0_rkpD0() throws ServletException, IOException {
        PingServlet2PDF servlet = new PingServlet2PDF();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
    }
}