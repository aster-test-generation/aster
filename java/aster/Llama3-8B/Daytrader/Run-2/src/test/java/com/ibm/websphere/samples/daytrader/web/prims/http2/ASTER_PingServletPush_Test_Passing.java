/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;

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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletPush_Test_Passing {
    private static String initTime;
    private static int hitCount;
    @Mock
    private ServletConfig servletConfig;
    @InjectMocks
    private PingServletPush pingservletpush;
    HttpServlet httpservlet;
    HttpServletRequest httpservletrequest;
    HttpServletResponse httpservletresponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_KuzN0() throws ServletException {
        pingservletpush = new PingServletPush();
        pingservletpush.init(servletConfig);
        verify(servletConfig, times(1)).getInitParameter(anyString());
    }
}