/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
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
public class Aster_PingServlet2Session2CMROne2One_Test_Failing {
    @Mock
    private ServletConfig config;
    private PingServlet2Session2CMROne2One pingservlet2session2cmrone2one;
    HttpServletRequest httprequest;
    HttpServletResponse httpservletresponse;
    private static int hitCount;
    private TradeServices tradeSLSBLocal;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws ServletException, IOException {
        httprequest = mock(HttpServletRequest.class);
        httpservletresponse = mock(HttpServletResponse.class);
        pingservlet2session2cmrone2one = new PingServlet2Session2CMROne2One();
        // Given
        when(httprequest.getMethod()).thenReturn("POST");
        // When
        pingservlet2session2cmrone2one.doPost(httprequest, httpservletresponse);
        // Then
        verify(httpservletresponse, times(1)).sendRedirect(any(String.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_xkiq0() {
        PingServlet2Session2CMROne2One pingServlet2Session2CMROne2One = new PingServlet2Session2CMROne2One();
        String result = pingServlet2Session2CMROne2One.getServletInfo();
        assertEquals("web primitive, tests Servlet to Entity EJB path", result);
    }
}