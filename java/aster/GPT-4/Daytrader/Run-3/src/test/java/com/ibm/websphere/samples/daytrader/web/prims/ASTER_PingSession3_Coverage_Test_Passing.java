/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingSession3_Coverage_Test_Passing {
  private PingSession3 pingSession;
  private ServletConfig mockConfig;
  private PingSession3 pingSession3;
  private HttpServletRequest request;
  private HttpServletResponse response;
  private PrintWriter writer;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetHandlesInvalidSessionData_KEdp12_ahph0_fid2() throws Exception {
    HttpSession session = mock(HttpSession.class);
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getSession(true)).thenReturn(session);
    when(session.getAttribute("sessiontest.sessionData")).thenReturn(null);
    pingSession3.doGet(request, response);
    verify(response).sendError(eq(500), contains("error."));
  }
}