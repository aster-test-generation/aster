/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.drive;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletDrive_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_acXt0() {
    PingServletDrive servlet = new PingServletDrive();
    String result = servlet.getServletInfo();
    assertEquals("Basic dynamic HTML generation through a servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_Hywm0() throws ServletException, IOException {
    PingServletDrive pingServletDrive = new PingServletDrive();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServletDrive.doPost(req, res);
    verify(pingServletDrive).doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithException_kURL1() throws ServletException, IOException {
    PingServletDrive pingServletDrive = new PingServletDrive();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    doThrow(new ServletException()).when(pingServletDrive).doGet(req, res);
    pingServletDrive.doPost(req, res);
    verify(pingServletDrive).doGet(req, res);
  }
}