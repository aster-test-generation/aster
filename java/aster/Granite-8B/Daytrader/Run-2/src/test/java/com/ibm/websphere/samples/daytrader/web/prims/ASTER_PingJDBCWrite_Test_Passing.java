/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

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
public class Aster_PingJDBCWrite_Test_Passing {
    private static int hitCount;
    private static String initTime;
    PingJDBCWrite pingjdbcwrite;
    HttpServlet httpservlet;
    @Mock
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    @InjectMocks
    PingJDBCWrite pingJDBCWrite;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_1() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingjdbcwrite = new PingJDBCWrite();
        pingjdbcwrite.init(httpservlet);
        verify(httpservlet).init(any());
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_2() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingjdbcwrite = new PingJDBCWrite();
        pingjdbcwrite.init(httpservlet);
        verify(httpservlet).init(any());
        assertNotNull(initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_IMDH1() throws ServletException, IOException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        pingJDBCWrite.doPost(req, res);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_NmOc0() {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        String servletInfo = pingJDBCWrite.getServletInfo();
        assertEquals("Basic JDBC Write using a prepared statment makes use of TradeJDBC code.", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingjdbcwrite = new PingJDBCWrite();
        pingjdbcwrite.init(httpservlet);
        verify(httpservlet).init(any());
        assertEquals(0, hitCount);
        assertNotNull(initTime);
    }
}