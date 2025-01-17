/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2DB_Test_Failing {
    @Mock
    private ServletConfig config;
    private PingServlet2DB pingservlet2db;
    HttpServlet httpservlet;
    HttpServletResponse httpservletresponse;
    Connection connection;
    TradeDirect tradedirect;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservlet = mock(HttpServlet.class);
        httpservletresponse = mock(HttpServletResponse.class);
        connection = mock(Connection.class);
        tradedirect = mock(TradeDirect.class);
        pingservlet2db = new PingServlet2DB();
        when(tradedirect.getConnPublic()).thenReturn(connection);
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getMethod()).thenReturn("POST");
        pingservlet2db.doPost(request, httpservletresponse);
        verify(httpservletresponse).sendRedirect(any(String.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_qbUm0() {
        PingServlet2DB pingServlet2DB = new PingServlet2DB();
        String result = pingServlet2DB.getServletInfo();
        assertEquals("Basic JDBC Read using a prepared statment, makes use of TradeJDBC class", result);
    }
}