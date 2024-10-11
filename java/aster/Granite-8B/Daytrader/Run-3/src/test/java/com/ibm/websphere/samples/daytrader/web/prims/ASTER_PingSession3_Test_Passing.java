/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingSession3_Test_Passing {
    private static String initTime = null;
    private static int hitCount = 0;
    PingSession3 pingsession3;
    HttpServlet httpservlet;
    HttpServletResponse httpservletresponse;
    HttpServletRequest httpservletrequest;
    HttpSession httpsession;
    private static int NUM_OBJECTS = 2;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservlet = mock(HttpServlet.class);
        httpservletresponse = mock(HttpServletResponse.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpsession = mock(HttpSession.class);
        pingsession3 = new PingSession3();
        when(httpservletrequest.getSession(any())).thenReturn(httpsession);
        pingsession3.doPost(httpservletrequest, httpservletresponse);
        verify(httpservletrequest, times(1)).getSession(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        httpservlet = mock(HttpServlet.class);
        httpservletresponse = mock(HttpServletResponse.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpsession = mock(HttpSession.class);
        pingsession3 = new PingSession3();
        when(httpservletrequest.getSession(any())).thenReturn(httpsession);
        pingsession3.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(httpservletresponse).setHeader("SessionTrackingTest-largeSessionData", any());
        verify(httpservletresponse).getWriter();
        verify(httpservletresponse).sendError(anyInt(), anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_ICaL0() {
        PingSession3 pingSession3 = new PingSession3();
        String servletInfo = pingSession3.getServletInfo();
        assertEquals("HTTP Session Object: Tests management of a large custom session class", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitServletConfig_tgyi0() throws ServletException {
        PingSession3 pingSession3 = new PingSession3();
        ServletConfig config = mock(ServletConfig.class);
        pingSession3.init(config);
        verify(config).getInitParameter("pingPath");
        verify(config).getInitParameter("pingInterval");
        verify(config).getInitParameter("maxThreads");
        verify(config).getInitParameter("threadPriority");
        verify(config).getInitParameter("pingCount");
        verify(config).getInitParameter("pingTimeout");
        verify(config).getInitParameter("pingURL");
        verify(config).getInitParameter("expectedReturnCode");
        verify(config).getInitParameter("expectedContentType");
        verify(config).getInitParameter("expectedContent");
        verify(config).getInitParameter("expectedContentRegex");
        verify(config).getInitParameter("expectedContentSubstring");
        verify(config).getInitParameter("expectedContentNotSubstring");
        verify(config).getInitParameter("expectedContentNotRegex");
        verify(config).getInitParameter("expectedContentFromFile");
        verify(config).getInitParameter("expectedContentFromFileRegex");
        verify(config).getInitParameter("expectedContentFromFileSubstring");
        verify(config).getInitParameter("expectedContentFromFileNotSubstring");
        verify(config).getInitParameter("expectedContentFromFileNotRegex");
        verify(config).getInitParameter("expectedContentFromFileURL");
        verify(config).getInitParameter("expectedContentFromFileURLRegex");
        verify(config).getInitParameter("expectedContentFromFileURLSubstring");
        verify(config).getInitParameter("expectedContentFromFileURLNotSubstring");
        verify(config).getInitParameter("expectedContentFromFileURLNotRegex");
        verify(config).getInitParameter("expectedContentFromFileURLCharset");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetRegex");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetSubstring");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetNotSubstring");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetNotRegex");
        verify(config).getInitParameter("expectedContentFromFileURLCharset");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetRegex");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetSubstring");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetNotSubstring");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetNotRegex");
        verify(config).getInitParameter("expectedContentFromFileURLCharset");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetRegex");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetSubstring");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetNotSubstring");
        verify(config).getInitParameter("expectedContentFromFileURLCharsetNotRegex");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_XWJo0_TUWW0() throws ServletException, IOException {
        PingSession3 pingSession3 = new PingSession3();
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();
        pingSession3.doPost(request, response);
    }
}