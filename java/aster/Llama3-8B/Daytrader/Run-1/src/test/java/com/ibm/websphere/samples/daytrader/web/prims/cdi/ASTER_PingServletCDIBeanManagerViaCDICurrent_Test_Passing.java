/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.IOException;
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
        // Act
        pingservletcdibeanmanagerviacdicurrent.init(servletConfig);
        // Assert
        assertEquals(new java.util.Date().toString(), initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_aWFx0_gwWZ0() {
        PingServletCDIBeanManagerViaCDICurrent pingServletCDIBeanManagerViaCDICurrent = new PingServletCDIBeanManagerViaCDICurrent();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_BlPe1_phKz0() throws IOException {
        PingServletCDIBeanManagerViaCDICurrent pingServletCDIBeanManagerViaCDICurrent = new PingServletCDIBeanManagerViaCDICurrent();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PrintWriter printWriter = mock(PrintWriter.class);
        when(response.getWriter()).thenReturn(printWriter);
        pingServletCDIBeanManagerViaCDICurrent.doGet(request, response);
        verify(printWriter, times(1)).write(anyString());
        verify(printWriter, times(1)).flush();
        verify(printWriter, times(1)).close();
    }
}