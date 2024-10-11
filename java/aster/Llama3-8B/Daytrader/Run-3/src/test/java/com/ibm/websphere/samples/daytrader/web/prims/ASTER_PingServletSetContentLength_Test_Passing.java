/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.ServletConfig;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletSetContentLength_Test_Passing {
PingServletSetContentLength pingservletsetcontentlength;
ServletConfig servletConfig;
HttpServlet httpServlet;
HttpServletResponse httpservletresponse;
HttpServletRequest httpservletrequest;
ServletOutputStream servletoutputstream;
HttpServlet httpservlet;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        httpservletrequest = mock(HttpServletRequest.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservlet = mock(HttpServlet.class);
        pingservletsetcontentlength = new PingServletSetContentLength();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingservletsetcontentlength.doPost(httpservletrequest, httpservletresponse);
        verify(servletoutputstream).write("".getBytes());
        verify(servletoutputstream).flush();
        verify(servletoutputstream).close();
    }
}