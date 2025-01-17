/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Session2Entity2JSP_Test_Passing {
    @Mock
    HttpServlet httpServlet;
    PingServlet2Session2Entity2JSP pingServlet2Session2Entity2JSP;
    @Mock
    PingServlet2Session2Entity2JSP pingServlet;
    @Mock
    ServletConfig servletConfig;
    @Mock
    HttpServletRequest httpServletRequest;
    @Mock
    ServletContext servletContext;
    @Mock
    HttpServletResponse httpServletResponse;
    private TradeServices tradeSLSBLocal;
    QuoteDataBean quoteDataBean;
    String symbol;
    QuoteDataBean quoteData;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws ServletException {
        pingServlet2Session2Entity2JSP = new PingServlet2Session2Entity2JSP();
        pingServlet2Session2Entity2JSP.init(httpServlet);
        verify(httpServlet).init(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost() throws Exception {
        pingServlet = new PingServlet2Session2Entity2JSP();
        when(httpServletRequest.getSession()).thenReturn(null);
        pingServlet.doPost(httpServletRequest, httpServletResponse);
        verify(httpServletRequest).getSession();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_WJgU0() throws ServletException, IOException {
        PingServlet2Session2Entity2JSP servlet = new PingServlet2Session2Entity2JSP();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        servlet.doPost(req, res);
        verify(req, times(1)).getParameter("input");
        verify(res, times(1)).setContentType("text/html");
        verify(res, times(1)).getWriter();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_txuG0() {
        PingServlet2Session2Entity2JSP pingServlet2Session2Entity2JSP = new PingServlet2Session2Entity2JSP();
        String servletInfo = pingServlet2Session2Entity2JSP.getServletInfo();
        assertEquals("web primitive, tests Servlet to Session to Entity EJB to JSP path", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNullSymbol_Pacz0() throws ServletException, IOException {
        PingServlet2Session2Entity2JSP pingServlet = new PingServlet2Session2Entity2JSP();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletContext context = mock(ServletContext.class);
        when(request.getServletContext()).thenReturn(context);
        when(request.getAttribute("symbol")).thenReturn(null);
        pingServlet.doGet(request, response);
        assertNotNull(request.getAttribute("quoteData"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithNonNullSymbol_PWox1() throws ServletException, IOException {
        PingServlet2Session2Entity2JSP pingServlet = new PingServlet2Session2Entity2JSP();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletContext context = mock(ServletContext.class);
        when(request.getServletContext()).thenReturn(context);
        when(request.getAttribute("symbol")).thenReturn("TEST");
        pingServlet.doGet(request, response);
        assertNotNull(request.getAttribute("quoteData"));
    }
}