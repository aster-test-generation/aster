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
import static org.mockito.Mockito.*;

public class Aster_PingUpgradeServlet_Coverage_Test_Failing {
  private HttpServletResponse res;
  private HttpServletResponse response;
  private PingUpgradeServlet servlet;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_SetStatus_uLka5_iiqF0() throws Exception {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    when(request.getHeader("Upgrade")).thenReturn("echo");
    servlet.doGet(request, response);
    verify(response).setStatus(101);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_SetConnectionHeader_PMQO7_OsBX0() throws Exception {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    when(request.getHeader("Upgrade")).thenReturn("echo");
    servlet.doGet(request, response);
    verify(response).setHeader("Connection", "Upgrade");
  }
}