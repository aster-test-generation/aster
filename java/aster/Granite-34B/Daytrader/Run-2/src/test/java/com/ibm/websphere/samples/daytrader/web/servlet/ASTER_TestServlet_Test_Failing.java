/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
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
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TestServlet_Test_Failing {
    TestServlet testservlet;
    HttpServlet httpservlet;
    HttpServletRequest request;
    HttpServletResponse response;
    TradeServices tradeServices;
    private TradeServices tradeAction;
    @Mock
    Instance<TradeServices> services;
    private TestServlet testServlet;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        testservlet = new TestServlet(null);
        ServletConfig config = mock(ServletConfig.class);
        doCallRealMethod().when(httpservlet).init(config);
        httpservlet.init(config);
        verify(httpservlet, times(1)).init(config);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_riMb0() throws ServletException {
        TestServlet testServlet = new TestServlet(null);
        ServletConfig config = null;
        testServlet.init(config);
        assertEquals(null, testServlet.getServletConfig());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_JNdm0_iwNH0() throws Exception {
        TestServlet testServlet = new TestServlet(null);
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        testServlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPerformTask_Imfs0_mdMV0() throws ServletException, IOException {
        TestServlet testServlet = new TestServlet(Mockito.mock(Instance.class));
        HttpServletRequest req = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse resp = Mockito.mock(HttpServletResponse.class);
        testServlet.performTask(req, resp);
    }
}