/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
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

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJSONPStreaming_Test_Passing {
    private static String initTime;
    private static int hitCount;
    PingJSONPStreaming pingjsonpstreaming;
    HttpServlet httpservlet;
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;
    @Mock
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    @Mock
    ServletOutputStream servletOutputStream;
    @InjectMocks
    PingJSONPStreaming pingJSONPStreaming;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void tearDown_OhXG1() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_lMCG0() {
        PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
        String servletInfo = pingJSONPStreaming.getServletInfo();
        assertEquals("Basic JSON generation and parsing in a servlet", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_dESi0() {
        initTime = new java.util.Date().toString();
        hitCount = 0;
    }
}