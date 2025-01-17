/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Aster_PingJDBCRead_Coverage_Test_Passing {
  private PingJDBCRead pingJDBCRead;
  private HttpServletRequest mockReq;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_CFSH0() throws Exception {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingJDBCRead pingJDBCRead = new PingJDBCRead();
    pingJDBCRead.doPost(request, response);
    verify(pingJDBCRead).doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetSymbolInitialization_UiEs3_BXzt0() throws Exception {
    HttpServletRequest mockReq = mock(HttpServletRequest.class);
    HttpServletResponse mockRes = mock(HttpServletResponse.class);
    PingJDBCRead pingJDBCRead = new PingJDBCRead();
    pingJDBCRead.doGet(mockReq, mockRes);
  }
}