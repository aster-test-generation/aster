/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
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

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletCDIEvent_Test_Failing {
    @Mock
    private ServletConfig servletConfig;
    private PingServletCDIEvent pingservletcdievent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_QJQR0() throws IOException {
        PingServletCDIEvent pingServletCDIEvent = new PingServletCDIEvent();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        PrintWriter pw = new PrintWriter(new java.io.StringWriter());
        pingServletCDIEvent.doGet(request, response);
        String expected = "<html><head><title>Ping Servlet CDI Event</title></head><body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet CDI Event<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : <BR><BR></FONT>";
        expected += "<B>hitCount1: </B></body></html>";
        assertEquals(expected, pw.toString());
    }
}