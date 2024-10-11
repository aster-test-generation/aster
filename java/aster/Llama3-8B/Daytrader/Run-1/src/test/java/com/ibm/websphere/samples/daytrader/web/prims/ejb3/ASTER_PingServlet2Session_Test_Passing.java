/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Session_Test_Passing {
    private static String initTime;
    private static int hitCount;
    @Mock
    private ServletConfig config;
    @InjectMocks
    private PingServlet2Session pingservlet2session;
    HttpServletRequest httprequest;
    HttpServletResponse httpservletresponse;
    private TradeServices tradeSLSBLocal;
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private TradeConfig tradeConfig;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httprequest = mock(HttpServletRequest.class);
        httpservletresponse = mock(HttpServletResponse.class);
        pingservlet2session = new PingServlet2Session();
        // Given
        when(httprequest.getMethod()).thenReturn("POST");
        // When
        pingservlet2session.doPost(httprequest, httpservletresponse);
        // Then
        verify(httprequest, times(1)).getMethod();
        verify(pingservlet2session, times(1)).doGet(httprequest, httpservletresponse);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostNullRequest_yava1() throws ServletException, IOException {
        PingServlet2Session pingServlet2Session = new PingServlet2Session();
        HttpServletResponse response = mock(HttpServletResponse.class);
        pingServlet2Session.doPost(null, response);
        verify(response, times(1)).sendError(HttpServletResponse.SC_BAD_REQUEST);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostNullResponse_wmVM2() throws ServletException, IOException {
        PingServlet2Session pingServlet2Session = new PingServlet2Session();
        HttpServletRequest request = mock(HttpServletRequest.class);
        pingServlet2Session.doPost(request, null);
        verify(request, times(1)).getRequestDispatcher("/error");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_hZMt0() {
        PingServlet2Session pingServlet2Session = new PingServlet2Session();
        String result = pingServlet2Session.getServletInfo();
        assertEquals("web primitive, configured with trade runtime configs, tests Servlet to Session EJB path", result);
    }
}