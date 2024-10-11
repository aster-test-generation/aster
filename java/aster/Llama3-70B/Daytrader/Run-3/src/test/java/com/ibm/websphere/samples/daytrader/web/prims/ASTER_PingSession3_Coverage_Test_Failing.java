/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
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
public class Aster_PingSession3_Coverage_Test_Failing {
private PingSession3 pingSession3;
private HttpServletResponse response;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_CqTt0() {
        PingSession3 pingSession3 = new PingSession3();
        String expected = "HTTP Session Object: Tests management of a large custom session class";
        String actual = pingSession3.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_numObjectsNotNull_IFSD0() throws ServletException, IOException {
        PingSession3 pingSession3 = new PingSession3();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("num_objects")).thenReturn("10");
        pingSession3.doGet(request, response);
        verify(response).setContentType("text/html");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_numObjectsNull_gNKp1() throws ServletException, IOException {
        PingSession3 pingSession3 = new PingSession3();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getParameter("num_objects")).thenReturn(null);
        pingSession3.doGet(request, response);
        verify(response).setContentType("text/html");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_sessionNotNull_wnJc4() throws ServletException, IOException {
        PingSession3 pingSession3 = new PingSession3();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession(true)).thenReturn(session);
        pingSession3.doGet(request, response);
        verify(session).setAttribute("sessiontest.sessionData", any(PingSession3Object[].class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_sessionNull_lCCJ5() throws ServletException, IOException {
        PingSession3 pingSession3 = new PingSession3();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getSession(true)).thenReturn(null);
        pingSession3.doGet(request, response);
        verify(response).sendError(500, anyString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_sessionDataNotNull_aBqX6() throws ServletException, IOException {
        PingSession3 pingSession3 = new PingSession3();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession(true)).thenReturn(session);
        when(session.getAttribute("sessiontest.sessionData")).thenReturn(new PingSession3Object[10]);
        pingSession3.doGet(request, response);
        verify(response).setHeader("SessionTrackingTest-largeSessionData", anyString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_sessionDataNull_uDdn7() throws ServletException, IOException {
        PingSession3 pingSession3 = new PingSession3();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession(true)).thenReturn(session);
        when(session.getAttribute("sessiontest.sessionData")).thenReturn(null);
        pingSession3.doGet(request, response);
        verify(response).setHeader("SessionTrackingTest-largeSessionData", anyString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_outputBuffer_OnLY8() throws ServletException, IOException {
        PingSession3 pingSession3 = new PingSession3();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        pingSession3.doGet(request, response);
        verify(response).getWriter();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_outputBuffer_append_Dwig9() throws ServletException, IOException {
        PingSession3 pingSession3 = new PingSession3();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        pingSession3.doGet(request, response);
        verify(response.getWriter()).println(anyString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_CallsDoGet_GrDH1_xiic0() throws ServletException, IOException {
    PingSession3 pingSession3 = new PingSession3();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    pingSession3.doGet(request, response);
    verify(request, times(1)).getSession(true);
    verify(response, times(1)).getWriter();
}
}