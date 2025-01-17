/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletOutputStream;
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
public class Aster_PingServlet2PDF_Test_Failing {
    PingServlet2PDF pingservlet2pdf;
    HttpServletRequest httpservletrequest;
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;
    private static int BUFFER_SIZE = 1024 * 8;
    private static int hitCount = 0;
    @Mock
    private PingBean pingbean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost_jQHL0() throws Exception {
        HttpServletRequest httpservletrequest = mock(HttpServletRequest.class);
        HttpServletResponse httpservletresponse = mock(HttpServletResponse.class);
        ServletOutputStream servletoutputstream = mock(ServletOutputStream.class);
        PingServlet2PDF pingservlet2pdf = new PingServlet2PDF();
        when(httpservletrequest.getMethod()).thenReturn("POST");
        pingservlet2pdf.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).setStatus(200);
        verify(httpservletresponse).setContentType("application/pdf");
        verify(servletoutputstream).write(any(byte[].class));
        verify(servletoutputstream).flush();
        verify(servletoutputstream).close();
    }
}