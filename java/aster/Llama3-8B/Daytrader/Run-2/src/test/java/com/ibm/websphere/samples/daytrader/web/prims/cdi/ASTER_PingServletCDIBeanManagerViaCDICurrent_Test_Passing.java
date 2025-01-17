/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.PrintWriter;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
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
import org.springframework.mock.web.MockServletContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletCDIBeanManagerViaCDICurrent_Test_Passing {
    private static String initTime;
    @Mock
    private ServletConfig servletConfig;
    @InjectMocks
    private PingServletCDIBeanManagerViaCDICurrent pingservletcdibeanmanagerviacdicurrent;
    @Mock
    private HttpServletRequest httpServletRequest;
    @Mock
    private HttpServletResponse httpServletResponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws ServletException {
        initTime = null;
        when(servletConfig.getServletContext()).thenReturn(new MockServletContext());
        pingservletcdibeanmanagerviacdicurrent = new PingServletCDIBeanManagerViaCDICurrent();
        pingservletcdibeanmanagerviacdicurrent.init(servletConfig);
        verify(servletConfig).getServletContext();
        assertEquals(new java.util.Date().toString(), initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_TtyC0() throws Exception {
        initTime = "2022-01-01 12:00:00";
        when(httpServletRequest.getParameter("initTime")).thenReturn(initTime);
        PrintWriter printWriter = mock(PrintWriter.class);
        when(httpServletResponse.getWriter()).thenReturn(printWriter);
        pingservletcdibeanmanagerviacdicurrent.doGet(httpServletRequest, httpServletResponse);
        verify(httpServletResponse, times(1)).setContentType("text/html");
        verify(httpServletResponse, times(1)).setStatus(HttpServletResponse.SC_OK);
        verify(printWriter, times(1)).write(anyString());
        verify(printWriter, times(1)).flush();
        verify(printWriter, times(1)).close();
        verify(httpServletRequest, times(1)).getParameter("initTime");
        verifyNoMoreInteractions(httpServletRequest, httpServletResponse, printWriter);
    }
}