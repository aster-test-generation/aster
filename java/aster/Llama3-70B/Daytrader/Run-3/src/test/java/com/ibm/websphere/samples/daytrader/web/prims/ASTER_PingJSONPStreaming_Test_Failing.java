/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
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
public class Aster_PingJSONPStreaming_Test_Failing {
private static String initTime;
private static int hitCount;
PingJSONPStreaming pingjsonpstreaming;
ServletConfig servletConfig;
HttpServletResponse httpservletresponse;
ServletOutputStream servletoutputstream;
HttpServletRequest httpservletrequest;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_iFFh0() {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    String result = pingJSONPStreaming.getServletInfo();
    assertEquals("Basic JSON generation and parsing in a servlet", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_sysG0() throws ServletException, IOException {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingJSONPStreaming.doPost(req, res);
    verify(req).getMethod();
    verify(res).setStatus(200);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_JUVs0() {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
        when(res.getOutputStream()).thenReturn(mock(ServletOutputStream.class));
        when(req.getContentType()).thenReturn("text/html");
        pingJSONPStreaming.doGet(req, res);
        verify(res).setContentType("text/html");
    } catch (Exception e) {
        fail();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_IOException_Mldh1() {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
        when(res.getOutputStream()).thenThrow(new IOException());
        pingJSONPStreaming.doGet(req, res);
        verify(res).sendError(500, anyString());
    } catch (Exception e) {
        fail();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_iFFh0_fid1() {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    String result = pingJSONPStreaming.getClass().getAnnotation(javax.servlet.annotation.WebServlet.class).description();
    assertEquals("PingJSONPStreaming", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_sysG0_fid1() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getMethod()).thenReturn("GET");
    new PingJSONPStreaming().doGet(req, res);
    verify(res).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_JUVs0_fid1() {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    try {
        when(res.getOutputStream()).thenReturn(out);
        when(req.getContentType()).thenReturn("text/html");
        pingJSONPStreaming.doGet(req, res);
        verify(res).setContentType("text/html");
        verify(out).println(anyString());
    } catch (Exception e) {
        fail();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_IOException_Mldh1_fid1() {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
        when(res.getOutputStream()).thenThrow(new IOException());
        pingJSONPStreaming.doGet(req, res);
        verify(res).sendError(500, anyString());
    } catch (ServletException e) {
        // Expected
    } catch (IOException e) {
        // Expected
    }
}
}