/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Session2Entity2JSP_Test_Passing {
    PingServlet2Session2Entity2JSP servlet;
    @Mock
    HttpServlet httpServlet;
    @InjectMocks
    PingServlet2Session2Entity2JSP pingServlet2Session2Entity2JSP;
    @Mock
    PingServlet2Session2Entity2JSP pingServlet;
    @Mock
    ServletConfig servletConfig;
    @Mock
    HttpServletRequest httpServletRequest;
    @Mock
    ServletContext servletContext;
    @Mock
    HttpServletResponse httpServletResponse;
    private TradeServices tradeSLSBLocal;
    QuoteDataBean quoteDataBean;
    String symbol;
    QuoteDataBean quoteData;
    private HttpServletResponse mockResponse;
    private ServletContext mockServletContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_dQRZ0() {
        PingServlet2Session2Entity2JSP pingServlet2Session2Entity2JSP = new PingServlet2Session2Entity2JSP();
        String servletInfo = pingServlet2Session2Entity2JSP.getServletInfo();
        assertEquals("web primitive, tests Servlet to Session to Entity EJB to JSP path", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_jwtt0() {
        pingServlet2Session2Entity2JSP = new PingServlet2Session2Entity2JSP();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_bdNL0() {
        servlet = new PingServlet2Session2Entity2JSP();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitServletConfig_SPuo1() throws ServletException {
        ServletConfig config = mock(ServletConfig.class);
        servlet.init(config);
        verify(config).getServletContext();
    }
}