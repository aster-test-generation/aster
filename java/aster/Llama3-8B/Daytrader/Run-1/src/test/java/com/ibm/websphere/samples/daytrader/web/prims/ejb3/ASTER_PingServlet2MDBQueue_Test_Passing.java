/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.util.concurrent.TimeUnit;
import javax.jms.ConnectionFactory;
import javax.jms.Queue;
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
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2MDBQueue_Test_Passing {
    private static String initTime;
    private static int hitCount;
    @Mock
    private ServletConfig config;
    @InjectMocks
    private PingServlet2MDBQueue pingservlet2mdbqueue;
    HttpServletRequest httprequest;
    HttpServletResponse httpservletresponse;
    private ConnectionFactory queueConnectionFactory;
    private Queue tradeBrokerQueue;
    @Mock
    private HttpServletRequest httpServletRequest;
    @Mock
    private HttpServletResponse httpServletResponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httprequest = mock(HttpServletRequest.class);
        httpservletresponse = mock(HttpServletResponse.class);
        pingservlet2mdbqueue = new PingServlet2MDBQueue();
        // Given
        when(httprequest.getMethod()).thenReturn("POST");
        // When
        pingservlet2mdbqueue.doPost(httprequest, httpservletresponse);
        // Then
        verify(httpservletresponse, times(1)).sendRedirect(anyString());
        verify(httpservletresponse, times(1)).setStatus(HttpServletResponse.SC_OK);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_QRTN0() {
        PingServlet2MDBQueue pingServlet2MDBQueue = new PingServlet2MDBQueue();
        String result = pingServlet2MDBQueue.getServletInfo();
        assertEquals("web primitive, configured with trade runtime configs, tests Servlet to Session EJB path", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_SuiO0() throws ServletException {
        MockitoAnnotations.initMocks(this);
        pingservlet2mdbqueue.init(config);
        verify(config, times(1)).getServletContext();
        assertNotNull(initTime);
    }
}