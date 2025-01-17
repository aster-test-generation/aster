/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

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
public class Aster_PingJDBCWrite_Test_Passing {
  private PingJDBCWrite pingJDBCWrite;
  private ServletConfig servletConfig;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;
  @Mock
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;
  @Mock
  private static int hitCount;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws ServletException, IOException {
    httpServletRequest = mock(HttpServletRequest.class);
    httpServletResponse = mock(HttpServletResponse.class);
    pingJDBCWrite = new PingJDBCWrite();
    // Call the method under test
    pingJDBCWrite.doPost(httpServletRequest, httpServletResponse);
    // Verify that doGet was called with the same request and response objects
    verify(httpServletRequest, times(1)).setAttribute(anyString(), any());
    verify(httpServletResponse, never()).sendError(anyInt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_iWgj0() {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    String result = pingJDBCWrite.getServletInfo();
    assertEquals("Basic JDBC Write using a prepared statment makes use of TradeJDBC code.", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_gzQF0_HJVU0() throws IOException, ServletException {
    PingJDBCWrite pingJDBCWrite = spy(new PingJDBCWrite());
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    doNothing().when(pingJDBCWrite).doGet(any(HttpServletRequest.class), any(HttpServletResponse.class));
    pingJDBCWrite.doPost(request, response);
    verify(pingJDBCWrite).doGet(request, response);
  }
}