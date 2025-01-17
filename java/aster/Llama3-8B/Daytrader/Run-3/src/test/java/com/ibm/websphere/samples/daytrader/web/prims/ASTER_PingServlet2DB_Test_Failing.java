/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import java.sql.Connection;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2DB_Test_Failing {
@Mock
    private ServletConfig servletConfig;
private PingServlet2DB pingservlet2db;
@Mock
    private HttpServletResponse httpservletresponse;
@Mock
    private Connection connection;
@Mock
    private TradeDirect tradedirect;
@Mock
    private HttpServletRequest httpServletRequest;
private static String initTime;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        connection = mock(Connection.class);
        tradedirect = mock(TradeDirect.class);
        httpServletRequest = mock(HttpServletRequest.class);
        pingservlet2db = mock(PingServlet2DB.class);
        when(tradedirect.getConnPublic()).thenReturn(connection);
        when(httpServletRequest.getMethod()).thenReturn("POST");
        pingservlet2db.doPost(httpServletRequest, httpservletresponse);
        verify(pingservlet2db, times(1)).doGet(httpServletRequest, httpservletresponse);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_VfRC0() {
        PingServlet2DB pingServlet2DB = new PingServlet2DB();
        String result = pingServlet2DB.getServletInfo();
        assertEquals("Basic JDBC Read using a prepared statment, makes use of TradeJDBC class", result);
    }
}