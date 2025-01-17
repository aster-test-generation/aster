/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletCDIBeanManagerViaJNDI_Test_Failing {
    private static String initTime;
    PingServletCDIBeanManagerViaJNDI pingservletcdibeanmanagerviajndi;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_tHmj0() throws IOException {
        PingServletCDIBeanManagerViaJNDI servlet = new PingServletCDIBeanManagerViaJNDI();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter pw = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(pw);
        servlet.doGet(request, response);
        verify(response, times(1)).getWriter();
        verify(pw, times(1)).write(anyString());
        verify(pw, times(1)).flush();
        verify(pw, times(1)).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithException_NMoH1() throws IOException {
        PingServletCDIBeanManagerViaJNDI servlet = mock(PingServletCDIBeanManagerViaJNDI.class);
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter pw = mock(PrintWriter.class);
        when(response.getWriter()).thenThrow(new IOException("Error"));
        servlet.doGet(request, response);
        verify(response, times(1)).getWriter();
        verify(pw, never()).write(anyString());
        verify(pw, never()).flush();
        verify(pw, never()).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithBranchCoverage_hNNl2() throws IOException {
        PingServletCDIBeanManagerViaJNDI servlet = new PingServletCDIBeanManagerViaJNDI();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter pw = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(pw);
        servlet.doGet(request, response);
        verify(response, times(1)).getWriter();
        verify(pw, times(1)).write(anyString());
        verify(pw, times(1)).flush();
        verify(pw, times(1)).close();
        servlet.doGet(null, response);
        verify(response, times(2)).getWriter();
        verify(pw, times(1)).write(anyString());
        verify(pw, times(1)).flush();
        verify(pw, times(1)).close();
        servlet.doGet(request, null);
        verify(response, times(3)).getWriter();
        verify(pw, times(1)).write(anyString());
        verify(pw, times(1)).flush();
        verify(pw, times(1)).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_VMkK0() throws Exception {
        pingservletcdibeanmanagerviajndi = mock(PingServletCDIBeanManagerViaJNDI.class);
        ServletConfig config = mock(ServletConfig.class);
        doCallRealMethod().when(pingservletcdibeanmanagerviajndi).init(config);
        pingservletcdibeanmanagerviajndi.init(config);
        verify(pingservletcdibeanmanagerviajndi, times(1)).init(config);
        assertEquals(new java.util.Date().toString(), initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_psym0() throws Exception {
        pingservletcdibeanmanagerviajndi = new PingServletCDIBeanManagerViaJNDI();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter pw = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(pw);
        pingservletcdibeanmanagerviajndi.doGet(request, response);
        verify(pw).write("<html><head><title>Ping Servlet CDI Bean Manager</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet CDI Bean Manager<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>");
        verify(pw).write("<B>hitCount: " + 0 + "</B></body></html>");
        verify(pw).flush();
        verify(pw).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithException_NMoH1_fid1() throws IOException {
        PingServletCDIBeanManagerViaJNDI servlet = new PingServletCDIBeanManagerViaJNDI();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter pw = mock(PrintWriter.class);
        when(response.getWriter()).thenThrow(new IOException("Error"));
        servlet.doGet(request, response);
        verify(response, times(1)).getWriter();
        verify(pw, never()).write(anyString());
        verify(pw, never()).flush();
        verify(pw, never()).close();
    }
}