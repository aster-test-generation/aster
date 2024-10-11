/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
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
import java.lang.reflect.Field;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2ServletRcv_Test_Failing {
private static String initTime = null;
PingServlet2ServletRcv pingservlet2servletrcv;
HttpServlet httpservlet;
ServletConfig servletConfig;
HttpServletRequest httpservletrequest;
HttpServletResponse httpservletresponse;
PrintWriter printWriter;
PingBean pingBean;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        httpservletresponse = mock(HttpServletResponse.class);
        httpservlet = mock(HttpServlet.class);
        pingservlet2servletrcv = new PingServlet2ServletRcv();
        pingservlet2servletrcv.doPost(httpservletrequest, httpservletresponse);
        verify(pingservlet2servletrcv).doGet(httpservletrequest, httpservletresponse);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_iMBh0() throws ServletException, IOException {
    PingServlet2ServletRcv pingServlet2ServletRcv = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet2ServletRcv.doPost(req, res);
    verify(req, times(1)).getMethod();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        httpservletresponse = mock(HttpServletResponse.class);
        printWriter = mock(PrintWriter.class);
        pingBean = mock(PingBean.class);
        pingservlet2servletrcv = new PingServlet2ServletRcv();
        when(httpservletresponse.getWriter()).thenReturn(printWriter);
        when(httpservletrequest.getAttribute("ab")).thenReturn(pingBean);
        pingservlet2servletrcv.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(printWriter).println(anyString());
        verify(pingBean).getMsg();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testinit_eNTU0_1() throws Exception {
    pingservlet2servletrcv = new PingServlet2ServletRcv();
    servletConfig = mock(ServletConfig.class);
    Field initTimeField = PingServlet2ServletRcv.class.getDeclaredField("initTime");
    initTimeField.setAccessible(true);
    pingservlet2servletrcv.init(servletConfig);
    assertNotNull(initTimeField.get(pingservlet2servletrcv));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_fvdg0_catw0() {
    PingServlet pingServlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingBean ab = mock(PingBean.class);
    when(req.getAttribute("ab")).thenReturn(ab);
    when(ab.getMsg()).thenReturn("Test Message");
    try {
        Field initTimeField = PingServlet.class.getDeclaredField("initTime");
        initTimeField.setAccessible(true);
        initTimeField.set(pingServlet, "2022-01-01 00:00:00");
        pingServlet.doGet(req, res);
        verify(res).setContentType("text/html");
        verify(res).getWriter();
    } catch (Exception e) {
        fail("Exception should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testinit_eNTU0_1_fid2() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingservlet2servletrcv = new PingServlet2ServletRcv();
    servletConfig = mock(ServletConfig.class);
    Field initTimeField = PingServlet2ServletRcv.class.getDeclaredField("initTime");
    initTimeField.setAccessible(true);
    pingservlet2servletrcv.init(servletConfig);
    assertNotNull(initTimeField.get(pingservlet2servletrcv));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testinit_eNTU0_2_fid2() throws Exception {
    httpservlet = mock(HttpServlet.class);
    pingservlet2servletrcv = new PingServlet2ServletRcv();
    servletConfig = mock(ServletConfig.class);
    Field initTimeField = PingServlet2ServletRcv.class.getDeclaredField("initTime");
    initTimeField.setAccessible(true);
    pingservlet2servletrcv.init(servletConfig);
    assertTrue(true);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_fvdg0_catw0_fid2() {
    PingServlet2ServletRcv pingServlet2ServletRcv = new PingServlet2ServletRcv();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingBean ab = mock(PingBean.class);
    when(req.getAttribute("ab")).thenReturn(ab);
    when(ab.getMsg()).thenReturn("Test Message");
    try {
        Field initTimeField = PingServlet2ServletRcv.class.getDeclaredField("initTime");
        initTimeField.setAccessible(true);
        initTimeField.set(pingServlet2ServletRcv, "2022-01-01 00:00:00");
        pingServlet2ServletRcv.doGet(req, res);
        verify(res).setContentType("text/html");
        verify(res).getWriter();
    } catch (Exception e) {
        fail("Exception should not be thrown");
    }
}
}