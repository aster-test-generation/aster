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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingSession2_Coverage_Test_Failing {
  private ServletConfig config;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_NSDp0() {
    PingSession2 pingSession2 = new PingSession2();
    String expected = "HTTP Session Key: Tests management of a read/write unique id";
    String actual = pingSession2.getServletInfo();
    Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_GRWV0() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingSession2.doPost(req, res);
    verify(pingSession2).doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithException_oRCj1() throws ServletException, IOException {
    PingSession2 pingSession2 = new PingSession2();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    doThrow(new ServletException()).when(pingSession2).doGet(req, res);
    pingSession2.doPost(req, res);
    verify(pingSession2).doGet(req, res);
  }
}