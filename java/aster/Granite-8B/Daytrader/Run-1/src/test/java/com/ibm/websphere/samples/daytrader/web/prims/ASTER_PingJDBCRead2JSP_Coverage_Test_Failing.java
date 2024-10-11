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
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_PingJDBCRead2JSP_Coverage_Test_Failing {
    private PingJDBCRead2JSP pingJDBCRead2JSP;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private ServletContext context;
    private String symbol;
    private QuoteDataBean quoteData;
    private Exception e;
    private int iter;
    private int ii;    
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit1_KJQo0() throws javax.servlet.ServletException {
    PingJDBCRead2JSP pingJDBCRead2JSP = new PingJDBCRead2JSP();
    ServletConfig config = null;
    pingJDBCRead2JSP.init(config);
  }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDoPost1_Cfwc0() throws ServletException, IOException {
		PingJDBCRead2JSP pingjdbcread2jsp = new PingJDBCRead2JSP();
		HttpServletRequest request = new MockHttpServletRequest();
		HttpServletResponse response = new MockHttpServletResponse();
		pingjdbcread2jsp.doPost(request, response);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetServletInfo_Jyke0_gBaR0() {
    PingJDBCRead2JSP pingJDBCRead2JSP = new PingJDBCRead2JSP();
    String result = pingJDBCRead2JSP.getServletInfo();
    assertEquals("Basic JDBC Read using a prepared statment forwarded to a JSP, makes use of TradeJDBC class", result);
  }
}