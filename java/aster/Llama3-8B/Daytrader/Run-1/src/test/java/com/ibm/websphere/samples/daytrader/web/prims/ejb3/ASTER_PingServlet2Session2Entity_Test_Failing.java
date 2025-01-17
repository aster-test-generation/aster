/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.MockedConstruction;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Session2Entity_Test_Failing {
    private static int hitCount;
    private static String initTime;
    private TradeServices tradeSLSBLocal;
    PingServlet2Session2Entity pingservlet2session2entity;
    HttpServlet httpservlet;
    InitialContext initialcontext;
    MockedConstruction<InitialContext> mockedInitialContext;
    HttpServletResponse httpservletresponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        mockedInitialContext = mockConstruction(InitialContext.class);
        httpservlet = mock(HttpServlet.class);
        initialcontext = mock(InitialContext.class);
        httpservletresponse = mock(HttpServletResponse.class);
        pingservlet2session2entity = new PingServlet2Session2Entity();
        HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
        when(httpServletRequest.getMethod()).thenReturn("POST");
        pingservlet2session2entity.doPost(httpServletRequest, httpservletresponse);
        verify(httpServletRequest, times(1)).getMethod();
        verify(httpservletresponse, times(1)).sendRedirect(anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_aftC0() {
        PingServlet2Session2Entity pingServlet2Session2Entity = new PingServlet2Session2Entity();
        String result = pingServlet2Session2Entity.getServletInfo();
        assertEquals("web primitive, tests Servlet to Session to Entity EJB path", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_keTX0_1() throws Exception {
        mockedInitialContext = mockConstruction(InitialContext.class);
        httpservlet = mock(HttpServlet.class);
        initialcontext = mock(InitialContext.class);
        httpservletresponse = mock(HttpServletResponse.class);
        pingservlet2session2entity = new PingServlet2Session2Entity();
        initTime = "2022-01-01";
        hitCount = 0;
        when(initialcontext.lookup("TradeServices")).thenReturn(tradeSLSBLocal);
        when(tradeSLSBLocal.getQuote("symbol")).thenReturn(new QuoteDataBean());
        pingservlet2session2entity.doGet((HttpServletRequest) httpservlet, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(httpservletresponse, times(1)).getWriter();
        verify(tradeSLSBLocal).getQuote("symbol");
        verify(tradeSLSBLocal, times(1)).getQuote("symbol");
        assertEquals(1, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet_keTX0_2() throws Exception {
        mockedInitialContext = mockConstruction(InitialContext.class);
        httpservlet = mock(HttpServlet.class);
        initialcontext = mock(InitialContext.class);
        httpservletresponse = mock(HttpServletResponse.class);
        pingservlet2session2entity = new PingServlet2Session2Entity();
        initTime = "2022-01-01";
        hitCount = 0;
        when(initialcontext.lookup("TradeServices")).thenReturn(tradeSLSBLocal);
        when(tradeSLSBLocal.getQuote("symbol")).thenReturn(new QuoteDataBean());
        pingservlet2session2entity.doGet((HttpServletRequest) httpservlet, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(httpservletresponse, times(1)).getWriter();
        verify(tradeSLSBLocal).getQuote("symbol");
        verify(tradeSLSBLocal, times(1)).getQuote("symbol");
        assertEquals("2022-01-01", initTime);
    }
}