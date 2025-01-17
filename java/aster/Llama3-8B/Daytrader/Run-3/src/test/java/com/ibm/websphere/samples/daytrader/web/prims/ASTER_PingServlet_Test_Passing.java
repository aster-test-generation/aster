/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.ServletConfig;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet_Test_Passing {
private static int hitCount;
private static String initTime;
@Mock
    private ServletConfig config;
@InjectMocks
    private PingServlet pingservlet;
HttpServletResponse httpservletresponse;
ServletOutputStream servletoutputstream;
HttpServletRequest httprequest;
@Mock
    private HttpServlet httpservlet;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httprequest = mock(HttpServletRequest.class);
        pingservlet = new PingServlet();
        when(httprequest.getMethod()).thenReturn("POST");
        pingservlet.doPost(httprequest, httpservletresponse);
        verify(httpservletresponse).setStatus(HttpServletResponse.SC_OK);
        verify(servletoutputstream).write("Hello, World!".getBytes());
        verify(servletoutputstream).flush();
        verify(servletoutputstream).close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_Qxlo0() {
        PingServlet pingServlet = new PingServlet();
        String result = pingServlet.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }
}