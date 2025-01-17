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
public class Aster_PingJDBCRead_Test_Passing {
  PingJDBCRead pingJDBCRead;
  ServletConfig mockServletConfig;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;
  @Mock
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;
  @Mock
  private static String initTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws Exception {
    httpServletRequest = mock(HttpServletRequest.class);
    httpServletResponse = mock(HttpServletResponse.class);
    pingJDBCRead = new PingJDBCRead();
    pingJDBCRead.doPost(httpServletRequest, httpServletResponse);
    // Verify if doGet is called inside doPost
    verify(httpServletRequest, atLeastOnce()).setAttribute(anyString(), any());
    verify(httpServletResponse, never()).sendError(anyInt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_YiSJ0() throws ServletException, IOException {
    PingJDBCRead pingJDBCRead = new PingJDBCRead();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    pingJDBCRead.doPost(request, response);
    verify(pingJDBCRead).doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_acjo0() {
    PingJDBCRead pingJDBCRead = new PingJDBCRead();
    String expected = "Basic JDBC Read using a prepared statment, makes use of TradeJDBC class";
    assertEquals(expected, pingJDBCRead.getServletInfo());
  }
}