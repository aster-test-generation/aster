/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockServletConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJDBCWrite_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_nkZM0() throws ServletException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        pingJDBCWrite.init(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithConfig_Zfsy1() throws ServletException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        ServletConfig config = new MockServletConfig();
        pingJDBCWrite.init(config);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithException_oVTK2() throws ServletException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        ServletConfig config = new MockServletConfig();
        try {
            pingJDBCWrite.init(config);
            fail("Expected ServletException");
        } catch (ServletException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullRequestAndResponse_UtZL3() throws ServletException, IOException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        pingJDBCWrite.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_tpMt0() {
        PingJDBCWrite ping = new PingJDBCWrite();
        String expected = "Basic JDBC Write using a prepared statment makes use of TradeJDBC code.";
        assertEquals(expected, ping.getServletInfo());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_Mcek0_beCr0() throws ServletException, IOException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        pingJDBCWrite.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullResponse_babI2_zkzs0() throws ServletException, IOException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = null;
        pingJDBCWrite.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithValidRequest_pJdP4_bQiZ0() throws ServletException, IOException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        request.setCharacterEncoding("UTF-8");
        pingJDBCWrite.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithValidResponse_WDIh5_dodz0() throws ServletException, IOException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        response.setContentType("text/html");
        pingJDBCWrite.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithValidRequestAndResponse_MiAp6_KdTa0() throws ServletException, IOException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        pingJDBCWrite.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithInvalidRequest_UxLh7_kqMt0() throws ServletException, IOException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        request.setCharacterEncoding("UTF-16");
        pingJDBCWrite.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithInvalidResponse_NkjE8_iEfb0() throws ServletException, IOException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        response.setContentType("application/json");
        pingJDBCWrite.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithInvalidRequestAndResponse_qFDw9_fAfx0() throws ServletException, IOException {
        PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        request.setCharacterEncoding("UTF-16");
        response.setContentType("application/json");
        pingJDBCWrite.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithSymbolAndPrice_KUWZ1_cIpT0() {
        PingJDBCWrite ping = new PingJDBCWrite();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        String symbol = "TEST";
        BigDecimal price = new BigDecimal(100.00);
        try {
            when(req.getParameter("symbol")).thenReturn(symbol);
            when(req.getParameter("price")).thenReturn(price.toString());
            ping.doGet(req, res);
        } catch (ServletException | IOException e) {
            fail("Exception was thrown in doGet method");
        }
    }
}