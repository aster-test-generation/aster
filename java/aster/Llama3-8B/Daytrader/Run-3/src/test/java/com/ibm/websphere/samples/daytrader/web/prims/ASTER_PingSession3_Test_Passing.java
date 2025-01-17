/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingSession3_Test_Passing {
private static String initTime = null;
private static int hitCount = 0;
@Mock
    private ServletConfig servletConfig;
@InjectMocks
    private PingSession3 pingsession3;
HttpServletResponse httpservletresponse;
HttpServletRequest httpservletrequest;
HttpSession httpsession;
HttpServlet httpservlet;
private static int NUM_OBJECTS = 2;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        httpservletrequest = mock(HttpServletRequest.class);
        httpsession = mock(HttpSession.class);
        httpservlet = mock(HttpServlet.class);
        pingsession3 = new PingSession3();
        when(httpservletrequest.getSession(any())).thenReturn(httpsession);
        pingsession3.doPost(httpservletrequest, httpservletresponse);
        verify(httpservletresponse, times(1)).sendRedirect(anyString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_tXaa0() {
        PingSession3 pingSession3 = new PingSession3();
        String result = pingSession3.getServletInfo();
        assertEquals("HTTP Session Object: Tests management of a large custom session class", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInit_WsqS1_1() throws ServletException {
    MockitoAnnotations.initMocks(this);
    pingsession3.init(servletConfig);
    Mockito.verify(servletConfig, Mockito.times(1)).getServletContext();
    Assertions.assertNotNull(hitCount);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInit_WsqS1_2() throws ServletException {
    MockitoAnnotations.initMocks(this);
    pingsession3.init(servletConfig);
    Mockito.verify(servletConfig, Mockito.times(1)).getServletContext();
    Assertions.assertNotNull(initTime);}
}