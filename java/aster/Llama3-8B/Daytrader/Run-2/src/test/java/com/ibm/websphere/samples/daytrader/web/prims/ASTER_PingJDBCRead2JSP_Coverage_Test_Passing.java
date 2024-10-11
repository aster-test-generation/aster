/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_PingJDBCRead2JSP_Coverage_Test_Passing {
    PingJDBCRead2JSP pingJDBCRead2JSP = new PingJDBCRead2JSP();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_ODFE0() {
        PingJDBCRead2JSP pingJDBCRead2JSP = new PingJDBCRead2JSP();
        String result = pingJDBCRead2JSP.getServletInfo();
        assertEquals("Basic JDBC Read using a prepared statment forwarded to a JSP, makes use of TradeJDBC class", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetNullSymbol_tePz0() throws ServletException, IOException {
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        pingJDBCRead2JSP.doGet(req, res);
        assertEquals(500, res.getStatus());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetException_Vlnb1() throws ServletException, IOException {
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        Exception e = new Exception("Test exception");
        pingJDBCRead2JSP.doGet(req, res);
        assertEquals(500, res.getStatus());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetSymbol_GAgP2() throws ServletException, IOException {
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        String symbol = "ABC";
        pingJDBCRead2JSP.doGet(req, res);
        assertEquals(200, res.getStatus());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetQuoteData_GkRr3() throws ServletException, IOException {
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        QuoteDataBean quoteData = new QuoteDataBean();
        req.setAttribute("quoteData", quoteData);
        pingJDBCRead2JSP.doGet(req, res);
        assertEquals(200, res.getStatus());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetTradeConfig_hGxY5() throws ServletException, IOException {
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        TradeConfig tradeConfig = new TradeConfig();
        pingJDBCRead2JSP.doGet(req, res);
        assertEquals(200, res.getStatus());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetInclude_jlAd7() throws ServletException, IOException {
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        req.setAttribute("quoteData", new QuoteDataBean());
        pingJDBCRead2JSP.doGet(req, res);
        assertEquals(200, res.getStatus());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_AwfP0() throws ServletException, IOException {
    PingJDBCRead2JSP obj = new PingJDBCRead2JSP();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletContext ctx = mock(ServletContext.class);
    ServletConfig config = obj.getServletConfig();
    when(config.getServletContext()).thenReturn(ctx);
    obj.doGet(req, res);
    verify(req).setAttribute("quoteData", any(QuoteDataBean.class));
    verify(ctx.getRequestDispatcher("/quoteDataPrimitive.jsp")).include(req, res);
    verifyNoMoreInteractions(req, res, ctx);
}
}