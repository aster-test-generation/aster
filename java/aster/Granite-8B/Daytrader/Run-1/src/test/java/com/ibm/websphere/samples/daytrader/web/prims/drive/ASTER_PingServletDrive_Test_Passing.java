/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.drive;

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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletDrive_Test_Passing {
    private static String initTime;
    private static int hitCount;
    PingServletDrive pingservletdrive;
    HttpServlet httpservlet;
    @Mock
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    @Mock
    ServletOutputStream servletOutputStream;
    PingServletDrive pingServletDrive;
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletdrive = new PingServletDrive();
        pingservletdrive.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_ygxJ0() {
        PingServletDrive pingServletDrive = new PingServletDrive();
        String servletInfo = pingServletDrive.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_XTYZ2_IPUf0() throws ServletException, IOException {
        PingServletDrive pingServletDrive = new PingServletDrive();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("param")).thenReturn("value");
        pingServletDrive.doGet(request, response);
        verify(request, times(1)).getParameter("param");
        verify(response, times(1)).setContentType("text/html");
        verify(response, times(1)).getWriter();
        verify(response, times(1)).flushBuffer();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_jNzl3_kQHd0() throws ServletException, IOException {
        PingServletDrive pingServletDrive = new PingServletDrive();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("param")).thenReturn("value");
        pingServletDrive.doPost(request, response);
        verify(request, times(1)).getParameter("param");
        verify(response, times(1)).setContentType("text/html");
        verify(response, times(1)).getWriter();
    }
}