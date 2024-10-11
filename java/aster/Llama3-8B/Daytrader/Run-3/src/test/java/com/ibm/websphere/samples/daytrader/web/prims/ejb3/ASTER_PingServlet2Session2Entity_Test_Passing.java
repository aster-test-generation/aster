/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
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
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Session2Entity_Test_Passing {
private static int hitCount;
private static String initTime;
private TradeServices tradeSLSBLocal;
@Mock
    private HttpServlet httpServlet;
@Mock
    private InitialContext mockedInitialContext;
@InjectMocks
    private PingServlet2Session2Entity pingservlet2session2entity;
HttpServletResponse httpservletresponse;
HttpServletRequest httpservletrequest;
InitialContext initialcontext;
HttpServlet httpservlet;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_xCZM0() {
        PingServlet2Session2Entity entity = new PingServlet2Session2Entity();
        String result = entity.getServletInfo();
        assertEquals("web primitive, tests Servlet to Session to Entity EJB path", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testdoGet_szhE0() throws Exception {
    InitialContext mockedInitialContext = mock(InitialContext.class);
    HttpServletResponse httpservletresponse = mock(HttpServletResponse.class);
    HttpServletRequest httpservletrequest = mock(HttpServletRequest.class);
    HttpServlet httpservlet = mock(HttpServlet.class);
    PingServlet2Session2Entity pingservlet2session2entity = new PingServlet2Session2Entity();
    initTime = "2022-01-01";
    hitCount = 0;
    TradeServices tradeSLSBLocal = mock(TradeServices.class);
    when(tradeSLSBLocal.getQuote(anyString())).thenReturn(new QuoteDataBean());
    when(mockedInitialContext.lookup(anyString())).thenReturn(tradeSLSBLocal);
    pingservlet2session2entity.doGet(httpservletrequest, httpservletresponse);
    verify(httpservletresponse).setContentType("text/html");
    verify(httpservletresponse).getWriter();
    verify(tradeSLSBLocal, times(1)).getQuote(anyString());
}
}