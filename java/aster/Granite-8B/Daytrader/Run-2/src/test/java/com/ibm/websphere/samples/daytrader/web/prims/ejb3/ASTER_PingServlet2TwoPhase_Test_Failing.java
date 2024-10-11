/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2TwoPhase_Test_Failing {
    private static int hitCount;
    private static String initTime;
    PingServlet2TwoPhase pingServlet2TwoPhase;
    HttpServlet httpServlet;
    HttpServletResponse httpServletResponse;
    private TradeServices tradeSLSBLocal;
    PingServlet2TwoPhase pingservlet2twophase;
    HttpServletResponse httpservletresponse;
    HttpServlet httpservlet;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServlet2TwoPhase = new PingServlet2TwoPhase();
        // Mock the init method of HttpServlet
        doNothing().when(httpServlet).init(any());
        // Call the init method of PingServlet2TwoPhase
        pingServlet2TwoPhase.init(null);
        // Verify that the init method of HttpServlet is called
        verify(httpServlet, times(1)).init(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_gMCv0() {
        String expected = "web primitive, tests Servlet to Session to Entity EJB and JMS -- 2-phase commit path";
        String actual = pingServlet2TwoPhase.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        httpservlet = mock(HttpServlet.class);
        pingservlet2twophase = new PingServlet2TwoPhase();
        // Mock the call to tradeSLSBLocal.pingTwoPhase method
        QuoteDataBean quoteData = mock(QuoteDataBean.class);
        when(tradeSLSBLocal.pingTwoPhase("symbol")).thenReturn(quoteData);
        // Call the doGet method of PingServlet2TwoPhase
        pingservlet2twophase.doGet(null, httpservletresponse);
        // Verify that the expected methods were called
        verify(httpservletresponse).setContentType("text/html");
        verify(httpservletresponse).getWriter();
        verify(tradeSLSBLocal).pingTwoPhase("symbol");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_TNrC0() throws ServletException, IOException {
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
        assertEquals(HttpServletResponse.SC_OK, response.getStatus());
        assertTrue(response.containsHeader("Content-Type"));
        assertTrue(response.containsHeader("Set-Cookie"));
        assertNotNull(request.getAttribute("symbols"));
        assertNotNull(request.getAttribute("user_balance"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_TNrC0_1() throws ServletException, IOException {
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
        assertEquals(HttpServletResponse.SC_OK, response.getStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_TNrC0_2() throws ServletException, IOException {
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
        assertTrue(response.containsHeader("Content-Type"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_TNrC0_3() throws ServletException, IOException {
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
        assertTrue(response.containsHeader("Set-Cookie"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_TNrC0_4() throws ServletException, IOException {
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
        assertNotNull(request.getAttribute("symbols"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_TNrC0_5() throws ServletException, IOException {
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
        assertNotNull(request.getAttribute("user_balance"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingServlet2TwoPhaseInit_iNwH0() throws ServletException {
        PingServlet2TwoPhase pingServlet2TwoPhase = new PingServlet2TwoPhase();
        pingServlet2TwoPhase.init(null);
    }
}