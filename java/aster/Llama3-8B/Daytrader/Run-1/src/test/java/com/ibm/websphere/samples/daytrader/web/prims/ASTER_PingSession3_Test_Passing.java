/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingSession3_Test_Passing {
    private static String initTime = null;
    private static int hitCount = 0;
    @Mock
    private ServletConfig servletConfig;
    @InjectMocks
    private PingSession3 pingsession3;
    HttpServlet httpservlet;
    HttpServletResponse httpservletresponse;
    HttpServletRequest httpservletrequest;
    HttpSession httpsession;
    private static int NUM_OBJECTS = 2;
    @Mock
    private HttpServlet httpServlet;
    @Mock
    private HttpServletResponse httpResponse;
    @Mock
    private HttpServletRequest httpRequest;
    @Mock
    private HttpSession httpSession;
    @Mock
    private PingSession3Object[] sessionData;
    @Mock
    private PingSession3Object pingSession3Object;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservlet = mock(HttpServlet.class);
        httpservletresponse = mock(HttpServletResponse.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpsession = mock(HttpSession.class);
        pingsession3 = new PingSession3();
        when(httpservletrequest.getSession(any())).thenReturn(httpsession);
        when(httpservletrequest.getMethod()).thenReturn("POST");
        pingsession3.doPost(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).sendRedirect(any(String.class));
        verify(httpservletrequest).getSession(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_MFbC0() throws ServletException, IOException {
        PingSession3 pingSession3 = new PingSession3();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter writer = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(writer);
        pingSession3.doPost(request, response);
        verify(writer).println("Hello, World!");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_FRMP0() {
        PingSession3 pingSession3 = new PingSession3();
        String result = pingSession3.getServletInfo();
        assertEquals("HTTP Session Object: Tests management of a large custom session class", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_vrVn0_1() throws ServletException {
        MockitoAnnotations.initMocks(this);
        pingsession3.init(servletConfig);
        Mockito.verify(servletConfig, Mockito.times(1)).getInitParameter(Mockito.anyString());
        Mockito.verify(servletConfig, Mockito.times(1)).getServletContext();
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_vrVn0_2() throws ServletException {
        MockitoAnnotations.initMocks(this);
        pingsession3.init(servletConfig);
        Mockito.verify(servletConfig, Mockito.times(1)).getInitParameter(Mockito.anyString());
        Mockito.verify(servletConfig, Mockito.times(1)).getServletContext();
        assertNotNull(initTime);
    }
}