/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.util.Log;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
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
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockServletContext;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TestServlet_Test_Passing {
    @Mock
    private ServletConfig servletConfig;
    @Mock
    private TradeServices tradeServices;
    private TestServlet testServlet;
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private TradeServices tradeAction;
    @InjectMocks
    private TestServlet testservlet;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testperformTask() throws Exception {
        // No need to mock HttpServlet as it's not used in the performTask method
        // Arrange
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        Log log = mock(Log.class); // Assuming Log is a logging interface
        // Act
        testservlet.performTask(req, resp);
        // Assert
        verify(tradeAction, times(10)).createQuote(anyString(), anyString(), any(BigDecimal.class));
        verify(log, times(1)).debug("Enter TestServlet doGet");
        verify(log, times(1)).error("TestServletException", any(Throwable.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_dEqZ0() throws ServletException {
        Instance<TradeServices> instance = Mockito.mock(Instance.class);
        when(instance.get()).thenReturn(tradeServices);
        testServlet = new TestServlet(instance);
        when(servletConfig.getServletContext()).thenReturn(new MockServletContext());
        testServlet.init(servletConfig);
        verify(servletConfig).getServletContext();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPerformTaskException_CNRG1_dkyE0() throws ServletException, IOException {
        TradeServices services = mock(TradeServices.class);
        TestServlet testServlet = new TestServlet((Instance<TradeServices>) services);
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        testServlet.doGet(request, response);
        verify(request, times(1)).getParameter(anyString());
        verify(response, times(1)).setContentType(anyString());
    }
}