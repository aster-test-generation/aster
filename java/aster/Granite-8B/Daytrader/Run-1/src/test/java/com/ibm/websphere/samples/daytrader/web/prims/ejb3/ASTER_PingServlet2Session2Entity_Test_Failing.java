/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import javax.naming.InitialContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedConstruction;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Session2Entity_Test_Failing {
    private static int hitCount;
    private static String initTime;
    private TradeServices tradeSLSBLocal;
    PingServlet2Session2Entity pingServlet2Session2Entity;
    HttpServlet httpServlet;
    InitialContext initialContext;
    MockedConstruction<InitialContext> mockedInitialContext;
    @Mock
    HttpServletRequest req;
    @Mock
    HttpServletResponse res;
    PingServlet2Session2Entity pingservlet2session2entity;
    HttpServletResponse httpservletresponse;
    HttpServlet httpservlet;
    InitialContext initialcontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_1() throws Exception {
        mockedInitialContext = mockConstruction(InitialContext.class);
        httpServlet = mock(HttpServlet.class);
        initialContext = mock(InitialContext.class);
        pingServlet2Session2Entity = new PingServlet2Session2Entity();
        // Set up expectations
        when(initialContext.lookup("java:comp/env/ejb/TradeSLSBBean")).thenReturn(tradeSLSBLocal);
        // Call the method under test
        pingServlet2Session2Entity.init(null);
        // Verify that the expected method was called
        verify(httpServlet).init(null);
        // Verify that the expected variables were set
        // Verify that the expected lookup was performed
        verify(initialContext).lookup("java:comp/env/ejb/TradeSLSBBean");
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_2() throws Exception {
        mockedInitialContext = mockConstruction(InitialContext.class);
        httpServlet = mock(HttpServlet.class);
        initialContext = mock(InitialContext.class);
        pingServlet2Session2Entity = new PingServlet2Session2Entity();
        // Set up expectations
        when(initialContext.lookup("java:comp/env/ejb/TradeSLSBBean")).thenReturn(tradeSLSBLocal);
        // Call the method under test
        pingServlet2Session2Entity.init(null);
        // Verify that the expected method was called
        verify(httpServlet).init(null);
        // Verify that the expected variables were set
        // Verify that the expected lookup was performed
        verify(initialContext).lookup("java:comp/env/ejb/TradeSLSBBean");
        assertNotNull(initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitServletConfig_iowS0() throws ServletException {
        PingServlet2Session2Entity servlet = new PingServlet2Session2Entity();
        ServletConfig config = mock(ServletConfig.class);
        servlet.init(config);
        assertNotNull(servlet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_vNRw0() {
        PingServlet2Session2Entity pingServlet2Session2Entity = new PingServlet2Session2Entity();
        String servletInfo = pingServlet2Session2Entity.getServletInfo();
        assertEquals("web primitive, tests Servlet to Session to Entity EJB path", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        mockedInitialContext = mockConstruction(InitialContext.class);
        httpservletresponse = mock(HttpServletResponse.class);
        httpservlet = mock(HttpServlet.class);
        initialcontext = mock(InitialContext.class);
        pingservlet2session2entity = new PingServlet2Session2Entity();
        String symbol = "TEST_SYMBOL";
        QuoteDataBean quoteData = mock(QuoteDataBean.class);
        when(tradeSLSBLocal.getQuote(symbol)).thenReturn(quoteData);
        pingservlet2session2entity.doGet(null, httpservletresponse);
        verify(httpservletresponse).setContentType("text/html");
        verify(httpservletresponse).getWriter();
        verify(tradeSLSBLocal).getQuote(symbol);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        mockedInitialContext = mockConstruction(InitialContext.class);
        httpServlet = mock(HttpServlet.class);
        initialContext = mock(InitialContext.class);
        pingServlet2Session2Entity = new PingServlet2Session2Entity();
        // Set up expectations
        when(initialContext.lookup("java:comp/env/ejb/TradeSLSBBean")).thenReturn(tradeSLSBLocal);
        // Call the method under test
        pingServlet2Session2Entity.init(null);
        // Verify that the expected method was called
        verify(httpServlet).init(null);
        // Verify that the expected variables were set
        assertEquals(0, hitCount);
        assertNotNull(initTime);
        // Verify that the expected lookup was performed
        verify(initialContext).lookup("java:comp/env/ejb/TradeSLSBBean");
    }
}