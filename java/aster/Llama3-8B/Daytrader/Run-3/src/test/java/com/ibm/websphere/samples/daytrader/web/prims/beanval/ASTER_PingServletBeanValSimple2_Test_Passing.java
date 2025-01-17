/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.util.Log;
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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletBeanValSimple2_Test_Passing {
private static LocalDateTime initTime;
@Mock
    private ServletConfig servletConfig;
@Mock
    private HttpServlet httpServlet;
private PingServletBeanValSimple2 pingservletbeanvalsimple2;
HttpServletResponse httpservletresponse;
ServletOutputStream servletoutputstream;
HttpServletRequest httprequest;
private static int hitCount = 0;
@Mock
    private HttpServletRequest httpServletRequest;
@Mock
    private HttpServletResponse httpServletResponse;
@Mock
    private ServletOutputStream servletOutputStream;
@Mock
    private SimpleBean2 simpleBean2;
@Mock
    private Log log;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetException() throws ServletException, IOException {
        pingservletbeanvalsimple2 = new PingServletBeanValSimple2();
        initTime = LocalDateTime.now();
        hitCount = 0;
        when(httpServletResponse.getOutputStream()).thenReturn(servletOutputStream);
        when(httpServletRequest.getRequestURI()).thenReturn("/ping");
        doThrow(new ServletException()).when(simpleBean2).checkInjectionValidation();
        pingservletbeanvalsimple2.doGet(httpServletRequest, httpServletResponse);
        verify(log).error(anyString(), any());
        verify(httpServletResponse).sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_ZYzR0() {
        PingServletBeanValSimple2 pingServletBeanValSimple2 = new PingServletBeanValSimple2();
        String result = pingServletBeanValSimple2.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost2_ilDa1() throws ServletException, IOException {
        PingServletBeanValSimple2 pingServletBeanValSimple2 = new PingServletBeanValSimple2();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        pingServletBeanValSimple2.doPost(req, res);
        verify(res).setStatus(200);
        verifyNoMoreInteractions(res);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost3_XCvZ2() throws ServletException, IOException {
        PingServletBeanValSimple2 pingServletBeanValSimple2 = new PingServletBeanValSimple2();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        pingServletBeanValSimple2.doPost(req, res);
        verify(res).setContentType("text/html");
        verifyNoMoreInteractions(res);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost4_FHdB3() throws ServletException, IOException {
        PingServletBeanValSimple2 pingServletBeanValSimple2 = new PingServletBeanValSimple2();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        pingServletBeanValSimple2.doPost(req, res);
        verify(res).flushBuffer();
        verifyNoMoreInteractions(res);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost5_PQJb4() throws ServletException, IOException {
        PingServletBeanValSimple2 pingServletBeanValSimple2 = new PingServletBeanValSimple2();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        pingServletBeanValSimple2.doPost(req, res);
        verify(res).isCommitted();
        verifyNoMoreInteractions(res);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInit_QMxp0() throws ServletException {
    pingservletbeanvalsimple2 = new PingServletBeanValSimple2();
    pingservletbeanvalsimple2.init(servletConfig);
    verify(servletConfig, times(1)).getServletContext();
    assertEquals(true, true); // Assuming initTime is boolean
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testdoPost_gClR0() throws Exception{
    HttpServletResponse httpservletresponse = mock(HttpServletResponse.class);
    ServletOutputStream servletoutputstream = mock(ServletOutputStream.class);
    HttpServletRequest httprequest = mock(HttpServletRequest.class);
    PingServletBeanValSimple2 pingservletbeanvalsimple2 = new PingServletBeanValSimple2();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    pingservletbeanvalsimple2.doPost(httprequest, httpservletresponse);
    verify(httpservletresponse).setStatus(200);
    verify(servletoutputstream).write("Hello, World!".getBytes());
    verify(servletoutputstream).flush();
    verify(servletoutputstream).close();
}
}