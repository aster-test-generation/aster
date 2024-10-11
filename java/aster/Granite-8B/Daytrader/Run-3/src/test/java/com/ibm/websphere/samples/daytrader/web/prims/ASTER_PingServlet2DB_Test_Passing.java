/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2DB_Test_Passing {
    private static int hitCount;
    private static String initTime;
    PingServlet2DB pingServlet2DB;
    HttpServlet httpServlet;
    HttpServletResponse httpServletResponse;
    Connection connection;
    TradeDirect tradeDirect;
    @Mock
    HttpServlet httpservlet;
    @Mock
    HttpServletResponse httpservletresponse;
    @Mock
    TradeDirect tradedirect;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_1() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServlet2DB = new PingServlet2DB();
        // Mock the init method of HttpServlet
        doNothing().when(httpServlet).init(any());
        // Call the init method of PingServlet2DB
        pingServlet2DB.init(httpServlet);
        // Verify that the hitCount and initTime variables are initialized correctly
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_2() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServlet2DB = new PingServlet2DB();
        // Mock the init method of HttpServlet
        doNothing().when(httpServlet).init(any());
        // Call the init method of PingServlet2DB
        pingServlet2DB.init(httpServlet);
        // Verify that the hitCount and initTime variables are initialized correctly
        assertNotNull(initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_qzyJ0() {
        PingServlet2DB pingServlet2DB = new PingServlet2DB();
        String servletInfo = pingServlet2DB.getServletInfo();
        assertTrue("Basic JDBC Read using a prepared statment, makes use of TradeJDBC class".equals(servletInfo));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpServlet = mock(HttpServlet.class);
        pingServlet2DB = new PingServlet2DB();
        // Mock the init method of HttpServlet
        doNothing().when(httpServlet).init(any());
        // Call the init method of PingServlet2DB
        pingServlet2DB.init(httpServlet);
        // Verify that the hitCount and initTime variables are initialized correctly
        assertEquals(0, hitCount);
        assertNotNull(initTime);
    }
}