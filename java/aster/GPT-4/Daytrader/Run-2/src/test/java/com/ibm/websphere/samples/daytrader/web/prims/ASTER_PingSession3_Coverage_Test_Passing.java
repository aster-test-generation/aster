/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
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

import org.mockito.Mockito;
public class Aster_PingSession3_Coverage_Test_Passing {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private PrintWriter writer;
    private PingSession3 pingSession3;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_KHCj0() {
        PingSession3 session = new PingSession3();
        String expectedInfo = "HTTP Session Object: Tests management of a large custom session class";
        assertEquals(expectedInfo, session.getServletInfo());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostCallsDoGet_IPAK0() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingSession3 pingSession = new PingSession3();
        pingSession.doPost(request, response);
        verify(pingSession).doGet(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostExecutionCompletes_VgUg1() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingSession3 pingSession = new PingSession3();
        pingSession.doPost(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitCallsSuperInit_UIuk0() throws ServletException {
        ServletConfig config = Mockito.mock(ServletConfig.class);
        PingSession3 pingSession = Mockito.spy(new PingSession3());
        pingSession.init(config);
        Mockito.verify(pingSession).init(config);
    }

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_dNsF0() throws IOException {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);
        writer = mock(PrintWriter.class);
        pingSession3 = new PingSession3();
        when(response.getWriter()).thenReturn(writer);
        when(request.getSession(true)).thenReturn(session);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNumObjectsParameterNotNull_xSyP1() throws Exception {
        when(request.getParameter("num_objects")).thenReturn("5");
        pingSession3.doGet(request, response);
        verify(session).invalidate();
        verify(writer).print(anyString());
        verify(writer).close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNumObjectsParameterNull_IMkU2() throws Exception {
        when(request.getParameter("num_objects")).thenReturn(null);
        when(session.getAttribute("sessiontest.sessionData")).thenReturn(null);
        pingSession3.doGet(request, response);
        verify(session).setAttribute(eq("sessiontest.sessionData"), any());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNumObjectsParameterInvalid_ZVhv3() throws Exception {
        when(request.getParameter("num_objects")).thenReturn("invalid");
        pingSession3.doGet(request, response);
        verify(response).sendError(500, "PingSession3.doGet(...): error. java.lang.NumberFormatException: For input string: \"invalid\"");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNumObjectsParameterNegative_KvnI4() throws Exception {
        when(request.getParameter("num_objects")).thenReturn("-1");
        pingSession3.doGet(request, response);
        verify(session, never()).invalidate();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithSessionDataNotNull_Xolz5() throws Exception {
        when(request.getParameter("num_objects")).thenReturn(null);
        when(session.getAttribute("sessiontest.sessionData")).thenReturn(new PingSession3Object[5]);
        pingSession3.doGet(request, response);
        verify(session, never()).setAttribute(eq("sessiontest.sessionData"), any());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetCatchNumberFormatException_GvMp7() throws Exception {
        when(request.getParameter("num_objects")).thenReturn("abc");
        pingSession3.doGet(request, response);
        verify(response).sendError(500, "PingSession3.doGet(...): error. java.lang.NumberFormatException: For input string: \"abc\"");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetCatchIOExceptionOnGetWriter_GaVD8() throws Exception {
        when(response.getWriter()).thenThrow(new IOException());
        pingSession3.doGet(request, response);
        verify(response).sendError(500, "PingSession3.doGet(...): error. java.io.IOException");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetCatchServletExceptionOnGetSession_nhBg9() throws Exception {
        when(request.getSession(true)).thenThrow(new ServletException());
        pingSession3.doGet(request, response);
        verify(response).sendError(500, "PingSession3.doGet(...): error getting session");
    }
}