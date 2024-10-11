/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet_Test_Passing {
    private static int hitCount;
    private static String initTime;
    PingServlet pingservlet;
    HttpServlet httpservlet;
    @Mock
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    @Mock
    ServletOutputStream servletOutputStream;
    PingServlet pingServlet;
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservlet = new PingServlet();
        // Mock the init method of HttpServlet
        doNothing().when(httpservlet).init(any());
        // Call the init method of PingServlet
        pingservlet.init(null);
        // Verify that the init method of HttpServlet is called
        verify(httpservlet, times(1)).init(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_bJEE0() throws ServletException, IOException {
        PingServlet servlet = new PingServlet();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doPost(request, response);
        assertEquals(HttpServletResponse.SC_OK, response.getStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_iekH0() {
        PingServlet servlet = new PingServlet();
        String expected = "Basic dynamic HTML generation through a servlet";
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }
}