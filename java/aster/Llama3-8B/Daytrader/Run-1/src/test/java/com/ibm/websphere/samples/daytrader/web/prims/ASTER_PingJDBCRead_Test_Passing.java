/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJDBCRead_Test_Passing {
    private static String initTime;
    private static int hitCount;
    @Mock
    private ServletConfig servletConfig;
    @InjectMocks
    private PingJDBCRead pingjdbcread;
    HttpServletResponse httpservletresponse;
    HttpServletRequest httprequest;
    HttpServlet httpservlet;
    @Mock
    private HttpServletResponse httpresponse;
    @Mock
    private TradeConfig tradeConfig;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httprequest = mock(HttpServletRequest.class);
        httpservletresponse = mock(HttpServletResponse.class);
        httpservlet = mock(HttpServlet.class);
        pingjdbcread = new PingJDBCRead();
        // Given
        when(httprequest.getMethod()).thenReturn("POST");
        // When
        pingjdbcread.doPost(httprequest, httpservletresponse);
        // Then
        verify(httpservletresponse, times(1)).sendRedirect(any(String.class));
        verify(httpservletresponse, times(1)).setStatus(HttpServletResponse.SC_OK);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_ipYo0() {
        PingJDBCRead pingJDBCRead = new PingJDBCRead();
        String result = pingJDBCRead.getServletInfo();
        assertEquals("Basic JDBC Read using a prepared statment, makes use of TradeJDBC class", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_RrGp0_1() throws ServletException {
        initTime = null;
        hitCount = 0;
        pingjdbcread.init(servletConfig);
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_RrGp0_2() throws ServletException {
        initTime = null;
        hitCount = 0;
        pingjdbcread.init(servletConfig);
        assertNotNull(initTime);
    }
}