/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

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
public class Aster_PingServlet2Session_Test_Passing {
  @Mock
  private static String initTime;
  @Mock
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;
  PingServlet2Session pingServlet2Session;
  ServletConfig mockConfig;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws Exception {
    httpServletRequest = mock(HttpServletRequest.class);
    httpServletResponse = mock(HttpServletResponse.class);
    pingServlet2Session = new PingServlet2Session();
    // Setup
    doNothing().when(httpServletResponse).flushBuffer();
    // Execute
    pingServlet2Session.doPost(httpServletRequest, httpServletResponse);
    // Verify
    verify(pingServlet2Session, times(1)).doGet(httpServletRequest, httpServletResponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_GNqf0() throws ServletException, IOException {
    PingServlet2Session servlet = new PingServlet2Session();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
    verify(servlet, times(1)).doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_ymYI0() {
    PingServlet2Session servlet = new PingServlet2Session();
    String expected = "web primitive, configured with trade runtime configs, tests Servlet to Session EJB path";
    assertEquals(expected, servlet.getServletInfo());
  }
}