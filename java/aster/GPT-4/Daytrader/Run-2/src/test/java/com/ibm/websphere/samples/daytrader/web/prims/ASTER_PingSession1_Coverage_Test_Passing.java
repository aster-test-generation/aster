/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingSession1_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_ZuHj0() {
        PingSession1 session = new PingSession1();
        String expected = "HTTP Session Key: Tests management of a read only unique id";
        assertEquals(expected, session.getServletInfo());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostCallsDoGet_jeta0() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingSession1 pingSession = new PingSession1();
        pingSession.doPost(request, response);
        verify(request).setAttribute("methodCalled", "doGet");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostCompletes_laWf1() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingSession1 pingSession = new PingSession1();
        pingSession.doPost(request, response);
        verify(response).setStatus(HttpServletResponse.SC_OK);
    }

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_SessionAttributeNull_Xcij0() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        PrintWriter writer = mock(PrintWriter.class);
        when(request.getSession(true)).thenReturn(session);
        when(session.getAttribute("sessiontest.counter")).thenReturn(null);
        when(response.getWriter()).thenReturn(writer);
        PingSession1 pingSession = new PingSession1();
        pingSession.doGet(request, response);
        verify(session).setAttribute(eq("sessiontest.counter"), any(Integer.class));
        verify(response).setContentType("text/html");
        verify(writer).println(anyString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_SessionAttributeNotNull_tkmt1() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        PrintWriter writer = mock(PrintWriter.class);
        when(request.getSession(true)).thenReturn(session);
        when(session.getAttribute("sessiontest.counter")).thenReturn(5);
        when(response.getWriter()).thenReturn(writer);
        PingSession1 pingSession = new PingSession1();
        pingSession.doGet(request, response);
        verify(response).setContentType("text/html");
        verify(writer).println(anyString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_CatchIOException_AqLG2() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getSession(true)).thenThrow(new IOException());
        PingSession1 pingSession = new PingSession1();
        pingSession.doGet(request, response);
        verify(response).sendError(500, "PingSession1.doGet(...): error. java.io.IOException");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_CatchGenericException_AdBB3() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getSession(true)).thenThrow(new RuntimeException());
        PingSession1 pingSession = new PingSession1();
        pingSession.doGet(request, response);
        verify(response).sendError(500, "PingSession1.doGet(...): error. java.lang.RuntimeException");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_SessionNotNull_Ajby4() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession(true)).thenReturn(session);
        PingSession1 pingSession = new PingSession1();
        pingSession.doGet(request, response);
        verify(request).getSession(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_PrintWriterCalled_sgNl5() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        PrintWriter writer = mock(PrintWriter.class);
        when(request.getSession(true)).thenReturn(session);
        when(response.getWriter()).thenReturn(writer);
        PingSession1 pingSession = new PingSession1();
        pingSession.doGet(request, response);
        verify(writer).println(anyString());
    }
}