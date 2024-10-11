/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJDBCRead2JSP_Test_Passing {
  @InjectMocks
  PingJDBCRead2JSP pingJDBCRead2JSP;
  @Mock
  ServletConfig mockServletConfig;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;
  ServletConfig servletConfig;
  ServletContext servletContext;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit() throws ServletException {
    // Initialization is handled by Mockito annotations
    // Call the method to test
    pingJDBCRead2JSP.init(mockServletConfig);
    // Verify that super.init(config) is called with the correct config
    verify(mockServletConfig, times(1)).getServletContext();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws Exception {
    pingJDBCRead2JSP = new PingJDBCRead2JSP();
    httpServletRequest = mock(HttpServletRequest.class);
    httpServletResponse = mock(HttpServletResponse.class);
    // Prepare to capture the internal call to doGet
    doNothing().when(httpServletResponse).sendRedirect(anyString());
    // Execute the doPost method
    pingJDBCRead2JSP.doPost(httpServletRequest, httpServletResponse);
    // Verify if doGet is called by checking interactions
    verify(httpServletResponse, never()).sendError(anyInt());
    verify(httpServletResponse, never()).sendRedirect(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_doZv0() throws ServletException, IOException {
    PingJDBCRead2JSP servlet = new PingJDBCRead2JSP();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
    verify(servlet, times(1)).doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_Uskv0() {
    PingJDBCRead2JSP pingJDBCRead2JSP = new PingJDBCRead2JSP();
    String expectedInfo = "Basic JDBC Read using a prepared statment forwarded to a JSP, makes use of TradeJDBC class";
    assertEquals(expectedInfo, pingJDBCRead2JSP.getServletInfo());
  }
}