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
import javax.servlet.http.HttpSession;
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
public class Aster_PingSession1_Test_Failing {
private static String initTime;
private static int hitCount;
private static int count;
PingSession1 pingsession1;
ServletConfig servletConfig;
HttpServlet httpservlet;
HttpServletRequest httpservletrequest;
HttpSession httpsession;
HttpServletResponse httpservletresponse;
PrintWriter printWriter;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        httpsession = mock(HttpSession.class);
        httpservletresponse = mock(HttpServletResponse.class);
        printWriter = mock(PrintWriter.class);
        pingsession1 = new PingSession1();
        when(httpservletrequest.getSession(any())).thenReturn(httpsession);
        when(httpsession.getAttribute("sessiontest.counter")).thenReturn(null);
        when(httpservletresponse.getWriter()).thenReturn(printWriter);
        pingsession1.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(httpservletresponse).setHeader("SessionKeyTest-SessionID", "SessionID:0");
        verify(printWriter).println(anyString());
        assertEquals(1, hitCount);
        assertEquals(1, count);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_QWgv0() {
    PingSession1 pingSession1 = new PingSession1();
    String result = pingSession1.getServletInfo();
    assertEquals("HTTP Session Key: Tests management of a read only unique id", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_kuZj0() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingSession1.doPost(req, res);
    verify(req, times(1)).getAttribute(anyString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_SessionExists_jtTG0() {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(1);
    try {
        pingSession1.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(response).setHeader("SessionKeyTest-SessionID", "SessionID:1");
    } catch (Exception e) {
        fail();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_SessionDoesNotExist_QWIN1() {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(null);
    try {
        pingSession1.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(response).setHeader("SessionKeyTest-SessionID", "SessionID:1");
    } catch (Exception e) {
        fail();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_1() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        httpsession = mock(HttpSession.class);
        httpservletresponse = mock(HttpServletResponse.class);
        printWriter = mock(PrintWriter.class);
        pingsession1 = new PingSession1();
        when(httpservletrequest.getSession(any())).thenReturn(httpsession);
        when(httpsession.getAttribute("sessiontest.counter")).thenReturn(null);
        when(httpservletresponse.getWriter()).thenReturn(printWriter);
        pingsession1.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(httpservletresponse).setHeader("SessionKeyTest-SessionID", "SessionID:0");
        verify(printWriter).println(anyString());
        assertEquals(1, hitCount);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_2() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        httpsession = mock(HttpSession.class);
        httpservletresponse = mock(HttpServletResponse.class);
        printWriter = mock(PrintWriter.class);
        pingsession1 = new PingSession1();
        when(httpservletrequest.getSession(any())).thenReturn(httpsession);
        when(httpsession.getAttribute("sessiontest.counter")).thenReturn(null);
        when(httpservletresponse.getWriter()).thenReturn(printWriter);
        pingsession1.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(httpservletresponse).setHeader("SessionKeyTest-SessionID", "SessionID:0");
        verify(printWriter).println(anyString());
        assertEquals(1, count);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testinit_OFnF0_1() throws Exception{
    servletConfig = mock(ServletConfig.class);
    httpservlet = mock(HttpServlet.class);
    pingsession1 = new PingSession1();
    pingsession1.init(servletConfig);
    assertEquals(0, hitCount);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testinit_OFnF0_2() throws Exception{
    servletConfig = mock(ServletConfig.class);
    httpservlet = mock(HttpServlet.class);
    pingsession1 = new PingSession1();
    pingsession1.init(servletConfig);
    assertEquals(0, count);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testinit_OFnF0_3() throws Exception{
    servletConfig = mock(ServletConfig.class);
    httpservlet = mock(HttpServlet.class);
    pingsession1 = new PingSession1();
    pingsession1.init(servletConfig);
    assertNotNull(initTime);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_QWgv0_fid2() {
    PingSession1 pingSession1 = new PingSession1();
    String result = pingSession1.getServletInfo();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_kuZj0_fid2() throws ServletException, IOException {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getSession(true)).thenReturn(mock(HttpSession.class));
    pingSession1.doGet(req, res);
    verify(req, times(1)).getSession(true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_SessionExists_jtTG0_fid2() {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(1);
    try {
        pingSession1.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(response).setHeader("SessionKeyTest-SessionID", "SessionID:1");
        verify(response, times(1)).getWriter();
    } catch (Exception e) {
        fail();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_SessionDoesNotExist_QWIN1_fid2() {
    PingSession1 pingSession1 = new PingSession1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.counter")).thenReturn(null);
    try {
        pingSession1.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(response).setHeader("SessionKeyTest-SessionID", "SessionID:0");
    } catch (Exception e) {
        fail();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testinit_OFnF0_1_fid2() throws Exception{
    servletConfig = mock(ServletConfig.class);
    pingsession1 = new PingSession1();
    pingsession1.init(servletConfig);
    assertNotNull(pingsession1.getServletConfig());}
}