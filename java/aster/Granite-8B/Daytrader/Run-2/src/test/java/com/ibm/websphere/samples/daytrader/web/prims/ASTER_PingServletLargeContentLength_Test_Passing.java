/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
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
    ServletConfig config;
    @Mock
    HttpServlet httpServlet;
    @InjectMocks
    PingServletLargeContentLength pingServletLargeContentLength;
    @Mock
    HttpServletRequest httpServletRequest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws ServletException {
        MockitoAnnotations.openMocks(this);
        pingServletLargeContentLength.init(config);
        verify(httpServlet).init(config);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost() throws Exception {
        MockitoAnnotations.openMocks(this);
        // Set up the expected behavior of the mock objects
        when(httpServletRequest.getContentLengthLong()).thenReturn(1024L);
        // Call the method under test
        pingServletLargeContentLength.doPost(httpServletRequest, null);
        // Verify that the expected behavior was met
        verify(httpServletRequest).getContentLengthLong();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_Wrpo1() throws ServletException, IOException {
        PingServletLargeContentLength servlet = new PingServletLargeContentLength();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(req.getContentLengthLong()).thenReturn(100L);
        servlet.doPost(req, res);
        assertEquals("Length: 100", System.out.toString().trim());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_WRXS0() {
        PingServletLargeContentLength servlet = new PingServletLargeContentLength();
        String actual = servlet.getServletInfo();
        String expected = "Basic dynamic HTML generation through a servlet, with " + "contentLength set by contentLength parameter.";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet() throws Exception {
        MockitoAnnotations.openMocks(this);
        // Set up expectations
        when(httpServletRequest.getContentLength()).thenReturn(1024 * 1024);
        // Call the method under test
        pingServletLargeContentLength.doGet(httpServletRequest, null);
        // Verify the expected behavior
        verify(httpServletRequest).getContentLength();
    }
}