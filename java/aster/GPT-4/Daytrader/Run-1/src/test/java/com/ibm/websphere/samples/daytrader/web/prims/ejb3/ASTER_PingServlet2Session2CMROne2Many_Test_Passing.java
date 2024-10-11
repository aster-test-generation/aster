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
public class Aster_PingServlet2Session2CMROne2Many_Test_Passing {
  @Mock
  private ServletConfig mockServletConfig;
  @Mock
  private TradeServices tradeSLSBLocal;
  @InjectMocks
  private static int hitCount;
  HttpServletResponse httpServletResponse;
  HttpServletRequest httpServletRequest;
  PingServlet2Session2CMROne2Many pingServlet2Session2CMROne2Many;
  @Mock
  private HttpServletRequest request;
  @InjectMocks
  private PingServlet2Session2CMROne2Many pingServlet;
  @Mock
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_ZbNP0() throws ServletException, IOException {
    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
    HttpServletResponse mockResponse = mock(HttpServletResponse.class);
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    servlet.doPost(mockRequest, mockResponse);
    verify(servlet).doGet(mockRequest, mockResponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_bDEL0() {
    PingServlet2Session2CMROne2Many servlet = new PingServlet2Session2CMROne2Many();
    String result = servlet.getServletInfo();
    assertEquals("web primitive, tests Servlet to Entity EJB path", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws ServletException, IOException {
    pingServlet2Session2CMROne2Many = new PingServlet2Session2CMROne2Many();
    httpServletRequest = mock(HttpServletRequest.class);
    httpServletResponse = mock(HttpServletResponse.class);
    // Call the method under test
    pingServlet2Session2CMROne2Many.doPost(httpServletRequest, httpServletResponse);
    // Verify that doGet is called with the same request and response objects
    verify(pingServlet2Session2CMROne2Many).doGet(httpServletRequest, httpServletResponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_avwS0() throws ServletException, IOException {
    PingServlet2Session2CMROne2Many pingServlet2Session2CMROne2Many = new PingServlet2Session2CMROne2Many();
    HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
    HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
    PingServlet2Session2CMROne2Many spyServlet = spy(pingServlet2Session2CMROne2Many);
    spyServlet.doGet(httpServletRequest, httpServletResponse);
    verify(spyServlet).doGet(httpServletRequest, httpServletResponse);
  }
}