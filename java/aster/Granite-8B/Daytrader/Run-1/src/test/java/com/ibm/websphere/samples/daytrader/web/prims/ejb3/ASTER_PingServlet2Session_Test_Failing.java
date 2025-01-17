/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
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
public class Aster_PingServlet2Session_Test_Failing {
    private static String initTime;
    private static int hitCount;
    PingServlet2Session pingServlet2Session;
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    private TradeServices tradeSLSBLocal;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_FeSY0() throws ServletException, IOException {
        PingServlet2Session servlet = new PingServlet2Session();
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        Mockito.verify(request).getParameter("name");
        Mockito.verify(response).setContentType("text/html");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_LwQk0() {
        PingServlet2Session pingServlet2Session = new PingServlet2Session();
        String expected = "web primitive, configured with trade runtime configs, tests Servlet to Session EJB path";
        String actual = pingServlet2Session.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_ClIw0() {
        httpServlet = mock(HttpServlet.class);
        pingServlet2Session = new PingServlet2Session();
        when(httpServlet.getInitParameter("initTime")).thenReturn("2022-01-01");
        when(httpServlet.getInitParameter("hitCount")).thenReturn("0");
        try {
            pingServlet2Session.init(httpServlet);
        } catch (ServletException e) {
        }
        verify(httpServlet, times(1)).getInitParameter("initTime");
        verify(httpServlet, times(1)).getInitParameter("hitCount");
        assertEquals("2022-01-01", initTime);
        assertEquals(0, hitCount);
    }
}