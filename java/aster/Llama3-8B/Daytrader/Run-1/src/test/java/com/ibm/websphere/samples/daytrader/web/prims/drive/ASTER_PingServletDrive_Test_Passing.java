/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.drive;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
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
    @Mock
    private ServletConfig servletConfig;
    @InjectMocks
    private PingServletDrive pingservletdrive;
    @Mock
    HttpServlet httpservlet;
    @Mock
    HttpServletResponse httpservletresponse;
    @Mock
    ServletOutputStream servletoutputstream;
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private ServletOutputStream outputStream;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_Zvig0() {
        PingServletDrive pingServletDrive = new PingServletDrive();
        String result = pingServletDrive.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_xBXM0() throws ServletException {
        initTime = null;
        hitCount = 0;
        pingservletdrive = new PingServletDrive();
        pingservletdrive.init(servletConfig);
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost_peTL0() throws Exception {
        httpservlet = mock(HttpServlet.class);
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        pingservletdrive = new PingServletDrive();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getMethod()).thenReturn("POST");
        pingservletdrive.doPost(request, httpservletresponse);
        verify(httpservletresponse).setStatus(200);
        verify(servletoutputstream).write(any(byte[].class));
        verify(servletoutputstream).flush();
        verify(servletoutputstream).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_BDde0_1() throws Exception {
        initTime = "2022-01-01 00:00:00";
        hitCount = 0;
        pingservletdrive = new PingServletDrive();
        when(response.getOutputStream()).thenReturn(outputStream);
        when(request.getMethod()).thenReturn("GET");
        pingservletdrive.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(outputStream).println("html content");
        verify(outputStream).flush();
        verify(outputStream).close();
        assertEquals(1, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_BDde0_2() throws Exception {
        initTime = "2022-01-01 00:00:00";
        hitCount = 0;
        pingservletdrive = new PingServletDrive();
        when(response.getOutputStream()).thenReturn(outputStream);
        when(request.getMethod()).thenReturn("GET");
        pingservletdrive.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(outputStream).println("html content");
        verify(outputStream).flush();
        verify(outputStream).close();
        assertEquals("2022-01-01 00:00:00", initTime);
    }
}