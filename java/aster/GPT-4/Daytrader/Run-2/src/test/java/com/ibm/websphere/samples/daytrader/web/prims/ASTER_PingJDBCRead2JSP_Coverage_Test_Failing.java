/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingJDBCRead2JSP_Coverage_Test_Failing {
    private PingJDBCRead2JSP servlet;
    private HttpServletRequest mockReq;
    private HttpServletResponse mockRes;
    private ServletConfig mockConfig;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_TGUu0() {
        PingJDBCRead2JSP pingJDBCRead2JSP = new PingJDBCRead2JSP();
        String expectedInfo = "Basic JDBC Read using a prepared statment forwarded to a JSP, makes use of TradeJDBC class";
        assertEquals(expectedInfo, pingJDBCRead2JSP.getServletInfo());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitCompletesWithoutException_xeXX1() throws ServletException {
        ServletConfig mockConfig = org.mockito.Mockito.mock(ServletConfig.class);
        PingJDBCRead2JSP servlet = new PingJDBCRead2JSP();
        servlet.init(mockConfig);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostCallsDoGet_CwIx0() throws ServletException, IOException {
        PingJDBCRead2JSP servlet = new PingJDBCRead2JSP();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(servlet).doGet(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_VerifyServletContext_qTsf5() throws ServletException, IOException {
        servlet.doGet(mockReq, mockRes);
        verify(servlet.getServletConfig()).getServletContext();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostExecutionCompletes_YiAt1() throws ServletException, IOException {
        PingJDBCRead2JSP servlet = new PingJDBCRead2JSP();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
    }
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void testDoGetExecutionCompletes_YiAt1_LAcT0() throws ServletException, IOException {
        PingJDBCRead2JSP servlet = new PingJDBCRead2JSP();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doGet(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_CheckQuoteDataBeanNullInitially_KTez4_VjiP0() throws ServletException, IOException {
    HttpServletRequest mockReq = mock(HttpServletRequest.class);
    HttpServletResponse mockRes = mock(HttpServletResponse.class);
    PingJDBCRead2JSP servlet = new PingJDBCRead2JSP();
    servlet.doGet(mockReq, mockRes);
    QuoteDataBean quoteData = (QuoteDataBean) mockReq.getAttribute("quoteData");
    Assertions.assertNull(quoteData);
}
}