/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletCDI_Test_Passing {
    private static String initTime;
    @Mock
    private ServletConfig servletConfig;
    @Mock
    private HttpServlet httpServlet;
    private PingServletCDI pingservletcdi;
    @Mock
    private HttpServletRequest httpServletRequest;
    @Mock
    private HttpServletResponse httpServletResponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        initTime = "2022-01-01 00:00:00";
        when(initTime).thenReturn(initTime);
        when(httpServletRequest.getMethod()).thenReturn("GET");
        PrintWriter printWriter = mock(PrintWriter.class);
        when(httpServletResponse.getWriter()).thenReturn(printWriter);
        pingservletcdi.doGet(httpServletRequest, httpServletResponse);
        verify(printWriter).write("<html><head><title>Ping Servlet CDI</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet CDI<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>");
        verify(printWriter).write("<B>hitCount: " + anyString() + "</B><BR>");
        verify(printWriter).write("<B>hitCount: " + anyString() + "</B><BR>");
        verify(printWriter).flush();
        verify(printWriter).close();
    }
}