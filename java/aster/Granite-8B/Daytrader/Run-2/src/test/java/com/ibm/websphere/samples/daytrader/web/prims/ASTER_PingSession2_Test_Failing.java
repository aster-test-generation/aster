/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingSession2_Test_Failing {
    private static int hitCount;
    private static String initTime;
    PingSession2 pingsession2;
    HttpServlet httpservlet;
    HttpServletRequest httpservletrequest;
    HttpSession httpsession;
    HttpServletResponse httpservletresponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingsession2 = new PingSession2();
        // Mock the init method of HttpServlet
        doNothing().when(httpservlet).init(any());
        // Call the init method of PingSession2
        pingsession2.init(httpservlet);
        // Verify that the hitCount and initTime variables are set correctly
        assertEquals(0, hitCount);
        assertNotNull(initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservlet = mock(HttpServlet.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpsession = mock(HttpSession.class);
        httpservletresponse = mock(HttpServletResponse.class);
        pingsession2 = new PingSession2();
        when(httpservletrequest.getSession(any())).thenReturn(httpsession);
        pingsession2.doPost(httpservletrequest, httpservletresponse);
        verify(httpservletrequest, times(1)).getSession(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_qopI0() {
        PingSession2 pingSession2 = new PingSession2();
        String servletInfo = pingSession2.getServletInfo();
        assertEquals("HTTP Session Key: Tests management of a read/write unique id", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        initTime = "2022-01-01";
        hitCount = 0;
        when(httpservletrequest.getSession(anyBoolean())).thenReturn(httpsession);
        when(httpsession.getAttribute("sessiontest.counter")).thenReturn(null);
        when(httpservletresponse.getWriter()).thenReturn(new PrintWriter(System.out));
        pingsession2.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse, times(1)).setContentType("text/html");
        verify(httpservletresponse, times(1)).setHeader("SessionTrackingTest-counter", "1");
        verify(httpservletresponse, times(1)).getWriter();
        verify(httpservletresponse, times(1)).getWriter().println("<html><head><title>Session Tracking Test 2</title></head><body><HR><BR><FONT size=\"+2\" color=\"#000066\">HTTP Session Test 2: Session create/invalidate <BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time: 2022-01-01</FONT><BR><BR>");
        verify(httpservletresponse, times(1)).getWriter().println("<B>Hit Count: 1<BR>Session hits: 1</B></body></html>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithValidSession_XPAI0() throws ServletException, IOException {
        PingSession2 pingSession2 = new PingSession2();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession(true)).thenReturn(session);
        when(session.getAttribute("sessiontest.counter")).thenReturn(null);
        pingSession2.doGet(request, response);
        verify(response, times(1)).setContentType("text/html");
        verify(response, times(1)).setHeader("SessionTrackingTest-counter", "1");
        verify(response, times(1)).getWriter();
        verify(response.getWriter(), times(1)).println("<html><head><title>Session Tracking Test 2</title></head><body><HR><BR><FONT size=\"+2\" color=\"#000066\">HTTP Session Test 2: Session create/invalidate <BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time: " + initTime + "</FONT><BR><BR>");
        verify(response.getWriter(), times(1)).println("<B>Hit Count: 1<BR>Session hits: 1</B></body></html>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithExistingSession_KUDH1() throws ServletException, IOException {
        PingSession2 pingSession2 = new PingSession2();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession(true)).thenReturn(session);
        when(session.getAttribute("sessiontest.counter")).thenReturn(new Integer(3));
        pingSession2.doGet(request, response);
        verify(response, times(1)).setContentType("text/html");
        verify(response, times(1)).setHeader("SessionTrackingTest-counter", "4");
        verify(response, times(1)).getWriter();
        verify(response.getWriter(), times(1)).println("<html><head><title>Session Tracking Test 2</title></head><body><HR><BR><FONT size=\"+2\" color=\"#000066\">HTTP Session Test 2: Session create/invalidate <BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time: " + initTime + "</FONT><BR><BR>");
        verify(response.getWriter(), times(1)).println("<B>Hit Count: 1<BR>Session hits: 4</B></body></html>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithInvalidatedSession_MgUJ2() throws ServletException, IOException {
        PingSession2 pingSession2 = new PingSession2();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession(true)).thenReturn(session);
        when(session.getAttribute("sessiontest.counter")).thenReturn(new Integer(5));
        doThrow(new IllegalStateException()).when(session).invalidate();
        pingSession2.doGet(request, response);
        verify(response, times(1)).sendError(500, "PingSession2.doGet(...): error. java.lang.IllegalStateException");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_1() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingsession2 = new PingSession2();
        // Mock the init method of HttpServlet
        doNothing().when(httpservlet).init(any());
        // Call the init method of PingSession2
        pingsession2.init(httpservlet);
        // Verify that the hitCount and initTime variables are set correctly
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_2() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingsession2 = new PingSession2();
        // Mock the init method of HttpServlet
        doNothing().when(httpservlet).init(any());
        // Call the init method of PingSession2
        pingsession2.init(httpservlet);
        // Verify that the hitCount and initTime variables are set correctly
        assertNotNull(initTime);
    }
}