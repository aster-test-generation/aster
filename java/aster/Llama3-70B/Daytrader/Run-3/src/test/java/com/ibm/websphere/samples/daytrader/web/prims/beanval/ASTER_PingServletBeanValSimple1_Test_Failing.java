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
import static org.junit.jupiter.api.Assertions.*;
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
public class Aster_PingServletBeanValSimple1_Test_Failing {
private static LocalDateTime initTime;
PingServletBeanValSimple1 pingservletbeanvalsimple1;
HttpServlet httpservlet;
ServletConfig servletConfig;
HttpServletResponse httpservletresponse;
ServletOutputStream servletoutputstream;
HttpServletRequest httpservletrequest;
private static int hitCount = 0;
SimpleBean1 simpleBean1;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservletrequest = mock(HttpServletRequest.class);
        pingservletbeanvalsimple1 = new PingServletBeanValSimple1();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingservletbeanvalsimple1.doPost(httpservletrequest, httpservletresponse);
        verify(pingservletbeanvalsimple1).doGet(httpservletrequest, httpservletresponse);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_LTMF0() throws ServletException, IOException {
    PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServletBeanValSimple1.doPost(req, res);
    verify(req).getMethod();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_RWMK0() {
    PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
    String result = pingServletBeanValSimple1.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_AkVG0() {
    PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
        when(res.getOutputStream()).thenReturn(mock(ServletOutputStream.class));
        pingServletBeanValSimple1.doGet(req, res);
        verify(res).setContentType("text/html");
    } catch (Exception e) {
        fail("Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testdoGet_muLe0() throws Exception {
    httpservletresponse = mock(HttpServletResponse.class);
    servletoutputstream = mock(ServletOutputStream.class);
    httpservletrequest = mock(HttpServletRequest.class);
    simpleBean1 = mock(SimpleBean1.class);
    pingservletbeanvalsimple1 = new PingServletBeanValSimple1();
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    doNothing().when(simpleBean1).checkInjectionValidation();
    pingservletbeanvalsimple1.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse).setContentType("text/html");
    verify(servletoutputstream).println(anyString());
    verify(simpleBean1).checkInjectionValidation();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_RWMK0_fid1() {
    PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
    ServletConfig config = null;
    try {
        pingServletBeanValSimple1.init(config);
    } catch (ServletException e) {
        // Handle exception
    }
    String result = pingServletBeanValSimple1.getServletInfo();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_AkVG0_fid1() {
    ServletConfig config = mock(ServletConfig.class);
    PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
    try {
        pingServletBeanValSimple1.init(config);
    } catch (ServletException e) {
        fail("Exception should not be thrown");
    }
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
        when(res.getOutputStream()).thenReturn(mock(ServletOutputStream.class));
        pingServletBeanValSimple1.doGet(req, res);
        verify(res).setContentType("text/html");
    } catch (Exception e) {
        fail("Exception should not be thrown");
    }
}
}